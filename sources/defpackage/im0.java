package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class im0 implements lk9 {
    public static final im0 a = new im0();
    public static final rc5 b = rc5.a("requestTimeMs");
    public static final rc5 c = rc5.a("requestUptimeMs");
    public static final rc5 d = rc5.a("clientInfo");
    public static final rc5 e = rc5.a("logSource");
    public static final rc5 f = rc5.a("logSourceName");
    public static final rc5 g = rc5.a("logEvent");
    public static final rc5 h = rc5.a("qosTier");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        ye8 ye8Var = (ye8) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.g(b, ((np0) ye8Var).a);
        np0 np0Var = (np0) ye8Var;
        mk9Var.g(c, np0Var.b);
        mk9Var.a(d, np0Var.c);
        mk9Var.a(e, np0Var.d);
        mk9Var.a(f, np0Var.e);
        mk9Var.a(g, np0Var.f);
        mk9Var.a(h, w3b.DEFAULT);
    }
}
