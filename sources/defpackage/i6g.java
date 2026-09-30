package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i6g extends gbe implements l26 {
    final /* synthetic */ e89 $downloaded$delegate;
    final /* synthetic */ kmd $fileResolver;
    final /* synthetic */ TarotSkinIdentify $skin;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6g(kmd kmdVar, TarotSkinIdentify tarotSkinIdentify, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$fileResolver = kmdVar;
        this.$skin = tarotSkinIdentify;
        this.$downloaded$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new i6g(this.$fileResolver, this.$skin, this.$downloaded$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        e89 e89Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            e89 e89Var2 = this.$downloaded$delegate;
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            h6g h6gVar = new h6g(this.$fileResolver, this.$skin, null);
            this.L$0 = e89Var2;
            this.label = 1;
            Object objP0 = ynb.p0(hr3Var, h6gVar, this);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
            obj = objP0;
            e89Var = e89Var2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e89Var = (e89) this.L$0;
            jzb.q(obj);
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ykd ykdVar = l6g.a;
        e89Var.setValue(bool);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i6g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
