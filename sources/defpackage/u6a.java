package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u6a {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public u6a(String str, String str2, boolean z, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6a)) {
            return false;
        }
        u6a u6aVar = (u6a) obj;
        return this.a.equals(u6aVar.a) && this.b.equals(u6aVar.b) && this.c.equals(u6aVar.c) && this.d == u6aVar.d && pa7.t(this.e, u6aVar.e);
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("Attribution(scope=", this.a, ", productId=", this.b, ", storeProductId=");
        sbO.append(this.c);
        sbO.append(", completed=");
        sbO.append(this.d);
        sbO.append(", currencyCode=");
        return ks0.l(sbO, this.e, ")");
    }
}
