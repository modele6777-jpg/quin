package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ow7 extends pu3 {
    public final xn2 e;

    public ow7(pv2 pv2Var, l26 l26Var) {
        super(pv2Var, false);
        this.e = k99.x(this, this, l26Var);
    }

    @Override // defpackage.rg7
    public final void Z() throws Throwable {
        try {
            aa4.a(k99.D(this.e), wef.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof y94) {
                th = ((y94) th).getCause();
            }
            g(jzb.k(th));
            throw th;
        }
    }
}
