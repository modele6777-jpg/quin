package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f5g extends gbe implements l26 {
    final /* synthetic */ r4g $kind;
    final /* synthetic */ long $now;
    final /* synthetic */ String $scenario;
    final /* synthetic */ w4g $source;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5g(r4g r4gVar, w4g w4gVar, long j, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$kind = r4gVar;
        this.$source = w4gVar;
        this.$now = j;
        this.$scenario = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        f5g f5gVar = new f5g(this.$kind, this.$source, this.$now, this.$scenario, xn2Var);
        f5gVar.L$0 = obj;
        return f5gVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        h5g h5gVar = h5g.a;
        isa isaVar = h5g.d(this.$kind).a;
        String strA = this.$source.a();
        p79Var.getClass();
        p79Var.f(isaVar, strA);
        hs3 hs3VarC = h5g.c(this.$kind);
        if (hs3VarC != null) {
            String str = this.$scenario;
            isa isaVar2 = hs3VarC.a;
            if (str == null) {
                str = "";
            }
            p79Var.f(isaVar2, str);
        }
        p79Var.f(h5g.e(this.$kind).a, new Long(this.$now));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        f5g f5gVar = (f5g) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        f5gVar.r(wefVar);
        return wefVar;
    }
}
