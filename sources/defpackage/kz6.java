package defpackage;

import ai.askquin.services.InAppMessagePollingService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kz6 extends gbe implements l26 {
    int label;
    final /* synthetic */ InAppMessagePollingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz6(InAppMessagePollingService inAppMessagePollingService, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = inAppMessagePollingService;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kz6(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
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
        InAppMessagePollingService inAppMessagePollingService = this.this$0;
        int i2 = InAppMessagePollingService.g;
        cz6 cz6Var = (cz6) inAppMessagePollingService.a.getValue();
        this.label = 1;
        uz6 uz6Var = (uz6) cz6Var;
        uz6Var.getClass();
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(hr3.c, new sz6(uz6Var, null), this);
        bw2 bw2Var = bw2.a;
        if (objP0 != bw2Var) {
            objP0 = wefVar;
        }
        return objP0 == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kz6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
