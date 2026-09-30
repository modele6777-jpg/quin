package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y72 {
    public static final long b = abg.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final /* synthetic */ int l = 0;
    public final long a;

    static {
        abg.d(4282664004L);
        c = abg.d(4287137928L);
        d = abg.d(4291611852L);
        e = abg.d(4294967295L);
        f = abg.d(4294901760L);
        abg.d(4278255360L);
        g = abg.d(4278190335L);
        h = abg.d(4294967040L);
        abg.d(4278255615L);
        i = abg.d(4294902015L);
        j = abg.c(0);
        float[] fArr = s82.a;
        k = abg.b(0.0f, 0.0f, 0.0f, 0.0f, s82.u);
    }

    public /* synthetic */ y72(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, p82 p82Var) {
        tk2 tk2VarI0;
        p82 p82VarE = e(j2);
        int i2 = p82VarE.c;
        int i3 = p82Var.c;
        if ((i2 | i3) < 0) {
            tk2VarI0 = hkg.i0(p82VarE, p82Var);
        } else {
            q69 q69Var = uk2.a;
            int i4 = i2 | (i3 << 6);
            Object objB = q69Var.b(i4);
            if (objB == null) {
                objB = hkg.i0(p82VarE, p82Var);
                q69Var.i(i4, objB);
            }
            tk2VarI0 = (tk2) objB;
        }
        return tk2VarI0.a(j2);
    }

    public static long b(long j2, float f2) {
        return abg.b(g(j2), f(j2), d(j2), f2, e(j2));
    }

    public static final float c(long j2) {
        float fW;
        float f2;
        if ((63 & j2) == 0) {
            fW = (float) xdc.w((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fW = (float) xdc.w((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fW / f2;
    }

    public static final float d(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) xdc.w((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - lj5.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final p82 e(long j2) {
        float[] fArr = s82.a;
        return s82.y[(int) (j2 & 63)];
    }

    public static final float f(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) xdc.w((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - lj5.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        if ((63 & j2) == 0) {
            return ((float) xdc.w((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - lj5.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String h(long j2) {
        float fG = g(j2);
        float f2 = f(j2);
        float fD = d(j2);
        float fC = c(j2);
        String str = e(j2).a;
        StringBuilder sbO = tec.o("Color(", fG, ", ", f2, ", ");
        ks0.w(sbO, fD, ", ", fC, ", ");
        return ks0.l(sbO, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y72) {
            return this.a == ((y72) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
