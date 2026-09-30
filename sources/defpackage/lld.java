package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lld {
    public final List a;
    public final int b;
    public final TarotSkinIdentify c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ lld(List list, int i, TarotSkinIdentify tarotSkinIdentify, int i2) {
        this(list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : tarotSkinIdentify, false, true);
    }

    public static lld a(lld lldVar, ArrayList arrayList, int i, TarotSkinIdentify tarotSkinIdentify, boolean z, boolean z2, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = lldVar.a;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            i = lldVar.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            tarotSkinIdentify = lldVar.c;
        }
        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
        if ((i2 & 8) != 0) {
            z = lldVar.d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = lldVar.e;
        }
        lldVar.getClass();
        list2.getClass();
        return new lld(list2, i3, tarotSkinIdentify2, z3, z2);
    }

    public final TarotSkinIdentify b() {
        cod codVar = (cod) s72.y0(this.b, this.a);
        if (codVar != null) {
            return codVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lld)) {
            return false;
        }
        lld lldVar = (lld) obj;
        return pa7.t(this.a, lldVar.a) && this.b == lldVar.b && this.c == lldVar.c && this.d == lldVar.d && this.e == lldVar.e;
    }

    public final int hashCode() {
        int iB = ub3.b(this.b, this.a.hashCode() * 31, 31);
        TarotSkinIdentify tarotSkinIdentify = this.c;
        return Boolean.hashCode(this.e) + ub3.d((iB + (tarotSkinIdentify == null ? 0 : tarotSkinIdentify.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkinBrowsingState(availableSkins=");
        sb.append(this.a);
        sb.append(", selectedSkinIndex=");
        sb.append(this.b);
        sb.append(", originalSkin=");
        sb.append(this.c);
        sb.append(", isCommitting=");
        sb.append(this.d);
        sb.append(", isExpanded=");
        return ub3.m(sb, this.e, ")");
    }

    public lld(List list, int i, TarotSkinIdentify tarotSkinIdentify, boolean z, boolean z2) {
        this.a = list;
        this.b = i;
        this.c = tarotSkinIdentify;
        this.d = z;
        this.e = z2;
    }
}
