package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.network.ErrorCodes;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g55 implements Handler.Callback, tp8, guf {
    public static final long s1 = pqf.R(10000);
    public final xp8 E0;
    public final nq8 F0;
    public final sr3 G0;
    public final uha H0;
    public final ro3 I0;
    public final jce J0;
    public final boolean K0;
    public final ij0 L0;
    public boolean M0;
    public ysc N0;
    public iic O0;
    public boolean P0;
    public boolean Q0;
    public f55 R0;
    public int S0;
    public mga T0;
    public d55 U0;
    public boolean V0;
    public boolean W0;
    public final wr3 X;
    public boolean X0;
    public final ArrayList Y;
    public boolean Y0;
    public final l45 Z;
    public long Z0;
    public final ob9[] a;
    public boolean a1;
    public final hu0[] b;
    public int b1;
    public final boolean[] c;
    public boolean c1;
    public final au3 d;
    public boolean d1;
    public final r1f e;
    public boolean e1;
    public final ur3 f;
    public boolean f1;
    public final jce g;
    public int g1;
    public f55 h1;
    public long i1;
    public long j1;
    public int k1;
    public boolean l1;
    public g45 m1;
    public long n1;
    public i45 o1;
    public long p1;
    public boolean q1;
    public float r1;
    public final veh v;
    public final Looper w;
    public final fye x;
    public final eye y;
    public final long z;

    public g55(Context context, hu0[] hu0VarArr, hu0[] hu0VarArr2, au3 au3Var, r1f r1fVar, ur3 ur3Var, lp3 lp3Var, int i, boolean z, ro3 ro3Var, ysc yscVar, sr3 sr3Var, Looper looper, l45 l45Var, uha uhaVar, final guf gufVar) {
        Looper looper2;
        i45 i45Var = i45.a;
        this.p1 = -9223372036854775807L;
        this.Z = l45Var;
        this.d = au3Var;
        this.e = r1fVar;
        this.f = ur3Var;
        this.b1 = i;
        this.c1 = z;
        this.N0 = yscVar;
        this.G0 = sr3Var;
        boolean z2 = false;
        this.W0 = false;
        this.H0 = uhaVar;
        this.o1 = i45Var;
        this.I0 = ro3Var;
        this.r1 = 1.0f;
        this.O0 = iic.b;
        this.M0 = true;
        this.n1 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.z = ur3Var.l;
        dye dyeVar = gye.a;
        mga mgaVarK = mga.k(r1fVar);
        this.T0 = mgaVarK;
        this.U0 = new d55(mgaVarK);
        this.b = new hu0[hu0VarArr.length];
        this.c = new boolean[hu0VarArr.length];
        au3Var.getClass();
        this.a = new ob9[hu0VarArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < hu0VarArr.length; i2++) {
            hu0 hu0Var = hu0VarArr[i2];
            ece eceVar = ece.a;
            hu0Var.e = i2;
            hu0Var.f = uhaVar;
            hu0Var.g = eceVar;
            this.b[i2] = hu0Var;
            hu0 hu0Var2 = this.b[i2];
            synchronized (hu0Var2.a) {
                hu0Var2.H0 = au3Var;
            }
            hu0 hu0Var3 = hu0VarArr2[i2];
            if (hu0Var3 != null) {
                hu0Var3.e = i2;
                hu0Var3.f = uhaVar;
                hu0Var3.g = eceVar;
                z3 = true;
            }
            ob9[] ob9VarArr = this.a;
            hu0 hu0Var4 = hu0VarArr[i2];
            ob9 ob9Var = new ob9();
            ob9Var.e = hu0Var4;
            ob9Var.a = i2;
            ob9Var.f = hu0Var3;
            ob9Var.b = 0;
            ob9Var.c = false;
            ob9Var.d = false;
            ob9VarArr[i2] = ob9Var;
        }
        this.K0 = z3;
        this.X = new wr3(this);
        this.Y = new ArrayList();
        this.x = new fye();
        this.y = new eye();
        pa7.J(au3Var.a == null);
        au3Var.a = this;
        au3Var.b = lp3Var;
        au3Var.f = au3Var.e;
        this.l1 = true;
        jce jceVar = new jce(new Handler(looper, null));
        this.J0 = jceVar;
        this.E0 = new xp8(ro3Var, jceVar, new r45(3, this), hu0VarArr.length);
        this.F0 = new nq8(this, ro3Var, jceVar, uhaVar, lp3Var);
        veh vehVar = new veh();
        this.v = vehVar;
        synchronized (vehVar.c) {
            try {
                looper2 = (Looper) vehVar.d;
                if (looper2 == null) {
                    if (vehVar.b == 0 && ((HandlerThread) vehVar.e) == null) {
                        z2 = true;
                    }
                    pa7.J(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    vehVar.e = handlerThread;
                    handlerThread.start();
                    looper2 = ((HandlerThread) vehVar.e).getLooper();
                    vehVar.d = looper2;
                }
                vehVar.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = looper2;
        jce jceVar2 = new jce(new Handler(looper2, this));
        this.g = jceVar2;
        this.L0 = new ij0(context, looper2, this);
        jceVar2.c(35, new guf() { // from class: z45
            @Override // defpackage.guf
            public final void c(long j, long j2, rr5 rr5Var, MediaFormat mediaFormat) {
                gufVar.c(j, j2, rr5Var, mediaFormat);
                this.a.c(j, j2, rr5Var, mediaFormat);
            }
        }).b();
        jceVar2.c(39, new a55(this)).b();
    }

    public static Pair S(gye gyeVar, f55 f55Var, boolean z, int i, boolean z2, fye fyeVar, eye eyeVar) {
        int iT;
        gye gyeVar2 = f55Var.a;
        if (gyeVar.p()) {
            return null;
        }
        gye gyeVar3 = gyeVar2.p() ? gyeVar : gyeVar2;
        try {
            Pair pairI = gyeVar3.i(fyeVar, eyeVar, f55Var.b, f55Var.c);
            if (!gyeVar.equals(gyeVar3)) {
                if (gyeVar.b(pairI.first) == -1) {
                    if (!z || (iT = T(fyeVar, eyeVar, i, z2, pairI.first, gyeVar3, gyeVar)) == -1) {
                        return null;
                    }
                    return gyeVar.i(fyeVar, eyeVar, iT, -9223372036854775807L);
                }
                if (gyeVar3.g(pairI.first, eyeVar).f && gyeVar3.m(eyeVar.c, fyeVar, 0L).l == gyeVar3.b(pairI.first)) {
                    return gyeVar.i(fyeVar, eyeVar, gyeVar.g(pairI.first, eyeVar).c, f55Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(fye fyeVar, eye eyeVar, int i, boolean z, Object obj, gye gyeVar, gye gyeVar2) {
        gye gyeVar3 = gyeVar;
        Object obj2 = gyeVar3.m(gyeVar3.g(obj, eyeVar).c, fyeVar, 0L).a;
        for (int i2 = 0; i2 < gyeVar2.o(); i2++) {
            if (gyeVar2.m(i2, fyeVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = gyeVar3.b(obj);
        int iH = gyeVar3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            gye gyeVar4 = gyeVar3;
            int iD = gyeVar4.d(iB, eyeVar, fyeVar, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = gyeVar2.b(gyeVar4.l(iD));
            i3++;
            gyeVar3 = gyeVar4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return gyeVar2.f(iB2, eyeVar, false).c;
    }

    public static boolean y(vp8 vp8Var) {
        if (vp8Var != null) {
            try {
                nm8 nm8Var = vp8Var.a;
                if (vp8Var.e) {
                    for (occ occVar : vp8Var.c) {
                        if (occVar != null) {
                            occVar.d();
                        }
                    }
                } else {
                    nm8Var.f();
                }
                if ((!vp8Var.e ? 0L : nm8Var.d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, zp8 zp8Var) {
        xp8 xp8Var = this.E0;
        vp8 vp8Var = xp8Var.k[i];
        if (vp8Var == null || !vp8Var.g.a.equals(zp8Var)) {
            return false;
        }
        return this.a[i].h(xp8Var.k[i]);
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.P0;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        mga mgaVar = this.T0;
        if (mgaVar.l == z2 && mgaVar.n == i2 && mgaVar.m == i3) {
            return;
        }
        this.T0 = mgaVar.e(i3, i2, z2);
        D0(false, false);
        xp8 xp8Var = this.E0;
        for (vp8 vp8Var = xp8Var.i; vp8Var != null; vp8Var = vp8Var.m) {
            for (n55 n55Var : (n55[]) vp8Var.o.c) {
                if (n55Var != null) {
                    n55Var.c(z2);
                }
            }
        }
        if (!s0()) {
            w0();
            B0();
            mga mgaVar2 = this.T0;
            if (mgaVar2.p) {
                this.T0 = mgaVar2.i(false);
            }
            xp8Var.r(this.i1);
            return;
        }
        int i4 = this.T0.e;
        jce jceVar = this.g;
        if (i4 != 3) {
            if (i4 == 2) {
                jceVar.g(2);
            }
        } else {
            wr3 wr3Var = this.X;
            wr3Var.f = true;
            wr3Var.a.f();
            u0();
            jceVar.g(2);
        }
    }

    public final boolean B() {
        vp8 vp8Var = this.E0.i;
        long j = vp8Var.g.e;
        if (vp8Var.e) {
            return j == -9223372036854775807L || this.T0.s < j || !s0();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    public final void B0() {
        nga ngaVarE;
        long j;
        float f;
        long jI;
        vp8 vp8Var = this.E0.i;
        if (vp8Var == null) {
            return;
        }
        long jK = vp8Var.e ? vp8Var.a.k() : -9223372036854775807L;
        if (jK != -9223372036854775807L) {
            if (!vp8Var.g()) {
                this.E0.s(vp8Var);
                f();
                t(false);
                C();
            }
            Q(jK, true);
            if (jK != this.T0.s) {
                mga mgaVar = this.T0;
                this.T0 = x(mgaVar.b, jK, mgaVar.c, jK, true, 5);
            }
        } else {
            wr3 wr3Var = this.X;
            boolean z = z();
            nyd nydVar = wr3Var.a;
            hu0 hu0Var = wr3Var.c;
            if (hu0Var == null || hu0Var.m() || ((z && wr3Var.c.v != 2) || (!wr3Var.c.o() && (z || wr3Var.c.l())))) {
                wr3Var.e = true;
                if (wr3Var.f) {
                    nydVar.f();
                }
            } else {
                no8 no8Var = wr3Var.d;
                no8Var.getClass();
                long jB = no8Var.b();
                if (!wr3Var.e) {
                    nydVar.d(jB);
                    ngaVarE = no8Var.e();
                    if (!ngaVarE.equals((nga) nydVar.e)) {
                        nydVar.a(ngaVarE);
                        wr3Var.b.g.c(16, ngaVarE).b();
                    }
                } else if (jB >= nydVar.b()) {
                    wr3Var.e = false;
                    if (wr3Var.f) {
                        nydVar.f();
                    }
                    nydVar.d(jB);
                    ngaVarE = no8Var.e();
                    if (!ngaVarE.equals((nga) nydVar.e)) {
                        nydVar.a(ngaVarE);
                        wr3Var.b.g.c(16, ngaVarE).b();
                    }
                } else if (nydVar.b) {
                    nydVar.d(nydVar.b());
                    nydVar.b = false;
                }
            }
            long jB2 = wr3Var.b();
            this.i1 = jB2;
            long j2 = jB2 - vp8Var.p;
            long j3 = this.T0.s;
            if (!this.Y.isEmpty() && !this.T0.b.c()) {
                if (this.l1) {
                    this.l1 = false;
                }
                mga mgaVar2 = this.T0;
                mgaVar2.a.b(mgaVar2.b.a);
                int iMin = Math.min(this.k1, this.Y.size());
                if (iMin > 0 && this.Y.get(iMin - 1) != null) {
                    r3.f();
                    return;
                } else {
                    if (iMin < this.Y.size() && this.Y.get(iMin) != null) {
                        r3.f();
                        return;
                    }
                    this.k1 = iMin;
                }
            }
            if (this.X.c()) {
                boolean z2 = !this.U0.e;
                mga mgaVar3 = this.T0;
                this.T0 = x(mgaVar3.b, j2, mgaVar3.c, j2, z2, 6);
            } else {
                mga mgaVar4 = this.T0;
                mgaVar4.s = j2;
                mgaVar4.t = SystemClock.elapsedRealtime();
            }
        }
        this.T0.q = this.E0.l.d();
        mga mgaVar5 = this.T0;
        mgaVar5.r = o(mgaVar5.q);
        mga mgaVar6 = this.T0;
        if (mgaVar6.l && mgaVar6.e == 3 && t0(mgaVar6.a, mgaVar6.b)) {
            mga mgaVar7 = this.T0;
            float fG = 1.0f;
            if (mgaVar7.o.a == 1.0f) {
                sr3 sr3Var = this.G0;
                long jL = l(mgaVar7.a, mgaVar7.b.a, mgaVar7.s);
                long j4 = this.T0.r;
                if (sr3Var.c != -9223372036854775807L) {
                    long j5 = jL - j4;
                    long j6 = sr3Var.m;
                    if (j6 == -9223372036854775807L) {
                        sr3Var.m = j5;
                        sr3Var.n = 0L;
                    } else {
                        long jMax = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        sr3Var.m = jMax;
                        sr3Var.n = (long) ((9.999871E-4f * Math.abs(j5 - jMax)) + (sr3Var.n * 0.999f));
                    }
                    if (sr3Var.l != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - sr3Var.l < 1000) {
                            fG = sr3Var.k;
                        }
                    } else {
                        j = 1000;
                    }
                    sr3Var.l = SystemClock.elapsedRealtime();
                    long j7 = (sr3Var.n * 3) + sr3Var.m;
                    if (sr3Var.h > j7) {
                        float fH = pqf.H(j);
                        f = 1.0E-7f;
                        long[] jArr = {j7, sr3Var.e, sr3Var.h - (((long) ((sr3Var.k - 1.0f) * fH)) + ((long) ((sr3Var.i - 1.0f) * fH)))};
                        jI = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j8 = jArr[i];
                            if (j8 > jI) {
                                jI = j8;
                            }
                        }
                        sr3Var.h = jI;
                    } else {
                        f = 1.0E-7f;
                        jI = pqf.i(jL - ((long) (Math.max(0.0f, sr3Var.k - 1.0f) / 1.0E-7f)), sr3Var.h, j7);
                        sr3Var.h = jI;
                        long j9 = sr3Var.g;
                        if (j9 != -9223372036854775807L && jI > j9) {
                            sr3Var.h = j9;
                            jI = j9;
                        }
                    }
                    long j10 = jL - jI;
                    if (Math.abs(j10) < sr3Var.a) {
                        sr3Var.k = 1.0f;
                    } else {
                        fG = pqf.g((f * j10) + 1.0f, sr3Var.j, sr3Var.i);
                        sr3Var.k = fG;
                    }
                }
                if (this.X.e().a != fG) {
                    nga ngaVar = new nga(fG, this.T0.o.b);
                    this.g.f(16);
                    this.X.a(ngaVar);
                    w(this.T0.o, this.X.e().a, false, false);
                }
            }
        }
    }

    public final void C() {
        boolean zB;
        if (y(this.E0.l)) {
            vp8 vp8Var = this.E0.l;
            long jO = o(!vp8Var.e ? 0L : vp8Var.a.d());
            vp8 vp8Var2 = this.E0.i;
            long j = t0(this.T0.a, vp8Var.g.a) ? this.G0.h : -9223372036854775807L;
            uha uhaVar = this.H0;
            gye gyeVar = this.T0.a;
            zp8 zp8Var = vp8Var.g.a;
            float f = this.X.e().a;
            boolean z = this.T0.l;
            t98 t98Var = new t98(uhaVar, gyeVar, zp8Var, jO, f, this.Y0, j);
            zB = this.f.b(t98Var);
            vp8 vp8Var3 = this.E0.i;
            if (!zB && vp8Var3.e && jO < 500000 && this.z > 0) {
                vp8Var3.a.h(this.T0.s);
                zB = this.f.b(t98Var);
            }
        } else {
            zB = false;
        }
        this.a1 = zB;
        if (zB) {
            vp8 vp8Var4 = this.E0.l;
            vp8Var4.getClass();
            ca8 ca8Var = new ca8();
            ca8Var.a = this.i1 - vp8Var4.p;
            float f2 = this.X.e().a;
            pa7.A(f2 > 0.0f || f2 == -3.4028235E38f);
            ca8Var.b = f2;
            long j2 = this.Z0;
            pa7.A(j2 >= 0 || j2 == -9223372036854775807L);
            ca8Var.c = j2;
            da8 da8Var = new da8(ca8Var);
            pa7.J(vp8Var4.m == null);
            vp8Var4.a.o(da8Var);
        }
        x0();
    }

    public final void C0(gye gyeVar, zp8 zp8Var, gye gyeVar2, zp8 zp8Var2, long j, boolean z) {
        boolean zT0 = t0(gyeVar, zp8Var);
        Object obj = zp8Var.a;
        if (!zT0) {
            nga ngaVar = zp8Var.c() ? nga.d : this.T0.o;
            wr3 wr3Var = this.X;
            if (wr3Var.e().equals(ngaVar)) {
                return;
            }
            this.g.f(16);
            wr3Var.a(ngaVar);
            w(this.T0.o, ngaVar.a, false, false);
            return;
        }
        eye eyeVar = this.y;
        int i = gyeVar.g(obj, eyeVar).c;
        fye fyeVar = this.x;
        gyeVar.n(i, fyeVar);
        kp8 kp8Var = fyeVar.h;
        String str = pqf.a;
        long jH = pqf.H(kp8Var.a);
        sr3 sr3Var = this.G0;
        sr3Var.c = jH;
        sr3Var.f = pqf.H(kp8Var.b);
        sr3Var.g = pqf.H(kp8Var.c);
        float f = kp8Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        sr3Var.j = f;
        float f2 = kp8Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        sr3Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            sr3Var.c = -9223372036854775807L;
        }
        sr3Var.a();
        if (j != -9223372036854775807L) {
            sr3Var.d = l(gyeVar, obj, j);
            sr3Var.a();
            return;
        }
        if (!Objects.equals(!gyeVar2.p() ? gyeVar2.m(gyeVar2.g(zp8Var2.a, eyeVar).c, fyeVar, 0L).a : null, fyeVar.a) || z) {
            sr3Var.d = -9223372036854775807L;
            sr3Var.a();
        }
    }

    public final void D() {
        xp8 xp8Var = this.E0;
        xp8Var.p();
        vp8 vp8Var = xp8Var.m;
        if (vp8Var != null) {
            nm8 nm8Var = vp8Var.a;
            if ((!vp8Var.d || vp8Var.e) && !nm8Var.i()) {
                gye gyeVar = this.T0.a;
                if (vp8Var.e) {
                    nm8Var.p();
                }
                Iterator it = this.f.n.values().iterator();
                while (it.hasNext()) {
                    if (((tr3) it.next()).b) {
                        return;
                    }
                }
                if (!vp8Var.d) {
                    long j = vp8Var.g.b;
                    vp8Var.d = true;
                    nm8Var.l(this, j);
                    return;
                }
                ca8 ca8Var = new ca8();
                ca8Var.a = this.i1 - vp8Var.p;
                float f = this.X.e().a;
                pa7.A(f > 0.0f || f == -3.4028235E38f);
                ca8Var.b = f;
                long j2 = this.Z0;
                pa7.A(j2 >= 0 || j2 == -9223372036854775807L);
                ca8Var.c = j2;
                da8 da8Var = new da8(ca8Var);
                pa7.J(vp8Var.m == null);
                nm8Var.o(da8Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        this.Y0 = z;
        this.Z0 = (!z || z2) ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    public final void E(int i) {
        d55 d55Var = this.U0;
        mga mgaVar = this.T0;
        boolean z = d55Var.d | (((mga) d55Var.f) != mgaVar);
        d55Var.d = z;
        d55Var.f = mgaVar;
        if (z) {
            if (!mgaVar.a.p()) {
                mga mgaVar2 = this.T0;
                boolean z2 = mgaVar2.a.b(mgaVar2.b.a) != -1;
                Locale locale = Locale.US;
                mga mgaVar3 = this.T0;
                pa7.I(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", mgaVar3.b.a, mgaVar3.a.getClass().getName(), Integer.valueOf(this.T0.a.o()), Integer.valueOf(i)), z2);
            }
            d55 d55Var2 = this.U0;
            y45 y45Var = this.Z.a;
            y45Var.j.e(new ny2(17, y45Var, d55Var2));
            this.U0 = new d55(this.T0);
        }
    }

    public final void F(int i) {
        ob9 ob9Var = this.a[i];
        try {
            vp8 vp8Var = this.E0.i;
            vp8Var.getClass();
            hu0 hu0VarD = ob9Var.d(vp8Var);
            hu0VarD.getClass();
            occ occVar = hu0VarD.w;
            occVar.getClass();
            occVar.d();
        } catch (IOException | RuntimeException e) {
            int i2 = ((hu0) ob9Var.e).b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            r1f r1fVar = this.E0.i.o;
            xo1.y("ExoPlayerImplInternal", "Disabling track due to error: ".concat(rr5.c(((n55[]) r1fVar.c)[i].h())), e);
            r1f r1fVar2 = new r1f((frb[]) ((frb[]) r1fVar.b).clone(), (n55[]) ((n55[]) r1fVar.c).clone(), (f2f) r1fVar.d, r1fVar.e);
            ((frb[]) r1fVar2.b)[i] = null;
            ((n55[]) r1fVar2.c)[i] = null;
            g(i);
            vp8 vp8Var2 = this.E0.i;
            vp8Var2.a(r1fVar2, this.T0.s, false, new boolean[vp8Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.J0.e(new hw(this, i, z));
        }
    }

    public final void H() throws Throwable {
        u(this.F0.b(), true);
    }

    public final void I() {
        this.U0.e(1);
        throw null;
    }

    public final void J() {
        this.U0.e(1);
        O(false, false, false, true);
        ur3 ur3Var = this.f;
        ConcurrentHashMap concurrentHashMap = ur3Var.n;
        long id = Thread.currentThread().getId();
        long j = ur3Var.o;
        pa7.I("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        ur3Var.o = id;
        uha uhaVar = this.H0;
        tr3 tr3Var = (tr3) concurrentHashMap.get(uhaVar);
        if (tr3Var == null) {
            tr3 tr3Var2 = new tr3();
            tr3Var2.a = 1;
            concurrentHashMap.put(uhaVar, tr3Var2);
        } else {
            tr3Var.a++;
        }
        tr3 tr3Var3 = (tr3) concurrentHashMap.get(uhaVar);
        tr3Var3.getClass();
        Integer num = (Integer) ur3Var.m.get(uhaVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        tr3Var3.c = iIntValue;
        tr3Var3.b = false;
        o0(this.T0.a.p() ? 4 : 2);
        mga mgaVar = this.T0;
        boolean z = mgaVar.l;
        A0(this.L0.c(mgaVar.e, z), mgaVar.n, mgaVar.m, z);
        nq8 nq8Var = this.F0;
        ArrayList arrayList = nq8Var.c;
        pa7.J(!nq8Var.l);
        for (int i = 0; i < arrayList.size(); i++) {
            mq8 mq8Var = (mq8) arrayList.get(i);
            nq8Var.e(mq8Var);
            nq8Var.h.add(mq8Var);
        }
        nq8Var.l = true;
        this.g.g(2);
    }

    public final void K(nh2 nh2Var) {
        iud iudVar;
        try {
            O(true, false, true, false);
            L();
            ur3 ur3Var = this.f;
            uha uhaVar = this.H0;
            ConcurrentHashMap concurrentHashMap = ur3Var.n;
            tr3 tr3Var = (tr3) concurrentHashMap.get(uhaVar);
            if (tr3Var != null) {
                int i = tr3Var.a - 1;
                tr3Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(uhaVar);
                    ur3Var.c();
                }
            }
            if (ur3Var.n.isEmpty()) {
                ur3Var.o = -1L;
            }
            ij0 ij0Var = this.L0;
            ij0Var.c = null;
            ij0Var.a();
            ij0Var.b(0);
            au3 au3Var = this.d;
            if (au3Var.g != null) {
                pa7.I("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(au3Var.g));
            }
            if (Build.VERSION.SDK_INT >= 32 && (iudVar = au3Var.h) != null) {
                iudVar.e();
                au3Var.h = null;
            }
            au3Var.a = null;
            au3Var.b = null;
            o0(1);
        } finally {
            this.g.a.removeCallbacksAndMessages(null);
            this.v.g();
            nh2Var.c();
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.length; i++) {
            hu0 hu0Var = this.b[i];
            synchronized (hu0Var.a) {
                hu0Var.H0 = null;
            }
            ob9 ob9Var = this.a[i];
            hu0 hu0Var2 = (hu0) ob9Var.e;
            pa7.J(hu0Var2.v == 0);
            hu0Var2.s();
            ob9Var.c = false;
            hu0 hu0Var3 = (hu0) ob9Var.f;
            if (hu0Var3 != null) {
                pa7.J(hu0Var3.v == 0);
                hu0Var3.s();
                ob9Var.d = false;
            }
        }
    }

    public final void M(int i, int i2, ggd ggdVar) throws Throwable {
        this.U0.e(1);
        nq8 nq8Var = this.F0;
        nq8Var.getClass();
        pa7.A(i >= 0 && i <= i2 && i2 <= nq8Var.c.size());
        nq8Var.k = ggdVar;
        nq8Var.f(i, i2);
        u(nq8Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[ORIG_RETURN, RETURN] */
    public final void N() {
        int i;
        int i2;
        float f = this.X.e().a;
        xp8 xp8Var = this.E0;
        vp8 vp8Var = xp8Var.i;
        vp8 vp8VarF = xp8Var.f();
        r1f r1fVar = null;
        vp8 vp8Var2 = vp8Var;
        boolean z = true;
        while (vp8Var2 != null && vp8Var2.e) {
            mga mgaVar = this.T0;
            r1f r1fVarJ = vp8Var2.j(f, mgaVar.a, mgaVar.l);
            r1f r1fVar2 = vp8Var2 == this.E0.i ? r1fVarJ : r1fVar;
            r1f r1fVar3 = vp8Var2.o;
            n55[] n55VarArr = (n55[]) r1fVarJ.c;
            boolean z2 = false;
            if (((n55[]) r1fVar3.c).length == n55VarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= n55VarArr.length) {
                        r1f r1fVar4 = r1fVar2;
                        if (vp8Var2 == vp8VarF) {
                            z = false;
                        }
                        vp8Var2 = vp8Var2.m;
                        r1fVar = r1fVar4;
                    } else if (r1fVarJ.o(r1fVar3, i3)) {
                        i3++;
                        r1fVar2 = r1fVar2;
                        r1fVarJ = r1fVarJ;
                    }
                }
            }
            xp8 xp8Var2 = this.E0;
            if (!z) {
                i = 4;
                xp8Var2.s(vp8Var2);
                if (vp8Var2.e) {
                    long jMax = Math.max(vp8Var2.g.b, this.i1 - vp8Var2.p);
                    if (this.K0) {
                        int i4 = 0;
                        while (true) {
                            ob9[] ob9VarArr = this.a;
                            if (i4 >= ob9VarArr.length) {
                                break;
                            }
                            if (this.E0.k[i4] == vp8Var2 && ob9VarArr[i4].h(vp8Var2)) {
                                f();
                                break;
                            }
                            i4++;
                        }
                    }
                    i2 = 4;
                    vp8Var2.a(r1fVarJ, jMax, false, new boolean[vp8Var2.j.length]);
                }
                t(true);
                if (this.T0.e != i2) {
                    C();
                    B0();
                    this.g.g(2);
                    return;
                }
                return;
            }
            vp8 vp8Var3 = xp8Var2.i;
            boolean z3 = (xp8Var2.s(vp8Var3) & 1) != 0;
            boolean[] zArr = new boolean[this.a.length];
            r1fVar2.getClass();
            long jA = vp8Var3.a(r1fVar2, this.T0.s, z3, zArr);
            mga mgaVar2 = this.T0;
            if (mgaVar2.e != 4 && jA != mgaVar2.s) {
                z2 = true;
            }
            mga mgaVar3 = this.T0;
            i = 4;
            this.T0 = x(mgaVar3.b, jA, mgaVar3.c, mgaVar3.d, z2, 5);
            if (z2) {
                Q(jA, true);
            }
            f();
            boolean[] zArr2 = new boolean[this.a.length];
            int i5 = 0;
            while (true) {
                ob9[] ob9VarArr2 = this.a;
                if (i5 >= ob9VarArr2.length) {
                    break;
                }
                int iC = ob9VarArr2[i5].c();
                zArr2[i5] = this.a[i5].j();
                ob9 ob9Var = this.a[i5];
                occ occVar = vp8Var3.c[i5];
                wr3 wr3Var = this.X;
                long j = this.i1;
                boolean z4 = zArr[i5];
                hu0 hu0Var = (hu0) ob9Var.e;
                if (ob9.k(hu0Var)) {
                    if (occVar != hu0Var.w) {
                        ob9Var.a(hu0Var, wr3Var);
                    } else if (z4) {
                        hu0Var.B(j, false, true);
                    }
                }
                hu0 hu0Var2 = (hu0) ob9Var.f;
                if (hu0Var2 != null && ob9.k(hu0Var2)) {
                    if (occVar != hu0Var2.w) {
                        ob9Var.a(hu0Var2, wr3Var);
                    } else if (z4) {
                        hu0Var2.B(j, false, true);
                    }
                }
                if (iC - this.a[i5].c() > 0) {
                    G(i5, false);
                }
                this.g1 -= iC - this.a[i5].c();
                i5++;
            }
            k(zArr2, this.i1);
            a0(vp8Var3);
            i2 = i;
            t(true);
            if (this.T0.e != i2) {
                C();
                B0();
                this.g.g(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:82:0x0196 A[LOOP:3: B:80:0x018e->B:82:0x0196, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd  */
    public final void O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        gye eiaVar;
        zp8 zp8Var;
        mga mgaVar;
        g45 g45Var;
        i1f i1fVar;
        r1f r1fVar;
        List list;
        xp8 xp8Var;
        int i;
        this.g.f(2);
        this.Q0 = false;
        if (this.R0 != null) {
            this.U0.e(1);
            this.R0 = null;
        }
        this.m1 = null;
        D0(false, true);
        wr3 wr3Var = this.X;
        wr3Var.f = false;
        nyd nydVar = wr3Var.a;
        if (nydVar.b) {
            nydVar.d(nydVar.b());
            nydVar.b = false;
        }
        this.i1 = 1000000000000L;
        for (int i2 = 0; i2 < this.a.length; i2++) {
            try {
                g(i2);
            } catch (g45 e) {
                e = e;
                xo1.y("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (RuntimeException e2) {
                e = e2;
                xo1.y("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.p1 = -9223372036854775807L;
        if (z) {
            for (ob9 ob9Var : this.a) {
                try {
                    ob9Var.n();
                } catch (RuntimeException e3) {
                    xo1.y("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.g1 = 0;
        mga mgaVar2 = this.T0;
        zp8 zp8Var2 = mgaVar2.b;
        long j4 = mgaVar2.s;
        if (this.T0.b.c()) {
            j = this.T0.c;
        } else {
            mga mgaVar3 = this.T0;
            eye eyeVar = this.y;
            zp8 zp8Var3 = mgaVar3.b;
            gye gyeVar = mgaVar3.a;
            if (gyeVar.p() || gyeVar.g(zp8Var3.a, eyeVar).f) {
                j = this.T0.c;
            } else {
                j = this.T0.s;
            }
        }
        if (z2) {
            this.h1 = null;
            Pair pairM = m(this.T0.a);
            zp8Var2 = (zp8) pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            z5 = zp8Var2.equals(this.T0.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.E0.b();
        this.a1 = false;
        gye gyeVar2 = this.T0.a;
        if (z3 && (gyeVar2 instanceof eia)) {
            eia eiaVar2 = (eia) gyeVar2;
            ggd ggdVar = this.F0.k;
            gye[] gyeVarArr = eiaVar2.h;
            gye[] gyeVarArr2 = new gye[gyeVarArr.length];
            for (int i3 = 0; i3 < gyeVarArr.length; i3++) {
                gyeVarArr2[i3] = new dia(gyeVarArr[i3]);
            }
            eiaVar = new eia(gyeVarArr2, eiaVar2.i, ggdVar);
            if (zp8Var2.b != -1) {
                eiaVar.g(zp8Var2.a, this.y);
                int i4 = this.y.c;
                fye fyeVar = this.x;
                eiaVar.m(i4, fyeVar, 0L);
                if (fyeVar.a()) {
                    zp8Var = new zp8(zp8Var2.d, zp8Var2.a);
                }
            }
            mgaVar = this.T0;
            int i5 = mgaVar.e;
            if (z4) {
                g45Var = null;
            } else {
                g45Var = mgaVar.f;
            }
            if (z5) {
                i1fVar = i1f.d;
            } else {
                i1fVar = mgaVar.h;
            }
            i1f i1fVar2 = i1fVar;
            if (z5) {
                r1fVar = this.e;
            } else {
                r1fVar = mgaVar.i;
            }
            r1f r1fVar2 = r1fVar;
            if (z5) {
                ey6 ey6Var = jy6.b;
                list = yob.e;
            } else {
                list = mgaVar.j;
            }
            this.T0 = new mga(eiaVar, zp8Var, j3, j2, i5, g45Var, false, i1fVar2, r1fVar2, list, zp8Var, mgaVar.l, mgaVar.m, mgaVar.n, mgaVar.o, j2, 0L, j2, 0L, false);
            if (z3) {
                xp8Var = this.E0;
                if (!xp8Var.q.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i = 0; i < xp8Var.q.size(); i++) {
                        ((vp8) xp8Var.q.get(i)).i();
                    }
                    xp8Var.q = arrayList;
                    xp8Var.m = null;
                    xp8Var.p();
                }
                nq8 nq8Var = this.F0;
                HashMap map = nq8Var.g;
                for (lq8 lq8Var : map.values()) {
                    try {
                        lq8Var.a.n(lq8Var.b);
                    } catch (RuntimeException e4) {
                        xo1.y("MediaSourceList", "Failed to release child source.", e4);
                    }
                    fu0 fu0Var = lq8Var.a;
                    kq8 kq8Var = lq8Var.c;
                    fu0Var.q(kq8Var);
                    lq8Var.a.p(kq8Var);
                }
                map.clear();
                nq8Var.h.clear();
                nq8Var.l = false;
            }
        }
        eiaVar = gyeVar2;
        zp8Var = zp8Var2;
        mgaVar = this.T0;
        int i6 = mgaVar.e;
        if (z4) {
            g45Var = null;
        } else {
            g45Var = mgaVar.f;
        }
        if (z5) {
            i1fVar = i1f.d;
        } else {
            i1fVar = mgaVar.h;
        }
        i1f i1fVar3 = i1fVar;
        if (z5) {
            r1fVar = this.e;
        } else {
            r1fVar = mgaVar.i;
        }
        r1f r1fVar3 = r1fVar;
        if (z5) {
            ey6 ey6Var2 = jy6.b;
            list = yob.e;
        } else {
            list = mgaVar.j;
        }
        this.T0 = new mga(eiaVar, zp8Var, j3, j2, i6, g45Var, false, i1fVar3, r1fVar3, list, zp8Var, mgaVar.l, mgaVar.m, mgaVar.n, mgaVar.o, j2, 0L, j2, 0L, false);
        if (z3) {
            xp8Var = this.E0;
            if (!xp8Var.q.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i < xp8Var.q.size()) {
                    ((vp8) xp8Var.q.get(i)).i();
                }
                xp8Var.q = arrayList2;
                xp8Var.m = null;
                xp8Var.p();
            }
            nq8 nq8Var2 = this.F0;
            HashMap map2 = nq8Var2.g;
            while (r4.hasNext()) {
                lq8Var.a.n(lq8Var.b);
                fu0 fu0Var2 = lq8Var.a;
                kq8 kq8Var2 = lq8Var.c;
                fu0Var2.q(kq8Var2);
                lq8Var.a.p(kq8Var2);
            }
            map2.clear();
            nq8Var2.h.clear();
            nq8Var2.l = false;
        }
    }

    public final void P() {
        vp8 vp8Var = this.E0.i;
        this.X0 = vp8Var != null && vp8Var.g.h && this.W0;
    }

    public final void Q(long j, boolean z) {
        vp8 vp8Var = this.E0.i;
        long j2 = j + (vp8Var == null ? 1000000000000L : vp8Var.p);
        this.i1 = j2;
        this.X.a.d(j2);
        for (ob9 ob9Var : this.a) {
            long j3 = this.i1;
            hu0 hu0VarD = ob9Var.d(vp8Var);
            if (hu0VarD != null) {
                hu0VarD.B(j3, false, z);
            }
        }
        for (vp8 vp8Var2 = r0.i; vp8Var2 != null; vp8Var2 = vp8Var2.m) {
            for (n55 n55Var : (n55[]) vp8Var2.o.c) {
                if (n55Var != null) {
                    n55Var.j();
                }
            }
        }
    }

    public final void R(gye gyeVar, gye gyeVar2) {
        if (gyeVar.p() && gyeVar2.p()) {
            return;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            kv2.z(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        int i = this.T0.e;
        long j2 = s1;
        long jMin = i == 3 ? 1000L : j2;
        for (ob9 ob9Var : this.a) {
            long j3 = this.i1;
            long j4 = this.j1;
            hu0 hu0Var = (hu0) ob9Var.f;
            hu0 hu0Var2 = (hu0) ob9Var.e;
            long jI = ob9.k(hu0Var2) ? hu0Var2.i(j3, j4) : Long.MAX_VALUE;
            if (hu0Var != null && hu0Var.v != 0) {
                jI = Math.min(jI, hu0Var.i(j3, j4));
            }
            jMin = Math.min(jMin, pqf.R(jI));
        }
        if (this.T0.m()) {
            vp8 vp8Var = this.E0.i;
            vp8 vp8Var2 = vp8Var != null ? vp8Var.m : null;
            if (vp8Var2 != null) {
                if ((pqf.H(jMin) * this.T0.o.a) + this.i1 >= vp8Var2.e()) {
                    jMin = Math.min(jMin, j2);
                }
            }
        }
        this.g.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void V(boolean z) {
        zp8 zp8Var = this.E0.i.g.a;
        long jX = X(zp8Var, this.T0.s, true, false);
        if (jX != this.T0.s) {
            mga mgaVar = this.T0;
            this.T0 = x(zp8Var, jX, mgaVar.c, mgaVar.d, z, 5);
        }
    }

    public final void W(f55 f55Var) throws Throwable {
        zp8 zp8VarU;
        boolean z;
        long jMax;
        long jLongValue;
        long j;
        long j2;
        long jE;
        mga mgaVar;
        int i;
        long j3;
        int i2;
        long j4;
        zp8 zp8Var;
        long j5;
        g55 g55Var = this;
        if (g55Var.Q0) {
            if (g55Var.R0 != null) {
                g55Var.S0++;
                g55Var.U0.e(1);
            }
            g55Var.R0 = f55Var;
            return;
        }
        g55Var.U0.e(1);
        Pair pairS = S(g55Var.T0.a, f55Var, true, g55Var.b1, g55Var.c1, g55Var.x, g55Var.y);
        if (pairS == null) {
            Pair pairM = g55Var.m(g55Var.T0.a);
            zp8VarU = (zp8) pairM.first;
            jLongValue = ((Long) pairM.second).longValue();
            z = !g55Var.T0.a.p();
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairS.first;
            long jLongValue2 = ((Long) pairS.second).longValue();
            long j6 = f55Var.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            xp8 xp8Var = g55Var.E0;
            mga mgaVar2 = g55Var.T0;
            zp8VarU = xp8Var.u(mgaVar2, mgaVar2.a, obj, jLongValue2, true, false);
            if (zp8VarU.c()) {
                g55Var.T0.a.g(zp8VarU.a, g55Var.y);
                if (g55Var.y.e(zp8VarU.b) == zp8VarU.c) {
                    g55Var.y.getClass();
                    qf qfVar = qf.c;
                }
                g55Var.y.getClass();
                qf.c.a(zp8VarU.b).getClass();
                z = true;
                jMax = Math.max(j6, 0L);
                jLongValue = 0;
            } else {
                z = f55Var.c == -9223372036854775807L;
                jMax = j6;
                jLongValue = jLongValue2;
            }
        }
        try {
            try {
                if (!g55Var.T0.a.p()) {
                    mga mgaVar3 = g55Var.T0;
                    if (pairS == null) {
                        if (mgaVar3.e != 1) {
                            g55Var.o0(4);
                        }
                        g55Var.O(false, true, false, true);
                    } else {
                        if (zp8VarU.equals(mgaVar3.b)) {
                            try {
                                vp8 vp8Var = g55Var.E0.i;
                                if (vp8Var == null || !vp8Var.e || jLongValue == 0) {
                                    jE = jLongValue;
                                } else {
                                    nm8 nm8Var = vp8Var.a;
                                    long j7 = g55Var.x.k;
                                    if (g55Var.P0 && j7 != -9223372036854775807L) {
                                        g55Var.O0.getClass();
                                    }
                                    jE = nm8Var.e(jLongValue, g55Var.N0);
                                }
                                if (pqf.R(jE) == pqf.R(g55Var.T0.s) && ((i = (mgaVar = g55Var.T0).e) == 2 || i == 3)) {
                                    j3 = mgaVar.s;
                                    i2 = 2;
                                    j4 = j3;
                                    z = z;
                                    zp8Var = zp8VarU;
                                    j5 = jMax;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z = z;
                                zp8VarU = zp8VarU;
                                jMax = jMax;
                                j = jMax;
                                j2 = jLongValue;
                                g55Var.T0 = g55Var.x(zp8VarU, j2, j, j2, z, 2);
                                throw th;
                            }
                        } else {
                            jE = jLongValue;
                        }
                        try {
                            try {
                                long jX = g55Var.X(zp8VarU, jE, g55Var.z(), g55Var.T0.e == 4);
                                z |= jLongValue != jX;
                                try {
                                    mga mgaVar4 = g55Var.T0;
                                    zp8 zp8Var2 = zp8VarU;
                                    try {
                                        gye gyeVar = mgaVar4.a;
                                        long j8 = jMax;
                                        try {
                                            g55Var.C0(gyeVar, zp8Var2, gyeVar, mgaVar4.b, j8, true);
                                            zp8Var = zp8Var2;
                                            j5 = j8;
                                            j3 = jX;
                                            i2 = 2;
                                            j4 = j3;
                                            g55Var = this;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zp8VarU = zp8Var2;
                                            j = j8;
                                            j2 = jX;
                                            g55Var.T0 = g55Var.x(zp8VarU, j2, j, j2, z, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        zp8VarU = zp8Var2;
                                        j = jMax;
                                        j2 = jX;
                                        g55Var.T0 = g55Var.x(zp8VarU, j2, j, j2, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j = jMax;
                                j2 = jLongValue;
                                g55Var.T0 = g55Var.x(zp8VarU, j2, j, j2, z, 2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    g55Var.T0 = g55Var.x(zp8Var, j3, j5, j4, z, i2);
                }
                g55Var.h1 = f55Var;
                z = z;
                zp8Var = zp8VarU;
                j3 = jLongValue;
                j5 = jMax;
                i2 = 2;
                j4 = j3;
                g55Var = this;
                g55Var.T0 = g55Var.x(zp8Var, j3, j5, j4, z, i2);
            } catch (Throwable th7) {
                th = th7;
                z = z;
                zp8VarU = zp8VarU;
                j2 = jLongValue;
                j = jMax;
            }
        } catch (Throwable th8) {
            th = th8;
            z = z;
            zp8VarU = zp8VarU;
            j = jMax;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0120  */
    public final long X(zp8 zp8Var, long j, boolean z, boolean z2) {
        xp8 xp8Var;
        int i;
        w0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.T0.e == 3) {
            o0(2);
        }
        vp8 vp8Var = this.E0.i;
        vp8 vp8Var2 = vp8Var;
        while (vp8Var2 != null && !zp8Var.equals(vp8Var2.g.a)) {
            vp8Var2 = vp8Var2.m;
        }
        if (z || vp8Var != vp8Var2 || (vp8Var2 != null && vp8Var2.p + j < 0)) {
            for (int i2 = 0; i2 < this.a.length; i2++) {
                g(i2);
            }
            this.p1 = -9223372036854775807L;
            if (vp8Var2 != null) {
                while (true) {
                    xp8Var = this.E0;
                    if (xp8Var.i == vp8Var2) {
                        break;
                    }
                    xp8Var.a();
                }
                xp8Var.s(vp8Var2);
                vp8Var2.p = 1000000000000L;
                pa7.J(!z());
                k(new boolean[this.a.length], this.E0.d().e());
                a0(vp8Var2);
            }
        }
        f();
        if (this.P0) {
            for (ob9 ob9Var : this.a) {
                if (ob9Var.j() && ((i = ((hu0) ob9Var.e).b) == 2 || i == 4)) {
                    this.Q0 = true;
                    break;
                }
            }
        }
        xp8 xp8Var2 = this.E0;
        if (vp8Var2 != null) {
            xp8Var2.s(vp8Var2);
            if (!vp8Var2.e) {
                vp8Var2.g = vp8Var2.g.b(j, -9223372036854775807L);
            } else if (vp8Var2.f) {
                if (this.P0) {
                    this.O0.getClass();
                    if (this.T0.a.p() || !vp8Var2.g.a.equals(this.T0.b)) {
                        j = vp8Var2.a.g(j);
                        vp8Var2.a.h(j - this.z);
                    } else {
                        long j2 = vp8Var2.p + j;
                        boolean z4 = true;
                        for (ob9 ob9Var2 : this.a) {
                            if (ob9Var2.j()) {
                                hu0 hu0VarD = ob9Var2.d(vp8Var2);
                                z4 &= hu0VarD != null && hu0VarD.F(j2);
                            }
                        }
                        if (z4) {
                            nm8 nm8Var = vp8Var2.a;
                            long j3 = this.T0.s;
                            ysc yscVar = ysc.c;
                            if (nm8Var.e(j3, yscVar) == vp8Var2.a.e(j, yscVar)) {
                                z3 = false;
                            } else {
                                j = vp8Var2.a.g(j);
                                vp8Var2.a.h(j - this.z);
                            }
                        } else {
                            j = vp8Var2.a.g(j);
                            vp8Var2.a.h(j - this.z);
                        }
                    }
                } else {
                    j = vp8Var2.a.g(j);
                    vp8Var2.a.h(j - this.z);
                }
            }
            Q(j, z3);
            C();
        } else {
            xp8Var2.b();
            Q(j, true);
        }
        t(false);
        this.g.g(2);
        return j;
    }

    public final void Y(wha whaVar) {
        whaVar.getClass();
        jce jceVar = this.g;
        if (whaVar.e != this.w) {
            jceVar.c(15, whaVar).b();
            return;
        }
        synchronized (whaVar) {
        }
        try {
            whaVar.a.d(whaVar.c, whaVar.d);
            whaVar.a(true);
            int i = this.T0.e;
            if (i == 3 || i == 2) {
                jceVar.g(2);
            }
        } catch (Throwable th) {
            whaVar.a(true);
            throw th;
        }
    }

    public final void Z(wha whaVar) {
        Looper looper = whaVar.e;
        if (looper.getThread().isAlive()) {
            new jce(new Handler(looper, null)).e(new m45(this, whaVar));
        } else {
            xo1.V("TAG", "Trying to send message on a dead thread.");
            whaVar.a(false);
        }
    }

    @Override // defpackage.tp8
    public final void a(up8 up8Var) {
        this.g.c(8, up8Var).b();
    }

    public final void a0(vp8 vp8Var) {
        for (int i = 0; i < this.a.length; i++) {
            vp8Var.h[i] = true;
        }
    }

    public final void b(c55 c55Var, int i) throws Throwable {
        this.U0.e(1);
        nq8 nq8Var = this.F0;
        if (i == -1) {
            i = nq8Var.c.size();
        }
        u(nq8Var.a(i, c55Var.a, c55Var.b), false);
    }

    public final void b0(xi0 xi0Var, boolean z) {
        iud iudVar;
        g55 g55Var;
        au3 au3Var = this.d;
        if (!au3Var.i.equals(xi0Var)) {
            au3Var.i = xi0Var;
            if (au3Var.f.B && Build.VERSION.SDK_INT >= 32 && (iudVar = au3Var.h) != null && iudVar.b && (g55Var = au3Var.a) != null) {
                g55Var.g.c(10, null).b();
            }
        }
        if (!z) {
            xi0Var = null;
        }
        ij0 ij0Var = this.L0;
        if (!Objects.equals(ij0Var.d, xi0Var)) {
            ij0Var.d = xi0Var;
            int i = xi0Var == null ? 0 : 1;
            ij0Var.f = i;
            pa7.z("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        mga mgaVar = this.T0;
        boolean z2 = mgaVar.l;
        A0(ij0Var.c(mgaVar.e, z2), mgaVar.n, mgaVar.m, z2);
    }

    @Override // defpackage.guf
    public final void c(long j, long j2, rr5 rr5Var, MediaFormat mediaFormat) {
        if (this.Q0) {
            this.g.a(37).b();
        }
    }

    public final void c0(int i) {
        for (ob9 ob9Var : this.a) {
            hu0 hu0Var = (hu0) ob9Var.e;
            int i2 = hu0Var.b;
            if (i2 == 1 || i2 == 2) {
                hu0Var.d(10, Integer.valueOf(i));
                hu0 hu0Var2 = (hu0) ob9Var.f;
                if (hu0Var2 != null) {
                    hu0Var2.d(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d() {
        for (ob9 ob9Var : this.a) {
            iic iicVar = this.P0 ? this.O0 : null;
            ((hu0) ob9Var.e).d(18, iicVar);
            hu0 hu0Var = (hu0) ob9Var.f;
            if (hu0Var != null) {
                hu0Var.d(18, iicVar);
            }
        }
    }

    public final void d0(boolean z, nh2 nh2Var) {
        if (this.d1 != z) {
            this.d1 = z;
            if (!z) {
                for (ob9 ob9Var : this.a) {
                    ob9Var.n();
                }
            }
        }
        if (nh2Var != null) {
            nh2Var.c();
        }
    }

    public final boolean e() {
        if (!this.K0) {
            return false;
        }
        for (ob9 ob9Var : this.a) {
            if (ob9Var.g()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(a55 a55Var) {
        for (ob9 ob9Var : this.a) {
            hu0 hu0Var = (hu0) ob9Var.e;
            if (hu0Var.b == 4) {
                hu0Var.d(23, a55Var);
                hu0 hu0Var2 = (hu0) ob9Var.f;
                if (hu0Var2 != null) {
                    hu0Var2.d(23, a55Var);
                }
            }
        }
    }

    public final void f() {
        hu0 hu0Var;
        if (this.K0 && e()) {
            for (ob9 ob9Var : this.a) {
                int iC = ob9Var.c();
                wr3 wr3Var = this.X;
                if (ob9Var.g()) {
                    int i = ob9Var.b;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            hu0Var = (hu0) ob9Var.e;
                        } catch (RuntimeException e) {
                            xo1.y("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        hu0Var = (hu0) ob9Var.f;
                        hu0Var.getClass();
                    }
                    ob9Var.a(hu0Var, wr3Var);
                    try {
                        ob9Var.l(z);
                    } catch (RuntimeException e2) {
                        xo1.y("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    ob9Var.b = i2;
                }
                this.g1 -= iC - ob9Var.c();
            }
            this.p1 = -9223372036854775807L;
        }
    }

    public final void f0(c55 c55Var) throws Throwable {
        this.U0.e(1);
        int i = c55Var.c;
        ggd ggdVar = c55Var.b;
        ArrayList arrayList = c55Var.a;
        if (i != -1) {
            this.h1 = new f55(new eia(arrayList, ggdVar), c55Var.c, c55Var.d);
        }
        nq8 nq8Var = this.F0;
        ArrayList arrayList2 = nq8Var.c;
        nq8Var.f(0, arrayList2.size());
        u(nq8Var.a(arrayList2.size(), arrayList, ggdVar), false);
    }

    public final void g(int i) {
        ob9[] ob9VarArr = this.a;
        int iC = ob9VarArr[i].c();
        ob9 ob9Var = ob9VarArr[i];
        hu0 hu0Var = (hu0) ob9Var.e;
        wr3 wr3Var = this.X;
        ob9Var.a(hu0Var, wr3Var);
        hu0 hu0Var2 = (hu0) ob9Var.f;
        if (hu0Var2 != null) {
            boolean z = (hu0Var2.v == 0 || ob9Var.b == 3) ? false : true;
            ob9Var.a(hu0Var2, wr3Var);
            ob9Var.l(false);
            if (z) {
                hu0 hu0Var3 = (hu0) ob9Var.e;
                hu0Var2.getClass();
                hu0Var2.d(17, hu0Var3);
            }
        }
        ob9Var.b = 0;
        G(i, false);
        this.g1 -= iC;
    }

    public final void g0(boolean z) {
        this.W0 = z;
        P();
        if (this.X0 && z()) {
            V(true);
            t(false);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r25v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v36 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v34 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v35 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v45 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v38 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v39 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v44 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 2560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g55.h():void");
    }

    public final void h0(nga ngaVar) {
        this.g.f(16);
        wr3 wr3Var = this.X;
        wr3Var.a(ngaVar);
        nga ngaVarE = wr3Var.e();
        w(ngaVarE, ngaVarE.a, true, true);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        jce jceVar;
        int i2;
        vp8 vp8Var;
        zp8 zp8Var;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.U0.e(1);
                    A0(this.L0.c(this.T0.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    W((f55) message.obj);
                    break;
                case 4:
                    h0((nga) message.obj);
                    break;
                case 5:
                    this.N0 = (ysc) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((nh2) message.obj);
                    return true;
                case 8:
                    v((up8) message.obj);
                    break;
                case 9:
                    r((up8) message.obj);
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    this.d.i((q1f) message.obj);
                    N();
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    j0(message.arg1);
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    m0(message.arg1 != 0);
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    d0(message.arg1 != 0, (nh2) message.obj);
                    break;
                case 14:
                    Y((wha) message.obj);
                    break;
                case 15:
                    Z((wha) message.obj);
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    nga ngaVar = (nga) message.obj;
                    w(ngaVar, ngaVar.a, true, false);
                    break;
                case 17:
                    f0((c55) message.obj);
                    break;
                case 18:
                    b((c55) message.obj, message.arg1);
                    break;
                case 19:
                    kv2.z(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (ggd) message.obj);
                    break;
                case 21:
                    n0((ggd) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    g0(message.arg1 != 0);
                    break;
                case 24:
                    this.M0 = message.arg1 != 0;
                    break;
                case 25:
                    N();
                    V(true);
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    z0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    i0((i45) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (nh2) pair.second);
                    break;
                case 31:
                    b0((xi0) message.obj, message.arg1 != 0);
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    p0((guf) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.Q0 = false;
                    f55 f55Var = this.R0;
                    if (f55Var != null) {
                        W(f55Var);
                        this.R0 = null;
                    }
                    break;
                case 38:
                    l0((iic) message.obj);
                    break;
                case 39:
                    e0((a55) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (bc3 e) {
            s(e, e.reason);
        } catch (g45 e2) {
            e = e2;
            int i5 = e.type;
            xp8 xp8Var = this.E0;
            if (i5 == 1 && e.mediaPeriodId == null) {
                ob9 ob9Var = this.a[e.rendererIndex];
                vp8 vp8VarD = xp8Var.i;
                while (vp8VarD != null && !ob9Var.i(vp8VarD)) {
                    vp8VarD = vp8VarD.m;
                }
                if (vp8VarD == null) {
                    vp8VarD = xp8Var.d();
                }
                if (vp8VarD != null) {
                    e = e.a(vp8VarD.g.a);
                }
            }
            int i6 = e.type;
            jce jceVar2 = this.g;
            if (i6 == 1 && (zp8Var = e.mediaPeriodId) != null && A(e.rendererIndex, zp8Var)) {
                this.q1 = true;
                f();
                vp8 vp8VarK = xp8Var.k(e.rendererIndex);
                vp8 vp8Var2 = xp8Var.i;
                if (vp8Var2 != vp8VarK) {
                    while (vp8Var2 != null) {
                        vp8 vp8Var3 = vp8Var2.m;
                        if (vp8Var3 == vp8VarK) {
                            break;
                        }
                        vp8Var2 = vp8Var3;
                    }
                }
                xp8Var.s(vp8Var2);
                if (this.T0.e != 4) {
                    C();
                    jceVar2.g(2);
                }
            } else {
                g45 g45Var = this.m1;
                if (g45Var != null) {
                    g45Var.addSuppressed(e);
                    e = this.m1;
                }
                if (e.type != 1 || xp8Var.i == xp8Var.f()) {
                    jceVar = jceVar2;
                } else {
                    vp8 vp8VarD2 = xp8Var.i;
                    while (vp8VarD2 != null && !vp8VarD2.g.a.equals(e.mediaPeriodId)) {
                        vp8VarD2 = vp8VarD2.m;
                    }
                    if (vp8VarD2 == null) {
                        vp8VarD2 = xp8Var.d();
                    }
                    while (true) {
                        vp8Var = xp8Var.i;
                        if (vp8Var == vp8VarD2) {
                            break;
                        }
                        xp8Var.a();
                    }
                    pa7.E(vp8Var);
                    E(message.what);
                    wp8 wp8Var = vp8Var.g;
                    zp8 zp8Var2 = wp8Var.a;
                    long j = wp8Var.b;
                    jceVar = jceVar2;
                    this.T0 = x(zp8Var2, j, wp8Var.d, j, true, 0);
                }
                if (e.isRecoverable && (this.m1 == null || (i2 = e.errorCode) == 5004 || i2 == 5003)) {
                    xo1.W("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.m1 == null) {
                        this.m1 = e;
                    }
                    ice iceVarC = jceVar.c(25, e);
                    Handler handler = jceVar.a;
                    Message message2 = iceVarC.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    iceVarC.a();
                } else {
                    xo1.y("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.T0 = this.T0.f(e);
                }
            }
        } catch (RuntimeException e3) {
            g45 g45Var2 = new g45(2, e3, ((e3 instanceof IllegalStateException) || (e3 instanceof IllegalArgumentException)) ? ErrorCodes.PROTOCOL_EXCEPTION : 1000);
            xo1.y("ExoPlayerImplInternal", "Playback error", g45Var2);
            v0(true, false);
            this.T0 = this.T0.f(g45Var2);
        } catch (l0a e4) {
            int i7 = e4.dataType;
            if (i7 == 1) {
                i = e4.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i = e4.contentIsMalformed ? 3002 : 3004;
                }
                s(e4, i3);
            }
            i3 = i;
            s(e4, i3);
        } catch (yp4 e5) {
            s(e5, e5.errorCode);
        } catch (IOException e6) {
            s(e6, 2000);
        }
        E(message.what);
        return true;
    }

    public final void i(vp8 vp8Var, int i, boolean z, long j) {
        ob9 ob9Var = this.a[i];
        boolean zJ = ob9Var.j();
        hu0 hu0Var = (hu0) ob9Var.e;
        if (zJ) {
            return;
        }
        boolean z2 = vp8Var == this.E0.i;
        r1f r1fVar = vp8Var.o;
        frb frbVar = ((frb[]) r1fVar.b)[i];
        n55 n55Var = ((n55[]) r1fVar.c)[i];
        boolean z3 = s0() && this.T0.e == 3;
        boolean z4 = !z && z3;
        this.g1++;
        occ occVar = vp8Var.c[i];
        long j2 = vp8Var.p;
        zp8 zp8Var = vp8Var.g.a;
        hu0 hu0Var2 = (hu0) ob9Var.f;
        int length = n55Var != null ? n55Var.length() : 0;
        rr5[] rr5VarArr = new rr5[length];
        for (int i2 = 0; i2 < length; i2++) {
            n55Var.getClass();
            rr5VarArr[i2] = n55Var.d(i2);
        }
        int i3 = ob9Var.b;
        wr3 wr3Var = this.X;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            ob9Var.c = true;
            pa7.J(hu0Var.v == 0);
            hu0Var.d = frbVar;
            hu0Var.F0 = zp8Var;
            hu0Var.v = 1;
            hu0Var.q(z4, z2);
            hu0Var.A(rr5VarArr, occVar, j, j2, zp8Var);
            hu0Var.B(j, z4, true);
            wr3Var.d(hu0Var);
        } else {
            ob9Var.d = true;
            hu0Var2.getClass();
            pa7.J(hu0Var2.v == 0);
            hu0Var2.d = frbVar;
            hu0Var2.F0 = zp8Var;
            hu0Var2.v = 1;
            hu0Var2.q(z4, z2);
            hu0Var2.A(rr5VarArr, occVar, j, j2, zp8Var);
            hu0Var2.B(j, z4, true);
            wr3Var.d(hu0Var2);
        }
        b55 b55Var = new b55(this);
        hu0 hu0VarD = ob9Var.d(vp8Var);
        hu0VarD.getClass();
        hu0VarD.d(11, b55Var);
        if (z3 && z2) {
            ob9Var.p();
        }
    }

    public final void i0(i45 i45Var) {
        this.o1 = i45Var;
        gye gyeVar = this.T0.a;
        xp8 xp8Var = this.E0;
        xp8Var.getClass();
        i45Var.getClass();
        if (xp8Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < xp8Var.q.size(); i++) {
            ((vp8) xp8Var.q.get(i)).i();
        }
        xp8Var.q = arrayList;
        xp8Var.m = null;
        xp8Var.p();
    }

    @Override // defpackage.tp8
    public final void j(eyc eycVar) {
        this.g.c(9, (up8) eycVar).b();
    }

    public final void j0(int i) {
        this.b1 = i;
        gye gyeVar = this.T0.a;
        xp8 xp8Var = this.E0;
        xp8Var.g = i;
        int iW = xp8Var.w(gyeVar);
        if ((iW & 1) != 0) {
            V(true);
        } else if ((iW & 2) != 0) {
            f();
        }
        t(false);
    }

    public final void k(boolean[] zArr, long j) {
        ob9[] ob9VarArr;
        g55 g55Var;
        long j2;
        pa7.J(!z());
        vp8 vp8VarD = this.E0.d();
        r1f r1fVar = vp8VarD.o;
        int i = 0;
        while (true) {
            ob9VarArr = this.a;
            if (i >= ob9VarArr.length) {
                break;
            }
            if (!r1fVar.p(i)) {
                ob9VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < ob9VarArr.length) {
            if (!r1fVar.p(i2) || ob9VarArr[i2].i(vp8VarD)) {
                g55Var = this;
                j2 = j;
            } else {
                g55Var = this;
                j2 = j;
                g55Var.i(vp8VarD, i2, zArr[i2], j2);
            }
            i2++;
            this = g55Var;
            j = j2;
        }
    }

    public final void k0(boolean z) throws Throwable {
        if (!z) {
            f55 f55Var = this.R0;
            jce jceVar = this.g;
            if (f55Var != null && this.Q0 && !jceVar.a.hasMessages(37)) {
                this.S0++;
            }
            int i = this.S0;
            if (i > 0) {
                this.J0.e(new m45(this, i));
            }
            this.S0 = 0;
            this.Q0 = false;
            jceVar.f(37);
            f55 f55Var2 = this.R0;
            if (f55Var2 != null) {
                W(f55Var2);
                this.R0 = null;
                this.Q0 = false;
            }
        }
        this.P0 = z;
        d();
    }

    public final long l(gye gyeVar, Object obj, long j) {
        eye eyeVar = this.y;
        int i = gyeVar.g(obj, eyeVar).c;
        fye fyeVar = this.x;
        gyeVar.n(i, fyeVar);
        if (fyeVar.d == -9223372036854775807L || !fyeVar.a() || !fyeVar.g) {
            return -9223372036854775807L;
        }
        long j2 = fyeVar.e;
        return pqf.H((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - fyeVar.d) - (j + eyeVar.e);
    }

    public final void l0(iic iicVar) {
        this.O0 = iicVar;
        d();
    }

    public final Pair m(gye gyeVar) {
        long j = 0;
        if (gyeVar.p()) {
            return Pair.create(mga.u, 0L);
        }
        int iA = gyeVar.a(this.c1);
        Pair pairI = gyeVar.i(this.x, this.y, iA, -9223372036854775807L);
        zp8 zp8VarU = this.E0.u(this.T0, gyeVar, pairI.first, 0L, true, false);
        long jLongValue = ((Long) pairI.second).longValue();
        if (zp8VarU.c()) {
            Object obj = zp8VarU.a;
            eye eyeVar = this.y;
            gyeVar.g(obj, eyeVar);
            if (zp8VarU.c == eyeVar.e(zp8VarU.b)) {
                qf qfVar = qf.c;
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zp8VarU, Long.valueOf(j));
    }

    public final void m0(boolean z) {
        this.c1 = z;
        gye gyeVar = this.T0.a;
        xp8 xp8Var = this.E0;
        xp8Var.h = z;
        int iW = xp8Var.w(gyeVar);
        if ((iW & 1) != 0) {
            V(true);
        } else if ((iW & 2) != 0) {
            f();
        }
        t(false);
    }

    public final long n(vp8 vp8Var, int i) {
        if (vp8Var == null) {
            return 0L;
        }
        if (vp8Var.e) {
            ob9[] ob9VarArr = this.a;
            if (ob9VarArr[i].i(vp8Var)) {
                hu0 hu0VarD = ob9VarArr[i].d(vp8Var);
                Objects.requireNonNull(hu0VarD);
                return hu0VarD.X;
            }
        }
        return vp8Var.p;
    }

    public final void n0(ggd ggdVar) throws Throwable {
        this.U0.e(1);
        nq8 nq8Var = this.F0;
        int size = nq8Var.c.size();
        if (ggdVar.b.length != size) {
            ggdVar = new ggd(new Random(ggdVar.a.nextLong())).a(size);
        }
        nq8Var.k = ggdVar;
        u(nq8Var.b(), false);
    }

    public final long o(long j) {
        vp8 vp8Var = this.E0.l;
        if (vp8Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.i1 - vp8Var.p));
    }

    public final void o0(int i) {
        mga mgaVarI = this.T0;
        if (mgaVarI.e != i) {
            if (i != 2) {
                this.n1 = -9223372036854775807L;
            }
            if (i != 3 && mgaVarI.p) {
                mgaVarI = mgaVarI.i(false);
                this.T0 = mgaVarI;
            }
            this.T0 = mgaVarI.h(i);
        }
    }

    public final void p(int i) {
        mga mgaVar = this.T0;
        A0(i, mgaVar.n, mgaVar.m, mgaVar.l);
    }

    public final void p0(guf gufVar) {
        for (ob9 ob9Var : this.a) {
            hu0 hu0Var = (hu0) ob9Var.e;
            int i = hu0Var.b;
            if (i == 2 || i == 4) {
                hu0Var.d(7, gufVar);
                hu0 hu0Var2 = (hu0) ob9Var.f;
                if (hu0Var2 != null) {
                    hu0Var2.d(7, gufVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.r1);
    }

    public final void q0(Object obj, nh2 nh2Var) {
        for (ob9 ob9Var : this.a) {
            hu0 hu0Var = (hu0) ob9Var.e;
            if (hu0Var.b == 2) {
                int i = ob9Var.b;
                if (i == 4 || i == 1) {
                    hu0 hu0Var2 = (hu0) ob9Var.f;
                    hu0Var2.getClass();
                    hu0Var2.d(1, obj);
                } else {
                    hu0Var.d(1, obj);
                }
            }
        }
        int i2 = this.T0.e;
        if (i2 == 3 || i2 == 2) {
            this.g.g(2);
        }
        if (nh2Var != null) {
            nh2Var.c();
        }
    }

    public final void r(up8 up8Var) {
        xp8 xp8Var = this.E0;
        vp8 vp8Var = xp8Var.l;
        if (vp8Var != null && vp8Var.a == up8Var) {
            xp8Var.r(this.i1);
            C();
            return;
        }
        vp8 vp8Var2 = xp8Var.m;
        if (vp8Var2 == null || vp8Var2.a != up8Var) {
            return;
        }
        D();
    }

    public final void r0(float f) {
        this.r1 = f;
        float f2 = f * this.L0.g;
        for (ob9 ob9Var : this.a) {
            hu0 hu0Var = (hu0) ob9Var.e;
            if (hu0Var.b == 1) {
                hu0Var.d(2, Float.valueOf(f2));
                hu0 hu0Var2 = (hu0) ob9Var.f;
                if (hu0Var2 != null) {
                    hu0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        g45 g45Var = new g45(0, iOException, i);
        vp8 vp8Var = this.E0.i;
        if (vp8Var != null) {
            g45Var = g45Var.a(vp8Var.g.a);
        }
        xo1.y("ExoPlayerImplInternal", "Playback error", g45Var);
        v0(false, false);
        this.T0 = this.T0.f(g45Var);
    }

    public final boolean s0() {
        mga mgaVar = this.T0;
        return mgaVar.l && mgaVar.n == 0;
    }

    public final void t(boolean z) {
        vp8 vp8Var = this.E0.l;
        zp8 zp8Var = vp8Var == null ? this.T0.b : vp8Var.g.a;
        boolean zEquals = this.T0.k.equals(zp8Var);
        if (!zEquals) {
            this.T0 = this.T0.c(zp8Var);
        }
        mga mgaVar = this.T0;
        mgaVar.q = vp8Var == null ? mgaVar.s : vp8Var.d();
        mga mgaVar2 = this.T0;
        mgaVar2.r = o(mgaVar2.q);
        if ((!zEquals || z) && vp8Var != null && vp8Var.e) {
            y0(vp8Var.g.a, vp8Var.o);
        }
    }

    public final boolean t0(gye gyeVar, zp8 zp8Var) {
        if (zp8Var.c() || gyeVar.p()) {
            return false;
        }
        int i = gyeVar.g(zp8Var.a, this.y).c;
        fye fyeVar = this.x;
        gyeVar.n(i, fyeVar);
        return fyeVar.a() && fyeVar.g && fyeVar.d != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:160:0x0315 A[PHI: r7
  0x0315: PHI (r7v13 ??) = (r7v39 ??), (r7v40 ??), (r7v41 ??) binds: [B:152:0x02ef, B:154:0x02f3, B:158:0x0310] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:239:0x042e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0430  */
    /* JADX WARN: Code duplicated, block: B:245:0x0449  */
    /* JADX WARN: Code duplicated, block: B:247:0x044f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0452  */
    /* JADX WARN: Code duplicated, block: B:252:0x0479  */
    /* JADX WARN: Code duplicated, block: B:257:0x0490  */
    /* JADX WARN: Code duplicated, block: B:258:0x0492  */
    /* JADX WARN: Code duplicated, block: B:261:0x049f  */
    /* JADX WARN: Code duplicated, block: B:263:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:265:0x04af  */
    /* JADX WARN: Code duplicated, block: B:266:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:270:0x04db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [gye] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r2v17, types: [gye] */
    /* JADX WARN: Type inference failed for: r2v22, types: [mga] */
    /* JADX WARN: Type inference failed for: r44v0, types: [g55] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(gye gyeVar, boolean z) throws Throwable {
        zp8 zp8Var;
        long j;
        gye gyeVar2;
        fye fyeVar;
        int iA;
        long jI;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA2;
        boolean z5;
        long j2;
        gye gyeVar3;
        boolean z6;
        long jMin;
        long j3;
        int i2;
        ?? r7;
        e55 e55Var;
        int i3;
        int i4;
        long jLongValue;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        ?? r13;
        zp8 zp8Var2;
        ?? r14;
        long j4;
        zp8 zp8Var3;
        boolean z11;
        long j5;
        ob9[] ob9VarArr;
        xp8 xp8Var;
        long j6;
        zp8 zp8Var4;
        boolean z12;
        long j7;
        long j8;
        mga mgaVar = this.T0;
        f55 f55Var = this.h1;
        xp8 xp8Var2 = this.E0;
        int i5 = this.b1;
        boolean z13 = this.c1;
        fye fyeVar2 = this.x;
        eye eyeVar = this.y;
        boolean z14 = this.M0;
        if (gyeVar.p()) {
            zp8 zp8Var5 = mga.u;
            boolean z15 = (zp8Var5.equals(mgaVar.b) && mgaVar.s == 0) ? false : true;
            gyeVar3 = gyeVar;
            e55Var = new e55(zp8Var5, 0L, -9223372036854775807L, false, true, false, z15, z15 && z && !mgaVar.a.p() && !mgaVar.a.g(mgaVar.b.a, eyeVar).f, 4);
        } else {
            zp8 zp8Var6 = mgaVar.b;
            Object obj = zp8Var6.a;
            gye gyeVar4 = mgaVar.a;
            boolean z16 = gyeVar4.p() || gyeVar4.g(zp8Var6.a, eyeVar).f;
            long jLongValue2 = (mgaVar.b.c() || z16) ? mgaVar.c : mgaVar.s;
            if (f55Var != null) {
                zp8Var = zp8Var6;
                j = 1;
                gyeVar2 = gyeVar;
                Pair pairS = S(gyeVar2, f55Var, true, i5, z13, fyeVar2, eyeVar);
                if (pairS == null) {
                    iA = gyeVar2.a(z13);
                    jLongValue = jLongValue2;
                    z10 = true;
                    z9 = false;
                    z8 = false;
                } else {
                    long j9 = f55Var.c;
                    Object obj2 = pairS.first;
                    if (j9 == -9223372036854775807L) {
                        iA = gyeVar2.g(obj2, eyeVar).c;
                        jLongValue = jLongValue2;
                        z7 = false;
                    } else {
                        jLongValue = ((Long) pairS.second).longValue();
                        obj = obj2;
                        iA = -1;
                        z7 = true;
                    }
                    z8 = mgaVar.e == 4;
                    z9 = z7;
                    z10 = false;
                }
                z3 = z10;
                z4 = z9;
                z2 = z8;
                i = -1;
                long j10 = jLongValue;
                fyeVar = fyeVar2;
                jLongValue2 = j10;
            } else {
                zp8Var = zp8Var6;
                j = 1;
                gyeVar2 = gyeVar;
                if (mgaVar.a.p()) {
                    iA = gyeVar2.a(z13);
                    fyeVar = fyeVar2;
                } else if (gyeVar2.b(obj) == -1) {
                    int iT = T(fyeVar2, eyeVar, i5, z13, obj, mgaVar.a, gyeVar2);
                    fyeVar = fyeVar2;
                    if (iT == -1) {
                        gyeVar2 = gyeVar2;
                        eyeVar = eyeVar;
                        iA2 = gyeVar2.a(z13);
                        z5 = true;
                    } else {
                        gyeVar2 = gyeVar2;
                        eyeVar = eyeVar;
                        iA2 = iT;
                        z5 = false;
                    }
                    z3 = z5;
                    obj = obj;
                    iA = iA2;
                    jLongValue2 = jLongValue2;
                    i = -1;
                    z2 = false;
                    z4 = false;
                } else {
                    fyeVar = fyeVar2;
                    if (jLongValue2 == -9223372036854775807L) {
                        int i6 = gyeVar2.g(obj, eyeVar).c;
                        obj = obj;
                        iA = i6;
                    } else if (z16) {
                        mgaVar.a.g(zp8Var.a, eyeVar);
                        if (mgaVar.a.m(eyeVar.c, fyeVar, 0L).l == mgaVar.a.b(zp8Var.a)) {
                            Pair pairI = gyeVar2.i(fyeVar, eyeVar, gyeVar2.g(obj, eyeVar).c, jLongValue2 + eyeVar.e);
                            obj = pairI.first;
                            jI = ((Long) pairI.second).longValue();
                        } else if (gyeVar2.g(obj, eyeVar).d != -9223372036854775807L) {
                            jI = pqf.i(jLongValue2, 0L, eyeVar.d - 1);
                            obj = obj;
                        } else {
                            obj = obj;
                            jI = jLongValue2;
                        }
                        jLongValue2 = jI;
                        iA = -1;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        obj = obj;
                        iA = -1;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                i = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iA != i) {
                Pair pairI2 = gyeVar2.i(fyeVar, eyeVar, iA, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue2 = ((Long) pairI2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                j2 = jLongValue2;
            }
            Object obj3 = obj;
            zp8 zp8VarU = xp8Var2.u(mgaVar, gyeVar, obj3, jLongValue2, z14, z16);
            gyeVar3 = gyeVar;
            int i7 = zp8VarU.e;
            boolean z17 = i7 == i || ((i4 = zp8Var.e) != i && i7 >= i4);
            boolean zEquals = zp8Var.a.equals(obj3);
            boolean z18 = zEquals && !zp8Var.c() && !zp8VarU.c() && z17;
            eye eyeVarG = gyeVar3.g(obj3, eyeVar);
            if (z16 || jLongValue2 != j2) {
                z6 = z18;
            } else {
                Object obj4 = zp8Var.a;
                int i8 = zp8Var.b;
                z6 = z18;
                if (obj4.equals(zp8VarU.a)) {
                    if (zp8Var.c()) {
                        eyeVarG.g(i8);
                    }
                    if (zp8VarU.c()) {
                        eyeVarG.g(zp8VarU.b);
                    }
                }
            }
            if (z6) {
                zp8VarU = zp8Var;
            }
            if (zp8VarU.c()) {
                if (zp8VarU.equals(zp8Var)) {
                    j3 = j2;
                    jMin = mgaVar.s;
                } else {
                    gyeVar3.g(zp8VarU.a, eyeVar);
                    if (zp8VarU.c == eyeVar.e(zp8VarU.b)) {
                        qf qfVar = qf.c;
                    }
                    j3 = j2;
                    jMin = 0;
                }
            } else if (zEquals && zp8Var.c()) {
                gyeVar3.g(obj3, eyeVar).getClass();
                of ofVarA = qf.c.a(zp8Var.b);
                ofVarA.getClass();
                long j11 = mgaVar.c;
                if (j11 == -9223372036854775807L || 0 > j11) {
                    int i9 = ofVarA.a;
                    int i10 = zp8Var.c;
                    if (i9 <= i10 || ofVarA.d[i10] != 2) {
                        jMin = jLongValue2;
                        j3 = j2;
                    } else {
                        long j12 = gyeVar3.g(obj3, eyeVar).d;
                        jMin = j12 != -9223372036854775807L ? Math.min(j12 - j, jLongValue2) : jLongValue2;
                        j3 = jMin;
                    }
                } else {
                    jMin = jLongValue2;
                    j3 = j2;
                }
            } else {
                jMin = jLongValue2;
                j3 = j2;
            }
            boolean z19 = (zp8VarU.equals(mgaVar.b) && jMin == mgaVar.s) ? false : true;
            int i11 = gyeVar3.b(mgaVar.b.a) == -1 ? 4 : 3;
            Object obj5 = zp8VarU.a;
            Object obj6 = mgaVar.b.a;
            boolean zEquals2 = obj5.equals(obj6);
            ?? r8 = obj6;
            if (!zEquals2 || zp8VarU.b == -1) {
                r8 = obj6;
                r8 = i3;
                r8 = obj6;
                i2 = i11;
                r7 = r8;
            } else {
                gyeVar3.g(zp8VarU.a, eyeVar).getClass();
                of ofVarA2 = qf.c.a(zp8VarU.b);
                i3 = zp8VarU.c;
                int[] iArr = ofVarA2.d;
                if (i3 >= iArr.length || iArr[i3] != 2) {
                    r8 = obj6;
                    r8 = i3;
                    r8 = obj6;
                    i2 = 0;
                    r7 = i3;
                } else {
                    r8 = obj6;
                    r8 = i3;
                    r8 = obj6;
                    i2 = i11;
                    r7 = r8;
                }
            }
            e55Var = new e55(zp8VarU, jMin, j3, z2, z3, z4, z19, z19 && z && !mgaVar.a.p() && !mgaVar.a.g(mgaVar.b.a, eyeVar).f, i2);
        }
        zp8 zp8Var7 = e55Var.a;
        long jX = e55Var.b;
        try {
            if (e55Var.e) {
                if (this.T0.e != 1) {
                    o0(4);
                }
                O(false, false, false, true);
            }
            ob9[] ob9VarArr2 = this.a;
            int length = ob9VarArr2.length;
            int i12 = 0;
            ?? r9 = r7;
            while (i12 < length) {
                ob9 ob9Var = ob9VarArr2[i12];
                hu0 hu0Var = (hu0) ob9Var.e;
                boolean zEquals3 = hu0Var.E0.equals(gyeVar3);
                if (!zEquals3) {
                    hu0Var.E0 = gyeVar3;
                    hu0Var.G();
                    hu0Var.x();
                }
                hu0 hu0Var2 = (hu0) ob9Var.f;
                if (hu0Var2 != null && !hu0Var2.E0.equals(gyeVar3)) {
                    hu0Var2.E0 = gyeVar3;
                    hu0Var2.G();
                    hu0Var2.x();
                }
                i12++;
                r9 = zEquals3;
            }
            try {
                if (e55Var.g) {
                    gye gyeVar5 = gyeVar3;
                    if (!gyeVar5.p()) {
                        try {
                            for (vp8 vp8Var = this.E0.i; vp8Var != null; vp8Var = vp8Var.m) {
                                if (vp8Var.g.a.equals(zp8Var7)) {
                                    vp8Var.g = this.E0.l(gyeVar5, vp8Var.g);
                                }
                            }
                            zp8Var2 = zp8Var7;
                            try {
                                jX = X(zp8Var2, jX, z(), e55Var.d);
                            } catch (Throwable th) {
                                th = th;
                                jX = jX;
                                r14 = gyeVar5;
                                mga mgaVar2 = this.T0;
                                gye gyeVar6 = mgaVar2.a;
                                zp8 zp8Var8 = mgaVar2.b;
                                if (e55Var.f) {
                                    j4 = jX;
                                } else {
                                    j4 = -9223372036854775807L;
                                }
                                zp8Var3 = zp8Var2;
                                C0(r14, zp8Var3, gyeVar6, zp8Var8, j4, false);
                                if (e55Var.g) {
                                    long j13 = e55Var.c;
                                    z11 = e55Var.h;
                                    if (z11) {
                                        j5 = jX;
                                    } else {
                                        j5 = this.T0.d;
                                    }
                                    this.T0 = x(zp8Var3, jX, j13, j5, z11, e55Var.i);
                                } else {
                                    long j14 = e55Var.c;
                                    z11 = e55Var.h;
                                    if (z11) {
                                        j5 = jX;
                                    } else {
                                        j5 = this.T0.d;
                                    }
                                    this.T0 = x(zp8Var3, jX, j14, j5, z11, e55Var.i);
                                }
                                P();
                                R(r14, this.T0.a);
                                this.T0 = this.T0.j(r14);
                                if (!r14.p()) {
                                    this.h1 = null;
                                }
                                t(false);
                                this.g.g(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            zp8Var2 = zp8Var7;
                        }
                    }
                    mga mgaVar3 = this.T0;
                    gye gyeVar7 = mgaVar3.a;
                    zp8 zp8Var9 = mgaVar3.b;
                    if (e55Var.f) {
                        j6 = jX;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    zp8Var4 = zp8Var2;
                    C0(gyeVar, zp8Var4, gyeVar7, zp8Var9, j6, false);
                    if (e55Var.g || e55Var.c != this.T0.c) {
                        long j15 = e55Var.c;
                        z12 = e55Var.h;
                        if (z12) {
                            j8 = jX;
                            j7 = j8;
                        } else {
                            j7 = this.T0.d;
                            j8 = jX;
                        }
                        this.T0 = x(zp8Var4, j8, j15, j7, z12, e55Var.i);
                    }
                    P();
                    R(gyeVar, this.T0.a);
                    this.T0 = this.T0.j(gyeVar);
                    if (!gyeVar.p()) {
                        this.h1 = null;
                    }
                    t(false);
                    this.g.g(2);
                }
                try {
                    long[] jArr = new long[this.a.length];
                    int i13 = 0;
                    while (true) {
                        ob9VarArr = this.a;
                        if (i13 >= ob9VarArr.length) {
                            break;
                        }
                        jArr[i13] = n(this.E0.j[i13], i13);
                        i13++;
                    }
                    long[] jArr2 = new long[ob9VarArr.length];
                    int i14 = 0;
                    while (true) {
                        int length2 = this.a.length;
                        xp8Var = this.E0;
                        if (i14 >= length2) {
                            break;
                        }
                        jArr2[i14] = n(xp8Var.k[i14], i14);
                        i14++;
                        zp8Var2 = zp8Var7;
                        r14 = r13;
                        mga mgaVar4 = this.T0;
                        gye gyeVar8 = mgaVar4.a;
                        zp8 zp8Var10 = mgaVar4.b;
                        if (e55Var.f) {
                            j4 = jX;
                        } else {
                            j4 = -9223372036854775807L;
                        }
                        zp8Var3 = zp8Var2;
                        C0(r14, zp8Var3, gyeVar8, zp8Var10, j4, false);
                        if (e55Var.g || e55Var.c != this.T0.c) {
                            long j16 = e55Var.c;
                            z11 = e55Var.h;
                            if (z11) {
                                j5 = jX;
                            } else {
                                j5 = this.T0.d;
                            }
                            this.T0 = x(zp8Var3, jX, j16, j5, z11, e55Var.i);
                        }
                        P();
                        R(r14, this.T0.a);
                        this.T0 = this.T0.j(r14);
                        if (!r14.p()) {
                            this.h1 = null;
                        }
                        t(false);
                        this.g.g(2);
                        throw th;
                    }
                    int iX = xp8Var.x(gyeVar3, this.i1, jArr, jArr2);
                    if ((iX & 1) != 0) {
                        V(false);
                    } else if ((iX & 2) != 0) {
                        f();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r9 = gyeVar3;
                    r13 = r9;
                    zp8Var2 = zp8Var7;
                    r14 = r13;
                    mga mgaVar5 = this.T0;
                    gye gyeVar9 = mgaVar5.a;
                    zp8 zp8Var11 = mgaVar5.b;
                    if (e55Var.f) {
                        j4 = jX;
                    } else {
                        j4 = -9223372036854775807L;
                    }
                    zp8Var3 = zp8Var2;
                    C0(r14, zp8Var3, gyeVar9, zp8Var11, j4, false);
                    if (e55Var.g) {
                        long j17 = e55Var.c;
                        z11 = e55Var.h;
                        if (z11) {
                            j5 = jX;
                        } else {
                            j5 = this.T0.d;
                        }
                        this.T0 = x(zp8Var3, jX, j17, j5, z11, e55Var.i);
                    } else {
                        long j18 = e55Var.c;
                        z11 = e55Var.h;
                        if (z11) {
                            j5 = jX;
                        } else {
                            j5 = this.T0.d;
                        }
                        this.T0 = x(zp8Var3, jX, j18, j5, z11, e55Var.i);
                    }
                    P();
                    R(r14, this.T0.a);
                    this.T0 = this.T0.j(r14);
                    if (!r14.p()) {
                        this.h1 = null;
                    }
                    t(false);
                    this.g.g(2);
                    throw th;
                }
                zp8Var2 = zp8Var7;
                mga mgaVar6 = this.T0;
                gye gyeVar10 = mgaVar6.a;
                zp8 zp8Var12 = mgaVar6.b;
                if (e55Var.f) {
                    j6 = jX;
                } else {
                    j6 = -9223372036854775807L;
                }
                zp8Var4 = zp8Var2;
                C0(gyeVar, zp8Var4, gyeVar10, zp8Var12, j6, false);
                if (e55Var.g) {
                    long j19 = e55Var.c;
                    z12 = e55Var.h;
                    if (z12) {
                        j8 = jX;
                        j7 = j8;
                    } else {
                        j7 = this.T0.d;
                        j8 = jX;
                    }
                    this.T0 = x(zp8Var4, j8, j19, j7, z12, e55Var.i);
                } else {
                    long j110 = e55Var.c;
                    z12 = e55Var.h;
                    if (z12) {
                        j8 = jX;
                        j7 = j8;
                    } else {
                        j7 = this.T0.d;
                        j8 = jX;
                    }
                    this.T0 = x(zp8Var4, j8, j110, j7, z12, e55Var.i);
                }
                P();
                R(gyeVar, this.T0.a);
                this.T0 = this.T0.j(gyeVar);
                if (!gyeVar.p()) {
                    this.h1 = null;
                }
                t(false);
                this.g.g(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            r13 = gyeVar3;
        }
    }

    public final void u0() {
        vp8 vp8Var = this.E0.i;
        if (vp8Var == null) {
            return;
        }
        r1f r1fVar = vp8Var.o;
        int i = 0;
        while (true) {
            ob9[] ob9VarArr = this.a;
            if (i >= ob9VarArr.length) {
                return;
            }
            if (r1fVar.p(i)) {
                ob9VarArr[i].p();
            }
            i++;
        }
    }

    public final void v(up8 up8Var) {
        vp8 vp8Var;
        g55 g55Var;
        xp8 xp8Var = this.E0;
        vp8 vp8Var2 = xp8Var.l;
        wr3 wr3Var = this.X;
        if (vp8Var2 != null && vp8Var2.a == up8Var) {
            vp8Var2.getClass();
            if (!vp8Var2.e) {
                float f = wr3Var.e().a;
                mga mgaVar = this.T0;
                vp8Var2.f(f, mgaVar.a, mgaVar.l);
            }
            y0(vp8Var2.g.a, vp8Var2.o);
            if (vp8Var2 == xp8Var.i) {
                Q(vp8Var2.g.b, true);
                pa7.J(!z());
                k(new boolean[this.a.length], xp8Var.d().e());
                a0(vp8Var2);
                mga mgaVar2 = this.T0;
                zp8 zp8Var = mgaVar2.b;
                long j = vp8Var2.g.b;
                g55Var = this;
                g55Var.T0 = x(zp8Var, j, mgaVar2.c, j, false, 5);
            } else {
                g55Var = this;
            }
            g55Var.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= xp8Var.q.size()) {
                vp8Var = null;
                break;
            }
            vp8Var = (vp8) xp8Var.q.get(i);
            if (vp8Var.a == up8Var) {
                break;
            } else {
                i++;
            }
        }
        if (vp8Var != null) {
            pa7.J(!vp8Var.e);
            float f2 = wr3Var.e().a;
            mga mgaVar3 = this.T0;
            vp8Var.f(f2, mgaVar3.a, mgaVar3.l);
            vp8 vp8Var3 = xp8Var.m;
            if (vp8Var3 == null || vp8Var3.a != up8Var) {
                return;
            }
            D();
        }
    }

    public final void v0(boolean z, boolean z2) {
        O(z || !this.d1, false, true, false);
        this.U0.e(z2 ? 1 : 0);
        ur3 ur3Var = this.f;
        ConcurrentHashMap concurrentHashMap = ur3Var.n;
        uha uhaVar = this.H0;
        tr3 tr3Var = (tr3) concurrentHashMap.get(uhaVar);
        if (tr3Var != null) {
            int i = tr3Var.a - 1;
            tr3Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(uhaVar);
                ur3Var.c();
            }
        }
        this.L0.c(1, this.T0.l);
        o0(1);
    }

    public final void w(nga ngaVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.U0.e(1);
            }
            this.T0 = this.T0.g(ngaVar);
        }
        float f2 = ngaVar.a;
        vp8 vp8Var = this.E0.i;
        while (true) {
            i = 0;
            if (vp8Var == null) {
                break;
            }
            n55[] n55VarArr = (n55[]) vp8Var.o.c;
            int length = n55VarArr.length;
            while (i < length) {
                n55 n55Var = n55VarArr[i];
                if (n55Var != null) {
                    n55Var.i(f2);
                }
                i++;
            }
            vp8Var = vp8Var.m;
        }
        ob9[] ob9VarArr = this.a;
        int length2 = ob9VarArr.length;
        while (i < length2) {
            ob9 ob9Var = ob9VarArr[i];
            float f3 = ngaVar.a;
            ((hu0) ob9Var.e).C(f, f3);
            hu0 hu0Var = (hu0) ob9Var.f;
            if (hu0Var != null) {
                hu0Var.C(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        wr3 wr3Var = this.X;
        wr3Var.f = false;
        nyd nydVar = wr3Var.a;
        if (nydVar.b) {
            nydVar.d(nydVar.b());
            nydVar.b = false;
        }
        for (ob9 ob9Var : this.a) {
            hu0 hu0Var = (hu0) ob9Var.f;
            hu0 hu0Var2 = (hu0) ob9Var.e;
            if (ob9.k(hu0Var2)) {
                ob9.b(hu0Var2);
            }
            if (hu0Var != null && hu0Var.v != 0) {
                ob9.b(hu0Var);
            }
        }
    }

    public final mga x(zp8 zp8Var, long j, long j2, long j3, boolean z, int i) {
        yob yobVarG;
        vp8 vp8Var;
        boolean z2;
        this.l1 = (!this.l1 && j == this.T0.s && zp8Var.equals(this.T0.b)) ? false : true;
        P();
        mga mgaVar = this.T0;
        i1f i1fVar = mgaVar.h;
        r1f r1fVar = mgaVar.i;
        List list = mgaVar.j;
        if (this.F0.l) {
            vp8 vp8Var2 = this.E0.i;
            i1fVar = vp8Var2 == null ? i1f.d : vp8Var2.n;
            r1fVar = vp8Var2 == null ? this.e : vp8Var2.o;
            n55[] n55VarArr = (n55[]) r1fVar.c;
            dy6 dy6Var = new dy6(4);
            boolean z3 = false;
            for (n55 n55Var : n55VarArr) {
                if (n55Var != null) {
                    su8 su8Var = n55Var.d(0).m;
                    if (su8Var == null) {
                        dy6Var.b(new su8(new qu8[0]));
                    } else {
                        dy6Var.b(su8Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                yobVarG = dy6Var.g();
            } else {
                ey6 ey6Var = jy6.b;
                yobVarG = yob.e;
            }
            list = yobVarG;
            if (vp8Var2 != null) {
                wp8 wp8Var = vp8Var2.g;
                if (wp8Var.d != j2) {
                    vp8Var2.g = wp8Var.a(j2);
                }
            }
            ob9[] ob9VarArr = this.a;
            if (!z() && (vp8Var = this.E0.i) != null) {
                r1f r1fVar2 = vp8Var.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= ob9VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (r1fVar2.p(i2)) {
                        if (((hu0) ob9VarArr[i2].e).b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((frb[]) r1fVar2.b)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f1) {
                    this.f1 = z5;
                    if (!z5 && this.T0.p) {
                        this.g.g(2);
                    }
                }
            }
        } else if (!zp8Var.equals(mgaVar.b)) {
            i1fVar = i1f.d;
            r1fVar = this.e;
            ey6 ey6Var2 = jy6.b;
            list = yob.e;
        }
        r1f r1fVar3 = r1fVar;
        List list2 = list;
        i1f i1fVar2 = i1fVar;
        if (z) {
            d55 d55Var = this.U0;
            if (!d55Var.e || d55Var.c == 5) {
                d55Var.d = true;
                d55Var.e = true;
                d55Var.c = i;
            } else {
                pa7.A(i == 5);
            }
        }
        mga mgaVar2 = this.T0;
        return mgaVar2.d(zp8Var, j, j2, j3, o(mgaVar2.q), i1fVar2, r1fVar3, list2);
    }

    public final void x0() {
        vp8 vp8Var = this.E0.l;
        boolean z = this.a1 || (vp8Var != null && vp8Var.a.i());
        mga mgaVar = this.T0;
        if (z != mgaVar.g) {
            this.T0 = mgaVar.b(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0073  */
    public final void y0(zp8 zp8Var, r1f r1fVar) {
        boolean z;
        vp8 vp8Var = this.E0.l;
        vp8Var.getClass();
        o(vp8Var.d());
        t0(this.T0.a, vp8Var.g.a);
        gye gyeVar = this.T0.a;
        float f = this.X.e().a;
        boolean z2 = this.T0.l;
        n55[] n55VarArr = (n55[]) r1fVar.c;
        ur3 ur3Var = this.f;
        ur3Var.getClass();
        ny6 ny6Var = ur3Var.m;
        uha uhaVar = this.H0;
        Integer num = (Integer) ny6Var.get(uhaVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        tr3 tr3Var = (tr3) ur3Var.n.get(uhaVar);
        tr3Var.getClass();
        if (iIntValue == -1) {
            lp8 lp8Var = gyeVar.m(gyeVar.g(zp8Var.a, ur3Var.b).c, ur3Var.a, 0L).b.b;
            if (lp8Var == null) {
                z = false;
            } else {
                String scheme = lp8Var.a.getScheme();
                if (TextUtils.isEmpty(scheme) || ur3.p.contains(scheme)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int length = n55VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    n55 n55Var = n55VarArr[i];
                    if (n55Var != null) {
                        switch (n55Var.b().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = z ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                cva.s();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = pqf.h(i2, 13107200, 210239488);
                }
            }
        }
        tr3Var.c = iIntValue;
        ur3Var.c();
    }

    public final boolean z() {
        for (int i = 0; i < this.a.length; i++) {
            xp8 xp8Var = this.E0;
            if (xp8Var.i != xp8Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(int i, int i2, List list) throws Throwable {
        this.U0.e(1);
        nq8 nq8Var = this.F0;
        nq8Var.getClass();
        ArrayList arrayList = nq8Var.c;
        pa7.A(i >= 0 && i <= i2 && i2 <= arrayList.size());
        pa7.A(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((mq8) arrayList.get(i3)).a.r((op8) list.get(i3 - i));
        }
        u(nq8Var.b(), false);
    }
}
