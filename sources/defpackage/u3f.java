package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u3f extends ird {
    public final ird e;
    public final boolean f;
    public final boolean g;
    public a26 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3f(ird irdVar, a26 a26Var, boolean z, boolean z2) {
        a26 a26VarE;
        super(0L, ord.e);
        znd zndVar = qrd.a;
        this.e = irdVar;
        this.f = z;
        this.g = z2;
        this.h = qrd.i(a26Var, (irdVar == null || (a26VarE = irdVar.e()) == null) ? qrd.j.e : a26VarE, z);
        this.i = o8c.k();
    }

    @Override // defpackage.ird
    public final void c() {
        ird irdVar;
        this.c = true;
        if (!this.g || (irdVar = this.e) == null) {
            return;
        }
        irdVar.c();
    }

    @Override // defpackage.ird
    public final ord d() {
        return v().d();
    }

    @Override // defpackage.ird
    public final a26 e() {
        return this.h;
    }

    @Override // defpackage.ird
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ird
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ird
    public final a26 i() {
        return null;
    }

    @Override // defpackage.ird
    public final void k() {
        bzd.L();
        throw null;
    }

    @Override // defpackage.ird
    public final void l() {
        bzd.L();
        throw null;
    }

    @Override // defpackage.ird
    public final void m() {
        v().m();
    }

    @Override // defpackage.ird
    public final void n(c1e c1eVar) {
        v().n(c1eVar);
    }

    @Override // defpackage.ird
    public final ird u(a26 a26Var) {
        a26 a26VarI = qrd.i(a26Var, this.h, true);
        return !this.f ? qrd.e(v().u(null), a26VarI, true) : v().u(a26VarI);
    }

    public final ird v() {
        ird irdVar = this.e;
        return irdVar == null ? qrd.j : irdVar;
    }
}
