package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ds6 implements Closeable {
    public static final r3d O0;
    public final yj5 E0;
    public final r3d F0;
    public r3d G0;
    public final yx0 H0;
    public long I0;
    public long J0;
    public final ta0 K0;
    public final ls6 L0;
    public final n5 M0;
    public final LinkedHashSet N0;
    public long X;
    public long Y;
    public long Z;
    public final bs6 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final kle g;
    public final jle v;
    public final jle w;
    public final jle x;
    public final af8 y;
    public long z;

    static {
        r3d r3dVar = new r3d();
        r3dVar.b(4, 65535);
        r3dVar.b(5, 16384);
        O0 = r3dVar;
    }

    public ds6(a82 a82Var) {
        this.a = (bs6) a82Var.e;
        String str = (String) a82Var.b;
        if (str == null) {
            pa7.g0("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        kle kleVar = (kle) a82Var.c;
        this.g = kleVar;
        this.v = kleVar.d();
        this.w = kleVar.d();
        this.x = kleVar.d();
        this.y = af8.U0;
        this.E0 = (yj5) a82Var.f;
        r3d r3dVar = new r3d();
        r3dVar.b(4, 16777216);
        this.F0 = r3dVar;
        r3d r3dVar2 = O0;
        this.G0 = r3dVar2;
        this.H0 = new yx0(0);
        this.J0 = r3dVar2.a();
        ta0 ta0Var = (ta0) a82Var.d;
        if (ta0Var == null) {
            pa7.g0("socket");
            throw null;
        }
        this.K0 = ta0Var;
        this.L0 = new ls6((xhb) ta0Var.b);
        this.M0 = new n5(12, this, new gs6((yhb) ta0Var.d));
        this.N0 = new LinkedHashSet();
    }

    public final void E(int i, boolean z, f41 f41Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.L0.h(z, i, f41Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.I0;
                            j3 = this.J0;
                            if (j2 >= j3) {
                                if (!this.b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.L0.c);
                j4 = iMin;
                this.I0 += j4;
            }
            j -= j4;
            this.L0.h(z && j == 0, i, f41Var, iMin);
        }
    }

    public final void G(int i, ay4 ay4Var) {
        jle.b(this.v, this.c + '[' + i + "] writeSynReset", new m53(this, i, ay4Var, 3));
    }

    public final void N(final int i, final long j) {
        jle.b(this.v, this.c + '[' + i + "] windowUpdate", new x16() { // from class: xr6
            @Override // defpackage.x16
            public final Object invoke() {
                ds6 ds6Var = this.a;
                try {
                    ds6Var.L0.N(i, j);
                } catch (IOException e) {
                    ay4 ay4Var = ay4.PROTOCOL_ERROR;
                    ds6Var.b(ay4Var, ay4Var, e);
                }
                return wef.a;
            }
        });
    }

    public final void b(ay4 ay4Var, ay4 ay4Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = keg.a;
        try {
            u(ay4Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new ks6[0]);
                this.b.clear();
            }
        }
        ks6[] ks6VarArr = (ks6[]) array;
        if (ks6VarArr != null) {
            for (ks6 ks6Var : ks6VarArr) {
                try {
                    ks6Var.c(ay4Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.L0.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((szc) this.K0.c).b).close();
        } catch (IOException unused4) {
        }
        this.v.f();
        this.w.f();
        this.x.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(ay4.NO_ERROR, ay4.CANCEL, null);
    }

    public final void flush() {
        this.L0.flush();
    }

    public final ks6 h(int i) {
        ks6 ks6Var;
        synchronized (this) {
            ks6Var = (ks6) this.b.get(Integer.valueOf(i));
        }
        return ks6Var;
    }

    public final ks6 l(int i) {
        ks6 ks6Var;
        synchronized (this) {
            ks6Var = (ks6) this.b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return ks6Var;
    }

    public final void u(ay4 ay4Var) {
        synchronized (this.L0) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.L0.u(this.d, ay4Var, ieg.a);
            }
        }
    }

    public final void x(long j) {
        synchronized (this) {
            try {
                yx0.c(this.H0, j, 0L, 2);
                long jB = this.H0.b();
                if (jB >= this.F0.a() / 2) {
                    N(0, jB);
                    yx0.c(this.H0, 0L, jB, 1);
                }
                yj5 yj5Var = this.E0;
                yx0 yx0Var = this.H0;
                yj5Var.getClass();
                yx0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
