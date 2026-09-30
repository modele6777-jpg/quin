package defpackage;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ ka0 b;

    public ia0(xj5 xj5Var, ka0 ka0Var) {
        this.a = xj5Var;
        this.b = ka0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        ha0 ha0Var;
        SubscriptionInfo subscription;
        SubscriptionInfo subscription2;
        Instant instantExpiredAt;
        r55 r55Var;
        if (xn2Var instanceof ha0) {
            ha0Var = (ha0) xn2Var;
            int i = ha0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ha0Var.label = i - Integer.MIN_VALUE;
            } else {
                ha0Var = new ha0(this, xn2Var);
            }
        } else {
            ha0Var = new ha0(this, xn2Var);
        }
        Object obj2 = ha0Var.result;
        int i2 = ha0Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            lb8 lb8Var = (lb8) obj;
            ka0 ka0Var = this.b;
            QuotaUsage quotaUsageB = ((eab) ka0Var.c).b();
            if (quotaUsageB == null || !quotaUsageB.getHasSubscription() || (((subscription = quotaUsageB.getSubscription()) != null && subscription.canPaymentTypeAutoRenewal()) || (subscription2 = quotaUsageB.getSubscription()) == null || (instantExpiredAt = subscription2.expiredAt()) == null)) {
                r55Var = null;
            } else {
                long jBetween = ChronoUnit.DAYS.between(Instant.now(), instantExpiredAt);
                ka0Var.d().e("ExpirationAlertData: leftDays=" + jBetween + ", last=" + lb8Var.h);
                if (jBetween > 3 || jBetween < 0) {
                    r55Var = null;
                } else {
                    ma8 ma8Var = lb8Var.h;
                    th5 th5Var = cye.b;
                    if (pa7.t(ma8Var, gcc.E(z57.a.a(), fbc.d()).a())) {
                        r55Var = null;
                    } else {
                        int i3 = (int) jBetween;
                        QuinSubscription quinSubscriptionB = drb.b(quotaUsageB);
                        if (quinSubscriptionB == null) {
                            r55Var = null;
                        } else {
                            r55Var = new r55(i3, quinSubscriptionB);
                        }
                    }
                }
            }
            ha0Var.L$0 = null;
            ha0Var.L$1 = null;
            ha0Var.L$2 = null;
            ha0Var.L$3 = null;
            ha0Var.label = 1;
            Object objA = this.a.a(r55Var, ha0Var);
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
