package defpackage;

import ai.askquin.ui.fourseasons.SeasonalPhysicalCameraRoute;
import ai.askquin.ui.fourseasons.SeasonalPhysicalDrawRoute;
import ai.askquin.ui.fourseasons.SeasonalQuestionRoute;
import ai.askquin.ui.fourseasons.SeasonalRelationshipRoute;
import ai.askquin.ui.fourseasons.SeasonalRoleRoute;
import ai.askquin.ui.fourseasons.SeasonalSpreadEntry;
import ai.askquin.ui.fourseasons.SeasonalSpreadRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$AnalysisHistoryRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Share;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$StartAnalysisRoute;
import ai.askquin.ui.router.AppRoute;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw5 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ vw5(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    @Override // defpackage.x16
    public final Object invoke() {
        boolean z;
        int i;
        int i2 = this.a;
        wef wefVar = wef.a;
        ka9 ka9Var = this.b;
        switch (i2) {
            case 0:
                ka9.e(ka9Var, SeasonalQuestionRoute.INSTANCE, null, 6);
                return wefVar;
            case 1:
                ka9Var.g();
                return wefVar;
            case 2:
                ka9Var.g();
                return wefVar;
            case 3:
                ka9.e(ka9Var, SeasonalRelationshipRoute.INSTANCE, null, 6);
                return wefVar;
            case 4:
                ka9Var.g();
                return wefVar;
            case 5:
                ka9.e(ka9Var, SeasonalRoleRoute.INSTANCE, null, 6);
                return wefVar;
            case 6:
                ka9.e(ka9Var, SeasonalPhysicalDrawRoute.INSTANCE, null, 6);
                return wefVar;
            case 7:
                ka9Var.f(job.a.b(SeasonalSpreadEntry.class), true);
                return wefVar;
            case 8:
                ka9.e(ka9Var, SeasonalPhysicalCameraRoute.INSTANCE, null, 6);
                return wefVar;
            case 9:
                ka9Var.g();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ka9Var.g();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ka9Var.g();
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ka9.e(ka9Var, SeasonalSpreadRoute.INSTANCE, null, 6);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ka9.e(ka9Var, SeasonalSpreadRoute.INSTANCE, null, 6);
                return wefVar;
            case 14:
                ka9Var.g();
                return wefVar;
            case 15:
                yr0 yr0Var = ka9Var.f;
                if (ka9Var.g) {
                    ad0 ad0Var = ka9Var.b.f;
                    if (ad0Var == null || !ad0Var.isEmpty()) {
                        Iterator it = ad0Var.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((da9) it.next()).b instanceof ya9) && (i = i + 1) < 0) {
                                t72.Y();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    z = i > 1;
                }
                yr0Var.f(z);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Context context = ka9Var.a;
                gc9 gc9Var = ka9Var.b.s;
                context.getClass();
                gc9Var.getClass();
                return new nb9();
            case 17:
                ka9Var.g();
                return wefVar;
            case 18:
                ka9.e(ka9Var, PersonalityRoutes$StartAnalysisRoute.INSTANCE, null, 6);
                return wefVar;
            case 19:
                ka9.e(ka9Var, new AppRoute.Paywall("others", false, false, false, 14, (rp3) null), null, 6);
                return wefVar;
            case 20:
                ka9.e(ka9Var, PersonalityRoutes$Share.INSTANCE, null, 6);
                return wefVar;
            case 21:
                ka9.e(ka9Var, PersonalityRoutes$AnalysisHistoryRoute.INSTANCE, null, 6);
                return wefVar;
            case 22:
                ka9Var.g();
                return wefVar;
            case 23:
                ka9Var.g();
                return wefVar;
            case 24:
                ka9Var.g();
                return wefVar;
            case 25:
                ka9Var.g();
                return wefVar;
            case 26:
                ka9Var.g();
                return wefVar;
            case 27:
                ka9Var.g();
                return wefVar;
            case 28:
                ka9Var.g();
                return wefVar;
            default:
                dnc.b(ka9Var);
                return wefVar;
        }
    }
}
