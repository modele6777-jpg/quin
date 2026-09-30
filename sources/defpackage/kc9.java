package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kc9 extends gbe implements l26 {
    final /* synthetic */ xof $datasource;
    Object L$0;
    int label;
    final /* synthetic */ lc9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc9(xof xofVar, lc9 lc9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$datasource = xofVar;
        this.this$0 = lc9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kc9(this.$datasource, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xke xkeVar;
        Object objZ;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            xkeVar = TarotSkinIdentify.Companion;
            wj5 wj5Var = this.$datasource.b;
            this.L$0 = xkeVar;
            this.label = 1;
            obj = tm7.B(wj5Var, this);
            if (obj != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xkeVar = (xke) this.L$0;
        jzb.q(obj);
        n2f n2fVar = ((yof) obj).g;
        xkeVar.getClass();
        TarotSkinIdentify tarotSkinIdentifyA = xke.a(n2fVar);
        hs3 hs3Var = xqa.A;
        String str = (String) z5c.I(nu4.a, new jc9(hs3Var.a, hs3Var.b, null));
        ic9 ic9Var = new ic9(this.$datasource, null);
        lc9 lc9Var = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (tarotSkinIdentifyA.getIsNeoStyle()) {
            objZ = wefVar;
        } else {
            if (v4e.Q(str)) {
                TarotSkinIdentify tarotSkinIdentifyD = r8c.d();
                if (tarotSkinIdentifyA == tarotSkinIdentifyD || (objZ = ic9Var.z(tarotSkinIdentifyD, this)) != bw2Var) {
                }
            } else {
                TarotSkinIdentify tarotSkinIdentify = TarotSkinIdentify.NeoRiderWaite;
                nt1 nt1Var = (nt1) ((nfc) tq.A(lc9Var.a).c.e).g(job.a.b(nt1.class), null, null);
                tarotSkinIdentify.getClass();
                ynb.V(hwf.a(nt1Var), null, null, new mt1(nt1Var, tarotSkinIdentify, null), 3);
            }
            objZ = wefVar;
        }
        return objZ == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kc9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
