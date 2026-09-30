package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l63 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ y63 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l63(y63 y63Var, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = y63Var;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l63(this.this$0, this.$skin, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xof xofVar = this.this$0.f;
            n2f key = this.$skin.getKey();
            this.label = 1;
            Object objJ = xofVar.j(key, this);
            bw2 bw2Var = bw2.a;
            if (objJ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l63) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
