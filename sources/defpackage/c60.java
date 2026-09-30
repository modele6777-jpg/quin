package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 extends gbe implements l26 {
    final /* synthetic */ int $resumeFromIndex;
    final /* synthetic */ w10 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(int i, w10 w10Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$resumeFromIndex = i;
        this.$viewModel = w10Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c60(this.$resumeFromIndex, this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$resumeFromIndex == 0) {
            w10 w10Var = this.$viewModel;
            w10Var.getClass();
            ynb.V(hwf.a(w10Var), null, null, new v10(w10Var, null), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        c60 c60Var = (c60) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        c60Var.r(wefVar);
        return wefVar;
    }
}
