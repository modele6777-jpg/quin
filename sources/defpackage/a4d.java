package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a4d extends gbe implements l26 {
    final /* synthetic */ k4d $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4d(k4d k4dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = k4dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a4d(this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ((rab) this.$viewModel.c).f();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        a4d a4dVar = (a4d) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        a4dVar.r(wefVar);
        return wefVar;
    }
}
