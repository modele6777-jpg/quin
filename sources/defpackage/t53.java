package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t53 extends gbe implements l26 {
    final /* synthetic */ h0e $navigationResult$delegate;
    final /* synthetic */ l26 $onProceed;
    final /* synthetic */ y63 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t53(y63 y63Var, h0e h0eVar, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = y63Var;
        this.$navigationResult$delegate = h0eVar;
        this.$onProceed = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t53(this.$viewModel, this.$navigationResult$delegate, this.$onProceed, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        u33 u33Var = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        u33 u33Var2 = (u33) this.$navigationResult$delegate.getValue();
        if (u33Var2 == null) {
            return wef.a;
        }
        y63 y63Var = this.$viewModel;
        long j = u33Var2.a;
        synchronized (y63Var) {
            u33 u33Var3 = (u33) y63Var.Y.getValue();
            if (u33Var3 != null) {
                if (u33Var3.a != j) {
                    u33Var3 = null;
                }
                if (u33Var3 != null) {
                    y63Var.Y.m(null);
                    u33Var = u33Var3;
                }
            }
        }
        if (u33Var != null) {
            this.$onProceed.z(u33Var.b, u33Var.c);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t53) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
