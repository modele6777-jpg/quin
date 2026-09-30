package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r04 extends hjd implements vz3 {
    public final dza T0;
    public final u99 U0;
    public final bu3 V0;
    public final otf W0;
    public final f04 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r04(bm3 bm3Var, hjd hjdVar, h10 h10Var, t99 t99Var, int i, dza dzaVar, u99 u99Var, bu3 bu3Var, otf otfVar, f04 f04Var, ntd ntdVar) {
        super(bm3Var, hjdVar, h10Var, t99Var, i, ntdVar == null ? ntd.T : ntdVar);
        bm3Var.getClass();
        h10Var.getClass();
        if (i == 0) {
            throw null;
        }
        u99Var.getClass();
        otfVar.getClass();
        this.T0 = dzaVar;
        this.U0 = u99Var;
        this.V0 = bu3Var;
        this.W0 = otfVar;
        this.X0 = f04Var;
    }

    @Override // defpackage.i04
    public final bu3 A() {
        return this.V0;
    }

    @Override // defpackage.hjd, defpackage.e36
    public final e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        t99 t99Var2;
        bm3Var.getClass();
        if (i == 0) {
            throw null;
        }
        h10Var.getClass();
        hjd hjdVar = (hjd) c36Var;
        if (t99Var == null) {
            t99 name = getName();
            name.getClass();
            t99Var2 = name;
        } else {
            t99Var2 = t99Var;
        }
        r04 r04Var = new r04(bm3Var, hjdVar, h10Var, t99Var2, i, this.T0, this.U0, this.V0, this.W0, this.X0, ntdVar);
        r04Var.L0 = this.L0;
        return r04Var;
    }

    @Override // defpackage.i04
    public final u99 H() {
        return this.U0;
    }

    @Override // defpackage.i04
    public final f04 I() {
        return this.X0;
    }

    @Override // defpackage.i04
    public final ut8 r() {
        return this.T0;
    }
}
