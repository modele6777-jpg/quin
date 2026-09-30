package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qb6 extends c89 {
    @Override // defpackage.c89
    public final c89 C(a26 a26Var, a26 a26Var2) {
        return (c89) ((ird) qrd.b(new hy0(new d5(12, a26Var, a26Var2), 18)));
    }

    @Override // defpackage.c89, defpackage.ird
    public final void c() {
        synchronized (qrd.c) {
            o();
        }
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
        qrd.c();
    }

    @Override // defpackage.c89, defpackage.ird
    public final ird u(a26 a26Var) {
        return (vhb) ((ird) qrd.b(new hy0(new pb6(a26Var, 0), 18)));
    }

    @Override // defpackage.c89
    public final vtb w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
