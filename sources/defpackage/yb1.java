package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc1 b;

    public /* synthetic */ yb1(gc1 gc1Var, int i) {
        this.a = i;
        this.b = gc1Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean z;
        int i = this.a;
        gc1 gc1Var = this.b;
        switch (i) {
            case 0:
                synchronized (gc1Var.q) {
                    gc1Var.s = gf1.p;
                    Log.d("CXCP", gc1Var + " is closed");
                }
                nb1 nb1Var = gc1Var.o;
                Log.d("CXCP", gc1Var + " finalized");
                synchronized (nb1Var.f) {
                    nb1Var.g.remove(gc1Var);
                }
                za2 za2Var = gc1Var.x;
                wef wefVar = wef.a;
                za2Var.R(wefVar);
                jgb.I(gc1Var.a, null);
                return wefVar;
            default:
                ((wef) obj).getClass();
                synchronized (gc1Var.q) {
                    z = gc1Var.r;
                }
                return Boolean.valueOf(z);
        }
    }
}
