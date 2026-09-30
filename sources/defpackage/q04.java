package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q04 extends yxa implements vz3 {
    public final kza Q0;
    public final u99 R0;
    public final bu3 S0;
    public final otf T0;
    public final f04 U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q04(bm3 bm3Var, wxa wxaVar, h10 h10Var, e09 e09Var, rz3 rz3Var, boolean z, t99 t99Var, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, kza kzaVar, u99 u99Var, bu3 bu3Var, otf otfVar, f04 f04Var) {
        super(bm3Var, wxaVar, h10Var, e09Var, rz3Var, z, t99Var, i, ntd.T, z2, z3, z6, z4, z5);
        bm3Var.getClass();
        h10Var.getClass();
        e09Var.getClass();
        rz3Var.getClass();
        t99Var.getClass();
        if (i == 0) {
            throw null;
        }
        u99Var.getClass();
        otfVar.getClass();
        this.Q0 = kzaVar;
        this.R0 = u99Var;
        this.S0 = bu3Var;
        this.T0 = otfVar;
        this.U0 = f04Var;
    }

    @Override // defpackage.i04
    public final bu3 A() {
        return this.S0;
    }

    @Override // defpackage.yxa
    public final yxa F0(bm3 bm3Var, e09 e09Var, rz3 rz3Var, wxa wxaVar, int i, t99 t99Var) {
        bm3Var.getClass();
        e09Var.getClass();
        rz3Var.getClass();
        if (i == 0) {
            throw null;
        }
        t99Var.getClass();
        return new q04(bm3Var, wxaVar, getAnnotations(), e09Var, rz3Var, this.g, t99Var, i, this.Z, this.E0, isExternal(), this.H0, this.F0, this.Q0, this.R0, this.S0, this.T0, this.U0);
    }

    @Override // defpackage.i04
    public final u99 H() {
        return this.R0;
    }

    @Override // defpackage.i04
    public final f04 I() {
        return this.U0;
    }

    @Override // defpackage.yxa, defpackage.tq8
    public final boolean isExternal() {
        return oi5.G.e(this.Q0.p0()).booleanValue();
    }

    @Override // defpackage.i04
    public final ut8 r() {
        return this.Q0;
    }
}
