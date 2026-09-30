package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hae b;

    public /* synthetic */ cae(hae haeVar, int i) {
        this.a = i;
        this.b = haeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        hae haeVar = this.b;
        switch (i) {
            case 0:
                haeVar.a();
                break;
            case 1:
                haeVar.b();
                break;
            default:
                oae oaeVar = haeVar.q;
                if (oaeVar != null) {
                    oaeVar.l();
                }
                if (haeVar.p == null) {
                    haeVar.o.c();
                }
                haeVar.p = null;
                break;
        }
    }
}
