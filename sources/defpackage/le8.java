package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class le8 extends gbe implements l26 {
    final /* synthetic */ x16 $goToReport;
    final /* synthetic */ e89 $leavingForPaywall$delegate;
    final /* synthetic */ se8 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le8(se8 se8Var, x16 x16Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = se8Var;
        this.$goToReport = x16Var;
        this.$leavingForPaywall$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new le8(this.$vm, this.$goToReport, this.$leavingForPaywall$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        se8 se8Var = this.$vm;
        boolean zBooleanValue = ((Boolean) this.$leavingForPaywall$delegate.getValue()).booleanValue();
        x16 x16Var = this.$goToReport;
        se8Var.getClass();
        x16Var.getClass();
        ynb.V(hwf.a(se8Var), null, null, new ne8(se8Var, zBooleanValue, x16Var, null), 3);
        this.$leavingForPaywall$delegate.setValue(Boolean.FALSE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        le8 le8Var = (le8) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        le8Var.r(wefVar);
        return wefVar;
    }
}
