package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rq2 extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ q7b $app;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq2(vb2 vb2Var, q7b q7bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.$app = q7bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rq2(this.$activity, this.$app, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        wq2.q(this.$activity, this.$app);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        rq2 rq2Var = (rq2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        rq2Var.r(wefVar);
        return wefVar;
    }
}
