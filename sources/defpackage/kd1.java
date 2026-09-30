package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kd1 implements hd1 {
    public final qwe a;
    public final sd1 b;
    public final xzb c;

    public kd1(qwe qweVar, sd1 sd1Var, xzb xzbVar) {
        qweVar.getClass();
        sd1Var.getClass();
        xzbVar.getClass();
        this.a = qweVar;
        this.b = sd1Var;
        this.c = xzbVar;
    }

    public static void c(lf1 lf1Var) throws InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        sh0 sh0VarM = vpf.m(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (lf1Var.p0(t72.H(surface), new jd1(countDownLatch, sh0VarM, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        b1.d("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (sh0VarM.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    public final void a(lf1 lf1Var, CameraDevice cameraDevice, kp kpVar, lk0 lk0Var, boolean z, boolean z2) {
        tr0 tr0Var;
        lk0Var.getClass();
        iy9 iy9Var = null;
        CameraDevice cameraDevice2 = lf1Var != null ? (CameraDevice) lf1Var.H0(job.a.b(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                b(cameraDevice, kpVar);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        id.getClass();
        ig1.a(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder sbP = tec.p("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            sbP.append(cameraDevice.getId());
            sbP.append('!');
            throw new IllegalStateException(sbP.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            lf1Var.getClass();
            if (i >= 30) {
                lk0Var.e.remove(lf1Var);
            }
        }
        Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
        String strX = lf1Var.x();
        if (z) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                Log.d("CXCP", "Reopening camera device");
                b(cameraDevice2, kpVar);
                tr0Var = this.c.a(strX, this);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            tr0Var = new tr0(lf1Var, kpVar);
        }
        lf1 lf1Var2 = tr0Var.a;
        kp kpVar2 = tr0Var.b;
        if (lf1Var2 == null || kpVar2 == null) {
            b1.d("CXCP", "Failed to retain an opened camera device!");
        } else {
            if (z2) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) ig1.b(strX)));
                    c(lf1Var2);
                    Log.d("CXCP", "Created an empty capture session.");
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            iy9Var = new iy9(lf1Var2, kpVar2);
        }
        if (iy9Var == null) {
            b1.d("CXCP", "Failed to handle quirks before closing the camera device!");
            lf1Var.R();
            lf1Var.F0();
            kpVar.d(cameraDevice2);
            return;
        }
        lf1 lf1Var3 = (lf1) iy9Var.a();
        kp kpVar3 = (kp) iy9Var.b();
        Object objH0 = lf1Var3.H0(job.a.b(CameraDevice.class));
        if (objH0 == null) {
            qc0.p("Required value was null.");
            return;
        }
        lf1Var.R();
        b((CameraDevice) objH0, kpVar3);
        lf1Var.F0();
        if (z) {
            kpVar.d(cameraDevice2);
        }
    }

    public final void b(CameraDevice cameraDevice, kp kpVar) {
        String id = cameraDevice.getId();
        id.getClass();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        imb imbVar = new imb();
        if (((wef) this.a.b(7000L, new id1(cameraDevice, imbVar, null))) == null) {
            b1.d("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        id2.getClass();
        ig1.a(id2);
        sd1 sd1Var = this.b;
        sd1Var.getClass();
        sd1Var.b.getClass();
        xg1 xg1Var = yg1.o;
        yg1 yg1VarA = ((qd1) sd1Var.a).a(id2);
        xg1Var.getClass();
        if (xg1.c(yg1VarA) && imbVar.element) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) ig1.b(id2)));
            if (kpVar.r.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) ig1.b(id2)));
            } else {
                b1.l("CXCP", "Failed to close " + ((Object) ig1.b(id2)) + " after 2000ms!");
            }
        }
    }
}
