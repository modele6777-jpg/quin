package defpackage;

import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinDetailRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gnd extends gbe implements l26 {
    final /* synthetic */ mmd $chosenSkin;
    final /* synthetic */ ka9 $navController;
    final /* synthetic */ SkinNavigationRoute$SkinMallRoute $route;
    final /* synthetic */ and $shareViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnd(mmd mmdVar, and andVar, SkinNavigationRoute$SkinMallRoute skinNavigationRoute$SkinMallRoute, ka9 ka9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$chosenSkin = mmdVar;
        this.$shareViewModel = andVar;
        this.$route = skinNavigationRoute$SkinMallRoute;
        this.$navController = ka9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gnd(this.$chosenSkin, this.$shareViewModel, this.$route, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        mmd mmdVar = this.$chosenSkin;
        wef wefVar = wef.a;
        if (mmdVar != null) {
            and andVar = this.$shareViewModel;
            SkinNavigationRoute$SkinMallRoute skinNavigationRoute$SkinMallRoute = this.$route;
            ka9 ka9Var = this.$navController;
            if (((Boolean) andVar.S0.getValue()).booleanValue() && !skinNavigationRoute$SkinMallRoute.isPurchased()) {
                andVar.S0.setValue(Boolean.FALSE);
                ka9Var.d(new e2d(29), new SkinNavigationRoute$SkinDetailRoute(mmdVar.a, false, 2, (rp3) null));
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        gnd gndVar = (gnd) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        gndVar.r(wefVar);
        return wefVar;
    }
}
