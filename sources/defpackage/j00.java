package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j00 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public j00(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        j37.a("Reversed range is not supported");
    }

    public static j00 a(j00 j00Var, g00 g00Var, int i, int i2, int i3) {
        Object obj = g00Var;
        if ((i3 & 1) != 0) {
            obj = j00Var.a;
        }
        if ((i3 & 2) != 0) {
            i = j00Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = j00Var.c;
        }
        return new j00(obj, i, i2, j00Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return pa7.t(this.a, j00Var.a) && this.b == j00Var.b && this.c == j00Var.c && pa7.t(this.d, j00Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + ub3.b(this.c, ub3.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public j00(Object obj, int i, int i2) {
        this(obj, i, i2, "");
    }
}
