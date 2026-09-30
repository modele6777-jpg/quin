package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i1c extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ a26 $isEligible;
    final /* synthetic */ mmb $reservation;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1c(String str, a26 a26Var, mmb mmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountId = str;
        this.$isEligible = a26Var;
        this.$reservation = mmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        i1c i1cVar = new i1c(this.$accountId, this.$isEligible, this.$reservation, xn2Var);
        i1cVar.L$0 = obj;
        return i1cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ReviewRewardStore reviewRewardStore = (ReviewRewardStore) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ReviewRewardState reviewRewardState = reviewRewardStore.getAccountStates().get(this.$accountId);
        if (reviewRewardState == null) {
            reviewRewardState = new ReviewRewardState(0, (w57) null, false, false, false, (String) null, (Long) null, 0, 255, (rp3) null);
        }
        if (reviewRewardState.getPromptImpressionCount() >= 3 || !((Boolean) this.$isEligible.d(reviewRewardState)).booleanValue()) {
            this.$reservation.element = new r2c(reviewRewardState);
            return reviewRewardStore;
        }
        ReviewRewardState reviewRewardStateRecordPromptImpression = reviewRewardState.recordPromptImpression();
        this.$reservation.element = new q2c(reviewRewardStateRecordPromptImpression);
        return reviewRewardStore.copy(bm8.M(reviewRewardStore.getAccountStates(), new iy9(this.$accountId, reviewRewardStateRecordPromptImpression)));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i1c) k((xn2) obj2, (ReviewRewardStore) obj)).r(wef.a);
    }
}
