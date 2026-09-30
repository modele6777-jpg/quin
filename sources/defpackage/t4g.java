package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t4g implements u4g {
    public final qhe a;
    public final TarotSkinIdentify b;
    public final String c;
    public final String d;

    public t4g(qhe qheVar, TarotSkinIdentify tarotSkinIdentify, String str, String str2) {
        tarotSkinIdentify.getClass();
        str.getClass();
        this.a = qheVar;
        this.b = tarotSkinIdentify;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4g)) {
            return false;
        }
        t4g t4gVar = (t4g) obj;
        return this.a.equals(t4gVar.a) && this.b == t4gVar.b && pa7.t(this.c, t4gVar.c) && this.d.equals(t4gVar.d);
    }

    @Override // defpackage.u4g
    public final r4g g() {
        return r4g.TodayFortune;
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TodayFortune(card=");
        sb.append(this.a);
        sb.append(", skin=");
        sb.append(this.b);
        sb.append(", cardName=");
        return ks0.m(sb, this.c, ", affirmation=", this.d, ")");
    }
}
