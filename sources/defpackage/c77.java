package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c77 implements xn7 {
    public static final c77 a = new c77();
    public static final hua b = new hua("kotlin.Int", fua.h);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ev4Var.y(((Number) obj).intValue());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        return Integer.valueOf(om3Var.p());
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
