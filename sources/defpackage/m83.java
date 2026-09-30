package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m83 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ m83(int i, int i2, x16 x16Var) {
        this.a = i2;
        this.b = i;
        this.c = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                ndc.m(i2, "daily_reminder_confirm");
                x16Var.invoke();
                return wefVar;
            case 1:
                ndc.m(i2, "notification_setup_later");
                x16Var.invoke();
                return wefVar;
            case 2:
                ndc.m(i2, "close");
                x16Var.invoke();
                return wefVar;
            case 3:
                ndc.m(i2, "close");
                x16Var.invoke();
                return wefVar;
            default:
                return new cs3(i2, 0.0f, x16Var);
        }
    }
}
