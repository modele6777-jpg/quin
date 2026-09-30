package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hs6 implements wkd {
    public final boolean a;
    public final f41 b = new f41();
    public boolean c;
    public final /* synthetic */ ks6 d;

    public hs6(ks6 ks6Var, boolean z) {
        this.d = ks6Var;
        this.a = z;
    }

    @Override // defpackage.wkd
    public final void M0(f41 f41Var, long j) {
        TimeZone timeZone = keg.a;
        f41 f41Var2 = this.b;
        f41Var2.M0(f41Var, j);
        while (f41Var2.b >= 16384) {
            b(false);
        }
    }

    public final void b(boolean z) {
        long jMin;
        boolean z2;
        ks6 ks6Var = this.d;
        synchronized (ks6Var) {
            ks6Var.y.h();
            while (ks6Var.d >= ks6Var.e && !this.a && !this.c && ks6Var.g() == null) {
                try {
                    try {
                        ks6Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    ks6Var.y.k();
                    throw th;
                }
            }
            ks6Var.y.k();
            ks6Var.b();
            jMin = Math.min(ks6Var.e - ks6Var.d, this.b.b);
            ks6Var.d += jMin;
            z2 = z && jMin == this.b.b;
        }
        this.d.y.h();
        try {
            ks6 ks6Var2 = this.d;
            ks6Var2.b.E(ks6Var2.a, z2, this.b, jMin);
        } finally {
            this.d.y.k();
        }
    }

    @Override // defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ks6 ks6Var = this.d;
        TimeZone timeZone = keg.a;
        synchronized (ks6Var) {
            if (this.c) {
                return;
            }
            boolean z = ks6Var.g() == null;
            ks6 ks6Var2 = this.d;
            if (!ks6Var2.w.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        b(true);
                    }
                } else if (z) {
                    ks6Var2.b.E(ks6Var2.a, true, null, 0L);
                }
            }
            ks6 ks6Var3 = this.d;
            synchronized (ks6Var3) {
                this.c = true;
                ks6Var3.notifyAll();
            }
            this.d.b.flush();
            this.d.a();
        }
    }

    @Override // defpackage.wkd, java.io.Flushable
    public final void flush() {
        ks6 ks6Var = this.d;
        TimeZone timeZone = keg.a;
        synchronized (ks6Var) {
            ks6Var.b();
        }
        while (this.b.b > 0) {
            b(false);
            this.d.b.flush();
        }
    }

    @Override // defpackage.wkd
    public final jye j() {
        return this.d.y;
    }
}
