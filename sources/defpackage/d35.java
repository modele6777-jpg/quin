package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d35 extends c35 implements ov3 {
    public final Executor c;

    public d35(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = jh2.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = jh2.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.ov3
    public final ta4 R(long j, Runnable runnable, pv2 pv2Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                tq.n(pv2Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new sa4(scheduledFutureSchedule) : pq3.y.R(j, runnable, pv2Var);
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            tq.n(pv2Var, cancellationException);
            js3 js3Var = ga4.a;
            hr3.c.Z0(pv2Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.c35
    public final Executor d1() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d35) && ((d35) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.ov3
    public final void k0(long j, pl1 pl1Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            lwg lwgVar = new lwg(15, this, pl1Var);
            pv2 pv2Var = pl1Var.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(lwgVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                tq.n(pv2Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            pl1Var.y(new kl1(0, scheduledFutureSchedule));
        } else {
            pq3.y.k0(j, pl1Var);
        }
    }

    @Override // defpackage.sv2
    public final String toString() {
        return this.c.toString();
    }
}
