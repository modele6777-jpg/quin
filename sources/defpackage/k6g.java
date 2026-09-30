package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k6g extends gbe implements l26 {
    final /* synthetic */ e89 $art$delegate;
    final /* synthetic */ qhe $card;
    final /* synthetic */ Context $context;
    final /* synthetic */ h0e $currentOnResolved$delegate;
    final /* synthetic */ kmd $fileResolver;
    final /* synthetic */ aw6 $imageLoader;
    final /* synthetic */ TarotSkinIdentify $skin;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6g(kmd kmdVar, TarotSkinIdentify tarotSkinIdentify, qhe qheVar, aw6 aw6Var, Context context, e89 e89Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$fileResolver = kmdVar;
        this.$skin = tarotSkinIdentify;
        this.$card = qheVar;
        this.$imageLoader = aw6Var;
        this.$context = context;
        this.$art$delegate = e89Var;
        this.$currentOnResolved$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new k6g(this.$fileResolver, this.$skin, this.$card, this.$imageLoader, this.$context, this.$art$delegate, this.$currentOnResolved$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        e89 e89Var;
        int i = this.label;
        z3g z3gVar = null;
        if (i == 0) {
            jzb.q(obj);
            e89Var = this.$art$delegate;
            Object objC = this.$fileResolver.c(this.$skin, this.$card.a);
            if (objC != null) {
                aw6 aw6Var = this.$imageLoader;
                Context context = this.$context;
                qhe qheVar = this.$card;
                js3 js3Var = ga4.a;
                j6g j6gVar = new j6g(aw6Var, context, objC, qheVar, null);
                this.L$0 = null;
                this.L$1 = e89Var;
                this.label = 1;
                obj = ynb.p0(js3Var, j6gVar, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            ykd ykdVar = l6g.a;
            e89Var.setValue(z3gVar);
            ((x16) this.$currentOnResolved$delegate.getValue()).invoke();
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e89Var = (e89) this.L$1;
        jzb.q(obj);
        z3gVar = (z3g) obj;
        ykd ykdVar2 = l6g.a;
        e89Var.setValue(z3gVar);
        ((x16) this.$currentOnResolved$delegate.getValue()).invoke();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((k6g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
