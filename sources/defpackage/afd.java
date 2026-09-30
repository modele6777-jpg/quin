package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class afd implements xn7 {
    public static final afd a = new afd();
    public static final hua b = new hua("kotlin.Short", fua.j);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ev4Var.j(((Number) obj).shortValue());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        return Short.valueOf(om3Var.B());
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
