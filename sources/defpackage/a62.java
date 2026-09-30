package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a62 implements AutoCloseable, aw2 {
    public final pv2 a;

    public a62(pv2 pv2Var) {
        pv2Var.getClass();
        this.a = pv2Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        tq.n(this.a, null);
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        return this.a;
    }
}
