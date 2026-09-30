package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ki3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ ki3(e89 e89Var, e89 e89Var2, x16 x16Var) {
        this.a = 1;
        this.b = e89Var;
        this.c = e89Var2;
        this.d = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        e89 e89Var2 = this.b;
        x16 x16Var = this.d;
        switch (i) {
            case 0:
                int iOrdinal = ((xh3) e89Var2.getValue()).ordinal();
                if (iOrdinal == 0) {
                    return wefVar;
                }
                if (iOrdinal == 1) {
                    e89Var.setValue(Boolean.TRUE);
                    return wefVar;
                }
                if (iOrdinal == 2) {
                    return wefVar;
                }
                if (iOrdinal == 3) {
                    x16Var.invoke();
                    return wefVar;
                }
                ap.c();
                return null;
            case 1:
                return new nx9((o26) e89Var2.getValue(), (a26) e89Var.getValue(), ((Number) x16Var.invoke()).intValue());
            case 2:
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    x16Var.invoke();
                } else {
                    e89Var.setValue(Boolean.TRUE);
                }
                return wefVar;
            case 3:
                e89Var2.setValue(Boolean.FALSE);
                e89Var.setValue(Boolean.TRUE);
                x16Var.invoke();
                return wefVar;
            case 4:
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    x16Var.invoke();
                } else {
                    e89Var.setValue(Boolean.TRUE);
                }
                return wefVar;
            default:
                e89Var2.setValue(Boolean.FALSE);
                e89Var.setValue(Boolean.TRUE);
                x16Var.invoke();
                return wefVar;
        }
    }

    public /* synthetic */ ki3(x16 x16Var, e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.d = x16Var;
        this.b = e89Var;
        this.c = e89Var2;
    }
}
