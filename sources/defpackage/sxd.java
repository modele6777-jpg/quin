package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sxd extends gbe implements l26 {
    final /* synthetic */ wg7 $json;
    final /* synthetic */ a26 $makeRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxd(a26 a26Var, wg7 wg7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$makeRequest = a26Var;
        this.$json = wg7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        sxd sxdVar = new sxd(this.$makeRequest, this.$json, xn2Var);
        sxdVar.L$0 = obj;
        return sxdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rxd rxdVar = new rxd(xj5Var, this.$makeRequest, this.$json, null);
            this.L$0 = null;
            this.label = 1;
            Object objO = jgb.O(rxdVar, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
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
        return ((sxd) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
