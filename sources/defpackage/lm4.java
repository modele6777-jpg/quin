package defpackage;

import ai.askquin.data.QuotaBlockReason;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import tech.chatmind.api.CompensateCount;
import tech.chatmind.api.CountType;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.TimesMembership;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.credits.UsageBillingBalance;
import tech.chatmind.api.credits.UsageBillingDailyLimit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lm4 {
    public static p9b a(QuotaUsage quotaUsage) {
        if (quotaUsage != null) {
            UsageBilling usageBilling = quotaUsage.getUsageBilling();
            if (usageBilling != null && usageBilling.getEnabled()) {
                UsageBillingDailyLimit dailyLimit = usageBilling.getDailyLimit();
                if (dailyLimit != null && dailyLimit.getReached()) {
                    return new o9b(QuotaBlockReason.DailyLimit);
                }
                if (!usageBilling.getCanFollowUp()) {
                    return new o9b(QuotaBlockReason.NoFollowUpPermission);
                }
                if (!usageBilling.getHasActiveBalance()) {
                    return new o9b(QuotaBlockReason.InsufficientBalance);
                }
            } else if (!quotaUsage.getHasSubscription()) {
                return new o9b(QuotaBlockReason.NoFollowUpPermission);
            }
        }
        return n9b.a;
    }

    public static p9b b(QuotaUsage quotaUsage, int i) {
        if (quotaUsage != null) {
            UsageBilling usageBilling = quotaUsage.getUsageBilling();
            if (usageBilling != null && usageBilling.getEnabled()) {
                xeb xebVarD = d(quotaUsage, false);
                Instant instantC = c(usageBilling);
                Instant instant = xebVarD.b;
                if (instant == null || ((instantC != null && instant.compareTo(instantC) > 0) || xebVarD.a < i)) {
                    UsageBillingDailyLimit dailyLimit = usageBilling.getDailyLimit();
                    if (dailyLimit != null && dailyLimit.getReached()) {
                        return new o9b(QuotaBlockReason.DailyLimit);
                    }
                    if (!usageBilling.getHasActiveBalance()) {
                        return new o9b(QuotaBlockReason.InsufficientBalance);
                    }
                }
            } else if (d(quotaUsage, true).a < i) {
                return new o9b(QuotaBlockReason.CountInsufficient);
            }
        }
        return n9b.a;
    }

    public static Instant c(UsageBilling usageBilling) {
        List<UsageBillingBalance> balances = usageBilling.getBalances();
        ArrayList arrayList = new ArrayList();
        for (Object obj : balances) {
            if (((UsageBillingBalance) obj).isAvailable()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        UsageBillingBalance usageBillingBalance = (UsageBillingBalance) it.next();
        String nextRefreshAt = usageBillingBalance.getNextRefreshAt();
        if (nextRefreshAt == null) {
            nextRefreshAt = usageBillingBalance.getExpireAt();
        }
        Instant instantE = e(nextRefreshAt);
        while (it.hasNext()) {
            UsageBillingBalance usageBillingBalance2 = (UsageBillingBalance) it.next();
            String nextRefreshAt2 = usageBillingBalance2.getNextRefreshAt();
            if (nextRefreshAt2 == null) {
                nextRefreshAt2 = usageBillingBalance2.getExpireAt();
            }
            Instant instantE2 = e(nextRefreshAt2);
            if (instantE.compareTo(instantE2) > 0) {
                instantE = instantE2;
            }
        }
        return instantE;
    }

    public static xeb d(QuotaUsage quotaUsage, boolean z) {
        Iterable countV2 = quotaUsage.getCountV2();
        List<LimitedQuota> list = pu4.a;
        if (countV2 == null) {
            countV2 = list;
        }
        ArrayList<CountV2> arrayList = new ArrayList();
        for (Object obj : countV2) {
            if (((CountV2) obj).getType() == CountType.FREE) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        int i2 = 0;
        for (CountV2 countV3 : arrayList) {
            int totalCount = countV3.getTotalCount() - countV3.getUsedCount();
            if (totalCount < 0) {
                totalCount = 0;
            }
            i2 += totalCount;
        }
        ArrayList<CountV2> arrayList2 = new ArrayList();
        for (Object obj2 : countV2) {
            CountV2 countV4 = (CountV2) obj2;
            if (countV4.getType() == CountType.ADD_ON || (z && countV4.getType() == CountType.VIP)) {
                arrayList2.add(obj2);
            }
        }
        int i3 = 0;
        for (CountV2 countV5 : arrayList2) {
            int totalCount2 = countV5.getTotalCount() - countV5.getUsedCount();
            if (totalCount2 < 0) {
                totalCount2 = 0;
            }
            i3 += totalCount2;
        }
        List<LimitedQuota> limitedQuotaList = quotaUsage.getLimitedQuotaList();
        if (limitedQuotaList != null) {
            list = limitedQuotaList;
        }
        c78 c78VarW = t72.w();
        ArrayList<LimitedQuota> arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            LimitedQuota limitedQuota = (LimitedQuota) obj3;
            int totalCount3 = limitedQuota.getTotalCount() - limitedQuota.getUsedCount();
            if (totalCount3 < 0) {
                totalCount3 = 0;
            }
            if (totalCount3 > 0) {
                arrayList3.add(obj3);
            }
        }
        for (LimitedQuota limitedQuota2 : arrayList3) {
            int totalCount4 = limitedQuota2.getTotalCount() - limitedQuota2.getUsedCount();
            if (totalCount4 < 0) {
                totalCount4 = 0;
            }
            c78VarW.add(new rw2(totalCount4, e(limitedQuota2.getExpiredAt())));
        }
        CompensateCount compensateCount = quotaUsage.getCompensateCount();
        Instant instant = null;
        if (compensateCount != null) {
            int totalCount5 = compensateCount.getTotalCount() - compensateCount.getUsedCount();
            if (totalCount5 < 0) {
                totalCount5 = 0;
            }
            if (totalCount5 <= 0) {
                compensateCount = null;
            }
            if (compensateCount != null) {
                int totalCount6 = compensateCount.getTotalCount() - compensateCount.getUsedCount();
                if (totalCount6 < 0) {
                    totalCount6 = 0;
                }
                c78VarW.add(new rw2(totalCount6, e(compensateCount.getExpiredAt())));
            }
        }
        TimesMembership timesMembership = quotaUsage.getTimesMembership();
        if (timesMembership != null) {
            if (timesMembership.getTotalCount() <= timesMembership.getUsedCount()) {
                timesMembership = null;
                break;
            }
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (c5e.v(((LimitedQuota) it.next()).getCategory(), LimitedQuota.CATEGORY_TIME_MEMBERSHIP, true)) {
                        timesMembership = null;
                        break;
                    }
                }
            }
            if (timesMembership != null) {
                int totalCount7 = timesMembership.getTotalCount() - timesMembership.getUsedCount();
                if (totalCount7 < 0) {
                    totalCount7 = 0;
                }
                c78VarW.add(new rw2(totalCount7, e(timesMembership.getExpiredAt())));
            }
        }
        c78 c78VarN = c78VarW.n();
        if (i2 > 0) {
            instant = Instant.MIN;
        } else if (!c78VarN.isEmpty()) {
            ql6 ql6Var = (ql6) c78VarN.listIterator(0);
            if (!ql6Var.hasNext()) {
                s8f.c();
                return null;
            }
            Instant instant2 = ((rw2) ql6Var.next()).b;
            loop8: while (true) {
                instant = instant2;
                do {
                    if (!ql6Var.hasNext()) {
                        break loop8;
                    }
                    instant2 = ((rw2) ql6Var.next()).b;
                } while (instant.compareTo(instant2) <= 0);
            }
        } else if (i3 > 0) {
            instant = Instant.MAX;
        }
        int i4 = i2 + i3;
        ListIterator listIterator = c78VarN.listIterator(0);
        while (true) {
            ql6 ql6Var2 = (ql6) listIterator;
            if (!ql6Var2.hasNext()) {
                return new xeb(i4 + i, instant);
            }
            i += ((rw2) ql6Var2.next()).a;
        }
    }

    public static Instant e(String str) {
        Object dzbVar;
        if (str != null) {
            try {
                dzbVar = Instant.parse(str);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            Instant instant = (Instant) dzbVar;
            if (instant != null) {
                return instant;
            }
        }
        Instant instant2 = Instant.MAX;
        instant2.getClass();
        return instant2;
    }
}
