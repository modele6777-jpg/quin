package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gx9 implements zy7 {
    public final yx9 a;
    public final int b;

    public gx9(yx9 yx9Var, int i) {
        this.a = yx9Var;
        this.b = i;
    }

    @Override // defpackage.zy7
    public final int a() {
        return this.a.l();
    }

    @Override // defpackage.zy7
    public final int b() {
        yx9 yx9Var = this.a;
        return Math.min(yx9Var.l() - 1, ((ao8) s72.F0(yx9Var.k().a)).a + this.b);
    }

    @Override // defpackage.zy7
    public final int c() {
        int i;
        yx9 yx9Var = this.a;
        if (yx9Var.k().a.size() == 0) {
            return 0;
        }
        int iA = xo1.A(yx9Var.k());
        int i2 = yx9Var.k().b + yx9Var.k().c;
        if (i2 != 0 && (i = iA / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.zy7
    public final boolean d() {
        return !this.a.k().a.isEmpty();
    }

    @Override // defpackage.zy7
    public final int e() {
        return Math.max(0, this.a.e - this.b);
    }
}
