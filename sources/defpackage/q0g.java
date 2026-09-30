package defpackage;

import ai.askquin.ui.web.WebViewActivity;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q0g extends gbe implements l26 {
    final /* synthetic */ a26 $onComplete;
    Object L$0;
    int label;
    final /* synthetic */ WebViewActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0g(WebViewActivity webViewActivity, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = webViewActivity;
        this.$onComplete = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q0g(this.this$0, this.$onComplete, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        imb imbVar = this.label;
        ya0 ya0Var = null;
        try {
            if (imbVar == 0) {
                jzb.q(obj);
                imb imbVar2 = new imb();
                WebViewActivity webViewActivity = this.this$0;
                int i = WebViewActivity.T0;
                za0 za0Var = (za0) webViewActivity.R0.getValue();
                WebViewActivity webViewActivity2 = this.this$0;
                p0g p0gVar = new p0g(0, imbVar2, this.$onComplete);
                this.L$0 = imbVar2;
                this.label = 1;
                obj = ((lc6) za0Var).a(webViewActivity2, p0gVar, this);
                bw2 bw2Var = bw2.a;
                imbVar = imbVar2;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (imbVar != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                imb imbVar3 = (imb) this.L$0;
                jzb.q(obj);
                imbVar = imbVar3;
            }
            ya0Var = (ya0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        if (!imbVar.element) {
            this.$onComplete.d(ya0Var);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((q0g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
