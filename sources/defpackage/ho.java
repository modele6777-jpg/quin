package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ho {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ mo d;

    public ho(mo moVar) {
        this.d = moVar;
    }

    public final void a(float f, float f2) {
        mo moVar = this.d;
        vz9 vz9Var = moVar.g;
        qz9 qz9Var = moVar.j;
        float fJ = qz9Var.j();
        qz9Var.k(f);
        moVar.k.k(f2);
        if (Float.isNaN(fJ)) {
            return;
        }
        boolean z = f >= fJ;
        if (qz9Var.j() == moVar.b().e(vz9Var.getValue())) {
            Object objB = moVar.b().b(qz9Var.j() + (z ? 1.0f : -1.0f), z);
            if (objB == null) {
                objB = vz9Var.getValue();
            }
            if (z) {
                this.a = vz9Var.getValue();
                this.b = objB;
            } else {
                this.a = objB;
                this.b = vz9Var.getValue();
            }
        } else {
            Object objB2 = moVar.b().b(qz9Var.j(), false);
            if (objB2 == null) {
                objB2 = vz9Var.getValue();
            }
            Object objB3 = moVar.b().b(qz9Var.j(), true);
            if (objB3 == null) {
                objB3 = vz9Var.getValue();
            }
            this.a = objB2;
            this.b = objB3;
        }
        hq3 hq3VarB = moVar.b();
        Object obj = this.a;
        obj.getClass();
        float fE = hq3VarB.e(obj);
        hq3 hq3VarB2 = moVar.b();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(fE - hq3VarB2.e(obj2));
        if (Math.abs(qz9Var.j() - moVar.b().e(vz9Var.getValue())) >= this.c / 2.0f) {
            Object value = z ? this.b : this.a;
            if (value == null) {
                value = vz9Var.getValue();
            }
            if (((Boolean) moVar.a.d(value)).booleanValue()) {
                vz9Var.setValue(value);
            }
        }
    }
}
