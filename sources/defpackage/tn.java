package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo b;

    public /* synthetic */ tn(mo moVar, int i) {
        this.a = i;
        this.b = moVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        mo moVar = this.b;
        switch (i) {
            case 0:
                Object value = moVar.l.getValue();
                if (value != null) {
                    return value;
                }
                float fJ = moVar.j.j();
                vz9 vz9Var = moVar.g;
                if (Float.isNaN(fJ)) {
                    return vz9Var.getValue();
                }
                float fE = moVar.b().e(vz9Var.getValue());
                if (Float.isNaN(fE) || fJ == fE) {
                    return vz9Var.getValue();
                }
                Object objA = moVar.b().a(fJ);
                return objA == null ? vz9Var.getValue() : objA;
            case 1:
                return moVar.b();
            default:
                return new iy9(moVar.b(), moVar.i.getValue());
        }
    }
}
