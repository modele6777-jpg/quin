package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d39 implements qa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ d39(e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = e89Var;
        this.c = e89Var2;
    }

    @Override // defpackage.qa4
    public final void a() {
        a26 a26Var;
        int i = this.a;
        e89 e89Var = this.c;
        e89 e89Var2 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    ((a26) e89Var.getValue()).d(Boolean.FALSE);
                }
                break;
            default:
                if (((Boolean) e89Var2.getValue()).booleanValue() && (a26Var = (a26) e89Var.getValue()) != null) {
                    a26Var.d(Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
