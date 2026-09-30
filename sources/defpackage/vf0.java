package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vf0 {
    public final rf0 a;
    public final boolean b;
    public final Integer c;

    public vf0(rf0 rf0Var, boolean z, Integer num) {
        rf0Var.getClass();
        this.a = rf0Var;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0)) {
            return false;
        }
        vf0 vf0Var = (vf0) obj;
        return pa7.t(this.a, vf0Var.a) && this.b == vf0Var.b && pa7.t(this.c, vf0Var.c);
    }

    public final int hashCode() {
        int iD = ub3.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AstNodeTraversalEntry(astNode=" + this.a + ", isVisited=" + this.b + ", formatIndex=" + this.c + ")";
    }
}
