package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z63 {
    public final String a;
    public final qhe b;
    public final String c;
    public final String d;
    public final String e;
    public final TarotSkinIdentify f;

    public z63(String str, qhe qheVar, String str2, String str3, String str4, TarotSkinIdentify tarotSkinIdentify) {
        str.getClass();
        this.a = str;
        this.b = qheVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = tarotSkinIdentify;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z63)) {
            return false;
        }
        z63 z63Var = (z63) obj;
        return pa7.t(this.a, z63Var.a) && this.b.equals(z63Var.b) && this.c.equals(z63Var.c) && this.d.equals(z63Var.d) && this.e.equals(z63Var.e) && this.f == z63Var.f;
    }

    public final int hashCode() {
        int iC = ub3.c(ub3.c(ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        TarotSkinIdentify tarotSkinIdentify = this.f;
        return iC + (tarotSkinIdentify == null ? 0 : tarotSkinIdentify.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyCardWrap(date=");
        sb.append(this.a);
        sb.append(", tarotCard=");
        sb.append(this.b);
        sb.append(", cardDescription=");
        ub3.v(sb, this.c, ", affirmation=", this.d, ", reading=");
        sb.append(this.e);
        sb.append(", skin=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
