package defpackage;

import ai.askquin.ui.paywall.d;
import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w4a extends gbe implements l26 {
    final /* synthetic */ boolean $isOnboarding;
    final /* synthetic */ cb9 $navController;
    final /* synthetic */ dc9 $navigationViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4a(boolean z, dc9 dc9Var, cb9 cb9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isOnboarding = z;
        this.$navigationViewModel = dc9Var;
        this.$navController = cb9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new w4a(this.$isOnboarding, this.$navigationViewModel, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$isOnboarding) {
                dc9 dc9Var = this.$navigationViewModel;
                this.label = 1;
                Object objA = d.a(dc9Var, false, this);
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
        if (this.$navController.c() != null) {
            this.$navController.g();
        }
        if (((Boolean) this.$navigationViewModel.f.getValue()).booleanValue()) {
            this.$navigationViewModel.i(false);
            this.$navigationViewModel.g(AppRoute.FreeCountDialog.INSTANCE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((w4a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
