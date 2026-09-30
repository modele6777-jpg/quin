package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ak5 extends gbe implements l26 {
    final /* synthetic */ n26 $block;
    final /* synthetic */ xj5 $this_flow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak5(n26 n26Var, xj5 xj5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = n26Var;
        this.$this_flow = xj5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ak5 ak5Var = new ak5(this.$block, this.$this_flow, xn2Var);
        ak5Var.L$0 = obj;
        return ak5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            n26 n26Var = this.$block;
            xj5 xj5Var = this.$this_flow;
            this.L$0 = null;
            this.label = 1;
            Object objM = n26Var.m(aw2Var, xj5Var, this);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
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
        return ((ak5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
