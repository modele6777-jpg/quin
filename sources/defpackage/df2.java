package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class df2 extends gbe implements l26 {
    final /* synthetic */ Rect $captureArea;
    final /* synthetic */ Consumer<Rect> $onComplete;
    final /* synthetic */ ScrollCaptureSession $session;
    int label;
    final /* synthetic */ gf2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df2(gf2 gf2Var, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gf2Var;
        this.$session = scrollCaptureSession;
        this.$captureArea = rect;
        this.$onComplete = consumer;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new df2(this.this$0, this.$session, this.$captureArea, this.$onComplete, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gf2 gf2Var = this.this$0;
            ScrollCaptureSession scrollCaptureSession = this.$session;
            Rect rect = this.$captureArea;
            a77 a77Var = new a77(rect.left, rect.top, rect.right, rect.bottom);
            this.label = 1;
            obj = gf2Var.a(scrollCaptureSession, a77Var, this);
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
        this.$onComplete.accept(ynb.j0((a77) obj));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((df2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
