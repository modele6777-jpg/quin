package tech.chatmind.api.credits;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.bze;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.g11;
import defpackage.i7b;
import defpackage.ib8;
import defpackage.k7e;
import defpackage.lw7;
import defpackage.nf6;
import defpackage.nyc;
import defpackage.o58;
import defpackage.pa7;
import defpackage.pye;
import defpackage.qw2;
import defpackage.rp3;
import defpackage.sab;
import defpackage.t2a;
import defpackage.tab;
import defpackage.tw2;
import defpackage.tyc;
import defpackage.uab;
import defpackage.ub3;
import defpackage.vd0;
import defpackage.wa2;
import defpackage.whf;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.CompensateCount;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.PayAsYouGo;
import tech.chatmind.api.Period;
import tech.chatmind.api.TimesMembership;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 n2\u00020\u0001:\u0002opB¿\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB»\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b8\u00109JÌ\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\bD\u0010*J\u0012\u0010E\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\bE\u0010FJ'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010NR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bS\u0010(R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010T\u001a\u0004\bU\u0010*R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bV\u0010*R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010WR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b[\u0010/R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\b\\\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010]\u001a\u0004\b^\u00102R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00104R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\ba\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u00107R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010d\u001a\u0004\be\u00109R\u0011\u0010g\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bf\u0010@R\u0011\u0010i\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bh\u0010@R\u0013\u0010k\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bj\u00102R\u0011\u0010m\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bl\u00104¨\u0006q"}, d2 = {"Ltech/chatmind/api/credits/QuotaUsage;", "", "Ltech/chatmind/api/credits/SubscriptionInfo;", "subscription", "Ltech/chatmind/api/credits/TokenUsage;", "token", "", "Ltech/chatmind/api/CountV2;", "countV2", "quinCardCount", "futureTarotCount", "Ltech/chatmind/api/PayAsYouGo;", "payAsYouGo", "Ltech/chatmind/api/CompensateCount;", "compensateCount", "Ltech/chatmind/api/TimesMembership;", "timesMembership", "Ltech/chatmind/api/LimitedQuota;", "limitedQuotaList", "", "neverPurchased", "hasPurchasedGiftCard", "hasPurchasedAllTarotCards", "Ltech/chatmind/api/credits/UsageBilling;", "usageBilling", "Ltech/chatmind/api/credits/GuestPassBalance;", "guestPass", "<init>", "(Ltech/chatmind/api/credits/SubscriptionInfo;Ltech/chatmind/api/credits/TokenUsage;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/PayAsYouGo;Ltech/chatmind/api/CompensateCount;Ltech/chatmind/api/TimesMembership;Ljava/util/List;Ljava/lang/Boolean;ZZLtech/chatmind/api/credits/UsageBilling;Ltech/chatmind/api/credits/GuestPassBalance;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/credits/SubscriptionInfo;Ltech/chatmind/api/credits/TokenUsage;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/PayAsYouGo;Ltech/chatmind/api/CompensateCount;Ltech/chatmind/api/TimesMembership;Ljava/util/List;Ljava/lang/Boolean;ZZLtech/chatmind/api/credits/UsageBilling;Ltech/chatmind/api/credits/GuestPassBalance;Lxyc;)V", "Lqw2;", "getCountData", "()Lqw2;", "component1", "()Ltech/chatmind/api/credits/SubscriptionInfo;", "component2", "()Ltech/chatmind/api/credits/TokenUsage;", "component3", "()Ljava/util/List;", "component5", "component7", "()Ltech/chatmind/api/CompensateCount;", "component8", "()Ltech/chatmind/api/TimesMembership;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "()Z", "component12", "component13", "()Ltech/chatmind/api/credits/UsageBilling;", "component14", "()Ltech/chatmind/api/credits/GuestPassBalance;", "copy", "(Ltech/chatmind/api/credits/SubscriptionInfo;Ltech/chatmind/api/credits/TokenUsage;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/PayAsYouGo;Ltech/chatmind/api/CompensateCount;Ltech/chatmind/api/TimesMembership;Ljava/util/List;Ljava/lang/Boolean;ZZLtech/chatmind/api/credits/UsageBilling;Ltech/chatmind/api/credits/GuestPassBalance;)Ltech/chatmind/api/credits/QuotaUsage;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "component4", "component6", "()Ltech/chatmind/api/PayAsYouGo;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/credits/QuotaUsage;Lag2;Lnyc;)V", "write$Self", "Ltech/chatmind/api/credits/SubscriptionInfo;", "getSubscription", "Ltech/chatmind/api/credits/TokenUsage;", "getToken", "Ljava/util/List;", "getCountV2", "getFutureTarotCount", "Ltech/chatmind/api/PayAsYouGo;", "Ltech/chatmind/api/CompensateCount;", "getCompensateCount", "Ltech/chatmind/api/TimesMembership;", "getTimesMembership", "getLimitedQuotaList", "Ljava/lang/Boolean;", "getNeverPurchased", "Z", "getHasPurchasedGiftCard", "getHasPurchasedAllTarotCards", "Ltech/chatmind/api/credits/UsageBilling;", "getUsageBilling", "Ltech/chatmind/api/credits/GuestPassBalance;", "getGuestPass", "getTestReportCount", "testReportCount", "getSeasonalReadingCount", "seasonalReadingCount", "getSeasonalReadingUnlocked", "seasonalReadingUnlocked", "getHasSubscription", "hasSubscription", "Companion", "tab", "sab", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class QuotaUsage {
    private static final lw7[] $childSerializers;
    private final CompensateCount compensateCount;
    private final List<CountV2> countV2;
    private final List<CountV2> futureTarotCount;
    private final GuestPassBalance guestPass;
    private final boolean hasPurchasedAllTarotCards;
    private final boolean hasPurchasedGiftCard;
    private final List<LimitedQuota> limitedQuotaList;
    private final Boolean neverPurchased;
    private final PayAsYouGo payAsYouGo;
    private final List<CountV2> quinCardCount;
    private final SubscriptionInfo subscription;
    private final TimesMembership timesMembership;
    private final TokenUsage token;
    private final UsageBilling usageBilling;
    public static final tab Companion = new tab();
    public static final int $stable = (((GuestPassPendingGrant.$stable | TimesMembership.$stable) | CompensateCount.$stable) | PayAsYouGo.$stable) | Period.$stable;

    static {
        i7b i7bVar = new i7b(7);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, eb3.N(z18Var, i7bVar), eb3.N(z18Var, new i7b(8)), eb3.N(z18Var, new i7b(9)), null, null, null, eb3.N(z18Var, new i7b(10)), null, null, null, null, null};
    }

    public /* synthetic */ QuotaUsage(int i, SubscriptionInfo subscriptionInfo, TokenUsage tokenUsage, List list, List list2, List list3, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List list4, Boolean bool, boolean z, boolean z2, UsageBilling usageBilling, GuestPassBalance guestPassBalance, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, sab.a.e());
            throw null;
        }
        this.subscription = subscriptionInfo;
        this.token = tokenUsage;
        if ((i & 4) == 0) {
            this.countV2 = null;
        } else {
            this.countV2 = list;
        }
        if ((i & 8) == 0) {
            this.quinCardCount = null;
        } else {
            this.quinCardCount = list2;
        }
        if ((i & 16) == 0) {
            this.futureTarotCount = null;
        } else {
            this.futureTarotCount = list3;
        }
        if ((i & 32) == 0) {
            this.payAsYouGo = new PayAsYouGo(0, 0, (Boolean) null, 6, (rp3) null);
        } else {
            this.payAsYouGo = payAsYouGo;
        }
        if ((i & 64) == 0) {
            this.compensateCount = null;
        } else {
            this.compensateCount = compensateCount;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.timesMembership = null;
        } else {
            this.timesMembership = timesMembership;
        }
        if ((i & 256) == 0) {
            this.limitedQuotaList = null;
        } else {
            this.limitedQuotaList = list4;
        }
        if ((i & 512) == 0) {
            this.neverPurchased = null;
        } else {
            this.neverPurchased = bool;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.hasPurchasedGiftCard = false;
        } else {
            this.hasPurchasedGiftCard = z;
        }
        if ((i & 2048) == 0) {
            this.hasPurchasedAllTarotCards = false;
        } else {
            this.hasPurchasedAllTarotCards = z2;
        }
        if ((i & 4096) == 0) {
            this.usageBilling = null;
        } else {
            this.usageBilling = usageBilling;
        }
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
            this.guestPass = null;
        } else {
            this.guestPass = guestPassBalance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(tw2.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(tw2.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(tw2.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$2() {
        return new dd0(o58.a, 0);
    }

    private final List<CountV2> component4() {
        return this.quinCardCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final PayAsYouGo getPayAsYouGo() {
        return this.payAsYouGo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(QuotaUsage self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.A(serialDesc, 0, k7e.a, self.subscription);
        output.A(serialDesc, 1, bze.a, self.token);
        if (output.g(serialDesc) || self.countV2 != null) {
            output.A(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.countV2);
        }
        if (output.g(serialDesc) || self.quinCardCount != null) {
            output.A(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.quinCardCount);
        }
        if (output.g(serialDesc) || self.futureTarotCount != null) {
            output.A(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.futureTarotCount);
        }
        if (output.g(serialDesc)) {
            output.A(serialDesc, 5, t2a.a, self.payAsYouGo);
        } else {
            if (!pa7.t(self.payAsYouGo, new PayAsYouGo(0, 0, (Boolean) null, 6, (rp3) null))) {
                output.A(serialDesc, 5, t2a.a, self.payAsYouGo);
            }
        }
        if (output.g(serialDesc) || self.compensateCount != null) {
            output.A(serialDesc, 6, wa2.a, self.compensateCount);
        }
        if (output.g(serialDesc) || self.timesMembership != null) {
            output.A(serialDesc, 7, pye.a, self.timesMembership);
        }
        if (output.g(serialDesc) || self.limitedQuotaList != null) {
            output.A(serialDesc, 8, (xn7) lw7VarArr[8].getValue(), self.limitedQuotaList);
        }
        if (output.g(serialDesc) || self.neverPurchased != null) {
            output.A(serialDesc, 9, g11.a, self.neverPurchased);
        }
        if (output.g(serialDesc) || self.hasPurchasedGiftCard) {
            output.o(serialDesc, 10, self.hasPurchasedGiftCard);
        }
        if (output.g(serialDesc) || self.hasPurchasedAllTarotCards) {
            output.o(serialDesc, 11, self.hasPurchasedAllTarotCards);
        }
        if (output.g(serialDesc) || self.usageBilling != null) {
            output.A(serialDesc, 12, whf.a, self.usageBilling);
        }
        if (!output.g(serialDesc) && self.guestPass == null) {
            return;
        }
        output.A(serialDesc, 13, nf6.a, self.guestPass);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SubscriptionInfo getSubscription() {
        return this.subscription;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getNeverPurchased() {
        return this.neverPurchased;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHasPurchasedGiftCard() {
        return this.hasPurchasedGiftCard;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getHasPurchasedAllTarotCards() {
        return this.hasPurchasedAllTarotCards;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final UsageBilling getUsageBilling() {
        return this.usageBilling;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final GuestPassBalance getGuestPass() {
        return this.guestPass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TokenUsage getToken() {
        return this.token;
    }

    public final List<CountV2> component3() {
        return this.countV2;
    }

    public final List<CountV2> component5() {
        return this.futureTarotCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CompensateCount getCompensateCount() {
        return this.compensateCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TimesMembership getTimesMembership() {
        return this.timesMembership;
    }

    public final List<LimitedQuota> component9() {
        return this.limitedQuotaList;
    }

    public final QuotaUsage copy(SubscriptionInfo subscription, TokenUsage token, List<CountV2> countV2, List<CountV2> quinCardCount, List<CountV2> futureTarotCount, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List<LimitedQuota> limitedQuotaList, Boolean neverPurchased, boolean hasPurchasedGiftCard, boolean hasPurchasedAllTarotCards, UsageBilling usageBilling, GuestPassBalance guestPass) {
        return new QuotaUsage(subscription, token, countV2, quinCardCount, futureTarotCount, payAsYouGo, compensateCount, timesMembership, limitedQuotaList, neverPurchased, hasPurchasedGiftCard, hasPurchasedAllTarotCards, usageBilling, guestPass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuotaUsage)) {
            return false;
        }
        QuotaUsage quotaUsage = (QuotaUsage) other;
        return pa7.t(this.subscription, quotaUsage.subscription) && pa7.t(this.token, quotaUsage.token) && pa7.t(this.countV2, quotaUsage.countV2) && pa7.t(this.quinCardCount, quotaUsage.quinCardCount) && pa7.t(this.futureTarotCount, quotaUsage.futureTarotCount) && pa7.t(this.payAsYouGo, quotaUsage.payAsYouGo) && pa7.t(this.compensateCount, quotaUsage.compensateCount) && pa7.t(this.timesMembership, quotaUsage.timesMembership) && pa7.t(this.limitedQuotaList, quotaUsage.limitedQuotaList) && pa7.t(this.neverPurchased, quotaUsage.neverPurchased) && this.hasPurchasedGiftCard == quotaUsage.hasPurchasedGiftCard && this.hasPurchasedAllTarotCards == quotaUsage.hasPurchasedAllTarotCards && pa7.t(this.usageBilling, quotaUsage.usageBilling) && pa7.t(this.guestPass, quotaUsage.guestPass);
    }

    public final CompensateCount getCompensateCount() {
        return this.compensateCount;
    }

    public final qw2 getCountData() {
        return this.countV2 == null ? vd0.X : new uab(this);
    }

    public final List<CountV2> getCountV2() {
        return this.countV2;
    }

    public final List<CountV2> getFutureTarotCount() {
        return this.futureTarotCount;
    }

    public final GuestPassBalance getGuestPass() {
        return this.guestPass;
    }

    public final boolean getHasPurchasedAllTarotCards() {
        return this.hasPurchasedAllTarotCards;
    }

    public final boolean getHasPurchasedGiftCard() {
        return this.hasPurchasedGiftCard;
    }

    public final boolean getHasSubscription() {
        SubscriptionInfo subscriptionInfo = this.subscription;
        String plan = subscriptionInfo != null ? subscriptionInfo.getPlan() : null;
        return !(plan == null || plan.length() == 0);
    }

    public final List<LimitedQuota> getLimitedQuotaList() {
        return this.limitedQuotaList;
    }

    public final Boolean getNeverPurchased() {
        return this.neverPurchased;
    }

    public final int getSeasonalReadingCount() {
        PayAsYouGo payAsYouGo = this.payAsYouGo;
        if (payAsYouGo != null) {
            return payAsYouGo.getSeasonalReadingCount();
        }
        return 0;
    }

    public final Boolean getSeasonalReadingUnlocked() {
        PayAsYouGo payAsYouGo = this.payAsYouGo;
        if (payAsYouGo != null) {
            return payAsYouGo.getSeasonalReadingUnlocked();
        }
        return null;
    }

    public final SubscriptionInfo getSubscription() {
        return this.subscription;
    }

    public final int getTestReportCount() {
        PayAsYouGo payAsYouGo = this.payAsYouGo;
        if (payAsYouGo != null) {
            return payAsYouGo.getTestReportCount();
        }
        return 0;
    }

    public final TimesMembership getTimesMembership() {
        return this.timesMembership;
    }

    public final TokenUsage getToken() {
        return this.token;
    }

    public final UsageBilling getUsageBilling() {
        return this.usageBilling;
    }

    public int hashCode() {
        SubscriptionInfo subscriptionInfo = this.subscription;
        int iHashCode = (subscriptionInfo == null ? 0 : subscriptionInfo.hashCode()) * 31;
        TokenUsage tokenUsage = this.token;
        int iHashCode2 = (iHashCode + (tokenUsage == null ? 0 : tokenUsage.hashCode())) * 31;
        List<CountV2> list = this.countV2;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<CountV2> list2 = this.quinCardCount;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CountV2> list3 = this.futureTarotCount;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        PayAsYouGo payAsYouGo = this.payAsYouGo;
        int iHashCode6 = (iHashCode5 + (payAsYouGo == null ? 0 : payAsYouGo.hashCode())) * 31;
        CompensateCount compensateCount = this.compensateCount;
        int iHashCode7 = (iHashCode6 + (compensateCount == null ? 0 : compensateCount.hashCode())) * 31;
        TimesMembership timesMembership = this.timesMembership;
        int iHashCode8 = (iHashCode7 + (timesMembership == null ? 0 : timesMembership.hashCode())) * 31;
        List<LimitedQuota> list4 = this.limitedQuotaList;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.neverPurchased;
        int iD = ub3.d(ub3.d((iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.hasPurchasedGiftCard), 31, this.hasPurchasedAllTarotCards);
        UsageBilling usageBilling = this.usageBilling;
        int iHashCode10 = (iD + (usageBilling == null ? 0 : usageBilling.hashCode())) * 31;
        GuestPassBalance guestPassBalance = this.guestPass;
        return iHashCode10 + (guestPassBalance != null ? guestPassBalance.hashCode() : 0);
    }

    public String toString() {
        SubscriptionInfo subscriptionInfo = this.subscription;
        TokenUsage tokenUsage = this.token;
        List<CountV2> list = this.countV2;
        List<CountV2> list2 = this.quinCardCount;
        List<CountV2> list3 = this.futureTarotCount;
        PayAsYouGo payAsYouGo = this.payAsYouGo;
        CompensateCount compensateCount = this.compensateCount;
        TimesMembership timesMembership = this.timesMembership;
        List<LimitedQuota> list4 = this.limitedQuotaList;
        Boolean bool = this.neverPurchased;
        boolean z = this.hasPurchasedGiftCard;
        boolean z2 = this.hasPurchasedAllTarotCards;
        UsageBilling usageBilling = this.usageBilling;
        GuestPassBalance guestPassBalance = this.guestPass;
        StringBuilder sb = new StringBuilder("QuotaUsage(subscription=");
        sb.append(subscriptionInfo);
        sb.append(", token=");
        sb.append(tokenUsage);
        sb.append(", countV2=");
        sb.append(list);
        sb.append(", quinCardCount=");
        sb.append(list2);
        sb.append(", futureTarotCount=");
        sb.append(list3);
        sb.append(", payAsYouGo=");
        sb.append(payAsYouGo);
        sb.append(", compensateCount=");
        sb.append(compensateCount);
        sb.append(", timesMembership=");
        sb.append(timesMembership);
        sb.append(", limitedQuotaList=");
        sb.append(list4);
        sb.append(", neverPurchased=");
        sb.append(bool);
        sb.append(", hasPurchasedGiftCard=");
        ib8.w(sb, z, ", hasPurchasedAllTarotCards=", z2, ", usageBilling=");
        sb.append(usageBilling);
        sb.append(", guestPass=");
        sb.append(guestPassBalance);
        sb.append(")");
        return sb.toString();
    }

    public QuotaUsage(SubscriptionInfo subscriptionInfo, TokenUsage tokenUsage, List<CountV2> list, List<CountV2> list2, List<CountV2> list3, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List<LimitedQuota> list4, Boolean bool, boolean z, boolean z2, UsageBilling usageBilling, GuestPassBalance guestPassBalance) {
        this.subscription = subscriptionInfo;
        this.token = tokenUsage;
        this.countV2 = list;
        this.quinCardCount = list2;
        this.futureTarotCount = list3;
        this.payAsYouGo = payAsYouGo;
        this.compensateCount = compensateCount;
        this.timesMembership = timesMembership;
        this.limitedQuotaList = list4;
        this.neverPurchased = bool;
        this.hasPurchasedGiftCard = z;
        this.hasPurchasedAllTarotCards = z2;
        this.usageBilling = usageBilling;
        this.guestPass = guestPassBalance;
    }

    public /* synthetic */ QuotaUsage(SubscriptionInfo subscriptionInfo, TokenUsage tokenUsage, List list, List list2, List list3, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List list4, Boolean bool, boolean z, boolean z2, UsageBilling usageBilling, GuestPassBalance guestPassBalance, int i, rp3 rp3Var) {
        this(subscriptionInfo, tokenUsage, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? new PayAsYouGo(0, 0, (Boolean) null, 6, (rp3) null) : payAsYouGo, (i & 64) != 0 ? null : compensateCount, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : timesMembership, (i & 256) != 0 ? null : list4, (i & 512) != 0 ? null : bool, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? null : usageBilling, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : guestPassBalance);
    }
}
