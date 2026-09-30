package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d57 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cea c;
    public final /* synthetic */ int d;

    public /* synthetic */ d57(int i, int i2, cea ceaVar) {
        this.a = 1;
        this.b = i;
        this.c = ceaVar;
        this.d = i2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        int i3 = this.b;
        cea ceaVar = this.c;
        bea beaVar = (bea) obj;
        switch (i) {
            case 0:
                beaVar.g(ceaVar, i3, i2, 0.0f);
                break;
            case 1:
                beaVar.g(ceaVar, ym8.L((i3 - ceaVar.a) / 2.0f), ym8.L((i2 - ceaVar.b) / 2.0f), 0.0f);
                break;
            default:
                beaVar.g(ceaVar, i3, i2, 0.0f);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ d57(cea ceaVar, int i, int i2, int i3) {
        this.a = i3;
        this.c = ceaVar;
        this.b = i;
        this.d = i2;
    }
}
