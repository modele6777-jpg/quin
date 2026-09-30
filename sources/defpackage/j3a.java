package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j3a implements h3a {
    public final o07 a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public j3a(o07 o07Var, String str, boolean z, boolean z2) {
        str.getClass();
        this.a = o07Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3a)) {
            return false;
        }
        j3a j3aVar = (j3a) obj;
        return this.a.equals(j3aVar.a) && pa7.t(this.b, j3aVar.b) && this.c == j3aVar.c && this.d == j3aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.d(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "StoreInAppPurchaseResult(detail=" + this.a + ", userId=" + this.b + ", isPending=" + this.c + ", isReconciliation=" + this.d + ")";
    }
}
