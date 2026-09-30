package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hp implements sf1 {
    public final fp a;
    public final CameraExtensionSession b;
    public final nd1 c;
    public final ft d;
    public final yh0 e;
    public final HashMap f;

    public hp(fp fpVar, CameraExtensionSession cameraExtensionSession, nd1 nd1Var, ft ftVar) {
        nd1Var.getClass();
        this.a = fpVar;
        this.b = cameraExtensionSession;
        this.c = nd1Var;
        this.d = ftVar;
        wh0 wh0Var = ug1.a;
        wh0Var.getClass();
        wh0.b.incrementAndGet(wh0Var);
        yh0 yh0Var = new yh0();
        yh0Var.a = 0L;
        this.e = yh0Var;
        this.f = new HashMap();
    }

    @Override // defpackage.re1
    public final boolean B0() throws Exception {
        wef wefVar;
        String str = this.a.c;
        try {
            this.b.stopRepeating();
            wefVar = wef.a;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            nd1 nd1Var = this.c;
            if (z) {
                b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
                if (reason != 1) {
                    if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                        i = 11;
                    } else {
                        i = 2;
                    }
                }
                nd1Var.a(i, str, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                nd1Var.a(9, str, false);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            wefVar = null;
        }
        return wefVar != null;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(qc0.n()))) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.re1
    public final Integer K(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        String str = this.a.c;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            ft ftVar = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, ftVar, new gp(this, (uc1) captureCallback)) : cameraExtensionSession.capture(captureRequest, ftVar, new gp(this, (uc1) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
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

    @Override // defpackage.re1
    public final Integer K0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        if (arrayList.size() == 1) {
            return O0((CaptureRequest) s72.X0(arrayList), captureCallback);
        }
        qc0.p("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }

    @Override // defpackage.re1
    public final Integer O0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        String str = this.a.c;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            ft ftVar = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, ftVar, new gp(this, (uc1) captureCallback)) : cameraExtensionSession.setRepeatingRequest(captureRequest, ftVar, new gp(this, (uc1) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
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

    @Override // defpackage.re1
    public final Integer Q0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            K((CaptureRequest) it.next(), captureCallback);
        }
        return null;
    }

    @Override // defpackage.re1
    public final boolean b0() {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.b.close();
    }

    @Override // defpackage.re1
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.re1
    public final lf1 m0() {
        return this.a;
    }

    @Override // defpackage.re1
    public final boolean z0(List list) {
        b1.l("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }
}
