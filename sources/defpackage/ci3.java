package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ci3 extends gbe implements l26 {
    final /* synthetic */ boolean $autoOpen;
    final /* synthetic */ n69 $boxRotation$delegate;
    final /* synthetic */ boolean $boxView;
    final /* synthetic */ boolean $hintShown;
    final /* synthetic */ h0e $onHintShownState;
    final /* synthetic */ aw2 $scope;
    final /* synthetic */ hi3 $spinAnim;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci3(boolean z, boolean z2, boolean z3, h0e h0eVar, hi3 hi3Var, aw2 aw2Var, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$autoOpen = z;
        this.$boxView = z2;
        this.$hintShown = z3;
        this.$onHintShownState = h0eVar;
        this.$spinAnim = hi3Var;
        this.$scope = aw2Var;
        this.$boxRotation$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ci3(this.$autoOpen, this.$boxView, this.$hintShown, this.$onHintShownState, this.$spinAnim, this.$scope, this.$boxRotation$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean z = this.$autoOpen;
        wef wefVar = wef.a;
        if (!z && this.$boxView && !this.$hintShown) {
            ((x16) this.$onHintShownState.getValue()).invoke();
            this.$spinAnim.a = ynb.V(this.$scope, null, null, new bi3(this.$boxRotation$delegate, null), 3);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ci3 ci3Var = (ci3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ci3Var.r(wefVar);
        return wefVar;
    }
}
