package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends i09 implements kv7 {
    public float Z;

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.Z) : tn8Var.n(i);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        long jM1 = m1(j, true);
        if (e77.b(jM1, 0L)) {
            jM1 = l1(j, true);
            if (e77.b(jM1, 0L)) {
                jM1 = o1(j, true);
                if (e77.b(jM1, 0L)) {
                    jM1 = n1(j, true);
                    if (e77.b(jM1, 0L)) {
                        jM1 = m1(j, false);
                        if (e77.b(jM1, 0L)) {
                            jM1 = l1(j, false);
                            if (e77.b(jM1, 0L)) {
                                jM1 = o1(j, false);
                                if (e77.b(jM1, 0L)) {
                                    jM1 = n1(j, false);
                                    if (e77.b(jM1, 0L)) {
                                        jM1 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!e77.b(jM1, 0L)) {
            int i = (int) (jM1 >> 32);
            int i2 = (int) (4294967295L & jM1);
            if (!((i >= 0) & (i2 >= 0))) {
                k37.a("width and height must be >= 0");
            }
            j = ll2.h(i, i, i2, i2);
        }
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 2));
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.Z) : tn8Var.q(i);
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.Z) : tn8Var.b(i);
    }

    public final long l1(long j, boolean z) {
        int iRound;
        int iG = kl2.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.Z)) <= 0) {
            return 0L;
        }
        if (!z || dj6.Q(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long m1(long j, boolean z) {
        int iRound;
        int iH = kl2.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.Z)) <= 0) {
            return 0L;
        }
        if (!z || dj6.Q(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long n1(long j, boolean z) {
        int i = kl2.i(j);
        int iRound = Math.round(i * this.Z);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || dj6.Q(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long o1(long j, boolean z) {
        int iJ = kl2.j(j);
        int iRound = Math.round(iJ / this.Z);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || dj6.Q(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.Z) : tn8Var.V(i);
    }
}
