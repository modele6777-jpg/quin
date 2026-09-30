package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ir5 implements Application.ActivityLifecycleCallbacks {
    public static final ir5 b = new ir5(0);
    public static volatile Activity c;
    public static volatile String d;
    public final /* synthetic */ int a;

    public /* synthetic */ ir5(int i) {
        this.a = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                if (c == activity) {
                    c = null;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                if (c == activity) {
                    c = null;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object dzbVar;
        int i = this.a;
        activity.getClass();
        switch (i) {
            case 0:
                c = activity;
                break;
            default:
                try {
                    di9 di9Var = di9.a;
                    di9.b(activity, true);
                    dzbVar = wef.a;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                di9 di9Var2 = di9.a;
                Throwable thA = ezb.a(dzbVar);
                if (thA != null) {
                    di9.f(thA);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
        activity.getClass();
    }
}
