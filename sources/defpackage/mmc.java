package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mmc extends gbe implements l26 {
    final /* synthetic */ e89 $requestStarted$delegate;
    final /* synthetic */ x16 $start;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmc(x16 x16Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$start = x16Var;
        this.$requestStarted$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mmc(this.$start, this.$requestStarted$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$start.invoke();
        this.$requestStarted$delegate.setValue(Boolean.TRUE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mmc mmcVar = (mmc) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        mmcVar.r(wefVar);
        return wefVar;
    }
}
