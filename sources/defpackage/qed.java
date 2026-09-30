package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qed implements pc9 {
    public final /* synthetic */ ted a;
    public final /* synthetic */ a26 b;

    public qed(ted tedVar, a26 a26Var) {
        this.a = tedVar;
        this.b = a26Var;
    }

    @Override // defpackage.pc9
    public final long G(long j, int i, long j2) {
        if (i != 1) {
            return 0L;
        }
        lo loVar = this.a.d;
        float fE = loVar.e(Float.intBitsToFloat((int) (4294967295L & j2)));
        qz9 qz9Var = loVar.i;
        float fJ = Float.isNaN(qz9Var.j()) ? 0.0f : qz9Var.j();
        qz9Var.k(fE);
        return a(fE - fJ);
    }

    @Override // defpackage.pc9
    public final Object G0(long j, xn2 xn2Var) {
        float fC = zsf.c(j);
        ted tedVar = this.a;
        float f = tedVar.d.f();
        float fC2 = tedVar.d.d().c();
        if (fC >= 0.0f || f <= fC2) {
            j = 0;
        } else {
            this.b.d(new Float(fC));
        }
        return new zsf(j);
    }

    @Override // defpackage.pc9
    public final Object H(long j, long j2, xn2 xn2Var) {
        this.b.d(new Float(zsf.c(j2)));
        return new zsf(j2);
    }

    @Override // defpackage.pc9
    public final long U(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        lo loVar = this.a.d;
        float fE = loVar.e(fIntBitsToFloat);
        qz9 qz9Var = loVar.i;
        float fJ = Float.isNaN(qz9Var.j()) ? 0.0f : qz9Var.j();
        qz9Var.k(fE);
        return a(fE - fJ);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
