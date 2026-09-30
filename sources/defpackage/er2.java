package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class er2 implements ir2 {
    public final ec4 a;
    public final wj5 b;

    public er2(ec4 ec4Var, wj5 wj5Var) {
        wj5Var.getClass();
        this.a = ec4Var;
        this.b = wj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er2)) {
            return false;
        }
        er2 er2Var = (er2) obj;
        return this.a.equals(er2Var.a) && pa7.t(this.b, er2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExistingDivination(item=" + this.a + ", content=" + this.b + ")";
    }
}
