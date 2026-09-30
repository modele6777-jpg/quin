package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qh7 implements xn7 {
    public static final qh7 a = new qh7();
    public static final pyc b = eec.p("kotlinx.serialization.json.JsonElement", zia.d, new nyc[0], new tb7(6));

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        nh7 nh7Var = (nh7) obj;
        nh7Var.getClass();
        vd0.K(ev4Var);
        if (nh7Var instanceof yi7) {
            ev4Var.h(bj7.a, nh7Var);
            return;
        }
        if (nh7Var instanceof ti7) {
            ev4Var.h(wi7.a, nh7Var);
        } else if (nh7Var instanceof yg7) {
            ev4Var.h(ah7.a, nh7Var);
        } else {
            ap.c();
        }
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        return vd0.J(om3Var).m();
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
