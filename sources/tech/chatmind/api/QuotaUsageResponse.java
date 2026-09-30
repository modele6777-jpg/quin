package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.abb;
import defpackage.ag2;
import defpackage.an1;
import defpackage.bbb;
import defpackage.cg6;
import defpackage.d7e;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.gif;
import defpackage.i7b;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.o58;
import defpackage.pa7;
import defpackage.pye;
import defpackage.rp3;
import defpackage.t2a;
import defpackage.tec;
import defpackage.tw2;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wa2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zye;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0002deB¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB¹\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b3\u00102J\u0010\u00104\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b7\u00108JÂ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00132\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bO\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bP\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bQ\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010R\u001a\u0004\bS\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010T\u001a\u0004\bU\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010V\u001a\u0004\bW\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bY\u0010/R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bZ\u0010%R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010[\u001a\u0004\b\\\u00102R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\b]\u00102R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010[\u001a\u0004\b^\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010_\u001a\u0004\b`\u00106R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010a\u001a\u0004\bb\u00108¨\u0006f"}, d2 = {"Ltech/chatmind/api/QuotaUsageResponse;", "", "Ltech/chatmind/api/SubscriptionData;", "subscription", "", "Ltech/chatmind/api/CountV2;", "countV2", "quinCardCount", "futureTarotCount", "Ltech/chatmind/api/TokenData;", "token", "Ltech/chatmind/api/PayAsYouGo;", "payAsYouGo", "Ltech/chatmind/api/CompensateCount;", "compensateCount", "Ltech/chatmind/api/TimesMembership;", "timesMembership", "Ltech/chatmind/api/LimitedQuota;", "limitedQuotaList", "", "neverPurchased", "hasPurchasedGiftCard", "hasPurchasedAllTarotCards", "Ltech/chatmind/api/UsageBillingResponse;", "usageBilling", "Ltech/chatmind/api/GuestPassResponse;", "guestPass", "<init>", "(Ltech/chatmind/api/SubscriptionData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/TokenData;Ltech/chatmind/api/PayAsYouGo;Ltech/chatmind/api/CompensateCount;Ltech/chatmind/api/TimesMembership;Ljava/util/List;ZZZLtech/chatmind/api/UsageBillingResponse;Ltech/chatmind/api/GuestPassResponse;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/SubscriptionData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/TokenData;Ltech/chatmind/api/PayAsYouGo;Ltech/chatmind/api/CompensateCount;Ltech/chatmind/api/TimesMembership;Ljava/util/List;ZZZLtech/chatmind/api/UsageBillingResponse;Ltech/chatmind/api/GuestPassResponse;Lxyc;)V", "component1", "()Ltech/chatmind/api/SubscriptionData;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Ltech/chatmind/api/TokenData;", "component6", "()Ltech/chatmind/api/PayAsYouGo;", "component7", "()Ltech/chatmind/api/CompensateCount;", "component8", "()Ltech/chatmind/api/TimesMembership;", "component9", "component10", "()Z", "component11", "component12", "component13", "()Ltech/chatmind/api/UsageBillingResponse;", "component14", "()Ltech/chatmind/api/GuestPassResponse;", "copy", "(Ltech/chatmind/api/SubscriptionData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/TokenData;Ltech/chatmind/api/PayAsYouGo;Ltech/chatmind/api/CompensateCount;Ltech/chatmind/api/TimesMembership;Ljava/util/List;ZZZLtech/chatmind/api/UsageBillingResponse;Ltech/chatmind/api/GuestPassResponse;)Ltech/chatmind/api/QuotaUsageResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/QuotaUsageResponse;Lag2;Lnyc;)V", "write$Self", "Ltech/chatmind/api/SubscriptionData;", "getSubscription", "Ljava/util/List;", "getCountV2", "getQuinCardCount", "getFutureTarotCount", "Ltech/chatmind/api/TokenData;", "getToken", "Ltech/chatmind/api/PayAsYouGo;", "getPayAsYouGo", "Ltech/chatmind/api/CompensateCount;", "getCompensateCount", "Ltech/chatmind/api/TimesMembership;", "getTimesMembership", "getLimitedQuotaList", "Z", "getNeverPurchased", "getHasPurchasedGiftCard", "getHasPurchasedAllTarotCards", "Ltech/chatmind/api/UsageBillingResponse;", "getUsageBilling", "Ltech/chatmind/api/GuestPassResponse;", "getGuestPass", "Companion", "abb", "bbb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class QuotaUsageResponse {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final bbb Companion = new bbb();
    private final CompensateCount compensateCount;
    private final List<CountV2> countV2;
    private final List<CountV2> futureTarotCount;
    private final GuestPassResponse guestPass;
    private final boolean hasPurchasedAllTarotCards;
    private final boolean hasPurchasedGiftCard;
    private final List<LimitedQuota> limitedQuotaList;
    private final boolean neverPurchased;
    private final PayAsYouGo payAsYouGo;
    private final List<CountV2> quinCardCount;
    private final SubscriptionData subscription;
    private final TimesMembership timesMembership;
    private final TokenData token;
    private final UsageBillingResponse usageBilling;

    static {
        i7b i7bVar = new i7b(11);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, i7bVar), eb3.N(z18Var, new i7b(12)), eb3.N(z18Var, new i7b(13)), null, null, null, null, eb3.N(z18Var, new i7b(14)), null, null, null, null, null};
    }

    public /* synthetic */ QuotaUsageResponse(int i, SubscriptionData subscriptionData, List list, List list2, List list3, TokenData tokenData, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List list4, boolean z, boolean z2, boolean z3, UsageBillingResponse usageBillingResponse, GuestPassResponse guestPassResponse, xyc xycVar) {
        if (1023 != (i & 1023)) {
            an1.R(i, 1023, abb.a.e());
            throw null;
        }
        this.subscription = subscriptionData;
        this.countV2 = list;
        this.quinCardCount = list2;
        this.futureTarotCount = list3;
        this.token = tokenData;
        this.payAsYouGo = payAsYouGo;
        this.compensateCount = compensateCount;
        this.timesMembership = timesMembership;
        this.limitedQuotaList = list4;
        this.neverPurchased = z;
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.hasPurchasedGiftCard = false;
        } else {
            this.hasPurchasedGiftCard = z2;
        }
        if ((i & 2048) == 0) {
            this.hasPurchasedAllTarotCards = false;
        } else {
            this.hasPurchasedAllTarotCards = z3;
        }
        if ((i & 4096) == 0) {
            this.usageBilling = null;
        } else {
            this.usageBilling = usageBillingResponse;
        }
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
            this.guestPass = null;
        } else {
            this.guestPass = guestPassResponse;
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

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(QuotaUsageResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.A(serialDesc, 0, d7e.a, self.subscription);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.countV2);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.quinCardCount);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.futureTarotCount);
        output.A(serialDesc, 4, zye.a, self.token);
        output.p(serialDesc, 5, t2a.a, self.payAsYouGo);
        output.A(serialDesc, 6, wa2.a, self.compensateCount);
        output.A(serialDesc, 7, pye.a, self.timesMembership);
        output.A(serialDesc, 8, (xn7) lw7VarArr[8].getValue(), self.limitedQuotaList);
        output.o(serialDesc, 9, self.neverPurchased);
        if (output.g(serialDesc) || self.hasPurchasedGiftCard) {
            output.o(serialDesc, 10, self.hasPurchasedGiftCard);
        }
        if (output.g(serialDesc) || self.hasPurchasedAllTarotCards) {
            output.o(serialDesc, 11, self.hasPurchasedAllTarotCards);
        }
        if (output.g(serialDesc) || self.usageBilling != null) {
            output.A(serialDesc, 12, gif.a, self.usageBilling);
        }
        if (!output.g(serialDesc) && self.guestPass == null) {
            return;
        }
        output.A(serialDesc, 13, cg6.a, self.guestPass);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SubscriptionData getSubscription() {
        return this.subscription;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getNeverPurchased() {
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
    public final UsageBillingResponse getUsageBilling() {
        return this.usageBilling;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final GuestPassResponse getGuestPass() {
        return this.guestPass;
    }

    public final List<CountV2> component2() {
        return this.countV2;
    }

    public final List<CountV2> component3() {
        return this.quinCardCount;
    }

    public final List<CountV2> component4() {
        return this.futureTarotCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TokenData getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PayAsYouGo getPayAsYouGo() {
        return this.payAsYouGo;
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

    public final QuotaUsageResponse copy(SubscriptionData subscription, List<CountV2> countV2, List<CountV2> quinCardCount, List<CountV2> futureTarotCount, TokenData token, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List<LimitedQuota> limitedQuotaList, boolean neverPurchased, boolean hasPurchasedGiftCard, boolean hasPurchasedAllTarotCards, UsageBillingResponse usageBilling, GuestPassResponse guestPass) {
        countV2.getClass();
        quinCardCount.getClass();
        futureTarotCount.getClass();
        payAsYouGo.getClass();
        return new QuotaUsageResponse(subscription, countV2, quinCardCount, futureTarotCount, token, payAsYouGo, compensateCount, timesMembership, limitedQuotaList, neverPurchased, hasPurchasedGiftCard, hasPurchasedAllTarotCards, usageBilling, guestPass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuotaUsageResponse)) {
            return false;
        }
        QuotaUsageResponse quotaUsageResponse = (QuotaUsageResponse) other;
        return pa7.t(this.subscription, quotaUsageResponse.subscription) && pa7.t(this.countV2, quotaUsageResponse.countV2) && pa7.t(this.quinCardCount, quotaUsageResponse.quinCardCount) && pa7.t(this.futureTarotCount, quotaUsageResponse.futureTarotCount) && pa7.t(this.token, quotaUsageResponse.token) && pa7.t(this.payAsYouGo, quotaUsageResponse.payAsYouGo) && pa7.t(this.compensateCount, quotaUsageResponse.compensateCount) && pa7.t(this.timesMembership, quotaUsageResponse.timesMembership) && pa7.t(this.limitedQuotaList, quotaUsageResponse.limitedQuotaList) && this.neverPurchased == quotaUsageResponse.neverPurchased && this.hasPurchasedGiftCard == quotaUsageResponse.hasPurchasedGiftCard && this.hasPurchasedAllTarotCards == quotaUsageResponse.hasPurchasedAllTarotCards && pa7.t(this.usageBilling, quotaUsageResponse.usageBilling) && pa7.t(this.guestPass, quotaUsageResponse.guestPass);
    }

    public final CompensateCount getCompensateCount() {
        return this.compensateCount;
    }

    public final List<CountV2> getCountV2() {
        return this.countV2;
    }

    public final List<CountV2> getFutureTarotCount() {
        return this.futureTarotCount;
    }

    public final GuestPassResponse getGuestPass() {
        return this.guestPass;
    }

    public final boolean getHasPurchasedAllTarotCards() {
        return this.hasPurchasedAllTarotCards;
    }

    public final boolean getHasPurchasedGiftCard() {
        return this.hasPurchasedGiftCard;
    }

    public final List<LimitedQuota> getLimitedQuotaList() {
        return this.limitedQuotaList;
    }

    public final boolean getNeverPurchased() {
        return this.neverPurchased;
    }

    public final PayAsYouGo getPayAsYouGo() {
        return this.payAsYouGo;
    }

    public final List<CountV2> getQuinCardCount() {
        return this.quinCardCount;
    }

    public final SubscriptionData getSubscription() {
        return this.subscription;
    }

    public final TimesMembership getTimesMembership() {
        return this.timesMembership;
    }

    public final TokenData getToken() {
        return this.token;
    }

    public final UsageBillingResponse getUsageBilling() {
        return this.usageBilling;
    }

    public int hashCode() {
        SubscriptionData subscriptionData = this.subscription;
        int iA = tec.a(tec.a(tec.a((subscriptionData == null ? 0 : subscriptionData.hashCode()) * 31, 31, this.countV2), 31, this.quinCardCount), 31, this.futureTarotCount);
        TokenData tokenData = this.token;
        int iHashCode = (this.payAsYouGo.hashCode() + ((iA + (tokenData == null ? 0 : tokenData.hashCode())) * 31)) * 31;
        CompensateCount compensateCount = this.compensateCount;
        int iHashCode2 = (iHashCode + (compensateCount == null ? 0 : compensateCount.hashCode())) * 31;
        TimesMembership timesMembership = this.timesMembership;
        int iHashCode3 = (iHashCode2 + (timesMembership == null ? 0 : timesMembership.hashCode())) * 31;
        List<LimitedQuota> list = this.limitedQuotaList;
        int iD = ub3.d(ub3.d(ub3.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.neverPurchased), 31, this.hasPurchasedGiftCard), 31, this.hasPurchasedAllTarotCards);
        UsageBillingResponse usageBillingResponse = this.usageBilling;
        int iHashCode4 = (iD + (usageBillingResponse == null ? 0 : usageBillingResponse.hashCode())) * 31;
        GuestPassResponse guestPassResponse = this.guestPass;
        return iHashCode4 + (guestPassResponse != null ? guestPassResponse.hashCode() : 0);
    }

    public String toString() {
        SubscriptionData subscriptionData = this.subscription;
        List<CountV2> list = this.countV2;
        List<CountV2> list2 = this.quinCardCount;
        List<CountV2> list3 = this.futureTarotCount;
        TokenData tokenData = this.token;
        PayAsYouGo payAsYouGo = this.payAsYouGo;
        CompensateCount compensateCount = this.compensateCount;
        TimesMembership timesMembership = this.timesMembership;
        List<LimitedQuota> list4 = this.limitedQuotaList;
        boolean z = this.neverPurchased;
        boolean z2 = this.hasPurchasedGiftCard;
        boolean z3 = this.hasPurchasedAllTarotCards;
        UsageBillingResponse usageBillingResponse = this.usageBilling;
        GuestPassResponse guestPassResponse = this.guestPass;
        StringBuilder sb = new StringBuilder("QuotaUsageResponse(subscription=");
        sb.append(subscriptionData);
        sb.append(", countV2=");
        sb.append(list);
        sb.append(", quinCardCount=");
        sb.append(list2);
        sb.append(", futureTarotCount=");
        sb.append(list3);
        sb.append(", token=");
        sb.append(tokenData);
        sb.append(", payAsYouGo=");
        sb.append(payAsYouGo);
        sb.append(", compensateCount=");
        sb.append(compensateCount);
        sb.append(", timesMembership=");
        sb.append(timesMembership);
        sb.append(", limitedQuotaList=");
        sb.append(list4);
        sb.append(", neverPurchased=");
        sb.append(z);
        sb.append(", hasPurchasedGiftCard=");
        ib8.w(sb, z2, ", hasPurchasedAllTarotCards=", z3, ", usageBilling=");
        sb.append(usageBillingResponse);
        sb.append(", guestPass=");
        sb.append(guestPassResponse);
        sb.append(")");
        return sb.toString();
    }

    public QuotaUsageResponse(SubscriptionData subscriptionData, List<CountV2> list, List<CountV2> list2, List<CountV2> list3, TokenData tokenData, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List<LimitedQuota> list4, boolean z, boolean z2, boolean z3, UsageBillingResponse usageBillingResponse, GuestPassResponse guestPassResponse) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        payAsYouGo.getClass();
        this.subscription = subscriptionData;
        this.countV2 = list;
        this.quinCardCount = list2;
        this.futureTarotCount = list3;
        this.token = tokenData;
        this.payAsYouGo = payAsYouGo;
        this.compensateCount = compensateCount;
        this.timesMembership = timesMembership;
        this.limitedQuotaList = list4;
        this.neverPurchased = z;
        this.hasPurchasedGiftCard = z2;
        this.hasPurchasedAllTarotCards = z3;
        this.usageBilling = usageBillingResponse;
        this.guestPass = guestPassResponse;
    }

    public /* synthetic */ QuotaUsageResponse(SubscriptionData subscriptionData, List list, List list2, List list3, TokenData tokenData, PayAsYouGo payAsYouGo, CompensateCount compensateCount, TimesMembership timesMembership, List list4, boolean z, boolean z2, boolean z3, UsageBillingResponse usageBillingResponse, GuestPassResponse guestPassResponse, int i, rp3 rp3Var) {
        this(subscriptionData, list, list2, list3, tokenData, payAsYouGo, compensateCount, timesMembership, list4, z, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z2, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? null : usageBillingResponse, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : guestPassResponse);
    }
}
