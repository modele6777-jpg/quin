package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r33 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public r33(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        str7.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r33)) {
            return false;
        }
        r33 r33Var = (r33) obj;
        return pa7.t(this.a, r33Var.a) && pa7.t(this.b, r33Var.b) && this.c == r33Var.c && pa7.t(this.d, r33Var.d) && pa7.t(this.e, r33Var.e) && pa7.t(this.f, r33Var.f) && pa7.t(this.g, r33Var.g) && pa7.t(this.h, r33Var.h);
    }

    public final int hashCode() {
        int iC = ub3.c(ub3.b(this.c, ub3.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iC2 = ub3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return this.h.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("DailyCardInformation(date=", this.a, ", description=", this.b, ", direction=");
        sbO.append(this.c);
        sbO.append(", key=");
        sbO.append(this.d);
        sbO.append(", question=");
        ub3.v(sbO, this.e, ", reading=", this.f, ", tagType=");
        return ks0.m(sbO, this.g, ", title=", this.h, ")");
    }
}
