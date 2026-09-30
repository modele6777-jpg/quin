package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iae b;

    public /* synthetic */ dae(iae iaeVar, int i) {
        this.a = i;
        this.b = iaeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        iae iaeVar = this.b;
        switch (i) {
            case 0:
                ((ah6) ok8.w()).execute(new dae(iaeVar, 1));
                break;
            default:
                if (!iaeVar.n) {
                    iaeVar.d();
                }
                break;
        }
    }
}
