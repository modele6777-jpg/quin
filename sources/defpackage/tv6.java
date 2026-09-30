package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tv6 implements nc5 {
    public final bv6 a;
    public final boolean b;
    public final zb3 c;

    public tv6(bv6 bv6Var, boolean z, zb3 zb3Var) {
        this.a = bv6Var;
        this.b = z;
        this.c = zb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv6)) {
            return false;
        }
        tv6 tv6Var = (tv6) obj;
        return this.a.equals(tv6Var.a) && this.b == tv6Var.b && this.c == tv6Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
