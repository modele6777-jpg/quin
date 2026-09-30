package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fm6 extends gbe implements l26 {
    final /* synthetic */ boolean $isHomepageReadyForDailyFortuneTooltip;
    final /* synthetic */ kq6 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm6(boolean z, kq6 kq6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isHomepageReadyForDailyFortuneTooltip = z;
        this.$viewModel = kq6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fm6(this.$isHomepageReadyForDailyFortuneTooltip, this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$isHomepageReadyForDailyFortuneTooltip) {
                tk6 tk6Var = new tk6(3);
                this.label = 1;
                Object objG0 = tm7.J(getContext()).g0(this, tk6Var);
                bw2 bw2Var = bw2.a;
                if (objG0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                kq6 kq6Var = this.$viewModel;
                kq6Var.M0 = false;
                kq6Var.f();
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        kq6 kq6Var2 = this.$viewModel;
        kq6Var2.M0 = true;
        kq6Var2.k();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fm6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
