package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cm8 extends gbe implements l26 {
    final /* synthetic */ ma8 $date;
    int label;
    final /* synthetic */ dm8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm8(dm8 dm8Var, ma8 ma8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = dm8Var;
        this.$date = ma8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cm8(this.this$0, this.$date, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gd8 gd8Var = this.this$0.a;
            ma8 ma8Var = this.$date;
            this.label = 1;
            Object objA = gd8Var.a(ma8Var, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
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
        return ((cm8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
