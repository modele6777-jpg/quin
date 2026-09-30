package defpackage;

import ai.askquin.ui.annual.AnnualEntry;
import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.draw.navhost.UnifiedDrawingRoute;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.fourseasons.SeasonalSpreadEntry;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.g;
import ai.askquin.ui.router.AppRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a40 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ a40(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        ka9 ka9Var = this.b;
        switch (i) {
            case 0:
                ka9Var.g();
                break;
            case 1:
                h40.a(ka9Var);
                break;
            case 2:
                ka9.e(ka9Var, AppRoute.NewTarotSkinsDialog.INSTANCE, null, 6);
                break;
            case 3:
                ka9.e(ka9Var, AppRoute.FreeCountDialog.INSTANCE, null, 6);
                break;
            case 4:
                ka9.e(ka9Var, new AppRoute.Paywall("dev", false, false, false, 14, (rp3) null), null, 6);
                break;
            case 5:
                ka9.e(ka9Var, AnnualEntry.INSTANCE, null, 6);
                break;
            case 6:
                SeasonalSpreadEntry.Companion.getClass();
                yic yicVarC = rmc.c(mic.SummerSolstice2026);
                ka9.e(ka9Var, new SeasonalSpreadEntry(yicVarC.a, yicVarC.b.getWireValue(), false), null, 6);
                break;
            case 7:
                ka9.e(ka9Var, AppRoute.CardLayoutDebug.INSTANCE, null, 6);
                break;
            case 8:
                ka9.e(ka9Var, AppRoute.MayDayFreeDeckDialog.INSTANCE, null, 6);
                break;
            case 9:
                ka9.e(ka9Var, new PaywallRoute.UpgradePaywall(1, false, (String) null, (String) null, (List) null, 30, (rp3) null), null, 6);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ka9.e(ka9Var, new PaywallRoute.UpgradePaywall(0, false, (String) null, (String) null, (List) null, 30, (rp3) null), null, 6);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ka9.e(ka9Var, AppRoute.AnnualFortuneMemberDialog.INSTANCE, null, 6);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ka9.e(ka9Var, AppRoute.MarketingActivityPopup.INSTANCE, null, 6);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ka9.e(ka9Var, AppRoute.NotificationSettingsRoute.INSTANCE, null, 6);
                break;
            case 14:
                ka9.e(ka9Var, AppRoute.WidgetOnboardingRoute.INSTANCE, null, 6);
                break;
            case 15:
                ka9.e(ka9Var, AppRoute.WidgetGuideTodayDebugRoute.INSTANCE, null, 6);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ka9.e(ka9Var, AppRoute.WidgetGuideQdDebugRoute.INSTANCE, null, 6);
                break;
            case 17:
                isa isaVar = xqa.H0.a;
                qn2 qn2Var = lw2.a;
                ynb.V(qn2Var, null, null, new y64(isaVar, "", null), 3);
                hs3 hs3Var = xqa.E0;
                ynb.V(qn2Var, null, null, new b74(hs3Var.a, Boolean.FALSE, null), 3);
                ka9.h(ka9Var, AppRoute.Main.INSTANCE, false);
                String string = LocalDate.now().toString();
                string.getClass();
                ka9.e(ka9Var, new DailyCardEntry("dev", string), null, 6);
                break;
            case 18:
                ka9.e(ka9Var, new PaywallRoute.AddonPaywall("conversation", (String) null, (String) null, true, 6, (rp3) null), null, 6);
                break;
            case 19:
                ka9.e(ka9Var, new PaywallRoute.InterceptPaywall("conversation", (String) null, (String) null, (String) null, (String) null, 30, (rp3) null), null, 6);
                break;
            case 20:
                ka9.e(ka9Var, g.b(PaywallRoute.Companion, true, 1), null, 6);
                break;
            case 21:
                ka9.e(ka9Var, AppRoute.ExifTest.INSTANCE, null, 6);
                break;
            case 22:
                ka9Var.d(new hl4(4), new UnifiedDrawingRoute(false, false, 3, (rp3) null));
                break;
            case 23:
                ka9Var.g();
                break;
            case 24:
                ka9Var.g();
                break;
            case 25:
                ka9Var.f(job.a.b(FourSeasonsEntry.class), true);
                break;
            case 26:
                ka9Var.g();
                break;
            case 27:
                ka9Var.g();
                break;
            case 28:
                ka9Var.g();
                break;
            default:
                ka9Var.g();
                break;
        }
        return wefVar;
    }
}
