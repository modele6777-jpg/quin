package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pm0 implements lk9 {
    public static final pm0 a = new pm0();
    public static final rc5 b = new rc5("eventsDroppedCount", kv2.t(kv2.r(t0b.class, new qh0(1))));
    public static final rc5 c = new rc5("reason", kv2.t(kv2.r(t0b.class, new qh0(3))));

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        we8 we8Var = (we8) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.g(b, we8Var.a);
        mk9Var.a(c, we8Var.b);
    }
}
