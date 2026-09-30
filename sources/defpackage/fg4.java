package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fg4 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fg4(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg4)) {
            return false;
        }
        fg4 fg4Var = (fg4) obj;
        return this.a == fg4Var.a && this.b == fg4Var.b && this.c == fg4Var.c && this.d == fg4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "DocumentPadding(start=", ", top=", ", end=");
        sbN.append(this.c);
        sbN.append(", bottom=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
