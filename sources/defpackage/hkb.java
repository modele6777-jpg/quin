package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hkb {
    public static final hkb e = new hkb(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public hkb(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static hkb b(hkb hkbVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = hkbVar.a;
        }
        float f4 = hkbVar.b;
        if ((i & 4) != 0) {
            f2 = hkbVar.c;
        }
        if ((i & 8) != 0) {
            f3 = hkbVar.d;
        }
        hkbVar.getClass();
        return new hkb(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long d() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long e() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkb)) {
            return false;
        }
        hkb hkbVar = (hkb) obj;
        return Float.compare(this.a, hkbVar.a) == 0 && Float.compare(this.b, hkbVar.b) == 0 && Float.compare(this.c, hkbVar.c) == 0 && Float.compare(this.d, hkbVar.d) == 0;
    }

    public final long f() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final hkb g(hkb hkbVar) {
        return new hkb(Math.max(this.a, hkbVar.a), Math.max(this.b, hkbVar.b), Math.min(this.c, hkbVar.c), Math.min(this.d, hkbVar.d));
    }

    public final boolean h() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final boolean i(hkb hkbVar) {
        return (this.a < hkbVar.c) & (hkbVar.a < this.c) & (this.b < hkbVar.d) & (hkbVar.b < this.d);
    }

    public final hkb j(float f, float f2) {
        return new hkb(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final hkb k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new hkb(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strO = k99.O(this.a);
        String strO2 = k99.O(this.b);
        return ks0.m(ib8.o("Rect.fromLTRB(", strO, ", ", strO2, ", "), k99.O(this.c), ", ", k99.O(this.d), ")");
    }
}
