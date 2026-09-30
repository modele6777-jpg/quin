package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yl4 extends yk4 {
    public zl4 Y0;
    public boolean Z0;
    public n26 a1;
    public n26 b1;
    public boolean c1;

    @Override // defpackage.yk4
    public final boolean D1() {
        return this.Z0;
    }

    @Override // defpackage.yk4
    public final Object p1(wk4 wk4Var, xk4 xk4Var) {
        Object objA;
        ks9 ks9Var = this.F0;
        return (ks9Var != null && (objA = this.Y0.a(new vl4(wk4Var, this, ks9Var, null), xk4Var)) == bw2.a) ? objA : wef.a;
    }

    @Override // defpackage.yk4
    public final void u1(long j) {
        if (!this.Y || pa7.t(this.a1, ul4.a)) {
            return;
        }
        ynb.V(Z0(), null, dw2.d, new wl4(this, j, null), 1);
    }

    @Override // defpackage.yk4
    public final void v1(wj4 wj4Var) {
        ks9 ks9Var;
        if (!this.Y || pa7.t(this.b1, ul4.b) || (ks9Var = this.F0) == null) {
            return;
        }
        ynb.V(Z0(), null, dw2.d, new xl4(this, wj4Var, ks9Var, null), 1);
    }
}
