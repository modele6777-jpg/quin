package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(e30 e30Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = e30Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b30 b30Var = new b30(this.this$0, xn2Var);
        b30Var.L$0 = obj;
        return b30Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        f30 f30Var = (f30) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        e30 e30Var = this.this$0;
        int i = e30.U0;
        e30Var.getClass();
        boolean z = (f30Var == null || f30Var.d == v50.a) ? false : true;
        s0e s0eVar = this.this$0.R0;
        do {
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, a30.a((a30) value, null, null, z, 3)));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        b30 b30Var = (b30) k((xn2) obj2, (f30) obj);
        wef wefVar = wef.a;
        b30Var.r(wefVar);
        return wefVar;
    }
}
