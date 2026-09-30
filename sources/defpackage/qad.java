package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qad {
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public qad(float f, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qad)) {
            return false;
        }
        qad qadVar = (qad) obj;
        return Float.compare(this.a, qadVar.a) == 0 && this.b == qadVar.b && this.c == qadVar.c && this.d == qadVar.d && this.e == qadVar.e && this.f == qadVar.f && this.g == qadVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ub3.b(this.f, ub3.b(this.e, ub3.b(this.d, ub3.b(this.c, ub3.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharePreviewRenderMetrics(scale=");
        sb.append(this.a);
        sb.append(", renderedWidth=");
        sb.append(this.b);
        sb.append(", renderedHeight=");
        ub3.u(sb, this.c, ", viewportHeight=", this.d, ", layoutHeight=");
        ub3.u(sb, this.e, ", offsetX=", this.f, ", offsetY=");
        return tec.g(this.g, ")", sb);
    }
}
