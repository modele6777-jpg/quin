package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b16 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public b16(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b16)) {
            return false;
        }
        b16 b16Var = (b16) obj;
        return pa7.t(this.a, b16Var.a) && pa7.t(this.b, b16Var.b) && pa7.t(this.c, b16Var.c) && pa7.t(this.d, b16Var.d) && pa7.t(this.e, b16Var.e) && pa7.t(this.f, b16Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ub3.c(ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("FriendCouponShareLabels(title=", this.a, ", copy=", this.b, ", weChat=");
        ub3.v(sbO, this.c, ", moments=", this.d, ", system=");
        return ks0.m(sbO, this.e, ", cancel=", this.f, ")");
    }
}
