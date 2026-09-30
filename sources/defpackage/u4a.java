package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u4a extends gbe implements l26 {
    final /* synthetic */ x16 $close;
    final /* synthetic */ FiveCardUpgradePending $pending;
    final /* synthetic */ qna $updateViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4a(FiveCardUpgradePending fiveCardUpgradePending, qna qnaVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pending = fiveCardUpgradePending;
        this.$updateViewModel = qnaVar;
        this.$close = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u4a(this.$pending, this.$updateViewModel, this.$close, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$pending != null && this.$updateViewModel.i() != null) {
            this.$close.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        u4a u4aVar = (u4a) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        u4aVar.r(wefVar);
        return wefVar;
    }
}
