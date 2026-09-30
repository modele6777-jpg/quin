package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r0a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final w4d h;
    public final int i;

    public r0a(float f, float f2, float f3, float f4, int i, float f5, float f6, w4d w4dVar, int i2) {
        w4dVar.getClass();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = f5;
        this.g = f6;
        this.h = w4dVar;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0a)) {
            return false;
        }
        r0a r0aVar = (r0a) obj;
        return Float.compare(this.a, r0aVar.a) == 0 && Float.compare(this.b, r0aVar.b) == 0 && Float.compare(this.c, r0aVar.c) == 0 && Float.compare(this.d, r0aVar.d) == 0 && this.e == r0aVar.e && Float.compare(this.f, r0aVar.f) == 0 && Float.compare(this.g, r0aVar.g) == 0 && pa7.t(this.h, r0aVar.h) && this.i == r0aVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((this.h.hashCode() + ub3.a(this.g, ub3.a(this.f, ub3.b(this.e, ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = tec.o("Particle(x=", this.a, ", y=", this.b, ", width=");
        ks0.w(sbO, this.c, ", height=", this.d, ", color=");
        sbO.append(this.e);
        sbO.append(", rotation=");
        sbO.append(this.f);
        sbO.append(", scaleX=");
        sbO.append(this.g);
        sbO.append(", shape=");
        sbO.append(this.h);
        sbO.append(", alpha=");
        return tec.g(this.i, ")", sbO);
    }
}
