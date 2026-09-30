package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q92 implements j09 {
    public final j09 a;
    public final j09 b;

    public q92(j09 j09Var, j09 j09Var2) {
        this.a = j09Var;
        this.b = j09Var2;
    }

    @Override // defpackage.j09
    public final Object c(l26 l26Var, Object obj) {
        return this.b.c(l26Var, this.a.c(l26Var, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q92)) {
            return false;
        }
        q92 q92Var = (q92) obj;
        return this.a.equals(q92Var.a) && pa7.t(this.b, q92Var.b);
    }

    @Override // defpackage.j09
    public final boolean g(a26 a26Var) {
        return this.a.g(a26Var) && this.b.g(a26Var);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) c(new ym0(4), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
