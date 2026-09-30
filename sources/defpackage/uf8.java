package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf8 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qne b;

    public /* synthetic */ uf8(qne qneVar, int i) {
        this.a = i;
        this.b = qneVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        qne qneVar = this.b;
        switch (i) {
            case 0:
                qneVar.a(((hl9) obj).a, gec.c);
                break;
            case 1:
                oia oiaVar = (oia) obj;
                qneVar.e(xo1.H(oiaVar, false));
                oiaVar.a();
                break;
            default:
                oia oiaVar2 = (oia) obj;
                qneVar.e(xo1.H(oiaVar2, false));
                oiaVar2.a();
                break;
        }
        return wefVar;
    }
}
