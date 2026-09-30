package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ulc extends gbe implements l26 {
    final /* synthetic */ bmc $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulc(bmc bmcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = bmcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ulc(this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        bmc bmcVar = this.$viewModel;
        bmcVar.c.n(null, ylc.a);
        lyd lydVar = bmcVar.e;
        if (lydVar != null) {
            lydVar.h(null);
        }
        bmcVar.e = ynb.V(hwf.a(bmcVar), null, null, new amc(bmcVar, null), 3);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ulc ulcVar = (ulc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ulcVar.r(wefVar);
        return wefVar;
    }
}
