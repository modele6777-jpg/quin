package ai.askquin.ui.feedback;

import ai.askquin.R;
import defpackage.lx4;
import defpackage.pa7;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001eÊ\u0001\u0002\b ¨\u0006\u001f"}, d2 = {"Lai/askquin/ui/feedback/FeedbackReason;", "", "resId", "", "Landroidx/annotation/StringRes;", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "TechnicalIssue", "InaccuratePrediction", "UnprofessionalContent", "PoorExperience", "UnnaturalConversation", "UnreasonablePrice", "LackOfPersonalization", "LongWaitTime", "UnsatisfactoryResult", "LimitedFeature", "NotHelpful", "ClearerPrediction", "MoreReasonablePrice", "ShorterWaitTime", "MoreAccuratePrediction", "MoreProfessionalKnowledge", "RecommendToFriend", "MoreDetailReading", "MorePersonalizedContent", "SmootherExperience", "MoreFeature", "Other", "Quin.component:feedback_release", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum FeedbackReason {
    TechnicalIssue(R.string.feedback_reason_technical_issue),
    InaccuratePrediction(R.string.feedback_reason_inaccurate_prediction),
    UnprofessionalContent(R.string.feedback_reason_unprofessional_content),
    PoorExperience(R.string.feedback_reason_poor_experience),
    UnnaturalConversation(R.string.feedback_reason_unnatural_conversation),
    UnreasonablePrice(R.string.feedback_reason_unreasonable_price),
    LackOfPersonalization(R.string.feedback_reason_lack_of_personalization),
    LongWaitTime(R.string.feedback_reason_long_wait_time),
    UnsatisfactoryResult(R.string.feedback_reason_unsatisfactory_result),
    LimitedFeature(R.string.feedback_reason_limited_feature),
    NotHelpful(R.string.feedback_reason_not_helpful),
    ClearerPrediction(R.string.feedback_reason_clearer_prediction),
    MoreReasonablePrice(R.string.feedback_reason_more_reasonable_price),
    ShorterWaitTime(R.string.feedback_reason_shorter_wait_time),
    MoreAccuratePrediction(R.string.feedback_reason_more_accurate_prediction),
    MoreProfessionalKnowledge(R.string.feedback_reason_more_professional_knowledge),
    RecommendToFriend(R.string.feedback_reason_recommend_to_friend),
    MoreDetailReading(R.string.feedback_reason_more_detail_reading),
    MorePersonalizedContent(R.string.feedback_reason_more_personalized_content),
    SmootherExperience(R.string.feedback_reason_smoother_experience),
    MoreFeature(R.string.feedback_reason_more_feature),
    Other(R.string.feedback_reason_other);

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    private final int resId;

    FeedbackReason(int i) {
        this.resId = i;
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final int getResId() {
        return this.resId;
    }
}
