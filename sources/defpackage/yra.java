package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yra extends gbe implements l26 {
    final /* synthetic */ isa $this_setNowOrThrow;
    final /* synthetic */ Object $value;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yra(isa isaVar, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_setNowOrThrow = isaVar;
        this.$value = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yra yraVar = new yra(this.$this_setNowOrThrow, this.$value, xn2Var);
        yraVar.L$0 = obj;
        return yraVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        p79Var.e(this.$this_setNowOrThrow, this.$value);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        yra yraVar = (yra) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        yraVar.r(wefVar);
        return wefVar;
    }
}
