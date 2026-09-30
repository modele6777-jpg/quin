package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l08 implements k08 {
    public final /* synthetic */ yx9 a;
    public final /* synthetic */ boolean b;

    public l08(yx9 yx9Var, boolean z) {
        this.a = yx9Var;
        this.b = z;
    }

    @Override // defpackage.k08
    public final int a() {
        yx9 yx9Var = this.a;
        return (int) (yx9Var.k().e == ks9.a ? yx9Var.k().i() & 4294967295L : yx9Var.k().i() >> 32);
    }

    @Override // defpackage.k08
    public final float b() {
        return kn2.D(this.a);
    }

    @Override // defpackage.k08
    public final int c() {
        yx9 yx9Var = this.a;
        return (-yx9Var.k().f) + yx9Var.k().d;
    }

    @Override // defpackage.k08
    public final float d() {
        yx9 yx9Var = this.a;
        return ay9.a(yx9Var.k(), yx9Var.l());
    }

    @Override // defpackage.k08
    public final p72 e() {
        boolean z = this.b;
        yx9 yx9Var = this.a;
        return z ? new p72(yx9Var.l(), 1) : new p72(1, yx9Var.l());
    }

    @Override // defpackage.k08
    public final Object f(int i, q08 q08Var) {
        Object objS = yx9.s(this.a, i, q08Var);
        return objS == bw2.a ? objS : wef.a;
    }
}
