package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x20 extends gbe implements l26 {
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ aw2 $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(xn2 xn2Var, aw2 aw2Var, yx9 yx9Var) {
        super(2, xn2Var);
        this.$pagerState = yx9Var;
        this.$scope = aw2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new x20(xn2Var, this.$scope, this.$pagerState);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.label = 1;
            Object objQ = vfh.q(5000L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        ynb.V(this.$scope, null, null, new w20(this.$pagerState, (((sz9) this.$pagerState.d.c).j() + 1) % 3, null), 3);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((x20) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
