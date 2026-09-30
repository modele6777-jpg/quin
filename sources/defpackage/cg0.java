package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg0 extends df0 {
    public final boolean l;
    public final dg0 m;

    public cg0(boolean z, dg0 dg0Var) {
        this.l = z;
        this.m = dg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg0)) {
            return false;
        }
        cg0 cg0Var = (cg0) obj;
        return this.l == cg0Var.l && this.m == cg0Var.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + (Boolean.hashCode(this.l) * 31);
    }

    public final String toString() {
        return "AstTableCell(header=" + this.l + ", alignment=" + this.m + ")";
    }
}
