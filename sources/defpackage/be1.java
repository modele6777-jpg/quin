package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk1 b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ be1(gk1 gk1Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, int i) {
        this.a = i;
        this.b = gk1Var;
        this.c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        gk1 gk1Var = this.b;
        switch (i) {
            case 0:
                gk1Var.a.onCaptureStarted(this.c, this.d, this.e, this.f);
                break;
            default:
                hgc.K(gk1Var.a, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
