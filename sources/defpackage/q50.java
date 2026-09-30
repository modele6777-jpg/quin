package defpackage;

import ai.askquin.R;
import ai.askquin.ui.feedback.FeedbackReason;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q50 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s69 b;

    public /* synthetic */ q50(s69 s69Var, int i) {
        this.a = i;
        this.b = s69Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i;
        int i2 = this.a;
        wef wefVar = wef.a;
        s69 s69Var = this.b;
        switch (i2) {
            case 0:
                sz9 sz9Var = (sz9) s69Var;
                sz9Var.k(sz9Var.j() + 1);
                return wefVar;
            case 1:
                sz9 sz9Var2 = (sz9) s69Var;
                sz9Var2.k(sz9Var2.j() + 1);
                return wefVar;
            case 2:
                sz9 sz9Var3 = (sz9) s69Var;
                sz9Var3.k(sz9Var3.j() + 1);
                return wefVar;
            case 3:
                sz9 sz9Var4 = (sz9) s69Var;
                sz9Var4.k(sz9Var4.j() + 1);
                return wefVar;
            case 4:
                sz9 sz9Var5 = (sz9) s69Var;
                sz9Var5.k(sz9Var5.j() + 1);
                return wefVar;
            case 5:
                int iJ = ((sz9) s69Var).j();
                if (1 <= iJ && iJ < 3) {
                    return t72.I(FeedbackReason.TechnicalIssue, FeedbackReason.InaccuratePrediction, FeedbackReason.UnprofessionalContent, FeedbackReason.PoorExperience, FeedbackReason.UnnaturalConversation, FeedbackReason.UnreasonablePrice, FeedbackReason.LackOfPersonalization, FeedbackReason.LongWaitTime, FeedbackReason.UnsatisfactoryResult, FeedbackReason.LimitedFeature, FeedbackReason.NotHelpful, FeedbackReason.Other);
                }
                if (3 > iJ || iJ >= 5) {
                    return iJ == 5 ? t72.I(FeedbackReason.MoreAccuratePrediction, FeedbackReason.MoreDetailReading, FeedbackReason.MorePersonalizedContent, FeedbackReason.SmootherExperience, FeedbackReason.MoreProfessionalKnowledge, FeedbackReason.MoreFeature, FeedbackReason.RecommendToFriend, FeedbackReason.Other) : pu4.a;
                }
                return t72.I(FeedbackReason.ClearerPrediction, FeedbackReason.MoreDetailReading, FeedbackReason.MorePersonalizedContent, FeedbackReason.SmootherExperience, FeedbackReason.MoreReasonablePrice, FeedbackReason.ShorterWaitTime, FeedbackReason.MoreFeature, FeedbackReason.Other);
            case 6:
                int iJ2 = ((sz9) s69Var).j();
                if (iJ2 == 0) {
                    i = R.string.feedback_desc_for_0_star;
                } else if (1 > iJ2 || iJ2 >= 3) {
                    i = (3 > iJ2 || iJ2 >= 5) ? R.string.feedback_desc_for_5_star : R.string.feedback_desc_for_3_4_star;
                } else {
                    i = R.string.feedback_desc_for_1_2_star;
                }
                return Integer.valueOf(i);
            case 7:
                sz9 sz9Var6 = (sz9) s69Var;
                sz9Var6.k(sz9Var6.j() + 1);
                return wefVar;
            case 8:
                sz9 sz9Var7 = (sz9) s69Var;
                sz9Var7.k(sz9Var7.j() + 1);
                return wefVar;
            case 9:
                sz9 sz9Var8 = (sz9) s69Var;
                sz9Var8.k(sz9Var8.j() + 1);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                sz9 sz9Var9 = (sz9) s69Var;
                sz9Var9.k(sz9Var9.j() + 1);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                pr4 pr4Var = d8d.a;
                sz9 sz9Var10 = (sz9) s69Var;
                sz9Var10.k(sz9Var10.j() + 1);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                sz9 sz9Var11 = (sz9) s69Var;
                sz9Var11.k(sz9Var11.j() + 1);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                sz9 sz9Var12 = (sz9) s69Var;
                sz9Var12.k(sz9Var12.j() + 1);
                return wefVar;
            case 14:
                sz9 sz9Var13 = (sz9) s69Var;
                sz9Var13.k(sz9Var13.j() + 1);
                return wefVar;
            default:
                sz9 sz9Var14 = (sz9) s69Var;
                sz9Var14.k(sz9Var14.j() + 1);
                return wefVar;
        }
    }
}
