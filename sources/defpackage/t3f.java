package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t3f extends c89 {
    public final c89 o;
    public final boolean p;
    public final boolean q;
    public a26 r;
    public a26 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public t3f(c89 c89Var, a26 a26Var, a26 a26Var2, boolean z, boolean z2) {
        a26 a26VarI;
        a26 a26VarE;
        znd zndVar = qrd.a;
        super(0L, ord.e, qrd.i(a26Var, (c89Var == null || (a26VarE = c89Var.e()) == null) ? qrd.j.e : a26VarE, z), qrd.j(a26Var2, (c89Var == null || (a26VarI = c89Var.i()) == null) ? qrd.j.f : a26VarI));
        this.o = c89Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = o8c.k();
    }

    @Override // defpackage.c89
    public final void B(x79 x79Var) {
        bzd.L();
        throw null;
    }

    @Override // defpackage.c89
    public final c89 C(a26 a26Var, a26 a26Var2) {
        a26 a26VarI = qrd.i(a26Var, this.r, true);
        a26 a26VarJ = qrd.j(a26Var2, this.s);
        return !this.p ? new t3f(D().C(null, a26VarJ), a26VarI, a26VarJ, false, true) : D().C(a26VarI, a26VarJ);
    }

    public final c89 D() {
        c89 c89Var = this.o;
        return c89Var == null ? qrd.j : c89Var;
    }

    @Override // defpackage.c89, defpackage.ird
    public final void c() {
        c89 c89Var;
        this.c = true;
        if (!this.q || (c89Var = this.o) == null) {
            return;
        }
        c89Var.c();
    }

    @Override // defpackage.ird
    public final ord d() {
        return D().d();
    }

    @Override // defpackage.c89, defpackage.ird
    public final a26 e() {
        return this.r;
    }

    @Override // defpackage.c89, defpackage.ird
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.ird
    public final long g() {
        return D().g();
    }

    @Override // defpackage.c89, defpackage.ird
    public final int h() {
        return D().h();
    }

    @Override // defpackage.c89, defpackage.ird
    public final a26 i() {
        return this.s;
    }

    @Override // defpackage.c89, defpackage.ird
    public final void k() {
        bzd.L();
        throw null;
    }

    @Override // defpackage.c89, defpackage.ird
    public final void l() {
        bzd.L();
        throw null;
    }

    @Override // defpackage.c89, defpackage.ird
    public final void m() {
        D().m();
    }

    @Override // defpackage.c89, defpackage.ird
    public final void n(c1e c1eVar) {
        D().n(c1eVar);
    }

    @Override // defpackage.ird
    public final void r(ord ordVar) {
        bzd.L();
        throw null;
    }

    @Override // defpackage.ird
    public final void s(long j) {
        bzd.L();
        throw null;
    }

    @Override // defpackage.c89, defpackage.ird
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.c89, defpackage.ird
    public final ird u(a26 a26Var) {
        a26 a26VarI = qrd.i(a26Var, this.r, true);
        return !this.p ? qrd.e(D().u(null), a26VarI, true) : D().u(a26VarI);
    }

    @Override // defpackage.c89
    public final vtb w() {
        return D().w();
    }

    @Override // defpackage.c89
    public final x79 x() {
        return D().x();
    }

    @Override // defpackage.c89
    /* JADX INFO: renamed from: y */
    public final a26 e() {
        return this.r;
    }
}
