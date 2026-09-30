package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.k4;
import io.sentry.q5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.w1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public io.sentry.g1 b;
    public boolean c;
    public final io.sentry.util.a d = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.a = application;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.b = k4.a;
        this.c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c));
        if (this.c) {
            this.a.registerActivityLifecycleCallbacks(this);
            sentryAndroidOptions.getLogger().i(q5Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.b.a("ActivityBreadcrumbs");
        }
    }

    public final void b(Activity activity, String str) {
        if (this.b == null) {
            return;
        }
        io.sentry.g gVar = new io.sentry.g();
        gVar.e = "navigation";
        gVar.d(str, "state");
        gVar.d(activity.getClass().getSimpleName(), "screen");
        gVar.g = "ui.lifecycle";
        gVar.w = q5.INFO;
        io.sentry.l0 l0Var = new io.sentry.l0();
        l0Var.d(activity, "android:activity");
        this.b.i(gVar, l0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            this.a.unregisterActivityLifecycleCallbacks(this);
            io.sentry.g1 g1Var = this.b;
            if (g1Var != null) {
                g1Var.o().getLogger().i(q5.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            b(activity, "created");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            b(activity, "destroyed");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            b(activity, "paused");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            b(activity, "resumed");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            b(activity, "saveInstanceState");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            b(activity, "started");
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            b(activity, "stopped");
            aVar.close();
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
