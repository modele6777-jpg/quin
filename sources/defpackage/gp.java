package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends CameraExtensionSession$ExtensionCaptureCallback {
    public final /* synthetic */ int a;
    public final uc1 b;
    public final /* synthetic */ hp c;
    public final Serializable d;

    public gp(hp hpVar, uc1 uc1Var) {
        this.a = 0;
        this.c = hpVar;
        this.b = uc1Var;
        this.d = new ConcurrentLinkedQueue();
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.a;
        uc1 uc1Var = this.b;
        Serializable serializable = this.d;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i) {
            case 0:
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    hp hpVar = this.c;
                    long jIncrementAndGet = yh0.b.incrementAndGet(hpVar.e);
                    hpVar.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) serializable).remove();
                objRemove.getClass();
                uc1Var.d(captureRequest, ((Number) objRemove).longValue());
                break;
            default:
                Object obj = ((LinkedHashMap) serializable).get(captureRequest);
                obj.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                if (((List) obj).size() != 1) {
                    StringBuilder sb = new StringBuilder("onCaptureFailed is not triggered for repeating requests. Request frame numbers: ");
                    Object obj2 = linkedHashMap.get(captureRequest);
                    obj2.getClass();
                    sb.append(((List) obj2).stream());
                    Log.i("CXCP", sb.toString());
                } else {
                    Object obj3 = linkedHashMap.get(captureRequest);
                    obj3.getClass();
                    uc1Var.d(captureRequest, ((Number) ((List) obj3).get(0)).longValue());
                }
                break;
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        int i2 = this.a;
        uc1 uc1Var = this.b;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i2) {
            case 0:
                uc1Var.e(captureRequest, i);
                break;
            default:
                uc1Var.e(captureRequest, i);
                break;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                cameraExtensionSession.getClass();
                captureRequest.getClass();
                totalCaptureResult.getClass();
                Serializable serializable = this.d;
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    hp hpVar = this.c;
                    long jIncrementAndGet = yh0.b.incrementAndGet(hpVar.e);
                    hpVar.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) serializable).remove();
                objRemove.getClass();
                this.b.c(captureRequest, totalCaptureResult, ((Number) objRemove).longValue());
                break;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                break;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        int i2 = this.a;
        uc1 uc1Var = this.b;
        cameraExtensionSession.getClass();
        switch (i2) {
            case 0:
                uc1Var.f(i);
                break;
            default:
                uc1Var.f(i);
                break;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        int i2 = this.a;
        uc1 uc1Var = this.b;
        hp hpVar = this.c;
        cameraExtensionSession.getClass();
        switch (i2) {
            case 0:
                Long l = (Long) hpVar.f.get(cameraExtensionSession);
                l.getClass();
                uc1Var.g(i, l.longValue());
                break;
            default:
                Long l2 = (Long) hpVar.f.get(cameraExtensionSession);
                l2.getClass();
                uc1Var.g(i, l2.longValue());
                break;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        int i = this.a;
        Serializable serializable = this.d;
        hp hpVar = this.c;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (i) {
            case 0:
                long jIncrementAndGet = yh0.b.incrementAndGet(hpVar.e);
                hpVar.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                this.b.h(captureRequest, jIncrementAndGet, j);
                break;
            default:
                long jIncrementAndGet2 = yh0.b.incrementAndGet(hpVar.e);
                hpVar.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                Object arrayList = linkedHashMap.get(captureRequest);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(captureRequest, arrayList);
                }
                ((List) arrayList).add(Long.valueOf(jIncrementAndGet2));
                this.b.h(captureRequest, jIncrementAndGet2, j);
                break;
        }
    }

    public gp(hp hpVar, uc1 uc1Var, LinkedHashMap linkedHashMap) {
        this.a = 1;
        this.c = hpVar;
        this.b = uc1Var;
        this.d = linkedHashMap;
    }
}
