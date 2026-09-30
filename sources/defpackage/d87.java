package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d87 implements a26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ g87 c;

    public /* synthetic */ d87(g87 g87Var, String str) {
        this.c = g87Var;
        this.b = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        g87 g87Var = this.c;
        String str = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                l1fVar.a("paywall_intercept", "pathway");
                l1fVar.a(g87Var.T0, "triggered_by");
                l1fVar.a(str, "product_id");
                p5a p5aVar = g87Var.S0;
                if9.o(l1fVar, p5aVar);
                if9.p(l1fVar, p5aVar);
                break;
            default:
                kv2.y(l1fVar, "product_id", str, "pathway", "paywall_intercept");
                l1fVar.a(g87Var.T0, "triggered_by");
                p5a p5aVar2 = g87Var.S0;
                if9.o(l1fVar, p5aVar2);
                if9.p(l1fVar, p5aVar2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ d87(String str, g87 g87Var) {
        this.b = str;
        this.c = g87Var;
    }
}
