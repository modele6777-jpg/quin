package defpackage;

import tech.chatmind.api.payment.PaywallSkus;
import tech.chatmind.api.payment.PaywallSkusEnvelope;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s5a extends gbe implements l26 {
    final /* synthetic */ String $scene;
    int label;
    final /* synthetic */ u5a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5a(u5a u5aVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = u5aVar;
        this.$scene = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new s5a(this.this$0, this.$scene, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                u5a u5aVar = this.this$0;
                int i2 = u5a.b;
                d56 d56Var = (d56) u5aVar.a.getValue();
                String str = this.$scene;
                this.label = 1;
                obj = d56Var.g(str, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            ServerResponse serverResponse = (ServerResponse) obj;
            PaywallSkus paywallSkus = ((PaywallSkusEnvelope) serverResponse.getData()).getPaywallSkus();
            if (!serverResponse.getSuccess() || serverResponse.getError()) {
                return null;
            }
            return paywallSkus;
        } catch (Throwable th) {
            ynb.h0(th);
            kv2.A("Load paywall scene failed: ", this.$scene, this.this$0.d(), th);
            return null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((s5a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
