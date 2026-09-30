package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tte {
    public final ste a;
    public bv7 b = null;
    public bv7 c;

    public tte(ste steVar, bv7 bv7Var) {
        this.a = steVar;
        this.c = bv7Var;
    }

    public final long a(long j) {
        hkb hkbVarM;
        bv7 bv7Var = this.b;
        hkb hkbVar = hkb.e;
        if (bv7Var != null) {
            if (bv7Var.h()) {
                bv7 bv7Var2 = this.c;
                hkbVarM = bv7Var2 != null ? bv7Var2.M(bv7Var, true) : null;
            } else {
                hkbVarM = hkbVar;
            }
            if (hkbVarM != null) {
                hkbVar = hkbVarM;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = hkbVar.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = hkbVar.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = hkbVar.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = hkbVar.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        ste steVar = this.a;
        int iE = steVar.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= steVar.h(iE) && Float.intBitsToFloat(i) <= steVar.i(iE);
    }

    public final long d(long j) {
        bv7 bv7Var;
        bv7 bv7Var2 = this.b;
        if (bv7Var2 != null) {
            if (!bv7Var2.h()) {
                bv7Var2 = null;
            }
            if (bv7Var2 != null && (bv7Var = this.c) != null) {
                bv7 bv7Var3 = bv7Var.h() ? bv7Var : null;
                if (bv7Var3 != null) {
                    return bv7Var2.K(bv7Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        bv7 bv7Var;
        bv7 bv7Var2 = this.b;
        if (bv7Var2 != null) {
            if (!bv7Var2.h()) {
                bv7Var2 = null;
            }
            if (bv7Var2 != null && (bv7Var = this.c) != null) {
                bv7 bv7Var3 = bv7Var.h() ? bv7Var : null;
                if (bv7Var3 != null) {
                    return bv7Var3.K(bv7Var2, j);
                }
            }
        }
        return j;
    }
}
