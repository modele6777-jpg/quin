package io.sentry.android.core;

import io.sentry.k4;
import io.sentry.m4;
import io.sentry.n4;
import io.sentry.q5;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.w1, io.sentry.s0, Closeable {
    public final n4 a;
    public final io.sentry.util.f b;
    public io.sentry.t0 d;
    public io.sentry.g1 e;
    public SentryAndroidOptions f;
    public m4 g;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public final AtomicBoolean w = new AtomicBoolean(false);
    public final io.sentry.util.a x = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(n4 n4Var, io.sentry.util.f fVar) {
        this.a = n4Var;
        this.b = fVar;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        k4 k4Var = k4.a;
        this.e = k4Var;
        this.f = sentryAndroidOptions;
        if (!n4.b(sentryAndroidOptions.getLogger(), sentryAndroidOptions.getCacheDirPath())) {
            sentryAndroidOptions.getLogger().i(q5.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.b.a("SendCachedEnvelope");
            b(k4Var, this.f);
        }
    }

    public final void b(io.sentry.g1 g1Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.util.a aVar = this.x;
            aVar.b();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new r1(this, sentryAndroidOptions, g1Var, 0));
                if (((Boolean) this.b.a()).booleanValue() && this.c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.set(true);
        io.sentry.t0 t0Var = this.d;
        if (t0Var != null) {
            t0Var.G0(this);
        }
    }

    @Override // io.sentry.s0
    public final void u(io.sentry.r0 r0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.g1 g1Var = this.e;
        if (g1Var == null || (sentryAndroidOptions = this.f) == null || r0Var == io.sentry.r0.DISCONNECTED) {
            return;
        }
        b(g1Var, sentryAndroidOptions);
    }
}
