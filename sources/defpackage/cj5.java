package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cj5 extends bj5 implements r13 {
    @Override // defpackage.r13
    public final boolean E() {
        tjd tjdVar = this.b;
        return (tjdVar.c0().m() instanceof c8f) && pa7.t(tjdVar.c0(), this.c.c0());
    }

    @Override // defpackage.tt7
    public final tt7 j0(zt7 zt7Var) {
        tjd tjdVar = this.b;
        tjdVar.getClass();
        tjd tjdVar2 = this.c;
        tjdVar2.getClass();
        return new cj5(tjdVar, tjdVar2);
    }

    @Override // defpackage.jgf
    public final jgf l0(boolean z) {
        return rxg.E(this.b.l0(z), this.c.l0(z));
    }

    @Override // defpackage.jgf
    /* JADX INFO: renamed from: m0 */
    public final jgf j0(zt7 zt7Var) {
        tjd tjdVar = this.b;
        tjdVar.getClass();
        tjd tjdVar2 = this.c;
        tjdVar2.getClass();
        return new cj5(tjdVar, tjdVar2);
    }

    @Override // defpackage.jgf
    public final jgf n0(e7f e7fVar) {
        e7fVar.getClass();
        return rxg.E(this.b.n0(e7fVar), this.c.n0(e7fVar));
    }

    @Override // defpackage.bj5
    public final tjd o0() {
        return this.b;
    }

    @Override // defpackage.bj5
    public final String p0(jz3 jz3Var, jz3 jz3Var2) {
        boolean zP = jz3Var2.a.p();
        tjd tjdVar = this.c;
        tjd tjdVar2 = this.b;
        if (!zP) {
            return jz3Var.w(jz3Var.P(tjdVar2), jz3Var.P(tjdVar), o7c.p(this));
        }
        return "(" + jz3Var.P(tjdVar2) + ".." + jz3Var.P(tjdVar) + ')';
    }

    @Override // defpackage.bj5
    public final String toString() {
        return "(" + this.b + ".." + this.c + ')';
    }

    @Override // defpackage.r13
    public final jgf v(tt7 tt7Var) {
        jgf jgfVarE;
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        if (jgfVarK0 instanceof bj5) {
            jgfVarE = jgfVarK0;
        } else {
            if (!(jgfVarK0 instanceof tjd)) {
                ap.c();
                return null;
            }
            tjd tjdVar = (tjd) jgfVarK0;
            jgfVarE = rxg.E(tjdVar, tjdVar.l0(true));
        }
        return q7c.p(jgfVarE, jgfVarK0);
    }
}
