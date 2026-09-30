package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xr extends CameraExtensionSession$StateCallback {
    public final fp a;
    public final w85 b;
    public final nd1 c;
    public final a90 d;
    public final ft e;
    public final zh0 f;
    public final zh0 g;

    public xr(fp fpVar, w85 w85Var, g1d g1dVar, nd1 nd1Var, a90 a90Var, ft ftVar) {
        nd1Var.getClass();
        this.a = fpVar;
        this.b = w85Var;
        this.c = nd1Var;
        this.d = a90Var;
        this.e = ftVar;
        this.f = vpf.o(g1dVar);
        this.g = vpf.o(null);
    }

    public final sf1 a(CameraExtensionSession cameraExtensionSession, nd1 nd1Var) {
        sf1 sf1Var = (sf1) this.g.a;
        if (sf1Var != null) {
            return sf1Var;
        }
        hp hpVar = new hp(this.a, cameraExtensionSession, nd1Var, this.e);
        if (this.g.a(null, hpVar)) {
            return hpVar;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (sf1) obj;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) throws Exception {
        cameraExtensionSession.getClass();
        nd1 nd1Var = this.c;
        a(cameraExtensionSession, nd1Var);
        sf1 sf1VarA = a(cameraExtensionSession, nd1Var);
        w85 w85Var = this.b;
        w85Var.a.d(sf1VarA);
        g1d g1dVar = (g1d) zh0.b.getAndSet(this.f, null);
        if (g1dVar != null) {
            g1dVar.a();
        }
        w85Var.a();
        a90 a90Var = this.d;
        if (a90Var != null) {
            a90Var.I(this.a.c);
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) throws Exception {
        cameraExtensionSession.getClass();
        sf1 sf1VarA = a(cameraExtensionSession, this.c);
        w85 w85Var = this.b;
        w85Var.a.h(sf1VarA);
        g1d g1dVar = (g1d) zh0.b.getAndSet(this.f, null);
        if (g1dVar != null) {
            g1dVar.a();
        }
        w85Var.a();
        a90 a90Var = this.d;
        if (a90Var != null) {
            a90Var.J(this.a.c);
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        this.b.a.g(a(cameraExtensionSession, this.c));
        g1d g1dVar = (g1d) zh0.b.getAndSet(this.f, null);
        if (g1dVar != null) {
            g1dVar.a();
        }
        a90 a90Var = this.d;
        if (a90Var != null) {
            a90Var.K(this.a.c);
        }
    }
}
