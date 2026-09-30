package io.sentry;

import defpackage.nzf;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownHookIntegration implements w1, Closeable {
    public final Runtime a;
    public Thread b;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        io.sentry.util.b.r(runtime, "Runtime is required");
        this.a = runtime;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        if (!sentryAndroidOptions.isEnableShutdownHook()) {
            sentryAndroidOptions.getLogger().i(q5.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        int i = 3;
        this.b = new Thread(new o4(sentryAndroidOptions, i), "sentry-shutdownhook");
        try {
            new nzf(i, this, sentryAndroidOptions).run();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != null) {
            try {
                this.a.removeShutdownHook(this.b);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }
}
