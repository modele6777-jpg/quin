package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xb1 implements atb {
    public final Object a = new Object();
    public final Object b = new Object();
    public vd9 c = new vd9(8);
    public za2 d;
    public za2 e;

    public final za2 a(ajf ajfVar, boolean z) {
        od1 od1VarG;
        za2 za2Var = new za2();
        synchronized (this.a) {
            od1VarG = this.c.g();
        }
        synchronized (this.b) {
            try {
                if (ajfVar != null) {
                    za2 za2Var2 = this.d;
                    if (z) {
                        if (za2Var2 != null) {
                            za2Var2.i0(new ye1("Camera2CameraControl was updated with new options."));
                        }
                    } else if (za2Var2 != null) {
                        lmg.o0(za2Var, za2Var2);
                    }
                    this.d = za2Var;
                    ajfVar.i(od1VarG, bm8.G(new iy9("Camera2CameraControl.tag", Integer.valueOf(za2Var.hashCode()))));
                } else {
                    za2 za2Var3 = this.e;
                    if (za2Var3 != null) {
                        za2Var3.i0(new ye1("Camera2CameraControl was updated with new options."));
                    }
                    this.e = za2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return za2Var;
    }

    @Override // defpackage.atb
    public final void h0(qtb qtbVar, long j, ds dsVar) {
        synchronized (this.b) {
            za2 za2Var = this.d;
            if (za2Var != null) {
                if (pa7.t(((wde) qtbVar.a(yde.a, wde.b)).a.get("Camera2CameraControl.tag"), Integer.valueOf(za2Var.hashCode()))) {
                    za2Var.R(null);
                    this.d = null;
                    za2 za2Var2 = this.e;
                    if (za2Var2 != null) {
                        za2Var2.R(null);
                        this.e = null;
                    }
                }
            }
        }
    }
}
