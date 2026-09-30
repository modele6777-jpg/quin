package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lib extends gbe implements l26 {
    final /* synthetic */ bv6 $cachedPlaceholder;
    final /* synthetic */ uz4 $eventListener;
    final /* synthetic */ sw6 $request;
    final /* synthetic */ ykd $size;
    int label;
    final /* synthetic */ mib this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lib(sw6 sw6Var, mib mibVar, ykd ykdVar, uz4 uz4Var, bv6 bv6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$request = sw6Var;
        this.this$0 = mibVar;
        this.$size = ykdVar;
        this.$eventListener = uz4Var;
        this.$cachedPlaceholder = bv6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lib(this.$request, this.this$0, this.$size, this.$eventListener, this.$cachedPlaceholder, xn2Var);
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
        sw6 sw6Var = this.$request;
        pib pibVar = new pib(sw6Var, this.this$0.e.a, 0, sw6Var, this.$size, this.$eventListener, this.$cachedPlaceholder != null);
        this.label = 1;
        Object objA = pibVar.a(this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lib) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
