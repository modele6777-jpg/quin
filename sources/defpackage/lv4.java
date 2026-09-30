package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lv4 {
    public final bv6 a;
    public final boolean b;
    public final zb3 c;
    public final String d;

    public lv4(bv6 bv6Var, boolean z, zb3 zb3Var, String str) {
        this.a = bv6Var;
        this.b = z;
        this.c = zb3Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv4)) {
            return false;
        }
        lv4 lv4Var = (lv4) obj;
        return pa7.t(this.a, lv4Var.a) && this.b == lv4Var.b && this.c == lv4Var.c && pa7.t(this.d, lv4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ub3.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
