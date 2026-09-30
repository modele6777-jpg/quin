package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p08 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r08 b;

    public /* synthetic */ p08(r08 r08Var, int i) {
        this.a = i;
        this.b = r08Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        r08 r08Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(r08Var.E0.b());
            case 1:
                return Float.valueOf(r08Var.E0.d());
            default:
                return Float.valueOf(r08Var.E0.a() - r08Var.E0.c());
        }
    }
}
