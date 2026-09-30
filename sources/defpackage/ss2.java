package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ss2 extends gbe implements l26 {
    final /* synthetic */ h0e $lifecycleState$delegate;
    final /* synthetic */ boolean $reviewRewardSnackbarHostReady;
    final /* synthetic */ p3c $reviewRewardVm;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss2(p3c p3cVar, boolean z, r0 r0Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$reviewRewardVm = p3cVar;
        this.$reviewRewardSnackbarHostReady = z;
        this.$vm = r0Var;
        this.$lifecycleState$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ss2(this.$reviewRewardVm, this.$reviewRewardSnackbarHostReady, this.$vm, this.$lifecycleState$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        p3c p3cVar = this.$reviewRewardVm;
        boolean z = this.$reviewRewardSnackbarHostReady;
        boolean z2 = ((g48) this.$lifecycleState$delegate.getValue()).compareTo(g48.e) >= 0;
        boolean zJ0 = this.$vm.j0();
        p3cVar.X = z;
        p3cVar.Y = z2;
        p3cVar.Z = zJ0;
        p3cVar.p();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ss2 ss2Var = (ss2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ss2Var.r(wefVar);
        return wefVar;
    }
}
