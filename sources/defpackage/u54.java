package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u54 extends gbe implements l26 {
    final /* synthetic */ ReviewRewardState $state;
    final /* synthetic */ a26 $successMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u54(a26 a26Var, ReviewRewardState reviewRewardState, xn2 xn2Var) {
        super(2, xn2Var);
        this.$successMessage = a26Var;
        this.$state = reviewRewardState;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u54(this.$successMessage, this.$state, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Object objD = this.$successMessage.d(this.$state);
        objD.getClass();
        jcc.k(1, objD);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        u54 u54Var = (u54) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        u54Var.r(wefVar);
        return wefVar;
    }
}
