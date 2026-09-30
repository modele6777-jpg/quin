package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hw1 extends gw1 {
    public hw1(wj5 wj5Var, pv2 pv2Var, int i, i41 i41Var, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? i41.a : i41Var, (i2 & 2) != 0 ? nu4.a : pv2Var, wj5Var);
    }

    @Override // defpackage.cw1
    public final cw1 g(pv2 pv2Var, int i, i41 i41Var) {
        return new hw1(i, i41Var, pv2Var, this.d);
    }

    @Override // defpackage.cw1
    public final wj5 j() {
        return this.d;
    }

    @Override // defpackage.gw1
    public final Object l(xj5 xj5Var, xn2 xn2Var) {
        Object objB = this.d.b(xj5Var, xn2Var);
        return objB == bw2.a ? objB : wef.a;
    }
}
