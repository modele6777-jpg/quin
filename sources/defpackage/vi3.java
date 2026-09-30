package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vi3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ vi3(e89 e89Var, e89 e89Var2, e89 e89Var3, int i) {
        this.a = i;
        this.b = e89Var;
        this.c = e89Var2;
        this.d = e89Var3;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        e89 e89Var2 = this.c;
        e89 e89Var3 = this.b;
        switch (i) {
            case 0:
                e89Var3.setValue(xh3.a);
                Boolean bool = Boolean.FALSE;
                e89Var2.setValue(bool);
                e89Var.setValue(bool);
                break;
            default:
                if (((et1) e89Var3.getValue()) == et1.b) {
                    e89Var3.setValue(et1.a);
                    e89Var2.setValue(null);
                    ((x16) e89Var.getValue()).invoke();
                }
                break;
        }
        return wefVar;
    }
}
