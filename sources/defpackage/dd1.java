package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 extends gbe implements l26 {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ gd1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd1(String str, gd1 gd1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cameraId = str;
        this.this$0 = gd1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dd1(this.$cameraId, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) ig1.b(this.$cameraId)));
        String str = this.$cameraId;
        gd1 gd1Var = this.this$0;
        nd1 nd1Var = gd1Var.c;
        try {
            kf1 kf1Var = (kf1) gd1Var.l.getValue();
            kf1Var.getClass();
            ArrayList arrayList = new ArrayList();
            ic1 ic1Var = kf1Var.a;
            if (ic1Var != null) {
                arrayList.add(new hc1(ic1Var.a, str));
            }
            ic1 ic1Var2 = kf1Var.b;
            if (ic1Var2 != null) {
                try {
                    arrayList.add(new hc1(ic1Var2.a, str));
                } catch (UnsupportedOperationException unused) {
                }
            }
            return new vh(arrayList);
        } catch (Exception e) {
            int i = 0;
            if (!(e instanceof CameraAccessException)) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                nd1Var.a(9, str, false);
                return null;
            }
            b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i = 3;
            } else if (reason == 2) {
                i = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i = 1;
                } else if (reason != 5) {
                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i = 11;
                } else {
                    i = 2;
                }
            }
            nd1Var.a(i, str, true);
            return null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dd1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
