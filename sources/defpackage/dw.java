package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dw(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((l4d) ((b41) obj)).c(j);
            case 1:
                ((a26) obj).d(Long.valueOf(j));
                return wefVar;
            case 2:
                rxb rxbVar = (rxb) obj;
                rxbVar.b(j);
                x6f x6fVarT = b21.T(300, 0, null, 6);
                rxbVar.a(x6fVarT, x6fVarT, new p25(rxbVar, 0));
                return wefVar;
            default:
                return new use((String) obj, j);
        }
    }
}
