package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import defpackage.a58;
import defpackage.g48;
import defpackage.x48;
import io.sentry.h7;
import io.sentry.k4;
import io.sentry.q5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionIntegration implements io.sentry.w1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application a;
    public io.sentry.g1 b;
    public final WeakHashMap e = new WeakHashMap();
    public final Object f = new Object();
    public SentryAndroidOptions c;
    public final boolean d = io.sentry.util.g.b(this.c, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(Application application) {
        this.a = application;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.c = sentryAndroidOptions;
        this.b = k4.a;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.c.isEnableUserInteractionTracing();
        io.sentry.z0 logger = this.c.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            this.a.registerActivityLifecycleCallbacks(this);
            this.c.getLogger().i(q5Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.b.a("UserInteraction");
            if (this.d) {
                WeakReference weakReference = (WeakReference) q0.b.a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof x48) && ((a58) ((x48) activity).k()).i == g48.e) {
                    b(activity);
                }
            }
        }
    }

    public final void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().i(q5.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.b == null || this.c == null) {
            return;
        }
        synchronized (this.f) {
            try {
                WeakReference weakReference = (WeakReference) this.e.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new io.sentry.android.core.internal.gestures.b();
                    }
                    io.sentry.android.core.internal.gestures.h hVar = new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.b, this.c), this.c);
                    window.setCallback(hVar);
                    synchronized (this.f) {
                        this.e.put(window, new WeakReference(hVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList<Window> arrayList;
        this.a.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.f) {
            arrayList = new ArrayList(this.e.keySet());
        }
        for (Window window : arrayList) {
            if (window != null) {
                h(window);
            }
        }
        synchronized (this.f) {
            this.e.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    public final void h(Window window) {
        io.sentry.android.core.internal.gestures.h hVar;
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar2 = (io.sentry.android.core.internal.gestures.h) callback;
            hVar2.f = true;
            hVar2.c.d(h7.CANCELLED);
            hVar2.d.a();
            Window.Callback callback2 = hVar2.b;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
            synchronized (this.f) {
                this.e.remove(window);
            }
            return;
        }
        synchronized (this.f) {
            try {
                WeakReference weakReference = (WeakReference) this.e.remove(window);
                hVar = weakReference != null ? (io.sentry.android.core.internal.gestures.h) weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar != null) {
            hVar.f = true;
            hVar.c.d(h7.CANCELLED);
            hVar.d.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            h(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(q5.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
