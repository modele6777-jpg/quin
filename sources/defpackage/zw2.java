package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zw2 {
    public final String a;
    public final String b;
    public final String c;
    public final iy9 d;
    public final String e;

    public zw2(String str, String str2, String str3, iy9 iy9Var, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iy9Var;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw2)) {
            return false;
        }
        zw2 zw2Var = (zw2) obj;
        return pa7.t(this.a, zw2Var.a) && pa7.t(this.b, zw2Var.b) && pa7.t(this.c, zw2Var.c) && this.d.equals(zw2Var.d) && pa7.t(this.e, zw2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("CpSection(leadingTitle=", this.a, ", highlightTitle=", this.b, ", trailingTitle=");
        sbO.append(this.c);
        sbO.append(", tarotCards=");
        sbO.append(this.d);
        sbO.append(", desc=");
        return ks0.l(sbO, this.e, ")");
    }
}
