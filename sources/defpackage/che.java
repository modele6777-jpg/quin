package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class che extends gbe implements l26 {
    final /* synthetic */ bhe $cache;
    final /* synthetic */ List<TarotSkinIdentify> $decks;
    final /* synthetic */ Set<TarotSkinIdentify> $lockedSkins;
    final /* synthetic */ TarotSkinIdentify $prioritySkin;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public che(Set set, bhe bheVar, List list, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.$lockedSkins = set;
        this.$cache = bheVar;
        this.$decks = list;
        this.$prioritySkin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new che(this.$lockedSkins, this.$cache, this.$decks, this.$prioritySkin, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Set<TarotSkinIdentify> set = this.$lockedSkins;
        wef wefVar = wef.a;
        if (set == null) {
            return wefVar;
        }
        bhe bheVar = this.$cache;
        List<TarotSkinIdentify> list = this.$decks;
        TarotSkinIdentify tarotSkinIdentify = this.$prioritySkin;
        list.getClass();
        tarotSkinIdentify.getClass();
        List<TarotSkinIdentify> listC1 = s72.c1(m7c.c(list, tarotSkinIdentify), 3);
        Set<TarotSkinIdentify> set2 = this.$lockedSkins;
        ArrayList arrayList = new ArrayList(t72.u(listC1, 10));
        for (TarotSkinIdentify tarotSkinIdentify2 : listC1) {
            arrayList.add(new mhe(tarotSkinIdentify2, set2.contains(tarotSkinIdentify2)));
        }
        bheVar.c(arrayList);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        che cheVar = (che) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        cheVar.r(wefVar);
        return wefVar;
    }
}
