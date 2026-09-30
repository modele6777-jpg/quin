package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g0f extends gbe implements a26 {
    Object L$0;
    int label;
    final /* synthetic */ h0f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0f(h0f h0fVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = h0fVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new g0f(this.this$0, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            h0f h0fVar = this.this$0;
            this.L$0 = h0fVar;
            this.label = 1;
            pl1 pl1Var = new pl1(1, k99.D(this));
            pl1Var.v();
            h0fVar.b.f(Boolean.TRUE);
            h0fVar.c = pl1Var;
            Object objT = pl1Var.t();
            bw2 bw2Var = bw2.a;
            if (objT == bw2Var) {
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
