package io.sentry;

import defpackage.uh2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {
    public static volatile o0 g;
    public static final io.sentry.util.a h = new io.sentry.util.a();
    public final long a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final m0 e;
    public final ThreadPoolExecutor f;

    public o0() {
        m0 m0Var = new m0(0);
        this.d = new AtomicBoolean(false);
        this.a = 18000000L;
        this.e = m0Var;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n0(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = threadPoolExecutor;
        b();
    }

    public static o0 a() {
        if (g == null) {
            io.sentry.util.a aVar = h;
            aVar.b();
            try {
                if (g == null) {
                    g = new o0();
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
        return g;
    }

    public final void b() {
        try {
            this.f.submit(new uh2(6, this)).get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.c = System.currentTimeMillis() + 1000;
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.c = System.currentTimeMillis() + 1000;
        }
    }
}
