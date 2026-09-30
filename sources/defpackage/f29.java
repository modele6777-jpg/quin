package defpackage;

import ai.askquin.ui.annual.ResumeRoute;
import ai.askquin.ui.annual.c;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f29 extends gbe implements l26 {
    int label;
    final /* synthetic */ h29 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f29(h29 h29Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = h29Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new f29(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            c cVar = this.this$0.b;
            ResumeRoute.MonthlyDetail monthlyDetail = ResumeRoute.MonthlyDetail.INSTANCE;
            this.label = 1;
            Object objC = cVar.c(monthlyDetail, this);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((f29) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
