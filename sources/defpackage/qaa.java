package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qaa extends gbe implements l26 {
    final /* synthetic */ q9b $quotaProvider;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ aba this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaa(aba abaVar, q9b q9bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = abaVar;
        this.$quotaProvider = q9bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qaa qaaVar = new qaa(this.this$0, this.$quotaProvider, xn2Var);
        qaaVar.L$0 = obj;
        return qaaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        js3 js3Var = ga4.a;
        ynb.V(aw2Var, hr3.c, null, new paa(this.this$0, null), 2);
        aba abaVar = this.this$0;
        QuotaUsage quotaUsageB = ((eab) this.$quotaProvider).b();
        int testReportCount = quotaUsageB != null ? quotaUsageB.getTestReportCount() : 0;
        int i = aba.e;
        abaVar.d.setValue(Integer.valueOf(testReportCount));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        qaa qaaVar = (qaa) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        qaaVar.r(wefVar);
        return wefVar;
    }
}
