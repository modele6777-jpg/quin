package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q20 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ q20(a26 a26Var, e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = e89Var;
        this.d = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        e89 e89Var2 = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                e89Var2.setValue(Boolean.FALSE);
                a26Var.d(Boolean.TRUE);
                x16 x16Var = (x16) e89Var.getValue();
                if (x16Var != null) {
                    x16Var.invoke();
                }
                break;
            default:
                e89Var2.setValue(Boolean.FALSE);
                a26Var.d(Boolean.TRUE);
                x16 x16Var2 = (x16) e89Var.getValue();
                if (x16Var2 != null) {
                    x16Var2.invoke();
                }
                break;
        }
        return wefVar;
    }
}
