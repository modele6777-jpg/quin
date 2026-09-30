package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ax1 extends eua {
    public static final ax1 c = new ax1(ix1.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        yw1 yw1Var = (yw1) obj;
        yw1Var.getClass();
        char cL = zf2Var.l(this.b, i);
        yw1Var.b(yw1Var.d() + 1);
        char[] cArr = yw1Var.a;
        int i2 = yw1Var.b;
        yw1Var.b = i2 + 1;
        cArr[i2] = cL;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        yw1 yw1Var = new yw1();
        yw1Var.a = cArr;
        yw1Var.b = cArr.length;
        yw1Var.b(10);
        return yw1Var;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new char[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        ag2Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.x(this.b, i2, cArr[i2]);
        }
    }
}
