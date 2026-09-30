package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ri7 implements xn7 {
    public static final ri7 a = new ri7();
    public static final pyc b = eec.q("kotlinx.serialization.json.JsonNull", ryc.c, new nyc[0]);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ((qi7) obj).getClass();
        vd0.K(ev4Var);
        ev4Var.f();
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        vd0.J(om3Var);
        if (om3Var.x()) {
            throw new lh7(kj0.b0("Expected 'null' literal", null, null, -1, null), "Expected 'null' literal", null, -1, null, null);
        }
        return qi7.INSTANCE;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
