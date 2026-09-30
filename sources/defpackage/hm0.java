package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hm0 implements lk9 {
    public static final hm0 a = new hm0();
    public static final rc5 b = rc5.a("eventTimeMs");
    public static final rc5 c = rc5.a("eventCode");
    public static final rc5 d = rc5.a("complianceData");
    public static final rc5 e = rc5.a("eventUptimeMs");
    public static final rc5 f = rc5.a("sourceExtension");
    public static final rc5 g = rc5.a("sourceExtensionJsonProto3");
    public static final rc5 h = rc5.a("timezoneOffsetSeconds");
    public static final rc5 i = rc5.a("networkConnectionInfo");
    public static final rc5 j = rc5.a("experimentIds");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        ue8 ue8Var = (ue8) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.g(b, ((mp0) ue8Var).a);
        mp0 mp0Var = (mp0) ue8Var;
        mk9Var.a(c, mp0Var.b);
        mk9Var.a(d, mp0Var.c);
        mk9Var.g(e, mp0Var.d);
        mk9Var.a(f, mp0Var.e);
        mk9Var.a(g, mp0Var.f);
        mk9Var.g(h, mp0Var.g);
        mk9Var.a(i, mp0Var.h);
        mk9Var.a(j, mp0Var.i);
    }
}
