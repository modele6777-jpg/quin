package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 {
    public final qp0 a;
    public final qp0 b;

    public qo0(qp0 qp0Var, qp0 qp0Var2) {
        this.a = qp0Var;
        this.b = qp0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qo0)) {
            return false;
        }
        qo0 qo0Var = (qo0) obj;
        return this.a.equals(qo0Var.a) && this.b.equals(qo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
