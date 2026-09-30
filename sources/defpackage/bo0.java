package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bo0 implements lk9 {
    public static final bo0 a = new bo0();
    public static final rc5 b = rc5.a("sessionId");
    public static final rc5 c = rc5.a("firstSessionId");
    public static final rc5 d = rc5.a("sessionIndex");
    public static final rc5 e = rc5.a("eventTimestampUs");
    public static final rc5 f = rc5.a("dataCollectionStatus");
    public static final rc5 g = rc5.a("firebaseInstallationId");
    public static final rc5 h = rc5.a("firebaseAuthenticationToken");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        u0d u0dVar = (u0d) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, u0dVar.a);
        mk9Var.a(c, u0dVar.b);
        mk9Var.e(d, u0dVar.c);
        mk9Var.g(e, u0dVar.d);
        mk9Var.a(f, u0dVar.e);
        mk9Var.a(g, u0dVar.f);
        mk9Var.a(h, u0dVar.g);
    }
}
