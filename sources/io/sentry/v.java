package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements l1 {
    public final g1 a;

    public v(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        w.a.set(this.a);
    }
}
