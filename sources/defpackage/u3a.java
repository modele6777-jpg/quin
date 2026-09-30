package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.CountType;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u3a implements xj5 {
    public final /* synthetic */ xj5 a;

    public u3a(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        t3a t3aVar;
        List list;
        SubscriptionInfo subscription;
        SubscriptionInfo subscription2;
        o7e subscriptionLevel;
        List<CountV2> countV2;
        if (xn2Var instanceof t3a) {
            t3aVar = (t3a) xn2Var;
            int i = t3aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3aVar.label = i - Integer.MIN_VALUE;
            } else {
                t3aVar = new t3a(this, xn2Var);
            }
        } else {
            t3aVar = new t3a(this, xn2Var);
        }
        Object obj2 = t3aVar.result;
        int i2 = t3aVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            QuotaUsage quotaUsage = (QuotaUsage) obj;
            List listD = drb.d(quotaUsage);
            List listI = t72.I(thb.d, thb.c);
            List listI2 = t72.I(thb.a, thb.b, thb.e, thb.f, thb.v);
            pu4 pu4Var = pu4.a;
            if (quotaUsage == null || (subscription2 = quotaUsage.getSubscription()) == null || (subscriptionLevel = subscription2.getSubscriptionLevel()) == null) {
                list = listI2;
            } else if (subscriptionLevel != o7e.d || (countV2 = quotaUsage.getCountV2()) == null) {
                list = pu4Var;
            } else {
                ArrayList<CountV2> arrayList = new ArrayList();
                for (Object obj3 : countV2) {
                    if (((CountV2) obj3).getType() == CountType.VIP) {
                        arrayList.add(obj3);
                    }
                }
                int totalCount = 0;
                for (CountV2 countV3 : arrayList) {
                    totalCount += countV3.getTotalCount() - countV3.getUsedCount();
                }
                if (totalCount <= 0) {
                    list = listI;
                } else {
                    list = pu4Var;
                }
            }
            x5a x5aVar = new x5a(new r3a(qu4.a, false, pu4Var), (quotaUsage == null || (subscription = quotaUsage.getSubscription()) == null) ? true : subscription.isPaymentTypeMatchedLocalPackage(), listD, list, quotaUsage != null ? quotaUsage.getHasSubscription() : false, quotaUsage != null ? pa7.t(quotaUsage.getNeverPurchased(), Boolean.TRUE) : false);
            t3aVar.L$0 = null;
            t3aVar.L$1 = null;
            t3aVar.L$2 = null;
            t3aVar.L$3 = null;
            t3aVar.label = 1;
            Object objA = this.a.a(x5aVar, t3aVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
