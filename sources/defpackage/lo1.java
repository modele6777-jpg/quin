package defpackage;

import android.os.Trace;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lo1 extends gbe implements a26 {
    final /* synthetic */ go1 $captureSession;
    int label;
    final /* synthetic */ qo1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo1(qo1 qo1Var, go1 go1Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = qo1Var;
        this.$captureSession = go1Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        lo1 lo1Var = new lo1(this.this$0, this.$captureSession, (xn2) obj);
        wef wefVar = wef.a;
        lo1Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = this.this$0 + " CameraCaptureSessionWrapper#close";
        go1 go1Var = this.$captureSession;
        qo1 qo1Var = this.this$0;
        try {
            Trace.beginSection(str);
            Log.d("CXCP", "Closing capture session for " + qo1Var);
            ks0.u(go1Var.a);
            return wef.a;
        } finally {
            Trace.endSection();
        }
    }
}
