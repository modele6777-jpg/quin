package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ux8 implements Application.ActivityLifecycleCallbacks {
    public static Double g;
    public wwg b;
    public final tx8 e;
    public final gj8 f;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean c = false;
    public boolean d = true;

    public ux8(tx8 tx8Var, gj8 gj8Var) {
        this.e = tx8Var;
        this.f = gj8Var;
        if (g == null) {
            g = Double.valueOf(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.d = true;
        wwg wwgVar = this.b;
        Handler handler = this.a;
        if (wwgVar != null) {
            handler.removeCallbacks(wwgVar);
        }
        wwg wwgVar2 = new wwg(19, this);
        this.b = wwgVar2;
        handler.postDelayed(wwgVar2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        new WeakReference(activity);
        this.d = false;
        boolean z = this.c;
        this.c = true;
        wwg wwgVar = this.b;
        if (wwgVar != null) {
            this.a.removeCallbacks(wwgVar);
        }
        if (z) {
            return;
        }
        g = Double.valueOf(System.currentTimeMillis());
        this.e.j.b();
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
