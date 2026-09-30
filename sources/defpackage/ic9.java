package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ic9 extends gbe implements l26 {
    final /* synthetic */ xof $datasource;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic9(xof xofVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$datasource = xofVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ic9 ic9Var = new ic9(this.$datasource, xn2Var);
        ic9Var.L$0 = obj;
        return ic9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xof xofVar = this.$datasource;
            n2f key = tarotSkinIdentify.getKey();
            this.L$0 = null;
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
        return ((ic9) k((xn2) obj2, (TarotSkinIdentify) obj)).r(wef.a);
    }
}
