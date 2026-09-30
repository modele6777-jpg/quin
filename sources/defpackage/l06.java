package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l06 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public l06(String str, String str2, int i, int i2, int i3, int i4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l06)) {
            return false;
        }
        l06 l06Var = (l06) obj;
        return pa7.t(this.a, l06Var.a) && pa7.t(this.b, l06Var.b) && this.c == l06Var.c && this.d == l06Var.d && this.e == l06Var.e && this.f == l06Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ub3.b(this.e, ub3.b(this.d, ub3.b(this.c, ub3.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("FriendCouponInfo(code=", this.a, ", shareUrl=", this.b, ", remaining=");
        ub3.u(sbO, this.c, ", totalGranted=", this.d, ", creditsPerPass=");
        sbO.append(this.e);
        sbO.append(", validDays=");
        sbO.append(this.f);
        sbO.append(")");
        return sbO.toString();
    }
}
