package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fwd extends gbe implements l26 {
    final /* synthetic */ use $textFieldState;
    final /* synthetic */ iwd $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwd(use useVar, iwd iwdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$textFieldState = useVar;
        this.$viewModel = iwdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fwd(this.$textFieldState, this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        use useVar = this.$textFieldState;
        iwd iwdVar = this.$viewModel;
        une uneVarH = useVar.h();
        try {
            uneVarH.c(0, uneVarH.c.length(), iwdVar.f());
            useVar.a(uneVarH);
            return wef.a;
        } finally {
            useVar.c();
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        fwd fwdVar = (fwd) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        fwdVar.r(wefVar);
        return wefVar;
    }
}
