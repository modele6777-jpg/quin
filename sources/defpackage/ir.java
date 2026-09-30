package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ir implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u84 b;

    public /* synthetic */ ir(u84 u84Var, int i) {
        this.a = i;
        this.b = u84Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        u84 u84Var = this.b;
        switch (i) {
            case 0:
                u84Var.show();
                return new lf(1, u84Var);
            default:
                if (u84Var.f.a) {
                    u84Var.e.invoke();
                }
                return wef.a;
        }
    }
}
