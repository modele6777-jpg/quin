package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gd4 implements ed4 {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public gd4(boolean z, boolean z2, List list, String str, String str2, boolean z3, String str3, boolean z4) {
        list.getClass();
        str.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = z3;
        this.g = str3;
        this.h = z4;
    }

    public static gd4 b(gd4 gd4Var, String str, boolean z, String str2, int i) {
        boolean z2 = (i & 1) != 0 ? gd4Var.a : true;
        boolean z3 = (i & 2) != 0 ? gd4Var.b : true;
        List list = (i & 4) != 0 ? gd4Var.c : pu4.a;
        String str3 = gd4Var.e;
        if ((i & 32) != 0) {
            z = gd4Var.f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            str2 = gd4Var.g;
        }
        boolean z5 = gd4Var.h;
        gd4Var.getClass();
        list.getClass();
        str.getClass();
        return new gd4(z2, z3, list, str, str3, z4, str2, z5);
    }

    @Override // defpackage.ed4
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd4)) {
            return false;
        }
        gd4 gd4Var = (gd4) obj;
        return this.a == gd4Var.a && this.b == gd4Var.b && pa7.t(this.c, gd4Var.c) && pa7.t(this.d, gd4Var.d) && pa7.t(this.e, gd4Var.e) && this.f == gd4Var.f && pa7.t(this.g, gd4Var.g) && this.h == gd4Var.h;
    }

    public final int hashCode() {
        int iC = ub3.c(tec.a(ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iD = ub3.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return Boolean.hashCode(this.h) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("WaitConfirm(isCanTarot=", ", isSuitable=", ", editQuestions=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", question=");
        sbP.append(this.d);
        sbP.append(", suggestions=");
        sbP.append(this.e);
        sbP.append(", isAdditionalInfoNeeded=");
        sbP.append(this.f);
        sbP.append(", additionalInfoQuestion=");
        sbP.append(this.g);
        sbP.append(", needsRevision=");
        sbP.append(this.h);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ gd4(String str, int i) {
        this((i & 1) != 0, true, pu4.a, str, null, false, null, false);
    }
}
