package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import ai.askquin.ui.popup.dailyfortune.v;
import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l24 extends gbe implements l26 {
    final /* synthetic */ ka9 $navController;
    final /* synthetic */ mma $popupPriorityViewModel;
    final /* synthetic */ v $store;
    final /* synthetic */ DailyFortuneGuideTrigger $trigger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l24(v vVar, DailyFortuneGuideTrigger dailyFortuneGuideTrigger, mma mmaVar, ka9 ka9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$store = vVar;
        this.$trigger = dailyFortuneGuideTrigger;
        this.$popupPriorityViewModel = mmaVar;
        this.$navController = ka9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l24(this.$store, this.$trigger, this.$popupPriorityViewModel, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            v vVar = this.$store;
            DailyFortuneGuideTrigger dailyFortuneGuideTrigger = this.$trigger;
            this.label = 1;
            obj = vVar.n(dailyFortuneGuideTrigger, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        wef wefVar = wef.a;
        if (obj == null) {
            jcc.k(0, "请先登录账号");
            return wefVar;
        }
        mma mmaVar = this.$popupPriorityViewModel;
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger2 = this.$trigger;
        mmaVar.getClass();
        dailyFortuneGuideTrigger2.getClass();
        mmaVar.Q(new nua(dailyFortuneGuideTrigger2));
        ka9.h(this.$navController, AppRoute.Main.INSTANCE, false);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l24) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
