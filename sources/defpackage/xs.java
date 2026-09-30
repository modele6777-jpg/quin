package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xs extends gbe implements l26 {
    final /* synthetic */ a26 $initializeRequest;
    final /* synthetic */ f38 $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(a26 a26Var, ys ysVar, f38 f38Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$initializeRequest = a26Var;
        this.this$0 = ysVar;
        this.$node = f38Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xs xsVar = new xs(this.$initializeRequest, this.this$0, this.$node, xn2Var);
        xsVar.L$0 = obj;
        return xsVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ws wsVar = new ws((hga) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            Object objO = jgb.O(wsVar, this);
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
        oo3.f();
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((xs) k((xn2) obj2, (hga) obj)).r(wef.a);
        return bw2.a;
    }
}
