package defpackage;

import android.hardware.camera2.CaptureFailure;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class np implements ptb {
    public final CaptureFailure a;
    public final int b;
    public final boolean c;

    public np(qtb qtbVar, CaptureFailure captureFailure) {
        qtbVar.getClass();
        this.a = captureFailure;
        captureFailure.getFrameNumber();
        this.b = captureFailure.getReason();
        this.c = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(CaptureFailure.class))) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.ptb
    public final boolean N() {
        return this.c;
    }

    @Override // defpackage.ptb
    public final int U() {
        return this.b;
    }
}
