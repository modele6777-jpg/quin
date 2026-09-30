package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d6d {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public d6d(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6d)) {
            return false;
        }
        d6d d6dVar = (d6d) obj;
        return this.a == d6dVar.a && this.b == d6dVar.b && this.c == d6dVar.c && this.d == d6dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "ShareBitmapPreviewStrip(sourceOffsetY=", ", sourceHeight=", ", renderedOffsetY=");
        sbN.append(this.c);
        sbN.append(", renderedHeight=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
