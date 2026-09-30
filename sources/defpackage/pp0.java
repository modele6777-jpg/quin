package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pp0 extends nd9 {
    public final md9 a;
    public final ld9 b;

    public pp0(md9 md9Var, ld9 ld9Var) {
        this.a = md9Var;
        this.b = ld9Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nd9) {
            nd9 nd9Var = (nd9) obj;
            md9 md9Var = this.a;
            if (md9Var != null ? md9Var.equals(((pp0) nd9Var).a) : ((pp0) nd9Var).a == null) {
                ld9 ld9Var = this.b;
                if (ld9Var != null ? ld9Var.equals(((pp0) nd9Var).b) : ((pp0) nd9Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        md9 md9Var = this.a;
        int iHashCode = ((md9Var == null ? 0 : md9Var.hashCode()) ^ 1000003) * 1000003;
        ld9 ld9Var = this.b;
        return iHashCode ^ (ld9Var != null ? ld9Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
