package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yqe implements v39 {
    public boolean a = true;
    public eue b;
    public final /* synthetic */ cre c;

    public yqe(cre creVar) {
        this.c = creVar;
    }

    @Override // defpackage.v39
    public final boolean a(long j) {
        r38 r38Var;
        cre creVar = this.c;
        if (!creVar.i() || creVar.l().a.b.length() == 0 || (r38Var = creVar.d) == null || r38Var.d() == null) {
            return false;
        }
        f(creVar.l(), j, false, gec.c);
        return true;
    }

    @Override // defpackage.v39
    public final void b() {
        if (this.a) {
            this.c.n(this.b);
        }
    }

    @Override // defpackage.v39
    public final boolean c(long j, wuc wucVar, int i) {
        r38 r38Var;
        cre creVar = this.c;
        if (!creVar.i() || creVar.l().a.b.length() == 0 || (r38Var = creVar.d) == null || r38Var.d() == null) {
            return false;
        }
        fo5 fo5Var = creVar.k;
        if (fo5Var != null) {
            fo5.a(fo5Var);
        }
        creVar.n = j;
        creVar.s = -1;
        creVar.e(true);
        long jF = f(creVar.l(), creVar.n, true, wucVar);
        if (i >= 2) {
            this.a = true;
            this.b = new eue(jF);
        }
        return true;
    }

    @Override // defpackage.v39
    public final boolean d(long j, wuc wucVar) {
        r38 r38Var;
        cre creVar = this.c;
        if (!creVar.i() || creVar.l().a.b.length() == 0 || (r38Var = creVar.d) == null || r38Var.d() == null) {
            return false;
        }
        f(creVar.l(), j, false, wucVar);
        return true;
    }

    @Override // defpackage.v39
    public final boolean e(long j) {
        cre creVar = this.c;
        r38 r38Var = creVar.d;
        if (r38Var == null || r38Var.d() == null || !creVar.i()) {
            return false;
        }
        creVar.s = -1;
        fo5 fo5Var = creVar.k;
        if (fo5Var != null) {
            fo5.a(fo5Var);
        }
        f(creVar.l(), j, false, gec.c);
        return true;
    }

    public final long f(zse zseVar, long j, boolean z, wuc wucVar) {
        cre creVar = this.c;
        long jV = creVar.v(zseVar, j, z, false, wucVar, false, null);
        if (!eue.b(jV, this.b)) {
            this.a = false;
        }
        creVar.r(eue.d(jV) ? ug6.c : ug6.b);
        return jV;
    }
}
