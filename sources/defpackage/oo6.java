package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oo6 {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final TarotSkinIdentify d;
    public final boolean e;

    public oo6(boolean z, boolean z2, List list, TarotSkinIdentify tarotSkinIdentify, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = tarotSkinIdentify;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo6)) {
            return false;
        }
        oo6 oo6Var = (oo6) obj;
        return this.a == oo6Var.a && this.b == oo6Var.b && pa7.t(this.c, oo6Var.c) && this.d == oo6Var.d && this.e == oo6Var.e;
    }

    public final int hashCode() {
        int iA = tec.a(ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        TarotSkinIdentify tarotSkinIdentify = this.d;
        return Boolean.hashCode(this.e) + ((iA + (tarotSkinIdentify == null ? 0 : tarotSkinIdentify.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("HomeUiState(isLoaded=", ", hasVisitedGuide=", ", supportedScenes=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", currentSkin=");
        sbP.append(this.d);
        sbP.append(", isShowFourSeasons=");
        return ub3.m(sbP, this.e, ")");
    }

    public /* synthetic */ oo6() {
        this(false, true, pu4.a, null, false);
    }
}
