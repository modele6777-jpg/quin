package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g22 {
    public final j22 a;
    public final a22 b;

    public g22(j22 j22Var, a22 a22Var) {
        j22Var.getClass();
        this.a = j22Var;
        this.b = a22Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g22) {
            return pa7.t(this.a, ((g22) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
