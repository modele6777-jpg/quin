package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo b;

    public /* synthetic */ sn(lo loVar, int i) {
        this.a = i;
        this.b = loVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        lo loVar = this.b;
        switch (i) {
            case 0:
                Object value = loVar.k.getValue();
                if (value != null) {
                    return value;
                }
                float fJ = loVar.i.j();
                boolean zIsNaN = Float.isNaN(fJ);
                vz9 vz9Var = loVar.g;
                return !zIsNaN ? loVar.c(fJ, 0.0f, vz9Var.getValue()) : vz9Var.getValue();
            case 1:
                Object value2 = loVar.k.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fJ2 = loVar.i.j();
                boolean zIsNaN2 = Float.isNaN(fJ2);
                vz9 vz9Var2 = loVar.g;
                if (zIsNaN2) {
                    return vz9Var2.getValue();
                }
                Object value3 = vz9Var2.getValue();
                jl8 jl8VarD = loVar.d();
                float fD = jl8VarD.d(value3);
                if (fD != fJ2 && !Float.isNaN(fD)) {
                    if (fD < fJ2) {
                        Object objB = jl8VarD.b(fJ2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = jl8VarD.b(fJ2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value3;
            case 2:
                return loVar.d();
            default:
                return new iy9(loVar.d(), loVar.h.getValue());
        }
    }
}
