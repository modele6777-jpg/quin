package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dw5 extends gbe implements l26 {
    final /* synthetic */ String $context;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw5(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dw5 dw5Var = new dw5(this.$context, xn2Var);
        dw5Var.L$0 = obj;
        return dw5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        isa isaVar = xqa.Y0.a;
        String str = this.$context;
        p79Var.getClass();
        p79Var.f(isaVar, str);
        p79Var.f(xqa.X0.a, Boolean.TRUE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        dw5 dw5Var = (dw5) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        dw5Var.r(wefVar);
        return wefVar;
    }
}
