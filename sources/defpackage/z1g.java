package defpackage;

import tech.chatmind.api.payment.CancelContractRequest;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1g extends gbe implements l26 {
    final /* synthetic */ String $contractId;
    final /* synthetic */ c2g $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1g(c2g c2gVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_runCatching = c2gVar;
        this.$contractId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z1g(this.$this_runCatching, this.$contractId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            w1g w1gVar = this.$this_runCatching.a;
            CancelContractRequest cancelContractRequest = new CancelContractRequest(this.$contractId);
            this.label = 1;
            obj = w1gVar.a(cancelContractRequest, this);
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
        return Boolean.valueOf(((ServerResponse) obj).getSuccess());
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z1g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
