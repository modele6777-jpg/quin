package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jv implements Application.ActivityLifecycleCallbacks {
    public final double a;
    public final /* synthetic */ kv b;

    public jv(kv kvVar, mib mibVar) {
        this.b = kvVar;
        hib hibVar = mibVar.a;
        q95 q95Var = cw6.a;
        Object obj = hibVar.b.n.a.get(cw6.d);
        this.a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.a;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        kv kvVar = this.b;
        mib mibVar = (mib) ((WeakReference) kvVar.b).get();
        if (mibVar == null) {
            kvVar.g();
            return;
        }
        qib qibVarC = mibVar.c();
        if (qibVarC != null) {
            synchronized (qibVarC.c) {
                j = qibVarC.a.a;
            }
            qibVarC.b((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        kv kvVar = this.b;
        mib mibVar = (mib) ((WeakReference) kvVar.b).get();
        if (mibVar == null) {
            kvVar.g();
            return;
        }
        qib qibVarC = mibVar.c();
        if (qibVarC != null) {
            synchronized (qibVarC.c) {
                j = qibVarC.a.a;
            }
            qibVarC.b(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
