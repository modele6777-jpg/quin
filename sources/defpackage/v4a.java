package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import ai.askquin.ui.paywall.upgrade.s;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v4a extends gbe implements l26 {
    final /* synthetic */ FiveCardUpgradePending $exposure;
    final /* synthetic */ s $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4a(s sVar, FiveCardUpgradePending fiveCardUpgradePending, xn2 xn2Var) {
        super(2, xn2Var);
        this.$manager = sVar;
        this.$exposure = fiveCardUpgradePending;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v4a(this.$manager, this.$exposure, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                s sVar = this.$manager;
                FiveCardUpgradePending fiveCardUpgradePending = this.$exposure;
                this.label = 1;
                Object objN = sVar.n(fiveCardUpgradePending, this);
                bw2 bw2Var = bw2.a;
                if (objN == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            hf8.Q.getClass();
            ef8.a("UpgradePaywall").h("Failed to persist upgrade exposure", e2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v4a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
