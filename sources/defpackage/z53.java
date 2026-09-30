package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z53 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ z53(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "enter_reading", "pathway", "daily_card");
                l1fVar.a(str2, "source");
                l1fVar.a(str, "fortune_type");
                return wefVar;
            case 1:
                exc.f((hxc) obj, str2 + ", " + str);
                return wefVar;
            case 2:
                e95 e95Var = (e95) obj;
                e95Var.getClass();
                if (str2 == null) {
                    str2 = e95Var.g;
                } else {
                    if (v4e.Q(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = e95Var.g;
                    }
                }
                String str3 = str2;
                il ilVar = il.a;
                return e95.a(e95Var, str3, this.c, null, 0, null, il.a(), 7999);
            case 3:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "product_id", str2, "triggered_by", "four_seasons");
                l1fVar2.a(str, "seasonal_period");
                return wefVar;
            case 4:
                kv2.y((l1f) obj, "plan", str2, "error_code", str);
                return wefVar;
            default:
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "btn", str2, "pathway", "app_update_popup");
                l1fVar3.a(str, "upgrade_type");
                return wefVar;
        }
    }
}
