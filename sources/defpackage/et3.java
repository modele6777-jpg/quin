package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wae b;

    public /* synthetic */ et3(wae waeVar, int i) {
        this.a = i;
        this.b = waeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wae waeVar = this.b;
        switch (i) {
            case 0:
                waeVar.c();
                break;
            default:
                waeVar.f.cancel(true);
                break;
        }
    }
}
