package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uf0 {
    public rf0 a;
    public rf0 b;
    public rf0 c;
    public rf0 d;
    public rf0 e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof uf0)) {
            return false;
        }
        uf0 uf0Var = (uf0) obj;
        return this.a == uf0Var.a && this.b == uf0Var.b && this.c == uf0Var.c && this.d == uf0Var.d && this.e == uf0Var.e;
    }

    public final int hashCode() {
        Object obj = 0;
        Object obj2 = this.b;
        if (obj2 == null) {
            obj2 = obj;
        }
        int iHashCode = obj2.hashCode() * 11;
        rf0 rf0Var = this.e;
        return ((rf0Var != null ? rf0Var : 0).hashCode() * 7) + iHashCode;
    }
}
