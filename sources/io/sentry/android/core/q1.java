package io.sentry.android.core;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements io.sentry.a1 {
    public final SentryAndroidOptions a;
    public final long b;

    public q1(SentryAndroidOptions sentryAndroidOptions, long j) {
        this.a = sentryAndroidOptions;
        this.b = j;
    }

    @Override // io.sentry.a1
    public final void g(String str) {
        io.sentry.cache.a.d(this.a, Long.toString(this.b), ".options-cache", "app-last-update-time.json");
    }

    @Override // io.sentry.a1
    public final void a(Map map) {
    }

    @Override // io.sentry.a1
    public final void b(io.sentry.protocol.u uVar) {
    }

    @Override // io.sentry.a1
    public final void c(String str) {
    }

    @Override // io.sentry.a1
    public final void d(Double d) {
    }

    @Override // io.sentry.a1
    public final void e(String str) {
    }

    @Override // io.sentry.a1
    public final void f(String str) {
    }
}
