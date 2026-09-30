package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ft8 implements ot8, mh6 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    public ft8(String str, List list, String str2, String str3) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft8)) {
            return false;
        }
        ft8 ft8Var = (ft8) obj;
        return pa7.t(this.a, ft8Var.a) && pa7.t(this.b, ft8Var.b) && pa7.t(this.c, ft8Var.c) && pa7.t(this.d, ft8Var.d);
    }

    @Override // defpackage.mh6
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iC = ub3.c(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClarifyingCardDraw(id=");
        sb.append(this.a);
        sb.append(", cards=");
        sb.append(this.b);
        sb.append(", requestMessageId=");
        return ks0.m(sb, this.c, ", interpretationMessageId=", this.d, ")");
    }
}
