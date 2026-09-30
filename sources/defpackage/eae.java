package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu3 b;

    public /* synthetic */ eae(lu3 lu3Var, int i) {
        this.a = i;
        this.b = lu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lu3 lu3Var = this.b;
        switch (i) {
            case 0:
                lu3Var.a();
                break;
            default:
                lu3Var.b();
                break;
        }
    }
}
