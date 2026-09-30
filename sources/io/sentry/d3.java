package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements k1 {
    public static final d3 a = new d3();

    @Override // io.sentry.k1
    public final boolean isClosed() {
        return false;
    }

    @Override // io.sentry.k1
    public final Future schedule(Runnable runnable, long j) {
        return new h();
    }

    @Override // io.sentry.k1
    public final Future submit(Runnable runnable) {
        return new h();
    }

    @Override // io.sentry.k1
    public final void a(long j) {
    }
}
