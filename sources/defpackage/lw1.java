package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lw1 extends gbe implements l26 {
    final /* synthetic */ xj5 $collector;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ mw1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw1(mw1 mw1Var, xj5 xj5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mw1Var;
        this.$collector = xj5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lw1 lw1Var = new lw1(this.this$0, this.$collector, xn2Var);
        lw1Var.L$0 = obj;
        return lw1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i == 0) {
            mmb mmbVarD = ks0.d(obj);
            mw1 mw1Var = this.this$0;
            wj5 wj5Var = mw1Var.d;
            kw1 kw1Var = new kw1(mmbVarD, aw2Var, mw1Var, this.$collector);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objB = wj5Var.b(kw1Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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
        return ((lw1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
