package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class e57 extends z47 implements kv7 {
    public g7g F0;

    public e57(g7g g7gVar) {
        this.F0 = g7gVar;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        int iD = this.E0.d(zn8Var, zn8Var.getLayoutDirection()) - this.Z.d(zn8Var, zn8Var.getLayoutDirection());
        int iA = this.E0.a(zn8Var) - this.Z.a(zn8Var);
        int iB = (this.E0.b(zn8Var, zn8Var.getLayoutDirection()) - this.Z.b(zn8Var, zn8Var.getLayoutDirection())) + iD;
        int iC = (this.E0.c(zn8Var) - this.Z.c(zn8Var)) + iA;
        cea ceaVarV = tn8Var.v(ll2.i(-iB, -iC, j));
        return zn8Var.n0(ll2.g(ceaVarV.a + iB, j), ll2.f(ceaVarV.b + iC, j), qu4.a, new d57(ceaVarV, iD, iA, 0));
    }

    @Override // defpackage.z47
    public final g7g l1(g7g g7gVar) {
        return new tef(g7gVar, this.F0);
    }

    @Override // defpackage.z47
    public final void m1() {
        super.m1();
        rs0.F(this);
    }
}
