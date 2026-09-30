package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jib extends gbe implements l26 {
    final /* synthetic */ sw6 $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ mib this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jib(mib mibVar, sw6 sw6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mibVar;
        this.$request = sw6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jib jibVar = new jib(this.this$0, this.$request, xn2Var);
        jibVar.L$0 = obj;
        return jibVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return obj;
        }
        jzb.q(obj);
        pu3 pu3VarY = ynb.y(aw2Var, (pv2) this.this$0.a.c.getValue(), new iib(this.this$0, this.$request, null), 2);
        hfe hfeVar = this.$request.c;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object objS = pu3VarY.s(this);
        bw2 bw2Var = bw2.a;
        return objS == bw2Var ? bw2Var : objS;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jib) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
