package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class djb extends sv3 implements p09, ug2 {
    public cjb F0;
    public final dkd G0;

    public djb(cjb cjbVar) {
        this.F0 = cjbVar;
        wr4 wr4Var = new wr4(this);
        iy9 iy9Var = new iy9(b21.l, wr4Var);
        dkd dkdVar = new dkd((c1b) iy9Var.d());
        dkdVar.i0((c1b) iy9Var.d(), iy9Var.e());
        this.G0 = dkdVar;
        int i = 25;
        l1(new lj4(new ks2(i, new z8b(19), new ajb(wr4Var, new p59(27, this))), 1));
    }

    @Override // defpackage.p09
    public final x57 e0() {
        return this.G0;
    }
}
