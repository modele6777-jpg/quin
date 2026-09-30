package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c16 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public c16(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
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
        if (!(obj instanceof c16)) {
            return false;
        }
        c16 c16Var = (c16) obj;
        return pa7.t(this.a, c16Var.a) && this.b.equals(c16Var.b) && this.c.equals(c16Var.c) && this.d.equals(c16Var.d) && this.e.equals(c16Var.e) && this.f.equals(c16Var.f);
    }

    public final int hashCode() {
        return ub3.c(ub3.c(ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("FriendCouponSharePayload(shareUrl=", this.a, ", weChatTitle=", this.b, ", linkTitle=");
        ub3.v(sbO, this.c, ", description=", this.d, ", systemSummary=");
        return ks0.m(sbO, this.e, ", copyText=", this.f, ", thumbnailUrl=)");
    }
}
