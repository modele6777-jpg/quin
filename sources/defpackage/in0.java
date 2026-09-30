package defpackage;

import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.credits.SubscriptionKind;
import tech.chatmind.api.payment.PaywallSkus;
import tech.chatmind.api.payment.SubscriptionSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class in0 extends gbe implements o26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ sn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in0(sn0 sn0Var, xn2 xn2Var) {
        super(4, xn2Var);
        this.this$0 = sn0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str;
        LevelAndKind levelAndKind;
        SubscriptionKind kind;
        Object dzbVar;
        PaywallSkus paywallSkus;
        List<SubscriptionSku> subscriptions;
        String str2;
        Object next;
        SubscriptionInfo subscription;
        QuotaUsage quotaUsage = (QuotaUsage) this.L$0;
        String str3 = (String) this.L$1;
        String strA = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        QuinSubscription quinSubscriptionB = drb.b(quotaUsage);
        String paymentType = (quotaUsage == null || (subscription = quotaUsage.getSubscription()) == null) ? null : subscription.getPaymentType();
        boolean z = quotaUsage != null && quotaUsage.getHasSubscription();
        if (quinSubscriptionB == null || (levelAndKind = quinSubscriptionB.getLevelAndKind()) == null || (kind = levelAndKind.getKind()) == null) {
            str = null;
        } else {
            sn0 sn0Var = this.this$0;
            if (kind != SubscriptionKind.Quarter) {
                int i = sn0.Y0;
                u5a u5aVar = (u5a) sn0Var.R0;
                u5aVar.getClass();
                hs3 hs3Var = xqa.t0;
                String str4 = (String) z5c.I(nu4.a, new q5a(hs3Var.a, hs3Var.b, null));
                if (v4e.Q(str4)) {
                    paywallSkus = null;
                } else {
                    try {
                        xh7 xh7Var = fzc.a;
                        xh7Var.getClass();
                        dzbVar = (PaywallSkus) xh7Var.b(PaywallSkus.Companion.serializer(), str4);
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                    Throwable thA = ezb.a(dzbVar);
                    if (thA != null) {
                        u5aVar.d().g("Failed to decode PaywallSkus from prefs: " + thA.getMessage());
                    }
                    if (dzbVar instanceof dzb) {
                        dzbVar = null;
                    }
                    paywallSkus = (PaywallSkus) dzbVar;
                }
                if (paywallSkus != null && (subscriptions = paywallSkus.getSubscriptions()) != null) {
                    int i2 = hn0.a[kind.ordinal()];
                    if (i2 == 1) {
                        str2 = "month";
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            str2 = "year";
                        } else if (i2 != 4) {
                            ap.c();
                            return null;
                        }
                    }
                    Iterator<T> it = subscriptions.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!pa7.t(((SubscriptionSku) next).getDuration(), str2));
                    SubscriptionSku subscriptionSku = (SubscriptionSku) next;
                    if (subscriptionSku != null) {
                        strA = tn0.a(subscriptionSku);
                    }
                }
                str3 = strA;
            }
            str = str3;
        }
        return new en0(quinSubscriptionB, paymentType, z, str, 108);
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).longValue();
        in0 in0Var = new in0(this.this$0, (xn2) obj4);
        in0Var.L$0 = (QuotaUsage) obj;
        in0Var.L$1 = (String) obj3;
        return in0Var.r(wef.a);
    }
}
