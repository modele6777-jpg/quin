package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 {
    public final TarotCardType a;
    public final TarotSkinIdentify b;
    public final int c;
    public final boolean d;
    public final x16 e;
    public final boolean f;

    public nu1(TarotCardType tarotCardType, TarotSkinIdentify tarotSkinIdentify, int i, boolean z, x16 x16Var, boolean z2) {
        tarotCardType.getClass();
        tarotSkinIdentify.getClass();
        this.a = tarotCardType;
        this.b = tarotSkinIdentify;
        this.c = i;
        this.d = z;
        this.e = x16Var;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu1)) {
            return false;
        }
        nu1 nu1Var = (nu1) obj;
        return this.a == nu1Var.a && this.b == nu1Var.b && this.c == nu1Var.c && this.d == nu1Var.d && pa7.t(this.e, nu1Var.e) && this.f == nu1Var.f;
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
        x16 x16Var = this.e;
        return Boolean.hashCode(this.f) + ((iD + (x16Var == null ? 0 : x16Var.hashCode())) * 31);
    }

    public final String toString() {
        return "CardZoomRequest(cardType=" + this.a + ", skin=" + this.b + ", sourceThemeColorArgb=" + this.c + ", showDetailHint=" + this.d + ", onShowDetail=" + this.e + ", isMixedDeck=" + this.f + ")";
    }
}
