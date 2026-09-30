package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ hq1(a26 a26Var, x16 x16Var, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(x16Var);
                break;
            default:
                a26Var.d(new c20(23, x16Var));
                break;
        }
        return wefVar;
    }
}
