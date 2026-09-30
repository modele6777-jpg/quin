package ai.askquin.ui.router;

import defpackage.ab0;
import defpackage.ag2;
import defpackage.an1;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p10;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:(\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*\u0082\u0001$+,-./0123456789:;<=>?@ABCDEFGHIJKLMN¨\u0006OÀ\u0006\u0003"}, d2 = {"Lai/askquin/ui/router/AppRoute;", "", "Companion", "Main", "StoryRoute", "Conversation", "FollowUpConversation", "Paywall", "FreeCountDialog", "NewTarotSkinsDialog", "MayDayFreeDeckDialog", "NotificationSettingsRoute", "MarketingActivityPopup", "AnnualFortuneMemberDialog", "AllHistory", "MyAccount", "FriendCoupon", "FriendCouponGrantPreview", "FAQ", "InputInvitationCode", "GiftCardPurchase", "GiftCardList", "GiftCardDetail", "GiftCardGuidePreview", "GiftCardGenerationFailedPreview", "GiftCardFixture", "Invitation", "About", "AutoRenew", "InAppMessageRoute", "Dev", "ExifTest", "ThemeSelection", "CardLayoutDebug", "CardDetailQaRoute", "DailyCardSkinPickerQaRoute", "NotificationOnboardingQaRoute", "DailyFortuneReminderQaRoute", "TomorrowFortuneReminderGuideQaRoute", "WidgetOnboardingRoute", "WidgetGuideTodayDebugRoute", "WidgetGuideQdDebugRoute", "ai/askquin/ui/router/a", "Lai/askquin/ui/router/AppRoute$About;", "Lai/askquin/ui/router/AppRoute$AllHistory;", "Lai/askquin/ui/router/AppRoute$AnnualFortuneMemberDialog;", "Lai/askquin/ui/router/AppRoute$AutoRenew;", "Lai/askquin/ui/router/AppRoute$CardDetailQaRoute;", "Lai/askquin/ui/router/AppRoute$CardLayoutDebug;", "Lai/askquin/ui/router/AppRoute$Conversation;", "Lai/askquin/ui/router/AppRoute$DailyCardSkinPickerQaRoute;", "Lai/askquin/ui/router/AppRoute$DailyFortuneReminderQaRoute;", "Lai/askquin/ui/router/AppRoute$FAQ;", "Lai/askquin/ui/router/AppRoute$FollowUpConversation;", "Lai/askquin/ui/router/AppRoute$FreeCountDialog;", "Lai/askquin/ui/router/AppRoute$FriendCoupon;", "Lai/askquin/ui/router/AppRoute$FriendCouponGrantPreview;", "Lai/askquin/ui/router/AppRoute$GiftCardDetail;", "Lai/askquin/ui/router/AppRoute$GiftCardFixture;", "Lai/askquin/ui/router/AppRoute$GiftCardGenerationFailedPreview;", "Lai/askquin/ui/router/AppRoute$GiftCardGuidePreview;", "Lai/askquin/ui/router/AppRoute$GiftCardList;", "Lai/askquin/ui/router/AppRoute$GiftCardPurchase;", "Lai/askquin/ui/router/AppRoute$InputInvitationCode;", "Lai/askquin/ui/router/AppRoute$Invitation;", "Lai/askquin/ui/router/AppRoute$Main;", "Lai/askquin/ui/router/AppRoute$MarketingActivityPopup;", "Lai/askquin/ui/router/AppRoute$MayDayFreeDeckDialog;", "Lai/askquin/ui/router/AppRoute$MyAccount;", "Lai/askquin/ui/router/AppRoute$NewTarotSkinsDialog;", "Lai/askquin/ui/router/AppRoute$NotificationOnboardingQaRoute;", "Lai/askquin/ui/router/AppRoute$NotificationSettingsRoute;", "Lai/askquin/ui/router/AppRoute$Paywall;", "Lai/askquin/ui/router/AppRoute$StoryRoute;", "Lai/askquin/ui/router/AppRoute$ThemeSelection;", "Lai/askquin/ui/router/AppRoute$TomorrowFortuneReminderGuideQaRoute;", "Lai/askquin/ui/router/AppRoute$WidgetGuideQdDebugRoute;", "Lai/askquin/ui/router/AppRoute$WidgetGuideTodayDebugRoute;", "Lai/askquin/ui/router/AppRoute$WidgetOnboardingRoute;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public interface AppRoute {
    public static final a Companion = a.a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$About;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class About implements AppRoute {
        public static final int $stable = 0;
        public static final About INSTANCE = new About();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new p10(23));

        private About() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.About", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof About);
        }

        public int hashCode() {
            return 1252410724;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "About";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$AllHistory;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class AllHistory implements AppRoute {
        public static final int $stable = 0;
        public static final AllHistory INSTANCE = new AllHistory();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new p10(24));

        private AllHistory() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.AllHistory", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AllHistory);
        }

        public int hashCode() {
            return 276269116;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "AllHistory";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$AnnualFortuneMemberDialog;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class AnnualFortuneMemberDialog implements AppRoute {
        public static final int $stable = 0;
        public static final AnnualFortuneMemberDialog INSTANCE = new AnnualFortuneMemberDialog();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new p10(25));

        private AnnualFortuneMemberDialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.AnnualFortuneMemberDialog", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AnnualFortuneMemberDialog);
        }

        public int hashCode() {
            return -1699293349;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "AnnualFortuneMemberDialog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$AutoRenew;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class AutoRenew implements AppRoute {
        public static final int $stable = 0;
        public static final AutoRenew INSTANCE = new AutoRenew();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new p10(26));

        private AutoRenew() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.AutoRenew", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AutoRenew);
        }

        public int hashCode() {
            return 197513333;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "AutoRenew";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$CardDetailQaRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class CardDetailQaRoute implements AppRoute {
        public static final int $stable = 0;
        public static final CardDetailQaRoute INSTANCE = new CardDetailQaRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new p10(27));

        private CardDetailQaRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.CardDetailQaRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardDetailQaRoute);
        }

        public int hashCode() {
            return 760215215;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CardDetailQaRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$CardLayoutDebug;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class CardLayoutDebug implements AppRoute {
        public static final int $stable = 0;
        public static final CardLayoutDebug INSTANCE = new CardLayoutDebug();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new p10(28));

        private CardLayoutDebug() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.CardLayoutDebug", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardLayoutDebug);
        }

        public int hashCode() {
            return -43271888;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CardLayoutDebug";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$Conversation;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Conversation implements AppRoute {
        public static final int $stable = 0;
        public static final Conversation INSTANCE = new Conversation();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new p10(29));

        private Conversation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.Conversation", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Conversation);
        }

        public int hashCode() {
            return 1422019276;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Conversation";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$DailyCardSkinPickerQaRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class DailyCardSkinPickerQaRoute implements AppRoute {
        public static final int $stable = 0;
        public static final DailyCardSkinPickerQaRoute INSTANCE = new DailyCardSkinPickerQaRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(0));

        private DailyCardSkinPickerQaRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.DailyCardSkinPickerQaRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DailyCardSkinPickerQaRoute);
        }

        public int hashCode() {
            return 2108636142;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DailyCardSkinPickerQaRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$DailyFortuneReminderQaRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class DailyFortuneReminderQaRoute implements AppRoute {
        public static final int $stable = 0;
        public static final DailyFortuneReminderQaRoute INSTANCE = new DailyFortuneReminderQaRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(1));

        private DailyFortuneReminderQaRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.DailyFortuneReminderQaRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DailyFortuneReminderQaRoute);
        }

        public int hashCode() {
            return -371820842;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DailyFortuneReminderQaRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lai/askquin/ui/router/AppRoute$Dev;", "", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Dev {
        public static final int $stable = 0;
        public static final Dev INSTANCE = new Dev();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(2));

        private Dev() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.Dev", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Dev);
        }

        public int hashCode() {
            return 1172254636;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Dev";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lai/askquin/ui/router/AppRoute$ExifTest;", "", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ExifTest {
        public static final int $stable = 0;
        public static final ExifTest INSTANCE = new ExifTest();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(3));

        private ExifTest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.ExifTest", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ExifTest);
        }

        public int hashCode() {
            return 727016587;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ExifTest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$FAQ;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class FAQ implements AppRoute {
        public static final int $stable = 0;
        public static final FAQ INSTANCE = new FAQ();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(4));

        private FAQ() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.FAQ", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FAQ);
        }

        public int hashCode() {
            return 1172255405;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "FAQ";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$FreeCountDialog;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class FreeCountDialog implements AppRoute {
        public static final int $stable = 0;
        public static final FreeCountDialog INSTANCE = new FreeCountDialog();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(5));

        private FreeCountDialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.FreeCountDialog", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FreeCountDialog);
        }

        public int hashCode() {
            return -670922174;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "FreeCountDialog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$FriendCoupon;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class FriendCoupon implements AppRoute {
        public static final int $stable = 0;
        public static final FriendCoupon INSTANCE = new FriendCoupon();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(6));

        private FriendCoupon() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.FriendCoupon", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FriendCoupon);
        }

        public int hashCode() {
            return -38056275;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "FriendCoupon";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$GiftCardGenerationFailedPreview;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class GiftCardGenerationFailedPreview implements AppRoute {
        public static final int $stable = 0;
        public static final GiftCardGenerationFailedPreview INSTANCE = new GiftCardGenerationFailedPreview();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(9));

        private GiftCardGenerationFailedPreview() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.GiftCardGenerationFailedPreview", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof GiftCardGenerationFailedPreview);
        }

        public int hashCode() {
            return 1248937258;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "GiftCardGenerationFailedPreview";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$GiftCardGuidePreview;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class GiftCardGuidePreview implements AppRoute {
        public static final int $stable = 0;
        public static final GiftCardGuidePreview INSTANCE = new GiftCardGuidePreview();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(10));

        private GiftCardGuidePreview() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.GiftCardGuidePreview", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof GiftCardGuidePreview);
        }

        public int hashCode() {
            return -856537355;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "GiftCardGuidePreview";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$GiftCardList;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class GiftCardList implements AppRoute {
        public static final int $stable = 0;
        public static final GiftCardList INSTANCE = new GiftCardList();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(11));

        private GiftCardList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.GiftCardList", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof GiftCardList);
        }

        public int hashCode() {
            return -628513945;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "GiftCardList";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$GiftCardPurchase;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class GiftCardPurchase implements AppRoute {
        public static final int $stable = 0;
        public static final GiftCardPurchase INSTANCE = new GiftCardPurchase();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(12));

        private GiftCardPurchase() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.GiftCardPurchase", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof GiftCardPurchase);
        }

        public int hashCode() {
            return -2071499958;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "GiftCardPurchase";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lai/askquin/ui/router/AppRoute$InAppMessageRoute;", "", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class InAppMessageRoute {
        public static final int $stable = 0;
        public static final InAppMessageRoute INSTANCE = new InAppMessageRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(13));

        private InAppMessageRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.InAppMessageRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InAppMessageRoute);
        }

        public int hashCode() {
            return -1990818123;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "InAppMessageRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$InputInvitationCode;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class InputInvitationCode implements AppRoute {
        public static final int $stable = 0;
        public static final InputInvitationCode INSTANCE = new InputInvitationCode();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(14));

        private InputInvitationCode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.InputInvitationCode", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InputInvitationCode);
        }

        public int hashCode() {
            return -875463385;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "InputInvitationCode";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$Invitation;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Invitation implements AppRoute {
        public static final int $stable = 0;
        public static final Invitation INSTANCE = new Invitation();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(15));

        private Invitation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.Invitation", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Invitation);
        }

        public int hashCode() {
            return -846404574;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Invitation";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$Main;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Main implements AppRoute {
        public static final int $stable = 0;
        public static final Main INSTANCE = new Main();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(16));

        private Main() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.Main", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Main);
        }

        public int hashCode() {
            return 1980419330;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Main";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$MarketingActivityPopup;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class MarketingActivityPopup implements AppRoute {
        public static final int $stable = 0;
        public static final MarketingActivityPopup INSTANCE = new MarketingActivityPopup();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(17));

        private MarketingActivityPopup() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.MarketingActivityPopup", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MarketingActivityPopup);
        }

        public int hashCode() {
            return -1682073248;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MarketingActivityPopup";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$MayDayFreeDeckDialog;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class MayDayFreeDeckDialog implements AppRoute {
        public static final int $stable = 0;
        public static final MayDayFreeDeckDialog INSTANCE = new MayDayFreeDeckDialog();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(18));

        private MayDayFreeDeckDialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.MayDayFreeDeckDialog", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MayDayFreeDeckDialog);
        }

        public int hashCode() {
            return -1384303619;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MayDayFreeDeckDialog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$MyAccount;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class MyAccount implements AppRoute {
        public static final int $stable = 0;
        public static final MyAccount INSTANCE = new MyAccount();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(19));

        private MyAccount() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.MyAccount", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MyAccount);
        }

        public int hashCode() {
            return 18610488;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MyAccount";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$NewTarotSkinsDialog;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class NewTarotSkinsDialog implements AppRoute {
        public static final int $stable = 0;
        public static final NewTarotSkinsDialog INSTANCE = new NewTarotSkinsDialog();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(20));

        private NewTarotSkinsDialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.NewTarotSkinsDialog", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NewTarotSkinsDialog);
        }

        public int hashCode() {
            return 4011051;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NewTarotSkinsDialog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$NotificationOnboardingQaRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class NotificationOnboardingQaRoute implements AppRoute {
        public static final int $stable = 0;
        public static final NotificationOnboardingQaRoute INSTANCE = new NotificationOnboardingQaRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(21));

        private NotificationOnboardingQaRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.NotificationOnboardingQaRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NotificationOnboardingQaRoute);
        }

        public int hashCode() {
            return -1728089430;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NotificationOnboardingQaRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$NotificationSettingsRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class NotificationSettingsRoute implements AppRoute {
        public static final int $stable = 0;
        public static final NotificationSettingsRoute INSTANCE = new NotificationSettingsRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(22));

        private NotificationSettingsRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.NotificationSettingsRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NotificationSettingsRoute);
        }

        public int hashCode() {
            return -1105546990;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "NotificationSettingsRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$ThemeSelection;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class ThemeSelection implements AppRoute {
        public static final int $stable = 0;
        public static final ThemeSelection INSTANCE = new ThemeSelection();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(23));

        private ThemeSelection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.ThemeSelection", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ThemeSelection);
        }

        public int hashCode() {
            return -1349087796;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ThemeSelection";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$TomorrowFortuneReminderGuideQaRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class TomorrowFortuneReminderGuideQaRoute implements AppRoute {
        public static final int $stable = 0;
        public static final TomorrowFortuneReminderGuideQaRoute INSTANCE = new TomorrowFortuneReminderGuideQaRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(24));

        private TomorrowFortuneReminderGuideQaRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.TomorrowFortuneReminderGuideQaRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TomorrowFortuneReminderGuideQaRoute);
        }

        public int hashCode() {
            return 1989118018;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "TomorrowFortuneReminderGuideQaRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$WidgetGuideQdDebugRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class WidgetGuideQdDebugRoute implements AppRoute {
        public static final int $stable = 0;
        public static final WidgetGuideQdDebugRoute INSTANCE = new WidgetGuideQdDebugRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(25));

        private WidgetGuideQdDebugRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.WidgetGuideQdDebugRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WidgetGuideQdDebugRoute);
        }

        public int hashCode() {
            return -1799816328;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "WidgetGuideQdDebugRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$WidgetGuideTodayDebugRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class WidgetGuideTodayDebugRoute implements AppRoute {
        public static final int $stable = 0;
        public static final WidgetGuideTodayDebugRoute INSTANCE = new WidgetGuideTodayDebugRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(26));

        private WidgetGuideTodayDebugRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.WidgetGuideTodayDebugRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WidgetGuideTodayDebugRoute);
        }

        public int hashCode() {
            return -1912870360;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "WidgetGuideTodayDebugRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lai/askquin/ui/router/AppRoute$WidgetOnboardingRoute;", "Lai/askquin/ui/router/AppRoute;", "<init>", "()V", "Lxn7;", "serializer", "()Lxn7;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class WidgetOnboardingRoute implements AppRoute {
        public static final int $stable = 0;
        public static final WidgetOnboardingRoute INSTANCE = new WidgetOnboardingRoute();
        private static final /* synthetic */ lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ab0(27));

        private WidgetOnboardingRoute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _init_$_anonymous_() {
            return new wn2("ai.askquin.ui.router.AppRoute.WidgetOnboardingRoute", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ xn7 get$cachedSerializer() {
            return (xn7) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WidgetOnboardingRoute);
        }

        public int hashCode() {
            return 1867367905;
        }

        public final xn7 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "WidgetOnboardingRoute";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\u0015¨\u0006%"}, d2 = {"Lai/askquin/ui/router/AppRoute$FriendCouponGrantPreview;", "Lai/askquin/ui/router/AppRoute;", "", "isAnnual", "<init>", "(Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(IZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/router/AppRoute$FriendCouponGrantPreview;Lag2;Lnyc;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lai/askquin/ui/router/AppRoute$FriendCouponGrantPreview;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Companion", "ai/askquin/ui/router/d", "ai/askquin/ui/router/e", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class FriendCouponGrantPreview implements AppRoute {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final boolean isAnnual;

        public /* synthetic */ FriendCouponGrantPreview(int i, boolean z, xyc xycVar) {
            if (1 == (i & 1)) {
                this.isAnnual = z;
            } else {
                an1.R(i, 1, d.a.e());
                throw null;
            }
        }

        public static /* synthetic */ FriendCouponGrantPreview copy$default(FriendCouponGrantPreview friendCouponGrantPreview, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = friendCouponGrantPreview.isAnnual;
            }
            return friendCouponGrantPreview.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsAnnual() {
            return this.isAnnual;
        }

        public final FriendCouponGrantPreview copy(boolean isAnnual) {
            return new FriendCouponGrantPreview(isAnnual);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FriendCouponGrantPreview) && this.isAnnual == ((FriendCouponGrantPreview) other).isAnnual;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAnnual);
        }

        public final boolean isAnnual() {
            return this.isAnnual;
        }

        public String toString() {
            return "FriendCouponGrantPreview(isAnnual=" + this.isAnnual + ")";
        }

        public FriendCouponGrantPreview(boolean z) {
            this.isAnnual = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lai/askquin/ui/router/AppRoute$GiftCardFixture;", "Lai/askquin/ui/router/AppRoute;", "Lai/askquin/ui/router/GiftCardFixtureScenario;", "scenario", "<init>", "(Lai/askquin/ui/router/GiftCardFixtureScenario;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/ui/router/GiftCardFixtureScenario;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/router/AppRoute$GiftCardFixture;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/ui/router/GiftCardFixtureScenario;", "copy", "(Lai/askquin/ui/router/GiftCardFixtureScenario;)Lai/askquin/ui/router/AppRoute$GiftCardFixture;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/ui/router/GiftCardFixtureScenario;", "getScenario", "Companion", "ai/askquin/ui/router/h", "ai/askquin/ui/router/i", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class GiftCardFixture implements AppRoute {
        public static final int $stable = 0;
        private final GiftCardFixtureScenario scenario;
        public static final i Companion = new i();
        private static final lw7[] $childSerializers = {eb3.N(z18.b, new ab0(8))};

        public /* synthetic */ GiftCardFixture(int i, GiftCardFixtureScenario giftCardFixtureScenario, xyc xycVar) {
            if (1 == (i & 1)) {
                this.scenario = giftCardFixtureScenario;
            } else {
                an1.R(i, 1, h.a.e());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return GiftCardFixtureScenario.Companion.serializer();
        }

        public static /* synthetic */ GiftCardFixture copy$default(GiftCardFixture giftCardFixture, GiftCardFixtureScenario giftCardFixtureScenario, int i, Object obj) {
            if ((i & 1) != 0) {
                giftCardFixtureScenario = giftCardFixture.scenario;
            }
            return giftCardFixture.copy(giftCardFixtureScenario);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GiftCardFixtureScenario getScenario() {
            return this.scenario;
        }

        public final GiftCardFixture copy(GiftCardFixtureScenario scenario) {
            scenario.getClass();
            return new GiftCardFixture(scenario);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GiftCardFixture) && this.scenario == ((GiftCardFixture) other).scenario;
        }

        public final GiftCardFixtureScenario getScenario() {
            return this.scenario;
        }

        public int hashCode() {
            return this.scenario.hashCode();
        }

        public String toString() {
            return "GiftCardFixture(scenario=" + this.scenario + ")";
        }

        public GiftCardFixture(GiftCardFixtureScenario giftCardFixtureScenario) {
            giftCardFixtureScenario.getClass();
            this.scenario = giftCardFixtureScenario;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lai/askquin/ui/router/AppRoute$StoryRoute;", "Lai/askquin/ui/router/AppRoute;", "", "sid", "title", "", "likes", "", "hasLiked", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/router/AppRoute$StoryRoute;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;IZ)Lai/askquin/ui/router/AppRoute$StoryRoute;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSid", "getTitle", "I", "getLikes", "Z", "getHasLiked", "Companion", "ai/askquin/ui/router/l", "ai/askquin/ui/router/m", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class StoryRoute implements AppRoute {
        public static final int $stable = 0;
        public static final m Companion = new m();
        private final boolean hasLiked;
        private final int likes;
        private final String sid;
        private final String title;

        public /* synthetic */ StoryRoute(int i, String str, String str2, int i2, boolean z, xyc xycVar) {
            if (15 != (i & 15)) {
                an1.R(i, 15, l.a.e());
                throw null;
            }
            this.sid = str;
            this.title = str2;
            this.likes = i2;
            this.hasLiked = z;
        }

        public static /* synthetic */ StoryRoute copy$default(StoryRoute storyRoute, String str, String str2, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = storyRoute.sid;
            }
            if ((i2 & 2) != 0) {
                str2 = storyRoute.title;
            }
            if ((i2 & 4) != 0) {
                i = storyRoute.likes;
            }
            if ((i2 & 8) != 0) {
                z = storyRoute.hasLiked;
            }
            return storyRoute.copy(str, str2, i, z);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(StoryRoute self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.sid);
            output.w(serialDesc, 1, self.title);
            output.v(2, self.likes, serialDesc);
            output.o(serialDesc, 3, self.hasLiked);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSid() {
            return this.sid;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getLikes() {
            return this.likes;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getHasLiked() {
            return this.hasLiked;
        }

        public final StoryRoute copy(String sid, String title, int likes, boolean hasLiked) {
            sid.getClass();
            title.getClass();
            return new StoryRoute(sid, title, likes, hasLiked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoryRoute)) {
                return false;
            }
            StoryRoute storyRoute = (StoryRoute) other;
            return pa7.t(this.sid, storyRoute.sid) && pa7.t(this.title, storyRoute.title) && this.likes == storyRoute.likes && this.hasLiked == storyRoute.hasLiked;
        }

        public final boolean getHasLiked() {
            return this.hasLiked;
        }

        public final int getLikes() {
            return this.likes;
        }

        public final String getSid() {
            return this.sid;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasLiked) + ub3.b(this.likes, ub3.c(this.sid.hashCode() * 31, 31, this.title), 31);
        }

        public String toString() {
            String str = this.sid;
            String str2 = this.title;
            int i = this.likes;
            boolean z = this.hasLiked;
            StringBuilder sbO = ib8.o("StoryRoute(sid=", str, ", title=", str2, ", likes=");
            sbO.append(i);
            sbO.append(", hasLiked=");
            sbO.append(z);
            sbO.append(")");
            return sbO.toString();
        }

        public StoryRoute(String str, String str2, int i, boolean z) {
            str.getClass();
            str2.getClass();
            this.sid = str;
            this.title = str2;
            this.likes = i;
            this.hasLiked = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lai/askquin/ui/router/AppRoute$GiftCardDetail;", "Lai/askquin/ui/router/AppRoute;", "", "cardId", "Lai/askquin/ui/router/GiftCardPerspective;", "perspective", "", "purchaseSuccess", "<init>", "(Ljava/lang/String;Lai/askquin/ui/router/GiftCardPerspective;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Lai/askquin/ui/router/GiftCardPerspective;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/router/AppRoute$GiftCardDetail;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lai/askquin/ui/router/GiftCardPerspective;", "component3", "()Z", "copy", "(Ljava/lang/String;Lai/askquin/ui/router/GiftCardPerspective;Z)Lai/askquin/ui/router/AppRoute$GiftCardDetail;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardId", "Lai/askquin/ui/router/GiftCardPerspective;", "getPerspective", "Z", "getPurchaseSuccess", "Companion", "ai/askquin/ui/router/f", "ai/askquin/ui/router/g", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class GiftCardDetail implements AppRoute {
        public static final int $stable = 0;
        private final String cardId;
        private final GiftCardPerspective perspective;
        private final boolean purchaseSuccess;
        public static final g Companion = new g();
        private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new ab0(7)), null};

        public /* synthetic */ GiftCardDetail(int i, String str, GiftCardPerspective giftCardPerspective, boolean z, xyc xycVar) {
            if (3 != (i & 3)) {
                an1.R(i, 3, f.a.e());
                throw null;
            }
            this.cardId = str;
            this.perspective = giftCardPerspective;
            if ((i & 4) == 0) {
                this.purchaseSuccess = false;
            } else {
                this.purchaseSuccess = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
            return GiftCardPerspective.Companion.serializer();
        }

        public static /* synthetic */ GiftCardDetail copy$default(GiftCardDetail giftCardDetail, String str, GiftCardPerspective giftCardPerspective, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = giftCardDetail.cardId;
            }
            if ((i & 2) != 0) {
                giftCardPerspective = giftCardDetail.perspective;
            }
            if ((i & 4) != 0) {
                z = giftCardDetail.purchaseSuccess;
            }
            return giftCardDetail.copy(str, giftCardPerspective, z);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(GiftCardDetail self, ag2 output, nyc serialDesc) {
            lw7[] lw7VarArr = $childSerializers;
            output.w(serialDesc, 0, self.cardId);
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.perspective);
            if (output.g(serialDesc) || self.purchaseSuccess) {
                output.o(serialDesc, 2, self.purchaseSuccess);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final GiftCardPerspective getPerspective() {
            return this.perspective;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getPurchaseSuccess() {
            return this.purchaseSuccess;
        }

        public final GiftCardDetail copy(String cardId, GiftCardPerspective perspective, boolean purchaseSuccess) {
            cardId.getClass();
            perspective.getClass();
            return new GiftCardDetail(cardId, perspective, purchaseSuccess);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GiftCardDetail)) {
                return false;
            }
            GiftCardDetail giftCardDetail = (GiftCardDetail) other;
            return pa7.t(this.cardId, giftCardDetail.cardId) && this.perspective == giftCardDetail.perspective && this.purchaseSuccess == giftCardDetail.purchaseSuccess;
        }

        public final String getCardId() {
            return this.cardId;
        }

        public final GiftCardPerspective getPerspective() {
            return this.perspective;
        }

        public final boolean getPurchaseSuccess() {
            return this.purchaseSuccess;
        }

        public int hashCode() {
            return Boolean.hashCode(this.purchaseSuccess) + ((this.perspective.hashCode() + (this.cardId.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.cardId;
            GiftCardPerspective giftCardPerspective = this.perspective;
            boolean z = this.purchaseSuccess;
            StringBuilder sb = new StringBuilder("GiftCardDetail(cardId=");
            sb.append(str);
            sb.append(", perspective=");
            sb.append(giftCardPerspective);
            sb.append(", purchaseSuccess=");
            return ub3.m(sb, z, ")");
        }

        public GiftCardDetail(String str, GiftCardPerspective giftCardPerspective, boolean z) {
            str.getClass();
            giftCardPerspective.getClass();
            this.cardId = str;
            this.perspective = giftCardPerspective;
            this.purchaseSuccess = z;
        }

        public /* synthetic */ GiftCardDetail(String str, GiftCardPerspective giftCardPerspective, boolean z, int i, rp3 rp3Var) {
            this(str, giftCardPerspective, (i & 4) != 0 ? false : z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lai/askquin/ui/router/AppRoute$FollowUpConversation;", "Lai/askquin/ui/router/AppRoute;", "", "parentChatId", "triggerMessageId", "prefilledQuestion", "childChatId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/router/AppRoute$FollowUpConversation;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/router/AppRoute$FollowUpConversation;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getParentChatId", "getTriggerMessageId", "getPrefilledQuestion", "getChildChatId", "Companion", "ai/askquin/ui/router/b", "ai/askquin/ui/router/c", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class FollowUpConversation implements AppRoute {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String childChatId;
        private final String parentChatId;
        private final String prefilledQuestion;
        private final String triggerMessageId;

        public /* synthetic */ FollowUpConversation(int i, String str, String str2, String str3, String str4, xyc xycVar) {
            if (7 != (i & 7)) {
                an1.R(i, 7, b.a.e());
                throw null;
            }
            this.parentChatId = str;
            this.triggerMessageId = str2;
            this.prefilledQuestion = str3;
            if ((i & 8) == 0) {
                this.childChatId = null;
            } else {
                this.childChatId = str4;
            }
        }

        public static /* synthetic */ FollowUpConversation copy$default(FollowUpConversation followUpConversation, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = followUpConversation.parentChatId;
            }
            if ((i & 2) != 0) {
                str2 = followUpConversation.triggerMessageId;
            }
            if ((i & 4) != 0) {
                str3 = followUpConversation.prefilledQuestion;
            }
            if ((i & 8) != 0) {
                str4 = followUpConversation.childChatId;
            }
            return followUpConversation.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(FollowUpConversation self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.parentChatId);
            output.w(serialDesc, 1, self.triggerMessageId);
            output.w(serialDesc, 2, self.prefilledQuestion);
            if (!output.g(serialDesc) && self.childChatId == null) {
                return;
            }
            output.A(serialDesc, 3, p4e.a, self.childChatId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getParentChatId() {
            return this.parentChatId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTriggerMessageId() {
            return this.triggerMessageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPrefilledQuestion() {
            return this.prefilledQuestion;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getChildChatId() {
            return this.childChatId;
        }

        public final FollowUpConversation copy(String parentChatId, String triggerMessageId, String prefilledQuestion, String childChatId) {
            parentChatId.getClass();
            triggerMessageId.getClass();
            prefilledQuestion.getClass();
            return new FollowUpConversation(parentChatId, triggerMessageId, prefilledQuestion, childChatId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FollowUpConversation)) {
                return false;
            }
            FollowUpConversation followUpConversation = (FollowUpConversation) other;
            return pa7.t(this.parentChatId, followUpConversation.parentChatId) && pa7.t(this.triggerMessageId, followUpConversation.triggerMessageId) && pa7.t(this.prefilledQuestion, followUpConversation.prefilledQuestion) && pa7.t(this.childChatId, followUpConversation.childChatId);
        }

        public final String getChildChatId() {
            return this.childChatId;
        }

        public final String getParentChatId() {
            return this.parentChatId;
        }

        public final String getPrefilledQuestion() {
            return this.prefilledQuestion;
        }

        public final String getTriggerMessageId() {
            return this.triggerMessageId;
        }

        public int hashCode() {
            int iC = ub3.c(ub3.c(this.parentChatId.hashCode() * 31, 31, this.triggerMessageId), 31, this.prefilledQuestion);
            String str = this.childChatId;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.parentChatId;
            String str2 = this.triggerMessageId;
            return ks0.m(ib8.o("FollowUpConversation(parentChatId=", str, ", triggerMessageId=", str2, ", prefilledQuestion="), this.prefilledQuestion, ", childChatId=", this.childChatId, ")");
        }

        public FollowUpConversation(String str, String str2, String str3, String str4) {
            tec.x(str, str2, str3);
            this.parentChatId = str;
            this.triggerMessageId = str2;
            this.prefilledQuestion = str3;
            this.childChatId = str4;
        }

        public /* synthetic */ FollowUpConversation(String str, String str2, String str3, String str4, int i, rp3 rp3Var) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @tyc
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001b¨\u00060"}, d2 = {"Lai/askquin/ui/router/AppRoute$Paywall;", "Lai/askquin/ui/router/AppRoute;", "", "source", "", "forSpread", "onlyAddOn", "ignoreSale", "<init>", "(Ljava/lang/String;ZZZ)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;ZZZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/router/AppRoute$Paywall;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZZZ)Lai/askquin/ui/router/AppRoute$Paywall;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "Z", "getForSpread", "getOnlyAddOn", "getIgnoreSale", "Companion", "ai/askquin/ui/router/j", "ai/askquin/ui/router/k", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* data */ class Paywall implements AppRoute {
        public static final int $stable = 0;
        public static final k Companion = new k();
        private final boolean forSpread;
        private final boolean ignoreSale;
        private final boolean onlyAddOn;
        private final String source;

        public /* synthetic */ Paywall(int i, String str, boolean z, boolean z2, boolean z3, xyc xycVar) {
            if (1 != (i & 1)) {
                an1.R(i, 1, j.a.e());
                throw null;
            }
            this.source = str;
            if ((i & 2) == 0) {
                this.forSpread = false;
            } else {
                this.forSpread = z;
            }
            if ((i & 4) == 0) {
                this.onlyAddOn = false;
            } else {
                this.onlyAddOn = z2;
            }
            if ((i & 8) == 0) {
                this.ignoreSale = false;
            } else {
                this.ignoreSale = z3;
            }
        }

        public static /* synthetic */ Paywall copy$default(Paywall paywall, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paywall.source;
            }
            if ((i & 2) != 0) {
                z = paywall.forSpread;
            }
            if ((i & 4) != 0) {
                z2 = paywall.onlyAddOn;
            }
            if ((i & 8) != 0) {
                z3 = paywall.ignoreSale;
            }
            return paywall.copy(str, z, z2, z3);
        }

        public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(Paywall self, ag2 output, nyc serialDesc) {
            output.w(serialDesc, 0, self.source);
            if (output.g(serialDesc) || self.forSpread) {
                output.o(serialDesc, 1, self.forSpread);
            }
            if (output.g(serialDesc) || self.onlyAddOn) {
                output.o(serialDesc, 2, self.onlyAddOn);
            }
            if (output.g(serialDesc) || self.ignoreSale) {
                output.o(serialDesc, 3, self.ignoreSale);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getForSpread() {
            return this.forSpread;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getOnlyAddOn() {
            return this.onlyAddOn;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIgnoreSale() {
            return this.ignoreSale;
        }

        public final Paywall copy(String source, boolean forSpread, boolean onlyAddOn, boolean ignoreSale) {
            source.getClass();
            return new Paywall(source, forSpread, onlyAddOn, ignoreSale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paywall)) {
                return false;
            }
            Paywall paywall = (Paywall) other;
            return pa7.t(this.source, paywall.source) && this.forSpread == paywall.forSpread && this.onlyAddOn == paywall.onlyAddOn && this.ignoreSale == paywall.ignoreSale;
        }

        public final boolean getForSpread() {
            return this.forSpread;
        }

        public final boolean getIgnoreSale() {
            return this.ignoreSale;
        }

        public final boolean getOnlyAddOn() {
            return this.onlyAddOn;
        }

        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return Boolean.hashCode(this.ignoreSale) + ub3.d(ub3.d(this.source.hashCode() * 31, 31, this.forSpread), 31, this.onlyAddOn);
        }

        public String toString() {
            return "Paywall(source=" + this.source + ", forSpread=" + this.forSpread + ", onlyAddOn=" + this.onlyAddOn + ", ignoreSale=" + this.ignoreSale + ")";
        }

        public Paywall(String str, boolean z, boolean z2, boolean z3) {
            str.getClass();
            this.source = str;
            this.forSpread = z;
            this.onlyAddOn = z2;
            this.ignoreSale = z3;
        }

        public /* synthetic */ Paywall(String str, boolean z, boolean z2, boolean z3, int i, rp3 rp3Var) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
    }
}
