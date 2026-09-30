package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s27 {
    public static final s27 d = new s27(null, null, null);
    public final xw9 a;
    public final n26 b;
    public final n26 c;

    public s27(xw9 xw9Var, n26 n26Var, n26 n26Var2) {
        this.a = xw9Var;
        this.b = n26Var;
        this.c = n26Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s27)) {
            return false;
        }
        s27 s27Var = (s27) obj;
        return pa7.t(this.a, s27Var.a) && pa7.t(this.b, s27Var.b) && pa7.t(this.c, s27Var.c);
    }

    public final int hashCode() {
        xw9 xw9Var = this.a;
        int iHashCode = (xw9Var == null ? 0 : xw9Var.hashCode()) * 31;
        n26 n26Var = this.b;
        int iHashCode2 = (iHashCode + (n26Var == null ? 0 : n26Var.hashCode())) * 31;
        n26 n26Var2 = this.c;
        return iHashCode2 + (n26Var2 != null ? n26Var2.hashCode() : 0);
    }

    public final String toString() {
        return "InfoPanelStyle(contentPadding=" + this.a + ", background=" + this.b + ", textStyle=" + this.c + ")";
    }
}
