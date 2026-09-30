package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ao0 implements lk9 {
    public static final ao0 a = new ao0();
    public static final rc5 b = rc5.a("eventType");
    public static final rc5 c = rc5.a("sessionData");
    public static final rc5 d = rc5.a("applicationInfo");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        o0d o0dVar = (o0d) obj;
        mk9 mk9Var = (mk9) obj2;
        o0dVar.getClass();
        mk9Var.a(b, u05.SESSION_START);
        mk9Var.a(c, o0dVar.a);
        mk9Var.a(d, o0dVar.b);
    }
}
