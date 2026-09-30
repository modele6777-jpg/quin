package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import tech.chatmind.api.CompensateCount;
import tech.chatmind.api.CountType;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.PayAsYouGo;
import tech.chatmind.api.Period;
import tech.chatmind.api.PeriodUnit;
import tech.chatmind.api.TimesMembership;
import tech.chatmind.api.credits.GuestPassBalance;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.credits.TokenUsage;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.credits.UsageBillingBalance;
import tech.chatmind.api.credits.UsageBillingDailyLimit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eab implements hf8, q9b {
    public final vz9 a = q1c.f(null);
    public volatile QuotaUsage b;
    public boolean c;
    public QuotaUsage d;
    public u7e e;
    public SubscriptionInfo f;

    public static QuotaUsage a(eab eabVar, List list, CompensateCount compensateCount, UsageBilling usageBilling, int i) {
        return new QuotaUsage((SubscriptionInfo) null, (TokenUsage) null, t72.H(new CountV2(CountType.FREE, 1, 1)), (List) null, (List) null, (PayAsYouGo) null, (i & 2) != 0 ? null : compensateCount, (TimesMembership) null, (i & 1) != 0 ? pu4.a : list, (Boolean) null, false, false, (i & 4) != 0 ? null : usageBilling, (GuestPassBalance) null, 11960, (rp3) null);
    }

    public static QuotaUsage c(eab eabVar, u7e u7eVar, String str, String str2, String str3, List list, List list2, UsageBillingDailyLimit usageBillingDailyLimit, List list3, int i) {
        UsageBillingDailyLimit usageBillingDailyLimit2;
        String str4 = (i & 16) != 0 ? "monthly" : "weekly";
        boolean z = false;
        int i2 = (i & 32) != 0 ? 72 : 0;
        int i3 = i & 64;
        pu4 pu4Var = pu4.a;
        List list4 = i3 != 0 ? pu4Var : list;
        List list5 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? pu4Var : list2;
        if ((i & 256) != 0) {
            usageBillingDailyLimit2 = new UsageBillingDailyLimit(z, (String) null, 2, (rp3) (0 == true ? 1 : 0));
        } else {
            usageBillingDailyLimit2 = usageBillingDailyLimit;
        }
        List listH = (i & 512) != 0 ? t72.H(new CountV2(CountType.FREE, 1, 1)) : list3;
        return new QuotaUsage(SubscriptionInfo.copy$default(k(u7eVar), null, null, null, null, str3, null, null, null, 239, null), (TokenUsage) null, listH, (List) null, (List) null, (PayAsYouGo) null, (CompensateCount) null, (TimesMembership) null, list4, (Boolean) null, false, false, new UsageBilling(true, true, s72.Q0(t72.H(new UsageBillingBalance(str, i2, true, UsageBillingBalance.STATUS_ACTIVE, str4, str2, str3)), list5), usageBillingDailyLimit2), (GuestPassBalance) null, 12024, (rp3) null);
    }

    public static UsageBilling e(eab eabVar, String str, UsageBillingDailyLimit usageBillingDailyLimit, int i) {
        boolean z = false;
        int i2 = (i & 2) != 0 ? 60 : 0;
        if ((i & 4) != 0) {
            usageBillingDailyLimit = new UsageBillingDailyLimit(z, (String) null, 2, (rp3) (0 == true ? 1 : 0));
        }
        return new UsageBilling(true, false, t72.H(f(i2, str, true)), usageBillingDailyLimit);
    }

    public static UsageBillingBalance f(int i, String str, boolean z) {
        return new UsageBillingBalance(UsageBillingBalance.SOURCE_ADDON_A, i, z, UsageBillingBalance.STATUS_ACTIVE, "", null, str);
    }

    public static LimitedQuota g(String str) {
        return new LimitedQuota(LimitedQuota.CATEGORY_TIME_MEMBERSHIP, 5, 2, str, "5 times pass", (String) null, 32, (rp3) null);
    }

    public static String j(ZoneOffset zoneOffset) {
        w57 w57VarA = z57.a.a();
        w57VarA.getClass();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(w57VarA.e());
        instantOfEpochMilli.getClass();
        String string = instantOfEpochMilli.atOffset(zoneOffset).toLocalDate().plusDays(1L).atStartOfDay().toInstant(zoneOffset).toString();
        string.getClass();
        return string;
    }

    public static SubscriptionInfo k(u7e u7eVar) {
        String str;
        PeriodUnit periodUnit;
        int iOrdinal = u7eVar.g().ordinal();
        if (iOrdinal == 0) {
            str = "basic";
        } else if (iOrdinal == 1) {
            str = "pro";
        } else if (iOrdinal == 2) {
            str = "max";
        } else {
            if (iOrdinal != 3) {
                ap.c();
                return null;
            }
            str = "v4";
        }
        String str2 = str;
        int iOrdinal2 = u7eVar.e().ordinal();
        if (iOrdinal2 == 0) {
            periodUnit = PeriodUnit.WEEK;
        } else if (iOrdinal2 == 1) {
            periodUnit = PeriodUnit.MONTH;
        } else if (iOrdinal2 == 2) {
            periodUnit = PeriodUnit.QUARTER;
        } else {
            if (iOrdinal2 != 3) {
                ap.c();
                return null;
            }
            periodUnit = PeriodUnit.YEAR;
        }
        return new SubscriptionInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str2, new Period(1, periodUnit), 48, (rp3) null);
    }

    public final QuotaUsage b() {
        return (QuotaUsage) this.a.getValue();
    }

    public final void h(u7e u7eVar) {
        SubscriptionInfo subscriptionInfoK;
        QuotaUsage quotaUsageCopy = null;
        if (this.e == null && u7eVar != null) {
            QuotaUsage quotaUsageB = b();
            this.f = quotaUsageB != null ? quotaUsageB.getSubscription() : null;
        }
        this.e = u7eVar;
        QuotaUsage quotaUsageB2 = b();
        if (quotaUsageB2 != null) {
            if (u7eVar != null) {
                subscriptionInfoK = k(u7eVar);
            } else {
                subscriptionInfoK = this.f;
                this.f = null;
            }
            quotaUsageCopy = quotaUsageB2.copy((16382 & 1) != 0 ? quotaUsageB2.subscription : subscriptionInfoK, (16382 & 2) != 0 ? quotaUsageB2.token : null, (16382 & 4) != 0 ? quotaUsageB2.countV2 : null, (16382 & 8) != 0 ? quotaUsageB2.quinCardCount : null, (16382 & 16) != 0 ? quotaUsageB2.futureTarotCount : null, (16382 & 32) != 0 ? quotaUsageB2.payAsYouGo : null, (16382 & 64) != 0 ? quotaUsageB2.compensateCount : null, (16382 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? quotaUsageB2.timesMembership : null, (16382 & 256) != 0 ? quotaUsageB2.limitedQuotaList : null, (16382 & 512) != 0 ? quotaUsageB2.neverPurchased : null, (16382 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? quotaUsageB2.hasPurchasedGiftCard : false, (16382 & 2048) != 0 ? quotaUsageB2.hasPurchasedAllTarotCards : false, (16382 & 4096) != 0 ? quotaUsageB2.usageBilling : null, (16382 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? quotaUsageB2.guestPass : null);
        }
        l(quotaUsageCopy, u7eVar != null);
    }

    public final QuotaUsage i(lif lifVar) {
        eab eabVar;
        boolean z;
        QuotaUsage quotaUsageA;
        eab eabVar2;
        lifVar.getClass();
        w57 w57VarA = z57.a.a();
        qfc qfcVar = ar4.b;
        gr4 gr4Var = gr4.DAYS;
        String string = w57VarA.d(y41.T(365, gr4Var)).toString();
        String string2 = w57VarA.d(y41.T(30, gr4Var)).toString();
        String string3 = w57VarA.d(y41.T(7, gr4Var)).toString();
        String string4 = w57VarA.d(y41.T(14, gr4Var)).toString();
        String string5 = w57VarA.d(y41.T(60, gr4Var)).toString();
        String string6 = w57VarA.d(y41.T(7, gr4Var)).toString();
        String string7 = w57VarA.d(y41.T(120, gr4Var)).toString();
        boolean z2 = true;
        switch (lifVar.ordinal()) {
            case 0:
                eabVar = this;
                z = true;
                quotaUsageA = a(eabVar, null, null, null, 7);
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 1:
                eabVar = this;
                z = true;
                quotaUsageA = a(eabVar, t72.H(g(string4)), null, null, 6);
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 2:
                eabVar = this;
                z = true;
                quotaUsageA = a(eabVar, t72.H(new LimitedQuota(LimitedQuota.CATEGORY_TIME_MEMBERSHIP, 10, 3, string4, "5 times pass", (String) null, 32, (rp3) null)), new CompensateCount(5, 2, string5), null, 4);
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 3:
                eabVar2 = this;
                quotaUsageA = c(eabVar2, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, null, null, null, null, 1008);
                eabVar = eabVar2;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 4:
                quotaUsageA = c(this, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, null, null, null, t72.H(new CountV2(CountType.FREE, 0, 1)), 496);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 5:
                quotaUsageA = c(this, u7e.c, UsageBillingBalance.SOURCE_VIP_YEAR, string2, string, null, null, null, null, 1008);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 6:
                quotaUsageA = c(this, u7e.e, UsageBillingBalance.SOURCE_VIP_WEEK, string3, string, null, null, null, null, 992);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 7:
                quotaUsageA = c(this, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, t72.H(g(string4)), null, null, null, 944);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 8:
                quotaUsageA = c(this, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, t72.H(g(string5)), null, null, null, 944);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 9:
                quotaUsageA = c(this, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, null, t72.H(f(50, string7, false)), null, null, 880);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                eabVar2 = this;
                quotaUsageA = a(eabVar2, t72.H(g(string4)), null, e(eabVar2, string7, null, 6), 2);
                eabVar = eabVar2;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                eabVar2 = this;
                quotaUsageA = a(eabVar2, t72.H(g(string5)), null, e(eabVar2, string6, null, 6), 2);
                eabVar = eabVar2;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                eabVar2 = this;
                quotaUsageA = a(eabVar2, null, null, e(eabVar2, string7, null, 6), 3);
                eabVar = eabVar2;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                eabVar2 = this;
                quotaUsageA = a(eabVar2, null, null, e(eabVar2, string7, null, 4), 3);
                eabVar = eabVar2;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 14:
                eabVar2 = this;
                ZoneOffset zoneOffsetOfHours = ZoneOffset.ofHours(8);
                zoneOffsetOfHours.getClass();
                quotaUsageA = a(eabVar2, null, null, e(eabVar2, string7, new UsageBillingDailyLimit(true, j(zoneOffsetOfHours)), 2), 3);
                eabVar = eabVar2;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                u7e u7eVar = u7e.b;
                List listH = lifVar == lif.DailyLimitUsageFirstWithCounts ? t72.H(g(string5)) : pu4.a;
                ZoneOffset zoneOffsetOfHours2 = lifVar != lif.DailyLimitGlobal ? ZoneOffset.ofHours(8) : ZoneOffset.UTC;
                zoneOffsetOfHours2.getClass();
                UsageBillingDailyLimit usageBillingDailyLimit = new UsageBillingDailyLimit(true, j(zoneOffsetOfHours2));
                eabVar2 = this;
                quotaUsageA = c(eabVar2, u7eVar, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, listH, null, usageBillingDailyLimit, null, 688);
                eabVar = eabVar2;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 18:
                quotaUsageA = c(this, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, null, null, null, null, 976);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 19:
                z2 = true;
                quotaUsageA = c(this, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, t72.H(new LimitedQuota("event", 2, 0, string4, "Event Bonus", (String) null, 32, (rp3) null)), null, null, null, 912);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 20:
                z2 = true;
                quotaUsageA = c(this, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, string2, string, t72.I(new LimitedQuota("event", 1, 0, string4, "Event Bonus", (String) null, 32, (rp3) null), new LimitedQuota("top-up", 1, 0, string5, "Refill Credit", (String) null, 32, (rp3) null)), null, null, null, 912);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            case 21:
                quotaUsageA = c(this, u7e.c, UsageBillingBalance.SOURCE_VIP_YEAR, null, string4, null, null, null, null, 1008);
                eabVar = this;
                z = z2;
                eabVar.l(quotaUsageA, z);
                return quotaUsageA;
            default:
                ap.c();
                return null;
        }
    }

    public final void l(QuotaUsage quotaUsage, boolean z) {
        String strD;
        if (z && !this.c) {
            this.d = b();
            this.c = true;
        } else if (!z) {
            this.d = null;
            this.c = false;
        }
        this.b = z ? quotaUsage : null;
        this.a.setValue(quotaUsage);
        hs3 hs3Var = xqa.C;
        if (quotaUsage != null) {
            xh7 xh7Var = fzc.a;
            strD = xh7Var.d(hfc.m(xh7Var.b, job.c(QuotaUsage.class)), quotaUsage);
        } else {
            strD = null;
        }
        if (strD == null) {
            strD = "";
        }
        ynb.V(lw2.a, null, null, new dab(hs3Var.a, strD, null), 3);
    }
}
