package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qk extends gbe implements l26 {
    final /* synthetic */ a26 $onShowPaywall;
    final /* synthetic */ a26 $onViewReport;
    final /* synthetic */ String $testId;
    int label;
    final /* synthetic */ vk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(vk vkVar, String str, a26 a26Var, a26 a26Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = vkVar;
        this.$testId = str;
        this.$onViewReport = a26Var;
        this.$onShowPaywall = a26Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qk(this.this$0, this.$testId, this.$onViewReport, this.$onShowPaywall, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mk mkVar = new mk(this.this$0.b.a(this.$testId));
            js3 js3Var = ga4.a;
            al5 al5Var = new al5(ym8.x(mkVar, hr3.c), new ok(this.$onShowPaywall, this.$testId, this.this$0, null));
            pk pkVar = new pk(2, null);
            this.label = 1;
            obj = tm7.E(al5Var, pkVar, this);
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
        if (((v16) obj) != null) {
            this.$onViewReport.d(this.$testId);
        }
        vk vkVar = this.this$0;
        int i2 = vk.f;
        vkVar.e.setValue(Boolean.FALSE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qk) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
