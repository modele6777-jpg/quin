package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class asa extends gbe implements l26 {
    final /* synthetic */ hs3 $datePreference;
    final /* synthetic */ hs3 $shownPreference;
    final /* synthetic */ n26 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asa(n26 n26Var, hs3 hs3Var, hs3 hs3Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transform = n26Var;
        this.$shownPreference = hs3Var;
        this.$datePreference = hs3Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        asa asaVar = new asa(this.$transform, this.$shownPreference, this.$datePreference, xn2Var);
        asaVar.L$0 = obj;
        return asaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$transform.m(p79Var, this.$shownPreference, this.$datePreference);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        asa asaVar = (asa) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        asaVar.r(wefVar);
        return wefVar;
    }
}
