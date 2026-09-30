package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import ai.askquin.ui.paywall.upgrade.s;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t4a extends gbe implements l26 {
    final /* synthetic */ t7 $account;
    final /* synthetic */ x16 $close;
    final /* synthetic */ chf $entryState;
    final /* synthetic */ s $manager;
    final /* synthetic */ FiveCardUpgradePending $pending;
    final /* synthetic */ mma $popupManager;
    final /* synthetic */ fab $quotaUpdater;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4a(FiveCardUpgradePending fiveCardUpgradePending, mma mmaVar, chf chfVar, t7 t7Var, fab fabVar, s sVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pending = fiveCardUpgradePending;
        this.$popupManager = mmaVar;
        this.$entryState = chfVar;
        this.$account = t7Var;
        this.$quotaUpdater = fabVar;
        this.$manager = sVar;
        this.$close = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t4a(this.$pending, this.$popupManager, this.$entryState, this.$account, this.$quotaUpdater, this.$manager, this.$close, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        t4a t4aVar;
        Exception exc;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                FiveCardUpgradePending fiveCardUpgradePending = this.$pending;
                if (fiveCardUpgradePending != null) {
                    this.$popupManager.H(fiveCardUpgradePending);
                }
                try {
                    chf chfVar = this.$entryState;
                    FiveCardUpgradePending fiveCardUpgradePending2 = this.$pending;
                    t7 t7Var = this.$account;
                    fab fabVar = this.$quotaUpdater;
                    s sVar = this.$manager;
                    this.label = 1;
                    t4aVar = this;
                    try {
                        obj = chfVar.a(fiveCardUpgradePending2, t7Var, fabVar, sVar, t4aVar);
                        bw2 bw2Var = bw2.a;
                        if (obj == bw2Var) {
                            return bw2Var;
                        }
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        hf8.Q.getClass();
                        ef8.a("UpgradePaywall").h("Failed to validate automatic upgrade entry", exc);
                        t4aVar.$close.invoke();
                    }
                } catch (Exception e2) {
                    e = e2;
                    t4aVar = this;
                    exc = e;
                    hf8.Q.getClass();
                    ef8.a("UpgradePaywall").h("Failed to validate automatic upgrade entry", exc);
                    t4aVar.$close.invoke();
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    jzb.q(obj);
                    t4aVar = this;
                } catch (Exception e3) {
                    exc = e3;
                    t4aVar = this;
                    hf8.Q.getClass();
                    ef8.a("UpgradePaywall").h("Failed to validate automatic upgrade entry", exc);
                    t4aVar.$close.invoke();
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                t4aVar.$close.invoke();
            }
            return wef.a;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t4a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
