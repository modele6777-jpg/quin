package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p3 implements Runnable {
    public static final Charset b = Charset.forName(Constants.ENCODING);
    public final SentryAndroidOptions a;

    public p3(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public final Date a(File file) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b));
            try {
                String line = bufferedReader.readLine();
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateL = io.sentry.config.a.l(line);
                bufferedReader.close();
                return dateL;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            sentryAndroidOptions.getLogger().i(q5.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).g()) {
            sentryAndroidOptions.getLogger().i(q5.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.w;
        File file = new File(cacheDirPath, "previous_session.json");
        m1 serializer = sentryAndroidOptions.getSerializer();
        if (!file.exists()) {
            return;
        }
        sentryAndroidOptions.getLogger().i(q5.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b));
            try {
                c7 c7Var = (c7) serializer.b(bufferedReader, c7.class);
                if (c7Var == null) {
                    sentryAndroidOptions.getLogger().i(q5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    File file2 = new File(sentryAndroidOptions.getCacheDirPath(), ".sentry-native/last_crash");
                    b7 b7Var = c7Var.g;
                    b7 b7Var2 = b7.Crashed;
                    if (b7Var == b7Var2) {
                        y4 y4Var = y4.c;
                        io.sentry.util.a aVar = y4Var.b;
                        aVar.b();
                        try {
                            y4Var.a = false;
                            aVar.close();
                            y4Var.a();
                        } catch (Throwable th) {
                            try {
                                aVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else if (file2.exists()) {
                        sentryAndroidOptions.getLogger().i(q5.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                        Date dateA = a(file2);
                        c7Var.c(b7Var2, null, true, null);
                        c7Var.b(dateA);
                    } else if (c7Var.Y == null) {
                        c7Var.b(new Date());
                    }
                    if (file2.exists() && !file2.delete()) {
                        sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                    }
                    q4.b().h(new io.sentry.internal.debugmeta.c((io.sentry.protocol.w) null, sentryAndroidOptions.getSdkVersion(), g5.e(serializer, c7Var)), new l0());
                }
                bufferedReader.close();
                if (file.delete()) {
                    return;
                }
                sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to delete the previous session file.", new Object[0]);
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Error processing previous session.", th5);
        }
    }
}
