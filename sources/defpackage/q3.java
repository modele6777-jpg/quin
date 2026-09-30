package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ q3(g4 g4Var, int i) {
        this.a = i;
        this.b = g4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean zS;
        int i = this.a;
        g4 g4Var = this.b;
        switch (i) {
            case 0:
                zS = g4Var.s(obj);
                break;
            case 1:
                zS = g4Var.r(obj);
                break;
            default:
                zS = g4Var.s(obj);
                break;
        }
        return Boolean.valueOf(zS);
    }
}
