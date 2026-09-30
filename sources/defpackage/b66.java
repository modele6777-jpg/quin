package defpackage;

import ai.askquin.ui.annual.model.AnnualActionFor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b66 extends gbe implements l26 {
    final /* synthetic */ AnnualActionFor $actionFor;
    final /* synthetic */ k66 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b66(k66 k66Var, AnnualActionFor annualActionFor, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = k66Var;
        this.$actionFor = annualActionFor;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b66(this.$viewModel, this.$actionFor, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        k66 k66Var = this.$viewModel;
        AnnualActionFor annualActionFor = this.$actionFor;
        k66Var.getClass();
        annualActionFor.getClass();
        if (!k66Var.f) {
            k66Var.f = true;
            ynb.V(hwf.a(k66Var), null, null, new h66(k66Var, annualActionFor, null), 3);
            ybc ybcVar = new ybc(new z40(k66Var.b.a, "2026", null));
            js3 js3Var = ga4.a;
            ok8.C(new gl5(new kl5(ym8.x(ybcVar, hr3.c), new i66(k66Var, null), 1), new j66(k66Var, 3000L, null)), hwf.a(k66Var));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        b66 b66Var = (b66) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        b66Var.r(wefVar);
        return wefVar;
    }
}
