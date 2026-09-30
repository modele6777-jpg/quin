package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iuf {
    public final gp8 a;
    public final nuf b;
    public final long c;
    public boolean d;
    public long g;
    public boolean i;
    public boolean l;
    public boolean m;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public ece k = ece.a;

    public iuf(Context context, gp8 gp8Var, long j) {
        this.a = gp8Var;
        this.c = j;
        this.b = new nuf(context);
    }

    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, w21 w21Var) {
        long j7;
        boolean z3;
        long j8;
        long j9;
        long j10;
        long j11;
        float f;
        float f2;
        w21Var.b = -9223372036854775807L;
        w21Var.c = -9223372036854775807L;
        boolean z4 = this.d;
        if (z4 && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        long jH = (long) ((j - j2) / ((double) this.j));
        if (z4) {
            this.k.getClass();
            jH -= pqf.H(SystemClock.elapsedRealtime()) - j3;
        }
        w21Var.b = jH;
        if (!z || z2) {
            if (this.l) {
                if (this.h == -9223372036854775807L || this.i) {
                    int i = this.e;
                    if (i != 0) {
                        if (i == 1) {
                            j7 = -9223372036854775807L;
                        } else if (i == 2) {
                            j7 = -9223372036854775807L;
                            if (j2 < j4) {
                                z3 = false;
                            }
                        } else {
                            if (i != 3) {
                                r3.l();
                                return 0;
                            }
                            this.k.getClass();
                            j7 = -9223372036854775807L;
                            long jH2 = pqf.H(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j12 = this.f;
                                if (j12 == -9223372036854775807L || j12 == j2 || jH >= -30000 || jH2 <= 100000) {
                                }
                            }
                            z3 = false;
                        }
                        z3 = true;
                    } else {
                        j7 = -9223372036854775807L;
                        z3 = this.d;
                    }
                } else {
                    z3 = false;
                    j7 = -9223372036854775807L;
                }
                if (z3) {
                    return 0;
                }
                if (!this.d || j2 == this.f) {
                    return 5;
                }
                this.k.getClass();
                long jNanoTime = System.nanoTime();
                nuf nufVar = this.b;
                long j13 = (w21Var.b * 1000) + jNanoTime;
                long j14 = nufVar.n;
                if (j != j14) {
                    nufVar.o = nufVar.l;
                    nufVar.p = nufVar.m;
                    nufVar.q = j14;
                    nufVar.j = nufVar.k;
                }
                long j15 = nufVar.o;
                if (j15 != -1) {
                    if (j5 != j7) {
                        f = (j6 - j15) * j5;
                        f2 = nufVar.h;
                    } else {
                        f = (j - nufVar.q) * 1000;
                        f2 = nufVar.h;
                    }
                    long j16 = nufVar.p + ((long) (f / f2));
                    if (Math.abs(j13 - j16) <= 20000000) {
                        j13 = j16;
                    } else {
                        nufVar.b();
                    }
                }
                nufVar.l = j6;
                nufVar.m = j13;
                nufVar.n = j;
                kuf kufVar = nufVar.c;
                if (kufVar != null) {
                    long j17 = kufVar.c;
                    long j18 = nufVar.c.d;
                    if (j17 != j7 && j18 != j7) {
                        long j19 = (((j13 - j17) / j18) * j18) + j17;
                        if (j13 <= j19) {
                            j8 = j19 - j18;
                        } else {
                            j19 += j18;
                            j8 = j19;
                        }
                        long j20 = j19 - j13;
                        long j21 = j13 - j8;
                        long jAbs = Math.abs(j20 - j21);
                        if (jAbs < j18 / 2) {
                            j10 = j18;
                            long j22 = j10 / 4;
                            j9 = j8;
                            if (jAbs < j22) {
                                j11 = nufVar.j;
                                if (j11 != 0) {
                                    nufVar.k = j11;
                                } else {
                                    if (j20 < j21) {
                                        j22 = -j22;
                                    }
                                    nufVar.k = j22;
                                    j11 = j22;
                                }
                            } else {
                                j11 = 0;
                                nufVar.k = 0L;
                            }
                        } else {
                            j9 = j8;
                            j10 = j18;
                            j11 = nufVar.j;
                            nufVar.k = j11;
                        }
                        if (j20 + j11 >= j21) {
                            j19 = j9;
                        }
                        j13 = j19 - ((j10 * 80) / 100);
                    }
                }
                w21Var.c = j13;
                long j23 = (j13 - jNanoTime) / 1000;
                w21Var.b = j23;
                boolean z5 = (this.h == j7 || this.i) ? false : true;
                if (this.a.R0(j23, j2, z2, z5)) {
                    return 4;
                }
                long j24 = w21Var.b;
                if (j24 >= -30000 || z2) {
                    return j24 > 50000 ? 5 : 1;
                }
                return z5 ? 3 : 2;
            }
            if (this.a.R0(jH, j2, z2, true)) {
                return 4;
            }
            if (!this.d || w21Var.b >= 30000) {
                this.m = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.m && !this.l))) {
            this.h = -9223372036854775807L;
            return true;
        }
        if (this.h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.h) {
            return true;
        }
        this.h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.i = z;
        long j = this.c;
        if (j > 0) {
            this.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.h = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.k.getClass();
        this.g = pqf.H(SystemClock.elapsedRealtime());
        nuf nufVar = this.b;
        nufVar.d = true;
        nufVar.b();
        if (!nufVar.b) {
            DisplayManager displayManager = (DisplayManager) nufVar.a.getSystemService("display");
            kuf mufVar = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    mufVar = Build.VERSION.SDK_INT >= 33 ? new muf(choreographer, displayManager) : new luf(choreographer, displayManager);
                } catch (RuntimeException e) {
                    xo1.W("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            nufVar.c = mufVar;
            nufVar.b = true;
        }
        kuf kufVar = nufVar.c;
        if (kufVar != null) {
            kufVar.a();
        }
        nufVar.c(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                r3.l();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(Surface surface) {
        this.l = surface != null;
        this.m = false;
        nuf nufVar = this.b;
        if (nufVar.e != surface) {
            nufVar.a();
            nufVar.e = surface;
            nufVar.c(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void g(float f) {
        pa7.A(f > 0.0f);
        if (f == this.j) {
            return;
        }
        this.j = f;
        nuf nufVar = this.b;
        nufVar.h = f;
        nufVar.c(false);
    }
}
