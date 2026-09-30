package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends gbe implements a26 {
    final /* synthetic */ mmb $cameraOpenDeferred;
    final /* synthetic */ kp $cameraState;
    final /* synthetic */ mmb $timeoutJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj1(mmb mmbVar, mmb mmbVar2, kp kpVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$timeoutJob = mmbVar;
        this.$cameraOpenDeferred = mmbVar2;
        this.$cameraState = kpVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new jj1(this.$timeoutJob, this.$cameraOpenDeferred, this.$cameraState, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
        this.$timeoutJob.element = null;
        if (this.$cameraOpenDeferred.element == null) {
            return null;
        }
        b1.d("CXCP", "tryOpenCamera: openCamera() timed out");
        this.$cameraState.a();
        return new eq9(null, new nf1(13), 1);
    }
}
