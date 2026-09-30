package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jd extends hed {
    public final kxa a;
    public final vz9 b;
    public final vz9 c;

    public jd(kxa kxaVar, tbd tbdVar, hkb hkbVar) {
        this.a = kxaVar;
        this.b = q1c.f(tbdVar);
        this.c = q1c.f(hkbVar);
    }

    @Override // defpackage.hed
    public final hed a(hcd hcdVar, tbd tbdVar, long j, long j2, long j3) {
        vz9 vz9Var = this.b;
        z7c.r(this.a, j, j2, j3, !pa7.t((tbd) vz9Var.getValue(), tbdVar));
        vz9Var.setValue(tbdVar);
        return this;
    }

    @Override // defpackage.hed
    public final hkb c() {
        return (hkb) this.c.getValue();
    }

    @Override // defpackage.hed
    public final boolean d() {
        return true;
    }

    @Override // defpackage.hed
    public final kxa e() {
        return this.a;
    }

    @Override // defpackage.hed
    public final hed h() {
        kxa kxaVar = this.a;
        z5c.g(hl9.g(((hl9) ((vz9) kxaVar.d).getValue()).a, ((hl9) ((vz9) kxaVar.c).getValue()).a), ((ald) ((vz9) kxaVar.a).getValue()).a);
        icd icdVar = ((tbd) this.b.getValue()).H0;
        mdd mddVar = (mdd) icdVar.j().b.getValue();
        icdVar.j();
        bv7 bv7Var = icdVar.f().b.f;
        if (bv7Var == null) {
            qc0.j("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            return null;
        }
        db6.Y0(bv7Var.l());
        mddVar.getClass();
        return mf9.a;
    }

    @Override // defpackage.hed
    public final void i(hkb hkbVar) {
        this.c.setValue(hkbVar);
    }

    @Override // defpackage.hed
    public final hed g(tbd tbdVar) {
        return this;
    }
}
