package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ige extends gbe implements l26 {
    final /* synthetic */ ege $session;
    final /* synthetic */ TarotSkinIdentify $skin;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ige(xn2 xn2Var, ege egeVar, lge lgeVar, TarotSkinIdentify tarotSkinIdentify) {
        super(2, xn2Var);
        this.$skin = tarotSkinIdentify;
        this.this$0 = lgeVar;
        this.$session = egeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        TarotSkinIdentify tarotSkinIdentify = this.$skin;
        ige igeVar = new ige(xn2Var, this.$session, this.this$0, tarotSkinIdentify);
        igeVar.L$0 = obj;
        return igeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Throwable th = (Throwable) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hf8.Q.getClass();
            ef8.a("TarotBox3D").c("Tarot box texture load failed for " + this.$skin, th);
            js3 js3Var = ga4.a;
            wg6 wg6Var = mk8.a.f;
            hge hgeVar = new hge(null, this.$session, this.this$0, this.$skin);
            this.L$0 = null;
            this.label = 1;
            Object objP0 = ynb.p0(wg6Var, hgeVar, this);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
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
        return ((ige) k((xn2) obj2, (Throwable) obj)).r(wef.a);
    }
}
