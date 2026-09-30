package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class un0 implements lk9 {
    public static final un0 a = new un0();
    public static final rc5 b = rc5.a("rolloutId");
    public static final rc5 c = rc5.a("variantId");
    public static final rc5 d = rc5.a("parameterKey");
    public static final rc5 e = rc5.a("parameterValue");
    public static final rc5 f = rc5.a("templateVersion");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        j5c j5cVar = (j5c) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, ((aq0) j5cVar).b);
        aq0 aq0Var = (aq0) j5cVar;
        mk9Var.a(c, aq0Var.c);
        mk9Var.a(d, aq0Var.d);
        mk9Var.a(e, aq0Var.e);
        mk9Var.g(f, aq0Var.f);
    }
}
