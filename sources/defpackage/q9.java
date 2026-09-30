package defpackage;

import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 extends gbe implements n26 {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ x9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(x9 x9Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = x9Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        q9 q9Var = new q9(this.this$0, (xn2) obj3);
        q9Var.L$0 = (QuotaUsage) obj;
        return q9Var.r(wef.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        boolean zBooleanValue;
        int i2;
        QuotaUsage quotaUsage = (QuotaUsage) this.L$0;
        int i3 = this.label;
        if (i3 == 0) {
            jzb.q(obj);
            SubscriptionInfo subscription = quotaUsage != null ? quotaUsage.getSubscription() : null;
            i = (subscription == null || !s72.o0(qd0.I0(new String[]{"wechat-app-pay", "wechat-mini-program-pay", "wechat"}), subscription != null ? subscription.getPaymentType() : null)) ? 0 : 1;
            if (quotaUsage != null) {
                x1g x1gVar = this.this$0.v;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = i;
                this.label = 1;
                Object objQ = vd0.Q(quotaUsage, x1gVar, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
                i2 = i;
                obj = objQ;
            } else {
                zBooleanValue = false;
            }
            return new dn0(i != 0, zBooleanValue);
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.I$0;
        jzb.q(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        i = i2;
        return new dn0(i != 0, zBooleanValue);
    }
}
