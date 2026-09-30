package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class op extends CameraCaptureSession.StateCallback {
    public final fp a;
    public final qe1 b;
    public final nd1 c;
    public final a90 d;
    public final Handler e;
    public final zh0 f;
    public final zh0 g;

    public op(fp fpVar, qe1 qe1Var, g1d g1dVar, nd1 nd1Var, a90 a90Var, Handler handler) {
        nd1Var.getClass();
        handler.getClass();
        this.a = fpVar;
        this.b = qe1Var;
        this.c = nd1Var;
        this.d = a90Var;
        this.e = handler;
        this.f = vpf.o(g1dVar);
        this.g = vpf.o(null);
    }

    public final re1 a(CameraCaptureSession cameraCaptureSession, nd1 nd1Var) {
        re1 re1Var = (re1) this.g.a;
        if (re1Var != null) {
            return re1Var;
        }
        Handler handler = this.e;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        fp fpVar = this.a;
        re1 epVar = z ? new ep(fpVar, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, nd1Var, handler) : new dp(fpVar, cameraCaptureSession, nd1Var, handler);
        if (this.g.a(null, epVar)) {
            return epVar;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (re1) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.c(a(cameraCaptureSession, this.c));
        a90 a90Var = this.d;
        if (a90Var != null) {
            this.a.c.getClass();
            Iterator it = ((List) ((zh0) a90Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((hpb) a90Var.b);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.f(a(cameraCaptureSession, this.c));
        a90 a90Var = this.d;
        if (a90Var != null) {
            this.a.c.getClass();
            hpb hpbVar = (hpb) a90Var.b;
            Iterator it = ((List) ((zh0) a90Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(hpbVar);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        nd1 nd1Var = this.c;
        a(cameraCaptureSession, nd1Var);
        re1 re1VarA = a(cameraCaptureSession, nd1Var);
        qe1 qe1Var = this.b;
        qe1Var.d(re1VarA);
        g1d g1dVar = (g1d) zh0.b.getAndSet(this.f, null);
        if (g1dVar != null) {
            g1dVar.a();
        }
        qe1Var.a();
        a90 a90Var = this.d;
        if (a90Var != null) {
            a90Var.I(this.a.c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        re1 re1VarA = a(cameraCaptureSession, this.c);
        qe1 qe1Var = this.b;
        qe1Var.h(re1VarA);
        g1d g1dVar = (g1d) zh0.b.getAndSet(this.f, null);
        if (g1dVar != null) {
            g1dVar.a();
        }
        qe1Var.a();
        a90 a90Var = this.d;
        if (a90Var != null) {
            a90Var.J(this.a.c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.b.g(a(cameraCaptureSession, this.c));
        g1d g1dVar = (g1d) zh0.b.getAndSet(this.f, null);
        if (g1dVar != null) {
            g1dVar.a();
        }
        a90 a90Var = this.d;
        if (a90Var != null) {
            a90Var.K(this.a.c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.e(a(cameraCaptureSession, this.c));
        a90 a90Var = this.d;
        if (a90Var != null) {
            this.a.c.getClass();
            Iterator it = ((List) ((zh0) a90Var.c).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((hpb) a90Var.b);
            }
        }
    }
}
