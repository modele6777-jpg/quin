package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g39 extends vd0 implements ScheduledFuture, m88, Future {
    public final f2 E0;
    public final ScheduledFuture F0;

    public g39(f2 f2Var, ScheduledFuture scheduledFuture) {
        this.E0 = f2Var;
        this.F0 = scheduledFuture;
    }

    public final boolean B0(boolean z) {
        return this.E0.cancel(z);
    }

    @Override // defpackage.vd0
    public final Object R() {
        return this.E0;
    }

    @Override // defpackage.m88
    public final void b(Runnable runnable, Executor executor) {
        this.E0.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zB0 = B0(z);
        if (zB0) {
            this.F0.cancel(z);
        }
        return zB0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.F0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.E0.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.F0.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.E0.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.E0.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.E0.get(j, timeUnit);
    }
}
