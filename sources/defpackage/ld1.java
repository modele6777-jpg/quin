package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ld1 implements md1 {
    public final CameraDevice.CameraDeviceSetup a;
    public final String b;
    public final nd1 c;

    public ld1(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, nd1 nd1Var) {
        str.getClass();
        nd1Var.getClass();
        this.a = cameraDeviceSetup;
        this.b = str;
        this.c = nd1Var;
    }

    public final CaptureRequest.Builder a(int i) throws Exception {
        try {
            return this.a.createCaptureRequest(i);
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            String str = this.b;
            nd1 nd1Var = this.c;
            if (!z) {
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
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            nd1Var.a(i2, str, true);
            return null;
        }
    }
}
