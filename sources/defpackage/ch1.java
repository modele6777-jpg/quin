package defpackage;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ch1 {
    public final CameraDevice.StateCallback a;
    public final a90 b;
    public final er4 c;

    public ch1(CameraDevice.StateCallback stateCallback, a90 a90Var, er4 er4Var) {
        this.a = stateCallback;
        this.b = a90Var;
        this.c = er4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch1)) {
            return false;
        }
        ch1 ch1Var = (ch1) obj;
        return pa7.t(this.a, ch1Var.a) && pa7.t(this.b, ch1Var.b) && pa7.t(this.c, ch1Var.c);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.a;
        int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        a90 a90Var = this.b;
        int iHashCode2 = (iHashCode + (a90Var == null ? 0 : a90Var.hashCode())) * 31;
        er4 er4Var = this.c;
        return iHashCode2 + (er4Var != null ? Long.hashCode(er4Var.a) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.a + ", cameraCaptureSessionListener=" + this.b + ", cameraOpenRetryMaxTimeoutNs=" + this.c + ')';
    }
}
