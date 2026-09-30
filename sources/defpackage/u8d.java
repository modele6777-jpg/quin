package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u8d extends gbe implements l26 {
    final /* synthetic */ String $code;
    final /* synthetic */ String $requestedAccountId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8d(String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$requestedAccountId = str;
        this.$code = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        u8d u8dVar = new u8d(this.$requestedAccountId, this.$code, xn2Var);
        u8dVar.L$0 = obj;
        return u8dVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (pa7.t(p79Var.c(xqa.A.a), this.$requestedAccountId)) {
            p79Var.f(xqa.g0.a, this.$code);
            p79Var.f(xqa.f0.a, this.$requestedAccountId);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        u8d u8dVar = (u8d) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        u8dVar.r(wefVar);
        return wefVar;
    }
}
