package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k40 extends l40 {
    public final ArrayList a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final fj8 e;

    public k40(ArrayList arrayList, ArrayList arrayList2, String str, String str2, fj8 fj8Var) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = str;
        this.d = str2;
        this.e = fj8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        return this.a.equals(k40Var.a) && this.b.equals(k40Var.b) && pa7.t(this.c, k40Var.c) && pa7.t(this.d, k40Var.d) && this.e == k40Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fj8 fj8Var = this.e;
        return iHashCode3 + (fj8Var != null ? fj8Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(monthlyCards=");
        sb.append(this.a);
        sb.append(", domainCards=");
        sb.append(this.b);
        sb.append(", annualSummaryHighlight=");
        ub3.v(sb, this.c, ", annualSummary=", this.d, ", luckItem=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
