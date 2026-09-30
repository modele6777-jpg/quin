package defpackage;

import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vb1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb1(vb1 vb1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = vb1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pb1 pb1Var = new pb1(this.this$0, xn2Var);
        pb1Var.L$0 = obj;
        return pb1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            awa awaVar = (awa) this.L$0;
            ob1 ob1Var = new ob1(awaVar);
            CameraManager cameraManager = (CameraManager) this.this$0.a.get();
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.getClass();
                s.U(cameraManager, (Executor) this.this$0.b.j.getValue(), ob1Var);
            } else {
                cameraManager.registerAvailabilityCallback(ob1Var, this.this$0.b.a());
            }
            v6 v6Var = new v6(28, cameraManager, ob1Var);
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
        return ((pb1) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
