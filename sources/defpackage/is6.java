package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class is6 implements mtd {
    public final long a;
    public boolean b;
    public final f41 c = new f41();
    public final f41 d = new f41();
    public boolean e;
    public final /* synthetic */ ks6 f;

    public is6(ks6 ks6Var, long j, boolean z) {
        this.f = ks6Var;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) throws Throwable {
        boolean z;
        Throwable i3eVar;
        long j2;
        long jC0;
        f41Var.getClass();
        long j3 = 0;
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            ks6 ks6Var = this.f;
            synchronized (ks6Var) {
                ks6Var.b.getClass();
                hs6 hs6Var = ks6Var.w;
                z = true;
                boolean z2 = hs6Var.c || hs6Var.a;
                if (z2) {
                    ks6Var.x.h();
                }
                try {
                    if (ks6Var.g() == null || this.b) {
                        i3eVar = null;
                    } else {
                        i3eVar = ks6Var.X;
                        if (i3eVar == null) {
                            ay4 ay4VarG = ks6Var.g();
                            ay4VarG.getClass();
                            i3eVar = new i3e(ay4VarG);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    f41 f41Var2 = this.d;
                    long j4 = f41Var2.b;
                    if (j4 > j3) {
                        jC0 = f41Var2.c0(f41Var, Math.min(j, j4));
                        yx0.c(ks6Var.c, jC0, 0L, 2);
                        long jB = ks6Var.c.b();
                        if (i3eVar == null) {
                            j2 = j3;
                            if (jB >= ks6Var.b.F0.a() / 2) {
                                ks6Var.b.N(ks6Var.a, jB);
                                yx0.c(ks6Var.c, 0L, jB, 1);
                            }
                        } else {
                            j2 = j3;
                        }
                        z = false;
                    } else {
                        j2 = j3;
                        if (this.b || i3eVar != null) {
                            z = false;
                        } else {
                            try {
                                ks6Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jC0 = -1;
                    }
                    if (z2) {
                        ks6Var.x.k();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        ks6Var.x.k();
                    }
                    throw th;
                }
            }
            this.f.b.E0.getClass();
            if (!z) {
                if (jC0 != -1) {
                    return jC0;
                }
                if (i3eVar == null) {
                    return -1L;
                }
                throw i3eVar;
            }
            j3 = j2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        ks6 ks6Var = this.f;
        synchronized (ks6Var) {
            this.e = true;
            f41 f41Var = this.d;
            j = f41Var.b;
            f41Var.b();
            ks6Var.notifyAll();
        }
        if (j > 0) {
            ks6 ks6Var2 = this.f;
            TimeZone timeZone = keg.a;
            ks6Var2.b.x(j);
        }
        this.f.a();
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.f.x;
    }
}
