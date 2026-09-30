package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r77 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ p5a e;
    public final /* synthetic */ e89 f;

    public /* synthetic */ r77(x16 x16Var, String str, String str2, p5a p5aVar, e89 e89Var, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = str;
        this.d = str2;
        this.e = p5aVar;
        this.f = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                r05 r05Var = new r05("paywall_action");
                final int i2 = 1;
                final String str = this.c;
                final String str2 = this.d;
                final p5a p5aVar = this.e;
                final e89 e89Var = this.f;
                x1f.k(r05Var, new a26() { // from class: s77
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i3 = i2;
                        wef wefVar2 = wef.a;
                        e89 e89Var2 = e89Var;
                        p5a p5aVar2 = p5aVar;
                        String str3 = str2;
                        String str4 = str;
                        l1f l1fVar = (l1f) obj;
                        kv2.y(l1fVar, "action", "close", "pathway", "paywall_intercept");
                        switch (i3) {
                            case 0:
                                l1fVar.a(str4, "triggered_by");
                                String str5 = (String) e89Var2.getValue();
                                if (str5 != null) {
                                    l1fVar.a(str5, "product_id");
                                }
                                if (str3 != null) {
                                    l1fVar.a(str3, "blocked_reason");
                                }
                                if9.o(l1fVar, p5aVar2);
                                if9.p(l1fVar, p5aVar2);
                                break;
                            default:
                                l1fVar.a(str4, "triggered_by");
                                String str6 = (String) e89Var2.getValue();
                                if (str6 != null) {
                                    l1fVar.a(str6, "product_id");
                                }
                                if (str3 != null) {
                                    l1fVar.a(str3, "blocked_reason");
                                }
                                if9.o(l1fVar, p5aVar2);
                                if9.p(l1fVar, p5aVar2);
                                break;
                        }
                        return wefVar2;
                    }
                }, 2);
                x16Var.invoke();
                break;
            default:
                x1f x1fVar2 = x1f.a;
                r05 r05Var2 = new r05("paywall_action");
                final int i3 = 0;
                final String str3 = this.c;
                final String str4 = this.d;
                final p5a p5aVar2 = this.e;
                final e89 e89Var2 = this.f;
                x1f.k(r05Var2, new a26() { // from class: s77
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i4 = i3;
                        wef wefVar2 = wef.a;
                        e89 e89Var3 = e89Var2;
                        p5a p5aVar3 = p5aVar2;
                        String str5 = str4;
                        String str6 = str3;
                        l1f l1fVar = (l1f) obj;
                        kv2.y(l1fVar, "action", "close", "pathway", "paywall_intercept");
                        switch (i4) {
                            case 0:
                                l1fVar.a(str6, "triggered_by");
                                String str7 = (String) e89Var3.getValue();
                                if (str7 != null) {
                                    l1fVar.a(str7, "product_id");
                                }
                                if (str5 != null) {
                                    l1fVar.a(str5, "blocked_reason");
                                }
                                if9.o(l1fVar, p5aVar3);
                                if9.p(l1fVar, p5aVar3);
                                break;
                            default:
                                l1fVar.a(str6, "triggered_by");
                                String str8 = (String) e89Var3.getValue();
                                if (str8 != null) {
                                    l1fVar.a(str8, "product_id");
                                }
                                if (str5 != null) {
                                    l1fVar.a(str5, "blocked_reason");
                                }
                                if9.o(l1fVar, p5aVar3);
                                if9.p(l1fVar, p5aVar3);
                                break;
                        }
                        return wefVar2;
                    }
                }, 2);
                x16Var.invoke();
                break;
        }
        return wefVar;
    }
}
