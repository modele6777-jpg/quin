package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f11 extends eua {
    public static final f11 c = new f11(g11.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        e11 e11Var = (e11) obj;
        e11Var.getClass();
        boolean z = zf2Var.z(this.b, i);
        e11Var.b(e11Var.d() + 1);
        boolean[] zArr = e11Var.a;
        int i2 = e11Var.b;
        e11Var.b = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        e11 e11Var = new e11();
        e11Var.a = zArr;
        e11Var.b = zArr.length;
        e11Var.b(10);
        return e11Var;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new boolean[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        ag2Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.o(this.b, i2, zArr[i2]);
        }
    }
}
