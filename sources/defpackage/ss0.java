package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends i09 implements pn4, al9, wwc {
    public b41 E0;
    public float F0;
    public x4d G0;
    public long H0;
    public cv7 I0;
    public vs9 J0;
    public x4d K0;
    public vs9 L0;
    public long Z;

    @Override // defpackage.al9
    public final void A0() {
        this.H0 = 9205357640488583168L;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        qn4.G(this);
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        exc.n(hxcVar, this.G0);
    }

    @Override // defpackage.wwc
    public final boolean k() {
        return false;
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        vs9 vs9Var;
        if (this.G0 == g21.f) {
            if (!faf.a(this.Z, y72.k)) {
                sn4.y0(im2Var, this.Z, 0L, 0L, 0.0f, null, 0, 126);
            }
            b41 b41Var = this.E0;
            if (b41Var != null) {
                sn4.O0(im2Var, b41Var, 0L, 0L, this.F0, null, null, 0, 118);
            }
        } else {
            vv7 vv7Var = (vv7) im2Var;
            xl1 xl1Var = vv7Var.a;
            if (ald.a(xl1Var.f(), this.H0) && vv7Var.getLayoutDirection() == this.I0 && pa7.t(this.K0, this.G0)) {
                vs9Var = this.J0;
                vs9Var.getClass();
            } else {
                if9.C(this, new v6(17, this, vv7Var));
                vs9Var = this.L0;
                this.L0 = null;
            }
            this.J0 = vs9Var;
            this.H0 = xl1Var.f();
            this.I0 = vv7Var.getLayoutDirection();
            this.K0 = this.G0;
            vs9Var.getClass();
            vs9 vs9Var2 = vs9Var;
            if (!faf.a(this.Z, y72.k)) {
                rs0.w(im2Var, vs9Var2, this.Z, null, 60);
            }
            b41 b41Var2 = this.E0;
            if (b41Var2 != null) {
                rs0.v(im2Var, vs9Var2, b41Var2, this.F0, 56);
            }
        }
        ((vv7) im2Var).a();
    }
}
