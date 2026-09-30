package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u0f {
    public ks9 a;
    public long b;

    public u0f(ks9 ks9Var, int i) {
        this(0L, (i & 1) != 0 ? null : ks9Var);
    }

    public static long a(u0f u0fVar, long j, float f) {
        long jG = hl9.g(u0fVar.b, j);
        u0fVar.b = jG;
        float fD = u0fVar.a == null ? hl9.d(jG) : Math.abs(u0fVar.b(jG));
        if (fD <= 0.0f || fD < f) {
            return 9205357640488583168L;
        }
        ks9 ks9Var = u0fVar.a;
        long j2 = u0fVar.b;
        if (ks9Var == null) {
            return hl9.f(u0fVar.b, hl9.h(hl9.b(j2, hl9.d(j2)), f));
        }
        float fB = u0fVar.b(j2) - (Math.signum(u0fVar.b(u0fVar.b)) * f);
        long j3 = u0fVar.b;
        ks9 ks9Var2 = u0fVar.a;
        ks9 ks9Var3 = ks9.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ks9Var2 == ks9Var3 ? j3 & 4294967295L : j3 >> 32));
        if (u0fVar.a == ks9Var3) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == ks9.b ? j >> 32 : j & 4294967295L));
    }

    public u0f(long j, ks9 ks9Var) {
        this.a = ks9Var;
        this.b = j;
    }
}
