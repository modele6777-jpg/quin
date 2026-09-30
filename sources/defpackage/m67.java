package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m67 extends eua {
    public static final m67 c = new m67(c77.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        k67 k67Var = (k67) obj;
        k67Var.getClass();
        int iT = zf2Var.t(this.b, i);
        k67Var.b(k67Var.d() + 1);
        int[] iArr = k67Var.a;
        int i2 = k67Var.b;
        k67Var.b = i2 + 1;
        iArr[i2] = iT;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        k67 k67Var = new k67();
        k67Var.a = iArr;
        k67Var.b = iArr.length;
        k67Var.b(10);
        return k67Var;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new int[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        ag2Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.v(i2, iArr[i2], this.b);
        }
    }
}
