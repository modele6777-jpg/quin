package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iw1 extends gbe implements l26 {
    final /* synthetic */ xj5 $collector;
    final /* synthetic */ Object $value;
    int label;
    final /* synthetic */ mw1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw1(mw1 mw1Var, xj5 xj5Var, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mw1Var;
        this.$collector = xj5Var;
        this.$value = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new iw1(this.this$0, this.$collector, this.$value, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            n26 n26Var = this.this$0.e;
            xj5 xj5Var = this.$collector;
            Object obj2 = this.$value;
            this.label = 1;
            Object objM = n26Var.m(xj5Var, obj2, this);
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
        return ((iw1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
