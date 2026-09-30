package defpackage;

import ai.askquin.ui.settings.model.ExpireableCount;
import ai.askquin.ui.settings.model.UsageCount;
import ai.askquin.ui.settings.model.UsageType;
import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import tech.chatmind.api.CompensateCount;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.TimesMembership;
import tech.chatmind.api.credits.GuestPassBalance;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k4d extends ewf implements hf8 {
    public static final /* synthetic */ int g = 0;
    public final gd8 b;
    public final fab c;
    public final q9b d;
    public final x1g e;
    public final whb f;

    public k4d(gd8 gd8Var, fab fabVar, q9b q9bVar, x1g x1gVar) {
        this.b = gd8Var;
        this.c = fabVar;
        this.d = q9bVar;
        this.e = x1gVar;
        wm5 wm5Var = new wm5(gd8Var.d, jzb.p(new hla(22, this)), new h4d(3, null), 0);
        i4d i4dVar = new i4d(this, null);
        int i = am5.a;
        this.f = if9.F(am5.a(wm5Var, new zl5(i4dVar, null)), hwf.a(this), new xzd(3000L, Long.MAX_VALUE), f(false, ((eab) q9bVar).b(), false));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    public static f4d f(boolean z, QuotaUsage quotaUsage, boolean z2) {
        e4d e4dVar;
        LevelAndKind levelAndKind;
        CompensateCount compensateCount;
        SubscriptionInfo subscription;
        TimesMembership timesMembership;
        UsageType usageType;
        UsageCount usageCount;
        List<CountV2> countV2 = quotaUsage != null ? quotaUsage.getCountV2() : null;
        List<LimitedQuota> list = pu4.a;
        if (countV2 == null) {
            countV2 = list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = countV2.iterator();
        while (true) {
            if (!it.hasNext()) {
                List<LimitedQuota> limitedQuotaList = quotaUsage != null ? quotaUsage.getLimitedQuotaList() : null;
                if (limitedQuotaList != null) {
                    list = limitedQuotaList;
                }
                c78 c78VarW = t72.w();
                for (LimitedQuota limitedQuota : list) {
                    c78VarW.add(new ExpireableCount(limitedQuota.getTotalCount(), limitedQuota.getUsedCount(), limitedQuota.getExpiredAt(), limitedQuota.getProductName(), limitedQuota.getCategory()));
                }
                if (quotaUsage != null && (timesMembership = quotaUsage.getTimesMembership()) != null) {
                    if (!list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            String lowerCase = ((LimitedQuota) it2.next()).getCategory().toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (lowerCase.equals(LimitedQuota.CATEGORY_TIME_MEMBERSHIP)) {
                                timesMembership = null;
                                break;
                            }
                        }
                    }
                    if (timesMembership != null) {
                        c78VarW.add(new ExpireableCount(timesMembership.getTotalCount(), timesMembership.getUsedCount(), timesMembership.getExpiredAt(), "", LimitedQuota.CATEGORY_TIME_MEMBERSHIP));
                    }
                }
                c78 c78VarN = c78VarW.n();
                UserSubscriptionInformation userSubscriptionInformation = new UserSubscriptionInformation(drb.b(quotaUsage), (quotaUsage == null || (subscription = quotaUsage.getSubscription()) == null) ? null : subscription.getPaymentType(), z2, arrayList, (quotaUsage == null || (compensateCount = quotaUsage.getCompensateCount()) == null) ? null : new ExpireableCount(compensateCount.getTotalCount(), compensateCount.getUsedCount(), compensateCount.getExpiredAt(), "", "compensate"), drb.d(quotaUsage), !c78VarN.isEmpty() ? c78VarN : null, quotaUsage != null ? quotaUsage.getUsageBilling() : null);
                boolean z3 = quotaUsage != null;
                if (quotaUsage != null) {
                    QuinSubscription subscription2 = userSubscriptionInformation.getSubscription();
                    SubscriptionKind kind = (subscription2 == null || (levelAndKind = subscription2.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
                    SubscriptionKind subscriptionKind = SubscriptionKind.Count;
                    e4d e4dVar2 = e4d.b;
                    if (kind != subscriptionKind) {
                        if (!quotaUsage.getHasSubscription()) {
                            e4dVar2 = e4d.a;
                        } else if (userSubscriptionInformation.getUpgradeableSubscription().isEmpty()) {
                            e4dVar = null;
                        }
                    }
                    e4dVar = e4dVar2;
                } else {
                    e4dVar = null;
                }
                GuestPassBalance guestPass = quotaUsage != null ? quotaUsage.getGuestPass() : null;
                return new f4d(z, z3, e4dVar, (guestPass == null || guestPass.getRemaining() <= 0) ? xz5.a : new yz5(guestPass.getRemaining()), userSubscriptionInformation);
            }
            CountV2 countV3 = (CountV2) it.next();
            int i = g4d.a[countV3.getType().ordinal()];
            if (i == 1) {
                usageType = UsageType.Free;
            } else if (i != 2) {
                if (i == 3) {
                    usageType = UsageType.AddOn;
                } else {
                    if (i != 4) {
                        ap.c();
                        return null;
                    }
                    usageCount = null;
                }
                if (usageCount != null) {
                    arrayList.add(usageCount);
                }
            } else {
                usageType = UsageType.Vip;
            }
            usageCount = new UsageCount(usageType, countV3.getUsedCount(), countV3.getTotalCount());
            if (usageCount != null) {
                arrayList.add(usageCount);
            }
        }
    }
}
