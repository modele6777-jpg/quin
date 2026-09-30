package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.DomainContent;
import tech.chatmind.api.annual.model.MonthlyContent;
import tech.chatmind.api.annual.model.UserPostContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f30 {
    public final UserPostContent a;
    public final List b;
    public final List c;
    public final v50 d;
    public final MonthlyContent e;
    public final DomainContent f;
    public final String g;
    public final String h;
    public final String i;

    static {
        mg4 mg4Var = DomainContent.Companion;
        l19 l19Var = MonthlyContent.Companion;
    }

    public f30(UserPostContent userPostContent, List list, List list2, v50 v50Var, MonthlyContent monthlyContent, DomainContent domainContent, String str, String str2, String str3) {
        this.a = userPostContent;
        this.b = list;
        this.c = list2;
        this.d = v50Var;
        this.e = monthlyContent;
        this.f = domainContent;
        this.g = str;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return pa7.t(this.a, f30Var.a) && this.b.equals(f30Var.b) && this.c.equals(f30Var.c) && this.d == f30Var.d && pa7.t(this.e, f30Var.e) && pa7.t(this.f, f30Var.f) && pa7.t(this.g, f30Var.g) && pa7.t(this.h, f30Var.h) && pa7.t(this.i, f30Var.i);
    }

    public final int hashCode() {
        UserPostContent userPostContent = this.a;
        int iHashCode = (this.d.hashCode() + tec.a(tec.a((userPostContent == null ? 0 : userPostContent.hashCode()) * 31, 31, this.b), 31, this.c)) * 31;
        MonthlyContent monthlyContent = this.e;
        int iHashCode2 = (iHashCode + (monthlyContent == null ? 0 : monthlyContent.hashCode())) * 31;
        DomainContent domainContent = this.f;
        int iHashCode3 = (iHashCode2 + (domainContent == null ? 0 : domainContent.hashCode())) * 31;
        String str = this.g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnnualLuckFullyInformation(user=");
        sb.append(this.a);
        sb.append(", domainsCards=");
        sb.append(this.b);
        sb.append(", monthlyCards=");
        sb.append(this.c);
        sb.append(", annualStatus=");
        sb.append(this.d);
        sb.append(", monthlyContent=");
        sb.append(this.e);
        sb.append(", domainContent=");
        sb.append(this.f);
        sb.append(", annualSummaryHighlight=");
        ub3.v(sb, this.g, ", annualSummary=", this.h, ", annualLuckItem=");
        return ks0.l(sb, this.i, ")");
    }
}
