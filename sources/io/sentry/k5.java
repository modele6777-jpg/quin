package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k5 implements k1 {
    public final ScheduledThreadPoolExecutor a;
    public final io.sentry.util.a b;
    public final q6 c;

    public k5(q6 q6Var, int i) {
        this(q6Var);
        this.a.setRemoveOnCancelPolicy(true);
        this.a.setKeepAliveTime(30L, TimeUnit.SECONDS);
        this.a.allowCoreThreadTimeOut(true);
        this.a.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
    }

    @Override // io.sentry.k1
    public final void a(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        io.sentry.util.a aVar = this.b;
        aVar.b();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
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

    @Override // io.sentry.k1
    public final boolean isClosed() {
        io.sentry.util.a aVar = this.b;
        aVar.b();
        try {
            boolean zIsShutdown = this.a.isShutdown();
            aVar.close();
            return zIsShutdown;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.k1
    public final Future schedule(Runnable runnable, long j) {
        return this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.k1
    public final Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        q6 q6Var = this.c;
        if (q6Var != null) {
            q6Var.getLogger().i(q5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new h();
    }

    public k5(q6 q6Var) {
        this(new ScheduledThreadPoolExecutor(1, new n0(1)), q6Var);
    }

    public k5(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, q6 q6Var) {
        this.b = new io.sentry.util.a();
        this.a = scheduledThreadPoolExecutor;
        this.c = q6Var;
    }

    public k5() {
        this(new ScheduledThreadPoolExecutor(1, new n0(1)), (q6) null);
    }
}
