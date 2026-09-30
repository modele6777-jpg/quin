package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ej5 extends bj5 implements y8f {
    public final bj5 d;
    public final tt7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej5(bj5 bj5Var, tt7 tt7Var) {
        super(bj5Var.b, bj5Var.c);
        tt7Var.getClass();
        this.d = bj5Var;
        this.e = tt7Var;
    }

    @Override // defpackage.y8f
    public final jgf M() {
        return this.d;
    }

    @Override // defpackage.tt7
    public final tt7 j0(zt7 zt7Var) {
        tt7 tt7Var = this.e;
        tt7Var.getClass();
        return new ej5(this.d, tt7Var);
    }

    @Override // defpackage.jgf
    public final jgf l0(boolean z) {
        return q7c.t(this.d.l0(z), this.e.k0().l0(z));
    }

    @Override // defpackage.jgf
    /* JADX INFO: renamed from: m0 */
    public final jgf j0(zt7 zt7Var) {
        tt7 tt7Var = this.e;
        tt7Var.getClass();
        return new ej5(this.d, tt7Var);
    }

    @Override // defpackage.jgf
    public final jgf n0(e7f e7fVar) {
        e7fVar.getClass();
        return q7c.t(this.d.n0(e7fVar), this.e);
    }

    @Override // defpackage.bj5
    public final tjd o0() {
        return this.d.o0();
    }

    @Override // defpackage.y8f
    public final tt7 p() {
        return this.e;
    }

    @Override // defpackage.bj5
    public final String p0(jz3 jz3Var, jz3 jz3Var2) {
        return jz3Var2.a.r() ? jz3Var.P(this.e) : this.d.p0(jz3Var, jz3Var2);
    }

    @Override // defpackage.bj5
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.e + ")] " + this.d;
    }
}
