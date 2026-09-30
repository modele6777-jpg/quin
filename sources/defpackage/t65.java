package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t65 {
    public final TarotSkinIdentify a;
    public final ArcanaGroup b;
    public final int c;
    public final List d;
    public final Map e;
    public final TarotSkinIdentify f;

    public t65(TarotSkinIdentify tarotSkinIdentify, ArcanaGroup arcanaGroup, int i, List list, Map map, TarotSkinIdentify tarotSkinIdentify2) {
        arcanaGroup.getClass();
        list.getClass();
        map.getClass();
        this.a = tarotSkinIdentify;
        this.b = arcanaGroup;
        this.c = i;
        this.d = list;
        this.e = map;
        this.f = tarotSkinIdentify2;
    }

    public static t65 a(t65 t65Var, TarotSkinIdentify tarotSkinIdentify, ArcanaGroup arcanaGroup, int i, List list, Map map, TarotSkinIdentify tarotSkinIdentify2, int i2) {
        if ((i2 & 1) != 0) {
            tarotSkinIdentify = t65Var.a;
        }
        TarotSkinIdentify tarotSkinIdentify3 = tarotSkinIdentify;
        if ((i2 & 2) != 0) {
            arcanaGroup = t65Var.b;
        }
        ArcanaGroup arcanaGroup2 = arcanaGroup;
        if ((i2 & 4) != 0) {
            i = t65Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = t65Var.d;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            map = t65Var.e;
        }
        Map map2 = map;
        if ((i2 & 32) != 0) {
            tarotSkinIdentify2 = t65Var.f;
        }
        t65Var.getClass();
        arcanaGroup2.getClass();
        list2.getClass();
        map2.getClass();
        return new t65(tarotSkinIdentify3, arcanaGroup2, i3, list2, map2, tarotSkinIdentify2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t65)) {
            return false;
        }
        t65 t65Var = (t65) obj;
        return this.a == t65Var.a && this.b == t65Var.b && this.c == t65Var.c && pa7.t(this.d, t65Var.d) && pa7.t(this.e, t65Var.e) && this.f == t65Var.f;
    }

    public final int hashCode() {
        int iC = ib8.c(this.e, tec.a(ub3.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
        TarotSkinIdentify tarotSkinIdentify = this.f;
        return iC + (tarotSkinIdentify == null ? 0 : tarotSkinIdentify.hashCode());
    }

    public final String toString() {
        return "ExploreTarotState(skin=" + this.a + ", arcana=" + this.b + ", currentIndex=" + this.c + ", ownedSkins=" + this.d + ", downloadStates=" + this.e + ", usingSkin=" + this.f + ")";
    }
}
