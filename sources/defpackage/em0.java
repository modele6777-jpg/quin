package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class em0 implements lk9 {
    public static final em0 a = new em0();
    public static final rc5 b = rc5.a("clearBlob");
    public static final rc5 c = rc5.a("encryptedBlob");

    @Override // defpackage.fv4
    public final void encode(Object obj, Object obj2) {
        q55 q55Var = (q55) obj;
        mk9 mk9Var = (mk9) obj2;
        mk9Var.a(b, ((zo0) q55Var).a);
        mk9Var.a(c, ((zo0) q55Var).b);
    }
}
