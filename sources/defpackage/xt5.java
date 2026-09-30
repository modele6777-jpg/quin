package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xt5 extends gbe implements l26 {
    final /* synthetic */ h0e $latestClose$delegate;
    final /* synthetic */ boolean $shouldCloseAfterLoadingFailure;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt5(boolean z, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shouldCloseAfterLoadingFailure = z;
        this.$latestClose$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xt5(this.$shouldCloseAfterLoadingFailure, this.$latestClose$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$shouldCloseAfterLoadingFailure) {
            ((x16) this.$latestClose$delegate.getValue()).invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        xt5 xt5Var = (xt5) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        xt5Var.r(wefVar);
        return wefVar;
    }
}
