package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mv2 extends gbe implements l26 {
    final /* synthetic */ nu3 $this_awaitUntil;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv2(nu3 nu3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_awaitUntil = nu3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mv2(this.$this_awaitUntil, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        nu3 nu3Var = this.$this_awaitUntil;
        this.label = 1;
        Object objH0 = nu3Var.H0(this);
        bw2 bw2Var = bw2.a;
        return objH0 == bw2Var ? bw2Var : objH0;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mv2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
