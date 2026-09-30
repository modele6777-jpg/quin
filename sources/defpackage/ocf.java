package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ocf extends gbe implements l26 {
    final /* synthetic */ String $failureMsg;
    final /* synthetic */ h0e $gating$delegate;
    final /* synthetic */ e89 $userAttemptedAdvance$delegate;
    final /* synthetic */ rcf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocf(rcf rcfVar, String str, h0e h0eVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = rcfVar;
        this.$failureMsg = str;
        this.$gating$delegate = h0eVar;
        this.$userAttemptedAdvance$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ocf(this.$viewModel, this.$failureMsg, this.$gating$delegate, this.$userAttemptedAdvance$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (((psc) this.$gating$delegate.getValue()).b != null && ((Boolean) this.$userAttemptedAdvance$delegate.getValue()).booleanValue()) {
                nqd nqdVar = this.$viewModel.d;
                uqd uqdVar = new uqd(this.$failureMsg);
                this.label = 1;
                Object objA = nqdVar.a(uqdVar, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ocf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
