package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h11 extends bl2 {
    public final /* synthetic */ int b = 1;

    public h11(double d) {
        super(Double.valueOf(d));
    }

    @Override // defpackage.bl2
    public final tt7 a(w09 w09Var) {
        switch (this.b) {
            case 0:
                w09Var.getClass();
                xr7 xr7VarF = w09Var.f();
                xr7VarF.getClass();
                return xr7VarF.t(jua.BOOLEAN);
            case 1:
                w09Var.getClass();
                xr7 xr7VarF2 = w09Var.f();
                xr7VarF2.getClass();
                return xr7VarF2.t(jua.DOUBLE);
            default:
                w09Var.getClass();
                xr7 xr7VarF3 = w09Var.f();
                xr7VarF3.getClass();
                return xr7VarF3.t(jua.FLOAT);
        }
    }

    @Override // defpackage.bl2
    public String toString() {
        int i = this.b;
        Object obj = this.a;
        switch (i) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h11(Object obj) {
        super(obj);
    }

    public h11(float f) {
        super(Float.valueOf(f));
    }
}
