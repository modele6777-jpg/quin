package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x98 extends Handler implements Runnable {
    public final int a;
    public final hxa b;
    public final long c;
    public lxa d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean v;
    public volatile boolean w;
    public final /* synthetic */ ta0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x98(ta0 ta0Var, Looper looper, hxa hxaVar, lxa lxaVar, int i, long j) {
        super(looper);
        this.x = ta0Var;
        this.b = hxaVar;
        this.d = lxaVar;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.w = z;
        this.e = null;
        if (hasMessages(1)) {
            this.v = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.v = true;
                    this.b.h = true;
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.x.d = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            lxa lxaVar = this.d;
            lxaVar.getClass();
            lxaVar.y(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        lxa lxaVar = this.d;
        lxaVar.getClass();
        int i = this.f;
        hxa hxaVar = this.b;
        r1e r1eVar = hxaVar.c;
        u98 u98Var = new u98(hxaVar.a, hxaVar.k, jElapsedRealtime);
        if (i != 0) {
            u98Var.f = r1eVar.c;
            u98Var.g = r1eVar.d;
            u98Var.c = j;
            u98Var.d = r1eVar.b;
        }
        aq4 aq4Var = lxaVar.e;
        aq4Var.a(new bq8(aq4Var, new v98(u98Var), new qp8(-1, null, pqf.R(hxaVar.j), pqf.R(lxaVar.R0)), i));
        this.e = null;
        ta0 ta0Var = this.x;
        f39 f39Var = (f39) ta0Var.c;
        x98 x98Var = (x98) ta0Var.d;
        x98Var.getClass();
        f39Var.execute(x98Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        long j;
        a67 a67Var;
        xsc xscVar;
        if (this.w) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.x.d = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.c;
        lxa lxaVar = this.d;
        lxaVar.getClass();
        if (this.v) {
            lxaVar.y(this.b, jElapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                lxaVar.z(this.b, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                xo1.y("LoadTask", "Unexpected exception handling load completed", e);
                this.x.b = new y98(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        hxa hxaVar = this.b;
        r1e r1eVar = hxaVar.c;
        u98 u98Var = new u98(hxaVar.a, hxaVar.k, jElapsedRealtime);
        u98Var.f = r1eVar.c;
        u98Var.g = r1eVar.d;
        u98Var.c = j2;
        u98Var.d = r1eVar.b;
        v98 v98Var = new v98(u98Var);
        String str = pqf.a;
        lxaVar.d.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i3 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof l0a) || (cause instanceof FileNotFoundException) || (cause instanceof ms6) || (cause instanceof y98) || ((cause instanceof bc3) && ((bc3) cause).reason == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            a67Var = ta0.w;
            j = -9223372036854775807L;
        } else {
            int iS = lxaVar.s();
            j = -9223372036854775807L;
            int i4 = iS > lxaVar.f1 ? 1 : 0;
            if (lxaVar.b1 || !((xscVar = lxaVar.Q0) == null || xscVar.h() == -9223372036854775807L)) {
                lxaVar.f1 = iS;
            } else if (!lxaVar.M0 || lxaVar.D()) {
                lxaVar.W0 = lxaVar.M0;
                lxaVar.c1 = 0L;
                lxaVar.f1 = 0;
                for (ncc nccVar : lxaVar.J0) {
                    nccVar.p(false);
                }
                hxaVar.g.b = 0L;
                hxaVar.j = 0L;
                hxaVar.i = true;
                hxaVar.m = false;
            } else {
                lxaVar.e1 = true;
                a67Var = ta0.v;
            }
            a67Var = new a67(i4, jMin);
        }
        int i5 = a67Var.a;
        boolean z = !(i5 == 0 || i5 == 1);
        aq4 aq4Var = lxaVar.e;
        aq4Var.a(new dq8(aq4Var, v98Var, new qp8(-1, null, pqf.R(hxaVar.j), pqf.R(lxaVar.R0)), iOException, z));
        int i6 = a67Var.a;
        if (i6 == 3) {
            this.x.b = this.e;
            return;
        }
        if (i6 != 2) {
            if (i6 == 1) {
                this.f = 1;
            }
            long jMin2 = a67Var.b;
            if (jMin2 == j) {
                jMin2 = Math.min((this.f - 1) * 1000, 5000);
            }
            ta0 ta0Var = this.x;
            pa7.J(((x98) ta0Var.d) == null);
            ta0Var.d = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.v;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.w) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.w) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.w) {
                return;
            }
            xo1.y("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new y98(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.w) {
                return;
            }
            xo1.y("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new y98(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.w) {
                xo1.y("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
