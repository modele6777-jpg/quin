package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pq1 extends gbe implements l26 {
    final /* synthetic */ String $cardKey;
    final /* synthetic */ k75 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq1(k75 k75Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = k75Var;
        this.$cardKey = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pq1(this.$viewModel, this.$cardKey, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        k75 k75Var = this.$viewModel;
        String str = this.$cardKey;
        k75Var.getClass();
        str.getClass();
        s0e s0eVar = k75Var.x;
        s0eVar.getClass();
        s0eVar.n(null, str);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        pq1 pq1Var = (pq1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        pq1Var.r(wefVar);
        return wefVar;
    }
}
