package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ne4 extends gbe implements l26 {
    final /* synthetic */ String $blockedRequestId;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne4(r0 r0Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$blockedRequestId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ne4(this.this$0, this.$blockedRequestId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                fab fabVar = this.this$0.v;
                this.label = 1;
                Object objB = ((rab) fabVar).b(this);
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
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.this$0.d().c("Refresh quota after follow-up paywall failed", e2);
        }
        String str = this.$blockedRequestId;
        if (str != null) {
            this.this$0.n1(str);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ne4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
