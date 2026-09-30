package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class alf extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ qmf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alf(vb2 vb2Var, qmf qmfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.$viewModel = qmfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new alf(this.$activity, this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hf8.Q.getClass();
        m8b m8bVarA = ef8.a("Quin.OneLogin");
        vb2 vb2Var = this.$activity;
        m8bVarA.e("UserAuthRoute LaunchedEffect: activity=" + (vb2Var != null ? vb2Var.getClass().getSimpleName() : null));
        vb2 vb2Var2 = this.$activity;
        if (vb2Var2 != null) {
            qmf qmfVar = this.$viewModel;
            qmfVar.getClass();
            awe aweVarW = af1.W(if8.c, vb2Var2);
            if (aweVarW != null) {
                aweVarW.a(vb2Var2);
            } else {
                qmfVar.d().g("no one login available");
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        alf alfVar = (alf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        alfVar.r(wefVar);
        return wefVar;
    }
}
