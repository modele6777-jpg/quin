package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class od1 extends ssg {
    public static final no0 d;
    public static final no0 e;
    public static final no0 f;
    public static final no0 g;
    public static final no0 v;
    public static final no0 w;
    public static final no0 x;

    static {
        Class cls = Integer.TYPE;
        cls.getClass();
        d = new no0("camera2.captureRequest.templateType", cls, null);
        e = new no0("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        f = new no0("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        g = new no0("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        Class cls2 = Long.TYPE;
        cls2.getClass();
        v = new no0("camera2.cameraCaptureSession.streamUseCase", cls2, null);
        w = new no0("camera2.cameraCaptureSession.streamUseHint", cls2, null);
        x = new no0("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
