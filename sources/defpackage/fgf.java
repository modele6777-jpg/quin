package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fgf extends i09 implements kv7 {
    public float E0;
    public float Z;

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        int iN = tn8Var.n(i);
        int iD0 = !Float.isNaN(this.Z) ? lg8Var.D0(this.Z) : 0;
        return iN < iD0 ? iD0 : iN;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.Z) || kl2.j(j) != 0) {
            iJ = kl2.j(j);
        } else {
            int iD0 = zn8Var.D0(this.Z);
            iJ = kl2.h(j);
            if (iD0 < 0) {
                iD0 = 0;
            }
            if (iD0 <= iJ) {
                iJ = iD0;
            }
        }
        int iH = kl2.h(j);
        if (Float.isNaN(this.E0) || kl2.i(j) != 0) {
            i = kl2.i(j);
        } else {
            int iD1 = zn8Var.D0(this.E0);
            i = kl2.g(j);
            int i2 = iD1 >= 0 ? iD1 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        cea ceaVarV = tn8Var.v(ll2.a(iJ, iH, i, kl2.g(j)));
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 23));
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        int iQ = tn8Var.q(i);
        int iD0 = !Float.isNaN(this.Z) ? lg8Var.D0(this.Z) : 0;
        return iQ < iD0 ? iD0 : iQ;
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        int iB = tn8Var.b(i);
        int iD0 = !Float.isNaN(this.E0) ? lg8Var.D0(this.E0) : 0;
        return iB < iD0 ? iD0 : iB;
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        int iV = tn8Var.V(i);
        int iD0 = !Float.isNaN(this.E0) ? lg8Var.D0(this.E0) : 0;
        return iV < iD0 ? iD0 : iV;
    }
}
