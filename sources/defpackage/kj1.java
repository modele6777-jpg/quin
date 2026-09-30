package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 extends gbe implements a26 {
    final /* synthetic */ mmb $cameraOpenCancelJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj1(mmb mmbVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$cameraOpenCancelJob = mmbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new kj1(this.$cameraOpenCancelJob, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
        this.$cameraOpenCancelJob.element = null;
        return new eq9(null, new nf1(13), 1);
    }
}
