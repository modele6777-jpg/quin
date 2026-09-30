package defpackage;

import ai.askquin.ui.annual.AnnualMonthlyEntryRoute;
import ai.askquin.ui.annual.h;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g40 extends gbe implements l26 {
    final /* synthetic */ ka9 $navController;
    final /* synthetic */ h $sharedViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(h hVar, ka9 ka9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sharedViewModel = hVar;
        this.$navController = ka9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g40(this.$sharedViewModel, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            h hVar = this.$sharedViewModel;
            this.label = 1;
            obj = hVar.i(this);
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
        if (((Boolean) obj).booleanValue()) {
            this.$navController.d(new zv(19), AnnualMonthlyEntryRoute.INSTANCE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g40) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
