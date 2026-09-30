package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lc6 implements za0 {
    public final Object a(Context context, a26 a26Var, gbe gbeVar) {
        Object dzbVar;
        vb2 vb2VarH = kn2.H(context);
        if (vb2VarH != null && !vb2VarH.isFinishing() && !vb2VarH.isDestroyed() && vb2VarH.a.i.a(g48.e)) {
            try {
                Context applicationContext = vb2VarH.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = vb2VarH;
                }
                dzbVar = new rvg(new p3h(applicationContext));
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            rvg rvgVar = (rvg) dzbVar;
            if (rvgVar != null) {
                return z5c.D(vb2VarH, rvgVar, a26Var, gbeVar);
            }
        }
        return null;
    }
}
