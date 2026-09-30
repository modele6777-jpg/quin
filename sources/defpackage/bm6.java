package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bm6 extends gbe implements l26 {
    final /* synthetic */ h0e $dailyFortuneTooltipFocus$delegate;
    final /* synthetic */ h73 $effectiveDailyFortuneTooltipFocus;
    final /* synthetic */ e89 $qaDailyFortuneTooltipState$delegate;
    final /* synthetic */ kq6 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm6(h73 h73Var, kq6 kq6Var, h0e h0eVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$effectiveDailyFortuneTooltipFocus = h73Var;
        this.$viewModel = kq6Var;
        this.$dailyFortuneTooltipFocus$delegate = h0eVar;
        this.$qaDailyFortuneTooltipState$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bm6(this.$effectiveDailyFortuneTooltipFocus, this.$viewModel, this.$dailyFortuneTooltipFocus$delegate, this.$qaDailyFortuneTooltipState$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        lyd lydVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$effectiveDailyFortuneTooltipFocus != null) {
                h0e h0eVar = this.$dailyFortuneTooltipFocus$delegate;
                float f = um6.a;
                h73 h73Var = (h73) h0eVar.getValue();
                q3b q3bVar = (q3b) this.$qaDailyFortuneTooltipState$delegate.getValue();
                q3bVar.getClass();
                if (h73Var != null && (q3bVar instanceof o3b)) {
                    tk6 tk6Var = new tk6(2);
                    this.label = 1;
                    Object objG0 = tm7.J(getContext()).g0(this, tk6Var);
                    bw2 bw2Var = bw2.a;
                    if (objG0 == bw2Var) {
                        return bw2Var;
                    }
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        kq6 kq6Var = this.$viewModel;
        String str = kq6Var.K0;
        if (str != null && !kq6Var.L0 && (!pa7.t(kq6Var.I0, str) || (lydVar = kq6Var.G0) == null || !lydVar.b())) {
            kq6Var.J0 = null;
            lyd lydVar2 = kq6Var.H0;
            if (lydVar2 != null) {
                lydVar2.h(null);
            }
            kq6Var.H0 = ynb.V(hwf.a(kq6Var), null, null, new ip6(kq6Var, str, null), 3);
            kq6Var.I0 = str;
            kq6Var.G0 = ynb.V(hwf.a(kq6Var), null, null, new kp6(kq6Var, str, null), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bm6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
