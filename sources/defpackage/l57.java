package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l57 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ boolean $isNewRegistration;
    final /* synthetic */ p57 $this_runCatching;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l57(String str, boolean z, p57 p57Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountId = str;
        this.$isNewRegistration = z;
        this.$this_runCatching = p57Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        l57 l57Var = new l57(this.$accountId, this.$isNewRegistration, this.$this_runCatching, xn2Var);
        l57Var.L$0 = obj;
        return l57Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        isa isaVar = xqa.A.a;
        String str = this.$accountId;
        p79Var.getClass();
        p79Var.f(isaVar, str);
        if (this.$isNewRegistration) {
            p57 p57Var = this.$this_runCatching;
            hs3 hs3Var = xqa.G;
            String str2 = (String) p79Var.c(hs3Var.a);
            if (str2 == null) {
                str2 = "";
            }
            p57Var.getClass();
            p79Var.f(hs3Var.a, s72.D0(n3d.n(p57.b(str2), this.$accountId), "\n", null, null, null, 62));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l57 l57Var = (l57) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        l57Var.r(wefVar);
        return wefVar;
    }
}
