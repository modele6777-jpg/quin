package defpackage;

import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.router.AppRoute;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yp2 extends gbe implements l26 {
    final /* synthetic */ q7b $app;
    final /* synthetic */ yua $popup;
    final /* synthetic */ mma $popupManager;
    final /* synthetic */ qna $updateViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp2(qna qnaVar, mma mmaVar, q7b q7bVar, yua yuaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$updateViewModel = qnaVar;
        this.$popupManager = mmaVar;
        this.$app = q7bVar;
        this.$popup = yuaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yp2(this.$updateViewModel, this.$popupManager, this.$app, this.$popup, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        da9 da9VarH;
        ua9 ua9Var;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        vma vmaVarI = this.$updateViewModel.i();
        wef wefVar = wef.a;
        if (vmaVarI != null) {
            this.$popupManager.F();
            return wefVar;
        }
        if (this.$updateViewModel.h() && (da9VarH = this.$app.a.b.h()) != null && (ua9Var = da9VarH.b) != null) {
            int i = ua9.e;
            if (kj0.k0(ua9Var, job.a.b(AppRoute.Main.class)) && !wq2.s(this.$popupManager)) {
                this.$popupManager.H(((vua) this.$popup).a);
                ka9.e(this.$app.a, new PaywallRoute.UpgradePaywall(((vua) this.$popup).a.getRemainingReadings(), false, ((vua) this.$popup).a.getAccountId(), ((vua) this.$popup).a.getReadingId(), (List) ((vua) this.$popup).a.getOrderIds(), 2, (rp3) null), null, 6);
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        yp2 yp2Var = (yp2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        yp2Var.r(wefVar);
        return wefVar;
    }
}
