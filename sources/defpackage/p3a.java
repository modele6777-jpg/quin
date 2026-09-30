package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3a implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3a b;
    public final /* synthetic */ String c;

    public /* synthetic */ p3a(String str, y3a y3aVar) {
        this.a = 3;
        this.c = str;
        this.b = y3aVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        y3a y3aVar = this.b;
        String str = this.c;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                l1fVar.a(y3aVar.T0, "from");
                l1fVar.a(str, "plan");
                if9.o(l1fVar, y3aVar.S0);
                break;
            case 1:
                l1fVar.getClass();
                l1fVar.a("paywall_d", "pathway");
                l1fVar.a(y3aVar.T0, "triggered_by");
                l1fVar.a(str, "product_id");
                p5a p5aVar = y3aVar.S0;
                if9.o(l1fVar, p5aVar);
                if9.p(l1fVar, p5aVar);
                break;
            case 2:
                l1fVar.getClass();
                l1fVar.a(y3aVar.T0, "from");
                l1fVar.a(str, "plan");
                if9.o(l1fVar, y3aVar.S0);
                break;
            default:
                kv2.y(l1fVar, "product_id", str, "pathway", "paywall_d");
                l1fVar.a(y3aVar.T0, "triggered_by");
                p5a p5aVar2 = y3aVar.S0;
                if9.o(l1fVar, p5aVar2);
                if9.p(l1fVar, p5aVar2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ p3a(y3a y3aVar, String str, int i) {
        this.a = i;
        this.b = y3aVar;
        this.c = str;
    }
}
