package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ge1 implements atb {
    public final LinkedHashMap a = new LinkedHashMap();
    public final ace b = new ace(new jl0(10));
    public volatile Map c = qu4.a;

    public static int c(qtb qtbVar) {
        wde wdeVar = (wde) qtbVar.b(yde.a);
        Object obj = wdeVar != null ? wdeVar.a.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.atb
    public final void E(qtb qtbVar) {
        qtbVar.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                kob kobVar = job.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) qtbVar.H0(kobVar.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(kobVar.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new fe(14, (gk1) he1Var, cameraCaptureSession));
                }
            } else {
                executor.execute(new ce1(he1Var, this, qtbVar, 1));
            }
        }
    }

    @Override // defpackage.atb
    public final void G(qtb qtbVar, long j, long j2) {
        qtbVar.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                CameraCaptureSession cameraCaptureSessionB = b(qtbVar);
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(job.a.b(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new be1((gk1) he1Var, cameraCaptureSessionB, captureRequest, j2, j, 0));
                }
            } else {
                executor.execute(new ce1(he1Var, this, qtbVar, 0));
            }
        }
    }

    @Override // defpackage.atb
    public final void N(qtb qtbVar, int i) {
        qtbVar.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                kob kobVar = job.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) qtbVar.H0(kobVar.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(kobVar.b(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) qtbVar.H0(kobVar.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new ee1((gk1) he1Var, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new fe1(he1Var, this, qtbVar, i));
            }
        }
    }

    @Override // defpackage.atb
    public final void W(qtb qtbVar, long j, es esVar) {
        qtbVar.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                kob kobVar = job.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) qtbVar.H0(kobVar.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(kobVar.b(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) esVar.H0(kobVar.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new ee1((gk1) he1Var, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }

    public final void a(he1 he1Var, vp vpVar) {
        he1Var.getClass();
        vpVar.getClass();
        if (this.c.containsKey(he1Var)) {
            throw new IllegalStateException((he1Var + " was already registered!").toString());
        }
        synchronized (this.a) {
            this.a.put(he1Var, vpVar);
            this.c = bm8.X(this.a);
        }
    }

    public final CameraCaptureSession b(qtb qtbVar) {
        kob kobVar = job.a;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) qtbVar.H0(kobVar.b(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || ((CameraExtensionSession) qtbVar.H0(kobVar.b(qc0.n()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.b.getValue();
    }

    @Override // defpackage.atb
    public final void g0(qtb qtbVar, long j, ptb ptbVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                CameraCaptureSession cameraCaptureSessionB = b(qtbVar);
                kob kobVar = job.a;
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(kobVar.b(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) ptbVar.H0(kobVar.b(CaptureFailure.class));
                if (cameraCaptureSessionB != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new de1((gk1) he1Var, cameraCaptureSessionB, captureRequest, captureFailure, 1));
                }
            } else {
                executor.execute(new c0(he1Var, this, qtbVar, new m8c(16), 4));
            }
        }
    }

    @Override // defpackage.atb
    public final void h(qtb qtbVar, final long j, int i, int i2) {
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                kob kobVar = job.a;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) qtbVar.H0(kobVar.b(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(kobVar.b(CaptureRequest.class));
                final Surface surface = (Surface) qtbVar.W().get(new e3e(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final gk1 gk1Var = (gk1) he1Var;
                    executor.execute(new Runnable() { // from class: zd1
                        @Override // java.lang.Runnable
                        public final void run() {
                            gk1Var.a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.atb
    public final void h0(qtb qtbVar, long j, ds dsVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                CameraCaptureSession cameraCaptureSessionB = b(qtbVar);
                kob kobVar = job.a;
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(kobVar.b(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) dsVar.H0(kobVar.b(TotalCaptureResult.class));
                if (cameraCaptureSessionB != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new de1((gk1) he1Var, cameraCaptureSessionB, captureRequest, totalCaptureResult, 0));
                }
            } else {
                executor.execute(new c0(he1Var, this, qtbVar, new co1(qtbVar, dsVar), 3));
            }
        }
    }

    @Override // defpackage.atb
    public final void k0(ctb ctbVar) {
        ctbVar.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = ctbVar.c.get(yde.a);
            wde wdeVar = obj instanceof wde ? (wde) obj : null;
            Object obj2 = wdeVar != null ? wdeVar.a.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new hw(he1Var, num != null ? num.intValue() : -1, 2));
        }
    }

    @Override // defpackage.atb
    public final void l(qtb qtbVar, long j, long j2) {
        qtbVar.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                kob kobVar = job.a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) qtbVar.H0(kobVar.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(kobVar.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new be1((gk1) he1Var, cameraCaptureSession, captureRequest, j2, j, 1));
                }
            }
        }
    }

    @Override // defpackage.atb
    public final void x(qtb qtbVar, long j) {
        qtbVar.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            he1 he1Var = (he1) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (he1Var instanceof gk1) {
                CameraCaptureSession cameraCaptureSessionB = b(qtbVar);
                CaptureRequest captureRequest = (CaptureRequest) qtbVar.H0(job.a.b(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new ae1((gk1) he1Var, cameraCaptureSessionB, j, 0));
                }
            }
        }
    }
}
