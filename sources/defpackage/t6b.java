package defpackage;

import ai.askquin.data.quickdecision.QuickDecisionAnswer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t6b implements u6b {
    public final String a;
    public final boolean b;
    public final QuickDecisionAnswer c;
    public final String d;
    public final String e;

    public t6b(String str, boolean z, QuickDecisionAnswer quickDecisionAnswer, String str2, String str3) {
        str.getClass();
        quickDecisionAnswer.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = z;
        this.c = quickDecisionAnswer;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6b)) {
            return false;
        }
        t6b t6bVar = (t6b) obj;
        return pa7.t(this.a, t6bVar.a) && this.b == t6bVar.b && this.c == t6bVar.c && pa7.t(this.d, t6bVar.d) && pa7.t(this.e, t6bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ub3.c((this.c.hashCode() + ub3.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(cardKey=");
        sb.append(this.a);
        sb.append(", isReversed=");
        sb.append(this.b);
        sb.append(", answer=");
        sb.append(this.c);
        sb.append(", tagline=");
        sb.append(this.d);
        sb.append(", reading=");
        return ks0.l(sb, this.e, ")");
    }
}
