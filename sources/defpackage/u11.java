package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u11 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk8 b;

    public /* synthetic */ u11(yk8 yk8Var, int i) {
        this.a = i;
        this.b = yk8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() throws Exception {
        int i = this.a;
        wef wefVar = wef.a;
        yk8 yk8Var = this.b;
        switch (i) {
            case 0:
                yk8Var.y("android.permission.CAMERA", null);
                break;
            case 1:
                q6.m();
                q6.m();
                qda qdaVar = new qda();
                qdaVar.a = bf.a;
                q6.m();
                qdaVar.a = cf.a;
                yk8Var.y(qdaVar, null);
                break;
            case 2:
                yk8Var.y("android.permission.CAMERA", null);
                break;
            case 3:
                yk8Var.y("android.permission.CAMERA", null);
                break;
            default:
                yk8Var.y("android.permission.WRITE_EXTERNAL_STORAGE", null);
                break;
        }
        return wefVar;
    }
}
