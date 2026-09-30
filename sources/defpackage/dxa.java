package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dxa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lxa b;

    public /* synthetic */ dxa(lxa lxaVar, int i) {
        this.a = i;
        this.b = lxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lxa lxaVar = this.b;
        switch (i) {
            case 0:
                lxaVar.b1 = true;
                break;
            case 1:
                lxaVar.v();
                break;
            default:
                if (!lxaVar.h1) {
                    tp8 tp8Var = lxaVar.G0;
                    tp8Var.getClass();
                    tp8Var.j(lxaVar);
                }
                break;
        }
    }
}
