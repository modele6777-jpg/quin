package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kad {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public kad(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kad)) {
            return false;
        }
        kad kadVar = (kad) obj;
        return yi4.b(this.a, kadVar.a) && yi4.b(this.b, kadVar.b) && yi4.b(this.c, kadVar.c) && yi4.b(this.d, kadVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strC2 = yi4.c(this.b);
        return ks0.m(ib8.o("SharePreviewCarouselMetrics(focusWidth=", strC, ", pageSpacing=", strC2, ", neighborWidth="), yi4.c(this.c), ", contentPadding=", yi4.c(this.d), ")");
    }
}
