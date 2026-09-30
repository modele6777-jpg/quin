package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jp2 extends gbe implements l26 {
    final /* synthetic */ x48 $lifecycleOwner;
    final /* synthetic */ wt2 $mainViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp2(x48 x48Var, wt2 wt2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$lifecycleOwner = x48Var;
        this.$mainViewModel = wt2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jp2(this.$lifecycleOwner, this.$mainViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            x48 x48Var = this.$lifecycleOwner;
            ip2 ip2Var = new ip2(this.$mainViewModel, null);
            this.label = 1;
            Object objP = rrb.p(x48Var, g48.e, ip2Var, this);
            bw2 bw2Var = bw2.a;
            if (objP == bw2Var) {
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
        return ((jp2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
