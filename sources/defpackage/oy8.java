package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oy8 extends gbe implements l26 {
    final /* synthetic */ DailyFortuneGuideTrigger $trigger;
    int label;
    final /* synthetic */ py8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy8(py8 py8Var, DailyFortuneGuideTrigger dailyFortuneGuideTrigger, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = py8Var;
        this.$trigger = dailyFortuneGuideTrigger;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new oy8(this.this$0, this.$trigger, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        v vVar = this.this$0.a;
        DailyFortuneGuideTrigger dailyFortuneGuideTrigger = this.$trigger;
        this.label = 1;
        Object objN = vVar.n(dailyFortuneGuideTrigger, this);
        bw2 bw2Var = bw2.a;
        return objN == bw2Var ? bw2Var : objN;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oy8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
