package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vp3 extends i09 implements pn4 {
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final m77 Z;

    public vp3(m77 m77Var) {
        this.Z = m77Var;
    }

    @Override // defpackage.i09
    public final void d1() {
        ynb.V(Z0(), null, null, new up3(this, null), 3);
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        vv7 vv7Var = (vv7) im2Var;
        vv7Var.a();
        xl1 xl1Var = vv7Var.a;
        if (this.E0) {
            sn4.y0(vv7Var, y72.b(y72.b, 0.3f), 0L, xl1Var.f(), 0.0f, null, 0, 122);
        } else if (this.F0 || this.G0) {
            sn4.y0(vv7Var, y72.b(y72.b, 0.1f), 0L, xl1Var.f(), 0.0f, null, 0, 122);
        }
    }
}
