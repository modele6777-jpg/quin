package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lf8 extends eua {
    public static final lf8 c = new lf8(eg8.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        kf8 kf8Var = (kf8) obj;
        kf8Var.getClass();
        long jD = zf2Var.D(this.b, i);
        kf8Var.b(kf8Var.d() + 1);
        long[] jArr = kf8Var.a;
        int i2 = kf8Var.b;
        kf8Var.b = i2 + 1;
        jArr[i2] = jD;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        kf8 kf8Var = new kf8();
        kf8Var.a = jArr;
        kf8Var.b = jArr.length;
        kf8Var.b(10);
        return kf8Var;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new long[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        ag2Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.k(this.b, i2, jArr[i2]);
        }
    }
}
