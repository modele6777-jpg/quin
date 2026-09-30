package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.settings.profile.AccountProfileRoute$AccountEntry;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc9 b;

    public /* synthetic */ l8(dc9 dc9Var, int i) {
        this.a = i;
        this.b = dc9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        TarotSkinIdentify tarotSkinIdentify = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        boolean z = false;
        m1f m1fVar = m1f.a;
        int i3 = 2;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        dc9 dc9Var = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new z4(4), 2);
                dc9Var.g(AppRoute.AutoRenew.INSTANCE);
                break;
            case 1:
                dc9Var.g(AppRoute.AutoRenew.INSTANCE);
                break;
            case 2:
                dc9Var.g(new SkinNavigationRoute$SkinMallRoute(z, (TarotSkinIdentify) (b2 == true ? 1 : 0), i2, (rp3) (b == true ? 1 : 0)));
                break;
            case 3:
                dc9Var.g(AppRoute.FAQ.INSTANCE);
                break;
            case 4:
                dc9Var.g(AppRoute.Invitation.INSTANCE);
                break;
            case 5:
                dc9Var.g(AppRoute.AutoRenew.INSTANCE);
                break;
            case 6:
                x1f x1fVar2 = x1f.a;
                x1f.g(p05Var, m1fVar, new e2d(i2));
                dc9Var.g(AppRoute.Invitation.INSTANCE);
                break;
            case 7:
                x1f x1fVar3 = x1f.a;
                x1f.g(p05Var, m1fVar, new e2d(6));
                dc9Var.g(AppRoute.GiftCardPurchase.INSTANCE);
                break;
            case 8:
                x1f x1fVar4 = x1f.a;
                x1f.g(p05Var, m1fVar, new e2d(i3));
                dc9Var.g(AppRoute.InputInvitationCode.INSTANCE);
                break;
            case 9:
                dc9Var.g(AppRoute.FAQ.INSTANCE);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                dc9Var.g(AppRoute.About.INSTANCE);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                dc9Var.g(AccountProfileRoute$AccountEntry.INSTANCE);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                dc9Var.g(new SkinNavigationRoute$SkinMallRoute(z, tarotSkinIdentify, i3, (rp3) (b3 == true ? 1 : 0)));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                dc9Var.g(AppRoute.NotificationSettingsRoute.INSTANCE);
                break;
            case 14:
                dc9Var.g(AppRoute.ThemeSelection.INSTANCE);
                break;
            case 15:
                x1f x1fVar5 = x1f.a;
                x1f.k(p05Var, new e2d(7), 2);
                dc9Var.g(AppRoute.WidgetOnboardingRoute.INSTANCE);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                dc9Var.g(AppRoute.FriendCoupon.INSTANCE);
                break;
            default:
                x1f x1fVar6 = x1f.a;
                x1f.k(p05Var, new e2d(1), 2);
                dc9Var.g(new AppRoute.Paywall("membership_card", false, false, false, 14, (rp3) null));
                break;
        }
        return wefVar;
    }
}
