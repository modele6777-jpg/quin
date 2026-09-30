package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ls6 implements Closeable {
    public static final Logger f = Logger.getLogger(wr6.class.getName());
    public final xhb a;
    public final f41 b;
    public int c;
    public boolean d;
    public final hr6 e;

    public ls6(xhb xhbVar) {
        this.a = xhbVar;
        f41 f41Var = new f41();
        this.b = f41Var;
        this.c = 16384;
        this.e = new hr6(f41Var);
    }

    public final void E(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            l(0, 8, 6, z ? 1 : 0);
            this.a.h(i);
            this.a.h(i2);
            this.a.flush();
        }
    }

    public final void G(int i, ay4 ay4Var) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (ay4Var.a() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            l(i, 4, 3, 0);
            this.a.h(ay4Var.a());
            this.a.flush();
        }
    }

    public final void N(int i, long j) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(wr6.c(i, 4, j, false));
                }
                l(i, 4, 8, 0);
                this.a.h((int) j);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(r3d r3dVar) {
        r3dVar.getClass();
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = r3dVar.a;
                if ((i2 & 32) != 0) {
                    i = r3dVar.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? r3dVar.b[1] : -1) != -1) {
                    hr6 hr6Var = this.e;
                    int iMin = Math.min((i2 & 2) != 0 ? r3dVar.b[1] : -1, 16384);
                    int i3 = hr6Var.d;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            hr6Var.b = Math.min(hr6Var.b, iMin);
                        }
                        hr6Var.c = true;
                        hr6Var.d = iMin;
                        int i4 = hr6Var.h;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                oi6[] oi6VarArr = hr6Var.e;
                                qd0.h0(0, oi6VarArr.length, null, oi6VarArr);
                                hr6Var.f = hr6Var.e.length - 1;
                                hr6Var.g = 0;
                                hr6Var.h = 0;
                            } else {
                                hr6Var.a(i4 - iMin);
                            }
                        }
                    }
                }
                l(0, 0, 4, 1);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.a.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.a.flush();
        }
    }

    public final void h(boolean z, int i, f41 f41Var, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            l(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                xhb xhbVar = this.a;
                f41Var.getClass();
                xhbVar.M0(f41Var, i2);
            }
        }
    }

    public final void l(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f;
            if (logger.isLoggable(level)) {
                logger.fine(wr6.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            qc0.o(tec.e(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = ieg.a;
        xhb xhbVar = this.a;
        xhbVar.writeByte((i2 >>> 16) & 255);
        xhbVar.writeByte((i2 >>> 8) & 255);
        xhbVar.writeByte(i2 & 255);
        xhbVar.writeByte(i3 & 255);
        xhbVar.writeByte(i4 & 255);
        xhbVar.h(i & Integer.MAX_VALUE);
    }

    public final void u(int i, ay4 ay4Var, byte[] bArr) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (ay4Var.a() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            l(0, bArr.length + 8, 7, 0);
            this.a.h(i);
            this.a.h(ay4Var.a());
            if (bArr.length != 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        }
    }

    public final void x(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(arrayList);
            long j = this.b.b;
            long jMin = Math.min(this.c, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            l(i, (int) jMin, 1, i2);
            this.a.M0(this.b, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.c, j2);
                    j2 -= jMin2;
                    l(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.a.M0(this.b, jMin2);
                }
            }
        }
    }
}
