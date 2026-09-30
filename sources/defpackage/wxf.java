package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wxf implements lf1 {
    public final fp a;
    public final Object b = new Object();
    public boolean c;

    public wxf(fp fpVar) {
        this.a = fpVar;
    }

    @Override // defpackage.lf1
    public final CaptureRequest.Builder E(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderE;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    builderE = null;
                } else {
                    builderE = this.a.E(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderE;
    }

    @Override // defpackage.lf1
    public final void F0() {
        this.a.F0();
    }

    @Override // defpackage.lf1
    public final boolean G(InputConfiguration inputConfiguration, ArrayList arrayList, qo1 qo1Var) {
        boolean zG;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    qo1Var.a();
                    zG = false;
                } else {
                    zG = this.a.G(inputConfiguration, arrayList, qo1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zG;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        return this.a.H0(em7Var);
    }

    @Override // defpackage.lf1
    public final boolean L0(v85 v85Var) {
        boolean zL0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    v85Var.g.a();
                    zL0 = false;
                } else {
                    zL0 = this.a.L0(v85Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zL0;
    }

    @Override // defpackage.lf1
    public final void R() {
        this.a.R();
    }

    @Override // defpackage.lf1
    public final boolean U0(ArrayList arrayList, qo1 qo1Var) {
        boolean zU0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    qo1Var.a();
                    zU0 = false;
                } else {
                    zU0 = this.a.U0(arrayList, qo1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zU0;
    }

    @Override // defpackage.ik0
    public final void a(int i) {
        this.a.a(i);
    }

    @Override // defpackage.lf1
    public final boolean g0(d0d d0dVar) {
        boolean zG0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    d0dVar.e.a();
                    zG0 = false;
                } else {
                    zG0 = this.a.g0(d0dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zG0;
    }

    @Override // defpackage.lf1
    public final CaptureRequest.Builder h0(int i) {
        CaptureRequest.Builder builderH0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    builderH0 = null;
                } else {
                    builderH0 = this.a.h0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderH0;
    }

    @Override // defpackage.lf1
    public final boolean l(f47 f47Var, ArrayList arrayList, qo1 qo1Var) {
        boolean zL;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    qo1Var.a();
                    zL = false;
                } else {
                    zL = this.a.l(f47Var, arrayList, qo1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zL;
    }

    @Override // defpackage.lf1
    public final boolean p0(List list, qe1 qe1Var) {
        boolean zP0;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    qe1Var.a();
                    zP0 = false;
                } else {
                    zP0 = this.a.p0(list, qe1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zP0;
    }

    @Override // defpackage.lf1
    public final boolean u(ArrayList arrayList, qo1 qo1Var) {
        boolean zU;
        synchronized (this.b) {
            try {
                if (this.c) {
                    b1.l("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    qo1Var.a();
                    zU = false;
                } else {
                    zU = this.a.u(arrayList, qo1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zU;
    }

    @Override // defpackage.lf1
    public final String x() {
        return this.a.c;
    }
}
