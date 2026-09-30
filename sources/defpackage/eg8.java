package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eg8 implements xn7 {
    public static final eg8 a = new eg8();
    public static final hua b = new hua("kotlin.Long", fua.i);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ev4Var.B(((Number) obj).longValue());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        return Long.valueOf(om3Var.w());
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
