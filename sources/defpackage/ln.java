package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ln extends gbe implements n26 {
    final /* synthetic */ l26 $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(l26 l26Var, rn rnVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.$forEachDelta = l26Var;
        this.this$0 = rnVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        ln lnVar = new ln(this.$forEachDelta, this.this$0, (xn2) obj3);
        lnVar.L$0 = (ho) obj;
        return lnVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ho hoVar = (ho) this.L$0;
            l26 l26Var = this.$forEachDelta;
            kn knVar = new kn(this.this$0, hoVar, 0);
            this.label = 1;
            Object objZ = l26Var.z(knVar, this);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
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
}
