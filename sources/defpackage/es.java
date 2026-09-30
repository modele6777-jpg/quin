package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class es implements tu8, yff {
    public final CaptureResult a;
    public final String b;

    public es(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.a = captureResult;
        this.b = str;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        kob kobVar = job.a;
        boolean zEquals = em7Var.equals(kobVar.b(CaptureResult.class));
        CaptureResult captureResult = this.a;
        if (zEquals) {
            captureResult.getClass();
            return captureResult;
        }
        if (!em7Var.equals(kobVar.b(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) ig1.b(this.b)) + ", frameNumber: " + this.a.getFrameNumber() + ')';
    }
}
