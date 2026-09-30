package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p5d {
    public final x4d a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final y6c i;
    public final y6c j;

    public p5d(x4d x4dVar, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        x4dVar.getClass();
        this.a = x4dVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = a7c.b(f);
        this.j = a7c.b(f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5d)) {
            return false;
        }
        p5d p5dVar = (p5d) obj;
        return pa7.t(this.a, p5dVar.a) && yi4.b(this.b, p5dVar.b) && yi4.b(this.c, p5dVar.c) && yi4.b(this.d, p5dVar.d) && yi4.b(this.e, p5dVar.e) && yi4.b(this.f, p5dVar.f) && yi4.b(this.g, p5dVar.g) && yi4.b(this.h, p5dVar.h);
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ub3.a(this.g, ub3.a(this.f, ub3.a(this.e, ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = yi4.c(this.b);
        String strC2 = yi4.c(this.c);
        String strC3 = yi4.c(this.d);
        String strC4 = yi4.c(this.e);
        String strC5 = yi4.c(this.f);
        String strC6 = yi4.c(this.g);
        String strC7 = yi4.c(this.h);
        StringBuilder sb = new StringBuilder("ShapeTokens(primary=");
        sb.append(this.a);
        sb.append(", largeSize=");
        sb.append(strC);
        sb.append(", mediumSize=");
        ub3.v(sb, strC2, ", size24Rect=", strC3, ", size16Rect=");
        ub3.v(sb, strC4, ", cardSmall=", strC5, ", cardMedium=");
        return ks0.m(sb, strC6, ", round=", strC7, ")");
    }
}
