package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h7c extends lmg {
    public final xn7 x;
    public final LinkedHashMap y;
    public final hzc z = izc.a;
    public final LinkedHashMap A = new LinkedHashMap();
    public int B = -1;

    public h7c(xn7 xn7Var, LinkedHashMap linkedHashMap) {
        this.x = xn7Var;
        this.y = linkedHashMap;
    }

    @Override // defpackage.ev4
    public final hzc a() {
        return this.z;
    }

    @Override // defpackage.lmg
    public final void d0(nyc nycVar, int i) {
        nycVar.getClass();
        this.B = i;
    }

    @Override // defpackage.lmg
    public final void e0(Object obj) {
        t0(obj);
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final void f() {
        t0(null);
    }

    @Override // defpackage.ev4
    public final void h(xn7 xn7Var, Object obj) {
        xn7Var.getClass();
        t0(obj);
    }

    @Override // defpackage.lmg, defpackage.ev4
    public final ev4 n(nyc nycVar) {
        nycVar.getClass();
        if (m7c.n(nycVar)) {
            this.B = 0;
        }
        return this;
    }

    public final void t0(Object obj) {
        String strF = this.x.e().f(this.B);
        ub9 ub9Var = (ub9) this.y.get(strF);
        if (ub9Var != null) {
            this.A.put(strF, ub9Var instanceof r72 ? ((r72) ub9Var).i(obj) : t72.H(ub9Var.f(obj)));
        } else {
            ho7.j(ib8.j("Cannot find NavType for argument ", strF, ". Please provide NavType through typeMap."));
        }
    }
}
