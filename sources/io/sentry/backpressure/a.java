package io.sentry.backpressure;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.k1;
import io.sentry.q4;
import io.sentry.q5;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, Runnable {
    public final SentryAndroidOptions a;
    public int b = 0;
    public volatile Future c = null;
    public final io.sentry.util.a d = new io.sentry.util.a();

    public a(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.b;
    }

    public final void b(int i) {
        k1 executorService = this.a.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            try {
                this.c = executorService.schedule(this, i);
            } catch (RejectedExecutionException e) {
                this.a.getLogger().d(q5.WARNING, "Backpressure monitor reschedule task rejected", e);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.c;
        if (future != null) {
            io.sentry.util.a aVar = this.d;
            aVar.b();
            try {
                future.cancel(true);
                aVar.close();
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean zG = q4.b().g();
        int i = this.b;
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (zG) {
            if (i > 0) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.b = 0;
        } else if (i < 10) {
            this.b = i + 1;
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.b));
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}
