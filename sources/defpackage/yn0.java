package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yn0 implements lk9 {
    public static final yn0 a = new yn0();
    public static final rc5 b = rc5.a("performance");
    public static final rc5 c = rc5.a("crashlytics");
    public static final rc5 d = rc5.a("sessionSamplingRate");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        gb3 gb3Var = (gb3) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, gb3Var.a);
        mk9Var.a(c, gb3Var.b);
        mk9Var.f(d, gb3Var.c);
    }
}
