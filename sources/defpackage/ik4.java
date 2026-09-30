package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l26 b;

    public /* synthetic */ ik4(int i, l26 l26Var) {
        this.a = i;
        this.b = l26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        l26 l26Var = this.b;
        switch (i) {
            case 0:
                oia oiaVar = (oia) obj;
                l26Var.z(oiaVar, new hl9(xo1.H(oiaVar, false)));
                oiaVar.a();
                break;
            case 1:
                oia oiaVar2 = (oia) obj;
                l26Var.z(oiaVar2, Float.valueOf(Float.intBitsToFloat((int) (xo1.H(oiaVar2, false) >> 32))));
                oiaVar2.a();
                break;
            case 2:
                oia oiaVar3 = (oia) obj;
                l26Var.z(oiaVar3, Float.valueOf(Float.intBitsToFloat((int) (xo1.H(oiaVar3, false) & 4294967295L))));
                oiaVar3.a();
                break;
            default:
                uz uzVar = (uz) obj;
                l26Var.z(uzVar.e.getValue(), xo1.g.b.d(uzVar.f));
                break;
        }
        return wefVar;
    }
}
