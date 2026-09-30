package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.k;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import java.util.LinkedHashMap;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uu9 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp5 b;
    public final /* synthetic */ r0 c;
    public final /* synthetic */ MixedDeckSnapshot d;
    public final /* synthetic */ TarotSkinIdentify e;
    public final /* synthetic */ shb f;
    public final /* synthetic */ tt1 g;
    public final /* synthetic */ LinkedHashMap v;
    public final /* synthetic */ String w;
    public final /* synthetic */ tr2 x;

    public /* synthetic */ uu9(pp5 pp5Var, r0 r0Var, MixedDeckSnapshot mixedDeckSnapshot, TarotSkinIdentify tarotSkinIdentify, shb shbVar, tt1 tt1Var, LinkedHashMap linkedHashMap, String str, tr2 tr2Var, int i) {
        this.a = i;
        this.b = pp5Var;
        this.c = r0Var;
        this.d = mixedDeckSnapshot;
        this.e = tarotSkinIdentify;
        this.f = shbVar;
        this.g = tt1Var;
        this.v = linkedHashMap;
        this.w = str;
        this.x = tr2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        k95 k95Var = k95.Top;
        pp5 pp5Var = this.b;
        switch (i) {
            case 0:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                tarotCardChoice.getClass();
                k.h(this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, tarotCardChoice, "state_1", pp5Var.c.contains(tarotCardChoice) ? k95Var : null);
                break;
            default:
                TarotCardChoice tarotCardChoice2 = (TarotCardChoice) obj;
                tarotCardChoice2.getClass();
                k.h(this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, tarotCardChoice2, "state_3", pp5Var.c.contains(tarotCardChoice2) ? k95Var : null);
                break;
        }
        return wefVar;
    }
}
