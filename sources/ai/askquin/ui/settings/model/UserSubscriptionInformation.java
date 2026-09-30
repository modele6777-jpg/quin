package ai.askquin.ui.settings.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.c78;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ehf;
import defpackage.jif;
import defpackage.l26;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.qu;
import defpackage.rp3;
import defpackage.s55;
import defpackage.s72;
import defpackage.s8b;
import defpackage.spf;
import defpackage.t72;
import defpackage.tec;
import defpackage.tpf;
import defpackage.tyc;
import defpackage.u7e;
import defpackage.ub3;
import defpackage.upf;
import defpackage.whf;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.UsageBilling;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LMBe\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001aJ\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001aJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003¢\u0006\u0004\b*\u0010'J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J|\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b1\u0010\u001aJ\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\b\u0007\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bG\u0010'R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bH\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010-¨\u0006N"}, d2 = {"Lai/askquin/ui/settings/model/UserSubscriptionInformation;", "", "Ltech/chatmind/api/credits/QuinSubscription;", "subscription", "", "paymentType", "", "isAutoRenew", "", "Lai/askquin/ui/settings/model/UsageCount;", "usageCounts", "Lai/askquin/ui/settings/model/ExpireableCount;", "compensateCount", "Lu7e;", "upgradeableSubscription", "limitedQuotaList", "Ltech/chatmind/api/credits/UsageBilling;", "usageBilling", "<init>", "(Ltech/chatmind/api/credits/QuinSubscription;Ljava/lang/String;ZLjava/util/List;Lai/askquin/ui/settings/model/ExpireableCount;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/credits/UsageBilling;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/credits/QuinSubscription;Ljava/lang/String;ZLjava/util/List;Lai/askquin/ui/settings/model/ExpireableCount;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/credits/UsageBilling;Lxyc;)V", "addOnCount", "()I", "showAddOnPaywallEntry", "()Z", "vipCount", "freeCount", "additionCount", "countHeaderExpiredAt", "()Ljava/lang/String;", "component1", "()Ltech/chatmind/api/credits/QuinSubscription;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lai/askquin/ui/settings/model/ExpireableCount;", "component6", "component7", "component8", "()Ltech/chatmind/api/credits/UsageBilling;", "copy", "(Ltech/chatmind/api/credits/QuinSubscription;Ljava/lang/String;ZLjava/util/List;Lai/askquin/ui/settings/model/ExpireableCount;Ljava/util/List;Ljava/util/List;Ltech/chatmind/api/credits/UsageBilling;)Lai/askquin/ui/settings/model/UserSubscriptionInformation;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/settings/model/UserSubscriptionInformation;Lag2;Lnyc;)V", "write$Self", "Ltech/chatmind/api/credits/QuinSubscription;", "getSubscription", "Ljava/lang/String;", "getPaymentType", "Z", "Ljava/util/List;", "getUsageCounts", "Lai/askquin/ui/settings/model/ExpireableCount;", "getCompensateCount", "getUpgradeableSubscription", "getLimitedQuotaList", "Ltech/chatmind/api/credits/UsageBilling;", "getUsageBilling", "Companion", "spf", "tpf", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UserSubscriptionInformation {
    private static final lw7[] $childSerializers;
    private final ExpireableCount compensateCount;
    private final boolean isAutoRenew;
    private final List<ExpireableCount> limitedQuotaList;
    private final String paymentType;
    private final QuinSubscription subscription;
    private final List<u7e> upgradeableSubscription;
    private final UsageBilling usageBilling;
    private final List<UsageCount> usageCounts;
    public static final tpf Companion = new tpf();
    public static final int $stable = UsageBilling.$stable | QuinSubscription.$stable;

    static {
        ehf ehfVar = new ehf(21);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, eb3.N(z18Var, ehfVar), null, eb3.N(z18Var, new ehf(22)), eb3.N(z18Var, new ehf(23)), null};
    }

    public /* synthetic */ UserSubscriptionInformation(int i, QuinSubscription quinSubscription, String str, boolean z, List list, ExpireableCount expireableCount, List list2, List list3, UsageBilling usageBilling, xyc xycVar) {
        if (127 != (i & 127)) {
            an1.R(i, 127, spf.a.e());
            throw null;
        }
        this.subscription = quinSubscription;
        this.paymentType = str;
        this.isAutoRenew = z;
        this.usageCounts = list;
        this.compensateCount = expireableCount;
        this.upgradeableSubscription = list2;
        this.limitedQuotaList = list3;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.usageBilling = null;
        } else {
            this.usageBilling = usageBilling;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(jif.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_$0() {
        u7e[] u7eVarArrValues = u7e.values();
        u7eVarArrValues.getClass();
        return new dd0(new wn2("net.xmind.donut.payment.SubscriptionType", u7eVarArrValues), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(s55.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSubscriptionInformation copy$default(UserSubscriptionInformation userSubscriptionInformation, QuinSubscription quinSubscription, String str, boolean z, List list, ExpireableCount expireableCount, List list2, List list3, UsageBilling usageBilling, int i, Object obj) {
        if ((i & 1) != 0) {
            quinSubscription = userSubscriptionInformation.subscription;
        }
        if ((i & 2) != 0) {
            str = userSubscriptionInformation.paymentType;
        }
        if ((i & 4) != 0) {
            z = userSubscriptionInformation.isAutoRenew;
        }
        if ((i & 8) != 0) {
            list = userSubscriptionInformation.usageCounts;
        }
        if ((i & 16) != 0) {
            expireableCount = userSubscriptionInformation.compensateCount;
        }
        if ((i & 32) != 0) {
            list2 = userSubscriptionInformation.upgradeableSubscription;
        }
        if ((i & 64) != 0) {
            list3 = userSubscriptionInformation.limitedQuotaList;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            usageBilling = userSubscriptionInformation.usageBilling;
        }
        List list4 = list3;
        UsageBilling usageBilling2 = usageBilling;
        ExpireableCount expireableCount2 = expireableCount;
        List list5 = list2;
        return userSubscriptionInformation.copy(quinSubscription, str, z, list, expireableCount2, list5, list4, usageBilling2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countHeaderExpiredAt$lambda$1(l26 l26Var, Object obj, Object obj2) {
        return ((Number) l26Var.z(obj, obj2)).intValue();
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(UserSubscriptionInformation self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.A(serialDesc, 0, s8b.a, self.subscription);
        output.A(serialDesc, 1, p4e.a, self.paymentType);
        output.o(serialDesc, 2, self.isAutoRenew);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.usageCounts);
        output.A(serialDesc, 4, s55.a, self.compensateCount);
        output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.upgradeableSubscription);
        output.A(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.limitedQuotaList);
        if (!output.g(serialDesc) && self.usageBilling == null) {
            return;
        }
        output.A(serialDesc, 7, whf.a, self.usageBilling);
    }

    public final int addOnCount() {
        List<UsageCount> list = this.usageCounts;
        ArrayList<UsageCount> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UsageCount) obj).getType() == UsageType.AddOn) {
                arrayList.add(obj);
            }
        }
        int total = 0;
        for (UsageCount usageCount : arrayList) {
            total += usageCount.getTotal() - usageCount.getUsed();
        }
        return total;
    }

    public final int additionCount() {
        int iVipCount = vipCount() + addOnCount() + freeCount();
        ExpireableCount expireableCount = this.compensateCount;
        int iComponent1 = 0;
        int iComponent2 = iVipCount + (expireableCount != null ? expireableCount.getTotalCount() - expireableCount.getUsedCount() : 0);
        List<ExpireableCount> list = this.limitedQuotaList;
        if (list != null) {
            for (ExpireableCount expireableCount2 : list) {
                iComponent1 += expireableCount2.getTotalCount() - expireableCount2.getUsedCount();
            }
        }
        return iComponent2 + iComponent1;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final QuinSubscription getSubscription() {
        return this.subscription;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public final List<UsageCount> component4() {
        return this.usageCounts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ExpireableCount getCompensateCount() {
        return this.compensateCount;
    }

    public final List<u7e> component6() {
        return this.upgradeableSubscription;
    }

    public final List<ExpireableCount> component7() {
        return this.limitedQuotaList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final UsageBilling getUsageBilling() {
        return this.usageBilling;
    }

    public final UserSubscriptionInformation copy(QuinSubscription subscription, String paymentType, boolean isAutoRenew, List<UsageCount> usageCounts, ExpireableCount compensateCount, List<? extends u7e> upgradeableSubscription, List<ExpireableCount> limitedQuotaList, UsageBilling usageBilling) {
        usageCounts.getClass();
        upgradeableSubscription.getClass();
        return new UserSubscriptionInformation(subscription, paymentType, isAutoRenew, usageCounts, compensateCount, upgradeableSubscription, limitedQuotaList, usageBilling);
    }

    public final String countHeaderExpiredAt() {
        c78 c78VarW = t72.w();
        Iterable<ExpireableCount> iterable = this.limitedQuotaList;
        if (iterable == null) {
            iterable = pu4.a;
        }
        for (ExpireableCount expireableCount : iterable) {
            if (expireableCount.getTotalCount() - expireableCount.getUsedCount() > 0) {
                c78VarW.add(expireableCount.getExpiredAt());
            }
        }
        ExpireableCount expireableCount2 = this.compensateCount;
        if (expireableCount2 != null && expireableCount2.getTotalCount() - expireableCount2.getUsedCount() > 0) {
            c78VarW.add(expireableCount2.getExpiredAt());
        }
        for (UsageCount usageCount : this.usageCounts) {
            if (usageCount.getTotal() - usageCount.getUsed() > 0) {
                c78VarW.add(null);
            }
        }
        c78 c78VarN = c78VarW.n();
        upf upfVar = upf.a;
        return (String) s72.x0(s72.b1(c78VarN, new qu(28)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSubscriptionInformation)) {
            return false;
        }
        UserSubscriptionInformation userSubscriptionInformation = (UserSubscriptionInformation) other;
        return pa7.t(this.subscription, userSubscriptionInformation.subscription) && pa7.t(this.paymentType, userSubscriptionInformation.paymentType) && this.isAutoRenew == userSubscriptionInformation.isAutoRenew && pa7.t(this.usageCounts, userSubscriptionInformation.usageCounts) && pa7.t(this.compensateCount, userSubscriptionInformation.compensateCount) && pa7.t(this.upgradeableSubscription, userSubscriptionInformation.upgradeableSubscription) && pa7.t(this.limitedQuotaList, userSubscriptionInformation.limitedQuotaList) && pa7.t(this.usageBilling, userSubscriptionInformation.usageBilling);
    }

    public final int freeCount() {
        List<UsageCount> list = this.usageCounts;
        ArrayList<UsageCount> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UsageCount) obj).getType() == UsageType.Free) {
                arrayList.add(obj);
            }
        }
        int total = 0;
        for (UsageCount usageCount : arrayList) {
            total += usageCount.getTotal() - usageCount.getUsed();
        }
        return total;
    }

    public final ExpireableCount getCompensateCount() {
        return this.compensateCount;
    }

    public final List<ExpireableCount> getLimitedQuotaList() {
        return this.limitedQuotaList;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final QuinSubscription getSubscription() {
        return this.subscription;
    }

    public final List<u7e> getUpgradeableSubscription() {
        return this.upgradeableSubscription;
    }

    public final UsageBilling getUsageBilling() {
        return this.usageBilling;
    }

    public final List<UsageCount> getUsageCounts() {
        return this.usageCounts;
    }

    public int hashCode() {
        QuinSubscription quinSubscription = this.subscription;
        int iHashCode = (quinSubscription == null ? 0 : quinSubscription.hashCode()) * 31;
        String str = this.paymentType;
        int iA = tec.a(ub3.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAutoRenew), 31, this.usageCounts);
        ExpireableCount expireableCount = this.compensateCount;
        int iA2 = tec.a((iA + (expireableCount == null ? 0 : expireableCount.hashCode())) * 31, 31, this.upgradeableSubscription);
        List<ExpireableCount> list = this.limitedQuotaList;
        int iHashCode2 = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
        UsageBilling usageBilling = this.usageBilling;
        return iHashCode2 + (usageBilling != null ? usageBilling.hashCode() : 0);
    }

    public final boolean isAutoRenew() {
        return this.isAutoRenew;
    }

    public final boolean showAddOnPaywallEntry() {
        return this.subscription != null && vipCount() <= 0;
    }

    public String toString() {
        return "UserSubscriptionInformation(subscription=" + this.subscription + ", paymentType=" + this.paymentType + ", isAutoRenew=" + this.isAutoRenew + ", usageCounts=" + this.usageCounts + ", compensateCount=" + this.compensateCount + ", upgradeableSubscription=" + this.upgradeableSubscription + ", limitedQuotaList=" + this.limitedQuotaList + ", usageBilling=" + this.usageBilling + ")";
    }

    public final int vipCount() {
        List<UsageCount> list = this.usageCounts;
        ArrayList<UsageCount> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UsageCount) obj).getType() == UsageType.Vip) {
                arrayList.add(obj);
            }
        }
        int total = 0;
        for (UsageCount usageCount : arrayList) {
            total += usageCount.getTotal() - usageCount.getUsed();
        }
        return total;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserSubscriptionInformation(QuinSubscription quinSubscription, String str, boolean z, List<UsageCount> list, ExpireableCount expireableCount, List<? extends u7e> list2, List<ExpireableCount> list3, UsageBilling usageBilling) {
        list.getClass();
        list2.getClass();
        this.subscription = quinSubscription;
        this.paymentType = str;
        this.isAutoRenew = z;
        this.usageCounts = list;
        this.compensateCount = expireableCount;
        this.upgradeableSubscription = list2;
        this.limitedQuotaList = list3;
        this.usageBilling = usageBilling;
    }

    public /* synthetic */ UserSubscriptionInformation(QuinSubscription quinSubscription, String str, boolean z, List list, ExpireableCount expireableCount, List list2, List list3, UsageBilling usageBilling, int i, rp3 rp3Var) {
        this(quinSubscription, str, z, list, expireableCount, list2, list3, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : usageBilling);
    }
}
