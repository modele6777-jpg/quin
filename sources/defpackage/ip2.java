package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ip2 extends gbe implements l26 {
    final /* synthetic */ wt2 $mainViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip2(wt2 wt2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$mainViewModel = wt2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ip2(this.$mainViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        wt2 wt2Var = this.$mainViewModel;
        wt2Var.getClass();
        ynb.V(hwf.a(wt2Var), null, null, new vt2(wt2Var, null), 3);
        o9 o9Var = this.$mainViewModel.d;
        o9Var.getClass();
        String strA = s7.a();
        if (strA.length() != 0) {
            ynb.V(lw2.a, null, null, new j9(o9Var, strA, null), 3);
        }
        wt2 wt2Var2 = this.$mainViewModel;
        wt2Var2.getClass();
        ynb.V(hwf.a(wt2Var2), null, null, new tt2(wt2Var2, null), 3);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ip2 ip2Var = (ip2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ip2Var.r(wefVar);
        return wefVar;
    }
}
