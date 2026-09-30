package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 extends gbe implements l26 {
    final /* synthetic */ String $cameraId;
    final /* synthetic */ mmb $cameraOpenDeferred;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(mmb mmbVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cameraOpenDeferred = mmbVar;
        this.$cameraId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hj1 hj1Var = new hj1(this.$cameraOpenDeferred, this.$cameraId, xn2Var);
        hj1Var.L$0 = obj;
        return hj1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        eq9 eq9Var = (eq9) this.L$0;
        Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) ig1.b(this.$cameraId)) + " returned");
        this.$cameraOpenDeferred.element = null;
        return eq9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hj1) k((xn2) obj2, (eq9) obj)).r(wef.a);
    }
}
