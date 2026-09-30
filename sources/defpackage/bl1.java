package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 extends gbe implements l26 {
    final /* synthetic */ h0e $currentArgs$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl1(h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentArgs$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bl1 bl1Var = new bl1(this.$currentArgs$delegate, xn2Var);
        bl1Var.L$0 = obj;
        return bl1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xva xvaVar = (xva) this.L$0;
            ybc ybcVarP = jzb.p(new zk1(0, this.$currentArgs$delegate));
            al1 al1Var = new al1(xvaVar, null);
            this.label = 1;
            Object objP = ok8.p(ybcVarP, al1Var, this);
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
        return ((bl1) k((xn2) obj2, (xva) obj)).r(wef.a);
    }
}
