package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vv1 {
    public final yi a;
    public final a26 b;
    public final ze5 c;
    public final boolean d;

    public vv1(yi yiVar, a26 a26Var, ze5 ze5Var, boolean z) {
        this.a = yiVar;
        this.b = a26Var;
        this.c = ze5Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv1)) {
            return false;
        }
        vv1 vv1Var = (vv1) obj;
        return pa7.t(this.a, vv1Var.a) && pa7.t(this.b, vv1Var.b) && pa7.t(this.c, vv1Var.c) && this.d == vv1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
