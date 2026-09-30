package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class io9 extends gbe implements l26 {
    final /* synthetic */ boolean $animationCanStart;
    final /* synthetic */ e89 $waitForWelcomeDissolve$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io9(boolean z, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$animationCanStart = z;
        this.$waitForWelcomeDissolve$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new io9(this.$animationCanStart, this.$waitForWelcomeDissolve$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$animationCanStart) {
            e89 e89Var = this.$waitForWelcomeDissolve$delegate;
            x6f x6fVar = ap9.a;
            e89Var.setValue(Boolean.FALSE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        io9 io9Var = (io9) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        io9Var.r(wefVar);
        return wefVar;
    }
}
