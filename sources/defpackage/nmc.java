package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nmc extends gbe implements l26 {
    final /* synthetic */ x16 $onNeedPurchase;
    final /* synthetic */ x16 $onReady;
    final /* synthetic */ h0e $progress$delegate;
    final /* synthetic */ e89 $requestStarted$delegate;
    final /* synthetic */ orc $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmc(orc orcVar, x16 x16Var, x16 x16Var2, e89 e89Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = orcVar;
        this.$onReady = x16Var;
        this.$onNeedPurchase = x16Var2;
        this.$requestStarted$delegate = e89Var;
        this.$progress$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nmc(this.$viewModel, this.$onReady, this.$onNeedPurchase, this.$requestStarted$delegate, this.$progress$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean zBooleanValue = ((Boolean) this.$requestStarted$delegate.getValue()).booleanValue();
        wef wefVar = wef.a;
        if (zBooleanValue && pa7.t((upc) this.$progress$delegate.getValue(), this.$viewModel.E0.a.getValue())) {
            upc upcVar = (upc) this.$progress$delegate.getValue();
            if (upcVar instanceof spc) {
                this.$onReady.invoke();
                return wefVar;
            }
            if (pa7.t(upcVar, qpc.a)) {
                this.$onNeedPurchase.invoke();
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        nmc nmcVar = (nmc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        nmcVar.r(wefVar);
        return wefVar;
    }
}
