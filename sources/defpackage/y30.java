package defpackage;

import ai.askquin.ui.annual.AnnualDomainReportDetailRoute;
import ai.askquin.ui.annual.AnnualDrawingRoute;
import ai.askquin.ui.annual.AnnualEntry;
import ai.askquin.ui.annual.AnnualGenderRoute;
import ai.askquin.ui.annual.AnnualMonthlyReportDetailRoute;
import ai.askquin.ui.annual.AnnualMonthlyReportSummaryRoute;
import ai.askquin.ui.annual.AnnualOverviewReportRoute;
import ai.askquin.ui.annual.AnnualShareURLRoute;
import ai.askquin.ui.annual.model.AnnualActionFor;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y30 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ y30(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        ka9 ka9Var = this.b;
        switch (i) {
            case 0:
                h40.a(ka9Var);
                break;
            case 1:
                ka9.h(ka9Var, AnnualEntry.INSTANCE, true);
                break;
            case 2:
                ka9.e(ka9Var, new AnnualShareURLRoute("YR2026_intro"), null, 6);
                break;
            case 3:
                h40.a(ka9Var);
                break;
            case 4:
                ka9.e(ka9Var, new AnnualDrawingRoute(AnnualActionFor.Monthly, 0, 2, (rp3) null), null, 6);
                break;
            case 5:
                h40.a(ka9Var);
                break;
            case 6:
                h40.a(ka9Var);
                break;
            case 7:
                ka9.e(ka9Var, AnnualMonthlyReportDetailRoute.INSTANCE, null, 6);
                break;
            case 8:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new zv(15), 2);
                ka9.h(ka9Var, AnnualEntry.INSTANCE, true);
                ka9.e(ka9Var, AnnualMonthlyReportSummaryRoute.INSTANCE, null, 6);
                break;
            case 9:
                h40.a(ka9Var);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ka9.e(ka9Var, new AnnualShareURLRoute("YR2026_yearSummary"), null, 6);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                h40.a(ka9Var);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ka9Var.g();
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new zv(16), 2);
                ka9.e(ka9Var, AnnualDomainReportDetailRoute.INSTANCE, null, 6);
                break;
            case 14:
                ka9Var.g();
                break;
            case 15:
                h40.a(ka9Var);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                h40.a(ka9Var);
                break;
            case 17:
                ka9Var.g();
                break;
            case 18:
                h40.a(ka9Var);
                break;
            case 19:
                ka9Var.g();
                break;
            case 20:
                ka9.e(ka9Var, new AnnualDrawingRoute(AnnualActionFor.Domain, 0, 2, (rp3) null), null, 6);
                break;
            case 21:
                h40.a(ka9Var);
                break;
            case 22:
                ka9Var.g();
                break;
            case 23:
                x1f x1fVar3 = x1f.a;
                x1f.k(p05Var, new zv(17), 2);
                ka9.e(ka9Var, AnnualOverviewReportRoute.INSTANCE, null, 6);
                break;
            case 24:
                ka9Var.g();
                break;
            case 25:
                h40.a(ka9Var);
                break;
            case 26:
                ka9Var.g();
                break;
            case 27:
                h40.a(ka9Var);
                break;
            case 28:
                h40.a(ka9Var);
                break;
            default:
                ka9.e(ka9Var, AnnualGenderRoute.INSTANCE, null, 6);
                break;
        }
        return wefVar;
    }
}
