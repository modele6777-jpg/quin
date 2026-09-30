package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hhf extends gbe implements l26 {
    final /* synthetic */ e89 $completed$delegate;
    final /* synthetic */ x16 $onBack;
    final /* synthetic */ h0e $state$delegate;
    final /* synthetic */ mhf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf(mhf mhfVar, x16 x16Var, e89 e89Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = mhfVar;
        this.$onBack = x16Var;
        this.$completed$delegate = e89Var;
        this.$state$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hhf(this.$viewModel, this.$onBack, this.$completed$delegate, this.$state$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!((Boolean) this.$completed$delegate.getValue()).booleanValue()) {
            if (pa7.t(this.$viewModel.o(), g0e.a)) {
                this.$completed$delegate.setValue(Boolean.TRUE);
                this.$onBack.invoke();
            } else {
                jhf jhfVar = (jhf) this.$state$delegate.getValue();
                if ((jhfVar.f && jhfVar.g) || ((jhf) this.$state$delegate.getValue()).d) {
                    this.$completed$delegate.setValue(Boolean.TRUE);
                    this.$onBack.invoke();
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        hhf hhfVar = (hhf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        hhfVar.r(wefVar);
        return wefVar;
    }
}
