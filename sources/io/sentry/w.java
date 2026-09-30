package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements h1 {
    public static final ThreadLocal a = new ThreadLocal();

    @Override // io.sentry.h1
    public final l1 a(g1 g1Var) {
        g1 g1Var2 = get();
        a.set(g1Var);
        return new v(g1Var2);
    }

    @Override // io.sentry.h1
    public final void close() {
        a.remove();
    }

    @Override // io.sentry.h1
    public final g1 get() {
        return (g1) a.get();
    }
}
