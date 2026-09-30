package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww9 extends i09 implements kv7 {
    public float E0;
    public float F0;
    public float G0;
    public boolean H0;
    public float Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        int iD0 = zn8Var.D0(this.F0) + zn8Var.D0(this.Z);
        int iD1 = zn8Var.D0(this.G0) + zn8Var.D0(this.E0);
        cea ceaVarV = tn8Var.v(ll2.i(-iD0, -iD1, j));
        return zn8Var.n0(ll2.g(ceaVarV.a + iD0, j), ll2.f(ceaVarV.b + iD1, j), qu4.a, new kz8(15, this, ceaVarV));
    }
}
