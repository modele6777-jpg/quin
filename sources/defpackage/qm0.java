package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qm0 implements lk9 {
    public static final qm0 a = new qm0();
    public static final rc5 b = new rc5("logSource", kv2.t(kv2.r(t0b.class, new qh0(1))));
    public static final rc5 c = new rc5("logEventDropped", kv2.t(kv2.r(t0b.class, new qh0(2))));

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        ze8 ze8Var = (ze8) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, ze8Var.a);
        mk9Var.a(c, ze8Var.b);
    }
}
