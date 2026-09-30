package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hcg extends i09 implements kv7 {
    public boolean E0;
    public l26 F0;
    public j94 Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        j94 j94Var = this.Z;
        j94 j94Var2 = j94.a;
        int iJ = j94Var != j94Var2 ? 0 : kl2.j(j);
        j94 j94Var3 = this.Z;
        j94 j94Var4 = j94.b;
        cea ceaVarV = tn8Var.v(ll2.a(iJ, (this.Z == j94Var2 || !this.E0) ? kl2.h(j) : Integer.MAX_VALUE, j94Var3 == j94Var4 ? kl2.i(j) : 0, (this.Z == j94Var4 || !this.E0) ? kl2.g(j) : Integer.MAX_VALUE));
        int iO = mh3.o(ceaVarV.a, kl2.j(j), kl2.h(j));
        int iO2 = mh3.o(ceaVarV.b, kl2.i(j), kl2.g(j));
        return zn8Var.n0(iO, iO2, qu4.a, new w3g(this, iO, ceaVarV, iO2, zn8Var));
    }
}
