package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n43 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ String c;

    public /* synthetic */ n43(int i, a26 a26Var, String str) {
        this.a = i;
        this.b = a26Var;
        this.c = str;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new cz1(26), 2);
                a26Var.d(new n33(str));
                break;
            case 1:
                a26Var.d(str);
                break;
            case 2:
                a26Var.d(t72.c0(str));
                break;
            case 3:
                if (a26Var != null) {
                    a26Var.d(str);
                }
                break;
            case 4:
                if (a26Var != null) {
                    a26Var.d(str);
                }
                break;
            case 5:
                a26Var.d(str);
                break;
            default:
                a26Var.d(str);
                break;
        }
        return wefVar;
    }
}
