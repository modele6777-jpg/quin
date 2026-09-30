package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i83 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ i83(int i, x16 x16Var, e89 e89Var, int i2) {
        this.a = i2;
        this.b = i;
        this.c = x16Var;
        this.d = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        x16 x16Var = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    ndc.m(i2, "close");
                    x16Var.invoke();
                }
                break;
            case 1:
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    ndc.m(i2, "close");
                    x16Var.invoke();
                }
                break;
            default:
                if (!((Boolean) e89Var.getValue()).booleanValue()) {
                    ndc.m(i2, "notification_setup_later");
                    x16Var.invoke();
                }
                break;
        }
        return wefVar;
    }
}
