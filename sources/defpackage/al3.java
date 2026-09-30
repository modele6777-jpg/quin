package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class al3 {
    public final List a;
    public final int b;
    public final TarotSkinIdentify c;
    public final boolean d;

    public al3(List list, int i, TarotSkinIdentify tarotSkinIdentify, boolean z) {
        list.getClass();
        tarotSkinIdentify.getClass();
        this.a = list;
        this.b = i;
        this.c = tarotSkinIdentify;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al3)) {
            return false;
        }
        al3 al3Var = (al3) obj;
        return pa7.t(this.a, al3Var.a) && this.b == al3Var.b && this.c == al3Var.c && this.d == al3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ub3.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "DeckSelectionUiState(skins=" + this.a + ", initialPageIndex=" + this.b + ", currentSkinId=" + this.c + ", isMixedSelected=" + this.d + ")";
    }

    public /* synthetic */ al3() {
        this(pu4.a, 0, TarotSkinIdentify.Classic, false);
    }
}
