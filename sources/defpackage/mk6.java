package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mk6 implements pc9 {
    public float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ e89 c;

    public mk6(float f, e89 e89Var) {
        this.b = f;
        this.c = e89Var;
    }

    @Override // defpackage.pc9
    public final long G(long j, int i, long j2) {
        e89 e89Var = this.c;
        if (((t91) e89Var.getValue()) == t91.a) {
            if (i == 1) {
                int i2 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i2) > 0.0f) {
                    float fIntBitsToFloat = Float.intBitsToFloat(i2) + this.a;
                    this.a = fIntBitsToFloat;
                    if (fIntBitsToFloat > this.b) {
                        e89Var.setValue(t91.b);
                        this.a = 0.0f;
                    }
                    return j2;
                }
            }
            if (Float.intBitsToFloat((int) (j2 & 4294967295L)) < 0.0f) {
                this.a = 0.0f;
            }
        }
        return 0L;
    }
}
