package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s4g implements u4g {
    public final TarotSkinIdentify a;
    public final String b;

    public s4g(TarotSkinIdentify tarotSkinIdentify, String str) {
        tarotSkinIdentify.getClass();
        this.a = tarotSkinIdentify;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4g)) {
            return false;
        }
        s4g s4gVar = (s4g) obj;
        return this.a == s4gVar.a && this.b.equals(s4gVar.b);
    }

    @Override // defpackage.u4g
    public final r4g g() {
        return r4g.QuickDecision;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QuickDecision(skin=" + this.a + ", scenario=" + this.b + ")";
    }
}
