package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ rj2(a26 a26Var, e89 e89Var, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                String str = (String) e89Var.getValue();
                if (str != null) {
                    a26Var.d(str);
                }
                break;
            case 1:
                Boolean bool = (Boolean) e89Var.getValue();
                bool.booleanValue();
                a26Var.d(bool);
                break;
            case 2:
                Boolean bool2 = (Boolean) e89Var.getValue();
                bool2.booleanValue();
                a26Var.d(bool2);
                break;
            default:
                e89Var.setValue(Boolean.FALSE);
                a26Var.d(q4b.a);
                break;
        }
        return wefVar;
    }
}
