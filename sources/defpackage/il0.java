package defpackage;

import ai.askquin.ui.account.navigation.AuthNavigation$Terminal;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class il0 extends gbe implements l26 {
    final /* synthetic */ cb9 $navController;
    final /* synthetic */ l26 $onFinishLogin;
    final /* synthetic */ qmf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il0(qmf qmfVar, l26 l26Var, cb9 cb9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = qmfVar;
        this.$onFinishLogin = l26Var;
        this.$navController = cb9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new il0(this.$viewModel, this.$onFinishLogin, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        qmf qmfVar = this.$viewModel;
        ql0 ql0Var = (ql0) qmfVar.v.getValue();
        qmfVar.l(null);
        if (ql0Var != null) {
            l26 l26Var = this.$onFinishLogin;
            cb9 cb9Var = this.$navController;
            if (ql0Var instanceof AuthNavigation$Terminal) {
                AuthNavigation$Terminal authNavigation$Terminal = (AuthNavigation$Terminal) ql0Var;
                l26Var.z(Boolean.valueOf(authNavigation$Terminal.isNewUser()), authNavigation$Terminal.getMethod());
            } else {
                ka9.e(cb9Var, ql0Var, null, 6);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        il0 il0Var = (il0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        il0Var.r(wefVar);
        return wefVar;
    }
}
