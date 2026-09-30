package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rm0 implements lk9 {
    public static final rm0 a = new rm0();
    public static final rc5 b = new rc5("projectNumber", kv2.t(kv2.r(t0b.class, new qh0(1))));
    public static final rc5 c = new rc5("messageId", kv2.t(kv2.r(t0b.class, new qh0(2))));
    public static final rc5 d = new rc5("instanceId", kv2.t(kv2.r(t0b.class, new qh0(3))));
    public static final rc5 e = new rc5("messageType", kv2.t(kv2.r(t0b.class, new qh0(4))));
    public static final rc5 f = new rc5("sdkPlatform", kv2.t(kv2.r(t0b.class, new qh0(5))));
    public static final rc5 g = new rc5("packageName", kv2.t(kv2.r(t0b.class, new qh0(6))));
    public static final rc5 h = new rc5("collapseKey", kv2.t(kv2.r(t0b.class, new qh0(7))));
    public static final rc5 i = new rc5("priority", kv2.t(kv2.r(t0b.class, new qh0(8))));
    public static final rc5 j = new rc5("ttl", kv2.t(kv2.r(t0b.class, new qh0(9))));
    public static final rc5 k = new rc5("topic", kv2.t(kv2.r(t0b.class, new qh0(10))));
    public static final rc5 l = new rc5("bulkId", kv2.t(kv2.r(t0b.class, new qh0(11))));
    public static final rc5 m = new rc5("event", kv2.t(kv2.r(t0b.class, new qh0(12))));
    public static final rc5 n = new rc5("analyticsLabel", kv2.t(kv2.r(t0b.class, new qh0(13))));
    public static final rc5 o = new rc5("campaignId", kv2.t(kv2.r(t0b.class, new qh0(14))));
    public static final rc5 p = new rc5("composerLabel", kv2.t(kv2.r(t0b.class, new qh0(15))));

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        ou8 ou8Var = (ou8) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.g(b, ou8Var.a);
        mk9Var.a(c, ou8Var.b);
        mk9Var.a(d, ou8Var.c);
        mk9Var.a(e, ou8Var.d);
        mk9Var.a(f, nu8.ANDROID);
        mk9Var.a(g, ou8Var.e);
        mk9Var.a(h, ou8Var.f);
        mk9Var.e(i, ou8Var.g);
        mk9Var.e(j, ou8Var.h);
        mk9Var.a(k, ou8Var.i);
        mk9Var.g(l, 0L);
        mk9Var.a(m, lu8.MESSAGE_DELIVERED);
        mk9Var.a(n, ou8Var.j);
        mk9Var.g(o, 0L);
        mk9Var.a(p, ou8Var.k);
    }
}
