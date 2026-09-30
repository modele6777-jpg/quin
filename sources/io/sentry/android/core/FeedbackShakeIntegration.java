package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.nzf;
import defpackage.xag;
import io.sentry.q5;
import io.sentry.v2;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackShakeIntegration implements io.sentry.w1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public SentryAndroidOptions c;
    public volatile WeakReference d;
    public volatile Runnable f;
    public volatile boolean e = false;
    public final y1 b = new y1(v2.a);

    public FeedbackShakeIntegration(Application application) {
        this.a = application;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.c = sentryAndroidOptions;
        if (sentryAndroidOptions.getFeedbackOptions().g) {
            y1 y1Var = this.b;
            synchronized (y1Var) {
                y1Var.g = false;
            }
            try {
                sentryAndroidOptions.getExecutorService().submit(new nzf(7, this, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to submit shake detector initialization.", th);
            }
            io.sentry.util.b.a("FeedbackShake");
            this.a.registerActivityLifecycleCallbacks(this);
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
            WeakReference weakReference = (WeakReference) q0.b.a;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null) {
                this.d = new WeakReference(activity);
                y1 y1Var2 = this.b;
                if (this.c == null) {
                    return;
                }
                y1Var2.d();
                y1Var2.c(activity, new xag(6, this));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.unregisterActivityLifecycleCallbacks(this);
        this.b.a();
        if (this.e) {
            this.e = false;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.f;
            }
            this.f = null;
        }
        this.d = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.d != null ? (Activity) this.d.get() : null;
        if (this.e && activity == activity2) {
            this.e = false;
            this.d = null;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.f;
            }
            this.f = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity == (this.d != null ? (Activity) this.d.get() : null)) {
            this.b.d();
            if (this.e) {
                return;
            }
            this.d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2 = this.d != null ? (Activity) this.d.get() : null;
        if (this.e && activity2 != null && activity2 != activity) {
            this.e = false;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.f;
            }
            this.f = null;
        }
        this.d = new WeakReference(activity);
        y1 y1Var = this.b;
        if (this.c == null) {
            return;
        }
        y1Var.d();
        y1Var.c(activity, new xag(6, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
