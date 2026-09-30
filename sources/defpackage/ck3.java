package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ck3 {
    public final TarotSkinIdentify a;
    public final TarotSkinIdentify b;
    public final hw8 c;
    public final boolean d;

    public ck3(TarotSkinIdentify tarotSkinIdentify, TarotSkinIdentify tarotSkinIdentify2, hw8 hw8Var, boolean z) {
        this.a = tarotSkinIdentify;
        this.b = tarotSkinIdentify2;
        this.c = hw8Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck3)) {
            return false;
        }
        ck3 ck3Var = (ck3) obj;
        return this.a == ck3Var.a && this.b == ck3Var.b && pa7.t(this.c, ck3Var.c) && this.d == ck3Var.d;
    }

    public final int hashCode() {
        TarotSkinIdentify tarotSkinIdentify = this.a;
        int iHashCode = (tarotSkinIdentify == null ? 0 : tarotSkinIdentify.hashCode()) * 31;
        TarotSkinIdentify tarotSkinIdentify2 = this.b;
        int iHashCode2 = (iHashCode + (tarotSkinIdentify2 == null ? 0 : tarotSkinIdentify2.hashCode())) * 31;
        hw8 hw8Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (hw8Var != null ? hw8Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DeckSelectionInputs(selectedSkinId=" + this.a + ", pendingStoreSkinId=" + this.b + ", mixedAvailability=" + this.c + ", mixedSelected=" + this.d + ")";
    }
}
