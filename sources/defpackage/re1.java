package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface re1 extends yff, AutoCloseable {
    boolean B0();

    Integer K(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer K0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    Integer O0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer Q0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    boolean b0();

    Surface getInputSurface();

    lf1 m0();

    boolean z0(List list);
}
