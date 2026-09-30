package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d6g {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public d6g(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6g)) {
            return false;
        }
        d6g d6gVar = (d6g) obj;
        return pa7.t(this.a, d6gVar.a) && this.b.equals(d6gVar.b) && this.c.equals(d6gVar.c) && this.d.equals(d6gVar.d) && this.e.equals(d6gVar.e) && this.f == d6gVar.f && this.g.equals(d6gVar.g) && this.h == d6gVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ub3.c(ub3.d(ub3.c(ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("Result(accountId=", this.a, ", date=", this.b, ", cardKey=");
        ub3.v(sbO, this.c, ", cardName=", this.d, ", affirmation=");
        sbO.append(this.e);
        sbO.append(", isReversed=");
        sbO.append(this.f);
        sbO.append(", skinFolder=");
        sbO.append(this.g);
        sbO.append(", skinRequiresDownload=");
        sbO.append(this.h);
        sbO.append(")");
        return sbO.toString();
    }
}
