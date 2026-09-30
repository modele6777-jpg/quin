package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b5b extends gbe implements l26 {
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ u5b $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5b(yx9 yx9Var, u5b u5bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pagerState = yx9Var;
        this.$state = u5bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b5b(this.$pagerState, this.$state, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (!this.$pagerState.k().a.isEmpty()) {
                int iL = this.$pagerState.l();
                int i2 = ((t5b) this.$state).b;
                if (i2 >= 0 && i2 < iL) {
                    yx9 yx9Var = this.$pagerState;
                    this.label = 1;
                    Object objF = yx9Var.f(i2, b21.P(0.0f, 0.0f, 7, null), this);
                    bw2 bw2Var = bw2.a;
                    if (objF == bw2Var) {
                        return bw2Var;
                    }
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b5b) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
