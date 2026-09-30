package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x0c extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ mmb $claimedExposure;
    final /* synthetic */ long $exposedAtEpochMillis;
    final /* synthetic */ String $exposureId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0c(String str, mmb mmbVar, String str2, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountId = str;
        this.$claimedExposure = mmbVar;
        this.$exposureId = str2;
        this.$exposedAtEpochMillis = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        x0c x0cVar = new x0c(this.$accountId, this.$claimedExposure, this.$exposureId, this.$exposedAtEpochMillis, xn2Var);
        x0cVar.L$0 = obj;
        return x0cVar;
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
        if (reviewRewardState.getSnackbarExposure() != null) {
            this.$claimedExposure.element = reviewRewardState.getSnackbarExposure();
            return reviewRewardStore;
        }
        if (!reviewRewardState.getStoreReturnPending()) {
            return reviewRewardStore;
        }
        ReviewRewardState reviewRewardStateClaimSnackbarExposure = reviewRewardState.claimSnackbarExposure(this.$exposureId, this.$exposedAtEpochMillis);
        this.$claimedExposure.element = reviewRewardStateClaimSnackbarExposure.getSnackbarExposure();
        return reviewRewardStore.copy(bm8.M(reviewRewardStore.getAccountStates(), new iy9(this.$accountId, reviewRewardStateClaimSnackbarExposure)));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((x0c) k((xn2) obj2, (ReviewRewardStore) obj)).r(wef.a);
    }
}
