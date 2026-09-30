package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oi4 extends eua {
    public static final oi4 c = new oi4(vi4.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        ni4 ni4Var = (ni4) obj;
        ni4Var.getClass();
        double dK = zf2Var.k(this.b, i);
        ni4Var.b(ni4Var.d() + 1);
        double[] dArr = ni4Var.a;
        int i2 = ni4Var.b;
        ni4Var.b = i2 + 1;
        dArr[i2] = dK;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ni4 ni4Var = new ni4();
        ni4Var.a = dArr;
        ni4Var.b = dArr.length;
        ni4Var.b(10);
        return ni4Var;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new double[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        ag2Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.e(this.b, i2, dArr[i2]);
        }
    }
}
