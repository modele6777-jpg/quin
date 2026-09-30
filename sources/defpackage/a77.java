package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a77 {
    public static final a77 e = new a77(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public a77(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a77)) {
            return false;
        }
        a77 a77Var = (a77) obj;
        return this.a == a77Var.a && this.b == a77Var.b && this.c == a77Var.c && this.d == a77Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ub3.b(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "IntRect.fromLTRB(", ", ", ", ");
        sbN.append(this.c);
        sbN.append(", ");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
