package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t2f {
    public final int a;
    public final boolean b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public t2f(float f, float f2, float f3, float f4, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2f)) {
            return false;
        }
        t2f t2fVar = (t2f) obj;
        return this.a == t2fVar.a && this.b == t2fVar.b && this.c == t2fVar.c && this.d == t2fVar.d && this.e == t2fVar.e && this.f == t2fVar.f;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ub3.a(this.e, ub3.a(this.d, ub3.a(this.c, ub3.d(ub3.d(this.a * 31, 31, this.b), 31, false), 31), 31), 31);
    }

    public final String toString() {
        return "TransformationInfo(sourceRotation=" + this.a + ", isSourceMirroredHorizontally=" + this.b + ", isSourceMirroredVertically=false, cropRectLeft=" + this.c + ", cropRectTop=" + this.d + ", cropRectRight=" + this.e + ", cropRectBottom=" + this.f + ')';
    }
}
