package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xx9 extends gbe implements l26 {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ yx9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx9(yx9 yx9Var, float f, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yx9Var;
        this.$pageOffsetFraction = f;
        this.$page = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xx9(this.this$0, this.$pageOffsetFraction, this.$page, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            yx9 yx9Var = this.this$0;
            this.label = 1;
            Object objI = yx9Var.i(this);
            bw2 bw2Var = bw2.a;
            if (objI == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        float f = this.$pageOffsetFraction;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            l37.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.this$0.t(this.$pageOffsetFraction, this.this$0.j(this.$page), true);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xx9) k((xn2) obj2, (fhc) obj)).r(wef.a);
    }
}
