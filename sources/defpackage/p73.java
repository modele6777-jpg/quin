package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p73 extends gbe implements l26 {
    final /* synthetic */ DailyFortuneGuideTrigger $trigger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p73(DailyFortuneGuideTrigger dailyFortuneGuideTrigger, xn2 xn2Var) {
        super(2, xn2Var);
        this.$trigger = dailyFortuneGuideTrigger;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new p73(this.$trigger, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        x1f x1fVar = x1f.a;
        x1f.g(new r05("popup_view"), m1f.c, new ot1(8, this.$trigger));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        p73 p73Var = (p73) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        p73Var.r(wefVar);
        return wefVar;
    }
}
