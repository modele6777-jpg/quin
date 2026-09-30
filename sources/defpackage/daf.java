package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class daf extends eua {
    public static final daf c = new daf(eaf.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        return ((baf) obj).a.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        caf cafVar = (caf) obj;
        cafVar.getClass();
        int iP = zf2Var.e(this.b, i).p();
        cafVar.b(cafVar.d() + 1);
        int[] iArr = cafVar.a;
        int i2 = cafVar.b;
        cafVar.b = i2 + 1;
        iArr[i2] = iP;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        int[] iArr = ((baf) obj).a;
        caf cafVar = new caf();
        cafVar.a = iArr;
        cafVar.b = iArr.length;
        cafVar.b(10);
        return cafVar;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new baf(new int[0]);
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        int[] iArr = ((baf) obj).a;
        ag2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.C(this.b, i2).y(iArr[i2]);
        }
    }
}
