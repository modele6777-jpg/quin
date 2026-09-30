package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ep extends dp {
    public final CameraConstrainedHighSpeedCaptureSession e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(fp fpVar, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, nd1 nd1Var, Handler handler) {
        super(fpVar, cameraConstrainedHighSpeedCaptureSession, nd1Var, handler);
        nd1Var.getClass();
        handler.getClass();
        this.e = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.dp, defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        return em7Var.equals(job.a.b(CameraConstrainedHighSpeedCaptureSession.class)) ? this.e : super.H0(em7Var);
    }
}
