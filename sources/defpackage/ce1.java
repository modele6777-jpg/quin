package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ he1 b;
    public final /* synthetic */ qtb c;

    public /* synthetic */ ce1(he1 he1Var, ge1 ge1Var, qtb qtbVar, int i) {
        this.a = i;
        this.b = he1Var;
        this.c = qtbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(ge1.c(this.c));
                break;
            default:
                this.b.a(ge1.c(this.c));
                break;
        }
    }
}
