package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.bwe;
import defpackage.kv2;
import defpackage.nzf;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.f0;
import io.sentry.android.core.i0;
import io.sentry.q5;
import io.sentry.util.n;
import io.sentry.v2;
import io.sentry.w1;
import io.sentry.z0;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AnrProfilingIntegration implements w1, Closeable, f0, Runnable {
    public volatile Handler Y;
    public volatile Thread Z;
    public volatile d v;
    public volatile SentryAndroidOptions x;
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final bwe b = new bwe(16, this);
    public final io.sentry.util.a c = new io.sentry.util.a();
    public final io.sentry.util.a d = new io.sentry.util.a();
    public volatile long e = SystemClock.uptimeMillis();
    public final AtomicInteger f = new AtomicInteger();
    public volatile a g = a.IDLE;
    public volatile z0 w = v2.a;
    public volatile Thread y = null;
    public volatile boolean z = false;
    public volatile boolean X = false;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public enum a {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.x = sentryAndroidOptions;
        this.w = sentryAndroidOptions.getLogger();
        if (this.x.isAnrProfilingEnabled()) {
            if (this.x.getCacheDirPath() == null) {
                this.w.i(q5.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.Z = mainLooper.getThread();
            this.Y = new Handler(mainLooper);
            io.sentry.util.b.a("AnrProfiling");
            i0.e.b(this);
        }
    }

    @Override // io.sentry.android.core.f0
    public final void b() {
        if (this.a.get()) {
            io.sentry.util.a aVar = this.c;
            aVar.b();
            try {
                if (this.X) {
                    aVar.close();
                    return;
                }
                this.X = true;
                this.b.run();
                Thread thread = this.y;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.y = thread2;
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.set(false);
        i0.e.u(this);
        Handler handler = this.Y;
        if (handler != null) {
            handler.removeCallbacks(this.b);
        }
        Thread thread = this.y;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.x;
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            d dVar = this.v;
            this.v = null;
            aVar.close();
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new nzf(11, this, dVar));
                } catch (Throwable unused) {
                    this.w.i(q5.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.f0
    public final void h() {
        if (this.a.get()) {
            io.sentry.util.a aVar = this.c;
            aVar.b();
            try {
                this.X = false;
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

    public final void l(Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.e;
        if (jUptimeMillis < 1000) {
            this.g = a.IDLE;
            this.z = false;
        }
        if (this.g == a.IDLE && jUptimeMillis > 1000) {
            z0 z0Var = this.w;
            q5 q5Var = q5.DEBUG;
            if (z0Var.k(q5Var)) {
                this.w.i(q5Var, "ANR: main thread is suspicious", new Object[0]);
            }
            this.g = a.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.x;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && n.a().c() < anrProfilingSampleRate.doubleValue()) {
                this.z = true;
            }
            if (this.z) {
                this.f.set(0);
                u().a.clear();
            }
        }
        if (this.z && (this.g == a.SUSPICIOUS || this.g == a.ANR_DETECTED)) {
            if (this.f.get() < 151) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                f fVar = new f(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                z0 z0Var2 = this.w;
                q5 q5Var2 = q5.DEBUG;
                if (z0Var2.k(q5Var2)) {
                    this.w.i(q5Var2, kv2.m("AnrWatchdog: capturing main thread stacktrace took ", "ms", jUptimeMillis3), new Object[0]);
                }
                if (this.a.get()) {
                    this.f.incrementAndGet();
                    u().a.x(fVar);
                }
            } else {
                z0 z0Var3 = this.w;
                q5 q5Var3 = q5.DEBUG;
                if (z0Var3.k(q5Var3)) {
                    this.w.i(q5Var3, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.g != a.SUSPICIOUS || jUptimeMillis <= 4000) {
            return;
        }
        z0 z0Var4 = this.w;
        q5 q5Var4 = q5.DEBUG;
        if (z0Var4.k(q5Var4)) {
            this.w.i(q5Var4, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.g = a.ANR_DETECTED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.Y;
        Thread thread = this.Z;
        if (handler == null || thread == null) {
            return;
        }
        while (this.a.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.X) {
                        l(thread);
                        handler.removeCallbacks(this.b);
                        handler.post(this.b);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.X && this.a.get()) {
                                try {
                                    wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.b.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th2) {
                this.w.d(q5.WARNING, "Failed to execute AnrStacktraceIntegration", th2);
                return;
            }
        }
    }

    public final d u() {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            if (this.v == null) {
                SentryAndroidOptions sentryAndroidOptions = this.x;
                io.sentry.util.b.r(sentryAndroidOptions, "Options can't be null");
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                File file = new File(cacheDirPath);
                e.b(file);
                this.v = new d(sentryAndroidOptions, new File(file, "anr_profile"));
            }
            d dVar = this.v;
            aVar.close();
            return dVar;
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
