package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb2 b;

    public /* synthetic */ mb2(vb2 vb2Var, int i) {
        this.a = i;
        this.b = vb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vb2 vb2Var = this.b;
        switch (i) {
            case 0:
                vb2Var.invalidateOptionsMenu();
                break;
            default:
                vb2.o(vb2Var);
                break;
        }
    }
}
