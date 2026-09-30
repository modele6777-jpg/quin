package io.sentry.android.core.cache;

import android.os.SystemClock;
import com.adjust.sdk.sig.r3;
import defpackage.gi2;
import defpackage.ib8;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b0;
import io.sentry.android.core.i2;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.performance.h;
import io.sentry.cache.c;
import io.sentry.l0;
import io.sentry.o7;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.z0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    public static final List y = Arrays.asList(new a(b0.class, "ANR", "last_anr_report", new r3(27)), new a(i2.class, "Tombstone", "last_tombstone_report", new r3(28)));
    public final io.sentry.android.core.internal.util.c x;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        io.sentry.util.b.r(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.x = io.sentry.android.core.internal.util.c.a;
    }

    public static Long j(q6 q6Var, String str, String str2) {
        String cacheDirPath = q6Var.getCacheDirPath();
        io.sentry.util.b.r(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strQ = io.sentry.util.b.q(file);
            if (strQ != null && !strQ.equals("null")) {
                return Long.valueOf(Long.parseLong(strQ.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                q6Var.getLogger().i(q5.DEBUG, ib8.j("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            q6Var.getLogger().d(q5.ERROR, ib8.j("Error reading last ", str2, " marker"), th);
            return null;
        }
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final boolean N(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        Long lValueOf;
        boolean zN = super.N(cVar, l0Var);
        q6 q6Var = this.a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) q6Var;
        h hVar = g.c().e;
        if (o7.class.isInstance(l0Var.b("sentry:typeCheckHint")) && hVar.d()) {
            this.x.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - hVar.c;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                z0 logger = sentryAndroidOptions.getLogger();
                q5 q5Var = q5.DEBUG;
                logger.i(q5Var, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = q6Var.getOutboxPath();
                if (outboxPath == null) {
                    q6Var.getLogger().i(q5Var, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    File file = new File(outboxPath);
                    if (io.sentry.util.b.e(file)) {
                        try {
                            new File(file, "startup_crash").createNewFile();
                        } catch (Throwable th) {
                            q6Var.getLogger().d(q5.ERROR, "Error writing the startup crash marker file to the disk", th);
                        }
                    } else {
                        q6Var.getLogger().i(q5.ERROR, "Failed to create outbox dir %s", outboxPath);
                    }
                }
            }
        }
        for (a aVar : y) {
            Class cls = aVar.a;
            gi2 gi2Var = new gi2(aVar, sentryAndroidOptions, this, 14);
            Object objB = l0Var.b("sentry:typeCheckHint");
            if (cls.isInstance(l0Var.b("sentry:typeCheckHint")) && objB != null) {
                a aVar2 = (a) gi2Var.b;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) gi2Var.c;
                b bVar = (b) gi2Var.d;
                switch (aVar2.d.a) {
                    case 27:
                        lValueOf = Long.valueOf(((b0) objB).d);
                        break;
                    default:
                        lValueOf = Long.valueOf(((i2) objB).d);
                        break;
                }
                z0 logger2 = sentryAndroidOptions2.getLogger();
                q5 q5Var2 = q5.DEBUG;
                String str = aVar2.b;
                logger2.i(q5Var2, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                String str2 = aVar2.c;
                q6 q6Var2 = bVar.a;
                String cacheDirPath = q6Var2.getCacheDirPath();
                if (cacheDirPath == null) {
                    q6Var2.getLogger().i(q5Var2, ib8.j("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                        try {
                            fileOutputStream.write(String.valueOf(lValueOf).getBytes(c.w));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        q6Var2.getLogger().d(q5.ERROR, ib8.j("Error writing the ", str, " marker to the disk"), th4);
                    }
                }
            }
        }
        return zN;
    }
}
