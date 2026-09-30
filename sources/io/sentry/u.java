package io.sentry;

import defpackage.ub3;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements o {
    public final boolean f;
    public final SentryAndroidOptions g;
    public final io.sentry.util.a a = new io.sentry.util.a();
    public volatile Timer b = null;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public u(SentryAndroidOptions sentryAndroidOptions) {
        boolean z = false;
        this.g = sentryAndroidOptions;
        for (b1 b1Var : sentryAndroidOptions.getPerformanceCollectors()) {
            if (b1Var instanceof c1) {
                this.d.add((c1) b1Var);
            }
            if (b1Var instanceof io.sentry.android.core.f2) {
                this.e.add((io.sentry.android.core.f2) b1Var);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // io.sentry.o
    public final void a(String str) {
        if (this.f) {
            this.g.getLogger().i(q5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.c.containsKey(str)) {
            this.c.put(str, new t(this, null));
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        io.sentry.util.a aVar = this.a;
        aVar.b();
        try {
            if (this.b == null) {
                this.b = new Timer(true);
            }
            this.b.schedule(new r(this), 0L);
            this.b.schedule(new s(this, new ArrayList()), 100L, 100L);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.o
    public final void b(d7 d7Var) throws Throwable {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).e(d7Var);
        }
    }

    @Override // io.sentry.o
    public final List c(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        t tVar = (t) concurrentHashMap.remove(str);
        this.g.getLogger().i(q5.DEBUG, ub3.i("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (tVar != null) {
            return tVar.a;
        }
        return null;
    }

    @Override // io.sentry.o
    public final void close() {
        this.g.getLogger().i(q5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).d();
        }
        if (this.h.getAndSet(false)) {
            io.sentry.util.a aVar = this.a;
            aVar.b();
            try {
                if (this.b != null) {
                    this.b.cancel();
                    this.b = null;
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
    }

    @Override // io.sentry.o
    public final void d(d7 d7Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).f(d7Var);
        }
    }

    @Override // io.sentry.o
    public final void e(a7 a7Var) {
        if (this.f) {
            this.g.getLogger().i(q5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).f(a7Var);
        }
        String strA = a7Var.a.a();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (!concurrentHashMap.containsKey(strA)) {
            concurrentHashMap.put(strA, new t(this, a7Var));
        }
        a(strA);
    }

    @Override // io.sentry.o
    public final List f(q1 q1Var) {
        this.g.getLogger().i(q5.DEBUG, "stop collecting performance info for transactions %s (%s)", q1Var.getName(), q1Var.u().a.a());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f2) it.next()).e(q1Var);
        }
        return c(q1Var.q().a());
    }
}
