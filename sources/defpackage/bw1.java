package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bw1 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cw1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(cw1 cw1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cw1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bw1 bw1Var = new bw1(this.this$0, xn2Var);
        bw1Var.L$0 = obj;
        return bw1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        awa awaVar = (awa) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            cw1 cw1Var = this.this$0;
            this.L$0 = null;
            this.label = 1;
            Object objF = cw1Var.f(awaVar, this);
            bw2 bw2Var = bw2.a;
            if (objF == bw2Var) {
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
        return ((bw1) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
