package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ p5a d;

    public /* synthetic */ vg(String str, String str2, p5a p5aVar, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = p5aVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        p5a p5aVar = this.d;
        String str = this.c;
        String str2 = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                kv2.y(l1fVar, "action", "close", "pathway", "paywall_a");
                l1fVar.a(str2, "triggered_by");
                if (str != null) {
                    l1fVar.a(str, "blocked_reason");
                }
                if9.o(l1fVar, p5aVar);
                break;
            case 1:
                kv2.y(l1fVar, "action", "close", "pathway", "paywall_a");
                l1fVar.a(str2, "triggered_by");
                if (str != null) {
                    l1fVar.a(str, "blocked_reason");
                }
                if9.o(l1fVar, p5aVar);
                break;
            case 2:
                l1fVar.a("add_on_paywall", "popup");
                l1fVar.a("paywall_a", "pathway");
                l1fVar.a(str2, "triggered_by");
                if (str != null) {
                    l1fVar.a(str, "blocked_reason");
                }
                if9.o(l1fVar, p5aVar);
                break;
            default:
                kv2.y(l1fVar, "popup", "paywall_intercept", "pathway", "paywall_intercept");
                l1fVar.a(str2, "triggered_by");
                if (str != null) {
                    l1fVar.a(str, "blocked_reason");
                }
                if9.o(l1fVar, p5aVar);
                if9.p(l1fVar, p5aVar);
                break;
        }
        return wefVar;
    }
}
