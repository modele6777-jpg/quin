package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ch9 implements xn7 {
    public static final ch9 a = new ch9();
    public static final bh9 b = bh9.a;

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ((Void) obj).getClass();
        throw new yyc("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        throw new yyc("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
