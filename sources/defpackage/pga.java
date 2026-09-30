package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pga implements tuf {
    public jy6 a;
    public rr5 b;
    public long c;
    public int d;
    public Executor e;
    public final /* synthetic */ tga f;

    public pga(tga tgaVar, Context context) {
        this.f = tgaVar;
        pqf.F(context);
        ey6 ey6Var = jy6.b;
        this.a = yob.e;
        this.e = tga.q;
    }

    @Override // defpackage.tuf
    public final void a() {
        tga tgaVar = this.f;
        if (tgaVar.n == 2) {
            return;
        }
        jce jceVar = tgaVar.k;
        if (jceVar != null) {
            jceVar.a.removeCallbacksAndMessages(null);
        }
        tgaVar.l = null;
        tgaVar.n = 2;
    }

    @Override // defpackage.tuf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.tuf
    public final boolean c() {
        return false;
    }

    @Override // defpackage.tuf
    public final void d() {
        tga tgaVar = this.f;
        if (tgaVar.d) {
            tgaVar.e.d();
        }
    }

    @Override // defpackage.tuf
    public final void e() {
        tga tgaVar = this.f;
        if (tgaVar.d) {
            tgaVar.e.e();
        }
    }

    @Override // defpackage.tuf
    public final void f(rr5 rr5Var, long j, int i, List list) {
        pa7.J(false);
        this.a = jy6.o(list);
        this.b = rr5Var;
        qr5 qr5VarA = rr5Var.a();
        e82 e82Var = rr5Var.H;
        if (e82Var == null || !e82Var.d()) {
            e82Var = e82.h;
        }
        qr5VarA.G = e82Var;
        new rr5(qr5VarA);
        throw null;
    }

    @Override // defpackage.tuf
    public final void g(long j) {
        this.c = j;
    }

    @Override // defpackage.tuf
    public final Surface getInputSurface() {
        pa7.J(false);
        throw null;
    }

    @Override // defpackage.tuf
    public final void h() {
        tga tgaVar = this.f;
        if (tgaVar.o >= -9223372036854775807L) {
            tgaVar.e.h();
        }
    }

    @Override // defpackage.tuf
    public final void i(int i) {
        this.f.e.i(i);
    }

    @Override // defpackage.tuf
    public final void j(float f) {
        tga tgaVar = this.f;
        tgaVar.i.c(f);
        tgaVar.e.j(f);
    }

    @Override // defpackage.tuf
    public final void k() {
        int i = xkd.c.a;
        this.f.l = null;
    }

    @Override // defpackage.tuf
    public final void l(cp8 cp8Var) {
        this.e = f94.a;
    }

    @Override // defpackage.tuf
    public final boolean m(long j, dp8 dp8Var) {
        int i;
        pa7.J(false);
        long j2 = j + this.c;
        tga tgaVar = this.f;
        juf jufVar = tgaVar.i;
        long j3 = jufVar.a;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * jufVar.c) + jufVar.b);
        if (j4 != -9223372036854775807L) {
            long j5 = tgaVar.h;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.d) < 2) {
                this.d = i + 1;
                gp8 gp8Var = dp8Var.c;
                po8 po8Var = dp8Var.a;
                int i2 = dp8Var.b;
                Trace.beginSection("dropVideoBuffer");
                po8Var.f(i2);
                Trace.endSection();
                gp8Var.U0(0, 1);
                return true;
            }
        }
        int i3 = tgaVar.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[Catch: jb6 -> 0x0036, TryCatch #0 {jb6 -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[Catch: jb6 -> 0x0036, TryCatch #0 {jb6 -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0051 A[Catch: jb6 -> 0x0036, TryCatch #0 {jb6 -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[Catch: jb6 -> 0x0036, TryCatch #0 {jb6 -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082 A[Catch: jb6 -> 0x0036, TRY_LEAVE, TryCatch #0 {jb6 -> 0x0036, blocks: (B:14:0x0026, B:17:0x002e, B:25:0x003c, B:28:0x0042, B:30:0x0046, B:37:0x0059, B:40:0x0060, B:45:0x0082, B:35:0x0051), top: B:50:0x0026 }] */
    @Override // defpackage.tuf
    public final boolean n(rr5 rr5Var) throws suf {
        tga tgaVar = this.f;
        boolean zZ0 = true;
        pa7.J(tgaVar.n == 0);
        e82 e82Var = rr5Var.H;
        if (e82Var == null || !e82Var.d()) {
            e82Var = e82.h;
        }
        int i = e82Var.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    if (i == 6) {
                        if (Build.VERSION.SDK_INT >= 33 || !hkg.z0("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zZ0 = false;
                        }
                    } else if (i == 7) {
                        zZ0 = hkg.z0("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (zZ0 && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        xo1.V("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        e82 e82Var2 = e82.h;
                    } else if (i != 2 || i == 10) {
                        e82 e82Var3 = e82.h;
                    }
                } else {
                    if (!(i2 >= 33 && hkg.z0("EGL_EXT_gl_colorspace_bt2020_pq"))) {
                        if (i == 6) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                zZ0 = false;
                            } else {
                                zZ0 = false;
                            }
                        } else if (i == 7) {
                            zZ0 = hkg.z0("EGL_EXT_gl_colorspace_bt2020_hlg");
                        }
                        if (zZ0) {
                            if (i != 2) {
                                e82 e82Var4 = e82.h;
                            } else {
                                e82 e82Var5 = e82.h;
                            }
                        } else if (i != 2) {
                            e82 e82Var6 = e82.h;
                        } else {
                            e82 e82Var7 = e82.h;
                        }
                    }
                }
            } catch (jb6 e) {
                throw new suf(e, rr5Var);
            }
        } else {
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33) {
                    zZ0 = false;
                } else {
                    zZ0 = false;
                }
            } else if (i == 7) {
                zZ0 = hkg.z0("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (zZ0) {
                if (i != 2) {
                    e82 e82Var8 = e82.h;
                } else {
                    e82 e82Var9 = e82.h;
                }
            } else if (i != 2) {
                e82 e82Var10 = e82.h;
            } else {
                e82 e82Var11 = e82.h;
            }
        }
        ece eceVar = tgaVar.f;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        tgaVar.k = eceVar.a(looperMyLooper, null);
        tgaVar.b.a();
        throw null;
    }

    @Override // defpackage.tuf
    public final void o(boolean z) {
        p90 p90Var;
        tga tgaVar = this.f;
        gu3 gu3Var = tgaVar.e;
        if (tgaVar.n == 1) {
            tgaVar.m++;
            gu3Var.o(z);
            while (true) {
                int iD0 = tgaVar.j.d0();
                p90Var = tgaVar.j;
                if (iD0 <= 1) {
                    break;
                } else {
                    p90Var.W();
                }
            }
            if (p90Var.d0() == 1) {
                ((sga) tgaVar.j.W()).getClass();
                throw null;
            }
            tgaVar.o = -9223372036854775807L;
            jce jceVar = tgaVar.k;
            jceVar.getClass();
            jceVar.e(new m45(13, tgaVar));
        }
    }

    @Override // defpackage.tuf
    public final void p(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = jy6.o(list);
        rr5 rr5Var = this.b;
        if (rr5Var == null) {
            return;
        }
        qr5 qr5VarA = rr5Var.a();
        e82 e82Var = rr5Var.H;
        if (e82Var == null || !e82Var.d()) {
            e82Var = e82.h;
        }
        qr5VarA.G = e82Var;
        new rr5(qr5VarA);
        throw null;
    }

    @Override // defpackage.tuf
    public final void q(long j, long j2) throws suf {
        this.f.e.q(j + this.c, j2);
    }

    @Override // defpackage.tuf
    public final void r(boolean z) {
        tga tgaVar = this.f;
        if (tgaVar.d) {
            tgaVar.e.r(z);
        }
    }

    @Override // defpackage.tuf
    public final boolean s(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // defpackage.tuf
    public final void t(guf gufVar) {
        this.f.e.k = gufVar;
    }

    @Override // defpackage.tuf
    public final void v(Surface surface, xkd xkdVar) {
        tga tgaVar = this.f;
        Pair pair = tgaVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((xkd) tgaVar.l.second).equals(xkdVar)) {
            return;
        }
        tgaVar.l = Pair.create(surface, xkdVar);
        int i = xkdVar.a;
    }

    @Override // defpackage.tuf
    public final void w() {
        tga tgaVar = this.f;
        if (tgaVar.j.d0() == 0) {
            tgaVar.e.w();
            return;
        }
        p90 p90Var = new p90();
        if (tgaVar.j.d0() <= 0) {
            tgaVar.j = p90Var;
        } else {
            ((sga) tgaVar.j.W()).getClass();
            throw null;
        }
    }

    @Override // defpackage.tuf
    public final void u() {
    }
}
