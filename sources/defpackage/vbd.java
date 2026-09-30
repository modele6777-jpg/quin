package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vbd {
    public static final c1b a = new c1b(su3.f);

    public static final long a(bv7 bv7Var, bv7 bv7Var2, long j) {
        hkb hkbVarM = bv7Var2.M(bv7Var, false);
        float f = hkbVarM.a;
        float fB = (r2f.b(j) * (hkbVarM.c - f)) + f;
        float f2 = hkbVarM.b;
        float fC = (r2f.c(j) * (hkbVarM.d - f2)) + f2;
        return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
    }

    public static final long b(long j, long j2, float f) {
        int i = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) + ((Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat(i)) * f) + 0.0f;
        int i2 = (int) (j2 & 4294967295L);
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) + ((Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i2)) * f) + 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
