package io.sentry.android.core;

import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends io.sentry.metrics.c implements f0 {
    @Override // io.sentry.metrics.c, io.sentry.metrics.a
    public final void a(boolean z) {
        i0.e.u(this);
        super.a(z);
    }

    @Override // io.sentry.android.core.f0
    public final void h() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new n(this, 1));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.android.core.f0
    public final void b() {
    }
}
