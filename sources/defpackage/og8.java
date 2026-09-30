package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class og8 implements bv7 {
    public final ng8 a;

    public og8(ng8 ng8Var) {
        this.a = ng8Var;
    }

    @Override // defpackage.bv7
    public final long C(long j) {
        return hl9.g(this.a.J0.C(j), a());
    }

    @Override // defpackage.bv7
    public final bv7 G() {
        ng8 ng8VarF1;
        if (!h()) {
            i37.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        yf9 yf9Var = this.a.J0.J0.getOuterCoordinator$ui().N0;
        if (yf9Var == null || (ng8VarF1 = yf9Var.f1()) == null) {
            return null;
        }
        return ng8VarF1.M0;
    }

    @Override // defpackage.bv7
    public final long K(bv7 bv7Var, long j) {
        return O(bv7Var, j, true);
    }

    @Override // defpackage.bv7
    public final long L(long j) {
        return hl9.g(this.a.J0.L(j), a());
    }

    @Override // defpackage.bv7
    public final hkb M(bv7 bv7Var, boolean z) {
        return this.a.J0.M(bv7Var, z);
    }

    @Override // defpackage.bv7
    public final long N(long j) {
        return this.a.J0.N(hl9.g(j, a()));
    }

    @Override // defpackage.bv7
    public final long O(bv7 bv7Var, long j, boolean z) {
        boolean z2 = bv7Var instanceof og8;
        ng8 ng8Var = this.a;
        if (!z2) {
            ng8 ng8VarE = m93.E(ng8Var);
            yf9 yf9Var = ng8VarE.J0;
            long jO = O(ng8VarE.M0, j, z);
            long j2 = ng8VarE.K0;
            long jF = hl9.f(jO, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!yf9Var.h1().Y) {
                i37.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            yf9Var.r1();
            yf9 yf9Var2 = yf9Var.N0;
            if (yf9Var2 != null) {
                yf9Var = yf9Var2;
            }
            return hl9.g(jF, yf9Var.O(bv7Var, 0L, z));
        }
        ng8 ng8Var2 = ((og8) bv7Var).a;
        yf9 yf9Var3 = ng8Var2.J0;
        yf9Var3.r1();
        ng8 ng8VarF1 = ng8Var.J0.d1(yf9Var3).f1();
        if (ng8VarF1 != null) {
            boolean z3 = !z;
            long jC = w67.c(w67.d(ng8Var2.Z0(ng8VarF1, z3), qn4.R(j)), ng8Var.Z0(ng8VarF1, z3));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        ng8 ng8VarE2 = m93.E(ng8Var2);
        boolean z4 = !z;
        long jD = w67.d(w67.d(ng8Var2.Z0(ng8VarE2, z4), ng8VarE2.K0), qn4.R(j));
        ng8 ng8VarE3 = m93.E(ng8Var);
        long jC2 = w67.c(jD, w67.d(ng8Var.Z0(ng8VarE3, z4), ng8VarE3.K0));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        yf9 yf9Var4 = ng8VarE3.J0.N0;
        yf9Var4.getClass();
        yf9 yf9Var5 = ng8VarE2.J0.N0;
        yf9Var5.getClass();
        return yf9Var4.O(yf9Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    public final long a() {
        ng8 ng8Var = this.a;
        ng8 ng8VarE = m93.E(ng8Var);
        return hl9.f(O(ng8VarE.M0, 0L, true), ng8Var.J0.O(ng8VarE.J0, 0L, true));
    }

    @Override // defpackage.bv7
    public final long c(long j) {
        return this.a.J0.c(hl9.g(j, a()));
    }

    @Override // defpackage.bv7
    public final boolean h() {
        return this.a.J0.h1().Y;
    }

    @Override // defpackage.bv7
    public final void j(float[] fArr) {
        this.a.J0.j(fArr);
    }

    @Override // defpackage.bv7
    public final void k(bv7 bv7Var, float[] fArr) {
        this.a.J0.k(bv7Var, fArr);
    }

    @Override // defpackage.bv7
    public final long l() {
        ng8 ng8Var = this.a;
        return (((long) ng8Var.a) << 32) | (((long) ng8Var.b) & 4294967295L);
    }

    @Override // defpackage.bv7
    public final long r(long j) {
        return this.a.J0.r(hl9.g(j, a()));
    }
}
