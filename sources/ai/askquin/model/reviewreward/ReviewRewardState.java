package ai.askquin.model.reviewreward;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.d67;
import defpackage.eg8;
import defpackage.ib8;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.u2c;
import defpackage.ub3;
import defpackage.v4e;
import defpackage.w57;
import defpackage.xyc;
import defpackage.y2c;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RSB]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0016J\r\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u0016J\u001d\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u0016J\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$Jf\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b2\u0010,J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010$J\u001a\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010(R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bF\u0010(R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bG\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010.R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bL\u0010$R\u0013\u0010P\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006T"}, d2 = {"Lai/askquin/model/reviewreward/ReviewRewardState;", "", "", "promptImpressionCount", "Lw57;", "lastDismissedAt", "", "ratingRequested", "storeLaunchPrepared", "storeReturnPending", "", "snackbarExposureId", "", "snackbarExposureAtEpochMillis", "snackbarExposureAttemptCount", "<init>", "(ILw57;ZZZLjava/lang/String;Ljava/lang/Long;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILw57;ZZZLjava/lang/String;Ljava/lang/Long;ILxyc;)V", "recordPromptImpression", "()Lai/askquin/model/reviewreward/ReviewRewardState;", "dismissedAt", "recordDismissal", "(Lw57;)Lai/askquin/model/reviewreward/ReviewRewardState;", "prepareStoreLaunch", "recordStoreLaunched", "recoverPreparedStoreLaunch", "exposureId", "exposedAtEpochMillis", "claimSnackbarExposure", "(Ljava/lang/String;J)Lai/askquin/model/reviewreward/ReviewRewardState;", "reserveSnackbarExposureTracking", "recordStoreLaunchFailed", "component1", "()I", "component2", "()Lw57;", "component3", "()Z", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "()Ljava/lang/Long;", "component8", "copy", "(ILw57;ZZZLjava/lang/String;Ljava/lang/Long;I)Lai/askquin/model/reviewreward/ReviewRewardState;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_model", "(Lai/askquin/model/reviewreward/ReviewRewardState;Lag2;Lnyc;)V", "write$Self", "I", "getPromptImpressionCount", "Lw57;", "getLastDismissedAt", "Z", "getRatingRequested", "getStoreLaunchPrepared", "getStoreReturnPending", "Ljava/lang/String;", "getSnackbarExposureId", "Ljava/lang/Long;", "getSnackbarExposureAtEpochMillis", "getSnackbarExposureAttemptCount", "Lu2c;", "getSnackbarExposure", "()Lu2c;", "snackbarExposure", "Companion", "y2c", "x2c", "Quin.core:model"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ReviewRewardState {
    public static final y2c Companion = new y2c();
    public static final int MAX_PROMPT_IMPRESSIONS = 3;
    public static final int MAX_SNACKBAR_EXPOSURE_ATTEMPTS = 3;
    private final w57 lastDismissedAt;
    private final int promptImpressionCount;
    private final boolean ratingRequested;
    private final Long snackbarExposureAtEpochMillis;
    private final int snackbarExposureAttemptCount;
    private final String snackbarExposureId;
    private final boolean storeLaunchPrepared;
    private final boolean storeReturnPending;

    public /* synthetic */ ReviewRewardState(int i, int i2, w57 w57Var, boolean z, boolean z2, boolean z3, String str, Long l, int i3, xyc xycVar) {
        if ((i & 1) == 0) {
            this.promptImpressionCount = 0;
            i2 = 0;
        } else {
            this.promptImpressionCount = i2;
        }
        if ((i & 2) == 0) {
            this.lastDismissedAt = null;
        } else {
            this.lastDismissedAt = w57Var;
        }
        if ((i & 4) == 0) {
            this.ratingRequested = false;
            z = false;
        } else {
            this.ratingRequested = z;
        }
        if ((i & 8) == 0) {
            this.storeLaunchPrepared = false;
            z2 = false;
        } else {
            this.storeLaunchPrepared = z2;
        }
        if ((i & 16) == 0) {
            this.storeReturnPending = false;
            z3 = false;
        } else {
            this.storeReturnPending = z3;
        }
        if ((i & 32) == 0) {
            this.snackbarExposureId = null;
            str = null;
        } else {
            this.snackbarExposureId = str;
        }
        if ((i & 64) == 0) {
            this.snackbarExposureAtEpochMillis = null;
            l = null;
        } else {
            this.snackbarExposureAtEpochMillis = l;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.snackbarExposureAttemptCount = 0;
            i3 = 0;
        } else {
            this.snackbarExposureAttemptCount = i3;
        }
        if (i2 < 0 || i2 >= 4) {
            qc0.j("promptImpressionCount must be between 0 and 3");
            throw null;
        }
        if (z3 && !z) {
            qc0.j("storeReturnPending requires ratingRequested");
            throw null;
        }
        if (z2 && !z) {
            qc0.j("storeLaunchPrepared requires ratingRequested");
            throw null;
        }
        if (str != null && v4e.Q(str)) {
            qc0.j("snackbarExposureId must not be blank");
            throw null;
        }
        if (str != null && !z) {
            qc0.j("snackbarExposureId requires ratingRequested");
            throw null;
        }
        if (z3 && str != null) {
            qc0.j("storeReturnPending cannot coexist with snackbarExposureId");
            throw null;
        }
        if (str != null && z2) {
            qc0.j("snackbarExposureId cannot coexist with storeLaunchPrepared");
            throw null;
        }
        if ((str == null) != (l == null)) {
            qc0.j("snackbar exposure ID and timestamp must coexist");
            throw null;
        }
        if (l != null && l.longValue() <= 0) {
            qc0.j("snackbarExposureAtEpochMillis must be positive");
            throw null;
        }
        if (i3 < 0 || i3 >= 4) {
            qc0.j("snackbarExposureAttemptCount must be bounded");
            throw null;
        }
        if (str != null || i3 == 0) {
            return;
        }
        qc0.j("snackbarExposureAttemptCount requires an exposure");
        throw null;
    }

    public static /* synthetic */ ReviewRewardState copy$default(ReviewRewardState reviewRewardState, int i, w57 w57Var, boolean z, boolean z2, boolean z3, String str, Long l, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = reviewRewardState.promptImpressionCount;
        }
        if ((i3 & 2) != 0) {
            w57Var = reviewRewardState.lastDismissedAt;
        }
        if ((i3 & 4) != 0) {
            z = reviewRewardState.ratingRequested;
        }
        if ((i3 & 8) != 0) {
            z2 = reviewRewardState.storeLaunchPrepared;
        }
        if ((i3 & 16) != 0) {
            z3 = reviewRewardState.storeReturnPending;
        }
        if ((i3 & 32) != 0) {
            str = reviewRewardState.snackbarExposureId;
        }
        if ((i3 & 64) != 0) {
            l = reviewRewardState.snackbarExposureAtEpochMillis;
        }
        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            i2 = reviewRewardState.snackbarExposureAttemptCount;
        }
        Long l2 = l;
        int i4 = i2;
        boolean z4 = z3;
        String str2 = str;
        return reviewRewardState.copy(i, w57Var, z, z2, z4, str2, l2, i4);
    }

    public static final /* synthetic */ void write$Self$Quin_core_model(ReviewRewardState self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.promptImpressionCount != 0) {
            output.v(0, self.promptImpressionCount, serialDesc);
        }
        if (output.g(serialDesc) || self.lastDismissedAt != null) {
            output.A(serialDesc, 1, d67.a, self.lastDismissedAt);
        }
        if (output.g(serialDesc) || self.ratingRequested) {
            output.o(serialDesc, 2, self.ratingRequested);
        }
        if (output.g(serialDesc) || self.storeLaunchPrepared) {
            output.o(serialDesc, 3, self.storeLaunchPrepared);
        }
        if (output.g(serialDesc) || self.storeReturnPending) {
            output.o(serialDesc, 4, self.storeReturnPending);
        }
        if (output.g(serialDesc) || self.snackbarExposureId != null) {
            output.A(serialDesc, 5, p4e.a, self.snackbarExposureId);
        }
        if (output.g(serialDesc) || self.snackbarExposureAtEpochMillis != null) {
            output.A(serialDesc, 6, eg8.a, self.snackbarExposureAtEpochMillis);
        }
        if (!output.g(serialDesc) && self.snackbarExposureAttemptCount == 0) {
            return;
        }
        output.v(7, self.snackbarExposureAttemptCount, serialDesc);
    }

    public final ReviewRewardState claimSnackbarExposure(String exposureId, long exposedAtEpochMillis) {
        exposureId.getClass();
        if (v4e.Q(exposureId)) {
            qc0.j("exposureId must not be blank");
            return null;
        }
        if (exposedAtEpochMillis > 0) {
            return (this.snackbarExposureId == null && this.storeReturnPending) ? copy$default(this, 0, null, false, false, false, exposureId, Long.valueOf(exposedAtEpochMillis), 0, 135, null) : this;
        }
        qc0.j("exposedAtEpochMillis must be positive");
        return null;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPromptImpressionCount() {
        return this.promptImpressionCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final w57 getLastDismissedAt() {
        return this.lastDismissedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRatingRequested() {
        return this.ratingRequested;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getStoreLaunchPrepared() {
        return this.storeLaunchPrepared;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getStoreReturnPending() {
        return this.storeReturnPending;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSnackbarExposureId() {
        return this.snackbarExposureId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getSnackbarExposureAtEpochMillis() {
        return this.snackbarExposureAtEpochMillis;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSnackbarExposureAttemptCount() {
        return this.snackbarExposureAttemptCount;
    }

    public final ReviewRewardState copy(int promptImpressionCount, w57 lastDismissedAt, boolean ratingRequested, boolean storeLaunchPrepared, boolean storeReturnPending, String snackbarExposureId, Long snackbarExposureAtEpochMillis, int snackbarExposureAttemptCount) {
        return new ReviewRewardState(promptImpressionCount, lastDismissedAt, ratingRequested, storeLaunchPrepared, storeReturnPending, snackbarExposureId, snackbarExposureAtEpochMillis, snackbarExposureAttemptCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewRewardState)) {
            return false;
        }
        ReviewRewardState reviewRewardState = (ReviewRewardState) other;
        return this.promptImpressionCount == reviewRewardState.promptImpressionCount && pa7.t(this.lastDismissedAt, reviewRewardState.lastDismissedAt) && this.ratingRequested == reviewRewardState.ratingRequested && this.storeLaunchPrepared == reviewRewardState.storeLaunchPrepared && this.storeReturnPending == reviewRewardState.storeReturnPending && pa7.t(this.snackbarExposureId, reviewRewardState.snackbarExposureId) && pa7.t(this.snackbarExposureAtEpochMillis, reviewRewardState.snackbarExposureAtEpochMillis) && this.snackbarExposureAttemptCount == reviewRewardState.snackbarExposureAttemptCount;
    }

    public final w57 getLastDismissedAt() {
        return this.lastDismissedAt;
    }

    public final int getPromptImpressionCount() {
        return this.promptImpressionCount;
    }

    public final boolean getRatingRequested() {
        return this.ratingRequested;
    }

    public final u2c getSnackbarExposure() {
        Long l;
        String str = this.snackbarExposureId;
        if (str == null || (l = this.snackbarExposureAtEpochMillis) == null) {
            return null;
        }
        return new u2c(this.snackbarExposureAttemptCount, l.longValue(), str);
    }

    public final Long getSnackbarExposureAtEpochMillis() {
        return this.snackbarExposureAtEpochMillis;
    }

    public final int getSnackbarExposureAttemptCount() {
        return this.snackbarExposureAttemptCount;
    }

    public final String getSnackbarExposureId() {
        return this.snackbarExposureId;
    }

    public final boolean getStoreLaunchPrepared() {
        return this.storeLaunchPrepared;
    }

    public final boolean getStoreReturnPending() {
        return this.storeReturnPending;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.promptImpressionCount) * 31;
        w57 w57Var = this.lastDismissedAt;
        int iD = ub3.d(ub3.d(ub3.d((iHashCode + (w57Var == null ? 0 : w57Var.hashCode())) * 31, 31, this.ratingRequested), 31, this.storeLaunchPrepared), 31, this.storeReturnPending);
        String str = this.snackbarExposureId;
        int iHashCode2 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.snackbarExposureAtEpochMillis;
        return Integer.hashCode(this.snackbarExposureAttemptCount) + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final ReviewRewardState prepareStoreLaunch() {
        return this.ratingRequested ? this : copy$default(this, 0, null, true, true, true, null, null, 0, 227, null);
    }

    public final ReviewRewardState recordDismissal(w57 dismissedAt) {
        dismissedAt.getClass();
        w57 w57Var = this.lastDismissedAt;
        if (w57Var != null && w57Var.compareTo(dismissedAt) >= 0) {
            dismissedAt = w57Var;
        }
        return copy$default(this, 0, dismissedAt, false, false, false, null, null, 0, 253, null);
    }

    public final ReviewRewardState recordPromptImpression() {
        int i = this.promptImpressionCount;
        return i >= 3 ? this : copy$default(this, i + 1, null, false, false, false, null, null, 0, 254, null);
    }

    public final ReviewRewardState recordStoreLaunchFailed() {
        return !this.storeLaunchPrepared ? this : copy$default(this, 0, null, false, false, false, null, null, 0, 227, null);
    }

    public final ReviewRewardState recordStoreLaunched() {
        return !this.storeLaunchPrepared ? this : copy$default(this, 0, null, false, false, false, null, null, 0, 247, null);
    }

    public final ReviewRewardState recoverPreparedStoreLaunch() {
        return (!this.storeLaunchPrepared || this.storeReturnPending) ? this : copy$default(this, 0, null, false, false, true, null, null, 0, 239, null);
    }

    public final ReviewRewardState reserveSnackbarExposureTracking() {
        int i;
        return (this.snackbarExposureId == null || (i = this.snackbarExposureAttemptCount) >= 3) ? this : copy$default(this, 0, null, false, false, false, null, null, i + 1, 127, null);
    }

    public String toString() {
        int i = this.promptImpressionCount;
        w57 w57Var = this.lastDismissedAt;
        boolean z = this.ratingRequested;
        boolean z2 = this.storeLaunchPrepared;
        boolean z3 = this.storeReturnPending;
        String str = this.snackbarExposureId;
        Long l = this.snackbarExposureAtEpochMillis;
        int i2 = this.snackbarExposureAttemptCount;
        StringBuilder sb = new StringBuilder("ReviewRewardState(promptImpressionCount=");
        sb.append(i);
        sb.append(", lastDismissedAt=");
        sb.append(w57Var);
        sb.append(", ratingRequested=");
        ib8.w(sb, z, ", storeLaunchPrepared=", z2, ", storeReturnPending=");
        sb.append(z3);
        sb.append(", snackbarExposureId=");
        sb.append(str);
        sb.append(", snackbarExposureAtEpochMillis=");
        sb.append(l);
        sb.append(", snackbarExposureAttemptCount=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public ReviewRewardState() {
        this(0, (w57) null, false, false, false, (String) null, (Long) null, 0, 255, (rp3) null);
    }

    public ReviewRewardState(int i, w57 w57Var, boolean z, boolean z2, boolean z3, String str, Long l, int i2) {
        this.promptImpressionCount = i;
        this.lastDismissedAt = w57Var;
        this.ratingRequested = z;
        this.storeLaunchPrepared = z2;
        this.storeReturnPending = z3;
        this.snackbarExposureId = str;
        this.snackbarExposureAtEpochMillis = l;
        this.snackbarExposureAttemptCount = i2;
        if (i < 0 || i >= 4) {
            qc0.j("promptImpressionCount must be between 0 and 3");
            throw null;
        }
        if (z3 && !z) {
            qc0.j("storeReturnPending requires ratingRequested");
            throw null;
        }
        if (z2 && !z) {
            qc0.j("storeLaunchPrepared requires ratingRequested");
            throw null;
        }
        if (str != null && v4e.Q(str)) {
            qc0.j("snackbarExposureId must not be blank");
            throw null;
        }
        if (str != null && !z) {
            qc0.j("snackbarExposureId requires ratingRequested");
            throw null;
        }
        if (z3 && str != null) {
            qc0.j("storeReturnPending cannot coexist with snackbarExposureId");
            throw null;
        }
        if (str != null && z2) {
            qc0.j("snackbarExposureId cannot coexist with storeLaunchPrepared");
            throw null;
        }
        if ((str == null) != (l == null)) {
            qc0.j("snackbar exposure ID and timestamp must coexist");
            throw null;
        }
        if (l != null && l.longValue() <= 0) {
            qc0.j("snackbarExposureAtEpochMillis must be positive");
            throw null;
        }
        if (i2 < 0 || i2 >= 4) {
            qc0.j("snackbarExposureAttemptCount must be bounded");
            throw null;
        }
        if (str != null || i2 == 0) {
            return;
        }
        qc0.j("snackbarExposureAttemptCount requires an exposure");
        throw null;
    }

    public /* synthetic */ ReviewRewardState(int i, w57 w57Var, boolean z, boolean z2, boolean z3, String str, Long l, int i2, int i3, rp3 rp3Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : w57Var, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : l, (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0 : i2);
    }
}
