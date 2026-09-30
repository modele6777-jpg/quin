package defpackage;

import ai.askquin.App;
import ai.askquin.ui.annual.AnnualDomainReportDetailRoute;
import ai.askquin.ui.annual.AnnualDomainReportSummaryRoute;
import ai.askquin.ui.annual.AnnualDrawingRoute;
import ai.askquin.ui.annual.AnnualEntry;
import ai.askquin.ui.annual.AnnualGenderRoute;
import ai.askquin.ui.annual.AnnualIntroRoute;
import ai.askquin.ui.annual.AnnualMonthlyEntryRoute;
import ai.askquin.ui.annual.AnnualMonthlyReportDetailRoute;
import ai.askquin.ui.annual.AnnualMonthlyReportSummaryRoute;
import ai.askquin.ui.annual.AnnualNicknameRoute;
import ai.askquin.ui.annual.AnnualOverviewReportRoute;
import ai.askquin.ui.annual.AnnualRelationshipRoute;
import ai.askquin.ui.annual.AnnualReportGeneratingRoute;
import ai.askquin.ui.annual.AnnualUserRoleRoute;
import ai.askquin.ui.router.AppRoute;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.annual.model.AnnualLuckResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p10 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ p10(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return AnnualDomainReportDetailRoute._init_$_anonymous_();
            case 1:
                return AnnualDomainReportSummaryRoute._init_$_anonymous_();
            case 2:
                return AnnualDrawingRoute._childSerializers$_anonymous_();
            case 3:
                return AnnualEntry._init_$_anonymous_();
            case 4:
                return AnnualGenderRoute._init_$_anonymous_();
            case 5:
                return AnnualIntroRoute._init_$_anonymous_();
            case 6:
                return 3;
            case 7:
                return AnnualLuckResponse._childSerializers$_anonymous_();
            case 8:
                return AnnualLuckResponse._childSerializers$_anonymous_$0();
            case 9:
                return AnnualMonthlyEntryRoute._init_$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return AnnualMonthlyReportDetailRoute._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return AnnualMonthlyReportSummaryRoute._init_$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return AnnualNicknameRoute._init_$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return AnnualOverviewReportRoute._init_$_anonymous_();
            case 14:
                return AnnualRelationshipRoute._init_$_anonymous_();
            case 15:
                return AnnualReportGeneratingRoute._childSerializers$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                return wefVar;
            case 18:
                return AnnualUserRoleRoute._init_$_anonymous_();
            case 19:
                int i2 = App.a;
                return (hm9) jk9.b.getValue();
            case 20:
                pr4 pr4Var = v70.a;
                return ss3.a;
            case 21:
                pr4 pr4Var2 = v70.a;
                return qk6.x;
            case 22:
                return new wa0(ProcessLifecycleOwner.w.f, new hl(0, l93.a, l93.class, "appOpened", "appOpened()V", 0, 6));
            case 23:
                return AppRoute.About._init_$_anonymous_();
            case 24:
                return AppRoute.AllHistory._init_$_anonymous_();
            case 25:
                return AppRoute.AnnualFortuneMemberDialog._init_$_anonymous_();
            case 26:
                return AppRoute.AutoRenew._init_$_anonymous_();
            case 27:
                return AppRoute.CardDetailQaRoute._init_$_anonymous_();
            case 28:
                return AppRoute.CardLayoutDebug._init_$_anonymous_();
            default:
                return AppRoute.Conversation._init_$_anonymous_();
        }
    }
}
