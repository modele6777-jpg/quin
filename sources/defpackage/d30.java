package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d30 extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    int label;
    final /* synthetic */ e30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(vb2 vb2Var, e30 e30Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.this$0 = e30Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d30(this.$activity, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            vb2 vb2Var = this.$activity;
            c30 c30Var = new c30(this.this$0, null);
            this.label = 1;
            Object objP = rrb.p(vb2Var, g48.e, c30Var, this);
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
        return ((d30) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
