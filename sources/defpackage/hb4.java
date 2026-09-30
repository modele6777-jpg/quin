package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hb4 implements ib4 {
    public final dd4 a;

    public hb4(dd4 dd4Var) {
        dd4Var.getClass();
        this.a = dd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb4) && pa7.t(this.a, ((hb4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Explanation(preState=" + this.a + ")";
    }
}
