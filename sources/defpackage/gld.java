package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gld extends i09 implements kv7 {
    public float E0;
    public float F0;
    public float G0;
    public boolean H0;
    public float Z;

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        long jL1 = l1(lg8Var);
        if (kl2.f(jL1)) {
            return kl2.h(jL1);
        }
        if (!this.H0) {
            i = ll2.f(i, jL1);
        }
        return ll2.g(tn8Var.n(i), jL1);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jL1 = l1(zn8Var);
        if (this.H0) {
            jA = ll2.e(j, jL1);
        } else {
            if (Float.isNaN(this.Z)) {
                iJ = kl2.j(j);
                int iH2 = kl2.h(jL1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = kl2.j(jL1);
            }
            if (Float.isNaN(this.F0)) {
                iH = kl2.h(j);
                int iJ2 = kl2.j(jL1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = kl2.h(jL1);
            }
            if (Float.isNaN(this.E0)) {
                i = kl2.i(j);
                int iG2 = kl2.g(jL1);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = kl2.i(jL1);
            }
            if (Float.isNaN(this.G0)) {
                iG = kl2.g(j);
                int i2 = kl2.i(jL1);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = kl2.g(jL1);
            }
            jA = ll2.a(iJ, iH, i, iG);
        }
        cea ceaVarV = tn8Var.v(jA);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 15));
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        long jL1 = l1(lg8Var);
        if (kl2.f(jL1)) {
            return kl2.h(jL1);
        }
        if (!this.H0) {
            i = ll2.f(i, jL1);
        }
        return ll2.g(tn8Var.q(i), jL1);
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        long jL1 = l1(lg8Var);
        if (kl2.e(jL1)) {
            return kl2.g(jL1);
        }
        if (!this.H0) {
            i = ll2.g(i, jL1);
        }
        return ll2.f(tn8Var.b(i), jL1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long l1(zn8 zn8Var) {
        int iD0;
        int iD1;
        int iD2;
        int i = 0;
        if (Float.isNaN(this.F0)) {
            iD0 = Integer.MAX_VALUE;
        } else {
            iD0 = zn8Var.D0(this.F0);
            if (iD0 < 0) {
                iD0 = 0;
            }
        }
        if (Float.isNaN(this.G0)) {
            iD1 = Integer.MAX_VALUE;
        } else {
            iD1 = zn8Var.D0(this.G0);
            if (iD1 < 0) {
                iD1 = 0;
            }
        }
        if (Float.isNaN(this.Z)) {
            iD2 = 0;
        } else {
            iD2 = zn8Var.D0(this.Z);
            if (iD2 < 0) {
                iD2 = 0;
            }
            if (iD2 > iD0) {
                iD2 = iD0;
            }
            if (iD2 == Integer.MAX_VALUE) {
                iD2 = 0;
            }
        }
        if (!Float.isNaN(this.E0)) {
            int iD3 = zn8Var.D0(this.E0);
            if (iD3 < 0) {
                iD3 = 0;
            }
            if (iD3 > iD1) {
                iD3 = iD1;
            }
            if (iD3 != Integer.MAX_VALUE) {
                i = iD3;
            }
        }
        return ll2.a(iD2, iD0, i, iD1);
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        long jL1 = l1(lg8Var);
        if (kl2.e(jL1)) {
            return kl2.g(jL1);
        }
        if (!this.H0) {
            i = ll2.g(i, jL1);
        }
        return ll2.f(tn8Var.V(i), jL1);
    }
}
