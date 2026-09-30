package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b0a extends i09 implements kv7 {
    public h0e E0;
    public h0e F0;
    public float Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        h0e h0eVar = this.E0;
        int iRound = (h0eVar == null || ((Number) h0eVar.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) h0eVar.getValue()).floatValue() * this.Z);
        h0e h0eVar2 = this.F0;
        int iRound2 = (h0eVar2 == null || ((Number) h0eVar2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) h0eVar2.getValue()).floatValue() * this.Z);
        int iJ = iRound != Integer.MAX_VALUE ? iRound : kl2.j(j);
        int i = iRound2 != Integer.MAX_VALUE ? iRound2 : kl2.i(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = kl2.h(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = kl2.g(j);
        }
        cea ceaVarV = tn8Var.v(ll2.a(iJ, iRound, i, iRound2));
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 13));
    }
}
