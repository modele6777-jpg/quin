package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 extends gbe implements l26 {
    int label;
    final /* synthetic */ e30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(e30 e30Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = e30Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c30(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            e30 e30Var = this.this$0;
            if (e30Var.T0) {
                e30Var.T0 = false;
                this.label = 1;
                Object objG = e30Var.g(this);
                bw2 bw2Var = bw2.a;
                if (objG == bw2Var) {
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
        return ((c30) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
