package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.adjust.sdk.network.ErrorCodes;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y45 implements ExoPlayer, zga {
    public final f17 A;
    public final long B;
    public final a80 C;
    public final wo0 D;
    public final x45 E;
    public final fz3 F;
    public final fz3 G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public ry6 N;
    public final iic O;
    public ggd P;
    public vga Q;
    public rp8 R;
    public Object S;
    public Surface T;
    public SurfaceHolder U;
    public uud V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public xkd Z;
    public final fye a;
    public final xi0 a0;
    public final r1f b;
    public float b0;
    public final vga c;
    public boolean c0;
    public final nh2 d;
    public u03 d0;
    public final Context e;
    public final boolean e0;
    public final y45 f;
    public boolean f0;
    public final hu0[] g;
    public final int g0;
    public final hu0[] h;
    public boolean h0;
    public final au3 i;
    public uuf i0;
    public final jce j;
    public final long j0;
    public final l45 k;
    public final long k0;
    public final g55 l;
    public final long l0;
    public final f98 m;
    public rp8 m0;
    public final CopyOnWriteArraySet n;
    public mga n0;
    public final eye o;
    public int o0;
    public final ArrayList p;
    public long p0;
    public final boolean q;
    public final yp8 r;
    public final ro3 s;
    public final Looper t;
    public final lp3 u;
    public final ece v;
    public final t45 w;
    public final u45 x;
    public final zi0 y;
    public final xs6 z;

    static {
        pp8.a("media3.exoplayer");
    }

    public y45(h45 h45Var) {
        x45 x45Var;
        Context context = h45Var.a;
        this.a = new fye();
        this.d = new nh2(0);
        try {
            xo1.D("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + pqf.a + "]");
            ece eceVar = ece.a;
            this.e = context.getApplicationContext();
            this.s = new ro3(eceVar);
            this.g0 = -1000;
            this.a0 = xi0.b;
            this.Y = 1;
            this.c0 = false;
            this.B = 2000L;
            t45 t45Var = new t45(this);
            this.w = t45Var;
            this.x = new u45();
            hu0[] hu0VarArrX = ((k47) h45Var.b.get()).x(new Handler(h45Var.f), t45Var, t45Var, t45Var, t45Var);
            this.g = hu0VarArrX;
            pa7.J(hu0VarArrX.length > 0);
            this.h = new hu0[hu0VarArrX.length];
            int i = 0;
            while (true) {
                hu0[] hu0VarArr = this.h;
                if (i >= hu0VarArr.length) {
                    break;
                }
                int i2 = this.g[i].b;
                hu0VarArr[i] = null;
                i++;
            }
            au3 au3Var = (au3) h45Var.d.get();
            this.i = au3Var;
            this.r = (yp8) h45Var.c.get();
            lp3 lp3Var = (lp3) h45Var.e.get();
            this.u = lp3Var;
            this.q = true;
            ysc yscVar = h45Var.g;
            this.j0 = 5000L;
            this.k0 = 15000L;
            this.l0 = 3000L;
            this.O = h45Var.h;
            Looper looper = h45Var.f;
            this.t = looper;
            this.v = eceVar;
            this.f = this;
            this.m = new f98(new CopyOnWriteArraySet(), looper, looper.getThread(), eceVar, new pd4(13, this), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.n = copyOnWriteArraySet;
            this.p = new ArrayList();
            this.P = new ggd();
            hu0[] hu0VarArr2 = this.g;
            r1f r1fVar = new r1f(new frb[hu0VarArr2.length], new n55[hu0VarArr2.length], f2f.b, (Object) null);
            this.b = r1fVar;
            this.o = new eye();
            uga ugaVar = new uga();
            pk1 pk1Var = ugaVar.a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int i3 = 0;
            for (int i4 = 20; i3 < i4; i4 = 20) {
                pk1Var.a(iArr[i3]);
                i3++;
            }
            ugaVar.a(29, true);
            ki5 ki5VarB = pk1Var.b();
            this.c = new vga(ki5VarB);
            pk1 pk1Var2 = new uga().a;
            SparseBooleanArray sparseBooleanArray = ki5VarB.a;
            for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
                pa7.C(i5, sparseBooleanArray.size());
                pk1Var2.a(sparseBooleanArray.keyAt(i5));
            }
            pk1Var2.a(4);
            pk1Var2.a(10);
            this.Q = new vga(pk1Var2.b());
            this.j = eceVar.a(looper, null);
            l45 l45Var = new l45(this);
            this.k = l45Var;
            this.n0 = mga.k(r1fVar);
            this.s.N(this, looper);
            uha uhaVar = new uha("");
            g55 g55Var = new g55(this.e, this.g, this.h, au3Var, r1fVar, new ur3(), lp3Var, this.H, this.I, this.s, yscVar, h45Var.i, looper, l45Var, uhaVar, this.x);
            Looper looper2 = g55Var.w;
            jce jceVar = g55Var.g;
            this.l = g55Var;
            this.b0 = 1.0f;
            this.H = 0;
            rp8 rp8Var = rp8.C;
            this.R = rp8Var;
            this.m0 = rp8Var;
            this.o0 = -1;
            this.d0 = u03.c;
            this.e0 = true;
            ro3 ro3Var = this.s;
            f98 f98Var = this.m;
            ro3Var.getClass();
            f98Var.a(ro3Var);
            lp3Var.a(new Handler(looper), this.s);
            copyOnWriteArraySet.add(this.w);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                x45Var = null;
                eceVar.a(looper2, null).e(new c0(this.e, this, uhaVar, 18));
            } else {
                x45Var = null;
            }
            a80 a80Var = new a80(0, looper2, looper, new l45(this));
            this.C = a80Var;
            a80Var.B(new m45(0, this));
            zi0 zi0Var = new zi0(context, looper2, h45Var.f, this.w);
            this.y = zi0Var;
            zi0Var.y();
            boolean z = (h45Var.j == Integer.MAX_VALUE || h45Var.k == Integer.MAX_VALUE) ? false : true;
            xs6 xs6Var = new xs6(context, looper2);
            this.z = xs6Var;
            if (xs6Var.a != z) {
                xs6Var.a = z;
                xs6Var.e(z, xs6Var.b);
            }
            this.A = new f17(context, looper2);
            int i7 = n74.c;
            this.i0 = uuf.d;
            this.Z = xkd.c;
            this.E = i6 >= 34 ? new x45(this, context) : x45Var;
            this.F = new fz3(6);
            this.G = new fz3(6);
            this.D = new wo0(this, this.w, this.v, h45Var.j, h45Var.k);
            jceVar.c(38, this.O).b();
            xi0 xi0Var = this.a0;
            ice iceVarD = jce.d();
            iceVarD.a = jceVar.a.obtainMessage(31, 0, 0, xi0Var);
            iceVarD.b();
            L(1, this.a0, 3);
            L(2, Integer.valueOf(this.Y), 4);
            L(2, 0, 5);
            L(1, Boolean.valueOf(this.c0), 9);
            L(6, this.x, 8);
            L(-1, Integer.valueOf(this.g0), 16);
        } finally {
            this.d.c();
        }
    }

    public static long t(mga mgaVar) {
        fye fyeVar = new fye();
        eye eyeVar = new eye();
        mgaVar.a.g(mgaVar.b.a, eyeVar);
        long j = mgaVar.c;
        return j == -9223372036854775807L ? mgaVar.a.m(eyeVar.c, fyeVar, 0L).j : eyeVar.e + j;
    }

    public static mga z(mga mgaVar, int i) {
        mga mgaVarH = mgaVar.h(i);
        return (i == 1 || i == 4) ? mgaVarH.b(false) : mgaVarH;
    }

    public final mga A(mga mgaVar, gye gyeVar, Pair pair) {
        List list;
        pa7.A(gyeVar.p() || pair != null);
        gye gyeVar2 = mgaVar.a;
        long jF = f(mgaVar);
        mga mgaVarJ = mgaVar.j(gyeVar);
        if (gyeVar.p()) {
            zp8 zp8Var = mga.u;
            long jH = pqf.H(this.p0);
            i1f i1fVar = i1f.d;
            r1f r1fVar = this.b;
            ey6 ey6Var = jy6.b;
            mga mgaVarC = mgaVarJ.d(zp8Var, jH, jH, jH, 0L, i1fVar, r1fVar, yob.e).c(zp8Var);
            mgaVarC.q = mgaVarC.s;
            return mgaVarC;
        }
        Object obj = mgaVarJ.b.a;
        String str = pqf.a;
        boolean zEquals = obj.equals(pair.first);
        zp8 zp8Var2 = !zEquals ? new zp8(pair.first) : mgaVarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jH2 = pqf.H(jF);
        if (!gyeVar2.p()) {
            jH2 -= gyeVar2.g(obj, this.o).e;
            if (zEquals && jH2 - jLongValue == 1 && jH2 == gyeVar2.g(obj, this.o).d) {
                jH2--;
            }
        }
        if (!zEquals || jLongValue < jH2) {
            zp8 zp8Var3 = zp8Var2;
            pa7.J(!zp8Var3.c());
            i1f i1fVar2 = !zEquals ? i1f.d : mgaVarJ.h;
            r1f r1fVar2 = !zEquals ? this.b : mgaVarJ.i;
            if (zEquals) {
                list = mgaVarJ.j;
            } else {
                ey6 ey6Var2 = jy6.b;
                list = yob.e;
            }
            mga mgaVarC2 = mgaVarJ.d(zp8Var3, jLongValue, jLongValue, jLongValue, 0L, i1fVar2, r1fVar2, list).c(zp8Var3);
            mgaVarC2.q = jLongValue;
            return mgaVarC2;
        }
        if (jLongValue != jH2) {
            zp8 zp8Var4 = zp8Var2;
            pa7.J(!zp8Var4.c());
            long jMax = Math.max(0L, mgaVarJ.r - (jLongValue - jH2));
            long j = mgaVarJ.q;
            if (mgaVarJ.k.equals(mgaVarJ.b)) {
                j = jLongValue + jMax;
            }
            mga mgaVarD = mgaVarJ.d(zp8Var4, jLongValue, jLongValue, jLongValue, jMax, mgaVarJ.h, mgaVarJ.i, mgaVarJ.j);
            mgaVarD.q = j;
            return mgaVarD;
        }
        int iB = gyeVar.b(mgaVarJ.k.a);
        if (iB != -1 && gyeVar.f(iB, this.o, false).c == gyeVar.g(zp8Var2.a, this.o).c) {
            return mgaVarJ;
        }
        gyeVar.g(zp8Var2.a, this.o);
        boolean zC = zp8Var2.c();
        eye eyeVar = this.o;
        long jA = zC ? eyeVar.a(zp8Var2.b, zp8Var2.c) : eyeVar.d;
        zp8 zp8Var5 = zp8Var2;
        mga mgaVarC3 = mgaVarJ.d(zp8Var5, mgaVarJ.s, mgaVarJ.s, mgaVarJ.d, jA - mgaVarJ.s, mgaVarJ.h, mgaVarJ.i, mgaVarJ.j).c(zp8Var5);
        mgaVarC3.q = jA;
        return mgaVarC3;
    }

    public final Pair B(gye gyeVar, int i, long j) {
        if (gyeVar.p()) {
            this.o0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.p0 = j;
            return null;
        }
        if (i == -1 || i >= gyeVar.o()) {
            i = gyeVar.a(this.I);
            j = pqf.R(gyeVar.m(i, this.a, 0L).j);
        }
        return gyeVar.i(this.a, this.o, i, pqf.H(j));
    }

    public final void C(final int i, final int i2) {
        xkd xkdVar = this.Z;
        if (i == xkdVar.a && i2 == xkdVar.b) {
            return;
        }
        this.Z = new xkd(i, i2);
        this.m.e(24, new c98() { // from class: n45
            @Override // defpackage.c98
            public final void d(Object obj) {
                ((xga) obj).E(i, i2);
            }
        });
        L(2, new xkd(i, i2), 14);
    }

    public final void D() {
        Z();
        mga mgaVar = this.n0;
        if (mgaVar.e != 1) {
            return;
        }
        mga mgaVarF = mgaVar.f(null);
        mga mgaVarZ = z(mgaVarF, mgaVarF.a.p() ? 4 : 2);
        this.J++;
        this.l.g.a(29).b();
        X(mgaVarZ, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void E() {
        String str;
        boolean zB;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.11.0] [");
        sb.append(pqf.a);
        sb.append("] [");
        HashSet hashSet = pp8.a;
        synchronized (pp8.class) {
            str = pp8.b;
        }
        sb.append(str);
        sb.append("]");
        xo1.D("ExoPlayerImpl", sb.toString());
        Z();
        this.y.y();
        this.z.f(false);
        this.A.a(false);
        x45 x45Var = this.E;
        if (x45Var != null && Build.VERSION.SDK_INT >= 34) {
            x45Var.a();
        }
        wo0 wo0Var = this.D;
        ((jce) wo0Var.g).a.removeCallbacksAndMessages(null);
        ((y45) wo0Var.b).F((i5e) wo0Var.c);
        g55 g55Var = this.l;
        if (g55Var.V0 || !g55Var.w.getThread().isAlive()) {
            zB = true;
        } else {
            g55Var.V0 = true;
            nh2 nh2Var = new nh2(0);
            g55Var.g.c(7, nh2Var).b();
            zB = nh2Var.b(500L);
        }
        if (!zB) {
            this.m.e(10, new pd4(12));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        lp3 lp3Var = this.u;
        ro3 ro3Var = this.s;
        CopyOnWriteArrayList<ft0> copyOnWriteArrayList = (CopyOnWriteArrayList) lp3Var.c.b;
        for (ft0 ft0Var : copyOnWriteArrayList) {
            if (ft0Var.b == ro3Var) {
                ft0Var.c = true;
                copyOnWriteArrayList.remove(ft0Var);
            }
        }
        mga mgaVarA = this.n0;
        if (mgaVarA.p) {
            mgaVarA = mgaVarA.a();
            this.n0 = mgaVarA;
        }
        mga mgaVarZ = z(mgaVarA, 1);
        this.n0 = mgaVarZ;
        mga mgaVarC = mgaVarZ.c(mgaVarZ.b);
        this.n0 = mgaVarC;
        mgaVarC.q = mgaVarC.s;
        this.n0.r = 0L;
        ro3 ro3Var2 = this.s;
        jce jceVar = ro3Var2.v;
        jceVar.getClass();
        jceVar.e(new j1(20, ro3Var2));
        G();
        Surface surface = this.T;
        if (surface != null) {
            surface.release();
            this.T = null;
        }
        this.d0 = u03.c;
        this.h0 = true;
        if (this.n0.a.p()) {
            return;
        }
        mga mgaVar = this.n0;
        boolean z = mgaVar.a.b(mgaVar.b.a) != -1;
        Locale locale = Locale.US;
        mga mgaVar2 = this.n0;
        pa7.I(String.format(locale, "periodUid %s not found in timeline %s with size %d", mgaVar2.b.a, mgaVar2.a.getClass().getName(), Integer.valueOf(this.n0.a.o())), z);
    }

    public final void F(xga xgaVar) {
        Z();
        xgaVar.getClass();
        f98 f98Var = this.m;
        if (f98Var.i) {
            pa7.J(Thread.currentThread() == f98Var.a);
        }
        CopyOnWriteArraySet<e98> copyOnWriteArraySet = f98Var.d;
        for (e98 e98Var : copyOnWriteArraySet) {
            if (e98Var.a.equals(xgaVar)) {
                d98 d98Var = f98Var.c;
                e98Var.d = true;
                if (d98Var != null && e98Var.c) {
                    e98Var.c = false;
                    d98Var.g(e98Var.a, e98Var.b.b());
                }
                copyOnWriteArraySet.remove(e98Var);
            }
        }
    }

    public final void G() {
        uud uudVar = this.V;
        t45 t45Var = this.w;
        if (uudVar != null) {
            wha whaVarC = c(this.x);
            pa7.J(!whaVarC.f);
            whaVarC.c = 10000;
            pa7.J(!whaVarC.f);
            whaVarC.d = null;
            whaVarC.b();
            this.V.a.remove(t45Var);
            this.V = null;
        }
        TextureView textureView = this.X;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != t45Var) {
                xo1.V("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.U;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(t45Var);
            this.U = null;
        }
    }

    public final void H(int i, long j, boolean z) {
        Z();
        if (i == -1) {
            return;
        }
        pa7.A(i >= 0);
        gye gyeVar = this.n0.a;
        if (gyeVar.p() || i < gyeVar.o()) {
            ro3 ro3Var = this.s;
            if (!ro3Var.w) {
                pl plVarH = ro3Var.H();
                ro3Var.w = true;
                ro3Var.M(plVarH, -1, new qd3(14));
            }
            this.J++;
            if (y()) {
                xo1.V("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                d55 d55Var = new d55(this.n0);
                d55Var.e(1);
                y45 y45Var = this.k.a;
                y45Var.j.e(new ny2(17, y45Var, d55Var));
                return;
            }
            mga mgaVarH = this.n0;
            int i2 = mgaVarH.e;
            if (i2 == 3 || (i2 == 4 && !gyeVar.p())) {
                mgaVarH = this.n0.h(2);
            }
            int i3 = i();
            mga mgaVarA = A(mgaVarH, gyeVar, B(gyeVar, i, j));
            this.l.g.c(3, new f55(gyeVar, i, pqf.H(j))).b();
            X(mgaVarA, 0, true, 1, l(mgaVarA), i3, z);
        }
    }

    public final void I(long j) {
        H(i(), j, false);
    }

    public final void J() {
        int iE;
        int iE2;
        if (m().p() || y()) {
            Z();
            return;
        }
        gye gyeVarM = m();
        if (gyeVarM.p()) {
            iE = -1;
        } else {
            int i = i();
            Z();
            int i2 = this.H;
            if (i2 == 1) {
                i2 = 0;
            }
            Z();
            iE = gyeVarM.e(i, i2, this.I);
        }
        if (iE == -1) {
            if (w()) {
                gye gyeVarM2 = m();
                if (!gyeVarM2.p() && gyeVarM2.m(i(), this.a, 0L).g) {
                    H(i(), -9223372036854775807L, false);
                    return;
                }
            }
            Z();
            return;
        }
        gye gyeVarM3 = m();
        if (gyeVarM3.p()) {
            iE2 = -1;
        } else {
            int i3 = i();
            Z();
            int i4 = this.H;
            if (i4 == 1) {
                i4 = 0;
            }
            Z();
            iE2 = gyeVarM3.e(i3, i4, this.I);
        }
        if (iE2 == -1) {
            Z();
        } else if (iE2 == i()) {
            H(i(), -9223372036854775807L, true);
        } else {
            H(iE2, -9223372036854775807L, false);
        }
    }

    public final void K() {
        int iK;
        int iK2;
        int iK3;
        if (m().p() || y()) {
            Z();
            return;
        }
        gye gyeVarM = m();
        if (gyeVarM.p()) {
            iK = -1;
        } else {
            int i = i();
            Z();
            int i2 = this.H;
            if (i2 == 1) {
                i2 = 0;
            }
            Z();
            iK = gyeVarM.k(i, i2, this.I);
        }
        boolean z = iK != -1;
        if (w()) {
            gye gyeVarM2 = m();
            if (gyeVarM2.p() || !gyeVarM2.m(i(), this.a, 0L).f) {
                if (!z) {
                    Z();
                    return;
                }
                gye gyeVarM3 = m();
                if (gyeVarM3.p()) {
                    iK3 = -1;
                } else {
                    int i3 = i();
                    Z();
                    int i4 = this.H;
                    if (i4 == 1) {
                        i4 = 0;
                    }
                    Z();
                    iK3 = gyeVarM3.k(i3, i4, this.I);
                }
                if (iK3 == -1) {
                    Z();
                    return;
                } else if (iK3 == i()) {
                    H(i(), -9223372036854775807L, true);
                    return;
                } else {
                    H(iK3, -9223372036854775807L, false);
                    return;
                }
            }
        }
        if (z) {
            long jK = k();
            Z();
            if (jK <= this.l0) {
                gye gyeVarM4 = m();
                if (gyeVarM4.p()) {
                    iK2 = -1;
                } else {
                    int i5 = i();
                    Z();
                    int i6 = this.H;
                    if (i6 == 1) {
                        i6 = 0;
                    }
                    Z();
                    iK2 = gyeVarM4.k(i5, i6, this.I);
                }
                if (iK2 == -1) {
                    Z();
                    return;
                } else if (iK2 == i()) {
                    H(i(), -9223372036854775807L, true);
                    return;
                } else {
                    H(iK2, -9223372036854775807L, false);
                    return;
                }
            }
        }
        I(0L);
    }

    public final void L(int i, Object obj, int i2) {
        for (hu0 hu0Var : this.g) {
            if (i == -1 || hu0Var.b == i) {
                wha whaVarC = c(hu0Var);
                pa7.J(!whaVarC.f);
                whaVarC.c = i2;
                pa7.J(!whaVarC.f);
                whaVarC.d = obj;
                whaVarC.b();
            }
        }
        for (hu0 hu0Var2 : this.h) {
            if (hu0Var2 != null && (i == -1 || hu0Var2.b == i)) {
                wha whaVarC2 = c(hu0Var2);
                pa7.J(!whaVarC2.f);
                whaVarC2.c = i2;
                pa7.J(!whaVarC2.f);
                whaVarC2.d = obj;
                whaVarC2.b();
            }
        }
    }

    public final void M(op8 op8Var) {
        yob yobVarS = jy6.s(op8Var);
        Z();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < yobVarS.d; i++) {
            arrayList.add(this.r.d((op8) yobVarS.get(i)));
        }
        N(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009c  */
    public final void N(List list) {
        Z();
        o(this.n0);
        k();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            mq8 mq8Var = new mq8((fu0) list.get(i), this.q);
            arrayList2.add(mq8Var);
            arrayList.add(i, new v45(mq8Var.b, mq8Var.a));
        }
        ggd ggdVar = this.P;
        int size = arrayList2.size();
        ggdVar.getClass();
        this.P = new ggd(new Random(ggdVar.a.nextLong())).a(size);
        eia eiaVar = new eia(arrayList, this.P);
        boolean zP = eiaVar.p();
        int i2 = eiaVar.d;
        if (!zP && -1 >= i2) {
            throw new zu6(eiaVar);
        }
        int iA = eiaVar.a(this.I);
        mga mgaVarA = A(this.n0, eiaVar, B(eiaVar, iA, -9223372036854775807L));
        int i3 = mgaVarA.e;
        if (i3 == 1) {
            i3 = 1;
        } else if (eiaVar.p()) {
            i3 = 4;
        } else if (iA != -1) {
            if (iA >= i2) {
                i3 = 4;
            } else {
                i3 = 2;
            }
        }
        mga mgaVarZ = z(mgaVarA, i3);
        this.l.g.c(17, new c55(arrayList2, this.P, iA, pqf.H(-9223372036854775807L))).b();
        X(mgaVarZ, 0, (this.n0.b.a.equals(mgaVarZ.b.a) || this.n0.a.p()) ? false : true, 4, l(mgaVarZ), -1, false);
    }

    public final void O(SurfaceHolder surfaceHolder) {
        this.W = false;
        this.U = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = this.U.getSurface();
        if (surface == null || !surface.isValid()) {
            C(0, 0);
        } else {
            Rect surfaceFrame = this.U.getSurfaceFrame();
            C(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void P(boolean z) {
        Z();
        W(1, z);
    }

    public final void Q(int i) {
        Z();
        if (this.H != i) {
            this.H = i;
            this.l.g.b(11, i, 0).b();
            no3 no3Var = new no3(i, 2);
            f98 f98Var = this.m;
            f98Var.c(8, no3Var);
            V();
            f98Var.b();
        }
    }

    public final void R(q1f q1fVar) {
        q1f q1fVarA;
        Z();
        au3 au3Var = this.i;
        au3Var.getClass();
        q1f q1fVarU = u();
        if (this.M) {
            this.N = q1fVar.w;
            ry6 ry6Var = this.O.a;
            pj pjVarA = q1fVar.a();
            gff it = ry6Var.iterator();
            while (it.hasNext()) {
                pjVarA.m(((Integer) it.next()).intValue(), true);
            }
            q1fVarA = pjVarA.a();
        } else {
            q1fVarA = q1fVar;
        }
        if (!q1fVarA.equals(au3Var.e)) {
            au3Var.l(q1fVarA);
        }
        if (q1fVarU.equals(q1fVar)) {
            return;
        }
        this.m.e(19, new jv2(28, q1fVar));
    }

    public final void S(Object obj) {
        Object obj2 = this.S;
        boolean zB = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.B : -9223372036854775807L;
        g55 g55Var = this.l;
        if (!g55Var.V0 && g55Var.w.getThread().isAlive()) {
            nh2 nh2Var = new nh2(0);
            g55Var.g.c(30, new Pair(obj, nh2Var)).b();
            if (j != -9223372036854775807L) {
                zB = nh2Var.b(j);
            }
        }
        if (z) {
            Object obj3 = this.S;
            Surface surface = this.T;
            if (obj3 == surface) {
                surface.release();
                this.T = null;
            }
        }
        this.S = obj;
        if (zB) {
            return;
        }
        U(new g45(2, new l55(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    public final void T() {
        Z();
        U(null);
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        long j = this.n0.s;
        this.d0 = new u03(yobVar);
    }

    public final void U(g45 g45Var) {
        mga mgaVar = this.n0;
        mga mgaVarC = mgaVar.c(mgaVar.b);
        mgaVarC.q = mgaVarC.s;
        mgaVarC.r = 0L;
        mga mgaVarZ = z(mgaVarC, 1);
        if (g45Var != null) {
            mgaVarZ = mgaVarZ.f(g45Var);
        }
        this.J++;
        this.l.g.a(6).b();
        X(mgaVarZ, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void V() {
        int iK;
        int iE;
        pk1 pk1Var;
        vga vgaVar = this.Q;
        String str = pqf.a;
        y45 y45Var = this.f;
        boolean zY = y45Var.y();
        fye fyeVar = y45Var.a;
        gye gyeVarM = y45Var.m();
        boolean z = !gyeVarM.p() && gyeVarM.m(y45Var.i(), fyeVar, 0L).f;
        gye gyeVarM2 = y45Var.m();
        if (gyeVarM2.p()) {
            iK = -1;
        } else {
            int i = y45Var.i();
            y45Var.Z();
            int i2 = y45Var.H;
            if (i2 == 1) {
                i2 = 0;
            }
            y45Var.Z();
            iK = gyeVarM2.k(i, i2, y45Var.I);
        }
        boolean z2 = iK != -1;
        gye gyeVarM3 = y45Var.m();
        if (gyeVarM3.p()) {
            iE = -1;
        } else {
            int i3 = y45Var.i();
            y45Var.Z();
            int i4 = y45Var.H;
            if (i4 == 1) {
                i4 = 0;
            }
            y45Var.Z();
            iE = gyeVarM3.e(i3, i4, y45Var.I);
        }
        boolean z3 = iE != -1;
        boolean zW = y45Var.w();
        gye gyeVarM4 = y45Var.m();
        boolean z4 = !gyeVarM4.p() && gyeVarM4.m(y45Var.i(), fyeVar, 0L).g;
        boolean zP = y45Var.m().p();
        uga ugaVar = new uga();
        SparseBooleanArray sparseBooleanArray = this.c.a.a;
        int i5 = 0;
        while (true) {
            int size = sparseBooleanArray.size();
            pk1Var = ugaVar.a;
            if (i5 >= size) {
                break;
            }
            pa7.C(i5, sparseBooleanArray.size());
            pk1Var.a(sparseBooleanArray.keyAt(i5));
            i5++;
        }
        boolean z5 = !zY;
        ugaVar.a(4, z5);
        ugaVar.a(5, z && !zY);
        ugaVar.a(6, z2 && !zY);
        ugaVar.a(7, !zP && (z2 || !zW || z) && !zY);
        ugaVar.a(8, z3 && !zY);
        ugaVar.a(9, !zP && (z3 || (zW && z4)) && !zY);
        ugaVar.a(10, z5);
        ugaVar.a(11, z && !zY);
        ugaVar.a(12, z && !zY);
        vga vgaVar2 = new vga(pk1Var.b());
        this.Q = vgaVar2;
        if (vgaVar2.equals(vgaVar)) {
            return;
        }
        this.m.c(13, new l45(this));
    }

    public final void W(int i, boolean z) {
        int i2;
        if (this.M) {
            i2 = 4;
        } else {
            i2 = (this.n0.n != 1 || z) ? 0 : 1;
        }
        mga mgaVarA = this.n0;
        if (mgaVarA.l == z && mgaVarA.n == i2 && mgaVarA.m == i) {
            return;
        }
        this.J++;
        if (mgaVarA.p) {
            mgaVarA = mgaVarA.a();
        }
        mga mgaVarE = mgaVarA.e(i, i2, z);
        this.l.g.b(1, z ? 1 : 0, i | (i2 << 4)).b();
        X(mgaVarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void X(final mga mgaVar, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        op8 op8Var;
        int i5;
        int i6;
        Object obj;
        op8 op8Var2;
        Object obj2;
        long jT;
        long jT2;
        Object obj3;
        op8 op8Var3;
        Object obj4;
        mga mgaVar2 = this.n0;
        this.n0 = mgaVar;
        if (!mgaVar.a.p()) {
            pa7.I(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", mgaVar.b.a, mgaVar.a.getClass().getName(), Integer.valueOf(mgaVar.a.o())), mgaVar.a.b(mgaVar.b.a) != -1);
        }
        boolean zEquals = mgaVar2.a.equals(mgaVar.a);
        fye fyeVar = this.a;
        eye eyeVar = this.o;
        gye gyeVar = mgaVar2.a;
        zp8 zp8Var = mgaVar2.b;
        gye gyeVar2 = mgaVar.a;
        zp8 zp8Var2 = mgaVar.b;
        int i7 = 0;
        if (gyeVar2.p() && gyeVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (gyeVar2.p() != gyeVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!gyeVar.m(gyeVar.g(zp8Var.a, eyeVar).c, fyeVar, 0L).a.equals(gyeVar2.m(gyeVar2.g(zp8Var2.a, eyeVar).c, fyeVar, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    r3.l();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && zp8Var.d < zp8Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            op8Var = mgaVar.a.p() ? null : mgaVar.a.m(mgaVar.a.g(mgaVar.b.a, this.o).c, this.a, 0L).b;
            this.m0 = rp8.C;
        } else {
            op8Var = null;
        }
        if (zBooleanValue || !mgaVar2.j.equals(mgaVar.j)) {
            r23 r23VarA = this.m0.a();
            List list = mgaVar.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                su8 su8Var = (su8) list.get(i8);
                int i9 = 0;
                while (true) {
                    qu8[] qu8VarArr = su8Var.a;
                    if (i9 < qu8VarArr.length) {
                        qu8VarArr[i9].b(r23VarA);
                        i9++;
                    }
                }
            }
            this.m0 = new rp8(r23VarA);
        }
        rp8 rp8VarA = a();
        boolean zEquals2 = rp8VarA.equals(this.R);
        this.R = rp8VarA;
        boolean z3 = mgaVar2.l != mgaVar.l;
        boolean z4 = mgaVar2.e != mgaVar.e;
        if (z4 || z3) {
            Y();
        }
        boolean z5 = mgaVar2.g != mgaVar.g;
        if (!zEquals) {
            this.m.c(0, new j45(mgaVar, i, i7));
        }
        if (z) {
            eye eyeVar2 = new eye();
            if (mgaVar2.a.p()) {
                i5 = i3;
                i6 = i5;
                obj = null;
                op8Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = mgaVar2.b.a;
                mgaVar2.a.g(obj5, eyeVar2);
                int i10 = eyeVar2.c;
                int iB = mgaVar2.a.b(obj5);
                obj = mgaVar2.a.m(i10, this.a, 0L).a;
                op8Var2 = this.a.b;
                obj2 = obj5;
                i5 = i10;
                i6 = iB;
            }
            zp8 zp8Var3 = mgaVar2.b;
            if (i2 == 0) {
                boolean zC = zp8Var3.c();
                zp8 zp8Var4 = mgaVar2.b;
                if (zC) {
                    jT = eyeVar2.a(zp8Var4.b, zp8Var4.c);
                    jT2 = t(mgaVar2);
                } else {
                    jT = zp8Var4.e != -1 ? t(this.n0) : eyeVar2.e + eyeVar2.d;
                    jT2 = jT;
                }
            } else if (zp8Var3.c()) {
                jT = mgaVar2.s;
                jT2 = t(mgaVar2);
            } else {
                jT = eyeVar2.e + mgaVar2.s;
                jT2 = jT;
            }
            long jR = pqf.R(jT);
            long jR2 = pqf.R(jT2);
            zp8 zp8Var5 = mgaVar2.b;
            yga ygaVar = new yga(obj, i5, op8Var2, obj2, i6, jR, jR2, zp8Var5.b, zp8Var5.c);
            fye fyeVar2 = this.a;
            int i11 = i();
            int iJ = j();
            if (this.n0.a.p()) {
                obj3 = null;
                op8Var3 = null;
                obj4 = null;
            } else {
                mga mgaVar3 = this.n0;
                Object obj6 = mgaVar3.b.a;
                mgaVar3.a.g(obj6, this.o);
                iJ = this.n0.a.b(obj6);
                Object obj7 = this.n0.a.m(i11, fyeVar2, 0L).a;
                op8Var3 = fyeVar2.b;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i12 = iJ;
            long jR3 = pqf.R(j);
            long jR4 = this.n0.b.c() ? pqf.R(t(this.n0)) : jR3;
            zp8 zp8Var6 = this.n0.b;
            this.m.c(11, new q45(i2, ygaVar, new yga(obj3, i11, op8Var3, obj4, i12, jR3, jR4, zp8Var6.b, zp8Var6.c)));
        } else {
            z3 = z3;
            zEquals2 = zEquals2;
            zBooleanValue = zBooleanValue;
        }
        if (zBooleanValue) {
            this.m.c(1, new j45(op8Var, iIntValue, 1));
        }
        final int i13 = 7;
        if (mgaVar2.f != mgaVar.f) {
            this.m.c(10, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj8) {
                    int i14 = i13;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj8;
                    switch (i14) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
            if (mgaVar.f != null) {
                final int i14 = 8;
                this.m.c(10, new c98() { // from class: k45
                    @Override // defpackage.c98
                    public final void d(Object obj8) {
                        int i15 = i14;
                        mga mgaVar4 = mgaVar;
                        xga xgaVar = (xga) obj8;
                        switch (i15) {
                            case 0:
                                boolean z6 = mgaVar4.g;
                                xgaVar.getClass();
                                xgaVar.f(mgaVar4.g);
                                break;
                            case 1:
                                xgaVar.A(mgaVar4.e, mgaVar4.l);
                                break;
                            case 2:
                                xgaVar.l(mgaVar4.e);
                                break;
                            case 3:
                                xgaVar.h(mgaVar4.m, mgaVar4.l);
                                break;
                            case 4:
                                xgaVar.b(mgaVar4.n);
                                break;
                            case 5:
                                xgaVar.G(mgaVar4.m());
                                break;
                            case 6:
                                xgaVar.B(mgaVar4.o);
                                break;
                            case 7:
                                xgaVar.s(mgaVar4.f);
                                break;
                            case 8:
                                xgaVar.q(mgaVar4.f);
                                break;
                            default:
                                xgaVar.r((f2f) mgaVar4.i.d);
                                break;
                        }
                    }
                });
            }
        }
        r1f r1fVar = mgaVar2.i;
        r1f r1fVar2 = mgaVar.i;
        if (r1fVar != r1fVar2) {
            au3 au3Var = this.i;
            Object obj8 = r1fVar2.e;
            au3Var.getClass();
            final int i15 = 9;
            this.m.c(2, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i16 = i15;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i16) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.m.c(14, new jv2(27, this.R));
        }
        if (z5) {
            final int i16 = 0;
            this.m.c(3, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i17 = i16;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i17) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final int i17 = 1;
            this.m.c(-1, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i18 = i17;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i18) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        final int i18 = 4;
        if (z4) {
            final int i19 = 2;
            this.m.c(4, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i110 = i19;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i110) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        final int i20 = 5;
        if (z3 || mgaVar2.m != mgaVar.m) {
            final int i21 = 3;
            this.m.c(5, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i110 = i21;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i110) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        final int i22 = 6;
        if (mgaVar2.n != mgaVar.n) {
            this.m.c(6, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i110 = i18;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i110) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        if (mgaVar2.m() != mgaVar.m()) {
            this.m.c(7, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i110 = i20;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i110) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        if (!mgaVar2.o.equals(mgaVar.o)) {
            this.m.c(12, new c98() { // from class: k45
                @Override // defpackage.c98
                public final void d(Object obj9) {
                    int i110 = i22;
                    mga mgaVar4 = mgaVar;
                    xga xgaVar = (xga) obj9;
                    switch (i110) {
                        case 0:
                            boolean z6 = mgaVar4.g;
                            xgaVar.getClass();
                            xgaVar.f(mgaVar4.g);
                            break;
                        case 1:
                            xgaVar.A(mgaVar4.e, mgaVar4.l);
                            break;
                        case 2:
                            xgaVar.l(mgaVar4.e);
                            break;
                        case 3:
                            xgaVar.h(mgaVar4.m, mgaVar4.l);
                            break;
                        case 4:
                            xgaVar.b(mgaVar4.n);
                            break;
                        case 5:
                            xgaVar.G(mgaVar4.m());
                            break;
                        case 6:
                            xgaVar.B(mgaVar4.o);
                            break;
                        case 7:
                            xgaVar.s(mgaVar4.f);
                            break;
                        case 8:
                            xgaVar.q(mgaVar4.f);
                            break;
                        default:
                            xgaVar.r((f2f) mgaVar4.i.d);
                            break;
                    }
                }
            });
        }
        V();
        this.m.b();
        if (mgaVar2.p != mgaVar.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((t45) it.next()).a.Y();
            }
        }
    }

    public final void Y() {
        int iR = r();
        f17 f17Var = this.A;
        xs6 xs6Var = this.z;
        boolean z = false;
        if (iR != 1) {
            if (iR == 2 || iR == 3) {
                Z();
                boolean z2 = this.n0.p;
                if (q() && !z2) {
                    z = true;
                }
                xs6Var.f(z);
                f17Var.a(q());
                return;
            }
            if (iR != 4) {
                r3.l();
                return;
            }
        }
        xs6Var.f(false);
        f17Var.a(false);
    }

    public final void Z() {
        this.d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = pqf.a;
            Locale locale = Locale.US;
            String strM = tec.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.e0) {
                qc0.p(strM);
            } else {
                xo1.W("ExoPlayerImpl", strM, this.f0 ? null : new IllegalStateException());
                this.f0 = true;
            }
        }
    }

    public final rp8 a() {
        gye gyeVarM = m();
        if (gyeVarM.p()) {
            return this.m0;
        }
        op8 op8Var = gyeVarM.m(i(), this.a, 0L).b;
        r23 r23VarA = this.m0.a();
        rp8 rp8Var = op8Var.d;
        if (rp8Var != null) {
            jy6 jy6Var = rp8Var.B;
            byte[] bArr = rp8Var.f;
            CharSequence charSequence = rp8Var.a;
            if (charSequence != null) {
                r23VarA.a = charSequence;
            }
            CharSequence charSequence2 = rp8Var.b;
            if (charSequence2 != null) {
                r23VarA.b = charSequence2;
            }
            CharSequence charSequence3 = rp8Var.c;
            if (charSequence3 != null) {
                r23VarA.c = charSequence3;
            }
            CharSequence charSequence4 = rp8Var.d;
            if (charSequence4 != null) {
                r23VarA.d = charSequence4;
            }
            CharSequence charSequence5 = rp8Var.e;
            if (charSequence5 != null) {
                r23VarA.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = rp8Var.g;
                r23VarA.f = bArr == null ? null : (byte[]) bArr.clone();
                r23VarA.g = num;
                rp8 rp8Var2 = rp8.C;
            }
            Integer num2 = rp8Var.h;
            if (num2 != null) {
                r23VarA.h = num2;
            }
            Integer num3 = rp8Var.i;
            if (num3 != null) {
                r23VarA.i = num3;
            }
            Integer num4 = rp8Var.j;
            if (num4 != null) {
                r23VarA.j = num4;
            }
            Boolean bool = rp8Var.k;
            if (bool != null) {
                r23VarA.k = bool;
            }
            Integer num5 = rp8Var.l;
            if (num5 != null) {
                r23VarA.l = num5;
            }
            Integer num6 = rp8Var.m;
            if (num6 != null) {
                r23VarA.l = num6;
            }
            Integer num7 = rp8Var.n;
            if (num7 != null) {
                r23VarA.m = num7;
            }
            Integer num8 = rp8Var.o;
            if (num8 != null) {
                r23VarA.n = num8;
            }
            Integer num9 = rp8Var.p;
            if (num9 != null) {
                r23VarA.o = num9;
            }
            Integer num10 = rp8Var.q;
            if (num10 != null) {
                r23VarA.p = num10;
            }
            Integer num11 = rp8Var.r;
            if (num11 != null) {
                r23VarA.q = num11;
            }
            CharSequence charSequence6 = rp8Var.s;
            if (charSequence6 != null) {
                r23VarA.r = charSequence6;
            }
            CharSequence charSequence7 = rp8Var.t;
            if (charSequence7 != null) {
                r23VarA.s = charSequence7;
            }
            CharSequence charSequence8 = rp8Var.u;
            if (charSequence8 != null) {
                r23VarA.t = charSequence8;
            }
            CharSequence charSequence9 = rp8Var.v;
            if (charSequence9 != null) {
                r23VarA.u = charSequence9;
            }
            Integer num12 = rp8Var.w;
            if (num12 != null) {
                r23VarA.v = num12;
            }
            Integer num13 = rp8Var.x;
            if (num13 != null) {
                r23VarA.w = num13;
            }
            CharSequence charSequence10 = rp8Var.y;
            if (charSequence10 != null) {
                r23VarA.x = charSequence10;
            }
            CharSequence charSequence11 = rp8Var.z;
            if (charSequence11 != null) {
                r23VarA.y = charSequence11;
            }
            Integer num14 = rp8Var.A;
            if (num14 != null) {
                r23VarA.z = num14;
            }
            if (!jy6Var.isEmpty()) {
                r23VarA.A = jy6.o(jy6Var);
            }
        }
        return new rp8(r23VarA);
    }

    public final void b() {
        Z();
        G();
        S(null);
        C(0, 0);
    }

    public final wha c(vha vhaVar) {
        int iO = o(this.n0);
        gye gyeVar = this.n0.a;
        if (iO == -1) {
            iO = 0;
        }
        g55 g55Var = this.l;
        return new wha(g55Var, vhaVar, gyeVar, iO, g55Var.w);
    }

    public final long d() {
        Z();
        if (!y()) {
            return e();
        }
        mga mgaVar = this.n0;
        return mgaVar.k.equals(mgaVar.b) ? pqf.R(this.n0.q) : p();
    }

    public final long e() {
        Z();
        if (this.n0.a.p()) {
            return this.p0;
        }
        mga mgaVar = this.n0;
        long j = 0;
        if (mgaVar.k.d != mgaVar.b.d) {
            return pqf.R(mgaVar.a.m(i(), this.a, 0L).k);
        }
        long j2 = mgaVar.q;
        if (this.n0.k.c()) {
            mga mgaVar2 = this.n0;
            mgaVar2.a.g(mgaVar2.k.a, this.o).d(this.n0.k.b);
        } else {
            j = j2;
        }
        mga mgaVar3 = this.n0;
        gye gyeVar = mgaVar3.a;
        Object obj = mgaVar3.k.a;
        eye eyeVar = this.o;
        gyeVar.g(obj, eyeVar);
        return pqf.R(j + eyeVar.e);
    }

    public final long f(mga mgaVar) {
        zp8 zp8Var = mgaVar.b;
        long j = mgaVar.c;
        gye gyeVar = mgaVar.a;
        if (!zp8Var.c()) {
            return pqf.R(l(mgaVar));
        }
        Object obj = mgaVar.b.a;
        eye eyeVar = this.o;
        gyeVar.g(obj, eyeVar);
        if (j == -9223372036854775807L) {
            return pqf.R(gyeVar.m(o(mgaVar), this.a, 0L).j);
        }
        return pqf.R(j) + pqf.R(eyeVar.e);
    }

    public final int g() {
        Z();
        if (y()) {
            return this.n0.b.b;
        }
        return -1;
    }

    public final int h() {
        Z();
        if (y()) {
            return this.n0.b.c;
        }
        return -1;
    }

    public final int i() {
        Z();
        int iO = o(this.n0);
        if (iO == -1) {
            return 0;
        }
        return iO;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        Z();
        return this.M;
    }

    public final int j() {
        Z();
        if (!this.n0.a.p()) {
            mga mgaVar = this.n0;
            return mgaVar.a.b(mgaVar.b.a);
        }
        int i = this.o0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final long k() {
        Z();
        return pqf.R(l(this.n0));
    }

    public final long l(mga mgaVar) {
        if (mgaVar.a.p()) {
            return pqf.H(this.p0);
        }
        long jL = mgaVar.p ? mgaVar.l() : mgaVar.s;
        if (mgaVar.b.c()) {
            return jL;
        }
        gye gyeVar = mgaVar.a;
        Object obj = mgaVar.b.a;
        eye eyeVar = this.o;
        gyeVar.g(obj, eyeVar);
        return jL + eyeVar.e;
    }

    public final gye m() {
        Z();
        return this.n0.a;
    }

    public final f2f n() {
        Z();
        return (f2f) this.n0.i.d;
    }

    public final int o(mga mgaVar) {
        return mgaVar.a.p() ? this.o0 : mgaVar.a.g(mgaVar.b.a, this.o).c;
    }

    public final long p() {
        Z();
        if (!y()) {
            gye gyeVarM = m();
            if (gyeVarM.p()) {
                return -9223372036854775807L;
            }
            return pqf.R(gyeVarM.m(i(), this.a, 0L).k);
        }
        mga mgaVar = this.n0;
        zp8 zp8Var = mgaVar.b;
        gye gyeVar = mgaVar.a;
        Object obj = zp8Var.a;
        eye eyeVar = this.o;
        gyeVar.g(obj, eyeVar);
        return pqf.R(eyeVar.a(zp8Var.b, zp8Var.c));
    }

    public final boolean q() {
        Z();
        return this.n0.l;
    }

    public final int r() {
        Z();
        return this.n0.e;
    }

    public final int s() {
        Z();
        return this.n0.n;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        Z();
        L(4, imageOutput, 15);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        q1f q1fVarA;
        Z();
        if (z == this.M) {
            return;
        }
        this.M = z;
        iic iicVar = this.O;
        if (!iicVar.a.isEmpty()) {
            au3 au3Var = this.i;
            au3Var.getClass();
            vt3 vt3Var = au3Var.e;
            if (z) {
                this.N = vt3Var.w;
                ry6 ry6Var = iicVar.a;
                pj pjVarA = vt3Var.a();
                gff it = ry6Var.iterator();
                while (it.hasNext()) {
                    pjVarA.m(((Integer) it.next()).intValue(), true);
                }
                q1fVarA = pjVarA.a();
            } else {
                vt3Var.getClass();
                ut3 ut3Var = new ut3(vt3Var);
                ut3Var.n(this.N);
                vt3 vt3Var2 = new vt3(ut3Var);
                this.N = null;
                q1fVarA = vt3Var2;
            }
            if (!q1fVarA.equals(vt3Var)) {
                au3Var.l(q1fVarA);
            }
        }
        this.l.g.c(36, Boolean.valueOf(z)).b();
        mga mgaVar = this.n0;
        W(mgaVar.m, mgaVar.l);
    }

    public final q1f u() {
        Z();
        vt3 vt3Var = this.i.e;
        if (!this.M) {
            return vt3Var;
        }
        vt3Var.getClass();
        ut3 ut3Var = new ut3(vt3Var);
        ut3Var.n(this.N);
        return new vt3(ut3Var);
    }

    public final boolean v(int i) {
        Z();
        return this.Q.a.a.get(i);
    }

    public final boolean w() {
        gye gyeVarM = m();
        return !gyeVarM.p() && gyeVarM.m(i(), this.a, 0L).a();
    }

    public final boolean x() {
        return r() == 3 && q() && s() == 0;
    }

    public final boolean y() {
        Z();
        return this.n0.b.c();
    }
}
