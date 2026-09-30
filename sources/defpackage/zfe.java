package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zfe {
    public static final ace a = new ace(new ond(23));

    public static final float[] a(float[] fArr, float[] fArr2) {
        return new float[]{fArr[0] + fArr2[0], fArr[1] + fArr2[1], fArr[2] + fArr2[2]};
    }

    public static final hv2 b(float f, float f2, float f3) {
        return new hv2(new float[]{0.282f * f, 0.50699997f * f2, 0.092f * f3}, new float[]{f, 0.0f, 0.0f}, new float[]{0.0f, f2, 0.0f}, new float[]{0.0f, 0.0f, f3});
    }

    public static final float[] c(float[] fArr, float[] fArr2) {
        float f = fArr[1];
        float f2 = fArr2[2];
        float f3 = fArr[2];
        float f4 = fArr2[1];
        float f5 = fArr2[0];
        float f6 = fArr[0];
        return new float[]{(f * f2) - (f3 * f4), (f3 * f5) - (f2 * f6), (f6 * f4) - (f * f5)};
    }

    public static final float d(float[] fArr, float[] fArr2) {
        return (fArr[2] * fArr2[2]) + (fArr[1] * fArr2[1]) + (fArr[0] * fArr2[0]);
    }

    public static final u95 e(yfe yfeVar) {
        int iOrdinal = yfeVar.ordinal();
        if (iOrdinal == 0) {
            return new u95(new float[]{0.0f, 0.0f, 1.0f}, new float[]{1.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f}, 0.282f, 0.50699997f, 0.11f);
        }
        if (iOrdinal == 1) {
            return new u95(new float[]{0.0f, 0.0f, -1.0f}, new float[]{-1.0f, 0.0f, 0.0f}, new float[]{0.0f, 1.0f, 0.0f}, 0.282f, 0.50699997f, 0.11f);
        }
        if (iOrdinal == 2) {
            return new u95(new float[]{-1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f}, 0.092f, 0.50699997f, 0.3f);
        }
        if (iOrdinal == 3) {
            return new u95(new float[]{1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f}, new float[]{0.0f, 1.0f, 0.0f}, 0.092f, 0.50699997f, 0.3f);
        }
        if (iOrdinal == 4) {
            return new u95(new float[]{0.0f, 1.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0f}, 0.282f, 0.092f, 0.525f);
        }
        if (iOrdinal == 5) {
            return new u95(new float[]{0.0f, -1.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f}, 0.282f, 0.092f, 0.525f);
        }
        ap.c();
        return null;
    }

    public static final float[] f(u95 u95Var, float[] fArr) {
        return new float[]{mh3.n((d(fArr, u95Var.b) / (u95Var.d * 2.0f)) + 0.5f, 0.0f, 1.0f), mh3.n((d(fArr, u95Var.c) / (u95Var.e * 2.0f)) + 0.5f, 0.0f, 1.0f)};
    }

    public static final float[] g(float[] fArr, float f) {
        return new float[]{fArr[0] * f, fArr[1] * f, fArr[2] * f};
    }
}
