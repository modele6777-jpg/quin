package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ln2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ln2(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ln2)) {
            return false;
        }
        ln2 ln2Var = (ln2) obj;
        long j = ln2Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, ln2Var.b) && faf.a(this.c, ln2Var.c) && faf.a(this.d, ln2Var.d) && faf.a(this.e, ln2Var.e);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.e) + ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strH = y72.h(this.a);
        String strH2 = y72.h(this.b);
        String strH3 = y72.h(this.c);
        String strH4 = y72.h(this.d);
        String strH5 = y72.h(this.e);
        StringBuilder sbO = ib8.o("ContextMenuColors(backgroundColor=", strH, ", textColor=", strH2, ", iconColor=");
        ub3.v(sbO, strH3, ", disabledTextColor=", strH4, ", disabledIconColor=");
        return ks0.l(sbO, strH5, ")");
    }
}
