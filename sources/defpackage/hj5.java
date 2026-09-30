package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hj5 {
    public final float a;
    public final float b;
    public final long c;

    public hj5(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj5)) {
            return false;
        }
        hj5 hj5Var = (hj5) obj;
        return Float.compare(this.a, hj5Var.a) == 0 && Float.compare(this.b, hj5Var.b) == 0 && this.c == hj5Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ub3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return tec.h(this.c, ")", tec.o("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="));
    }
}
