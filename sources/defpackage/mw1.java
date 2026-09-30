package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mw1 extends gw1 {
    public final n26 e;

    public mw1(n26 n26Var, wj5 wj5Var, pv2 pv2Var, int i, i41 i41Var) {
        super(i, i41Var, pv2Var, wj5Var);
        this.e = n26Var;
    }

    @Override // defpackage.cw1
    public final cw1 g(pv2 pv2Var, int i, i41 i41Var) {
        return new mw1(this.e, this.d, pv2Var, i, i41Var);
    }

    @Override // defpackage.gw1
    public final Object l(xj5 xj5Var, xn2 xn2Var) {
        Object objO = jgb.O(new lw1(this, xj5Var, null), xn2Var);
        return objO == bw2.a ? objO : wef.a;
    }
}
