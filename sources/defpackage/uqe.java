package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uqe implements qne {
    public final /* synthetic */ cre a;

    public uqe(cre creVar) {
        this.a = creVar;
    }

    @Override // defpackage.qne
    public final void a(long j, wuc wucVar) {
        tte tteVarD;
        cre creVar = this.a;
        long jA = svc.a(creVar.j(true));
        r38 r38Var = creVar.d;
        if (r38Var == null || (tteVarD = r38Var.d()) == null) {
            return;
        }
        long jE = tteVarD.e(jA);
        creVar.n = jE;
        creVar.p(new hl9(jE));
        creVar.p = 0L;
        creVar.q(sg6.a);
        creVar.u(false);
    }

    @Override // defpackage.qne
    public final void b() {
        cre creVar = this.a;
        creVar.q(null);
        creVar.p(null);
    }

    @Override // defpackage.qne
    public final void c() {
        cre creVar = this.a;
        creVar.q(null);
        creVar.p(null);
    }

    @Override // defpackage.qne
    public final void e(long j) {
        tte tteVarD;
        eh6 eh6Var;
        cre creVar = this.a;
        creVar.p = hl9.g(creVar.p, j);
        r38 r38Var = creVar.d;
        if (r38Var == null || (tteVarD = r38Var.d()) == null) {
            return;
        }
        creVar.p(new hl9(hl9.g(creVar.n, creVar.p)));
        sl9 sl9Var = creVar.b;
        hl9 hl9VarG = creVar.g();
        hl9VarG.getClass();
        int iJ = sl9Var.j(tteVarD.b(hl9VarG.a, true));
        long jB = u3c.b(iJ, iJ);
        if (eue.c(jB, creVar.l().b)) {
            return;
        }
        r38 r38Var2 = creVar.d;
        if ((r38Var2 == null || ((Boolean) r38Var2.q.getValue()).booleanValue()) && (eh6Var = creVar.j) != null) {
            ((afa) eh6Var).a(9);
        }
        creVar.c.d(cre.b(creVar.l().a, jB));
        creVar.v = new eue(jB);
    }

    @Override // defpackage.qne
    public final void d() {
    }

    @Override // defpackage.qne
    public final void onCancel() {
    }
}
