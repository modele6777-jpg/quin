package io.sentry.android.core;

import io.sentry.q5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class NdkIntegration implements io.sentry.w1, Closeable {
    public final Class a;
    public SentryAndroidOptions b;

    public NdkIntegration(Class cls) {
        this.a = cls;
    }

    public static void b(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        Class cls;
        this.b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.z0 logger = this.b.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.a) == null) {
            b(this.b);
            return;
        }
        if (this.b.getCacheDirPath() == null) {
            this.b.getLogger().i(q5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            b(this.b);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.b);
            this.b.getLogger().i(q5Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.b.a("Ndk");
        } catch (NoSuchMethodException e) {
            b(this.b);
            this.b.getLogger().d(q5.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            b(this.b);
            this.b.getLogger().d(q5.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.a;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.b.getLogger().i(q5.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e) {
            this.b.getLogger().d(q5.ERROR, "Failed to invoke the SentryNdk.close method.", e);
        } catch (Throwable th) {
            this.b.getLogger().d(q5.ERROR, "Failed to close SentryNdk.", th);
        } finally {
            b(this.b);
        }
    }
}
