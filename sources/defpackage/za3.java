package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class za3 {
    public final String a;
    public final String b;
    public final String c;

    public za3(String str, String str2, String str3) {
        tec.x(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za3)) {
            return false;
        }
        za3 za3Var = (za3) obj;
        return pa7.t(this.a, za3Var.a) && pa7.t(this.b, za3Var.b) && pa7.t(this.c, za3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ks0.l(ib8.o("DailyShareDateParts(day=", this.a, ", monthYear=", this.b, ", longLabel="), this.c, ")");
    }
}
