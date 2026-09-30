package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import ai.askquin.ui.paywall.upgrade.s;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g64 extends gbe implements l26 {
    final /* synthetic */ t7 $account;
    final /* synthetic */ s $manager;
    final /* synthetic */ e89 $triggerStatus$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g64(t7 t7Var, s sVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$account = t7Var;
        this.$manager = sVar;
        this.$triggerStatus$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g64(this.$account, this.$manager, this.$triggerStatus$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        e89 e89Var;
        e89 e89Var2;
        String str;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            e89Var = this.$triggerStatus$delegate;
            if (((mo3) this.$account).b()) {
                s sVar = this.$manager;
                String strA = ((mo3) this.$account).a();
                this.L$0 = e89Var;
                this.label = 1;
                Object objI = sVar.i(strA, this);
                bw2 bw2Var = bw2.a;
                if (objI == bw2Var) {
                    return bw2Var;
                }
                obj = objI;
                e89Var2 = e89Var;
            } else {
                str = "当前未登录，不会自动触发";
            }
            e89Var.setValue(str);
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e89Var2 = (e89) this.L$0;
        jzb.q(obj);
        eh5 eh5Var = (eh5) obj;
        FiveCardUpgradePending fiveCardUpgradePending = eh5Var.d;
        String strF = fiveCardUpgradePending != null ? tec.f(fiveCardUpgradePending.getRemainingReadings(), "待展示：剩余 ", " 次") : "无待展示机会";
        int i2 = eh5Var.b;
        int i3 = eh5Var.c;
        int i4 = eh5Var.e;
        int i5 = eh5Var.f;
        e89Var = e89Var2;
        str = strF + "；待确认 " + i2 + "，确认中 " + i3 + "；已展示周期 " + i4 + "，追问抑制 " + i5;
        e89Var.setValue(str);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g64) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
