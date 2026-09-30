package io.sentry.cache;

import com.adjust.sdk.Constants;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.q5;
import io.sentry.q6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Charset a = Charset.forName(Constants.ENCODING);

    public static void a(SentryAndroidOptions sentryAndroidOptions, String str, String str2) {
        File fileB = b(sentryAndroidOptions, str);
        if (fileB == null) {
            sentryAndroidOptions.getLogger().i(q5.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        sentryAndroidOptions.getLogger().i(q5.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File b(q6 q6Var, String str) {
        String cacheDirPath = q6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(q6 q6Var, String str, String str2, Class cls) {
        File fileB = b(q6Var, str);
        if (fileB == null) {
            q6Var.getLogger().i(q5.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (!file.exists()) {
            q6Var.getLogger().i(q5.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), a));
            try {
                Object objB = q6Var.getSerializer().b(bufferedReader, cls);
                bufferedReader.close();
                return objB;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            q6Var.getLogger().c(q5.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static void d(q6 q6Var, Object obj, String str, String str2) {
        File fileB = b(q6Var, str);
        if (fileB == null) {
            q6Var.getLogger().i(q5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, a));
                try {
                    q6Var.getSerializer().a(bufferedWriter, obj);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            q6Var.getLogger().c(q5.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }
}
