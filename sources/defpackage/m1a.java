package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1a extends d2a {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public m1a(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1a)) {
            return false;
        }
        m1a m1aVar = (m1a) obj;
        return Float.compare(this.c, m1aVar.c) == 0 && Float.compare(this.d, m1aVar.d) == 0 && Float.compare(this.e, m1aVar.e) == 0 && Float.compare(this.f, m1aVar.f) == 0 && Float.compare(this.g, m1aVar.g) == 0 && Float.compare(this.h, m1aVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ub3.a(this.g, ub3.a(this.f, ub3.a(this.e, ub3.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = tec.o("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        ks0.w(sbO, this.e, ", y2=", this.f, ", x3=");
        sbO.append(this.g);
        sbO.append(", y3=");
        sbO.append(this.h);
        sbO.append(")");
        return sbO.toString();
    }
}
