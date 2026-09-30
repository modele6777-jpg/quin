package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g57 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public g57(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g57)) {
            return false;
        }
        g57 g57Var = (g57) obj;
        return this.a == g57Var.a && this.b == g57Var.b && this.c == g57Var.c && this.d == g57Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "InsetsValues(left=", ", top=", ", right=");
        sbN.append(this.c);
        sbN.append(", bottom=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
