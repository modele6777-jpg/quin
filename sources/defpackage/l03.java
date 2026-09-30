package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l03 implements h3f {
    public final int b;

    public l03(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        qc0.j("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.h3f
    public final m3f a(ah0 ah0Var, zw6 zw6Var) {
        if (zw6Var instanceof k8e) {
            return ((k8e) zw6Var).c == zb3.a ? new qg9(ah0Var, zw6Var) : new m03(ah0Var, zw6Var, this.b);
        }
        return new qg9(ah0Var, zw6Var);
    }
}
