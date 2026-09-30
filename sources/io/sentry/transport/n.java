package io.sentry.transport;

import io.sentry.a5;
import io.sentry.n0;
import io.sentry.q5;
import io.sentry.z0;
import io.sentry.z4;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends ThreadPoolExecutor implements AutoCloseable {
    public final int a;
    public z4 b;
    public final z0 c;
    public final a5 d;
    public final io.sentry.d e;

    public n(int i, n0 n0Var, a aVar, z0 z0Var, a5 a5Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), n0Var, aVar);
        this.b = null;
        this.e = new io.sentry.d(11);
        this.a = i;
        this.c = z0Var;
        this.d = a5Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        p pVar = (p) this.e.b;
        try {
            super.afterExecute(runnable, th);
        } finally {
            int i = p.a;
            pVar.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        p pVar = (p) this.e.b;
        int i = p.a;
        int iA = pVar.a();
        int i2 = this.a;
        z0 z0Var = this.c;
        a5 a5Var = this.d;
        if (iA >= i2) {
            this.b = a5Var.a();
            z0Var.i(q5.WARNING, "Submit cancelled", new Object[0]);
            return new m();
        }
        pVar.b();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e) {
            pVar.releaseShared(1);
            this.b = a5Var.a();
            z0Var.d(q5.WARNING, "Submit rejected by thread pool executor", e);
            return new m();
        }
    }
}
