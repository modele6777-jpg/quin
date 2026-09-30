package io.sentry.android.core;

import io.sentry.q5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppLifecycleIntegration implements io.sentry.w1, Closeable {
    public final io.sentry.util.a a = new io.sentry.util.a();
    public volatile a1 b;
    public SentryAndroidOptions c;

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.c = sentryAndroidOptions;
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.c.isEnableAutoSessionTracking()));
        this.c.getLogger().i(q5Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.c.isEnableAppLifecycleBreadcrumbs()));
        if (this.c.isEnableAutoSessionTracking() || this.c.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.util.a aVar = this.a;
            aVar.b();
            try {
                if (this.b != null) {
                    aVar.close();
                    return;
                }
                this.b = new a1(this.c.getSessionTrackingIntervalMillis(), this.c.isEnableAutoSessionTracking(), this.c.isEnableAppLifecycleBreadcrumbs());
                i0.e.b(this.b);
                aVar.close();
                sentryAndroidOptions.getLogger().i(q5Var, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.util.b.a("AppLifecycle");
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.a;
        aVar.b();
        try {
            a1 a1Var = this.b;
            this.b = null;
            aVar.close();
            if (a1Var != null) {
                i0.e.u(a1Var);
                SentryAndroidOptions sentryAndroidOptions = this.c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            i0.e.x();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
