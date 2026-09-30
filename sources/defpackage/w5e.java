package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w5e extends i09 implements kv7 {
    public z5e Z;

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        z5e z5eVar = this.Z;
        z5eVar.getClass();
        a6e a6eVarQ1 = z5e.q1(z5eVar, 1);
        float f = a6eVarQ1.v((byte) 8) ? a6eVarQ1.k : 0.0f;
        float f2 = (a6eVarQ1.v((byte) 0) ? a6eVarQ1.c : 0.0f) + f;
        float f3 = (a6eVarQ1.v((byte) 1) ? a6eVarQ1.d : 0.0f) + f;
        int i = 2;
        float f4 = (a6eVarQ1.v((byte) 2) ? a6eVarQ1.e : 0.0f) + f;
        float f5 = a6eVarQ1.v((byte) 3) ? a6eVarQ1.f : 0.0f;
        int iRound = Math.round(f3 + f2);
        int iRound2 = Math.round(f5 + f + f4);
        cea ceaVarV = tn8Var.v(ll2.i(-iRound, -iRound2, j));
        return zn8Var.n0(ll2.g(ceaVarV.a + iRound, j), ll2.f(ceaVarV.b + iRound2, j), qu4.a, new ui3(f2, f4, i, ceaVarV));
    }

    @Override // defpackage.i09
    public final void d1() {
        i4f i4fVarI = n3d.i(this, "StyleOuterNode");
        i4fVarI.getClass();
        z5e z5eVar = (z5e) i4fVarI;
        z5eVar.F0 = this;
        this.Z = z5eVar;
        z5eVar.r1(true);
    }
}
