package defpackage;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zm2 extends i09 implements pn4, kv7, wwc {
    public bn2 E0;
    public float F0;
    public c82 G0;
    public boolean H0;
    public String I0;
    public nl2 J0;
    public final AsyncImagePainter K0;
    public yi Z;

    public zm2(AsyncImagePainter asyncImagePainter, yi yiVar, bn2 bn2Var, float f, c82 c82Var, boolean z, String str, nl2 nl2Var) {
        this.Z = yiVar;
        this.E0 = bn2Var;
        this.F0 = f;
        this.G0 = c82Var;
        this.H0 = z;
        this.I0 = str;
        this.J0 = nl2Var;
        this.K0 = asyncImagePainter;
    }

    @Override // defpackage.kv7
    public final int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        long jB = ll2.b(0, 0, 0, i, 7);
        nl2 nl2Var = this.J0;
        if (nl2Var != null) {
            nl2Var.e(jB);
        }
        if (this.K0.getE0() == 9205357640488583168L) {
            return tn8Var.n(i);
        }
        long jM1 = m1(jB);
        return Math.max(kl2.j(jM1), tn8Var.n(i));
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        String str = this.I0;
        if (str != null) {
            exc.f(hxcVar, str);
            exc.m(hxcVar, 5);
        }
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        nl2 nl2Var = this.J0;
        if (nl2Var != null) {
            nl2Var.e(j);
        }
        cea ceaVarV = tn8Var.v(m1(j));
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 0));
    }

    @Override // defpackage.i09
    public final void d1() {
        aw2 aw2VarZ0 = Z0();
        AsyncImagePainter asyncImagePainter = this.K0;
        asyncImagePainter.z = aw2VarZ0;
        asyncImagePainter.d();
    }

    @Override // defpackage.i09
    public final void e1() {
        this.K0.c();
    }

    @Override // defpackage.i09
    public final void f1() {
        this.K0.m(null);
    }

    @Override // defpackage.kv7
    public final int h(lg8 lg8Var, tn8 tn8Var, int i) {
        long jB = ll2.b(0, 0, 0, i, 7);
        nl2 nl2Var = this.J0;
        if (nl2Var != null) {
            nl2Var.e(jB);
        }
        if (this.K0.getE0() == 9205357640488583168L) {
            return tn8Var.q(i);
        }
        long jM1 = m1(jB);
        return Math.max(kl2.j(jM1), tn8Var.q(i));
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        long jB = ll2.b(0, i, 0, 0, 13);
        nl2 nl2Var = this.J0;
        if (nl2Var != null) {
            nl2Var.e(jB);
        }
        if (this.K0.getE0() == 9205357640488583168L) {
            return tn8Var.b(i);
        }
        long jM1 = m1(jB);
        return Math.max(kl2.i(jM1), tn8Var.b(i));
    }

    public final long l1(long j) {
        if (ald.e(j)) {
            return 0L;
        }
        long e0 = this.K0.getE0();
        if (e0 != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (e0 >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (e0 & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jK = this.E0.k(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jK >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jK))) <= Float.MAX_VALUE) {
                return dec.m(jFloatToRawIntBits, jK);
            }
        }
        return j;
    }

    public final long m1(long j) {
        float fJ;
        int i;
        float fN;
        boolean zF = kl2.f(j);
        boolean zE = kl2.e(j);
        if (!zF || !zE) {
            boolean z = kl2.d(j) && kl2.c(j);
            AsyncImagePainter asyncImagePainter = this.K0;
            long e0 = asyncImagePainter.getE0();
            if (e0 != 9205357640488583168L) {
                if (!z || (!zF && !zE)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (e0 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (e0 & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i2 = crf.b;
                        fJ = mh3.n(fIntBitsToFloat, kl2.j(j), kl2.h(j));
                    } else {
                        fJ = kl2.j(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i3 = crf.b;
                        fN = mh3.n(fIntBitsToFloat2, kl2.i(j), kl2.g(j));
                    } else {
                        i = kl2.i(j);
                    }
                    long jL1 = l1((((long) Float.floatToRawIntBits(fN)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                    return kl2.a(j, ll2.g(ym8.L(Float.intBitsToFloat((int) (jL1 >> 32))), j), 0, ll2.f(ym8.L(Float.intBitsToFloat((int) (jL1 & 4294967295L))), j), 0, 10);
                }
                fJ = kl2.h(j);
                i = kl2.g(j);
                fN = i;
                long jL2 = l1((((long) Float.floatToRawIntBits(fN)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                return kl2.a(j, ll2.g(ym8.L(Float.intBitsToFloat((int) (jL2 >> 32))), j), 0, ll2.f(ym8.L(Float.intBitsToFloat((int) (jL2 & 4294967295L))), j), 0, 10);
            }
            if (z && ((yg0) asyncImagePainter.J0.a.getValue()).getPainter() != null) {
                return kl2.a(j, kl2.h(j), 0, kl2.g(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        vv7 vv7Var = (vv7) im2Var;
        xl1 xl1Var = vv7Var.a;
        long jL1 = l1(xl1Var.f());
        long jA = this.Z.a(crf.d(jL1), crf.d(xl1Var.f()), vv7Var.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        ta0 ta0Var = xl1Var.b;
        long jZ = ta0Var.z();
        ta0Var.p().g();
        try {
            vd9 vd9Var = (vd9) ta0Var.c;
            if (this.H0) {
                vd9.m(vd9Var, 0.0f, 0.0f, 31);
            }
            vd9Var.I(i, i2);
            this.K0.g(im2Var, jL1, this.F0, this.G0);
            ta0Var.p().o();
            ta0Var.R(jZ);
            vv7Var.a();
        } catch (Throwable th) {
            ks0.t(ta0Var, jZ);
            throw th;
        }
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        long jB = ll2.b(0, i, 0, 0, 13);
        nl2 nl2Var = this.J0;
        if (nl2Var != null) {
            nl2Var.e(jB);
        }
        if (this.K0.getE0() == 9205357640488583168L) {
            return tn8Var.V(i);
        }
        long jM1 = m1(jB);
        return Math.max(kl2.i(jM1), tn8Var.V(i));
    }
}
