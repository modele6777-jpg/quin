package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nxf extends gbe implements n26 {
    final /* synthetic */ e89 $canTransformSurface$delegate;
    final /* synthetic */ jxf $viewfinderInitScope;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxf(jxf jxfVar, e89 e89Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.$viewfinderInitScope = jxfVar;
        this.$canTransformSurface$delegate = e89Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        nxf nxfVar = new nxf(this.$viewfinderInitScope, this.$canTransformSurface$delegate, (xn2) obj3);
        nxfVar.L$0 = (oxf) obj2;
        return nxfVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            oxf oxfVar = (oxf) this.L$0;
            this.$canTransformSurface$delegate.setValue(Boolean.TRUE);
            jxf jxfVar = this.$viewfinderInitScope;
            omb ombVarA = oxfVar.a();
            this.label = 1;
            Object objA = jxfVar.a(ombVarA, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
