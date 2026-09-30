package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements c1 {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.c1
    public final void a(o3 o3Var) {
        Runtime runtime = this.a;
        o3Var.c = runtime.totalMemory() - runtime.freeMemory();
        o3Var.d = true;
    }

    @Override // io.sentry.c1
    public final void c() {
    }
}
