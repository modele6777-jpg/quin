package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 implements m88 {
    public final WeakReference a;
    public final oa1 b = new oa1(this);

    public pa1(la1 la1Var) {
        this.a = new WeakReference(la1Var);
    }

    public final boolean a(Throwable th) {
        return this.b.l(th);
    }

    @Override // defpackage.m88
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        la1 la1Var = (la1) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && la1Var != null) {
            la1Var.a = null;
            la1Var.b = null;
            la1Var.c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof n4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
