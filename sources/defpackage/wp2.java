package defpackage;

import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 extends gbe implements l26 {
    final /* synthetic */ q7b $app;
    final /* synthetic */ mma $popupManager;
    int I$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp2(q7b q7bVar, mma mmaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$app = q7bVar;
        this.$popupManager = mmaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wp2(this.$app, this.$popupManager, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ua9 ua9Var;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            da9 da9VarH = this.$app.a.b.h();
            int i2 = 0;
            if (da9VarH != null && (ua9Var = da9VarH.b) != null) {
                int i3 = ua9.e;
                if (kj0.k0(ua9Var, job.a.b(AppRoute.Main.class))) {
                    i2 = 1;
                }
            }
            boolean zS = wq2.s(this.$popupManager);
            if (i2 == 0 || zS) {
                this.$popupManager.G();
                return wefVar;
            }
            ka9.e(this.$app.a, new AppRoute.Paywall("first_open", false, false, false, 14, (rp3) null), null, 6);
            vp2 vp2Var = new vp2(2, null);
            this.I$0 = i2;
            this.Z$0 = zS;
            this.label = 1;
            Object objB = lw2.b(vp2Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.$popupManager.G();
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wp2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
