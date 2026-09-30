package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TarotSkinIdentify b;

    public /* synthetic */ ri3(int i, TarotSkinIdentify tarotSkinIdentify) {
        this.a = i;
        this.b = tarotSkinIdentify;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        TarotSkinIdentify tarotSkinIdentify = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                kv2.y(l1fVar, "btn", "playcard_explore", "pathway", "box_view");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                l1fVar.a("0", "locked");
                break;
            case 1:
                kv2.y(l1fVar, "btn", "playcard_unlock", "pathway", "box_view");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                l1fVar.a("1", "locked");
                break;
            case 2:
                kv2.y(l1fVar, "btn", "playcard_download", "pathway", "box_view");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                l1fVar.a("0", "locked");
                break;
            case 3:
                kv2.y(l1fVar, "btn", "playcard_explore", "pathway", "my_tarot_deck");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                break;
            case 4:
                kv2.y(l1fVar, "btn", "playcard_download", "pathway", "my_tarot_deck");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                break;
            case 5:
                kv2.y(l1fVar, "btn", "playcard_unlock", "pathway", "my_tarot_deck");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                break;
            case 6:
                l1fVar.a("use_deck_reading", "btn");
                l1fVar.a(hfc.h(tarotSkinIdentify).b(), "product_id");
                break;
            case 7:
                l1fVar.getClass();
                l1fVar.a("skin_download_continue", "btn");
                l1fVar.a(tarotSkinIdentify.getFolder(), "skin");
                break;
            case 8:
                l1fVar.getClass();
                l1fVar.a("skin_download_now", "btn");
                l1fVar.a(tarotSkinIdentify.getFolder(), "skin");
                break;
            case 9:
                l1fVar.getClass();
                l1fVar.a("skin_download_retry", "btn");
                l1fVar.a(tarotSkinIdentify.getFolder(), "skin");
                break;
            default:
                l1fVar.a("skin_download_required", "popup");
                l1fVar.a(tarotSkinIdentify.getFolder(), "skin");
                break;
        }
        return wefVar;
    }
}
