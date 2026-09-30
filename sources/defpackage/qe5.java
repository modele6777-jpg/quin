package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qe5 extends i09 implements kv7 {
    public float E0;
    public j94 Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!kl2.d(j) || this.Z == j94.a) {
            iJ = kl2.j(j);
            iH = kl2.h(j);
        } else {
            int iRound = Math.round(kl2.h(j) * this.E0);
            int iJ2 = kl2.j(j);
            iJ = kl2.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!kl2.c(j) || this.Z == j94.b) {
            int i2 = kl2.i(j);
            int iG2 = kl2.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(kl2.g(j) * this.E0);
            int i3 = kl2.i(j);
            iG = kl2.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        cea ceaVarV = tn8Var.v(ll2.a(iJ, iH, iG, i));
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 7));
    }
}
