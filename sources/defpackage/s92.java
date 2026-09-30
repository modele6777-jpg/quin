package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s92 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ atb b;
    public final /* synthetic */ qtb c;

    public /* synthetic */ s92(atb atbVar, qtb qtbVar, int i) {
        this.a = i;
        this.b = atbVar;
        this.c = qtbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E(this.c);
                break;
            case 1:
                this.b.u(this.c);
                break;
            default:
                this.b.U(this.c);
                break;
        }
    }
}
