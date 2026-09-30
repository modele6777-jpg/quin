package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.CountType;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.TimesMembership;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uab implements qw2 {
    public final /* synthetic */ QuotaUsage a;

    public uab(QuotaUsage quotaUsage) {
        this.a = quotaUsage;
    }

    @Override // defpackage.qw2
    public final boolean a() {
        QuotaUsage quotaUsage = this.a;
        List<CountV2> countV2 = quotaUsage.getCountV2();
        ArrayList<CountV2> arrayList = new ArrayList();
        for (Object obj : countV2) {
            if (((CountV2) obj).getType() == CountType.VIP) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (CountV2 countV3 : arrayList) {
                if (countV3.getUsedCount() < countV3.getTotalCount()) {
                    return true;
                }
            }
        }
        TimesMembership timesMembership = quotaUsage.getTimesMembership();
        if (timesMembership != null && timesMembership.getTotalCount() > timesMembership.getUsedCount()) {
            return true;
        }
        List<LimitedQuota> limitedQuotaList = quotaUsage.getLimitedQuotaList();
        if (limitedQuotaList == null || limitedQuotaList.isEmpty()) {
            return false;
        }
        for (LimitedQuota limitedQuota : limitedQuotaList) {
            if (limitedQuota.getTotalCount() > limitedQuota.getUsedCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qw2
    public final boolean b() {
        List<CountV2> countV2 = this.a.getCountV2();
        ArrayList<CountV2> arrayList = new ArrayList();
        for (Object obj : countV2) {
            if (((CountV2) obj).getType() == CountType.FREE) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (CountV2 countV3 : arrayList) {
            if (countV3.getUsedCount() < countV3.getTotalCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qw2
    public final boolean c() {
        QuotaUsage quotaUsage = this.a;
        SubscriptionInfo subscription = quotaUsage.getSubscription();
        if ((subscription != null ? subscription.getSubscriptionLevel() : null) != null) {
            return false;
        }
        List<CountV2> countV2 = quotaUsage.getCountV2();
        if (countV2 == null || !countV2.isEmpty()) {
            Iterator<T> it = countV2.iterator();
            while (it.hasNext()) {
                if (((CountV2) it.next()).getType() == CountType.VIP) {
                    return false;
                }
            }
        }
        List<CountV2> countV3 = quotaUsage.getCountV2();
        if (countV3 == null || !countV3.isEmpty()) {
            for (CountV2 countV4 : countV3) {
                if (countV4.getType() == CountType.ADD_ON && countV4.getUsedCount() < countV4.getTotalCount()) {
                    return false;
                }
            }
        }
        TimesMembership timesMembership = quotaUsage.getTimesMembership();
        if (timesMembership != null && timesMembership.getTotalCount() > timesMembership.getUsedCount()) {
            return false;
        }
        List<LimitedQuota> limitedQuotaList = quotaUsage.getLimitedQuotaList();
        if (limitedQuotaList == null || limitedQuotaList.isEmpty()) {
            return true;
        }
        for (LimitedQuota limitedQuota : limitedQuotaList) {
            if (limitedQuota.getTotalCount() > limitedQuota.getUsedCount()) {
                return false;
            }
        }
        return true;
    }
}
