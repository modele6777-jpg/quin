package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yl6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yic b;

    public /* synthetic */ yl6(yic yicVar, int i) {
        this.a = i;
        this.b = yicVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        yic yicVar = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                kv2.y(l1fVar, "btn", "seasonalReading", "pathway", "homepage");
                String strA = yicVar.a();
                if (strA != null) {
                    l1fVar.a(strA, "seasonal_period");
                }
                break;
            default:
                kv2.y(l1fVar, "btn", "seasonalReading", "pathway", "account");
                String strA2 = yicVar.a();
                if (strA2 != null) {
                    l1fVar.a(strA2, "seasonal_period");
                }
                break;
        }
        return wefVar;
    }
}
