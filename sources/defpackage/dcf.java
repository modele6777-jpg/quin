package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dcf extends gbe implements l26 {
    final /* synthetic */ s69 $lastPresentedChoiceCount$delegate;
    final /* synthetic */ rcf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcf(rcf rcfVar, s69 s69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = rcfVar;
        this.$lastPresentedChoiceCount$delegate = s69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dcf(this.$viewModel, this.$lastPresentedChoiceCount$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ((sz9) this.$lastPresentedChoiceCount$delegate).k(this.$viewModel.f.size());
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        dcf dcfVar = (dcf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        dcfVar.r(wefVar);
        return wefVar;
    }
}
