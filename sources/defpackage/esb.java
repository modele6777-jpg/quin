package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class esb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public esb(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esb)) {
            return false;
        }
        esb esbVar = (esb) obj;
        return this.a == esbVar.a && this.b == esbVar.b && this.c == esbVar.c && this.d == esbVar.d && this.e == esbVar.e && this.f == esbVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ub3.b(this.e, ub3.b(this.d, ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "ReportPreviewPage(titleRes=", ", subtitleRes=", ", descRes=");
        ub3.u(sbN, this.c, ", bodyRes=", this.d, ", illustrationLight=");
        sbN.append(this.e);
        sbN.append(", illustrationDark=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
