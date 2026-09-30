package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dw9 implements pc9 {
    public boolean a;
    public float b;
    public float c;
    public final /* synthetic */ ru9 d;
    public final /* synthetic */ qj2 e;
    public final /* synthetic */ dl f;
    public final /* synthetic */ j18 g;

    public dw9(ru9 ru9Var, qj2 qj2Var, dl dlVar, j18 j18Var) {
        this.d = ru9Var;
        this.e = qj2Var;
        this.f = dlVar;
        this.g = j18Var;
    }

    @Override // defpackage.pc9
    public final long G(long j, int i, long j2) {
        int i2 = (int) (j & 4294967295L);
        boolean z = Float.intBitsToFloat(i2) < 0.0f || Float.intBitsToFloat((int) (j2 & 4294967295L)) < 0.0f;
        if (z) {
            this.c = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2) + this.c;
        }
        if (!z || this.c >= -10.0f || this.g.d() || !this.a || ((Boolean) this.e.invoke()).booleanValue()) {
            return 0L;
        }
        this.f.d(Boolean.TRUE);
        this.c = 0.0f;
        this.b = 0.0f;
        return 0L;
    }

    @Override // defpackage.pc9
    public final long U(int i, long j) {
        this.a = true;
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) > 0.0f && i == 1) {
            this.d.a.setValue(Boolean.FALSE);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        if (fIntBitsToFloat <= 0.0f) {
            if (fIntBitsToFloat >= 0.0f) {
                return 0L;
            }
            this.c += fIntBitsToFloat;
            this.b = 0.0f;
            return 0L;
        }
        float f = this.b + fIntBitsToFloat;
        this.b = f;
        this.c = 0.0f;
        if (f <= 10.0f || !((Boolean) this.e.invoke()).booleanValue()) {
            return 0L;
        }
        this.f.d(Boolean.FALSE);
        this.b = 0.0f;
        return 0L;
    }
}
