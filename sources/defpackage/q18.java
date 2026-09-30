package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q18 implements k08 {
    public final /* synthetic */ jx7 a;

    public q18(jx7 jx7Var) {
        this.a = jx7Var;
    }

    @Override // defpackage.k08
    public final int a() {
        jx7 jx7Var = this.a;
        return (int) (jx7Var.g().r == ks9.a ? jx7Var.g().i() & 4294967295L : jx7Var.g().i() >> 32);
    }

    @Override // defpackage.k08
    public final float b() {
        jx7 jx7Var = this.a;
        return (jx7Var.d.b.j() * 500) + jx7Var.d.c.j();
    }

    @Override // defpackage.k08
    public final int c() {
        jx7 jx7Var = this.a;
        return (-jx7Var.g().o) + jx7Var.g().s;
    }

    @Override // defpackage.k08
    public final float d() {
        jx7 jx7Var = this.a;
        int iJ = jx7Var.d.b.j();
        int iJ2 = jx7Var.d.c.j();
        return jx7Var.d() ? (iJ * 500) + iJ2 + 100.0f : (iJ * 500) + iJ2;
    }

    @Override // defpackage.k08
    public final p72 e() {
        return new p72(-1, -1);
    }

    @Override // defpackage.k08
    public final Object f(int i, q08 q08Var) {
        Object objI = jx7.i(this.a, i, q08Var);
        return objI == bw2.a ? objI : wef.a;
    }
}
