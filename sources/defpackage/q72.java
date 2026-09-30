package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q72 extends e1 {
    public final xn7 a;

    public q72(xn7 xn7Var) {
        this.a = xn7Var;
    }

    @Override // defpackage.xn7
    public void a(ev4 ev4Var, Object obj) {
        int i = i(obj);
        nyc nycVarE = e();
        nycVarE.getClass();
        ag2 ag2VarC = ev4Var.c(nycVarE);
        Iterator itH = h(obj);
        for (int i2 = 0; i2 < i; i2++) {
            ag2VarC.p(e(), i2, this.a, itH.next());
        }
        ag2VarC.b(nycVarE);
    }

    @Override // defpackage.e1
    public void k(zf2 zf2Var, int i, Object obj) {
        n(i, obj, zf2Var.s(e(), i, this.a, null));
    }

    public abstract void n(int i, Object obj, Object obj2);
}
