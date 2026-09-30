package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xjd extends bw3 implements y8f {
    public final tjd b;
    public final tt7 c;

    public xjd(tjd tjdVar, tt7 tt7Var) {
        tt7Var.getClass();
        this.b = tjdVar;
        this.c = tt7Var;
    }

    @Override // defpackage.y8f
    public final jgf M() {
        return this.b;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        jgf jgfVarT = q7c.t(this.b.l0(z), this.c.k0().l0(z));
        jgfVarT.getClass();
        return (tjd) jgfVarT;
    }

    @Override // defpackage.y8f
    public final tt7 p() {
        return this.c;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        jgf jgfVarT = q7c.t(this.b.n0(e7fVar), this.c);
        jgfVarT.getClass();
        return (tjd) jgfVarT;
    }

    @Override // defpackage.bw3
    public final tjd q0() {
        return this.b;
    }

    @Override // defpackage.bw3
    public final bw3 s0(tjd tjdVar) {
        return new xjd(tjdVar, this.c);
    }

    @Override // defpackage.bw3
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final xjd j0(zt7 zt7Var) {
        tt7 tt7Var = this.c;
        tt7Var.getClass();
        return new xjd(this.b, tt7Var);
    }

    @Override // defpackage.tjd
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.c + ")] " + this.b;
    }
}
