package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f20 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ e89 d;
    public final /* synthetic */ e89 e;

    public /* synthetic */ f20(boolean z, x16 x16Var, e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = z;
        this.c = x16Var;
        this.d = e89Var;
        this.e = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.e;
        e89 e89Var2 = this.d;
        x16 x16Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (!z) {
                    e89Var2.setValue(new c20(3, x16Var));
                    e89Var.setValue(Boolean.TRUE);
                } else {
                    x16Var.invoke();
                }
                break;
            default:
                e89Var2.setValue(Boolean.FALSE);
                e89Var.setValue(Boolean.TRUE);
                if (z) {
                    x16Var.invoke();
                }
                break;
        }
        return wefVar;
    }
}
