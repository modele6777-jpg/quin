package defpackage;

import tech.chatmind.api.QuotaUsageRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qfe extends gbe implements a26 {
    int label;
    final /* synthetic */ sfe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfe(sfe sfeVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = sfeVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new qfe(this.this$0, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        sfe sfeVar = this.this$0;
        vab vabVar = sfeVar.e;
        QuotaUsageRequest quotaUsageRequest = new QuotaUsageRequest(((mo3) sfeVar.a).a(), (String) null, 2, (rp3) null);
        this.label = 1;
        Object objA = vabVar.a(quotaUsageRequest, this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }
}
