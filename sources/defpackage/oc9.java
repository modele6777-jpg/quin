package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oc9 extends ird {
    public final a26 e;
    public final ird f;

    public oc9(long j, ord ordVar, a26 a26Var, ird irdVar) {
        super(j, ordVar);
        this.e = a26Var;
        this.f = irdVar;
        irdVar.k();
    }

    @Override // defpackage.ird
    public final void c() {
        ird irdVar = this.f;
        if (this.c) {
            return;
        }
        if (this.b != irdVar.g()) {
            a();
        }
        irdVar.l();
        this.c = true;
        synchronized (qrd.c) {
            o();
        }
    }

    @Override // defpackage.ird
    public final a26 e() {
        return this.e;
    }

    @Override // defpackage.ird
    public final boolean f() {
        return true;
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
    public final void n(c1e c1eVar) {
        znd zndVar = qrd.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ird
    public final ird u(a26 a26Var) {
        return new oc9(this.b, this.a, qrd.i(a26Var, this.e, true), this.f);
    }

    @Override // defpackage.ird
    public final void m() {
    }
}
