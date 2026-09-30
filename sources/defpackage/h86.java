package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h86 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public h86(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h86)) {
            return false;
        }
        h86 h86Var = (h86) obj;
        return this.a == h86Var.a && this.b == h86Var.b && this.c == h86Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ub3.m(ib8.p("GiftCardGuideDebugState(persistedShown=", ", exposureReserved=", ", closed=", this.a, this.b), this.c, ")");
    }
}
