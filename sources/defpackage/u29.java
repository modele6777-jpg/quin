package defpackage;

import ai.askquin.ui.annual.ResumeRoute;
import ai.askquin.ui.annual.c;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u29 extends gbe implements l26 {
    int label;
    final /* synthetic */ w29 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u29(w29 w29Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = w29Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u29(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            c cVar = this.this$0.b;
            ResumeRoute.MonthlySummary monthlySummary = ResumeRoute.MonthlySummary.INSTANCE;
            this.label = 1;
            Object objC = cVar.c(monthlySummary, this);
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
        return ((u29) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
