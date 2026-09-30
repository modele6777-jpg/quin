package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gh {
    public final n07 a;
    public final n07 b;

    public gh(n07 n07Var, n07 n07Var2) {
        this.a = n07Var;
        this.b = n07Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return pa7.t(this.a, ghVar.a) && pa7.t(this.b, ghVar.b);
    }

    public final int hashCode() {
        n07 n07Var = this.a;
        int iHashCode = (n07Var == null ? 0 : n07Var.hashCode()) * 31;
        n07 n07Var2 = this.b;
        return iHashCode + (n07Var2 != null ? n07Var2.hashCode() : 0);
    }

    public final String toString() {
        return "AddonUiState(firstProduct=" + this.a + ", secondProduct=" + this.b + ")";
    }
}
