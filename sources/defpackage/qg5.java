package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qg5 {
    public final ff5 a;
    public final m1d b;

    public qg5(ff5 ff5Var, m1d m1dVar, pv2 pv2Var, k1d k1dVar) {
        ff5Var.getClass();
        m1dVar.getClass();
        pv2Var.getClass();
        k1dVar.getClass();
        this.a = ff5Var;
        this.b = m1dVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.7.");
        ff5Var.a();
        Context applicationContext = ff5Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(k1dVar);
            ynb.V(jgb.k(pv2Var), null, null, new pg5(this, k1dVar, null), 3);
        } else {
            b1.d("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
