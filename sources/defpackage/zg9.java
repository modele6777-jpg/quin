package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zg9 extends bw3 implements r13 {
    public final tjd b;

    public zg9(tjd tjdVar) {
        tjdVar.getClass();
        this.b = tjdVar;
    }

    @Override // defpackage.r13
    public final boolean E() {
        return true;
    }

    @Override // defpackage.bw3, defpackage.tt7
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.tjd, defpackage.jgf
    public final jgf n0(e7f e7fVar) {
        e7fVar.getClass();
        return new zg9(this.b.n0(e7fVar));
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        return z ? this.b.l0(true) : this;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return new zg9(this.b.n0(e7fVar));
    }

    @Override // defpackage.bw3
    public final tjd q0() {
        return this.b;
    }

    @Override // defpackage.bw3
    public final bw3 s0(tjd tjdVar) {
        return new zg9(tjdVar);
    }

    @Override // defpackage.r13
    public final jgf v(tt7 tt7Var) {
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        if (!w8f.f(jgfVarK0) && !w8f.e(jgfVarK0)) {
            return jgfVarK0;
        }
        if (jgfVarK0 instanceof tjd) {
            tjd tjdVar = (tjd) jgfVarK0;
            tjd tjdVarL0 = tjdVar.l0(false);
            return !w8f.f(tjdVar) ? tjdVarL0 : new zg9(tjdVarL0);
        }
        if (!(jgfVarK0 instanceof bj5)) {
            ap.c();
            return null;
        }
        bj5 bj5Var = (bj5) jgfVarK0;
        tjd tjdVar2 = bj5Var.b;
        tjd tjdVarL1 = tjdVar2.l0(false);
        if (w8f.f(tjdVar2)) {
            tjdVarL1 = new zg9(tjdVarL1);
        }
        tjd tjdVar3 = bj5Var.c;
        tjd tjdVarL2 = tjdVar3.l0(false);
        if (w8f.f(tjdVar3)) {
            tjdVarL2 = new zg9(tjdVarL2);
        }
        return q7c.t(rxg.E(tjdVarL1, tjdVarL2), q7c.l(jgfVarK0));
    }
}
