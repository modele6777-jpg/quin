package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wz3 extends z12 implements vz3 {
    public final qya U0;
    public final u99 V0;
    public final bu3 W0;
    public final otf X0;
    public final f04 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz3(u09 u09Var, ul2 ul2Var, h10 h10Var, boolean z, int i, qya qyaVar, u99 u99Var, bu3 bu3Var, otf otfVar, f04 f04Var, ntd ntdVar) {
        super(u09Var, ul2Var, h10Var, z, i, ntdVar == null ? ntd.T : ntdVar);
        u09Var.getClass();
        h10Var.getClass();
        if (i == 0) {
            throw null;
        }
        u99Var.getClass();
        otfVar.getClass();
        this.U0 = qyaVar;
        this.V0 = u99Var;
        this.W0 = bu3Var;
        this.X0 = otfVar;
        this.Y0 = f04Var;
    }

    @Override // defpackage.i04
    public final bu3 A() {
        return this.W0;
    }

    @Override // defpackage.z12, defpackage.e36
    public final /* bridge */ /* synthetic */ e36 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        return U0(bm3Var, c36Var, i, h10Var, ntdVar);
    }

    @Override // defpackage.i04
    public final u99 H() {
        return this.V0;
    }

    @Override // defpackage.i04
    public final f04 I() {
        return this.Y0;
    }

    @Override // defpackage.z12
    /* JADX INFO: renamed from: N0 */
    public final /* bridge */ /* synthetic */ z12 F0(int i, h10 h10Var, bm3 bm3Var, c36 c36Var, t99 t99Var, ntd ntdVar) {
        return U0(bm3Var, c36Var, i, h10Var, ntdVar);
    }

    public final wz3 U0(bm3 bm3Var, c36 c36Var, int i, h10 h10Var, ntd ntdVar) {
        bm3Var.getClass();
        if (i == 0) {
            throw null;
        }
        h10Var.getClass();
        wz3 wz3Var = new wz3((u09) bm3Var, (ul2) c36Var, h10Var, this.T0, i, this.U0, this.V0, this.W0, this.X0, this.Y0, ntdVar);
        wz3Var.L0 = this.L0;
        return wz3Var;
    }

    @Override // defpackage.e36, defpackage.tq8
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.e36, defpackage.c36
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.e36, defpackage.c36
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.i04
    public final ut8 r() {
        return this.U0;
    }

    @Override // defpackage.e36, defpackage.c36
    public final boolean z() {
        return false;
    }
}
