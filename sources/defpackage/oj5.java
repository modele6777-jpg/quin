package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oj5 extends eua {
    public static final oj5 c = new oj5(rj5.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        nj5 nj5Var = (nj5) obj;
        nj5Var.getClass();
        float fI = zf2Var.i(this.b, i);
        nj5Var.b(nj5Var.d() + 1);
        float[] fArr = nj5Var.a;
        int i2 = nj5Var.b;
        nj5Var.b = i2 + 1;
        fArr[i2] = fI;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        nj5 nj5Var = new nj5();
        nj5Var.a = fArr;
        nj5Var.b = fArr.length;
        nj5Var.b(10);
        return nj5Var;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new float[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        ag2Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.E(this.b, i2, fArr[i2]);
        }
    }
}
