package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g24 extends gbe implements l26 {
    final /* synthetic */ v $store;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g24(v vVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$store = vVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g24(this.$store, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            v vVar = this.$store;
            this.label = 1;
            obj = vVar.i(this);
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
        k73 k73Var = (k73) obj;
        if (k73Var == null) {
            jcc.k(0, "请先登录账号");
        } else {
            boolean z = k73Var.b;
            boolean z2 = k73Var.c;
            boolean z3 = k73Var.d;
            DailyFortuneGuideTrigger dailyFortuneGuideTrigger = k73Var.e;
            String analyticsValue = dailyFortuneGuideTrigger != null ? dailyFortuneGuideTrigger.getAnalyticsValue() : null;
            if (analyticsValue == null) {
                analyticsValue = "";
            }
            boolean z4 = k73Var.f;
            boolean z5 = k73Var.m;
            StringBuilder sbP = ib8.p("exists=", ", eligible=", ", evaluated=", z, z2);
            sbP.append(z3);
            sbP.append(", trigger=");
            sbP.append(analyticsValue);
            sbP.append(", consumed=");
            sbP.append(z4);
            sbP.append(", drawnToday=");
            sbP.append(z5);
            jcc.k(1, sbP.toString());
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g24) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
