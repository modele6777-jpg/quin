package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q19 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public q19(String str, String str2, String str3, List list, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q19)) {
            return false;
        }
        q19 q19Var = (q19) obj;
        return pa7.t(this.a, q19Var.a) && pa7.t(this.b, q19Var.b) && pa7.t(this.c, q19Var.c) && pa7.t(this.d, q19Var.d) && pa7.t(this.e, q19Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("MonthlyPopupInfo(backgroundUrl=", this.a, ", iconUrl=", this.b, ", title=");
        ub3.v(sbO, this.c, ", desc=", this.d, ", popupActions=");
        return ks0.n(sbO, this.e, ")");
    }
}
