package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;
import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t0c {
    public static final QaResult a(t7 t7Var, String str, l26 l26Var) {
        Object objC;
        Object objC2;
        Object objB;
        String strA = ((mo3) t7Var).a();
        if (v4e.Q(strA)) {
            strA = null;
        }
        if (strA == null) {
            return new QaResult.Err("no signed-in account", "no_account");
        }
        ReviewRewardState reviewRewardState = (ReviewRewardState) z5c.I(nu4.a, new s0c(null, l26Var, strA));
        if (reviewRewardState == null) {
            return new QaResult.Err("review reward state unavailable", "state_unavailable");
        }
        fl8 fl8Var = new fl8();
        fl8Var.put("accountId", oh7.c(strA));
        fl8Var.put("promptImpressionCount", oh7.b(Integer.valueOf(reviewRewardState.getPromptImpressionCount())));
        w57 lastDismissedAt = reviewRewardState.getLastDismissedAt();
        if (lastDismissedAt == null || (objC = oh7.c(lastDismissedAt.toString())) == null) {
            objC = qi7.INSTANCE;
        }
        fl8Var.put("lastDismissedAt", objC);
        fl8Var.put("ratingRequested", oh7.a(Boolean.valueOf(reviewRewardState.getRatingRequested())));
        fl8Var.put("storeLaunchPrepared", oh7.a(Boolean.valueOf(reviewRewardState.getStoreLaunchPrepared())));
        fl8Var.put("storeReturnPending", oh7.a(Boolean.valueOf(reviewRewardState.getStoreReturnPending())));
        String snackbarExposureId = reviewRewardState.getSnackbarExposureId();
        if (snackbarExposureId == null || (objC2 = oh7.c(snackbarExposureId)) == null) {
            objC2 = qi7.INSTANCE;
        }
        fl8Var.put("snackbarExposureId", objC2);
        Long snackbarExposureAtEpochMillis = reviewRewardState.getSnackbarExposureAtEpochMillis();
        if (snackbarExposureAtEpochMillis == null || (objB = oh7.b(snackbarExposureAtEpochMillis)) == null) {
            objB = qi7.INSTANCE;
        }
        fl8Var.put("snackbarExposureAtEpochMillis", objB);
        fl8Var.put("snackbarExposureAttemptCount", oh7.b(Integer.valueOf(reviewRewardState.getSnackbarExposureAttemptCount())));
        if (str != null) {
            fl8Var.put("nextStep", oh7.c(str));
        }
        return new QaResult.Ok(new ti7(fl8Var.j()));
    }
}
