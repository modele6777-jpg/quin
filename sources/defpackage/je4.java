package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class je4 extends gbe implements l26 {
    final /* synthetic */ String $trimmedQuestion;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je4(r0 r0Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$trimmedQuestion = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new je4(this.this$0, this.$trimmedQuestion, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        r0 r0Var;
        r0 r0Var2;
        boolean zBooleanValue;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                r0Var = this.this$0;
                try {
                    yt6 yt6Var = r0Var.d;
                    String str = this.$trimmedQuestion;
                    this.L$0 = r0Var;
                    this.L$1 = r0Var;
                    this.label = 1;
                    obj = ((uke) yt6Var).c(str, this);
                    bw2 bw2Var = bw2.a;
                    if (obj == bw2Var) {
                        return bw2Var;
                    }
                    r0Var2 = r0Var;
                } catch (Exception e) {
                    e = e;
                    r0Var2 = r0Var;
                    this.this$0.d().c("decision-check failed", e);
                    zBooleanValue = false;
                    r0Var = r0Var2;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var = (r0) this.L$1;
                r0Var2 = (r0) this.L$0;
                try {
                    jzb.q(obj);
                } catch (Exception e2) {
                    e = e2;
                    this.this$0.d().c("decision-check failed", e);
                    zBooleanValue = false;
                    r0Var = r0Var2;
                }
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.this$0.d().e("decision-check result: isDecision=" + zBooleanValue + ", questionLength=" + this.$trimmedQuestion.length());
            int i2 = r0.j2;
            r0Var.E1.setValue(Boolean.valueOf(zBooleanValue));
            return wef.a;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((je4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
