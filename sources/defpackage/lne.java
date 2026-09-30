package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lne extends sv3 implements ug2, ume {
    public tze F0;
    public a26 G0;
    public a26 H0;
    public a26 I0;
    public lyd J0;
    public final mx3 K0 = zrd.b(new h2e(6, this));
    public hkb L0 = hkb.e;

    public lne(tze tzeVar, a26 a26Var, a26 a26Var2, a26 a26Var3) {
        this.F0 = tzeVar;
        this.G0 = a26Var;
        this.H0 = a26Var2;
        this.I0 = a26Var3;
    }

    @Override // defpackage.ume
    public final tme a0() {
        return (tme) this.K0.getValue();
    }

    @Override // defpackage.i09
    public final void d1() {
        tze tzeVar = this.F0;
        tzeVar.b = sze.c;
        tzeVar.a = this;
    }

    @Override // defpackage.i09
    public final void e1() {
        tze tzeVar = this.F0;
        tzeVar.b = sze.b;
        tzeVar.a = null;
    }

    @Override // defpackage.ume
    public final long j(bv7 bv7Var) {
        return n(bv7Var).f();
    }

    @Override // defpackage.ume
    public final hkb n(bv7 bv7Var) {
        if (!this.Y) {
            return this.L0;
        }
        hkb hkbVar = (hkb) this.I0.d(bv7Var);
        if (hkbVar == null) {
            return this.L0;
        }
        this.L0 = hkbVar;
        return hkbVar;
    }
}
