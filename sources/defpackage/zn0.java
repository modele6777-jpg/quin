package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zn0 implements lk9 {
    public static final zn0 a = new zn0();
    public static final rc5 b = rc5.a("processName");
    public static final rc5 c = rc5.a("pid");
    public static final rc5 d = rc5.a("importance");
    public static final rc5 e = rc5.a("defaultProcess");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        jva jvaVar = (jva) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, jvaVar.a);
        mk9Var.e(c, jvaVar.b);
        mk9Var.e(d, jvaVar.c);
        mk9Var.d(e, jvaVar.d);
    }
}
