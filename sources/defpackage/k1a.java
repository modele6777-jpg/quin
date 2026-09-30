package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1a extends d2a {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public k1a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1a)) {
            return false;
        }
        k1a k1aVar = (k1a) obj;
        return Float.compare(this.c, k1aVar.c) == 0 && Float.compare(this.d, k1aVar.d) == 0 && Float.compare(this.e, k1aVar.e) == 0 && this.f == k1aVar.f && this.g == k1aVar.g && Float.compare(this.h, k1aVar.h) == 0 && Float.compare(this.i, k1aVar.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + ub3.a(this.h, ub3.d(ub3.d(ub3.a(this.e, ub3.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sbO = tec.o("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbO.append(this.e);
        sbO.append(", isMoreThanHalf=");
        sbO.append(this.f);
        sbO.append(", isPositiveArc=");
        sbO.append(this.g);
        sbO.append(", arcStartX=");
        sbO.append(this.h);
        sbO.append(", arcStartY=");
        sbO.append(this.i);
        sbO.append(")");
        return sbO.toString();
    }
}
