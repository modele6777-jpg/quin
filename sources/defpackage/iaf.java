package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iaf extends eua {
    public static final iaf c = new iaf(jaf.a);

    @Override // defpackage.e1
    public final int i(Object obj) {
        return ((gaf) obj).a.length;
    }

    @Override // defpackage.q72, defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        haf hafVar = (haf) obj;
        hafVar.getClass();
        long jW = zf2Var.e(this.b, i).w();
        hafVar.b(hafVar.d() + 1);
        long[] jArr = hafVar.a;
        int i2 = hafVar.b;
        hafVar.b = i2 + 1;
        jArr[i2] = jW;
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        long[] jArr = ((gaf) obj).a;
        haf hafVar = new haf();
        hafVar.a = jArr;
        hafVar.b = jArr.length;
        hafVar.b(10);
        return hafVar;
    }

    @Override // defpackage.eua
    public final Object o() {
        return new gaf(new long[0]);
    }

    @Override // defpackage.eua
    public final void p(ag2 ag2Var, Object obj, int i) {
        long[] jArr = ((gaf) obj).a;
        ag2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ag2Var.C(this.b, i2).B(jArr[i2]);
        }
    }
}
