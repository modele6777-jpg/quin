package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vfc {
    public final vfc a;
    public final Object b = new Object();
    public boolean c;
    public gv6 d;

    public vfc(vfc vfcVar) {
        this.a = vfcVar;
    }

    public final void a(gv6 gv6Var) {
        gv6Var.getClass();
        synchronized (this.b) {
            this.c = true;
            this.d = gv6Var;
        }
        vfc vfcVar = this.a;
        if (vfcVar != null) {
            vfcVar.a(new r45(19, this));
        } else {
            b21.v("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    vfc vfcVar = this.a;
                    if (vfcVar != null) {
                        vfcVar.b();
                    } else {
                        b21.v("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    b21.W("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                gv6 gv6Var = this.d;
                if (gv6Var != null) {
                    gv6Var.e();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
