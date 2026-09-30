package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gd1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(gd1 gd1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gd1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bd1 bd1Var = new bd1(this.this$0, xn2Var);
        bd1Var.L$0 = obj;
        return bd1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ArrayList arrayList;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            awa awaVar = (awa) this.L$0;
            oc1 oc1Var = new oc1(this.this$0, awaVar);
            CameraManager cameraManager = (CameraManager) this.this$0.a.get();
            cameraManager.registerAvailabilityCallback(oc1Var, this.this$0.b.a());
            gd1 gd1Var = this.this$0;
            synchronized (gd1Var.f) {
                arrayList = gd1Var.g;
            }
            gd1 gd1Var2 = this.this$0;
            if (arrayList != null) {
                gd1Var2.getClass();
                gd1.e(awaVar, arrayList);
            } else {
                ArrayList arrayListD = gd1Var2.d();
                if (arrayListD != null) {
                    this.this$0.getClass();
                    gd1.e(awaVar, arrayListD);
                }
            }
            ad1 ad1Var = new ad1(0, cameraManager, oc1Var);
            this.label = 1;
            if (i7h.k(awaVar, ad1Var, this) == bw2Var) {
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
        return ((bd1) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
