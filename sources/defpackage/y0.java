package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends gbe implements l26 {
    final /* synthetic */ pta $press;
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(b1 b1Var, pta ptaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = b1Var;
        this.$press = ptaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new y0(this.this$0, this.$press, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            t69 t69Var = this.this$0.F0;
            if (t69Var != null) {
                qta qtaVar = new qta(this.$press);
                this.label = 1;
                Object objA = ((u69) t69Var).a(qtaVar, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
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
        return ((y0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
