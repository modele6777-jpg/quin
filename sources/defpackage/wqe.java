package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wqe implements qne {
    public final /* synthetic */ cre a;
    public final /* synthetic */ boolean b;

    public wqe(cre creVar, boolean z) {
        this.a = creVar;
        this.b = z;
    }

    @Override // defpackage.qne
    public final void b() {
        cre creVar = this.a;
        creVar.q(null);
        creVar.p(null);
        creVar.u(true);
    }

    @Override // defpackage.qne
    public final void c() {
        cre creVar = this.a;
        creVar.q(null);
        creVar.p(null);
        creVar.u(true);
    }

    @Override // defpackage.qne
    public final void d() {
        tte tteVarD;
        boolean z = this.b;
        sg6 sg6Var = z ? sg6.b : sg6.c;
        cre creVar = this.a;
        creVar.q(sg6Var);
        long jA = svc.a(creVar.j(z));
        r38 r38Var = creVar.d;
        if (r38Var == null || (tteVarD = r38Var.d()) == null) {
            return;
        }
        long jE = tteVarD.e(jA);
        creVar.n = jE;
        creVar.p(new hl9(jE));
        creVar.p = 0L;
        creVar.s = -1;
        r38 r38Var2 = creVar.d;
        if (r38Var2 != null) {
            r38Var2.q.setValue(Boolean.TRUE);
        }
        creVar.u(false);
    }

    @Override // defpackage.qne
    public final void e(long j) {
        cre creVar = this.a;
        long jG = hl9.g(creVar.p, j);
        creVar.p = jG;
        creVar.p(new hl9(hl9.g(creVar.n, jG)));
        zse zseVarL = creVar.l();
        hl9 hl9VarG = creVar.g();
        hl9VarG.getClass();
        creVar.v(zseVarL, hl9VarG.a, false, this.b, gec.g, true, new fh6(9));
        creVar.u(false);
    }

    @Override // defpackage.qne
    public final void onCancel() {
    }

    @Override // defpackage.qne
    public final void a(long j, wuc wucVar) {
    }
}
