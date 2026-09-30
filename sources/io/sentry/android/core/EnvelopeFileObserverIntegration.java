package io.sentry.android.core;

import io.sentry.k4;
import io.sentry.n3;
import io.sentry.q5;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements io.sentry.w1, Closeable {
    public x0 a;
    public io.sentry.z0 b;
    public boolean c = false;
    public final io.sentry.util.a d = new io.sentry.util.a();

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.b = sentryAndroidOptions.getLogger();
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        io.sentry.z0 z0Var = this.b;
        if (outboxPath == null) {
            z0Var.i(q5.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        z0Var.i(q5.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            sentryAndroidOptions.getExecutorService().submit(new r1(this, sentryAndroidOptions, outboxPath, 3));
        } catch (Throwable th) {
            this.b.d(q5.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }

    public final void b(SentryAndroidOptions sentryAndroidOptions, String str) {
        if (!io.sentry.util.b.e(new File(str))) {
            sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to create outbox dir %s", str);
        }
        x0 x0Var = new x0(str, new n3(k4.a, sentryAndroidOptions.getEnvelopeReader(), sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getMaxQueueSize()), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getFlushTimeoutMillis());
        this.a = x0Var;
        try {
            x0Var.startWatching();
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.b.a("EnvelopeFileObserver");
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            this.c = true;
            aVar.close();
            x0 x0Var = this.a;
            if (x0Var != null) {
                x0Var.stopWatching();
                io.sentry.z0 z0Var = this.b;
                if (z0Var != null) {
                    z0Var.i(q5.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
