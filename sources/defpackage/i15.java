package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i15 extends gbe implements l26 {
    int label;
    final /* synthetic */ m25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i15(m25 m25Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = m25Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new i15(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        s0e s0eVar = this.this$0.d;
        Boolean bool = Boolean.TRUE;
        s0eVar.getClass();
        s0eVar.n(null, bool);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        i15 i15Var = (i15) k((xn2) obj2, (o19) obj);
        wef wefVar = wef.a;
        i15Var.r(wefVar);
        return wefVar;
    }
}
