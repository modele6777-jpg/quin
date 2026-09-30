package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fre implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ fre(aw2 aw2Var, a26 a26Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = a26Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        dw2 dw2Var = dw2.d;
        a26 a26Var = this.c;
        aw2 aw2Var = this.b;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, dw2Var, new kre(null, a26Var), 1);
                break;
            default:
                ynb.V(aw2Var, null, dw2Var, new qse(null, a26Var), 1);
                break;
        }
        return wefVar;
    }
}
