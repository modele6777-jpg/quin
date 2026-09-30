package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l61 implements xn7 {
    public static final l61 a = new l61();
    public static final hua b = new hua("kotlin.Byte", fua.d);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ev4Var.l(((Number) obj).byteValue());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        return Byte.valueOf(om3Var.A());
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
