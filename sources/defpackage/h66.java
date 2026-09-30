package defpackage;

import ai.askquin.ui.annual.ResumeRoute;
import ai.askquin.ui.annual.c;
import ai.askquin.ui.annual.model.AnnualActionFor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h66 extends gbe implements l26 {
    final /* synthetic */ AnnualActionFor $actionFor;
    int label;
    final /* synthetic */ k66 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h66(k66 k66Var, AnnualActionFor annualActionFor, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k66Var;
        this.$actionFor = annualActionFor;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h66(this.this$0, this.$actionFor, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            c cVar = this.this$0.c;
            AnnualActionFor annualActionFor = this.$actionFor;
            this.label = 1;
            ResumeRoute.Generating generating = new ResumeRoute.Generating(annualActionFor);
            cVar.d().f("saveGeneratingProgress: actionFor={}", annualActionFor);
            Object objN = cVar.a.n(c.e(generating), this);
            bw2 bw2Var = bw2.a;
            if (objN == bw2Var) {
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
        return ((h66) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
