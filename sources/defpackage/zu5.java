package defpackage;

import ai.askquin.ui.fourseasons.FourSeasonsEntry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zu5 extends gbe implements l26 {
    final /* synthetic */ ka9 $navController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu5(ka9 ka9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$navController = ka9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zu5(this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$navController.f(job.a.b(FourSeasonsEntry.class), true);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        zu5 zu5Var = (zu5) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        zu5Var.r(wefVar);
        return wefVar;
    }
}
