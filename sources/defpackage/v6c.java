package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v6c {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        w6c.a(0.0f, 0.0f, 0.0f, 0.0f, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public v6c(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6c)) {
            return false;
        }
        v6c v6cVar = (v6c) obj;
        return Float.compare(this.a, v6cVar.a) == 0 && Float.compare(this.b, v6cVar.b) == 0 && Float.compare(this.c, v6cVar.c) == 0 && Float.compare(this.d, v6cVar.d) == 0 && urg.v(this.e, v6cVar.e) && urg.v(this.f, v6cVar.f) && urg.v(this.g, v6cVar.g) && urg.v(this.h, v6cVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ib8.b(ib8.b(ib8.b(ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strO = k99.O(this.a);
        String strO2 = k99.O(this.b);
        String strO3 = k99.O(this.c);
        String strO4 = k99.O(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strO);
        sb.append(", ");
        sb.append(strO2);
        sb.append(", ");
        sb.append(strO3);
        String strL = ks0.l(sb, ", ", strO4);
        long j = this.e;
        long j2 = this.f;
        boolean zV = urg.v(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zV && urg.v(j2, j3) && urg.v(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return tec.m("RoundRect(rect=", strL, ", radius=", k99.O(Float.intBitsToFloat(i)), ")");
            }
            String strO5 = k99.O(Float.intBitsToFloat(i));
            return ks0.l(ib8.o("RoundRect(rect=", strL, ", x=", strO5, ", y="), k99.O(Float.intBitsToFloat(i2)), ")");
        }
        String strR = urg.R(j);
        String strR2 = urg.R(j2);
        String strR3 = urg.R(j3);
        String strR4 = urg.R(j4);
        StringBuilder sbO = ib8.o("RoundRect(rect=", strL, ", topLeft=", strR, ", topRight=");
        ub3.v(sbO, strR2, ", bottomRight=", strR3, ", bottomLeft=");
        return ks0.l(sbO, strR4, ")");
    }

    public v6c(float f, float f2) {
        this(0.0f, 0.0f, f, f2, 0L, 0L, 0L, 0L);
    }
}
