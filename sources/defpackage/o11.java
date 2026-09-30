package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 extends sv3 implements wwc {
    public i11 F0;
    public float G0;
    public b41 H0;
    public x4d I0;
    public final g81 J0;

    public o11(float f, b41 b41Var, x4d x4dVar) {
        this.G0 = f;
        this.H0 = b41Var;
        this.I0 = x4dVar;
        g81 g81Var = new g81(new h81(), new c1(24, this));
        l1(g81Var);
        this.J0 = g81Var;
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        exc.n(hxcVar, this.I0);
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.wwc
    public final boolean k() {
        return false;
    }
}
