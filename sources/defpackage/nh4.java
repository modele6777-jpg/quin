package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nh4 extends oh4 {
    public final m40 b;
    public final ArrayList c;
    public final ArrayList d;
    public final String e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh4(m40 m40Var, ArrayList arrayList, ArrayList arrayList2, String str, boolean z) {
        super(m40Var);
        str.getClass();
        this.b = m40Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = str;
        this.f = z;
    }

    @Override // defpackage.oh4
    public final m40 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh4)) {
            return false;
        }
        nh4 nh4Var = (nh4) obj;
        return this.b == nh4Var.b && this.c.equals(nh4Var.c) && this.d.equals(nh4Var.d) && pa7.t(this.e, nh4Var.e) && this.f == nh4Var.f;
    }

    public final int hashCode() {
        m40 m40Var = this.b;
        return Boolean.hashCode(this.f) + ub3.c((this.d.hashCode() + ((this.c.hashCode() + ((m40Var == null ? 0 : m40Var.hashCode()) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(completedStatus=");
        sb.append(this.b);
        sb.append(", cards=");
        sb.append(this.c);
        sb.append(", domainScores=");
        sb.append(this.d);
        sb.append(", summary=");
        sb.append(this.e);
        sb.append(", isStudent=");
        return ub3.m(sb, this.f, ")");
    }
}
