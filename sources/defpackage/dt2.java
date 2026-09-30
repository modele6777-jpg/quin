package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dt2 extends gbe implements l26 {
    final /* synthetic */ h0e $lifecycleState$delegate;
    final /* synthetic */ e89 $reviewRewardSnackbarHasLayout$delegate;
    final /* synthetic */ h0e $reviewRewardUiState$delegate;
    final /* synthetic */ p3c $reviewRewardVm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt2(p3c p3cVar, h0e h0eVar, e89 e89Var, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$reviewRewardVm = p3cVar;
        this.$reviewRewardUiState$delegate = h0eVar;
        this.$reviewRewardSnackbarHasLayout$delegate = e89Var;
        this.$lifecycleState$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dt2(this.$reviewRewardVm, this.$reviewRewardUiState$delegate, this.$reviewRewardSnackbarHasLayout$delegate, this.$lifecycleState$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        r0c r0cVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((d3c) this.$reviewRewardUiState$delegate.getValue()).b && ((Boolean) this.$reviewRewardSnackbarHasLayout$delegate.getValue()).booleanValue() && ((g48) this.$lifecycleState$delegate.getValue()).compareTo(g48.e) >= 0) {
            p3c p3cVar = this.$reviewRewardVm;
            p3cVar.f();
            r0c r0cVar2 = p3cVar.x;
            if (r0cVar2 != null && ((d3c) p3cVar.d.getValue()).b && p3cVar.m(r0cVar2) && !p3cVar.H0 && ((r0cVar = p3cVar.F0) == null || !p3cVar.m(r0cVar))) {
                p3cVar.F0 = r0cVar2;
                ynb.V(hwf.a(p3cVar), null, null, new l3c(p3cVar, r0cVar2, null), 3);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        dt2 dt2Var = (dt2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        dt2Var.r(wefVar);
        return wefVar;
    }
}
