package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vw8 extends gbe implements l26 {
    final /* synthetic */ String $currentFixed;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw8(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentFixed = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vw8 vw8Var = new vw8(this.$currentFixed, xn2Var);
        vw8Var.L$0 = obj;
        return vw8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        zw8 zw8Var = zw8.a;
        isa isaVar = zw8.b;
        Boolean bool = (Boolean) p79Var.c(isaVar);
        if (!(bool != null ? bool.booleanValue() : false)) {
            p79Var.e(zw8.c, this.$currentFixed);
        }
        p79Var.e(isaVar, Boolean.TRUE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vw8 vw8Var = (vw8) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        vw8Var.r(wefVar);
        return wefVar;
    }
}
