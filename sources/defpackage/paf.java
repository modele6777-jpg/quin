package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class paf extends eua {
    public static final paf c = new paf(qaf.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        return ((naf) obj).a.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        oaf oafVar = (oaf) obj;
        oafVar.getClass();
        short sB = zf2Var.e(this.b, i).B();
        oafVar.b(oafVar.d() + 1);
        short[] sArr = oafVar.a;
        int i2 = oafVar.b;
        oafVar.b = i2 + 1;
        sArr[i2] = sB;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        short[] sArr = ((naf) obj).a;
        oaf oafVar = new oaf();
        oafVar.a = sArr;
        oafVar.b = sArr.length;
        oafVar.b(10);
        return oafVar;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new naf(new short[0]);
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        short[] sArr = ((naf) obj).a;
        ag2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.C(this.b, i2).j(sArr[i2]);
        }
    }
}
