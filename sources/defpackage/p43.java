package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p43 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $date;
    final /* synthetic */ TarotSkinIdentify $initialSkin;
    final /* synthetic */ boolean $recordCompletion;
    final /* synthetic */ y63 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p43(y63 y63Var, Context context, String str, boolean z, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = y63Var;
        this.$context = context;
        this.$date = str;
        this.$recordCompletion = z;
        this.$initialSkin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new p43(this.$viewModel, this.$context, this.$date, this.$recordCompletion, this.$initialSkin, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$viewModel.h(this.$context, this.$date, this.$recordCompletion, this.$initialSkin);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        p43 p43Var = (p43) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        p43Var.r(wefVar);
        return wefVar;
    }
}
