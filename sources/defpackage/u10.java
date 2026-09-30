package defpackage;

import ai.askquin.ui.annual.c;
import ai.askquin.ui.annual.model.AnnualActionFor;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u10 extends gbe implements l26 {
    int label;
    final /* synthetic */ w10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(w10 w10Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = w10Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u10(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            w10 w10Var = this.this$0;
            c cVar = w10Var.z;
            AnnualActionFor annualActionFor = w10Var.y;
            int size = w10Var.f.size();
            List listJ1 = s72.j1(this.this$0.f);
            this.label = 1;
            Object objF = cVar.f(annualActionFor, size, listJ1, this);
            bw2 bw2Var = bw2.a;
            if (objF == bw2Var) {
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
        return ((u10) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
