package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iwa {
    public final n07 a;
    public final n07 b;

    public iwa(n07 n07Var, n07 n07Var2) {
        this.a = n07Var;
        this.b = n07Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa)) {
            return false;
        }
        iwa iwaVar = (iwa) obj;
        return this.a.equals(iwaVar.a) && this.b.equals(iwaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Products(discount=" + this.a + ", product=" + this.b + ")";
    }
}
