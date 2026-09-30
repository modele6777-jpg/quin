package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r54 extends h36 implements a26 {
    public static final r54 a = new r54(1, j74.class, "toDevSummary", "toDevSummary(Lai/askquin/model/reviewreward/ReviewRewardState;)Ljava/lang/String;", 1);

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ReviewRewardState reviewRewardState = (ReviewRewardState) obj;
        reviewRewardState.getClass();
        int promptImpressionCount = reviewRewardState.getPromptImpressionCount();
        Object lastDismissedAt = reviewRewardState.getLastDismissedAt();
        if (lastDismissedAt == null) {
            lastDismissedAt = "-";
        }
        boolean ratingRequested = reviewRewardState.getRatingRequested();
        boolean storeLaunchPrepared = reviewRewardState.getStoreLaunchPrepared();
        boolean storeReturnPending = reviewRewardState.getStoreReturnPending();
        String snackbarExposureId = reviewRewardState.getSnackbarExposureId();
        String str = snackbarExposureId != null ? snackbarExposureId : "-";
        int snackbarExposureAttemptCount = reviewRewardState.getSnackbarExposureAttemptCount();
        StringBuilder sb = new StringBuilder("prompt=");
        sb.append(promptImpressionCount);
        sb.append(", dismissed=");
        sb.append(lastDismissedAt);
        sb.append(", rating=");
        ib8.w(sb, ratingRequested, ", prepared=", storeLaunchPrepared, ", pending=");
        sb.append(storeReturnPending);
        sb.append(", exposure=");
        sb.append(str);
        sb.append(", attempts=");
        sb.append(snackbarExposureAttemptCount);
        return sb.toString();
    }
}
