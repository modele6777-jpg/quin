package defpackage;

import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 extends gbe implements l26 {
    final /* synthetic */ h0e $currentBackStackEntry$delegate;
    final /* synthetic */ dc9 $navigationViewModel;
    final /* synthetic */ boolean $pendingSubscriptionCompletion;
    final /* synthetic */ mma $popupManager;
    final /* synthetic */ boolean $suppressAutomaticPopups;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp2(boolean z, boolean z2, h0e h0eVar, dc9 dc9Var, mma mmaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pendingSubscriptionCompletion = z;
        this.$suppressAutomaticPopups = z2;
        this.$currentBackStackEntry$delegate = h0eVar;
        this.$navigationViewModel = dc9Var;
        this.$popupManager = mmaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xp2(this.$pendingSubscriptionCompletion, this.$suppressAutomaticPopups, this.$currentBackStackEntry$delegate, this.$navigationViewModel, this.$popupManager, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        da9 da9Var = (da9) this.$currentBackStackEntry$delegate.getValue();
        if (da9Var != null && this.$pendingSubscriptionCompletion && !this.$suppressAutomaticPopups) {
            int i2 = ua9.e;
            if (!kj0.k0(da9Var.b, job.a.b(AppRoute.FreeCountDialog.class))) {
                a58 a58Var = da9Var.v.j;
                dc9 dc9Var = this.$navigationViewModel;
                mma mmaVar = this.$popupManager;
                js3 js3Var = ga4.a;
                wg6 wg6Var = mk8.a.f;
                boolean zB1 = wg6Var.b1(getContext());
                if (!zB1) {
                    g48 g48Var = a58Var.i;
                    if (g48Var == g48.a) {
                        throw new p48(null);
                    }
                    if (g48Var.compareTo(g48.e) >= 0) {
                        dc9Var.g.setValue(Boolean.FALSE);
                        mmaVar.n();
                        return wefVar;
                    }
                }
                n5 n5Var = new n5(dc9Var, mmaVar, false, 5);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.Z$0 = zB1;
                this.label = 1;
                Object objW = p8c.w(a58Var, zB1, wg6Var, n5Var, this);
                bw2 bw2Var = bw2.a;
                if (objW == bw2Var) {
                    return bw2Var;
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xp2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
