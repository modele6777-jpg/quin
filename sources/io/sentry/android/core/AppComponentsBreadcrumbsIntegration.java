package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.ae1;
import defpackage.ggg;
import io.sentry.k4;
import io.sentry.q5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.w1, Closeable, ComponentCallbacks2 {
    public static final io.sentry.l0 e = new io.sentry.l0();
    public final Context a;
    public io.sentry.g1 b;
    public SentryAndroidOptions c;
    public final ggg d = new ggg(60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.b = k4.a;
        this.c = sentryAndroidOptions;
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c.isEnableAppComponentBreadcrumbs()));
        if (this.c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.a.registerComponentCallbacks(this);
                sentryAndroidOptions.getLogger().i(q5Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.b.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.c.setEnableAppComponentBreadcrumbs(false);
                sentryAndroidOptions.getLogger().c(q5.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    public final void b(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.c.getLogger().c(q5.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(q5.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().i(q5.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        b(new ae1(this, System.currentTimeMillis(), configuration, 4));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        if (i >= 40 && !this.d.b()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            b(new Runnable() { // from class: io.sentry.android.core.e0
                @Override // java.lang.Runnable
                public final void run() {
                    io.sentry.l0 l0Var = AppComponentsBreadcrumbsIntegration.e;
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.a;
                    if (appComponentsBreadcrumbsIntegration.b != null) {
                        io.sentry.g gVar = new io.sentry.g(jCurrentTimeMillis);
                        gVar.e = "system";
                        gVar.g = "device.event";
                        gVar.d = "Low memory";
                        gVar.d("LOW_MEMORY", "action");
                        gVar.d(Integer.valueOf(i), "level");
                        gVar.w = q5.WARNING;
                        appComponentsBreadcrumbsIntegration.b.i(gVar, AppComponentsBreadcrumbsIntegration.e);
                    }
                }
            });
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
