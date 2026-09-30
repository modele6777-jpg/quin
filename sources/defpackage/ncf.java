package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ncf extends gbe implements l26 {
    final /* synthetic */ h0e $gating$delegate;
    final /* synthetic */ egd $shuffleState;
    final /* synthetic */ e89 $userAttemptedAdvance$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncf(egd egdVar, h0e h0eVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shuffleState = egdVar;
        this.$gating$delegate = h0eVar;
        this.$userAttemptedAdvance$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ncf(this.$shuffleState, this.$gating$delegate, this.$userAttemptedAdvance$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$shuffleState.c() && !((psc) this.$gating$delegate.getValue()).a) {
            this.$userAttemptedAdvance$delegate.setValue(Boolean.TRUE);
        } else if (((psc) this.$gating$delegate.getValue()).a) {
            this.$userAttemptedAdvance$delegate.setValue(Boolean.FALSE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ncf ncfVar = (ncf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ncfVar.r(wefVar);
        return wefVar;
    }
}
