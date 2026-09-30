package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class pfc extends m1 implements cw2 {
    public final xn2 e;

    public pfc(xn2 xn2Var, pv2 pv2Var) {
        super(pv2Var, true);
        this.e = xn2Var;
    }

    @Override // defpackage.rg7
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.cw2
    public final cw2 e() {
        xn2 xn2Var = this.e;
        if (xn2Var instanceof cw2) {
            return (cw2) xn2Var;
        }
        return null;
    }

    @Override // defpackage.rg7
    public void f(Object obj) {
        aa4.a(k99.D(this.e), vfh.G(obj));
    }

    @Override // defpackage.rg7
    public void r(Object obj) {
        this.e.g(vfh.G(obj));
    }

    public void l0() {
    }
}
