package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g18 extends gbe implements l26 {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j18 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g18(j18 j18Var, int i, int i2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j18Var;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        g18 g18Var = new g18(this.this$0, this.$index, this.$scrollOffset, xn2Var);
        g18Var.L$0 = obj;
        return g18Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            fhc fhcVar = (fhc) this.L$0;
            j18 j18Var = this.this$0;
            d18 d18Var = new d18(fhcVar, j18Var, 0);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            sw3 sw3Var = ((b18) j18Var.f.getValue()).i;
            this.label = 1;
            Object objU = g21.u(d18Var, i2, i3, 100, sw3Var, this);
            bw2 bw2Var = bw2.a;
            if (objU == bw2Var) {
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
        return ((g18) k((xn2) obj2, (fhc) obj)).r(wef.a);
    }
}
