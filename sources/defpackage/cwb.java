package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cwb extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ dwb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwb(dwb dwbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = dwbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        cwb cwbVar = new cwb(this.this$0, xn2Var);
        cwbVar.L$0 = obj;
        return cwbVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        String str = (String) this.L$0;
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
        k2c k2cVar = this.this$0.a;
        this.L$0 = null;
        this.label = 1;
        Object objC = k2cVar.c(this, new g2c(k2cVar, null), str);
        bw2 bw2Var = bw2.a;
        return objC == bw2Var ? bw2Var : objC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cwb) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
