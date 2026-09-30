package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f6e extends sv3 implements ria, nn5, ho5 {
    public x16 F0;
    public boolean G0;
    public final obe H0;

    public f6e(x16 x16Var) {
        this.F0 = x16Var;
        sr srVar = new sr(7, this);
        hia hiaVar = ibe.a;
        obe obeVar = new obe(null, null, null, srVar);
        l1(obeVar);
        this.H0 = obeVar;
    }

    @Override // defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        this.H0.E(hiaVar, iiaVar, j);
    }

    @Override // defpackage.ria
    public final void N() {
        this.H0.N();
    }

    @Override // defpackage.ria
    public final long r() {
        cj4 cj4Var = cgg.p;
        sw3 sw3Var = vd0.s0(this).O0;
        cj4Var.getClass();
        int i = t0f.b;
        return gdc.j(sw3Var.D0(10.0f), sw3Var.D0(40.0f), sw3Var.D0(10.0f), sw3Var.D0(40.0f));
    }

    @Override // defpackage.nn5
    public final void r0(jo5 jo5Var) {
        this.G0 = ((ko5) jo5Var).b();
    }
}
