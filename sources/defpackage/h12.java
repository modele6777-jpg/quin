package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h12 extends gbe implements l26 {
    final /* synthetic */ int $itemCount;
    final /* synthetic */ a26 $onPageChanged;
    final /* synthetic */ yx9 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h12(int i, xn2 xn2Var, a26 a26Var, yx9 yx9Var) {
        super(2, xn2Var);
        this.$pagerState = yx9Var;
        this.$onPageChanged = a26Var;
        this.$itemCount = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yx9 yx9Var = this.$pagerState;
        return new h12(this.$itemCount, xn2Var, this.$onPageChanged, yx9Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5VarI = dj6.I(jzb.p(new f12(this.$pagerState, 0)));
            g12 g12Var = new g12(this.$onPageChanged, this.$itemCount);
            this.label = 1;
            Object objB = wj5VarI.b(g12Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
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
        return ((h12) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
