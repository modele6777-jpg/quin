package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p25 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rxb b;

    public /* synthetic */ p25(rxb rxbVar, int i) {
        this.a = i;
        this.b = rxbVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        rxb rxbVar = this.b;
        switch (i) {
            case 0:
                n3d.r(rxbVar, 42.0f);
                n3d.f(rxbVar, 4.0f, y72.e);
                break;
            default:
                rxbVar.e((byte) 22, rxbVar.z, rxbVar.X);
                a6e a6eVar = rxbVar.c;
                if (a6eVar != null) {
                    a6eVar.a |= 4194304;
                    a6eVar.I = 0.92f;
                }
                rxbVar.e((byte) 23, rxbVar.z, rxbVar.X);
                a6e a6eVar2 = rxbVar.c;
                if (a6eVar2 != null) {
                    a6eVar2.a |= 8388608;
                    a6eVar2.J = 0.92f;
                }
                break;
        }
        return wefVar;
    }
}
