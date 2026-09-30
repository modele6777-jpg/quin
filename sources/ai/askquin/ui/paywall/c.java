package ai.askquin.ui.paywall;

import ai.askquin.ui.popup.dailyfortune.v;
import ai.askquin.ui.router.AppRoute;
import defpackage.a5a;
import defpackage.aw2;
import defpackage.bw2;
import defpackage.ca2;
import defpackage.cb9;
import defpackage.cye;
import defpackage.dc9;
import defpackage.e5a;
import defpackage.eab;
import defpackage.fbc;
import defpackage.gbe;
import defpackage.gcc;
import defpackage.hs3;
import defpackage.jzb;
import defpackage.k52;
import defpackage.l26;
import defpackage.lw2;
import defpackage.nu4;
import defpackage.pa7;
import defpackage.q9b;
import defpackage.qc0;
import defpackage.qw2;
import defpackage.th5;
import defpackage.wef;
import defpackage.xn2;
import defpackage.xqa;
import defpackage.ynb;
import defpackage.z57;
import defpackage.z5c;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gbe implements l26 {
    final /* synthetic */ v $dailyFortuneGuideStore;
    final /* synthetic */ cb9 $navController;
    final /* synthetic */ dc9 $navigationViewModel;
    final /* synthetic */ q9b $quotaProvider;
    final /* synthetic */ PaywallRoute.InterceptPaywall $route;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PaywallRoute.InterceptPaywall interceptPaywall, v vVar, cb9 cb9Var, q9b q9bVar, dc9 dc9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$route = interceptPaywall;
        this.$dailyFortuneGuideStore = vVar;
        this.$navController = cb9Var;
        this.$quotaProvider = q9bVar;
        this.$navigationViewModel = dc9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c(this.$route, this.$dailyFortuneGuideStore, this.$navController, this.$quotaProvider, this.$navigationViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        QuotaUsage quotaUsageB;
        qw2 countData;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            PaywallRoute.InterceptPaywall interceptPaywall = this.$route;
            interceptPaywall.getClass();
            if ((pa7.t(interceptPaywall.getSource(), "conversation") || pa7.t(interceptPaywall.getSource(), "camera_divination")) && interceptPaywall.getBlockedReason() == null) {
                v vVar = this.$dailyFortuneGuideStore;
                this.label = 1;
                Object objB = vVar.b(this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
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
        this.$navController.g();
        q9b q9bVar = this.$quotaProvider;
        ca2.a.getClass();
        if (!ca2.c) {
            hs3 hs3Var = xqa.d0;
            Object objI = z5c.I(nu4.a, new e5a(hs3Var.a, hs3Var.b, null));
            th5 th5Var = cye.b;
            cye cyeVarD = fbc.d();
            k52 k52Var = z57.a;
            if (!pa7.t(objI, gcc.E(k52Var.a(), cyeVarD).a().toString()) && (quotaUsageB = ((eab) q9bVar).b()) != null && (countData = quotaUsageB.getCountData()) != null && countData.c() && !countData.b()) {
                ynb.V(lw2.a, null, null, new a5a(hs3Var.a, gcc.E(k52Var.a(), fbc.d()).a().toString(), null), 3);
                this.$navigationViewModel.g(AppRoute.MarketingActivityPopup.INSTANCE);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
