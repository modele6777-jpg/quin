package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.g {
    public final long d;
    public final boolean e;

    public i2(long j, io.sentry.z0 z0Var, long j2, boolean z) {
        super(j, z0Var);
        this.d = j2;
        this.e = z;
    }

    @Override // io.sentry.hints.b
    public final boolean a() {
        return this.e;
    }

    @Override // io.sentry.hints.c
    public final boolean f(io.sentry.protocol.w wVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void g(io.sentry.protocol.w wVar) {
    }
}
