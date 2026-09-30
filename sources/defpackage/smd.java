package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class smd implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ and b;
    public final /* synthetic */ String c;

    public /* synthetic */ smd(and andVar, String str, int i) {
        this.a = i;
        this.b = andVar;
        this.c = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        String str;
        int i = this.a;
        wef wefVar = wef.a;
        String str2 = this.c;
        and andVar = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                l1fVar.a("purchase", "btn");
                l1fVar.a(andVar.g1.a(), "pathway");
                l1fVar.a(str2, "product_id");
                break;
            case 1:
                l1fVar.getClass();
                String str3 = (String) andVar.h1.get(str2);
                if (str3 == null) {
                    str3 = str2;
                }
                l1fVar.a(str3, "product_id");
                l1fVar.a(andVar.g1.a(), "pathway");
                String strX = andVar.X(str2);
                if (strX != null) {
                    str = v4e.Q(strX) ? null : strX;
                    if (str != null) {
                        l1fVar.a(str, "currency");
                    }
                }
                break;
            default:
                l1fVar.getClass();
                String str4 = (String) andVar.h1.get(str2);
                if (str4 == null) {
                    str4 = str2;
                }
                l1fVar.a(str4, "product_id");
                l1fVar.a(andVar.g1.a(), "pathway");
                String strX2 = andVar.X(str2);
                if (strX2 != null) {
                    str = v4e.Q(strX2) ? null : strX2;
                    if (str != null) {
                        l1fVar.a(str, "currency");
                    }
                }
                break;
        }
        return wefVar;
    }
}
