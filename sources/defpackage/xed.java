package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xed extends eua {
    public static final xed c = new xed(afd.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        wed wedVar = (wed) obj;
        wedVar.getClass();
        short sQ = zf2Var.q(this.b, i);
        wedVar.b(wedVar.d() + 1);
        short[] sArr = wedVar.a;
        int i2 = wedVar.b;
        wedVar.b = i2 + 1;
        sArr[i2] = sQ;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        wed wedVar = new wed();
        wedVar.a = sArr;
        wedVar.b = sArr.length;
        wedVar.b(10);
        return wedVar;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new short[0];
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        ag2Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.u(this.b, i2, sArr[i2]);
        }
    }
}
