package io.sentry.logger;

import defpackage.bwe;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.clientreport.f;
import io.sentry.k5;
import io.sentry.o2;
import io.sentry.q5;
import io.sentry.s5;
import io.sentry.t5;
import io.sentry.transport.p;
import io.sentry.x4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements b {
    public final SentryAndroidOptions a;
    public final x4 b;
    public final ConcurrentLinkedQueue c;
    public final k5 d;
    public final AtomicBoolean e;
    public volatile boolean f;
    public final io.sentry.d g;

    public d(SentryAndroidOptions sentryAndroidOptions, x4 x4Var) {
        k5 k5Var = new k5(sentryAndroidOptions);
        this.e = new AtomicBoolean(false);
        this.f = false;
        this.g = new io.sentry.d(11);
        this.a = sentryAndroidOptions;
        this.b = x4Var;
        this.c = new ConcurrentLinkedQueue();
        this.d = k5Var;
    }

    @Override // io.sentry.logger.b
    public void a(boolean z) {
        this.f = true;
        if (z) {
            f(true);
            this.d.submit(new bwe(23, this));
        } else {
            this.d.a(this.a.getShutdownTimeoutMillis());
            while (!this.c.isEmpty()) {
                d();
            }
        }
    }

    @Override // io.sentry.logger.b
    public final void c(s5 s5Var) {
        if (this.f) {
            return;
        }
        p pVar = (p) this.g.b;
        int i = p.a;
        if (pVar.a() < 1000) {
            ((p) this.g.b).b();
            this.c.offer(s5Var);
            f(false);
        } else {
            f clientReportRecorder = this.a.getClientReportRecorder();
            io.sentry.clientreport.d dVar = io.sentry.clientreport.d.QUEUE_OVERFLOW;
            clientReportRecorder.a(dVar, io.sentry.p.LogItem);
            this.a.getClientReportRecorder().f(dVar, io.sentry.p.LogByte, io.sentry.util.d.a(this.a.getSerializer(), this.a.getLogger(), s5Var));
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            s5 s5Var = (s5) concurrentLinkedQueue.poll();
            if (s5Var != null) {
                arrayList.add(s5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        x4 x4Var = this.b;
        int i = 0;
        try {
            x4Var.x(x4Var.o(new t5(i, arrayList)), null);
        } catch (IOException e) {
            x4Var.b.getLogger().c(q5.WARNING, e, "Capturing logs failed.", new Object[0]);
        }
        while (i < arrayList.size()) {
            p pVar = (p) this.g.b;
            int i2 = p.a;
            pVar.releaseShared(1);
            i++;
        }
    }

    @Override // io.sentry.logger.b
    public final void e(long j) {
        f(true);
        try {
            ((p) this.g.b).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            this.a.getLogger().d(q5.ERROR, "Failed to flush log events", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void f(boolean z) {
        AtomicBoolean atomicBoolean = this.e;
        if (z) {
            atomicBoolean.set(true);
        } else if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        try {
            this.d.schedule(new o2(9, this), z ? 0 : 5000);
        } catch (RejectedExecutionException e) {
            atomicBoolean.set(false);
            this.a.getLogger().d(q5.WARNING, "Logs batch processor flush task rejected", e);
        }
    }
}
