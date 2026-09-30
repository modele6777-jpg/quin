package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kv3 extends bw3 implements r13, lv3 {
    public final tjd b;
    public final boolean c;

    public kv3(tjd tjdVar, boolean z) {
        this.b = tjdVar;
        this.c = z;
    }

    @Override // defpackage.r13
    public final boolean E() {
        tjd tjdVar = this.b;
        tjdVar.c0();
        return tjdVar.c0().m() instanceof c8f;
    }

    @Override // defpackage.bw3, defpackage.tt7
    public final boolean i0() {
        return false;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        return z ? this.b.l0(z) : this;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return new kv3(this.b.n0(e7fVar), this.c);
    }

    @Override // defpackage.bw3
    public final tjd q0() {
        return this.b;
    }

    @Override // defpackage.bw3
    public final bw3 s0(tjd tjdVar) {
        return new kv3(tjdVar, this.c);
    }

    @Override // defpackage.tjd
    public final String toString() {
        return this.b + " & Any";
    }

    @Override // defpackage.r13
    public final jgf v(tt7 tt7Var) {
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        kv3 kv3VarK0 = qfc.K0(jgfVarK0, this.c);
        if (kv3VarK0 != null) {
            return kv3VarK0;
        }
        tjd tjdVarW = o7c.w(jgfVarK0);
        return tjdVarW != null ? tjdVarW : jgfVarK0.l0(false);
    }
}
