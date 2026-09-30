package defpackage;

import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends gbe implements l26 {
    final /* synthetic */ String $cameraId;
    final /* synthetic */ kp $cameraState;
    int label;
    final /* synthetic */ pj1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(pj1 pj1Var, String str, kp kpVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pj1Var;
        this.$cameraId = str;
        this.$cameraState = kpVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gj1(this.this$0, this.$cameraId, this.$cameraState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    jzb.q(obj);
                    return null;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            a90 a90Var = this.this$0.a;
            String str = this.$cameraId;
            kp kpVar = this.$cameraState;
            this.label = 1;
            a90Var.N(str, kpVar);
            wef wefVar = wef.a;
            bw2 bw2Var = bw2.a;
            if (wefVar == bw2Var) {
                return bw2Var;
            }
            return null;
        } catch (Exception e) {
            b1.n("CXCP", "Failed to open " + ((Object) ig1.b(this.$cameraId)), e);
            kp kpVar2 = this.$cameraState;
            kpVar2.getClass();
            int iA = qk2.A(e);
            if (iA != 0) {
                kpVar2.b(null, new ip(d62.f, new nf1(iA), e, 2));
            }
            qk2.A(e);
            return null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gj1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
