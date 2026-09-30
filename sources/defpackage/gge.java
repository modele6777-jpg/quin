package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gge extends gbe implements l26 {
    final /* synthetic */ ege $session;
    final /* synthetic */ TarotSkinIdentify $skin;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gge(xn2 xn2Var, ege egeVar, lge lgeVar, TarotSkinIdentify tarotSkinIdentify) {
        super(2, xn2Var);
        this.this$0 = lgeVar;
        this.$session = egeVar;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gge ggeVar = new gge(xn2Var, this.$session, this.this$0, this.$skin);
        ggeVar.L$0 = obj;
        return ggeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            js3 js3Var = ga4.a;
            wg6 wg6Var = mk8.a.f;
            fge fgeVar = new fge(this.this$0, this.$session, this.$skin, list, null);
            this.L$0 = null;
            this.label = 1;
            Object objP0 = ynb.p0(wg6Var, fgeVar, this);
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
        return ((gge) k((xn2) obj2, (List) obj)).r(wef.a);
    }
}
