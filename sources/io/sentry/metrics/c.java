package io.sentry.metrics;

import defpackage.bwe;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.k5;
import io.sentry.o2;
import io.sentry.q5;
import io.sentry.transport.p;
import io.sentry.w5;
import io.sentry.x4;
import io.sentry.x5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements a {
    public final SentryAndroidOptions a;
    public final x4 b;
    public final k5 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final io.sentry.d f = new io.sentry.d(11);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();

    public c(SentryAndroidOptions sentryAndroidOptions, x4 x4Var) {
        this.a = sentryAndroidOptions;
        this.b = x4Var;
        this.d = new k5(sentryAndroidOptions);
    }

    @Override // io.sentry.metrics.a
    public void a(boolean z) {
        k5 k5Var = this.d;
        if (z) {
            d(true);
            k5Var.submit(new bwe(24, this));
        } else {
            k5Var.a(this.a.getShutdownTimeoutMillis());
            while (!this.c.isEmpty()) {
                c();
            }
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            w5 w5Var = (w5) concurrentLinkedQueue.poll();
            if (w5Var != null) {
                arrayList.add(w5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        x4 x4Var = this.b;
        try {
            x4Var.x(x4Var.p(new x5(arrayList)), null);
        } catch (IOException e) {
            x4Var.b.getLogger().c(q5.WARNING, e, "Capturing metrics failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            p pVar = (p) this.f.b;
            int i2 = p.a;
            pVar.releaseShared(1);
        }
    }

    public final void d(boolean z) {
        AtomicBoolean atomicBoolean = this.e;
        if (z) {
            atomicBoolean.set(true);
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        try {
            this.d.schedule(new o2(10, this), z ? 0 : 5000);
        } catch (RejectedExecutionException e) {
            atomicBoolean.set(false);
            this.a.getLogger().d(q5.WARNING, "Metrics batch processor flush task rejected", e);
        }
    }

    @Override // io.sentry.metrics.a
    public final void e(long j) {
        d(true);
        try {
            ((p) this.f.b).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            this.a.getLogger().d(q5.ERROR, "Failed to flush metrics events", e);
            Thread.currentThread().interrupt();
        }
    }
}
