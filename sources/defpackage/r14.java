package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.AnnualEntry;
import ai.askquin.ui.onboard.OnboardAuthRoute;
import ai.askquin.ui.onboard.OnboardRealTarotRoute;
import ai.askquin.ui.onboard.OnboardThemeSelectionRoute;
import ai.askquin.ui.onboard.OnboardWantKnowRoute;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.g;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r14 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb9 b;

    public /* synthetic */ r14(cb9 cb9Var, int i) {
        this.a = i;
        this.b = cb9Var;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    @Override // defpackage.x16
    public final Object invoke() {
        Object onboardAuthRoute;
        int i = this.a;
        int i2 = 3;
        boolean z = false;
        TarotSkinIdentify tarotSkinIdentify = null;
        byte b = 0;
        wef wefVar = wef.a;
        cb9 cb9Var = this.b;
        switch (i) {
            case 0:
                ka9.e(cb9Var, g.b(PaywallRoute.Companion, false, 3), null, 6);
                break;
            case 1:
                ka9.e(cb9Var, new PaywallRoute.InterceptPaywall("dev", (String) null, (String) null, (String) null, (String) null, 30, (rp3) null), null, 6);
                break;
            case 2:
                ka9.e(cb9Var, g.a(PaywallRoute.Companion, null, null), null, 6);
                break;
            case 3:
                ka9.e(cb9Var, new OnboardWantKnowRoute(false), null, 6);
                break;
            case 4:
                ka9.e(cb9Var, OnboardThemeSelectionRoute.INSTANCE, null, 6);
                break;
            case 5:
                ka9.e(cb9Var, new OnboardAuthRoute(false, false, false, 7, (rp3) null), null, 6);
                break;
            case 6:
                hs3 hs3Var = xqa.a;
                if (((Boolean) z5c.I(nu4.a, new ro9(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                    onboardAuthRoute = new OnboardAuthRoute(false, false, false, 7, (rp3) null);
                } else {
                    ca2.a.getClass();
                    if (ca2.c) {
                        onboardAuthRoute = new OnboardAuthRoute(false, false, false, 7, (rp3) null);
                    } else {
                        onboardAuthRoute = OnboardRealTarotRoute.INSTANCE;
                    }
                }
                ka9.e(cb9Var, onboardAuthRoute, null, 6);
                break;
            case 7:
                ka9.e(cb9Var, new OnboardAuthRoute(true, false, false, 6, (rp3) null), null, 6);
                break;
            case 8:
                ka9.e(cb9Var, new OnboardWantKnowRoute(true), null, 6);
                break;
            case 9:
                cb9Var.g();
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                cb9Var.g();
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ka9.e(cb9Var, AppRoute.AutoRenew.INSTANCE, null, 6);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                cb9Var.g();
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                cb9Var.g();
                break;
            case 14:
                cb9Var.g();
                break;
            case 15:
                cb9Var.g();
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                cb9Var.g();
                break;
            case 17:
                cb9Var.g();
                break;
            case 18:
                cb9Var.g();
                break;
            case 19:
                cb9Var.g();
                ka9.e(cb9Var, new SkinNavigationRoute$SkinMallRoute(z, tarotSkinIdentify, i2, (rp3) (b == true ? 1 : 0)), null, 6);
                break;
            case 20:
                cb9Var.g();
                break;
            case 21:
                cb9Var.g();
                break;
            case 22:
                cb9Var.g();
                ka9.e(cb9Var, AppRoute.FriendCoupon.INSTANCE, null, 6);
                break;
            case 23:
                cb9Var.g();
                break;
            case 24:
                cb9Var.g();
                break;
            case 25:
                cb9Var.g();
                break;
            case 26:
                ka9.e(cb9Var, AnnualEntry.INSTANCE, null, 6);
                break;
            case 27:
                cb9Var.g();
                break;
            case 28:
                cb9Var.g();
                break;
            default:
                cb9Var.g();
                break;
        }
        return wefVar;
    }
}
