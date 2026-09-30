package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vra extends gbe implements l26 {
    final /* synthetic */ hs3 $scopedCurrent;
    final /* synthetic */ hs3 $scopedLast;
    final /* synthetic */ String $time;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vra(hs3 hs3Var, String str, hs3 hs3Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scopedCurrent = hs3Var;
        this.$time = str;
        this.$scopedLast = hs3Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vra vraVar = new vra(this.$scopedCurrent, this.$time, this.$scopedLast, xn2Var);
        vraVar.L$0 = obj;
        return vraVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        isa isaVar = this.$scopedCurrent.a;
        String str = this.$time;
        p79Var.getClass();
        p79Var.f(isaVar, str);
        p79Var.f(this.$scopedLast.a, this.$time);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vra vraVar = (vra) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        vraVar.r(wefVar);
        return wefVar;
    }
}
