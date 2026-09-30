package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp9 implements a26 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ double c;
    public final /* synthetic */ String d;

    public /* synthetic */ tp9(String str, String str2, double d, String str3) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        l1f l1fVar = (l1f) obj;
        kv2.y(l1fVar, "plan", this.a, "purchase_type", this.b);
        double d = this.c;
        l1fVar.a(Double.valueOf(d), "price");
        String str = this.d;
        l1fVar.a(str, "currency");
        l1fVar.a(Double.valueOf(d), "revenue_amount");
        l1fVar.a(str, "revenue_currency");
        return wef.a;
    }
}
