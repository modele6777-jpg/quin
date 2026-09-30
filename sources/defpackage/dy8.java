package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dy8 extends gbe implements l26 {
    final /* synthetic */ boolean $migrateAsHandled;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy8(boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$migrateAsHandled = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dy8 dy8Var = new dy8(this.$migrateAsHandled, xn2Var);
        dy8Var.L$0 = obj;
        return dy8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        isa isaVar = xqa.n0.a;
        Boolean bool = Boolean.TRUE;
        p79Var.getClass();
        p79Var.f(isaVar, bool);
        if (this.$migrateAsHandled) {
            p79Var.f(xqa.o0.a, bool);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        dy8 dy8Var = (dy8) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        dy8Var.r(wefVar);
        return wefVar;
    }
}
