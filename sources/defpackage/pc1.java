package defpackage;

import android.hardware.camera2.CameraManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pc1 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rc1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc1(rc1 rc1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rc1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pc1 pc1Var = new pc1(this.this$0, xn2Var);
        pc1Var.L$0 = obj;
        return pc1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            awa awaVar = (awa) this.L$0;
            oc1 oc1Var = new oc1(awaVar, this.this$0);
            int i2 = Build.VERSION.SDK_INT;
            rc1 rc1Var = this.this$0;
            if (i2 >= 28) {
                CameraManager cameraManager = rc1Var.c;
                cameraManager.getClass();
                s.U(cameraManager, this.this$0.a.g, oc1Var);
            } else {
                rc1Var.c.registerAvailabilityCallback(oc1Var, rc1Var.a.a());
            }
            v6 v6Var = new v6(29, this.this$0, oc1Var);
            this.label = 1;
            Object objK = i7h.k(awaVar, v6Var, this);
            bw2 bw2Var = bw2.a;
            if (objK == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pc1) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
