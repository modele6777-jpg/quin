package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dx9 extends i09 implements kv7 {
    public xw9 Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        float fB = this.Z.b(zn8Var.getLayoutDirection());
        float fD = this.Z.d();
        float fC = this.Z.c(zn8Var.getLayoutDirection());
        float fA = this.Z.a();
        if (!((yi4.a(fB, 0.0f) >= 0) & (yi4.a(fD, 0.0f) >= 0) & (yi4.a(fC, 0.0f) >= 0) & (yi4.a(fA, 0.0f) >= 0))) {
            g37.a("Padding must be non-negative");
        }
        int iD0 = zn8Var.D0(fB);
        int iD1 = zn8Var.D0(fC) + iD0;
        int iD2 = zn8Var.D0(fD);
        int iD3 = zn8Var.D0(fA) + iD2;
        cea ceaVarV = tn8Var.v(ll2.i(-iD1, -iD3, j));
        return zn8Var.n0(ll2.g(ceaVarV.a + iD1, j), ll2.f(ceaVarV.b + iD3, j), qu4.a, new d57(ceaVarV, iD0, iD2, 2));
    }
}
