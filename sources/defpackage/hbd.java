package defpackage;

import tech.chatmind.api.ShareSummaryContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hbd extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lbd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbd(lbd lbdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lbdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hbd hbdVar = new hbd(this.this$0, xn2Var);
        hbdVar.L$0 = obj;
        return hbdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ShareSummaryContent shareSummaryContent = (ShareSummaryContent) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        lbd lbdVar = this.this$0;
        vc4 vc4Var = lbdVar.f;
        String divinationId = lbdVar.d.getDivinationId();
        shareSummaryContent.getClass();
        divinationId.getClass();
        xc4 xc4Var = new xc4(divinationId, shareSummaryContent.getTheme(), shareSummaryContent.getSummary(), shareSummaryContent.getAdvice());
        this.L$0 = null;
        this.label = 1;
        Object objK = urg.K(this, new ks2(21, vc4Var, xc4Var), vc4Var.a, false, true);
        bw2 bw2Var = bw2.a;
        if (objK != bw2Var) {
            objK = wefVar;
        }
        return objK == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hbd) k((xn2) obj2, (ShareSummaryContent) obj)).r(wef.a);
    }
}
