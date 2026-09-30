package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o1c extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ a26 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1c(xn2 xn2Var, a26 a26Var, String str) {
        super(2, xn2Var);
        this.$transform = a26Var;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        o1c o1cVar = new o1c(xn2Var, this.$transform, this.$accountId);
        o1cVar.L$0 = obj;
        return o1cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ReviewRewardStore reviewRewardStore = (ReviewRewardStore) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        a26 a26Var = this.$transform;
        ReviewRewardState reviewRewardState = reviewRewardStore.getAccountStates().get(this.$accountId);
        if (reviewRewardState == null) {
            reviewRewardState = new ReviewRewardState(0, (w57) null, false, false, false, (String) null, (Long) null, 0, 255, (rp3) null);
        }
        return reviewRewardStore.copy(bm8.M(reviewRewardStore.getAccountStates(), new iy9(this.$accountId, (ReviewRewardState) a26Var.d(reviewRewardState))));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((o1c) k((xn2) obj2, (ReviewRewardStore) obj)).r(wef.a);
    }
}
