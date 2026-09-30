package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vhb extends ird {
    public final a26 e;
    public int f;

    public vhb(long j, ord ordVar, a26 a26Var) {
        super(j, ordVar);
        this.e = a26Var;
        this.f = 1;
    }

    @Override // defpackage.ird
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.ird
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.ird
    public final void n(c1e c1eVar) {
        znd zndVar = qrd.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ird
    public final ird u(a26 a26Var) {
        qrd.v(this);
        return new oc9(this.b, this.a, qrd.i(a26Var, this.e, true), this);
    }

    @Override // defpackage.ird
    public final void m() {
    }
}
