package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class are implements qne {
    public eue b;
    public final /* synthetic */ cre d;
    public boolean a = true;
    public wuc c = gec.c;

    public are(cre creVar) {
        this.d = creVar;
    }

    @Override // defpackage.qne
    public final void a(long j, wuc wucVar) {
        long j2;
        tte tteVarD;
        tte tteVarD2;
        cre creVar = this.d;
        if (creVar.i() && ((sg6) creVar.q.getValue()) == null) {
            creVar.q(sg6.c);
            creVar.s = -1;
            this.a = true;
            this.c = wucVar;
            creVar.m();
            r38 r38Var = creVar.d;
            if (r38Var == null || (tteVarD2 = r38Var.d()) == null || !tteVarD2.c(j)) {
                j2 = j;
                r38 r38Var2 = creVar.d;
                if (r38Var2 != null && (tteVarD = r38Var2.d()) != null) {
                    int iJ = creVar.b.j(tteVarD.b(j2, true));
                    zse zseVarB = cre.b(creVar.l().a, u3c.b(iJ, iJ));
                    creVar.e(false);
                    eh6 eh6Var = creVar.j;
                    if (eh6Var != null) {
                        ((afa) eh6Var).a(0);
                    }
                    creVar.c.d(zseVarB);
                    creVar.v = new eue(zseVarB.b);
                }
                this.a = false;
            } else {
                if (creVar.l().a.b.length() == 0) {
                    return;
                }
                creVar.e(false);
                long jV = creVar.v(zse.a(creVar.l(), null, eue.b, 5), j, true, false, this.c, true, new fh6(0));
                j2 = j;
                creVar.o = new eue(jV);
                this.b = new eue(jV);
            }
            creVar.r(ug6.a);
            creVar.n = j2;
            creVar.p(new hl9(j2));
            creVar.p = 0L;
        }
    }

    @Override // defpackage.qne
    public final void b() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    @Override // defpackage.qne
    public final void e(long j) {
        tte tteVarD;
        eue eueVar;
        int iB;
        long jV;
        cre creVar = this.d;
        if (!creVar.i() || creVar.l().a.b.length() == 0) {
            return;
        }
        creVar.p = hl9.g(creVar.p, j);
        r38 r38Var = creVar.d;
        if (r38Var != null && (tteVarD = r38Var.d()) != null) {
            creVar.p(new hl9(hl9.g(creVar.n, creVar.p)));
            if (creVar.o == null) {
                hl9 hl9VarG = creVar.g();
                hl9VarG.getClass();
                if (tteVarD.c(hl9VarG.a)) {
                    eueVar = creVar.o;
                    if (eueVar != null) {
                        iB = (int) (eueVar.a >> 32);
                    } else {
                        iB = tteVarD.b(creVar.n, false);
                    }
                    hl9 hl9VarG2 = creVar.g();
                    hl9VarG2.getClass();
                    int iB2 = tteVarD.b(hl9VarG2.a, false);
                    if (creVar.o != null && iB == iB2) {
                        return;
                    }
                    zse zseVarL = creVar.l();
                    hl9 hl9VarG3 = creVar.g();
                    hl9VarG3.getClass();
                    jV = creVar.v(zseVarL, hl9VarG3.a, false, false, this.c, true, new fh6(9));
                } else {
                    int iJ = creVar.b.j(tteVarD.b(creVar.n, true));
                    sl9 sl9Var = creVar.b;
                    hl9 hl9VarG4 = creVar.g();
                    hl9VarG4.getClass();
                    wuc wucVar = iJ == sl9Var.j(tteVarD.b(hl9VarG4.a, true)) ? gec.c : gec.e;
                    zse zseVarL2 = creVar.l();
                    hl9 hl9VarG5 = creVar.g();
                    hl9VarG5.getClass();
                    jV = creVar.v(zseVarL2, hl9VarG5.a, false, false, wucVar, true, new fh6(9));
                }
            } else {
                eueVar = creVar.o;
                if (eueVar != null) {
                    iB = (int) (eueVar.a >> 32);
                } else {
                    iB = tteVarD.b(creVar.n, false);
                }
                hl9 hl9VarG6 = creVar.g();
                hl9VarG6.getClass();
                int iB3 = tteVarD.b(hl9VarG6.a, false);
                if (creVar.o != null) {
                }
                zse zseVarL3 = creVar.l();
                hl9 hl9VarG7 = creVar.g();
                hl9VarG7.getClass();
                jV = creVar.v(zseVarL3, hl9VarG7.a, false, false, this.c, true, new fh6(9));
            }
            this.b = new eue(jV);
            if (!eue.b(jV, creVar.o)) {
                this.a = false;
            }
        }
        creVar.u(false);
    }

    public final void f() {
        cre creVar = this.d;
        creVar.q(null);
        creVar.p(null);
        this.c = gec.c;
        creVar.u(true);
        eue eueVar = this.b;
        boolean zD = eue.d(eueVar != null ? eueVar.a : creVar.l().b);
        creVar.r(zD ? ug6.c : ug6.b);
        r38 r38Var = creVar.d;
        if (r38Var != null) {
            r38Var.m.setValue(Boolean.valueOf(!zD && aic.n(creVar, true)));
        }
        r38 r38Var2 = creVar.d;
        if (r38Var2 != null) {
            r38Var2.n.setValue(Boolean.valueOf(!zD && aic.n(creVar, false)));
        }
        r38 r38Var3 = creVar.d;
        if (r38Var3 != null) {
            r38Var3.o.setValue(Boolean.valueOf(zD && aic.n(creVar, true)));
        }
        if (this.a) {
            creVar.n(creVar.o);
        }
        creVar.o = null;
    }

    @Override // defpackage.qne
    public final void onCancel() {
        f();
    }

    @Override // defpackage.qne
    public final void c() {
    }

    @Override // defpackage.qne
    public final void d() {
    }
}
