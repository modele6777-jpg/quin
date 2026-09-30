package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vk3 extends gbe implements l26 {
    final /* synthetic */ boolean $mixedPurchaseDelivered;
    final /* synthetic */ e89 $mixedPurchaseRequested$delegate;
    final /* synthetic */ and $purchaseViewModel;
    final /* synthetic */ e89 $showMixedUnlockDialog$delegate;
    final /* synthetic */ ol3 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk3(boolean z, and andVar, ol3 ol3Var, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$mixedPurchaseDelivered = z;
        this.$purchaseViewModel = andVar;
        this.$viewModel = ol3Var;
        this.$mixedPurchaseRequested$delegate = e89Var;
        this.$showMixedUnlockDialog$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vk3(this.$mixedPurchaseDelivered, this.$purchaseViewModel, this.$viewModel, this.$mixedPurchaseRequested$delegate, this.$showMixedUnlockDialog$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        e89 e89Var = this.$mixedPurchaseRequested$delegate;
        int i = zk3.b;
        if (((Boolean) e89Var.getValue()).booleanValue() && this.$mixedPurchaseDelivered) {
            e89 e89Var2 = this.$mixedPurchaseRequested$delegate;
            Boolean bool = Boolean.FALSE;
            e89Var2.setValue(bool);
            this.$showMixedUnlockDialog$delegate.setValue(bool);
            this.$purchaseViewModel.a0(null);
            ol3 ol3Var = this.$viewModel;
            lyd lydVar = ol3Var.Z;
            if (lydVar != null) {
                lydVar.h(null);
            }
            ol3Var.Z = ynb.V(hwf.a(ol3Var), null, null, new kl3(ol3Var, true, null), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vk3 vk3Var = (vk3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vk3Var.r(wefVar);
        return wefVar;
    }
}
