package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface sw3 {
    default int D0(float f) {
        float fP0 = p0(f);
        if (Float.isInfinite(fP0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fP0);
    }

    default float F(long j) {
        if (!xue.a(wue.b(j), 4294967296L)) {
            k37.b("Only Sp can convert to Px");
        }
        float[] fArr = uq5.a;
        if (h0() < 1.03f) {
            return h0() * wue.c(j);
        }
        tq5 tq5VarA = uq5.a(h0());
        if (tq5VarA != null) {
            return tq5VarA.b(wue.c(j));
        }
        return h0() * wue.c(j);
    }

    default long N0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fP0 = p0(bj4.b(j));
        float fP1 = p0(bj4.a(j));
        return (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L);
    }

    default long P(int i) {
        return t(Z(i));
    }

    default float Q0(long j) {
        if (!xue.a(wue.b(j), 4294967296L)) {
            k37.b("Only Sp can convert to Px");
        }
        return p0(F(j));
    }

    default long S(float f) {
        return t(c0(f));
    }

    default float Z(int i) {
        return i / getDensity();
    }

    default float c0(float f) {
        return f / getDensity();
    }

    float getDensity();

    float h0();

    default float p0(float f) {
        return getDensity() * f;
    }

    default long t(float f) {
        float[] fArr = uq5.a;
        if (h0() < 1.03f) {
            return w6c.r(4294967296L, f / h0());
        }
        tq5 tq5VarA = uq5.a(h0());
        return w6c.r(4294967296L, tq5VarA != null ? tq5VarA.a(f) : f / h0());
    }

    default long u(long j) {
        if (j != 9205357640488583168L) {
            return cgg.f(c0(Float.intBitsToFloat((int) (j >> 32))), c0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default int x0(long j) {
        return Math.round(Q0(j));
    }
}
