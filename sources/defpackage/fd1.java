package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fd1 extends gbe implements l26 {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ gd1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(String str, gd1 gd1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cameraId = str;
        this.this$0 = gd1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fd1(this.$cameraId, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        Boolean boolValueOf;
        int i;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        int i2;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = this.$cameraId;
        gd1 gd1Var = this.this$0;
        nd1 nd1Var = gd1Var.c;
        try {
            boolValueOf = Boolean.valueOf(((CameraManager) gd1Var.a.get()).isCameraDeviceSetupSupported(str));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason == 1) {
                    i = 3;
                } else if (reason == 2) {
                    i = 6;
                } else if (reason == 3) {
                    i = 0;
                } else if (reason == 4) {
                    i = 1;
                } else if (reason != 5) {
                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i = 11;
                } else {
                    i = 2;
                }
                nd1Var.a(i, str, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                nd1Var.a(9, str, false);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            boolValueOf = null;
        }
        if (!pa7.t(boolValueOf, Boolean.TRUE)) {
            return null;
        }
        Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) ig1.b(this.$cameraId)));
        String str2 = this.$cameraId;
        gd1 gd1Var2 = this.this$0;
        nd1 nd1Var2 = gd1Var2.c;
        try {
            cameraDeviceSetup = ((CameraManager) gd1Var2.a.get()).getCameraDeviceSetup(str2);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                int reason2 = cameraAccessException2.getReason();
                if (reason2 == 1) {
                    i2 = 3;
                } else if (reason2 == 2) {
                    i2 = 6;
                } else if (reason2 == 3) {
                    i2 = 0;
                } else if (reason2 == 4) {
                    i2 = 1;
                } else if (reason2 != 5) {
                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
                nd1Var2.a(i2, str2, true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                nd1Var2.a(9, str2, false);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new ld1(cameraDeviceSetup, this.$cameraId, this.this$0.c);
        }
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fd1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
