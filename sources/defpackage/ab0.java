package defpackage;

import ai.askquin.ui.router.AppRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.AppSettings;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab0 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ ab0(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return AppRoute.DailyCardSkinPickerQaRoute._init_$_anonymous_();
            case 1:
                return AppRoute.DailyFortuneReminderQaRoute._init_$_anonymous_();
            case 2:
                return AppRoute.Dev._init_$_anonymous_();
            case 3:
                return AppRoute.ExifTest._init_$_anonymous_();
            case 4:
                return AppRoute.FAQ._init_$_anonymous_();
            case 5:
                return AppRoute.FreeCountDialog._init_$_anonymous_();
            case 6:
                return AppRoute.FriendCoupon._init_$_anonymous_();
            case 7:
                return AppRoute.GiftCardDetail._childSerializers$_anonymous_();
            case 8:
                return AppRoute.GiftCardFixture._childSerializers$_anonymous_();
            case 9:
                return AppRoute.GiftCardGenerationFailedPreview._init_$_anonymous_();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return AppRoute.GiftCardGuidePreview._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return AppRoute.GiftCardList._init_$_anonymous_();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return AppRoute.GiftCardPurchase._init_$_anonymous_();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return AppRoute.InAppMessageRoute._init_$_anonymous_();
            case 14:
                return AppRoute.InputInvitationCode._init_$_anonymous_();
            case 15:
                return AppRoute.Invitation._init_$_anonymous_();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return AppRoute.Main._init_$_anonymous_();
            case 17:
                return AppRoute.MarketingActivityPopup._init_$_anonymous_();
            case 18:
                return AppRoute.MayDayFreeDeckDialog._init_$_anonymous_();
            case 19:
                return AppRoute.MyAccount._init_$_anonymous_();
            case 20:
                return AppRoute.NewTarotSkinsDialog._init_$_anonymous_();
            case 21:
                return AppRoute.NotificationOnboardingQaRoute._init_$_anonymous_();
            case 22:
                return AppRoute.NotificationSettingsRoute._init_$_anonymous_();
            case 23:
                return AppRoute.ThemeSelection._init_$_anonymous_();
            case 24:
                return AppRoute.TomorrowFortuneReminderGuideQaRoute._init_$_anonymous_();
            case 25:
                return AppRoute.WidgetGuideQdDebugRoute._init_$_anonymous_();
            case 26:
                return AppRoute.WidgetGuideTodayDebugRoute._init_$_anonymous_();
            case 27:
                return AppRoute.WidgetOnboardingRoute._init_$_anonymous_();
            case 28:
                return AppSettings._childSerializers$_anonymous_();
            default:
                return ArcanaGroup._init_$_anonymous_();
        }
    }
}
