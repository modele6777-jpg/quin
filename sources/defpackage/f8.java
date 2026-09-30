package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ f8(boolean z, e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = z;
        this.c = e89Var;
        this.d = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        e89 e89Var2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (!z) {
                    e89Var.setValue(Boolean.TRUE);
                } else {
                    e89Var2.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (z && !((Boolean) e89Var.getValue()).booleanValue()) {
                    e89Var.setValue(Boolean.TRUE);
                    ((x16) e89Var2.getValue()).invoke();
                }
                break;
        }
        return wefVar;
    }
}
