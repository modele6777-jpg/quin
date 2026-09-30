package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1a extends d2a {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public q1a(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1a)) {
            return false;
        }
        q1a q1aVar = (q1a) obj;
        return Float.compare(this.c, q1aVar.c) == 0 && Float.compare(this.d, q1aVar.d) == 0 && Float.compare(this.e, q1aVar.e) == 0 && Float.compare(this.f, q1aVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ub3.a(this.e, ub3.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = tec.o("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbO.append(this.e);
        sbO.append(", y2=");
        sbO.append(this.f);
        sbO.append(")");
        return sbO.toString();
    }
}
