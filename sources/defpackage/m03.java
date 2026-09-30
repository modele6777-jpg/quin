package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m03 implements m3f {
    public final zw6 a;
    public final int b;

    public m03(ah0 ah0Var, zw6 zw6Var, int i) {
        this.a = zw6Var;
        this.b = i;
        if (i > 0) {
            return;
        }
        qc0.j("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.m3f
    public final void a() {
        zw6 zw6Var = this.a;
        if (zw6Var.r() != null) {
            cva.f();
            return;
        }
        boolean z = zw6Var instanceof k8e;
        d03 d03Var = new d03(zw6Var.h().p, this.b, (z && ((k8e) zw6Var).g) ? false : true);
        if (z) {
            y7h.k(d03Var);
        } else if (zw6Var instanceof ly4) {
            y7h.k(d03Var);
        } else {
            ap.c();
        }
    }
}
