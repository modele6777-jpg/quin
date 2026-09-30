package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ij5 implements pj5 {
    public final float a;
    public final float b;

    public ij5(float f, float f2) {
        this.a = Math.max(1.0E-7f, Math.abs(f2));
        this.b = Math.max(1.0E-4f, f) * (-4.2f);
    }

    public hj5 a(float f) {
        double dB = b(f);
        double d = jj5.a;
        double d2 = d - 1.0d;
        return new hj5(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = as.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }

    @Override // defpackage.pj5
    public float e() {
        return this.a;
    }

    @Override // defpackage.pj5
    public float i(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // defpackage.pj5
    public long l(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.pj5
    public float n(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.a;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.b;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }

    @Override // defpackage.pj5
    public float o(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    public ij5(float f, sw3 sw3Var) {
        this.a = f;
        float density = sw3Var.getDensity();
        float f2 = jj5.a;
        this.b = density * 386.0878f * 160.0f * 0.84f;
    }
}
