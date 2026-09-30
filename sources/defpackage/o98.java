package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o98 extends p98 implements u48 {
    public final x48 e;
    public final /* synthetic */ q98 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o98(q98 q98Var, x48 x48Var, zk9 zk9Var) {
        super(q98Var, zk9Var);
        this.f = q98Var;
        this.e = x48Var;
    }

    @Override // defpackage.p98
    public final void b() {
        this.e.k().b(this);
    }

    @Override // defpackage.p98
    public final boolean c(x48 x48Var) {
        return this.e == x48Var;
    }

    @Override // defpackage.p98
    public final boolean d() {
        return ((a58) this.e.k()).i.compareTo(g48.d) >= 0;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        x48 x48Var2 = this.e;
        g48 g48Var = ((a58) x48Var2.k()).i;
        if (g48Var == g48.a) {
            this.f.j(this.a);
            return;
        }
        g48 g48Var2 = null;
        while (g48Var2 != g48Var) {
            a(d());
            g48Var2 = g48Var;
            g48Var = ((a58) x48Var2.k()).i;
        }
    }
}
