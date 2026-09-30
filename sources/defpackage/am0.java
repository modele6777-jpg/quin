package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class am0 implements lk9 {
    public static final am0 a = new am0();
    public static final rc5 b = rc5.a("sdkVersion");
    public static final rc5 c = rc5.a("model");
    public static final rc5 d = rc5.a("hardware");
    public static final rc5 e = rc5.a("device");
    public static final rc5 f = rc5.a("product");
    public static final rc5 g = rc5.a("osBuild");
    public static final rc5 h = rc5.a("manufacturer");
    public static final rc5 i = rc5.a("fingerprint");
    public static final rc5 j = rc5.a("locale");
    public static final rc5 k = rc5.a("country");
    public static final rc5 l = rc5.a("mccMnc");
    public static final rc5 m = rc5.a("applicationBuild");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        qp qpVar = (qp) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, ((do0) qpVar).a);
        do0 do0Var = (do0) qpVar;
        mk9Var.a(c, do0Var.b);
        mk9Var.a(d, do0Var.c);
        mk9Var.a(e, do0Var.d);
        mk9Var.a(f, do0Var.e);
        mk9Var.a(g, do0Var.f);
        mk9Var.a(h, do0Var.g);
        mk9Var.a(i, do0Var.h);
        mk9Var.a(j, do0Var.i);
        mk9Var.a(k, do0Var.j);
        mk9Var.a(l, do0Var.k);
        mk9Var.a(m, do0Var.l);
    }
}
