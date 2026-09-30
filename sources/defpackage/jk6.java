package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jk6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ zb4 c;

    public /* synthetic */ jk6(a26 a26Var, zb4 zb4Var, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = zb4Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        zb4 zb4Var = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(zb4Var);
                break;
            case 1:
                a26Var.d(zb4Var.j);
                break;
            default:
                a26Var.d(zb4Var.i);
                break;
        }
        return wefVar;
    }
}
