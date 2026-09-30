package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import io.sentry.y6;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements Application.ActivityLifecycleCallbacks {
    public final WeakReference a;
    public final /* synthetic */ c2 b;

    public b2(c2 c2Var, WeakReference weakReference) {
        this.b = c2Var;
        this.a = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        if (activity == this.a.get()) {
            c2 c2Var = this.b;
            y1 y1Var = c2Var.e;
            if (y1Var != null) {
                y1Var.a();
                c2Var.e = null;
            }
            if (c2Var.f != null) {
                Context context = c2Var.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity2 = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            activity2 = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity2 != null) {
                    activity2.getApplication().unregisterActivityLifecycleCallbacks(c2Var.f);
                }
                c2Var.f = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        y1 y1Var;
        if (activity != this.a.get() || (y1Var = this.b.e) == null) {
            return;
        }
        y1Var.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c2 c2Var;
        y1 y1Var;
        WeakReference weakReference = this.a;
        if (activity != weakReference.get() || (y1Var = (c2Var = this.b).e) == null) {
            return;
        }
        y1Var.c(activity, new y6(3, c2Var, weakReference));
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
