package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nm0 implements lk9 {
    public static final nm0 a = new nm0();
    public static final rc5 b = new rc5("window", kv2.t(kv2.r(t0b.class, new qh0(1))));
    public static final rc5 c = new rc5("logSourceMetrics", kv2.t(kv2.r(t0b.class, new qh0(2))));
    public static final rc5 d = new rc5("globalMetrics", kv2.t(kv2.r(t0b.class, new qh0(3))));
    public static final rc5 e = new rc5("appNamespace", kv2.t(kv2.r(t0b.class, new qh0(4))));

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        z42 z42Var = (z42) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, z42Var.a);
        mk9Var.a(c, z42Var.b);
        mk9Var.a(d, z42Var.c);
        mk9Var.a(e, z42Var.d);
    }
}
