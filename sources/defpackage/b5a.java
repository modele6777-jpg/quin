package defpackage;

import ai.askquin.ui.paywall.upgrade.s;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b5a extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ s $fiveCardUpgradeManager;
    final /* synthetic */ String $readingId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5a(s sVar, String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$fiveCardUpgradeManager = sVar;
        this.$accountId = str;
        this.$readingId = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b5a(this.$fiveCardUpgradeManager, this.$accountId, this.$readingId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                s sVar = this.$fiveCardUpgradeManager;
                String str = this.$accountId;
                String str2 = this.$readingId;
                this.label = 1;
                Object objQ = sVar.q(str, str2, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
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
            ef8.a("UpgradePaywall").h("Failed to persist follow-up paywall exposure", e2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b5a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
