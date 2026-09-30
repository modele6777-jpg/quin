package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class und implements wnd {
    public final int a;
    public final TarotSkinIdentify b;

    public und(int i, TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        this.a = i;
        this.b = tarotSkinIdentify;
    }

    @Override // defpackage.wnd
    public final TarotSkinIdentify a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof und)) {
            return false;
        }
        und undVar = (und) obj;
        return this.a == undVar.a && this.b == undVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "AllDecks(deckCount=" + this.a + ", destinationSkin=" + this.b + ", enteredDetailFromMall=true)";
    }
}
