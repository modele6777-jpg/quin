package defpackage;

import ai.askquin.R;
import ai.askquin.ui.settings.model.ExpireableCount;
import ai.askquin.ui.settings.model.UsageCount;
import ai.askquin.ui.settings.model.UsageType;
import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.SubscriptionKind;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.credits.UsageBillingBalance;
import tech.chatmind.api.credits.UsageBillingDailyLimit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lc {
    public static final DateTimeFormatter a;

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        dateTimeFormatterOfPattern.getClass();
        a = dateTimeFormatterOfPattern;
    }

    public static final List A(UserSubscriptionInformation userSubscriptionInformation, ExpireableCount expireableCount, UsageCount usageCount, UsageBillingBalance usageBillingBalance, l46 l46Var) {
        LevelAndKind levelAndKind;
        ArrayList arrayList = new ArrayList();
        UsageCount usageCountK = K(userSubscriptionInformation);
        SubscriptionKind kind = null;
        if (usageCountK == null) {
            l46Var.f0(-254502009);
            l46Var.r(false);
        } else {
            l46Var.f0(-254502008);
            arrayList.add(new gb(M(usageCountK, S(usageCountK), l46Var, UsageCount.$stable), usageCountK.equals(usageCount), null, Instant.MIN));
            l46Var.r(false);
        }
        l46Var.f0(268893194);
        Iterator it = J(userSubscriptionInformation).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ExpireableCount expireableCount2 = (ExpireableCount) it.next();
            String strR = afc.r(R.string.account_usage_count_ratio, new Object[]{B(expireableCount2, l46Var), Integer.valueOf(R(expireableCount2)), Integer.valueOf(expireableCount2.getTotalCount())}, l46Var);
            if (expireableCount2 != expireableCount) {
                z = false;
            }
            arrayList.add(new gb(strR, z, O(expireableCount2.getExpiredAt()), T(expireableCount2.getExpiredAt())));
        }
        l46Var.r(false);
        ArrayList arrayListU = U(userSubscriptionInformation);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListU) {
            if (((UsageBillingBalance) obj).isAvailable()) {
                arrayList2.add(obj);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List<UsageBillingBalance> listJ = arrayList2;
        if (zIsEmpty) {
            listJ = t72.J(usageBillingBalance);
        }
        QuinSubscription subscription = userSubscriptionInformation.getSubscription();
        if (subscription != null && (levelAndKind = subscription.getLevelAndKind()) != null) {
            kind = levelAndKind.getKind();
        }
        l46Var.f0(268913308);
        for (UsageBillingBalance usageBillingBalance2 : listJ) {
            String strQ = afc.q(H(usageBillingBalance2, kind), l46Var);
            boolean z2 = usageBillingBalance2 == usageBillingBalance;
            String nextRefreshAt = usageBillingBalance2.getNextRefreshAt();
            if (nextRefreshAt == null) {
                nextRefreshAt = usageBillingBalance2.getExpireAt();
            }
            String strO = O(nextRefreshAt);
            Integer numValueOf = Integer.valueOf(usageBillingBalance2.getRemainingPercent());
            String nextRefreshAt2 = usageBillingBalance2.getNextRefreshAt();
            if (nextRefreshAt2 == null) {
                nextRefreshAt2 = usageBillingBalance2.getExpireAt();
            }
            arrayList.add(new gb(strQ, z2, strO, numValueOf, T(nextRefreshAt2), true));
        }
        l46Var.r(false);
        return s72.b1(arrayList, new ww2(8));
    }

    public static final String B(ExpireableCount expireableCount, l46 l46Var) {
        Integer numValueOf = Integer.valueOf(R.string.account_usage_detail_refill_credit);
        String category = expireableCount.getCategory();
        Locale locale = Locale.ROOT;
        String lowerCase = category.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = expireableCount.getProductName().toLowerCase(locale);
        lowerCase2.getClass();
        String strJ = ib8.j(lowerCase, " ", lowerCase2);
        if (L(strJ, "invite", "invitation", "邀请", "邀請", "好友")) {
            numValueOf = Integer.valueOf(R.string.account_usage_detail_invite_bonus);
        } else if (L(strJ, "kol", "fan", "粉丝", "粉絲")) {
            numValueOf = Integer.valueOf(R.string.account_usage_detail_fan_perk);
        } else if (L(strJ, "event", "activity", "campaign", "promo", "运营", "運營", "活动", "活動")) {
            numValueOf = Integer.valueOf(R.string.account_usage_detail_event_bonus);
        } else if (L(strJ, "free", "newcomer", "new-user", "new_user", "新人", "welcome")) {
            numValueOf = Integer.valueOf(R.string.account_usage_detail_free_uses);
        } else if (L(strJ, "compens", "补偿", "補償")) {
            numValueOf = Integer.valueOf(R.string.account_usage_detail_bonus_uses);
        } else if (!L(strJ, "refill", "credit", "addon", "add-on", "topup", "top-up", "pack", "补给", "補給")) {
            String lowerCase3 = expireableCount.getCategory().toLowerCase(locale);
            lowerCase3.getClass();
            String lowerCase4 = expireableCount.getProductName().toLowerCase(locale);
            lowerCase4.getClass();
            String strJ2 = ib8.j(lowerCase3, " ", lowerCase4);
            if (lowerCase3.equals(LimitedQuota.CATEGORY_TIME_MEMBERSHIP) || L(strJ2, "times-card", "time-membership", "pass", "次卡", "回数券", "횟수권", "pase")) {
                numValueOf = Integer.valueOf(R.string.account_usage_detail_pass);
            } else {
                v4e.Q(expireableCount.getProductName());
            }
        }
        l46Var.f0(1777438521);
        String strQ = afc.q(numValueOf.intValue(), l46Var);
        l46Var.r(false);
        return strQ;
    }

    public static final String C(UsageCount usageCount, l46 l46Var) {
        int i;
        int i2;
        int i3 = kc.b[usageCount.getType().ordinal()];
        if (i3 == 1) {
            i = R.string.account_usage_detail_free_uses;
            i2 = 1572975699;
        } else if (i3 == 2) {
            i = R.string.account_usage_detail_member_readings;
            i2 = 1572978169;
        } else if (i3 == 3) {
            i = R.string.account_usage_detail_refill_credit;
            i2 = 1572980887;
        } else {
            if (i3 != 4) {
                throw tec.d(1572974838, l46Var, false);
            }
            i = R.string.account_usage_detail_bonus_uses;
            i2 = 1572983700;
        }
        return tec.i(l46Var, i2, i, l46Var, false);
    }

    public static final String D(UserSubscriptionInformation userSubscriptionInformation, e4d e4dVar, l46 l46Var) {
        int i;
        int i2;
        LevelAndKind levelAndKind;
        int i3 = e4dVar == null ? -1 : kc.c[e4dVar.ordinal()];
        SubscriptionKind kind = null;
        if (i3 == -1) {
            l46Var.f0(-394488017);
            l46Var.r(false);
            return null;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return tec.i(l46Var, 2065482933, R.string.premium_unlock, l46Var, false);
            }
            throw tec.d(2065472476, l46Var, false);
        }
        l46Var.f0(-394807998);
        QuinSubscription subscription = userSubscriptionInformation.getSubscription();
        if (subscription != null && (levelAndKind = subscription.getLevelAndKind()) != null) {
            kind = levelAndKind.getKind();
        }
        if (kind == SubscriptionKind.Month) {
            i = -394714068;
            i2 = R.string.account_banner_upgrade_annual;
        } else {
            i = -394637126;
            i2 = R.string.premium_upgrade;
        }
        String strI = tec.i(l46Var, i, i2, l46Var, false);
        l46Var.r(false);
        return strI;
    }

    public static final fxd E() {
        return b21.P(1.0f, 200.0f, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String F(UserSubscriptionInformation userSubscriptionInformation, lb lbVar) {
        ZonedDateTime zonedDateTimeAtZone;
        ChronoLocalDateTime<LocalDate> localDateTime;
        LocalDateTime expiredTime;
        LocalDateTime localDateTime2;
        LevelAndKind levelAndKind;
        QuinSubscription subscription = userSubscriptionInformation.getSubscription();
        SubscriptionKind kind = (subscription == null || (levelAndKind = subscription.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
        SubscriptionKind subscriptionKind = SubscriptionKind.Month;
        DateTimeFormatter dateTimeFormatter = a;
        if (kind == subscriptionKind || kind == SubscriptionKind.Quarter || kind == SubscriptionKind.Year) {
            LocalDateTime expiredTime2 = subscription.getExpiredTime();
            if (expiredTime2 == null) {
                return null;
            }
            return expiredTime2.format(dateTimeFormatter);
        }
        if (lbVar instanceof ib) {
            return ((ib) lbVar).d;
        }
        if (lbVar instanceof jb) {
            return null;
        }
        if (lbVar instanceof kb) {
            return O(((kb) lbVar).a.getExpireAt());
        }
        if (!(lbVar instanceof hb)) {
            if (lbVar == null) {
                return null;
            }
            ap.c();
            return null;
        }
        QuinSubscription subscription2 = userSubscriptionInformation.getSubscription();
        if (subscription2 == null) {
            localDateTime2 = 0;
        } else if (subscription2.getLevelAndKind().getKind() != SubscriptionKind.Count) {
            expiredTime = subscription2.getExpiredTime();
        } else {
            Instant instantT = T(userSubscriptionInformation.countHeaderExpiredAt());
            if (instantT == null || (zonedDateTimeAtZone = instantT.atZone(ZoneId.systemDefault())) == null) {
                localDateTime2 = 0;
            } else {
                localDateTime = zonedDateTimeAtZone.toLocalDateTime();
            }
        }
        if (localDateTime2 == 0) {
            localDateTime2 = localDateTime;
            localDateTime2 = expiredTime;
            return null;
        }
        localDateTime2 = localDateTime;
        localDateTime2 = expiredTime;
        return localDateTime2.format(dateTimeFormatter);
    }

    public static final String G(UserSubscriptionInformation userSubscriptionInformation, lb lbVar, l46 l46Var) {
        String strQ;
        LevelAndKind levelAndKind;
        l46Var.f0(1600434051);
        QuinSubscription subscription = userSubscriptionInformation.getSubscription();
        SubscriptionKind kind = (subscription == null || (levelAndKind = subscription.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
        if (kind == SubscriptionKind.Month || kind == SubscriptionKind.Quarter || kind == SubscriptionKind.Year) {
            l46Var.f0(99166696);
            LevelAndKind levelAndKind2 = subscription.getLevelAndKind();
            c48 c48Var = LevelAndKind.Companion;
            String strQ2 = Q(levelAndKind2, l46Var);
            l46Var.r(false);
            l46Var.r(false);
            return strQ2;
        }
        l46Var.f0(99219551);
        l46Var.r(false);
        if (lbVar instanceof ib) {
            l46Var.f0(418845558);
            strQ = B(((ib) lbVar).a, l46Var);
            l46Var.r(false);
        } else if (lbVar instanceof jb) {
            l46Var.f0(418848054);
            UsageCount usageCount = ((jb) lbVar).a;
            kif kifVar = UsageCount.Companion;
            strQ = C(usageCount, l46Var);
            l46Var.r(false);
        } else if (lbVar instanceof kb) {
            l46Var.f0(418849951);
            strQ = afc.q(H(((kb) lbVar).a, kind), l46Var);
            l46Var.r(false);
        } else {
            if (!(lbVar instanceof hb) && lbVar != null) {
                throw tec.d(418843312, l46Var, false);
            }
            l46Var.f0(418854344);
            LevelAndKind levelAndKind3 = subscription != null ? subscription.getLevelAndKind() : null;
            c48 c48Var2 = LevelAndKind.Companion;
            strQ = Q(levelAndKind3, l46Var);
            l46Var.r(false);
        }
        l46Var.r(false);
        return strQ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int H(UsageBillingBalance usageBillingBalance, SubscriptionKind subscriptionKind) {
        String source = usageBillingBalance.getSource();
        switch (source.hashCode()) {
            case -1147774956:
                if (source.equals(UsageBillingBalance.SOURCE_ADDON_A)) {
                    return R.string.account_usage_detail_refill_credit;
                }
                break;
            case -1147774955:
                if (source.equals(UsageBillingBalance.SOURCE_ADDON_B)) {
                    return R.string.account_usage_detail_refill_credit;
                }
                break;
            case 3172656:
                if (source.equals(UsageBillingBalance.SOURCE_GIFT)) {
                    return R.string.account_usage_detail_event_bonus;
                }
                break;
            case 1443464100:
                if (source.equals(UsageBillingBalance.SOURCE_VIP_WEEK)) {
                    return R.string.account_usage_title_week;
                }
                break;
            case 1443523565:
                if (source.equals(UsageBillingBalance.SOURCE_VIP_YEAR)) {
                    return R.string.account_usage_title_month;
                }
                break;
            case 1788785872:
                if (source.equals(UsageBillingBalance.SOURCE_VIP_MONTH)) {
                    return R.string.account_usage_title;
                }
                break;
        }
        int i = subscriptionKind == null ? -1 : kc.a[subscriptionKind.ordinal()];
        return (i == 3 || i == 4) ? R.string.account_usage_title_month : R.string.account_usage_title;
    }

    public static final UsageBillingBalance I(UserSubscriptionInformation userSubscriptionInformation) {
        Object next;
        ArrayList arrayListU = U(userSubscriptionInformation);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (((UsageBillingBalance) obj).isAvailable()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        Object obj2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                UsageBillingBalance usageBillingBalance = (UsageBillingBalance) next;
                String nextRefreshAt = usageBillingBalance.getNextRefreshAt();
                if (nextRefreshAt == null) {
                    nextRefreshAt = usageBillingBalance.getExpireAt();
                }
                Instant instantT = T(nextRefreshAt);
                if (instantT == null) {
                    instantT = Instant.MAX;
                }
                do {
                    Object next2 = it.next();
                    UsageBillingBalance usageBillingBalance2 = (UsageBillingBalance) next2;
                    String nextRefreshAt2 = usageBillingBalance2.getNextRefreshAt();
                    if (nextRefreshAt2 == null) {
                        nextRefreshAt2 = usageBillingBalance2.getExpireAt();
                    }
                    Instant instantT2 = T(nextRefreshAt2);
                    if (instantT2 == null) {
                        instantT2 = Instant.MAX;
                    }
                    if (instantT.compareTo(instantT2) > 0) {
                        next = next2;
                        instantT = instantT2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        UsageBillingBalance usageBillingBalance3 = (UsageBillingBalance) next;
        if (usageBillingBalance3 != null) {
            return usageBillingBalance3;
        }
        for (Object obj3 : arrayListU) {
            if (((UsageBillingBalance) obj3).getInUse()) {
                obj2 = obj3;
                break;
            }
        }
        UsageBillingBalance usageBillingBalance4 = (UsageBillingBalance) obj2;
        return usageBillingBalance4 == null ? (UsageBillingBalance) s72.x0(arrayListU) : usageBillingBalance4;
    }

    public static final ArrayList J(UserSubscriptionInformation userSubscriptionInformation) {
        c78 c78VarW = t72.w();
        List<ExpireableCount> limitedQuotaList = userSubscriptionInformation.getLimitedQuotaList();
        if (limitedQuotaList == null) {
            limitedQuotaList = pu4.a;
        }
        c78VarW.addAll(limitedQuotaList);
        ExpireableCount compensateCount = userSubscriptionInformation.getCompensateCount();
        if (compensateCount != null) {
            c78VarW.add(compensateCount);
        }
        c78 c78VarN = c78VarW.n();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c78VarN.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return arrayList;
            }
            Object next = ql6Var.next();
            if (R((ExpireableCount) next) > 0) {
                arrayList.add(next);
            }
        }
    }

    public static final UsageCount K(UserSubscriptionInformation userSubscriptionInformation) {
        List<UsageCount> usageCounts = userSubscriptionInformation.getUsageCounts();
        ArrayList arrayList = new ArrayList();
        for (Object obj : usageCounts) {
            if (((UsageCount) obj).getType() == UsageType.Free) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int iS = 0;
        int total = 0;
        while (it.hasNext()) {
            total += ((UsageCount) it.next()).getTotal();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iS += S((UsageCount) it2.next());
        }
        if (iS > 0) {
            return new UsageCount(UsageType.Free, total - iS, total);
        }
        return null;
    }

    public static final boolean L(String str, String... strArr) {
        for (String str2 : strArr) {
            if (v4e.F(str, str2, false)) {
                return true;
            }
        }
        return false;
    }

    public static final String M(UsageCount usageCount, int i, l46 l46Var, int i2) {
        kif kifVar = UsageCount.Companion;
        return afc.r(R.string.account_usage_count_ratio, new Object[]{C(usageCount, l46Var), Integer.valueOf(i), Integer.valueOf(usageCount.getTotal())}, l46Var);
    }

    public static final String N(kb kbVar, l46 l46Var) {
        String str = kbVar.b;
        String str2 = kbVar.c;
        if (str != null) {
            l46Var.f0(988258791);
            String strR = afc.r(R.string.account_usage_refresh_at, new Object[]{str}, l46Var);
            l46Var.r(false);
            return strR;
        }
        if (str2 == null) {
            l46Var.f0(571411223);
            l46Var.r(false);
            return "";
        }
        l46Var.f0(988261667);
        String strR2 = afc.r(R.string.account_usage_expires_at, new Object[]{str2}, l46Var);
        l46Var.r(false);
        return strR2;
    }

    public static final String O(String str) {
        ZonedDateTime zonedDateTimeAtZone;
        LocalDate localDate;
        Instant instantT = T(str);
        if (instantT == null || (zonedDateTimeAtZone = instantT.atZone(ZoneId.systemDefault())) == null || (localDate = zonedDateTimeAtZone.toLocalDate()) == null) {
            return null;
        }
        return localDate.format(a);
    }

    public static final long P(l46 l46Var) {
        pr4 pr4Var = l8b.a;
        if (k8b.e((e8b) l46Var.k(pr4Var))) {
            l46Var.f0(1779032449);
            long j = ((e8b) l46Var.k(pr4Var)).v;
            l46Var.r(false);
            return j;
        }
        l46Var.f0(1779074919);
        long j2 = ((e8b) l46Var.k(pr4Var)).q;
        l46Var.r(false);
        return j2;
    }

    public static final String Q(LevelAndKind levelAndKind, l46 l46Var) {
        int i;
        int i2;
        String strI;
        int i3;
        int i4;
        l46Var.f0(-1296075657);
        if (levelAndKind == null) {
            String strI2 = tec.i(l46Var, 366126680, R.string.premium_unlock_quin, l46Var, false);
            l46Var.r(false);
            return strI2;
        }
        l46Var.f0(11810290);
        l46Var.r(false);
        int iOrdinal = levelAndKind.getLevel().ordinal();
        if (iOrdinal == 0) {
            i = 11827455;
            i2 = R.string.pay_level_basic;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i = 11832001;
                    i2 = R.string.pay_level_supreme;
                } else {
                    if (iOrdinal != 3) {
                        throw tec.d(11813190, l46Var, false);
                    }
                    l46Var.f0(366249967);
                    int i5 = kc.a[levelAndKind.getKind().ordinal()];
                    if (i5 == 1) {
                        i3 = 11815881;
                        i4 = R.string.account_banner_times_card;
                    } else if (i5 == 2) {
                        i3 = 11818605;
                        i4 = R.string.account_banner_monthly_member;
                    } else if (i5 == 3) {
                        i3 = 11821519;
                        i4 = R.string.account_banner_quarterly_member;
                    } else {
                        if (i5 != 4) {
                            throw tec.d(11814515, l46Var, false);
                        }
                        i3 = 11824396;
                        i4 = R.string.account_banner_annual_member;
                    }
                    strI = tec.i(l46Var, i3, i4, l46Var, false);
                    l46Var.r(false);
                }
                l46Var.r(false);
                return strI;
            }
            i = 11829757;
            i2 = R.string.pay_level_pro;
        }
        strI = tec.i(l46Var, i, i2, l46Var, false);
        l46Var.r(false);
        return strI;
    }

    public static final int R(ExpireableCount expireableCount) {
        int totalCount = expireableCount.getTotalCount() - expireableCount.getUsedCount();
        if (totalCount < 0) {
            return 0;
        }
        return totalCount;
    }

    public static final int S(UsageCount usageCount) {
        int total = usageCount.getTotal() - usageCount.getUsed();
        if (total < 0) {
            return 0;
        }
        return total;
    }

    public static final Instant T(String str) {
        Object dzbVar;
        if (str == null) {
            return null;
        }
        try {
            dzbVar = Instant.parse(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return (Instant) (dzbVar instanceof dzb ? null : dzbVar);
    }

    public static final ArrayList U(UserSubscriptionInformation userSubscriptionInformation) {
        UsageBilling usageBilling = userSubscriptionInformation.getUsageBilling();
        List<UsageBillingBalance> balances = usageBilling != null ? usageBilling.getBalances() : null;
        if (balances == null) {
            balances = pu4.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : balances) {
            UsageBillingBalance usageBillingBalance = (UsageBillingBalance) obj;
            if ((!pa7.t(usageBillingBalance.getSource(), UsageBillingBalance.SOURCE_ADDON_A) && !pa7.t(usageBillingBalance.getSource(), UsageBillingBalance.SOURCE_ADDON_B)) || usageBillingBalance.getRemainingPercent() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void a(int i, long j, x16 x16Var, l46 l46Var, boolean z) {
        int i2;
        l46 l46Var2;
        l46Var.h0(-1499484156);
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            float fFloatValue = z ? 0.0f : 180.0f;
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                l46Var.f0(822541542);
                l46Var.r(false);
                l46Var2 = l46Var;
            } else {
                l46Var.f0(822577192);
                l46Var2 = l46Var;
                fFloatValue = ((Number) vx.b(fFloatValue, E(), "account_usage_chevron_rotation", null, l46Var, 3072, 20).getValue()).floatValue();
                l46Var2.r(false);
            }
            gu6.a(z5c.x(), null, q6c.i(b.c(oa7.E(androidx.compose.foundation.layout.b.l(g09.a, 24.0f), a7c.a), false, null, null, x16Var, 15), fFloatValue), j, l46Var2, ((i2 << 6) & 7168) | 48, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tb(z, j, x16Var, i, 0);
        }
    }

    public static final void b(int i, int i2, String str, fb fbVar, l46 l46Var, int i3) {
        int i4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1886066698);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var2.g(fbVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var2.W(i4 & 1, (i4 & 1171) != 1170)) {
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            kx0 kx0Var = ndb.X;
            t7c t7cVarA = s7c.a(xc0.g, kx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            t7c t7cVarA2 = s7c.a(xc0.a, kx0Var, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            String strValueOf = String.valueOf(i);
            mue mueVar = pue.a;
            mue mueVarO = pue.o(l46Var2);
            cq5 cq5Var = cr5.c;
            nte.b(strValueOf, null, fbVar.a, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mue.a(mueVarO, 0L, 0L, null, cq5Var, 0L, null, 0, 0L, null, null, 16777183), l46Var2, 0, 24576, 114682);
            nte.b(tec.e(i2, "/"), null, y72.b(fbVar.a, 0.3f), 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mue.a(pue.o(l46Var), 0L, 0L, null, cq5Var, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 24576, 114682);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var, 8.0f));
            String strQ = afc.q(R.string.account_usage_remaining_count_label, l46Var);
            mue mueVar2 = oue.a;
            nte.b(strQ, null, fbVar.c, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.g(l46Var), l46Var, 0, 24576, 114682);
            l46Var2 = l46Var;
            l46Var2.r(true);
            if (str == null) {
                l46Var2.f0(-1304064000);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1304063999);
                nte.b(afc.r(R.string.account_usage_expires_at, new Object[]{str}, l46Var2), null, fbVar.a, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.g(l46Var2), l46Var2, 0, 24960, 110586);
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vb(i, i2, str, fbVar, i3, 0);
        }
    }

    public static final void c(long j, l46 l46Var, int i) {
        l46Var.h0(-409682593);
        int i2 = (l46Var.f(j) ? 4 : 2) | i;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new ac(j, 0);
                l46Var.p0(objR);
            }
            s21.a(b21.s(j09VarD, (a26) objR), l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bc(i, i3, j);
        }
    }

    public static final void d(gb gbVar, fb fbVar, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1056406905);
        if ((i & 6) == 0) {
            i2 = (l46Var2.i(gbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.g(fbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            uc0 uc0Var = new uc0(8.0f, true, new qc0(0));
            kx0 kx0Var = ndb.z;
            t7c t7cVarA = s7c.a(uc0Var, kx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            t7c t7cVarA2 = s7c.a(xc0.a, kx0Var, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, jw7Var);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            jw7 jw7Var2 = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            String str = gbVar.a;
            mue mueVar = pue.a;
            nte.b(str, jw7Var2, fbVar.b, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.i(l46Var), l46Var, 0, 24960, 110584);
            l46Var2 = l46Var;
            if (gbVar.f) {
                l46Var2.f0(554112566);
                h(ynb.d0(4.0f, 0.0f, 12.0f, 0.0f, 10, g09Var), fbVar.c, x16Var, l46Var2, (i2 & 896) | 6);
                l46Var2.r(false);
            } else {
                l46Var2.f0(554299682);
                o5c.f(l46Var2, androidx.compose.foundation.layout.b.p(g09Var, 12.0f));
                l46Var2.r(false);
            }
            s(gbVar.b, gbVar.d, fbVar.c, l46Var2, 0);
            l46Var2.r(true);
            String str2 = gbVar.c;
            if (str2 == null) {
                l46Var2.f0(1475800471);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1475800472);
                String strR = afc.r(R.string.account_usage_expires_at, new Object[]{str2}, l46Var2);
                mue mueVar2 = oue.a;
                nte.b(strR, null, fbVar.b, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.g(l46Var2), l46Var, 0, 24960, 110586);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, gbVar, fbVar, x16Var, 1);
        }
    }

    public static final void e(lb lbVar, UserSubscriptionInformation userSubscriptionInformation, fb fbVar, x16 x16Var, l46 l46Var, int i) {
        List list;
        l46Var.h0(-1007303021);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? l46Var.g(lbVar) : l46Var.i(lbVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(userSubscriptionInformation) : l46Var.i(userSubscriptionInformation) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(fbVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            tpf tpfVar = UserSubscriptionInformation.Companion;
            int i3 = i2 >> 3;
            if (lbVar instanceof hb) {
                l46Var.f0(-2088831906);
                ArrayList arrayList = new ArrayList();
                UsageCount usageCountK = K(userSubscriptionInformation);
                if (usageCountK == null) {
                    l46Var.f0(1838349065);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1838349066);
                    arrayList.add(new gb(M(usageCountK, S(usageCountK), l46Var, UsageCount.$stable), false, null, Instant.MIN));
                    l46Var.r(false);
                }
                l46Var.f0(1444782799);
                List<ExpireableCount> limitedQuotaList = userSubscriptionInformation.getLimitedQuotaList();
                if (limitedQuotaList == null) {
                    limitedQuotaList = pu4.a;
                }
                for (ExpireableCount expireableCount : limitedQuotaList) {
                    int iR = R(expireableCount);
                    if (iR > 0) {
                        l46Var.f0(2030545298);
                        arrayList.add(new gb(afc.r(R.string.account_usage_count_ratio, new Object[]{B(expireableCount, l46Var), Integer.valueOf(iR), Integer.valueOf(expireableCount.getTotalCount())}, l46Var), false, O(expireableCount.getExpiredAt()), T(expireableCount.getExpiredAt())));
                        l46Var.r(false);
                    } else {
                        l46Var.f0(2030896063);
                        l46Var.r(false);
                    }
                }
                l46Var.r(false);
                ExpireableCount compensateCount = userSubscriptionInformation.getCompensateCount();
                if (compensateCount == null) {
                    l46Var.f0(1839065878);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1839065879);
                    int iR2 = R(compensateCount);
                    if (iR2 > 0) {
                        l46Var.f0(249305161);
                        arrayList.add(new gb(afc.r(R.string.account_usage_count_ratio, new Object[]{B(compensateCount, l46Var), Integer.valueOf(iR2), Integer.valueOf(compensateCount.getTotalCount())}, l46Var), false, O(compensateCount.getExpiredAt()), T(compensateCount.getExpiredAt())));
                        l46Var.r(false);
                    } else {
                        l46Var.f0(249655926);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                }
                l46Var.f0(1444814402);
                List<UsageCount> usageCounts = userSubscriptionInformation.getUsageCounts();
                ArrayList<UsageCount> arrayList2 = new ArrayList();
                for (Object obj : usageCounts) {
                    if (((UsageCount) obj).getType() != UsageType.Free) {
                        arrayList2.add(obj);
                    }
                }
                for (UsageCount usageCount : arrayList2) {
                    int iS = S(usageCount);
                    if (iS > 0) {
                        l46Var.f0(-1945263584);
                        arrayList.add(new gb(M(usageCount, iS, l46Var, UsageCount.$stable), false, null, null));
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1945084838);
                        l46Var.r(false);
                    }
                }
                l46Var.r(false);
                List listB1 = s72.b1(arrayList, new ww2(9));
                ArrayList arrayList3 = new ArrayList(t72.u(listB1, 10));
                int i4 = 0;
                for (Object obj2 : listB1) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        t72.Z();
                        throw null;
                    }
                    gb gbVar = (gb) obj2;
                    boolean z = i4 == 0;
                    String str = gbVar.a;
                    String str2 = gbVar.c;
                    Integer num = gbVar.d;
                    Instant instant = gbVar.e;
                    boolean z2 = gbVar.f;
                    str.getClass();
                    arrayList3.add(new gb(str, z, str2, num, instant, z2));
                    i4 = i5;
                }
                l46Var.r(false);
                list = arrayList3;
            } else if (lbVar instanceof ib) {
                l46Var.f0(-2088828630);
                List listA = A(userSubscriptionInformation, ((ib) lbVar).a, null, null, l46Var);
                l46Var.r(false);
                list = listA;
            } else if (lbVar instanceof jb) {
                l46Var.f0(-2088821142);
                UsageCount usageCount2 = ((jb) lbVar).a;
                kif kifVar = UsageCount.Companion;
                List listA2 = A(userSubscriptionInformation, null, usageCount2, null, l46Var);
                l46Var.r(false);
                list = listA2;
            } else {
                if (!(lbVar instanceof kb)) {
                    throw tec.d(-2088832965, l46Var, false);
                }
                l46Var.f0(-2088813780);
                List listA3 = A(userSubscriptionInformation, null, null, ((kb) lbVar).a, l46Var);
                l46Var.r(false);
                list = listA3;
            }
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            Iterator itS = kv2.s(l46Var, j09VarJ, hj6.x, -1864767608, list);
            while (itS.hasNext()) {
                d((gb) itS.next(), fbVar, x16Var, l46Var, i3 & 1008);
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(lbVar, userSubscriptionInformation, fbVar, x16Var, i, 1);
        }
    }

    public static final void f(j09 j09Var, lb lbVar, UserSubscriptionInformation userSubscriptionInformation, fb fbVar, x16 x16Var, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        x16 x16Var2;
        j09 j09Var3;
        l46Var.h0(-1818354972);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? l46Var.g(lbVar) : l46Var.i(lbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? l46Var.g(userSubscriptionInformation) : l46Var.i(userSubscriptionInformation) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.g(fbVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            x16Var2 = x16Var;
            i3 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            x16Var2 = x16Var;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            g09 g09Var = g09.a;
            j09 j09Var4 = i4 != 0 ? g09Var : j09Var2;
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var4);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 12.0f));
            c(fbVar.d, l46Var, 0);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 12.0f));
            int i5 = i3 >> 3;
            e(lbVar, userSubscriptionInformation, fbVar, x16Var2, l46Var, (i5 & 14) | (UserSubscriptionInformation.$stable << 3) | (i5 & 112) | (i5 & 896) | (i5 & 7168));
            l46Var.r(true);
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r8(j09Var3, lbVar, userSubscriptionInformation, fbVar, x16Var, i, i2, 1);
        }
    }

    public static final void g(UserSubscriptionInformation userSubscriptionInformation, lb lbVar, e4d e4dVar, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2;
        long jB;
        long jD;
        y6c y6cVar;
        j09 j09Var;
        j09 j09VarC;
        String strR;
        l46Var.h0(1975041120);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(userSubscriptionInformation) : l46Var.i(userSubscriptionInformation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(lbVar) : l46Var.i(lbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.e(e4dVar == null ? -1 : e4dVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            QuinSubscription subscription = userSubscriptionInformation.getSubscription();
            tpf tpfVar = UserSubscriptionInformation.Companion;
            String strG = G(userSubscriptionInformation, lbVar, l46Var);
            String strF = F(userSubscriptionInformation, lbVar);
            String strD = D(userSubscriptionInformation, e4dVar, l46Var);
            pr4 pr4Var = l8b.a;
            boolean zE = k8b.e((e8b) l46Var.k(pr4Var));
            if (zE) {
                l46Var.f0(-361009100);
                jB = ((e8b) l46Var.k(pr4Var)).v;
            } else {
                l46Var.f0(-361008050);
                jB = l8b.b(l46Var);
            }
            l46Var.r(false);
            long j = jB;
            if (zE) {
                l46Var.f0(-361006060);
                jD = ((e8b) l46Var.k(pr4Var)).v;
            } else {
                l46Var.f0(-361005008);
                jD = l8b.d(l46Var);
            }
            l46Var.r(false);
            long j2 = jD;
            y6c y6cVarB = a7c.b(999.0f);
            g09 g09Var = g09.a;
            j09 j09VarD = androidx.compose.foundation.layout.b.c(g09Var, 1.0f).D(subscription != null ? androidx.compose.foundation.layout.b.d(g09Var, 144.0f) : g09Var);
            if (strD != null) {
                y6cVar = y6cVarB;
                j09Var = j09VarD;
                j09VarC = b.c(g09Var, false, null, null, x16Var, 15);
            } else {
                y6cVar = y6cVarB;
                j09Var = j09VarD;
                j09VarC = g09Var;
            }
            j09 j09VarD2 = j09Var.D(j09VarC);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD2);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09 j09VarC0 = ynb.c0(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 24.0f, 24.0f, 24.0f, subscription == null ? 24.0f : 0.0f);
            int i3 = i2;
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarC0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            mue mueVar = pue.a;
            nte.b(strG, null, j, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mue.a(pue.n(l46Var), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 24960, 110586);
            float f = 12.0f;
            if (strF != null) {
                l46Var.f0(-800055149);
                o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, zE ? 8.0f : 12.0f));
                if (userSubscriptionInformation.isAutoRenew()) {
                    l46Var.f0(-799936791);
                    strR = afc.r(R.string.settings_account_banner_renew_prefix, new Object[]{strF}, l46Var);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-799838955);
                    strR = afc.r(R.string.account_usage_expires_at, new Object[]{strF}, l46Var);
                    l46Var.r(false);
                }
                if (zE) {
                    l46Var.f0(-799734020);
                    if9.d(0, l46Var, null, strR);
                    l46Var.r(false);
                    l46Var2 = l46Var;
                } else {
                    l46Var.f0(-799638633);
                    mue mueVar2 = oue.a;
                    nte.b(strR, null, j2, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.g(l46Var), l46Var, 0, 24960, 110586);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                }
                l46Var2.r(false);
            } else {
                l46Var2 = l46Var;
                f = 12.0f;
                if (subscription == null) {
                    ib8.r(12.0f, -799383658, l46Var2, l46Var2, g09Var);
                    x(afc.q(R.string.premiun_tips_1, l46Var2), l46Var2, 0);
                    x(ks0.h(8.0f, R.string.premium_tips_3, l46Var2, l46Var2, g09Var), l46Var2, 0);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-799183770);
                    l46Var2.r(false);
                }
            }
            if (strD != null) {
                ib8.r(f, -799132682, l46Var2, l46Var2, g09Var);
                if (zE) {
                    l46Var2.f0(-799084570);
                    if9.b((i3 >> 6) & 112, x16Var, l46Var2, null, strD);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-798930469);
                    y6c y6cVar2 = y6cVar;
                    nte.b(strD, ynb.a0(b.c(db6.w(oa7.E(g09Var, y6cVar2), 0.5f, y72.b(l8b.l(l46Var2), 0.5f), y6cVar2), false, null, null, x16Var, 15), 20.0f, 4.0f), l8b.b(l46Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.i(l46Var2), l46Var, 0, 24576, 114680);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                }
                l46Var2.r(false);
            } else {
                l46Var2.f0(-798502266);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(i, 0, userSubscriptionInformation, lbVar, e4dVar, x16Var);
        }
    }

    public static final void h(j09 j09Var, long j, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(900811153);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            gu6.b(od4.A(R.drawable.ic_account_usage_question, 0, l46Var), null, b.c(androidx.compose.foundation.layout.b.l(j09Var, 12.0f), false, null, null, x16Var, 15), j, l46Var, 56 | ((i2 << 6) & 7168), 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xb(j09Var, j, x16Var, i);
        }
    }

    public static final void i(String str, long j, l46 l46Var, int i) {
        l46Var.h0(1389567714);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.f(j) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(14.0f, true, new qc0(0)), ndb.y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            s21.a(tm7.o(oa7.E(androidx.compose.foundation.layout.b.l(ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var), 7.0f), a7c.a), j, g21.f), l46Var, 0);
            jw7 jw7Var = new jw7(1.0f, true);
            mue mueVar = oue.a;
            nte.b(str, jw7Var, ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, i2 & 14, 0, 131064);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sb(i, 0, j, str);
        }
    }

    public static final void j(String str, x16 x16Var, l46 l46Var, int i) {
        x16 x16Var2;
        l46 l46Var2;
        l46Var.h0(1941140563);
        int i2 = 2;
        int i3 = (l46Var.g(str) ? 4 : 2) | i;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            t72.b(x16Var2, new s84(false, false, 3), af1.b0(-1631331492, new mb(str, x16Var, i4), l46Var), l46Var2, 438, 0);
        } else {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb(str, x16Var2, i, i2);
        }
    }

    public static final void k(String str, x16 x16Var, l46 l46Var, int i) {
        int i2;
        long jB;
        long jB2;
        long jH;
        boolean z;
        j09 j09VarW;
        ov7 ov7Var;
        boolean z2;
        x16 x16Var2 = x16Var;
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        y02 y02Var = g21.f;
        x16Var2.getClass();
        l46Var2.h0(-75715780);
        int i3 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.i(x16Var2) ? 32 : 16);
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            boolean zE = k8b.e((e8b) l46Var2.k(l8b.a));
            Context context = (Context) l46Var2.k(uq.b);
            boolean zG = ((i3 & 14) == 4) | l46Var2.g((Configuration) l46Var2.k(uq.a));
            Object objR = l46Var2.R();
            if (zG || objR == sf2.a) {
                objR = rfc.k(context, str);
                l46Var2.p0(objR);
            }
            String strI = (String) objR;
            if (strI == null) {
                strI = tec.i(l46Var2, 251590517, R.string.usage_daily_limit_reset_tomorrow, l46Var2, false);
            } else {
                l46Var2.f0(251587572);
                l46Var2.r(false);
            }
            List listI = t72.I(afc.q(R.string.account_usage_info_bullet_consumption, l46Var2), afc.q(R.string.account_usage_info_bullet_complexity, l46Var2), afc.q(R.string.account_usage_info_bullet_follow_up, l46Var2), afc.r(R.string.account_usage_info_bullet_daily_limit, new Object[]{strI}, l46Var2));
            y6c y6cVarB = a7c.b(32.0f);
            long jH2 = l8b.h(l46Var2);
            if (zE) {
                l46Var2.f0(251606029);
                l46Var2.r(false);
                jB = abg.d(4285820151L);
            } else {
                l46Var2.f0(251606986);
                jB = l8b.b(l46Var2);
                l46Var2.r(false);
            }
            long j = jB;
            if (zE) {
                l46Var2.f0(251608941);
                l46Var2.r(false);
                jB2 = abg.d(4285820151L);
            } else {
                l46Var2.f0(251609898);
                jB2 = l8b.b(l46Var2);
                l46Var2.r(false);
            }
            long j2 = jB2;
            if (zE) {
                l46Var2.f0(251611937);
                l46Var2.r(false);
                jH = y72.e;
            } else {
                l46Var2.f0(251612517);
                jH = l8b.h(l46Var2);
                l46Var2.r(false);
            }
            long j3 = jH;
            g09 g09Var = g09.a;
            j09 j09VarO = tm7.o(oa7.E(ynb.b0(18.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 2), y6cVarB), jH2, y02Var);
            if (zE) {
                l46Var2.f0(-789758424);
                z = false;
                l46Var2.r(false);
                j09VarW = g09Var;
            } else {
                z = false;
                l46Var2.f0(-789720511);
                j09VarW = db6.w(g09Var, 0.5f, y72.b(l8b.l(l46Var2), 0.35f), y6cVarB);
                l46Var2.r(false);
            }
            j09 j09VarD = j09VarO.D(j09VarW);
            xn8 xn8VarC = s21.c(ndb.b, z);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z3) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, xn8VarC);
            dec.l(he2Var3, l46Var2, u8aVarM);
            ib8.s(iHashCode, l46Var2, he2Var2, l46Var2);
            dec.l(he2Var, l46Var2, j09VarJ);
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var, l46Var2, (i3 << 12) & 458752, 30);
            j09 j09VarZ = ynb.Z(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 32.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, c92VarA);
            dec.l(he2Var3, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var2, l46Var2);
            dec.l(he2Var, l46Var2, j09VarJ2);
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            String strQ = afc.q(R.string.account_usage_info_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, j09VarC, l8b.b(l46Var2), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 48, 0, 130040);
            j09 j09VarE = kv2.e(g09Var, 28.0f, l46Var, g09Var, 1.0f);
            String strQ2 = afc.q(R.string.account_usage_info_subtitle, l46Var);
            mue mueVar2 = oue.a;
            nte.b(strQ2, j09VarE, l8b.b(l46Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var), l46Var, 48, 0, 131064);
            l46Var2 = l46Var;
            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var, 16.0f));
            c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                ov7Var = ov7Var2;
                l46Var2.l(ov7Var);
            } else {
                ov7Var = ov7Var2;
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, c92VarA2);
            dec.l(he2Var3, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var2, l46Var2);
            Iterator itS = kv2.s(l46Var2, j09VarJ3, he2Var, 1328765292, listI);
            while (itS.hasNext()) {
                i((String) itS.next(), j, l46Var2, 0);
            }
            l46Var2.r(false);
            l46Var2.r(true);
            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var, 24.0f));
            if (zE) {
                l46Var2.f0(-1824119936);
                j09 j09VarC2 = b.c(tm7.o(oa7.E(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 56.0f), a7c.b(999.0f)), j2, y02Var), false, null, null, x16Var, 15);
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                int iHashCode4 = Long.hashCode(l46Var2.T);
                u8a u8aVarM4 = l46Var2.m();
                j09 j09VarJ4 = m93.J(l46Var2, j09VarC2);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, xn8VarC2);
                dec.l(he2Var3, l46Var2, u8aVarM4);
                ib8.s(iHashCode4, l46Var2, he2Var2, l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ4);
                String strQ3 = afc.q(R.string.account_usage_info_confirm, l46Var2);
                mue mueVar3 = pue.a;
                nte.b(strQ3, null, j3, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mue.a(pue.o(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 24576, 114682);
                l46Var2 = l46Var;
                l46Var2.r(true);
                l46Var2.r(false);
                x16Var2 = x16Var;
                z2 = true;
                i2 = 0;
            } else {
                l46Var2.f0(-1823573375);
                x16Var2 = x16Var;
                i2 = 0;
                c8b.i(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 56.0f), afc.q(R.string.account_usage_info_confirm, l46Var2), null, null, 0L, 0.0f, false, eze.a(l46Var2).a.j, null, false, null, null, x16Var2, l46Var2, 6, (i3 << 3) & 896, 3964);
                l46Var2.r(false);
                z2 = true;
            }
            l46Var2.r(z2);
            l46Var2.r(z2);
        } else {
            i2 = 0;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb(str, x16Var2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:178:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:179:0x0600  */
    /* JADX WARN: Code duplicated, block: B:181:0x060e  */
    public static final void l(lb lbVar, long j, ii6 ii6Var, boolean z, boolean z2, UserSubscriptionInformation userSubscriptionInformation, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        long j2;
        ii6 ii6Var2;
        boolean z3;
        x16 x16Var3;
        ojb ojbVarV;
        qb qbVar;
        fb fbVar;
        float f;
        float f2;
        String strQ;
        g09 g09Var;
        fb fbVar2;
        boolean z4;
        fb fbVar3;
        boolean z5;
        l46 l46Var2;
        LevelAndKind levelAndKind;
        l46 l46Var3 = l46Var;
        l46Var3.h0(856489491);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var3.g(lbVar) : l46Var3.i(lbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= l46Var3.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            ii6Var2 = ii6Var;
            i2 |= l46Var3.g(ii6Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            ii6Var2 = ii6Var;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= l46Var3.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var3.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? l46Var3.g(userSubscriptionInformation) : l46Var3.i(userSubscriptionInformation) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            x16Var3 = x16Var;
            i2 |= l46Var3.i(x16Var3) ? 1048576 : 524288;
        } else {
            x16Var3 = x16Var;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var3.i(x16Var2) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (l46Var3.W(i3 & 1, (i3 & 4793491) != 4793490)) {
            if (lbVar == null) {
                ojbVarV = l46Var3.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    qbVar = new qb(lbVar, j2, ii6Var2, z3, z2, userSubscriptionInformation, x16Var3, x16Var2, i, 0);
                }
            } else {
                pr4 pr4Var = l8b.a;
                boolean zE = k8b.e((e8b) l46Var3.k(pr4Var));
                if (k8b.e((e8b) l46Var3.k(pr4Var))) {
                    l46Var3.f0(65489823);
                    long j3 = ((e8b) l46Var3.k(pr4Var)).v;
                    long j4 = ((e8b) l46Var3.k(pr4Var)).w;
                    long j5 = ((e8b) l46Var3.k(pr4Var)).x;
                    long j6 = y72.e;
                    fbVar = new fb(j3, j4, j5, y72.b(j6, 0.28f), y72.b(j6, 0.34f), j6);
                    l46Var3.r(false);
                } else {
                    l46Var3.f0(65807015);
                    fbVar = new fb(l8b.b(l46Var3), l8b.d(l46Var3), l8b.e(l46Var3), y72.b(l8b.l(l46Var3), 0.35f), y72.b(l8b.l(l46Var3), 0.55f), l8b.b(l46Var3));
                    l46Var3.r(false);
                }
                fb fbVar4 = fbVar;
                QuinSubscription subscription = userSubscriptionInformation.getSubscription();
                SubscriptionKind kind = (subscription == null || (levelAndKind = subscription.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
                if (zE) {
                    l46Var3.f0(-721789353);
                    int i4 = i3 << 6;
                    v(lbVar, j, ii6Var, z, z2, userSubscriptionInformation, kind, fbVar4, x16Var, x16Var2, l46Var3, (i3 & 65534) | (UserSubscriptionInformation.$stable << 15) | (i3 & 458752) | (234881024 & i4) | (i4 & 1879048192));
                    l46Var3.r(false);
                    ojbVarV = l46Var3.v();
                    if (ojbVarV == null) {
                        return;
                    } else {
                        qbVar = new qb(lbVar, j, ii6Var, z, z2, userSubscriptionInformation, x16Var, x16Var2, i, 1);
                    }
                } else {
                    l46Var3.f0(-721428017);
                    l46Var3.r(false);
                    g09 g09Var2 = g09.a;
                    j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var2, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var3.T);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, j09VarC);
                    lf2.q.getClass();
                    l46Var3.j0();
                    boolean z6 = l46Var3.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z6) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var3, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var3, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var3, numValueOf);
                    dec.k(l46Var3);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var3, j09VarJ);
                    j09 j09VarB = d31.a.b(g09Var2);
                    boolean zG = l46Var3.g(fbVar4);
                    Object objR = l46Var3.R();
                    if (zG || objR == sf2.a) {
                        objR = new c1(5, fbVar4);
                        l46Var3.p0(objR);
                    }
                    s21.a(b21.s(j09VarB, (a26) objR), l46Var3, 0);
                    j09 j09VarA0 = ynb.a0(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), 24.0f, 16.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var3, 0);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, j09VarA0);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var, l46Var3, c92VarA);
                    dec.l(he2Var2, l46Var3, u8aVarM2);
                    ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                    dec.l(he2Var4, l46Var3, j09VarJ2);
                    j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var2, 1.0f);
                    kx0 kx0Var = ndb.z;
                    m8c m8cVar = xc0.g;
                    t7c t7cVarA = s7c.a(m8cVar, kx0Var, l46Var3, 54);
                    int iHashCode3 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM3 = l46Var3.m();
                    j09 j09VarJ3 = m93.J(l46Var3, j09VarC2);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var, l46Var3, t7cVarA);
                    dec.l(he2Var2, l46Var3, u8aVarM3);
                    ib8.s(iHashCode3, l46Var3, he2Var3, l46Var3);
                    dec.l(he2Var4, l46Var3, j09VarJ3);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                        f = Float.MAX_VALUE;
                    } else {
                        f = Float.MAX_VALUE;
                        f2 = 1.0f;
                    }
                    jw7 jw7Var = new jw7(f2, true);
                    t7c t7cVarA2 = s7c.a(xc0.a, kx0Var, l46Var3, 48);
                    int iHashCode4 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM4 = l46Var3.m();
                    j09 j09VarJ4 = m93.J(l46Var3, jw7Var);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var, l46Var3, t7cVarA2);
                    dec.l(he2Var2, l46Var3, u8aVarM4);
                    ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
                    dec.l(he2Var4, l46Var3, j09VarJ4);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    jw7 jw7Var2 = new jw7(1.0f > f ? f : 1.0f, false);
                    boolean z7 = lbVar instanceof hb;
                    if (z7) {
                        l46Var3.f0(-2003578166);
                        strQ = afc.r(R.string.premium_today_read_times, new Object[]{Integer.valueOf(((hb) lbVar).a)}, l46Var3);
                        l46Var3.r(false);
                    } else if (lbVar instanceof ib) {
                        l46Var3.f0(-2003571998);
                        strQ = B(((ib) lbVar).a, l46Var3);
                        l46Var3.r(false);
                    } else if (lbVar instanceof jb) {
                        l46Var3.f0(-2003569182);
                        UsageCount usageCount = ((jb) lbVar).a;
                        kif kifVar = UsageCount.Companion;
                        strQ = C(usageCount, l46Var3);
                        l46Var3.r(false);
                    } else {
                        if (!(lbVar instanceof kb)) {
                            throw tec.d(-2003579908, l46Var3, false);
                        }
                        l46Var3.f0(-2003566933);
                        strQ = afc.q(H(((kb) lbVar).a, kind), l46Var3);
                        l46Var3.r(false);
                    }
                    mue mueVar = pue.a;
                    nte.b(strQ, jw7Var2, fbVar4.a, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mue.a(pue.q(l46Var3), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 24960, 110584);
                    l46 l46Var4 = l46Var;
                    boolean z8 = lbVar instanceof kb;
                    if (z8) {
                        l46Var4.f0(-1980673363);
                        g09Var = g09Var2;
                        fbVar2 = fbVar4;
                        h(ynb.d0(4.0f, 0.0f, 0.0f, 0.0f, 14, g09Var2), fbVar2.c, x16Var2, l46Var4, ((i3 >> 15) & 896) | 6);
                        z4 = false;
                        l46Var4.r(false);
                    } else {
                        g09Var = g09Var2;
                        fbVar2 = fbVar4;
                        z4 = false;
                        l46Var4.f0(-1980483085);
                        l46Var4.r(false);
                    }
                    boolean z9 = true;
                    l46Var4.r(true);
                    a((i3 >> 12) & 910, fbVar2.b, x16Var, l46Var4, z2);
                    l46Var4.r(true);
                    if (lbVar instanceof ib) {
                        ib8.r(12.0f, -2033160, l46Var4, l46Var4, g09Var);
                        ib ibVar = (ib) lbVar;
                        fb fbVar5 = fbVar2;
                        b(ibVar.b, ibVar.c, ibVar.d, fbVar5, l46Var4, 0);
                        l46Var4.r(z4);
                        fbVar3 = fbVar5;
                    } else {
                        fb fbVar6 = fbVar2;
                        if (lbVar instanceof jb) {
                            ib8.r(12.0f, -1714201, l46Var4, l46Var4, g09Var);
                            jb jbVar = (jb) lbVar;
                            b(jbVar.b, jbVar.c, null, fbVar6, l46Var4, 384);
                            l46Var4.r(z4);
                            fbVar3 = fbVar6;
                        } else if (z8) {
                            ib8.r(12.0f, -1389073, l46Var4, l46Var4, g09Var);
                            kb kbVar = (kb) lbVar;
                            int i5 = kbVar.d;
                            r(i5 / 100.0f, fbVar6.e, fbVar6.f, l46Var, 0);
                            j09 j09VarE = kv2.e(g09Var, 12.0f, l46Var, g09Var, 1.0f);
                            t7c t7cVarA3 = s7c.a(m8cVar, kx0Var, l46Var, 54);
                            int iHashCode5 = Long.hashCode(l46Var.T);
                            u8a u8aVarM5 = l46Var.m();
                            j09 j09VarJ5 = m93.J(l46Var, j09VarE);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA3);
                            dec.l(he2Var2, l46Var, u8aVarM5);
                            ib8.s(iHashCode5, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ5);
                            String strN = N(kbVar, l46Var);
                            mue mueVar2 = oue.a;
                            nte.b(strN, null, fbVar6.a, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.g(l46Var), l46Var, 0, 24960, 110586);
                            fbVar3 = fbVar6;
                            nte.b(afc.r(R.string.account_usage_remaining_percent, new Object[]{Integer.valueOf(i5)}, l46Var), null, fbVar6.a, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.g(l46Var), l46Var, 0, 24576, 114682);
                            l46Var4 = l46Var;
                            z9 = true;
                            l46Var4.r(true);
                            z5 = false;
                            l46Var4.r(false);
                        } else {
                            fbVar3 = fbVar6;
                            z5 = z4;
                            if (!z7) {
                                throw tec.d(-138613600, l46Var4, z5);
                            }
                            l46Var4.f0(-138558149);
                            l46Var4.r(z5);
                        }
                        if (((Boolean) l46Var4.k(h57.a)).booleanValue()) {
                            l46Var4.f0(-274282);
                            if (z2) {
                                l46Var4.f0(-251466);
                                int i6 = i3 >> 9;
                                l46 l46Var5 = l46Var4;
                                f(null, lbVar, userSubscriptionInformation, fbVar3, x16Var2, l46Var5, ((i3 << 3) & 112) | (UserSubscriptionInformation.$stable << 6) | (i6 & 896) | (i6 & 57344), 1);
                                l46Var2 = l46Var5;
                                l46Var2.r(z5);
                            } else {
                                l46Var2 = l46Var4;
                                l46Var2.f0(-16021);
                                l46Var2.r(z5);
                            }
                            l46Var2.r(z5);
                            l46Var3 = l46Var2;
                        } else {
                            l46 l46Var6 = l46Var4;
                            l46Var6.f0(16839);
                            kx0 kx0Var2 = ndb.y;
                            m93.b(e92.a, z2, null, rw4.e(E(), kx0Var2, 12), rw4.l(E(), kx0Var2, 12), null, af1.b0(-2133959013, new sz7(lbVar, userSubscriptionInformation, fbVar3, x16Var2, 1), l46Var6), l46Var6, ((i3 >> 9) & 112) | 1572870, 18);
                            l46Var3 = l46Var6;
                            l46Var3.r(z5);
                        }
                        l46Var3.r(z9);
                        l46Var3.r(z9);
                    }
                    z5 = z4;
                    if (((Boolean) l46Var4.k(h57.a)).booleanValue()) {
                        l46Var4.f0(-274282);
                        if (z2) {
                            l46Var4.f0(-251466);
                            int i7 = i3 >> 9;
                            l46 l46Var7 = l46Var4;
                            f(null, lbVar, userSubscriptionInformation, fbVar3, x16Var2, l46Var7, ((i3 << 3) & 112) | (UserSubscriptionInformation.$stable << 6) | (i7 & 896) | (i7 & 57344), 1);
                            l46Var2 = l46Var7;
                            l46Var2.r(z5);
                        } else {
                            l46Var2 = l46Var4;
                            l46Var2.f0(-16021);
                            l46Var2.r(z5);
                        }
                        l46Var2.r(z5);
                        l46Var3 = l46Var2;
                    } else {
                        l46 l46Var8 = l46Var4;
                        l46Var8.f0(16839);
                        kx0 kx0Var3 = ndb.y;
                        m93.b(e92.a, z2, null, rw4.e(E(), kx0Var3, 12), rw4.l(E(), kx0Var3, 12), null, af1.b0(-2133959013, new sz7(lbVar, userSubscriptionInformation, fbVar3, x16Var2, 1), l46Var8), l46Var8, ((i3 >> 9) & 112) | 1572870, 18);
                        l46Var3 = l46Var8;
                        l46Var3.r(z5);
                    }
                    l46Var3.r(z9);
                    l46Var3.r(z9);
                }
            }
            ojbVarV.d = qbVar;
        }
        l46Var3.Z();
        ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            qbVar = new qb(lbVar, j, ii6Var, z, z2, userSubscriptionInformation, x16Var, x16Var2, i, 2);
            ojbVarV.d = qbVar;
        }
    }

    public static final void m(j09 j09Var, lb lbVar, UserSubscriptionInformation userSubscriptionInformation, SubscriptionKind subscriptionKind, fb fbVar, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        boolean z2;
        x16 x16Var3;
        x16 x16Var4;
        l46Var.h0(1618257974);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(lbVar) : l46Var.i(lbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(userSubscriptionInformation) : l46Var.i(userSubscriptionInformation) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.e(subscriptionKind == null ? -1 : subscriptionKind.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(fbVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= l46Var.h(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i) == 0) {
            x16Var3 = x16Var;
            i2 |= l46Var.i(x16Var3) ? 1048576 : 524288;
        } else {
            x16Var3 = x16Var;
        }
        if ((12582912 & i) == 0) {
            x16Var4 = x16Var2;
            i2 |= l46Var.i(x16Var4) ? 8388608 : 4194304;
        } else {
            x16Var4 = x16Var2;
        }
        int i3 = i2;
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            j09 j09VarC = androidx.compose.foundation.layout.b.c(j09Var, 1.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            int i4 = i3 >> 3;
            int i5 = i4 & 14;
            o(lbVar, userSubscriptionInformation, subscriptionKind, fbVar, z2, x16Var3, x16Var4, l46Var, (UserSubscriptionInformation.$stable << 3) | i5 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
            n(lbVar, fbVar, l46Var, ((i3 >> 9) & 112) | i5);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cc(j09Var, lbVar, userSubscriptionInformation, subscriptionKind, fbVar, z, x16Var, x16Var2, i);
        }
    }

    public static final void n(lb lbVar, fb fbVar, l46 l46Var, int i) {
        int i2;
        lb lbVar2;
        fb fbVar2;
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(2029867999);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? l46Var2.g(lbVar) : l46Var2.i(lbVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.g(fbVar) ? 32 : 16;
        }
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            boolean z = lbVar instanceof ib;
            g09 g09Var = g09.a;
            if (z) {
                ib8.r(12.0f, -1341796272, l46Var2, l46Var2, g09Var);
                ib ibVar = (ib) lbVar;
                b(ibVar.b, ibVar.c, ibVar.d, fbVar, l46Var2, (i2 << 6) & 7168);
                l46Var2.r(false);
                lbVar2 = lbVar;
                i3 = 0;
                fbVar2 = fbVar;
            } else {
                int i4 = i2;
                if (lbVar instanceof jb) {
                    ib8.r(12.0f, -1341513025, l46Var2, l46Var2, g09Var);
                    jb jbVar = (jb) lbVar;
                    b(jbVar.b, jbVar.c, null, fbVar, l46Var2, ((i4 << 6) & 7168) | 384);
                    l46Var2.r(false);
                    lbVar2 = lbVar;
                    i3 = 0;
                    fbVar2 = fbVar;
                } else if (lbVar instanceof kb) {
                    ib8.r(12.0f, -1341226337, l46Var2, l46Var2, g09Var);
                    kb kbVar = (kb) lbVar;
                    int i5 = kbVar.d;
                    r(i5 / 100.0f, fbVar.e, fbVar.f, l46Var, 0);
                    j09 j09VarE = kv2.e(g09Var, 12.0f, l46Var, g09Var, 1.0f);
                    t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarE);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, t7cVarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    String strN = N(kbVar, l46Var);
                    mue mueVar = oue.a;
                    fbVar2 = fbVar;
                    nte.b(strN, null, fbVar.a, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.g(l46Var), l46Var, 0, 24960, 110586);
                    nte.b(afc.r(R.string.account_usage_remaining_percent, new Object[]{Integer.valueOf(i5)}, l46Var), null, fbVar2.a, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.g(l46Var), l46Var, 0, 24576, 114682);
                    l46Var2 = l46Var;
                    l46Var2.r(true);
                    i3 = 0;
                    l46Var2.r(false);
                    lbVar2 = lbVar;
                } else {
                    lbVar2 = lbVar;
                    i3 = 0;
                    fbVar2 = fbVar;
                    if (!(lbVar2 instanceof hb)) {
                        throw tec.d(787999516, l46Var2, false);
                    }
                    l46Var2.f0(788048771);
                    l46Var2.r(false);
                }
            }
        } else {
            lbVar2 = lbVar;
            fbVar2 = fbVar;
            i3 = 0;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(lbVar2, fbVar2, i, i3);
        }
    }

    public static final void o(lb lbVar, UserSubscriptionInformation userSubscriptionInformation, SubscriptionKind subscriptionKind, fb fbVar, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        String strQ;
        l46 l46Var2 = l46Var;
        l46Var2.h0(979149458);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var2.g(lbVar) : l46Var2.i(lbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.e(subscriptionKind == null ? -1 : subscriptionKind.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.g(fbVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var2.i(x16Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var2.i(x16Var2) ? 1048576 : 524288;
        }
        if (l46Var2.W(i2 & 1, (599171 & i2) != 599170)) {
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            kx0 kx0Var = ndb.z;
            t7c t7cVarA = s7c.a(xc0.g, kx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            int i3 = i2;
            jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            t7c t7cVarA2 = s7c.a(xc0.a, kx0Var, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, jw7Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            jw7 jw7Var2 = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            if (lbVar instanceof hb) {
                l46Var2.f0(1828172793);
                strQ = afc.r(R.string.premium_today_read_times, new Object[]{Integer.valueOf(((hb) lbVar).a)}, l46Var2);
                l46Var2.r(false);
            } else if (lbVar instanceof ib) {
                l46Var2.f0(1828178461);
                strQ = B(((ib) lbVar).a, l46Var2);
                l46Var2.r(false);
            } else if (lbVar instanceof jb) {
                l46Var2.f0(1828181149);
                UsageCount usageCount = ((jb) lbVar).a;
                kif kifVar = UsageCount.Companion;
                strQ = C(usageCount, l46Var2);
                l46Var2.r(false);
            } else {
                if (!(lbVar instanceof kb)) {
                    throw tec.d(1828171151, l46Var2, false);
                }
                l46Var2.f0(1828183262);
                strQ = afc.q(H(((kb) lbVar).a, subscriptionKind), l46Var2);
                l46Var2.r(false);
            }
            String str = strQ;
            mue mueVar = pue.a;
            nte.b(str, jw7Var2, fbVar.a, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mue.a(pue.q(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 24960, 110584);
            l46Var2 = l46Var;
            if (lbVar instanceof kb) {
                l46Var2.f0(839429482);
                h(ynb.d0(4.0f, 0.0f, 0.0f, 0.0f, 14, g09Var), fbVar.c, x16Var2, l46Var2, ((i3 >> 12) & 896) | 6);
                l46Var2.r(false);
            } else {
                l46Var2.f0(839596696);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            a(((i3 >> 9) & 896) | ((i3 >> 12) & 14), fbVar.b, x16Var, l46Var2, z);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc(lbVar, userSubscriptionInformation, subscriptionKind, fbVar, z, x16Var, x16Var2, i, 0);
        }
    }

    public static final void p(j09 j09Var, UserSubscriptionInformation userSubscriptionInformation, e4d e4dVar, x16 x16Var, l46 l46Var, int i) {
        j09 j09Var2;
        UsageBillingDailyLimit dailyLimit;
        x16Var.getClass();
        l46Var.h0(-441931268);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(userSubscriptionInformation) : l46Var.i(userSubscriptionInformation) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.e(e4dVar == null ? -1 : e4dVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) objR2;
            boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new i8(e89Var, 3);
                l46Var.p0(objR3);
            }
            x16 x16Var2 = (x16) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = new i8(e89Var2, 4);
                l46Var.p0(objR4);
            }
            int i3 = (i2 & 14) | 1769472 | (UserSubscriptionInformation.$stable << 3) | (i2 & 112) | (i2 & 896) | (i2 & 7168);
            g09 g09Var = g09.a;
            q(g09Var, userSubscriptionInformation, e4dVar, x16Var, zBooleanValue, x16Var2, (x16) objR4, l46Var, i3);
            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                l46Var.f0(-1498949431);
                Object objR5 = l46Var.R();
                String resetAt = null;
                if (objR5 == i8cVar) {
                    objR5 = new jc(2, null);
                    l46Var.p0(objR5);
                }
                af1.o((l26) objR5, l46Var, wef.a);
                UsageBilling usageBilling = userSubscriptionInformation.getUsageBilling();
                if (usageBilling != null && (dailyLimit = usageBilling.getDailyLimit()) != null) {
                    resetAt = dailyLimit.getResetAt();
                }
                Object objR6 = l46Var.R();
                if (objR6 == i8cVar) {
                    objR6 = new i8(e89Var2, 5);
                    l46Var.p0(objR6);
                }
                j(resetAt, (x16) objR6, l46Var, 48);
                l46Var.r(false);
            } else {
                l46Var.f0(-1498675546);
                l46Var.r(false);
            }
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(j09Var2, userSubscriptionInformation, e4dVar, x16Var, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015b  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d2  */
    public static final void q(final j09 j09Var, final UserSubscriptionInformation userSubscriptionInformation, final e4d e4dVar, final x16 x16Var, final boolean z, final x16 x16Var2, final x16 x16Var3, l46 l46Var, final int i) {
        int i2;
        x16 x16Var4;
        boolean z2;
        x16 x16Var5;
        x16 x16Var6;
        ojb ojbVarV;
        l26 l26Var;
        int iAdditionCount;
        lb ibVar;
        lb hbVar;
        ata ataVar;
        boolean z3;
        ii6 ii6Var;
        j09 j09VarJ;
        Object next;
        LevelAndKind levelAndKind;
        l46 l46Var2 = l46Var;
        j09Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var2.h0(-1326075457);
        if ((i & 6) == 0) {
            i2 = (l46Var2.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var2.g(userSubscriptionInformation) : l46Var2.i(userSubscriptionInformation) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.e(e4dVar == null ? -1 : e4dVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            x16Var4 = x16Var;
            i2 |= l46Var2.i(x16Var4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            x16Var4 = x16Var;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= l46Var2.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            x16Var5 = x16Var2;
            i2 |= l46Var2.i(x16Var5) ? 131072 : 65536;
        } else {
            x16Var5 = x16Var2;
        }
        if ((1572864 & i) == 0) {
            x16Var6 = x16Var3;
            i2 |= l46Var2.i(x16Var6) ? 1048576 : 524288;
        } else {
            x16Var6 = x16Var3;
        }
        int i3 = i2;
        if (l46Var2.W(i3 & 1, (599187 & i3) != 599186)) {
            QuinSubscription subscription = userSubscriptionInformation.getSubscription();
            SubscriptionKind kind = (subscription == null || (levelAndKind = subscription.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
            boolean zE = k8b.e((e8b) l46Var2.k(l8b.a));
            UsageBilling usageBilling = userSubscriptionInformation.getUsageBilling();
            if (usageBilling == null || !usageBilling.getEnabled()) {
                iAdditionCount = userSubscriptionInformation.additionCount();
                if (iAdditionCount > 0) {
                    hbVar = new hb(iAdditionCount);
                    ibVar = hbVar;
                } else {
                    ibVar = null;
                }
            } else {
                UsageCount usageCountK = K(userSubscriptionInformation);
                if (usageCountK != null) {
                    ibVar = new jb(usageCountK, S(usageCountK), usageCountK.getTotal());
                } else {
                    Iterator it = J(userSubscriptionInformation).iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            Instant instantT = T(((ExpireableCount) next).getExpiredAt());
                            if (instantT == null) {
                                instantT = Instant.MAX;
                            }
                            do {
                                Object next2 = it.next();
                                Instant instantT2 = T(((ExpireableCount) next2).getExpiredAt());
                                if (instantT2 == null) {
                                    instantT2 = Instant.MAX;
                                }
                                Instant instant = instantT2;
                                if (instantT.compareTo(instant) > 0) {
                                    next = next2;
                                    instantT = instant;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    ExpireableCount expireableCount = (ExpireableCount) next;
                    if (expireableCount != null) {
                        UsageBillingBalance usageBillingBalanceI = I(userSubscriptionInformation);
                        if (usageBillingBalanceI != null && usageBillingBalanceI.isAvailable()) {
                            Instant instantT3 = T(expireableCount.getExpiredAt());
                            if (instantT3 == null) {
                                instantT3 = Instant.MAX;
                            }
                            String nextRefreshAt = usageBillingBalanceI.getNextRefreshAt();
                            if (nextRefreshAt == null) {
                                nextRefreshAt = usageBillingBalanceI.getExpireAt();
                            }
                            Instant instantT4 = T(nextRefreshAt);
                            if (instantT4 == null) {
                                instantT4 = Instant.MAX;
                            }
                            if (instantT3.compareTo(instantT4) > 0) {
                                expireableCount = null;
                            }
                        }
                    } else {
                        expireableCount = null;
                    }
                    if (expireableCount != null) {
                        ibVar = new ib(expireableCount, R(expireableCount), expireableCount.getTotalCount(), O(expireableCount.getExpiredAt()));
                    } else {
                        UsageBillingBalance usageBillingBalanceI2 = I(userSubscriptionInformation);
                        if (usageBillingBalanceI2 != null) {
                            hbVar = new kb(usageBillingBalanceI2, O(usageBillingBalanceI2.getNextRefreshAt()), O(usageBillingBalanceI2.getExpireAt()));
                        } else {
                            iAdditionCount = userSubscriptionInformation.additionCount();
                            if (iAdditionCount > 0) {
                                hbVar = new hb(iAdditionCount);
                            } else {
                                ibVar = null;
                            }
                        }
                        ibVar = hbVar;
                    }
                }
            }
            if (zE) {
                SubscriptionKind subscriptionKind = kind;
                lb lbVar = ibVar;
                l46Var2.f0(-3832285);
                l46Var2.r(false);
                int i4 = subscriptionKind == null ? -1 : zsa.a[subscriptionKind.ordinal()];
                if (i4 == -1) {
                    ataVar = new ata(R.drawable.bg_no_premium, abg.c(1715472570));
                } else if (i4 == 1) {
                    ataVar = new ata(R.drawable.bg_premium_advance, abg.c(1713781081));
                } else if (i4 == 2 || i4 == 3) {
                    ataVar = new ata(R.drawable.bg_premium_supreme, abg.c(1713052443));
                } else {
                    if (i4 != 4) {
                        ap.c();
                        return;
                    }
                    ataVar = new ata(R.drawable.bg_no_premium, abg.c(1715472570));
                }
                ata ataVar2 = ataVar;
                y6c y6cVarB = a7c.b(32.0f);
                boolean zBooleanValue = ((Boolean) l46Var2.k(h57.a)).booleanValue();
                boolean z4 = !zBooleanValue;
                if (zBooleanValue) {
                    z3 = false;
                    l46Var2.f0(-3627810);
                    l46Var2.r(false);
                    ii6Var = null;
                } else {
                    l46Var2.f0(1246808178);
                    ii6 ii6VarB0 = g21.b0(l46Var2);
                    z3 = false;
                    l46Var2.r(false);
                    ii6Var = ii6VarB0;
                }
                j09 j09VarO = tm7.o(oa7.E(j09Var, y6cVarB), ataVar2.b, g21.f);
                lx0 lx0Var = ndb.b;
                xn8 xn8VarC = s21.c(lx0Var, z3);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
                lf2.q.getClass();
                l46Var2.j0();
                boolean z5 = l46Var2.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z5) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var2, xn8VarC);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf);
                dec.k(l46Var2);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ2);
                d31 d31Var = d31.a;
                g09 g09Var = g09.a;
                j09 j09VarD = d31Var.b(g09Var).D((zBooleanValue || ii6Var == null) ? g09Var : g21.P(g09Var, ii6Var));
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                ii6 ii6Var2 = ii6Var;
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarD);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, xn8VarC2);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ3);
                t(ataVar2.a, 0, l46Var2, d31Var.b(g09Var));
                l46Var2.r(true);
                j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                int iHashCode3 = Long.hashCode(l46Var2.T);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ4 = m93.J(l46Var2, j09VarC);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, c92VarA);
                dec.l(he2Var2, l46Var2, u8aVarM3);
                ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ4);
                int i5 = UserSubscriptionInformation.$stable;
                g(userSubscriptionInformation, lbVar, e4dVar, x16Var, l46Var2, ((i3 >> 3) & 14) | i5 | (i3 & 896) | (i3 & 7168));
                int i6 = i3 << 3;
                l46Var2 = l46Var;
                l(lbVar, ataVar2.b, ii6Var2, z4, z, userSubscriptionInformation, x16Var2, x16Var3, l46Var2, (57344 & i3) | (i5 << 15) | ((i3 << 12) & 458752) | (i6 & 3670016) | (i6 & 29360128));
                l46Var2.r(true);
                j09 j09VarB = d31Var.b(g09Var);
                if (zBooleanValue) {
                    j09VarJ = db6.w(g09Var, 0.5f, y72.b(y72.e, 0.24f), y6cVarB);
                } else {
                    long j = y72.e;
                    j09VarJ = rrb.j(rrb.j(rrb.j(g09Var, y6cVarB, new n4d(14.0f, y72.b(j, 0.27f), 0.0f, 0L, 60)), y6cVarB, new n4d(6.0f, y72.b(j, 0.18f), 0.0f, 0L, 60)), y6cVarB, new n4d(0.5f, y72.b(j, 0.25f), -3.5f, (((long) Float.floatToRawIntBits(3.0f)) << 32) | (((long) Float.floatToRawIntBits(3.0f)) & 4294967295L), 48));
                }
                s21.a(j09VarB.D(j09VarJ), l46Var2, 0);
                l46Var2.r(true);
            } else {
                l46Var2.f0(-4209958);
                int i7 = (i3 & 14) | (UserSubscriptionInformation.$stable << 3) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i8 = i3 << 6;
                z(j09Var, userSubscriptionInformation, e4dVar, x16Var4, kind, ibVar, z2, x16Var5, x16Var6, l46Var2, i7 | (3670016 & i8) | (29360128 & i8) | (234881024 & i8));
                l46Var2.r(false);
                ojbVarV = l46Var2.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i9 = 0;
                l26Var = new l26() { // from class: ic
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i10 = i9;
                        wef wefVar = wef.a;
                        int i11 = i;
                        switch (i10) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i11 | 1);
                                lc.q(j09Var, userSubscriptionInformation, e4dVar, x16Var, z, x16Var2, x16Var3, (l46) obj, iP);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i11 | 1);
                                lc.q(j09Var, userSubscriptionInformation, e4dVar, x16Var, z, x16Var2, x16Var3, (l46) obj, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
            ojbVarV.d = l26Var;
        }
        l46Var2.Z();
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final int i10 = 1;
            l26Var = new l26() { // from class: ic
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i11 = i10;
                    wef wefVar = wef.a;
                    int i12 = i;
                    switch (i11) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i12 | 1);
                            lc.q(j09Var, userSubscriptionInformation, e4dVar, x16Var, z, x16Var2, x16Var3, (l46) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(i12 | 1);
                            lc.q(j09Var, userSubscriptionInformation, e4dVar, x16Var, z, x16Var2, x16Var3, (l46) obj, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void r(final float f, final long j, final long j2, l46 l46Var, final int i) {
        l46Var.h0(-1758087910);
        int i2 = i | (l46Var.d(f) ? 4 : 2) | (l46Var.f(j) ? 32 : 16) | (l46Var.f(j2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            y6c y6cVarB = a7c.b(2.0f);
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 4.0f), y6cVarB);
            y02 y02Var = g21.f;
            j09 j09VarO = tm7.o(j09VarE, j, y02Var);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            s21.a(tm7.o(oa7.E(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, mh3.n(f, 0.0f, 1.0f)), 4.0f), y6cVarB), j2, y02Var), l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(f, j, j2, i) { // from class: wb
                public final /* synthetic */ float a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    lc.r(this.a, this.b, this.c, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void s(boolean z, Integer num, long j, l46 l46Var, int i) {
        String strI;
        l46Var.h0(-1797574586);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.g(num) ? 32 : 16) | (l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            long jD = z ? abg.d(4280671585L) : j;
            y6c y6cVarB = a7c.b(4.0f);
            if (z) {
                strI = tec.i(l46Var, -892316525, R.string.account_usage_in_use, l46Var, false);
            } else if (num == null || num.intValue() >= 100) {
                strI = tec.i(l46Var, -892309804, R.string.account_usage_pending, l46Var, false);
            } else {
                l46Var.f0(-892313149);
                String strR = afc.r(R.string.account_usage_remaining_percent, new Object[]{num}, l46Var);
                l46Var.r(false);
                strI = strR;
            }
            j09 j09VarA0 = ynb.a0(db6.w(g09.a, 0.5f, jD, y6cVarB), 4.0f, 1.0f);
            mue mueVar = pue.a;
            nte.b(strI, j09VarA0, jD, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.j(l46Var), l46Var, 0, 24576, 114680);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new hc(z, num, j, i);
        }
    }

    public static final void t(int i, int i2, l46 l46Var, j09 j09Var) {
        l46Var.h0(1103232983);
        int i3 = (l46Var.e(i) ? 4 : 2) | i2 | (l46Var.g(j09Var) ? 32 : 16);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            cv6 cv6VarJ0 = lmg.j0(i, l46Var);
            boolean zI = l46Var.i(cv6VarJ0);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new ob(cv6VarJ0, i4);
                l46Var.p0(objR);
            }
            nk8.e((i3 >> 3) & 14, (a26) objR, l46Var, j09Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(i, j09Var, i2, 0);
        }
    }

    public static final void u(lb lbVar, long j, ii6 ii6Var, boolean z, boolean z2, UserSubscriptionInformation userSubscriptionInformation, fb fbVar, x16 x16Var, l46 l46Var, int i) {
        int i2;
        long j2;
        ii6 ii6Var2;
        boolean z3;
        fb fbVar2;
        x16 x16Var2;
        l46 l46Var2;
        l46Var.h0(849393063);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(lbVar) : l46Var.i(lbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= l46Var.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            ii6Var2 = ii6Var;
            i2 |= l46Var.g(ii6Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            ii6Var2 = ii6Var;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((i & 196608) == 0) {
            i2 |= (262144 & i) == 0 ? l46Var.g(userSubscriptionInformation) : l46Var.i(userSubscriptionInformation) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            fbVar2 = fbVar;
            i2 |= l46Var.g(fbVar2) ? 1048576 : 524288;
        } else {
            fbVar2 = fbVar;
        }
        if ((12582912 & i) == 0) {
            x16Var2 = x16Var;
            i2 |= l46Var.i(x16Var2) ? 8388608 : 4194304;
        } else {
            x16Var2 = x16Var;
        }
        int i3 = i2;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            dd2 dd2VarB0 = af1.b0(-762628120, new dc(j2, ii6Var2, z3, lbVar, userSubscriptionInformation, fbVar2, x16Var2), l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                l46Var.f0(-1677685844);
                if (z2) {
                    l46Var.f0(-1677666748);
                    dd2VarB0.z(l46Var, 6);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1677644645);
                    l46Var.r(false);
                }
                l46Var.r(false);
                l46Var2 = l46Var;
            } else {
                l46Var.f0(-1677624123);
                kx0 kx0Var = ndb.y;
                l46Var2 = l46Var;
                m93.d(z2, null, rw4.e(E(), kx0Var, 12), rw4.l(E(), kx0Var, 12), null, af1.b0(819323427, new ec(dd2VarB0, i4), l46Var), l46Var2, ((i3 >> 12) & 14) | 196608, 18);
                l46Var2.r(false);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qb(lbVar, j, ii6Var, z, z2, userSubscriptionInformation, fbVar, x16Var, i);
        }
    }

    public static final void v(final lb lbVar, final long j, final ii6 ii6Var, final boolean z, final boolean z2, final UserSubscriptionInformation userSubscriptionInformation, SubscriptionKind subscriptionKind, final fb fbVar, final x16 x16Var, final x16 x16Var2, l46 l46Var, final int i) {
        int i2;
        SubscriptionKind subscriptionKind2;
        boolean z3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(893354170);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var2.g(lbVar) : l46Var2.i(lbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.g(ii6Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? l46Var2.g(userSubscriptionInformation) : l46Var2.i(userSubscriptionInformation) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var2.e(subscriptionKind == null ? -1 : subscriptionKind.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var2.g(fbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= l46Var2.i(x16Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= l46Var2.i(x16Var2) ? 536870912 : 268435456;
        }
        if (l46Var2.W(i2 & 1, (306783379 & i2) != 306783378)) {
            float f = z2 ? 0.0f : 16.0f;
            if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                l46Var2.f0(-1997802581);
                l46Var2.r(false);
                z3 = false;
            } else {
                l46Var2.f0(-1997761909);
                z3 = false;
                l46Var2 = l46Var;
                f = ((yi4) vx.a(f, E(), "account_usage_overview_bottom_padding", l46Var, 384, 8).getValue()).a;
                l46Var2.r(false);
            }
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, z3);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            float f2 = f;
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarC2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            j09 j09VarC3 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarC3);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            d31 d31Var = d31.a;
            w(d31Var.b(g09Var), j, ii6Var, z, l46Var2, i2 & 8176);
            j09 j09VarC0 = ynb.c0(g09Var, 24.0f, 16.0f, 24.0f, f2);
            int i3 = i2 << 3;
            int i4 = UserSubscriptionInformation.$stable;
            int i5 = i2 >> 9;
            int i6 = i2 >> 6;
            int i7 = i6 & 29360128;
            int i8 = i2;
            m(j09VarC0, lbVar, userSubscriptionInformation, subscriptionKind, fbVar, z2, x16Var, x16Var2, l46Var, (i3 & 458752) | (i3 & 112) | (i4 << 6) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i6 & 3670016) | i7);
            l46Var.r(true);
            int i9 = (65534 & i8) | (i4 << 15) | (i8 & 458752) | ((i8 >> 3) & 3670016) | i7;
            subscriptionKind2 = subscriptionKind;
            u(lbVar, j, ii6Var, z, z2, userSubscriptionInformation, fbVar, x16Var2, l46Var, i9);
            l46Var2 = l46Var;
            l46Var2.r(true);
            if (subscriptionKind2 == SubscriptionKind.Quarter || subscriptionKind2 == SubscriptionKind.Year) {
                l46Var2.f0(723734830);
                s21.a(db6.w(d31Var.b(g09Var), 0.5f, abg.c(536870911), g21.f), l46Var2, 0);
                l46Var2.r(false);
            } else {
                l46Var2.f0(723857838);
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            subscriptionKind2 = subscriptionKind;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final SubscriptionKind subscriptionKind3 = subscriptionKind2;
            ojbVarV.d = new l26() { // from class: ub
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lc.v(lbVar, j, ii6Var, z, z2, userSubscriptionInformation, subscriptionKind3, fbVar, x16Var, x16Var2, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void w(final j09 j09Var, final long j, final ii6 ii6Var, final boolean z, l46 l46Var, final int i) {
        int i2;
        int i3;
        l46Var.h0(-1005406589);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(ii6Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            d31 d31Var = d31.a;
            if (!z || ii6Var == null) {
                i3 = 0;
                l46Var.f0(-323599879);
                l46Var.r(false);
            } else {
                l46Var.f0(-323895867);
                i3 = 0;
                s21.a(z7f.J(d31Var.b(g09Var), ii6Var, new ji6(24.0f, 24, y72.j), null, 4), l46Var, 0);
                l46Var.r(false);
            }
            s21.a(tm7.o(d31Var.b(g09Var), j, g21.f), l46Var, i3);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: zb
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    lc.w(j09Var, j, ii6Var, z, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void x(String str, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-655241444);
        int i2 = (l46Var2.g(str) ? 4 : 2) | i;
        int i3 = 1;
        if (!l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            l46Var2.Z();
        } else {
            if (k8b.e((e8b) l46Var2.k(l8b.a))) {
                l46Var2.f0(328584454);
                if9.c(i2 & 14, l46Var2, null, str);
                l46Var2.r(false);
                ojb ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new o8(str, i, i3);
                    return;
                }
                return;
            }
            l46Var2.f0(328645958);
            l46Var2.r(false);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, g09.a);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            fu6.b(0, 0, P(l46Var2), l46Var2);
            mue mueVar = oue.a;
            nte.b(str, null, P(l46Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var, i2 & 14, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new o8(str, i, 2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void y(UserSubscriptionInformation userSubscriptionInformation, lb lbVar, e4d e4dVar, x16 x16Var, SubscriptionKind subscriptionKind, l46 l46Var, int i) {
        int i2;
        String strR;
        int i3;
        boolean z;
        j09 j09Var;
        j09 j09VarC;
        boolean z2;
        fy9 fy9VarA;
        l46 l46Var2 = l46Var;
        l46Var2.h0(722316082);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var2.g(userSubscriptionInformation) : l46Var2.i(userSubscriptionInformation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var2.g(lbVar) : l46Var2.i(lbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.e(e4dVar == null ? -1 : e4dVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.e(subscriptionKind == null ? -1 : subscriptionKind.ordinal()) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            QuinSubscription subscription = userSubscriptionInformation.getSubscription();
            tpf tpfVar = UserSubscriptionInformation.Companion;
            String strG = G(userSubscriptionInformation, lbVar, l46Var2);
            String strF = F(userSubscriptionInformation, lbVar);
            if (strF == null) {
                l46Var2.f0(732701665);
                l46Var2.r(false);
                strR = null;
            } else {
                l46Var2.f0(732701666);
                if (userSubscriptionInformation.isAutoRenew()) {
                    l46Var2.f0(-1045742618);
                    strR = afc.r(R.string.settings_account_banner_renew_prefix, new Object[]{strF}, l46Var2);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1045651726);
                    strR = afc.r(R.string.account_usage_expires_at, new Object[]{strF}, l46Var2);
                    l46Var2.r(false);
                }
                l46Var2.r(false);
            }
            String str = strR;
            String strD = D(userSubscriptionInformation, e4dVar, l46Var2);
            g09 g09Var = g09.a;
            j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            if (strD != null) {
                j09Var = j09VarC2;
                i3 = 1;
                z = false;
                j09VarC = b.c(g09Var, false, null, null, x16Var, 15);
            } else {
                i3 = 1;
                z = false;
                j09Var = j09VarC2;
                j09VarC = g09Var;
            }
            j09 j09VarD = j09Var.D(j09VarC);
            xn8 xn8VarC = s21.c(ndb.b, z);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarD2 = androidx.compose.foundation.layout.b.d(d31.a.a(g09Var, ndb.g), 120.0f);
            int i4 = subscriptionKind == null ? -1 : kc.a[subscriptionKind.ordinal()];
            if (i4 == -1 || i4 == i3) {
                z2 = false;
                l46Var2.f0(-2584615);
                fy9VarA = od4.A(R.drawable.img_no_premium, 0, l46Var2);
                l46Var2.r(false);
            } else if (i4 == 2) {
                z2 = false;
                l46Var2.f0(-2590594);
                fy9VarA = od4.A(R.drawable.img_premium_advance, 0, l46Var2);
                l46Var2.r(false);
            } else {
                if (i4 != 3 && i4 != 4) {
                    throw tec.d(-2591772, l46Var2, false);
                }
                z2 = false;
                l46Var2.f0(-2587298);
                fy9VarA = od4.A(R.drawable.img_premium_supreme, 0, l46Var2);
                l46Var2.r(false);
            }
            boolean z4 = z2;
            int i5 = i2;
            feg.j(fy9VarA, null, j09VarD2, ndb.x, an2.c, 0.0f, null, l46Var, 27704, 96);
            j09 j09VarZ = ynb.Z(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 24.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, z4 ? 1 : 0);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.o(l46Var), 0L, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183);
            pr4 pr4Var = l8b.a;
            nte.b(strG, null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mueVarA, l46Var, 0, 24960, 110586);
            l46Var2 = l46Var;
            if (str != null) {
                ib8.r(8.0f, -694392207, l46Var2, l46Var2, g09Var);
                mue mueVar2 = oue.a;
                nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.g(l46Var2), l46Var, 0, 24960, 110586);
                l46Var2 = l46Var;
                l46Var2.r(z4);
            } else if (subscription == null) {
                ib8.r(8.0f, -694105147, l46Var2, l46Var2, g09Var);
                x(afc.q(R.string.premiun_tips_1, l46Var2), l46Var2, z4 ? 1 : 0);
                x(ks0.h(8.0f, R.string.premium_tips_3, l46Var2, l46Var2, g09Var), l46Var2, z4 ? 1 : 0);
                l46Var2.r(z4);
            } else {
                l46Var2.f0(-693906220);
                l46Var2.r(z4);
            }
            if (strD != null) {
                ib8.r(8.0f, -693872244, l46Var2, l46Var2, g09Var);
                c8b.g(null, strD, null, false, x16Var, l46Var2, (i5 << 3) & 57344);
                l46Var2.r(z4);
            } else {
                l46Var2.f0(-693772300);
                l46Var2.r(z4);
            }
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb(userSubscriptionInformation, lbVar, e4dVar, x16Var, subscriptionKind, i, 0);
        }
    }

    public static final void z(j09 j09Var, UserSubscriptionInformation userSubscriptionInformation, e4d e4dVar, x16 x16Var, SubscriptionKind subscriptionKind, lb lbVar, boolean z, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        int i2;
        x16 x16Var4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1196977338);
        if ((i & 6) == 0) {
            i2 = (l46Var2.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var2.g(userSubscriptionInformation) : l46Var2.i(userSubscriptionInformation) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.e(e4dVar == null ? -1 : e4dVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            x16Var4 = x16Var;
            i2 |= l46Var2.i(x16Var4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            x16Var4 = x16Var;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.e(subscriptionKind != null ? subscriptionKind.ordinal() : -1) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? l46Var2.g(lbVar) : l46Var2.i(lbVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var2.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= l46Var2.i(x16Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= l46Var2.i(x16Var3) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (l46Var2.W(i3 & 1, (38347923 & i3) != 38347922)) {
            y6c y6cVar = eze.a(l46Var2).a.i;
            j09 j09VarE = oa7.E(j09Var, y6cVar);
            pr4 pr4Var = l8b.a;
            j09 j09VarO = tm7.o(db6.w(j09VarE, 0.0f, y72.b(((e8b) l46Var2.k(pr4Var)).z, 0.35f), y6cVar), ((e8b) l46Var2.k(pr4Var)).c, g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09.a, 1.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            int i4 = UserSubscriptionInformation.$stable;
            int i5 = i3 >> 3;
            y(userSubscriptionInformation, lbVar, e4dVar, x16Var4, subscriptionKind, l46Var2, (i5 & 14) | i4 | ((i3 >> 12) & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344));
            l(lbVar, y72.j, null, false, z, userSubscriptionInformation, x16Var2, x16Var3, l46Var, (i4 << 15) | ((i3 >> 15) & 14) | 3504 | ((i3 >> 6) & 57344) | (458752 & (i3 << 12)) | (3670016 & i5) | (i5 & 29360128));
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new nb(j09Var, userSubscriptionInformation, e4dVar, x16Var, subscriptionKind, lbVar, z, x16Var2, x16Var3, i);
        }
    }
}
