package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class li6 {
    public static final li6 d = new li6(y72.k, 3, null);
    public static final int e = 3;
    public final long a;
    public final int b;
    public final b41 c;

    public li6(long j, int i, b41 b41Var) {
        this.a = j;
        this.b = i;
        this.c = b41Var;
    }

    public final boolean a() {
        return (this.a == 16 && this.c == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li6)) {
            return false;
        }
        li6 li6Var = (li6) obj;
        long j = li6Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && this.b == li6Var.b && pa7.t(this.c, li6Var.c);
    }

    public final int hashCode() {
        int i = y72.l;
        int iB = ub3.b(this.b, Long.hashCode(this.a) * 31, 31);
        b41 b41Var = this.c;
        return iB + (b41Var == null ? 0 : b41Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("HazeTint(color=", y72.h(this.a), ", blendMode=", kn2.Z(this.b), ", brush=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }

    public li6(long j) {
        this(j, e, null);
    }
}
