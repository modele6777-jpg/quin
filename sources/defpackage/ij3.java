package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TarotSkinIdentify b;
    public final /* synthetic */ TarotSkinIdentify c;

    public /* synthetic */ ij3(TarotSkinIdentify tarotSkinIdentify, TarotSkinIdentify tarotSkinIdentify2, int i) {
        this.a = i;
        this.b = tarotSkinIdentify;
        this.c = tarotSkinIdentify2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        TarotSkinIdentify tarotSkinIdentify = this.c;
        TarotSkinIdentify tarotSkinIdentify2 = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                kv2.y(l1fVar, "btn", "divination_deck_set", "pathway", "playcard_select_deck");
                l1fVar.a(urg.r(tarotSkinIdentify2), "deck_id");
                l1fVar.a(urg.r(tarotSkinIdentify), "previous_deck_id");
                break;
            default:
                l1fVar.getClass();
                l1fVar.a("skin_use_default", "btn");
                l1fVar.a(tarotSkinIdentify2.getFolder(), "original_skin");
                l1fVar.a(tarotSkinIdentify.getFolder(), "default_skin");
                break;
        }
        return wefVar;
    }
}
