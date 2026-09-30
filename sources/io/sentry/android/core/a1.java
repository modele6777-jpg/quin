package io.sentry.android.core;

import defpackage.bwe;
import defpackage.xag;
import io.sentry.q4;
import io.sentry.q5;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements f0 {
    public final long b;
    public Future c;
    public final boolean e;
    public final boolean f;
    public final AtomicLong a = new AtomicLong(0);
    public final io.sentry.util.a d = new io.sentry.util.a();

    public a1(long j, boolean z, boolean z2) {
        this.b = j;
        this.e = z;
        this.f = z2;
    }

    public final void a(String str) {
        if (this.f) {
            io.sentry.g gVar = new io.sentry.g();
            gVar.e = "navigation";
            gVar.d(str, "state");
            gVar.g = "app.lifecycle";
            gVar.w = q5.INFO;
            q4.b().i(gVar, new io.sentry.l0());
        }
    }

    @Override // io.sentry.android.core.f0
    public final void b() {
        c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q4.b().n(new xag(7, this));
        AtomicLong atomicLong = this.a;
        long j = atomicLong.get();
        if (j == 0 || j + this.b <= jCurrentTimeMillis) {
            if (this.e) {
                q4.b().r();
            }
            q4.b().o().getReplayController().b();
        }
        q4.b().o().getReplayController().x();
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    public final void c() {
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            Future future = this.c;
            if (future != null) {
                future.cancel(false);
                this.c = null;
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

    @Override // io.sentry.android.core.f0
    public final void h() {
        this.a.set(System.currentTimeMillis());
        q4.b().o().getReplayController().N();
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            c();
            bwe bweVar = new bwe(11, this);
            try {
                this.c = q4.b().o().getTimerExecutorService().schedule(bweVar, this.b);
            } catch (Throwable th) {
                q4.b().o().getLogger().d(q5.WARNING, "Failed to schedule end of session. Ending it now.", th);
                bweVar.run();
            }
            aVar.close();
            a("background");
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
