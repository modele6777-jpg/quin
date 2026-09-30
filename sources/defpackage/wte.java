package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wte extends gbe implements l26 {
    final /* synthetic */ r68 $linkStateObserver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wte(r68 r68Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$linkStateObserver = r68Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wte(this.$linkStateObserver, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wef.a;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r68 r68Var = this.$linkStateObserver;
        this.label = 1;
        r68Var.getClass();
        ((u69) r68Var.a).a.b(new qb1(7, new i79(), r68Var), this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wte) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
