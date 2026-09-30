package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.MonthlyContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p19 {
    public final v50 a;
    public final List b;
    public final MonthlyContent c;

    static {
        l19 l19Var = MonthlyContent.Companion;
    }

    public p19(v50 v50Var, List list, MonthlyContent monthlyContent) {
        this.a = v50Var;
        this.b = list;
        this.c = monthlyContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p19)) {
            return false;
        }
        p19 p19Var = (p19) obj;
        return this.a == p19Var.a && this.b.equals(p19Var.b) && pa7.t(this.c, p19Var.c);
    }

    public final int hashCode() {
        int iA = tec.a(this.a.hashCode() * 31, 31, this.b);
        MonthlyContent monthlyContent = this.c;
        return iA + (monthlyContent == null ? 0 : monthlyContent.hashCode());
    }

    public final String toString() {
        return "MonthlyFullyInformation(annualStatus=" + this.a + ", cards=" + this.b + ", content=" + this.c + ")";
    }
}
