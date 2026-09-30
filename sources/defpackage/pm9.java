package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pm9 extends xb9 {
    public final qm9 d;
    public boolean e;

    public pm9(qm9 qm9Var, rm9 rm9Var) {
        boolean z = qm9Var.b;
        this.a = rm9Var;
        this.b = z;
        this.d = qm9Var;
        this.e = true;
    }

    @Override // defpackage.xb9
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.xb9
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.xb9
    public final void c(vb9 vb9Var) {
        this.d.c(new wr0(vb9Var));
    }

    @Override // defpackage.xb9
    public final void d(vb9 vb9Var) {
        vb9Var.getClass();
        this.d.d(new wr0(vb9Var));
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
