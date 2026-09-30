package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v54 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfoProvider;
    final /* synthetic */ l26 $action;
    final /* synthetic */ a26 $successMessage;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v54(t7 t7Var, l26 l26Var, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountInfoProvider = t7Var;
        this.$action = l26Var;
        this.$successMessage = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v54(this.$accountInfoProvider, this.$action, this.$successMessage, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            String strA = ((mo3) this.$accountInfoProvider).a();
            if (v4e.Q(strA)) {
                lw2.a(new s54(2, null));
                return wefVar;
            }
            l26 l26Var = this.$action;
            this.L$0 = null;
            this.label = 1;
            obj = l26Var.z(strA, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        ReviewRewardState reviewRewardState = (ReviewRewardState) obj;
        if (reviewRewardState == null) {
            lw2.a(new t54(2, null));
            return wefVar;
        }
        lw2.a(new u54(this.$successMessage, reviewRewardState, null));
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v54) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
