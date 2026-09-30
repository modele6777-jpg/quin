package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vp4 extends gbe implements l26 {
    final /* synthetic */ e89 $imageFailed$delegate;
    final /* synthetic */ boolean $imagesReady;
    final /* synthetic */ x16 $onRetry;
    final /* synthetic */ a26 $reportStatus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp4(a26 a26Var, x16 x16Var, boolean z, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$reportStatus = a26Var;
        this.$onRetry = x16Var;
        this.$imagesReady = z;
        this.$imageFailed$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vp4(this.$reportStatus, this.$onRetry, this.$imagesReady, this.$imageFailed$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object ladVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        a26 a26Var = this.$reportStatus;
        if (((Boolean) this.$imageFailed$delegate.getValue()).booleanValue()) {
            ladVar = new lad(this.$onRetry);
        } else {
            ladVar = this.$imagesReady ? nad.a : mad.a;
        }
        a26Var.d(ladVar);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vp4 vp4Var = (vp4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vp4Var.r(wefVar);
        return wefVar;
    }
}
