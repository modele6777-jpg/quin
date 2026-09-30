package defpackage;

import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.payment.ContractInfo;
import tech.chatmind.api.payment.SubscriptionStatusResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rn0 extends gbe implements p26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        rn0 rn0Var = new rn0(5, (xn2) obj5);
        rn0Var.L$0 = (en0) obj;
        rn0Var.Z$0 = zBooleanValue;
        rn0Var.Z$1 = zBooleanValue2;
        rn0Var.L$1 = (SubscriptionStatusResponse) obj4;
        return rn0Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        en0 en0Var = (en0) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        SubscriptionStatusResponse subscriptionStatusResponse = (SubscriptionStatusResponse) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean z3 = subscriptionStatusResponse != null && subscriptionStatusResponse.getHasActiveContract();
        ContractInfo contract = subscriptionStatusResponse != null ? subscriptionStatusResponse.getContract() : null;
        QuinSubscription quinSubscription = en0Var.a;
        String str = en0Var.b;
        boolean z4 = en0Var.e;
        String str2 = en0Var.h;
        en0Var.getClass();
        return new en0(quinSubscription, str, z3, contract, z4, z, z2, str2);
    }
}
