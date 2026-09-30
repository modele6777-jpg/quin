package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sbc b;

    public /* synthetic */ nm1(sbc sbcVar, int i) {
        this.a = i;
        this.b = sbcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        sbc sbcVar = this.b;
        switch (i) {
            case 0:
                sbcVar.a();
                break;
            case 1:
                if (sbcVar != null) {
                    sbcVar.a();
                }
                break;
            case 2:
                if (sbcVar != null) {
                    sbcVar.a();
                }
                break;
            case 3:
                sbcVar.a();
                break;
            default:
                sbcVar.a();
                break;
        }
    }
}
