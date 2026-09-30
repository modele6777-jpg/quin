package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dv2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv2 b;

    public /* synthetic */ dv2(fv2 fv2Var, int i) {
        this.a = i;
        this.b = fv2Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        fv2 fv2Var = this.b;
        switch (i) {
            case 0:
                vd0.o0(fv2Var);
                return wefVar;
            case 1:
                fv2Var.K0.e(true);
                break;
            case 2:
                fv2Var.K0.a(true);
                break;
            case 3:
                fv2Var.K0.c();
                break;
            case 4:
                vd0.o0(fv2Var);
                return wefVar;
            case 5:
                fv2Var.K0.o();
                break;
            case 6:
                ou2 ou2Var = fv2Var.H0.w;
                ou2Var.b.r.u(fv2Var.L0.e);
                break;
            default:
                r38 r38Var = fv2Var.H0;
                fo5 fo5Var = fv2Var.M0;
                if (r38Var.b()) {
                    vsd vsdVar = r38Var.c;
                    if (vsdVar != null) {
                        ((dw3) vsdVar).b();
                    }
                } else {
                    fo5.a(fo5Var);
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
