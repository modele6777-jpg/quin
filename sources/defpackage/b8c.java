package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b8c extends gbe implements l26 {
    final /* synthetic */ ya2 $deferred;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8c(ya2 ya2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$deferred = ya2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b8c(this.$deferred, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
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
        ya2 ya2Var = this.$deferred;
        this.label = 1;
        Object objS = ((za2) ya2Var).s(this);
        bw2 bw2Var = bw2.a;
        return objS == bw2Var ? bw2Var : objS;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b8c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
