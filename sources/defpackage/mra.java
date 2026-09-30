package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mra extends gbe implements l26 {
    final /* synthetic */ a26 $isValid;
    final /* synthetic */ hs3 $scopedCurrent;
    final /* synthetic */ hs3 $scopedLast;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mra(hs3 hs3Var, a26 a26Var, hs3 hs3Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scopedCurrent = hs3Var;
        this.$isValid = a26Var;
        this.$scopedLast = hs3Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mra mraVar = new mra(this.$scopedCurrent, this.$isValid, this.$scopedLast, xn2Var);
        mraVar.L$0 = obj;
        return mraVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = (String) p79Var.c(this.$scopedCurrent.a);
        if (str != null) {
            String str2 = ((Boolean) this.$isValid.d(str)).booleanValue() ? str : null;
            if (str2 != null) {
                p79Var.f(this.$scopedLast.a, str2);
            }
        }
        p79Var.d(this.$scopedCurrent.a);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mra mraVar = (mra) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        mraVar.r(wefVar);
        return wefVar;
    }
}
