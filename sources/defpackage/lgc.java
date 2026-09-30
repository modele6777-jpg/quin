package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lgc implements Application.ActivityLifecycleCallbacks {
    public static boolean b;
    public static boolean c;
    public static final lgc a = new lgc();
    public static final LinkedHashMap d = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [yfc] */
    public static ngc a(Activity activity) {
        n25 n25VarI;
        x48 x48Var = activity instanceof x48 ? (x48) activity : null;
        if (x48Var == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = d;
        Object obj = linkedHashMap.get(activity);
        if (obj == null) {
            ngc ngcVar = new ngc(activity.getClass().getSimpleName());
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                h48 h48VarK = x48Var.k();
                final hla hlaVar = new hla(16, ngcVar);
                ?? r4 = new Activity.ScreenCaptureCallback() { // from class: yfc
                    @Override // android.app.Activity.ScreenCaptureCallback
                    public final void onScreenCaptured() throws Throwable {
                        hlaVar.invoke();
                    }
                };
                imb imbVar = new imb();
                n25VarI = hgc.I(new fgc(imbVar, activity, r4), new ggc(imbVar, activity, r4), h48VarK);
            } else {
                vx7 vx7Var = new vx7(1, ngcVar, ngc.class, "captured", "captured(Z)V", 0, 15);
                ContentResolver contentResolver = activity.getContentResolver();
                imb imbVar2 = new imb();
                lmb lmbVar = new lmb();
                lmb lmbVar2 = new lmb();
                cgc cgcVar = new cgc(lmbVar2, lmbVar, x48Var, i, contentResolver, imbVar2, new LinkedHashSet(), vx7Var, new Handler(Looper.getMainLooper()));
                n25VarI = hgc.I(new agc(imbVar2, contentResolver, cgcVar, lmbVar2, lmbVar), new bgc(imbVar2, lmbVar, contentResolver, cgcVar), x48Var.k());
            }
            ngcVar.e = n25VarI;
            linkedHashMap.put(activity, ngcVar);
            obj = ngcVar;
        }
        return (ngc) obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (b) {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        n25 n25Var;
        activity.getClass();
        ngc ngcVar = (ngc) d.remove(activity);
        if (ngcVar == null || (n25Var = ngcVar.e) == null) {
            return;
        }
        n25Var.invoke();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
