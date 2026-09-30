package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y55 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l65 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y55(l65 l65Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = l65Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        y55 y55Var = new y55(this.this$0, xn2Var);
        y55Var.L$0 = obj;
        return y55Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        awa awaVar = (awa) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ynb.V(awaVar, null, null, new x55(this.this$0, awaVar, null), 3);
            l65 l65Var = this.this$0;
            this.L$0 = null;
            this.label = 1;
            int i2 = l65.v;
            Object objE = l65Var.e(this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
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
        return ((y55) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
