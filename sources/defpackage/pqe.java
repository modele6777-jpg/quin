package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pqe {
    public static final vea g = i7h.B(new mle(27), new ule(8));
    public final qz9 a;
    public final qz9 b = new qz9(0.0f);
    public final sz9 c = new sz9(0);
    public hkb d = hkb.e;
    public long e = eue.b;
    public final vz9 f;

    public pqe(ks9 ks9Var, float f) {
        this.a = new qz9(f);
        this.f = new vz9(ks9Var, i8c.f);
    }

    public final void a(ks9 ks9Var, hkb hkbVar, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.k(f2);
        float f3 = hkbVar.a;
        float f4 = hkbVar.b;
        hkb hkbVar2 = this.d;
        float f5 = hkbVar2.a;
        qz9 qz9Var = this.a;
        if (f3 != f5 || f4 != hkbVar2.b) {
            boolean z = ks9Var == ks9.a;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? hkbVar.d : hkbVar.c;
            float fJ = qz9Var.j();
            float f7 = i;
            float f8 = fJ + f7;
            if (f6 <= f8 && (f3 >= fJ || f6 - f3 <= f7)) {
                f = (f3 >= fJ || f6 - f3 > f7) ? 0.0f : f3 - fJ;
            } else {
                f = f6 - f8;
            }
            qz9Var.k(qz9Var.j() + f);
            this.d = hkbVar;
        }
        qz9Var.k(mh3.n(qz9Var.j(), 0.0f, f2));
        this.c.k(i);
    }
}
