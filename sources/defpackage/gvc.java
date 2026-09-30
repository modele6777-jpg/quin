package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gvc implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hvc b;

    public /* synthetic */ gvc(hvc hvcVar, int i) {
        this.a = i;
        this.b = hvcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        hvc hvcVar = this.b;
        switch (i) {
            case 0:
                return (bv7) hvcVar.d.c;
            case 1:
                return (ste) hvcVar.d.d;
            case 2:
                return (a08) hvcVar.d.b;
            default:
                return (bv7) hvcVar.d.c;
        }
    }
}
