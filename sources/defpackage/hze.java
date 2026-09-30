package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hze extends gbe implements l26 {
    final /* synthetic */ int $currentBuild;
    final /* synthetic */ int $previousBuild;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hze(int i, int i2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$previousBuild = i;
        this.$currentBuild = i2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hze hzeVar = new hze(this.$previousBuild, this.$currentBuild, xn2Var);
        hzeVar.L$0 = obj;
        return hzeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hs3 hs3Var = xqa.N;
        Boolean bool = (Boolean) p79Var.c(hs3Var.a);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : ((Boolean) hs3Var.b).booleanValue();
        wef wefVar = wef.a;
        if (zBooleanValue) {
            return wefVar;
        }
        isa isaVar = xqa.O.a;
        int i = this.$previousBuild;
        p79Var.f(isaVar, Boolean.valueOf(i > 0 && i != this.$currentBuild));
        p79Var.f(hs3Var.a, Boolean.TRUE);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        hze hzeVar = (hze) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        hzeVar.r(wefVar);
        return wefVar;
    }
}
