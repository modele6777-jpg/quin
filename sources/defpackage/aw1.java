package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aw1 extends gbe implements l26 {
    final /* synthetic */ xj5 $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cw1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(xj5 xj5Var, cw1 cw1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$collector = xj5Var;
        this.this$0 = cw1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        aw1 aw1Var = new aw1(this.$collector, this.this$0, xn2Var);
        aw1Var.L$0 = obj;
        return aw1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = this.$collector;
            yv1 yv1VarK = this.this$0.k(aw2Var);
            this.L$0 = null;
            this.label = 1;
            Object objH = db6.H(xj5Var, yv1VarK, true, this);
            bw2 bw2Var = bw2.a;
            if (objH != bw2Var) {
                objH = wefVar;
            }
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((aw1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
