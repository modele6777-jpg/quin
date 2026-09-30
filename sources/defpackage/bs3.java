package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bs3 implements pc9 {
    public final yx9 a;
    public final cv7 b;

    public bs3(yx9 yx9Var, cv7 cv7Var) {
        this.a = yx9Var;
        this.b = cv7Var;
    }

    @Override // defpackage.pc9
    public final long G(long j, int i, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.pc9
    public final Object H(long j, long j2, xn2 xn2Var) {
        return new zsf(zsf.a(0.0f, 0.0f, 1, j2));
    }

    @Override // defpackage.pc9
    public final long U(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        yx9 yx9Var = this.a;
        hzc hzcVar = yx9Var.d;
        hzc hzcVar2 = yx9Var.d;
        if (Math.abs(((qz9) hzcVar.d).j()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        qx9 qx9VarK = yx9Var.k();
        float fJ = ((qz9) hzcVar2.d).j() * yx9Var.m();
        float f = ((qx9VarK.b + qx9VarK.c) * (-Math.signum(((qz9) hzcVar2.d).j()))) + fJ;
        if (((qz9) hzcVar2.d).j() > 0.0f) {
            fJ = f;
            f = fJ;
        }
        float fN = mh3.n(Float.intBitsToFloat(i2), fJ, f);
        boolean z = this.b == cv7.b;
        os3 os3Var = yx9Var.k;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(z ? os3Var.e(fN) : -os3Var.e(-fN))) << 32);
    }
}
