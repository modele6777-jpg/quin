package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class es5 extends in5 {
    public final m88 w;

    public es5(m88 m88Var) {
        this.w = m88Var;
    }

    @Override // defpackage.f2, defpackage.m88
    public final void b(Runnable runnable, Executor executor) {
        this.w.b(runnable, executor);
    }

    @Override // defpackage.f2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.w.cancel(z);
    }

    @Override // defpackage.f2, java.util.concurrent.Future
    public final Object get() {
        return this.w.get();
    }

    @Override // defpackage.f2, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w.isCancelled();
    }

    @Override // defpackage.f2, java.util.concurrent.Future
    public final boolean isDone() {
        return this.w.isDone();
    }

    @Override // defpackage.f2
    public final String toString() {
        return this.w.toString();
    }

    @Override // defpackage.f2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.w.get(j, timeUnit);
    }
}
