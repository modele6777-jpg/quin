package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.webkit.WebView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qk6 implements mm0, n21, cu2, eo1, ov2, m23, oq4, bc2, ozb, z0g, yrd, gv8, pkf, wea, r8f {
    public final /* synthetic */ int a;
    public static final qk6 b = new qk6(1);
    public static final qk6 c = new qk6(2);
    public static final qk6 d = new qk6(3);
    public static final qk6 e = new qk6(4);
    public static final qk6 f = new qk6(5);
    public static final qk6 g = new qk6(6);
    public static final qk6 v = new qk6(7);
    public static final /* synthetic */ qk6 w = new qk6(8);
    public static final qk6 x = new qk6(9);
    public static final qk6 y = new qk6(10);
    public static final qk6 z = new qk6(11);
    public static final qk6 X = new qk6(12);
    public static final qk6 Y = new qk6(13);
    public static final qk6 Z = new qk6(14);
    public static final qk6 E0 = new qk6(15);
    public static final String[] F0 = new String[0];
    public static final qk6 G0 = new qk6(17);
    public static final qk6 H0 = new qk6(18);
    public static final qk6 I0 = new qk6(19);
    public static final /* synthetic */ qk6 J0 = new qk6(20);
    public static final /* synthetic */ qk6 K0 = new qk6(21);
    public static final qk6 L0 = new qk6(22);
    public static final qk6 M0 = new qk6(23);
    public static final qk6 N0 = new qk6(24);
    public static final qk6 O0 = new qk6(25);
    public static final qk6 P0 = new qk6(26);
    public static final qk6 Q0 = new qk6(27);
    public static final qk6 R0 = new qk6(29);

    public /* synthetic */ qk6(int i) {
        this.a = i;
    }

    public static void G0(Object obj) {
        throw new pt7("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    public static wne r0(int i, l46 l46Var) {
        return w0((m82) l46Var.k(o82.a), l46Var);
    }

    public static wne v0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, l46 l46Var, int i) {
        long j14 = (i & 1) != 0 ? y72.k : j;
        long j15 = (i & 2) != 0 ? y72.k : j2;
        long j16 = (i & 4) != 0 ? y72.k : j3;
        long j17 = y72.k;
        return w0((m82) l46Var.k(o82.a), l46Var).a(j14, j15, j16, j17, j4, j5, (i & 64) != 0 ? j17 : j6, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? j17 : j7, (i & 256) != 0 ? j17 : j8, j17, null, j9, j10, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? j17 : j11, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, (134217728 & i) != 0 ? j17 : j12, (i & 268435456) != 0 ? j17 : j13, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17);
    }

    public static wne w0(m82 m82Var, l46 l46Var) {
        wne wneVarA = m82Var.m0;
        if (wneVarA == null) {
            l46Var.f0(390452338);
            l46Var.r(false);
            wneVarA = null;
        } else {
            l46Var.f0(390452339);
            hue hueVar = (hue) l46Var.k(iue.a);
            if (!pa7.t(wneVarA.k, hueVar)) {
                wneVarA = wneVarA.a(wneVarA.a, wneVarA.b, wneVarA.c, wneVarA.d, wneVarA.e, wneVarA.f, wneVarA.g, wneVarA.h, wneVarA.i, wneVarA.j, hueVar, wneVarA.l, wneVarA.m, wneVarA.n, wneVarA.o, wneVarA.p, wneVarA.q, wneVarA.r, wneVarA.s, wneVarA.t, wneVarA.u, wneVarA.v, wneVarA.w, wneVarA.x, wneVarA.y, wneVarA.z, wneVarA.A, wneVarA.B, wneVarA.C, wneVarA.D, wneVarA.E, wneVarA.F, wneVarA.G, wneVarA.H, wneVarA.I, wneVarA.J, wneVarA.K, wneVarA.L, wneVarA.M, wneVarA.N, wneVarA.O, wneVarA.P, wneVarA.Q);
                m82Var.m0 = wneVarA;
            }
            l46Var.r(false);
        }
        if (wneVarA != null) {
            l46Var.f0(-1788515437);
            l46Var.r(false);
            return wneVarA;
        }
        l46Var.f0(-1788321191);
        long jC = o82.c(m82Var, bm8.s);
        long jC2 = o82.c(m82Var, bm8.y);
        n82 n82Var = bm8.f;
        long jB = y72.b(o82.c(m82Var, n82Var), 0.38f);
        long jC3 = o82.c(m82Var, bm8.m);
        long j = y72.j;
        long jC4 = o82.c(m82Var, bm8.d);
        long jC5 = o82.c(m82Var, bm8.l);
        hue hueVar2 = (hue) l46Var.k(iue.a);
        long jC6 = o82.c(m82Var, bm8.v);
        long jC7 = o82.c(m82Var, bm8.E);
        long jB2 = y72.b(o82.c(m82Var, bm8.i), 0.12f);
        long jC8 = o82.c(m82Var, bm8.p);
        long jC9 = o82.c(m82Var, bm8.u);
        long jC10 = o82.c(m82Var, bm8.D);
        long jB3 = y72.b(o82.c(m82Var, bm8.h), 0.38f);
        long jC11 = o82.c(m82Var, bm8.o);
        long jC12 = o82.c(m82Var, bm8.x);
        long jC13 = o82.c(m82Var, bm8.G);
        long jB4 = y72.b(o82.c(m82Var, bm8.k), 0.38f);
        long jC14 = o82.c(m82Var, bm8.r);
        long jC15 = o82.c(m82Var, bm8.t);
        long jC16 = o82.c(m82Var, bm8.C);
        long jB5 = y72.b(o82.c(m82Var, bm8.g), 0.38f);
        long jC17 = o82.c(m82Var, bm8.n);
        n82 n82Var2 = bm8.z;
        long jC18 = o82.c(m82Var, n82Var2);
        long jC19 = o82.c(m82Var, n82Var2);
        long jB6 = y72.b(o82.c(m82Var, n82Var), 0.38f);
        long jC20 = o82.c(m82Var, n82Var2);
        long jC21 = o82.c(m82Var, bm8.w);
        long jC22 = o82.c(m82Var, bm8.F);
        long jB7 = y72.b(o82.c(m82Var, bm8.j), 0.38f);
        long jC23 = o82.c(m82Var, bm8.q);
        n82 n82Var3 = bm8.A;
        long jC24 = o82.c(m82Var, n82Var3);
        long jC25 = o82.c(m82Var, n82Var3);
        long jB8 = y72.b(o82.c(m82Var, n82Var3), 0.38f);
        long jC26 = o82.c(m82Var, n82Var3);
        n82 n82Var4 = bm8.B;
        wne wneVar = new wne(jC, jC2, jB, jC3, j, j, j, j, jC4, jC5, hueVar2, jC6, jC7, jB2, jC8, jC9, jC10, jB3, jC11, jC12, jC13, jB4, jC14, jC15, jC16, jB5, jC17, jC18, jC19, jB6, jC20, jC21, jC22, jB7, jC23, jC24, jC25, jB8, jC26, o82.c(m82Var, n82Var4), o82.c(m82Var, n82Var4), y72.b(o82.c(m82Var, n82Var4), 0.38f), o82.c(m82Var, n82Var4));
        m82Var.m0 = wneVar;
        l46Var.r(false);
        return wneVar;
    }

    public static e09 y0(fza fzaVar) {
        int i = fzaVar == null ? -1 : q0b.a[fzaVar.ordinal()];
        e09 e09Var = e09.b;
        if (i == 1) {
            return e09Var;
        }
        if (i == 2) {
            return e09.d;
        }
        if (i != 3) {
            return i != 4 ? e09Var : e09.c;
        }
        return e09.e;
    }

    @Override // defpackage.r8f
    public x8f A(e8f e8fVar) {
        int iOrdinal = ((ao7) e8fVar).d.ordinal();
        if (iOrdinal == 0) {
            return x8f.INV;
        }
        if (iOrdinal == 1) {
            return x8f.IN;
        }
        if (iOrdinal == 2) {
            return x8f.OUT;
        }
        ap.c();
        return null;
    }

    public vjd A0(w4c w4cVar) {
        lv3 lv3VarH0 = h0(w4cVar);
        if (lv3VarH0 == null) {
            return (vjd) w4cVar;
        }
        G0(lv3VarH0);
        throw null;
    }

    @Override // defpackage.oq4
    public nq4 B(x4d x4dVar, long j, cv7 cv7Var, sn4 sn4Var, n4d n4dVar) {
        return new nq4(n4dVar, x4dVar.a(j, cv7Var, sn4Var));
    }

    @Override // defpackage.r8f
    public w4c C(xt7 xt7Var) {
        xt7Var.getClass();
        dj5 dj5VarG0 = g0(xt7Var);
        if (dj5VarG0 != null) {
            return j(dj5VarG0);
        }
        w4c w4cVarM0 = m0(xt7Var);
        w4cVarM0.getClass();
        return w4cVarM0;
    }

    @Override // defpackage.r8f
    public c7f C0(w4c w4cVar) {
        w4cVar.getClass();
        return (c7f) w4cVar;
    }

    @Override // defpackage.r8f
    public xt7 D(fp1 fp1Var) {
        return (xt7) ((vo1) fp1Var).b;
    }

    @Override // defpackage.r8f
    public Collection E(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof em7) {
            List<yn7> listE = ((em7) k7fVar).e();
            ArrayList arrayList = new ArrayList(t72.u(listE, 10));
            for (yn7 yn7Var : listE) {
                yn7Var.getClass();
                arrayList.add((xt7) yn7Var);
            }
            return arrayList;
        }
        if (k7fVar instanceof ao7) {
            List<yn7> upperBounds = ((ao7) k7fVar).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(t72.u(upperBounds, 10));
            for (yn7 yn7Var2 : upperBounds) {
                yn7Var2.getClass();
                arrayList2.add((xt7) yn7Var2);
            }
            return arrayList2;
        }
        if (!(k7fVar instanceof wo1)) {
            StringBuilder sbO = ks0.o("Unsupported type constructor: ", k7fVar, " (");
            sbO.append(k7fVar.getClass().getName());
            sbO.append(')');
            throw new IllegalStateException(sbO.toString().toString());
        }
        ArrayList<yn7> arrayList3 = ((wo1) k7fVar).b;
        if (arrayList3 == null) {
            pa7.g0("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
        for (yn7 yn7Var3 : arrayList3) {
            yn7Var3.getClass();
            arrayList4.add((xt7) yn7Var3);
        }
        return arrayList4;
    }

    @Override // defpackage.r8f
    public xt7 E0(xt7 xt7Var) {
        G0(xt7Var);
        throw null;
    }

    @Override // defpackage.r8f
    public boolean F(k7f k7fVar) {
        return !(k7fVar instanceof wo1);
    }

    @Override // defpackage.r8f
    public boolean F0(xt7 xt7Var) {
        tt7 tt7Var;
        if (!(xt7Var instanceof j2) || !(((j2) xt7Var).B() instanceof ry4)) {
            zy3 zy3Var = xt7Var instanceof zy3 ? (zy3) xt7Var : null;
            if (zy3Var == null || (tt7Var = zy3Var.b) == null || !i7h.x(tt7Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r8f
    public k7f G(w4c w4cVar) {
        Class<?> componentType;
        w4cVar.getClass();
        if (w4cVar instanceof vo1) {
            return ((vo1) w4cVar).c;
        }
        j2 j2Var = (j2) w4cVar;
        if (j2Var.t()) {
            return ah9.b;
        }
        um7 um7VarB = j2Var.B();
        nm7 nm7Var = um7VarB instanceof nm7 ? (nm7) um7VarB : null;
        if (nm7Var != null && (componentType = af1.R(nm7Var).getComponentType()) != null && !componentType.isPrimitive()) {
            return (k7f) job.a.b(Object[].class);
        }
        um7 um7VarF = j2Var.f();
        if (um7VarF == null) {
            um7VarF = j2Var.B();
        }
        um7VarF.getClass();
        return (k7f) um7VarF;
    }

    @Override // defpackage.r8f
    public to1 H(fp1 fp1Var) {
        return to1.a;
    }

    @Override // defpackage.r8f
    public boolean I(xt7 xt7Var) {
        xt7Var.getClass();
        return ((yn7) C(xt7Var)).o() != ((yn7) U(xt7Var)).o();
    }

    @Override // defpackage.r8f
    public boolean J(xt7 xt7Var) {
        xt7Var.getClass();
        w4c w4cVarM0 = m0(xt7Var);
        return (w4cVarM0 != null ? h0(w4cVarM0) : null) != null;
    }

    @Override // defpackage.r8f
    public boolean L(w4c w4cVar) {
        w4cVar.getClass();
        return h0(w4cVar) != null;
    }

    @Override // defpackage.r8f
    public boolean M(w4c w4cVar) {
        G(w4cVar).getClass();
        return false;
    }

    @Override // defpackage.yrd
    public boolean N(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.r8f
    public l26 O() {
        return null;
    }

    @Override // defpackage.r8f
    public v2c P(w4c w4cVar) {
        fo7 fo7Var = fo7.c;
        return new gob(dj6.E((yn7) w4cVar));
    }

    @Override // defpackage.r8f
    public Collection Q(w4c w4cVar) {
        G0(w4cVar);
        throw null;
    }

    @Override // defpackage.r8f
    public xt7 R(xt7 xt7Var) {
        G0(xt7Var);
        throw null;
    }

    @Override // defpackage.r8f
    public void S(w4c w4cVar) {
        w4cVar.getClass();
    }

    @Override // defpackage.r8f
    public int T(k7f k7fVar) {
        k7fVar.getClass();
        if (k7fVar instanceof em7) {
            return xo1.g((em7) k7fVar).size();
        }
        return 0;
    }

    @Override // defpackage.r8f
    public w4c U(xt7 xt7Var) {
        xt7Var.getClass();
        dj5 dj5VarG0 = g0(xt7Var);
        if (dj5VarG0 != null) {
            return h(dj5VarG0);
        }
        w4c w4cVarM0 = m0(xt7Var);
        w4cVarM0.getClass();
        return w4cVarM0;
    }

    public void V(final String str, final l26 l26Var, final boolean z2, final boolean z3, final syf syfVar, final m77 m77Var, boolean z4, l26 l26Var2, final l26 l26Var3, l26 l26Var4, final wne wneVar, xw9 xw9Var, final dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        int i3;
        l26 l26Var5;
        boolean z5;
        boolean z6;
        l26 l26Var6;
        int i4;
        int i5;
        int i6;
        int i7;
        final l26 l26Var7;
        final boolean z7;
        final l26 l26Var8;
        final xw9 xw9Var2;
        xw9 bx9Var;
        l26 l26Var9;
        xw9 xw9Var3;
        dd2 dd2VarB0;
        l46Var.h0(-1732281618);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            l26Var5 = l26Var;
            i3 |= l46Var.i(l26Var5) ? 32 : 16;
        } else {
            l26Var5 = l26Var;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i3 |= l46Var.h(z5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i8 = i & 24576;
        int i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i8 == 0) {
            i3 |= l46Var.g(syfVar) ? 16384 : 8192;
        }
        int i10 = 65536;
        if ((196608 & i) == 0) {
            i3 |= l46Var.g(m77Var) ? 131072 : 65536;
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
            z6 = z4;
        } else {
            z6 = z4;
            if ((i & 1572864) == 0) {
                i3 |= l46Var.h(z6) ? 1048576 : 524288;
            }
        }
        int i12 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i12 != 0) {
            i3 |= 12582912;
            l26Var6 = l26Var2;
        } else {
            l26Var6 = l26Var2;
            if ((i & 12582912) == 0) {
                i3 |= l46Var.i(l26Var6) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            i3 |= l46Var.i(l26Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= l46Var.i(null) ? 536870912 : 268435456;
        }
        if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            i4 = 14155782;
        } else {
            i4 = 14155776 | (l46Var.i(null) ? 4 : 2);
        }
        if ((i2 & 2048) != 0) {
            i5 = i4 | 48;
        } else {
            i5 = i4 | (l46Var.i(null) ? 32 : 16);
        }
        if ((i2 & 4096) != 0) {
            i6 = i5 | 384;
        } else {
            i6 = i5 | (l46Var.i(null) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i13 = i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i13 != 0) {
            i7 = i6 | 3072;
        } else {
            i7 = i6 | (l46Var.i(l26Var4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        if (l46Var.g(wneVar)) {
            i9 = 16384;
        }
        int i14 = i7 | i9;
        if ((i2 & 32768) == 0 && l46Var.g(xw9Var)) {
            i10 = 131072;
        }
        int i15 = i14 | i10;
        if (l46Var.W(i3 & 1, ((i3 & 306783379) == 306783378 && (4793491 & i15) == 4793490) ? false : true)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                if (i11 != 0) {
                    z6 = false;
                }
                if (i12 != 0) {
                    l26Var6 = null;
                }
                l26 l26Var10 = i13 != 0 ? null : l26Var4;
                if ((i2 & 32768) != 0) {
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    i15 &= -458753;
                } else {
                    bx9Var = xw9Var;
                }
                l26Var9 = l26Var10;
                xw9Var3 = bx9Var;
            } else {
                l46Var.Z();
                if ((i2 & 32768) != 0) {
                    i15 &= -458753;
                }
                l26Var9 = l26Var4;
                xw9Var3 = xw9Var;
            }
            l26 l26Var11 = l26Var6;
            l46Var.s();
            boolean z8 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objR = l46Var.R();
            if (z8 || objR == sf2.a) {
                objR = syfVar.a(new k00(str));
                l46Var.p0(objR);
            }
            String str2 = ((w2f) objR).a.b;
            boolean z9 = z6;
            rpe rpeVar = new rpe();
            int i16 = 3;
            if (l26Var11 == null) {
                l46Var.f0(1927058812);
                l46Var.r(false);
                dd2VarB0 = null;
            } else {
                l46Var.f0(1927058813);
                dd2VarB0 = af1.b0(-1459717586, new kt3(i16, l26Var11), l46Var);
                l46Var.r(false);
            }
            int i17 = i3 >> 9;
            int i18 = i15 << 21;
            iec.a(yse.b, str2, l26Var5, rpeVar, dd2VarB0, l26Var3, null, l26Var9, z3, z5, z9, m77Var, xw9Var3, wneVar, dd2Var, l46Var, ((i3 << 3) & 896) | 6 | (i17 & 458752) | (i17 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), ((i3 >> 3) & 57344) | ((i15 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | (i17 & 7168) | (i15 & 458752) | ((i15 << 6) & 3670016) | 12582912);
            l26Var8 = l26Var11;
            l26Var7 = l26Var9;
            z7 = z9;
            xw9Var2 = xw9Var3;
        } else {
            l46Var.Z();
            l26Var7 = l26Var4;
            z7 = z6;
            l26Var8 = l26Var6;
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: xs9
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i | 1);
                    this.a.V(str, l26Var, z2, z3, syfVar, m77Var, z7, l26Var8, l26Var3, l26Var7, wneVar, xw9Var2, dd2Var, (l46) obj, iP, i2);
                    return wef.a;
                }
            };
        }
    }

    @Override // defpackage.r8f
    public fp1 W(vjd vjdVar) {
        if (vjdVar instanceof fp1) {
            return (fp1) vjdVar;
        }
        return null;
    }

    @Override // defpackage.r8f
    public xt7 X(ArrayList arrayList) {
        G0(this);
        throw null;
    }

    @Override // defpackage.r8f
    public d7f Y(xt7 xt7Var) {
        G0(xt7Var);
        throw null;
    }

    @Override // defpackage.r8f
    public d7f Z(ep1 ep1Var) {
        return new eo7(((wo1) ep1Var).a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0155  */
    /* JADX WARN: Code duplicated, block: B:104:0x0176  */
    /* JADX WARN: Code duplicated, block: B:106:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0181  */
    /* JADX WARN: Code duplicated, block: B:109:0x0192  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:119:0x0210  */
    /* JADX WARN: Code duplicated, block: B:122:0x021c  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    public void a(final boolean z2, final boolean z3, final m77 m77Var, j09 j09Var, final wne wneVar, final x4d x4dVar, float f2, float f3, l46 l46Var, final int i, final int i2) {
        int i3;
        j09 j09Var2;
        int i4;
        int i5;
        float f4;
        float f5;
        boolean z4;
        final j09 j09Var3;
        final float f6;
        final float f7;
        ojb ojbVarV;
        j09 j09Var4;
        float f8;
        int i6;
        float f9;
        boolean zBooleanValue;
        long jC;
        t39 t39Var;
        fxd fxdVarZ;
        float f10;
        t39 t39Var2;
        h0e h0eVarI;
        fxd fxdVarZ2;
        h0e h0eVarI2;
        long j;
        float f11;
        int i7;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1035477640);
        if ((i & 6) == 0) {
            i3 = (l46Var2.h(z2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var2.h(z3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var2.g(m77Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var2.g(j09Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (l46Var2.g(wneVar)) {
                i4 = 16384;
            } else {
                i4 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i5 = i3 | i4;
            if ((196608 & i) == 0) {
                if (l46Var2.g(x4dVar)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f4 = f2;
                    int i9 = l46Var2.d(f4) ? 1048576 : 524288;
                    i5 |= i9;
                } else {
                    f4 = f2;
                }
                i5 |= i9;
            } else {
                f4 = f2;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                    f5 = f3;
                    int i10 = l46Var2.d(f5) ? 8388608 : 4194304;
                    i5 |= i10;
                } else {
                    f5 = f3;
                }
                i5 |= i10;
            } else {
                f5 = f3;
            }
            if ((38347923 & i5) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var2.W(i5 & 1, z4)) {
                l46Var2.b0();
                if ((i & 1) != 0 || l46Var2.C()) {
                    if (i8 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                        f8 = 2.0f;
                    } else {
                        f8 = f4;
                    }
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        j09 j09Var5 = j09Var4;
                        i6 = i5 & (-29360129);
                        j09Var3 = j09Var5;
                        f9 = f8;
                        f5 = 1.0f;
                    } else {
                        j09 j09Var6 = j09Var4;
                        i6 = i5;
                        j09Var3 = j09Var6;
                        f9 = f8;
                    }
                } else {
                    l46Var2.Z();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                        i5 &= -29360129;
                    }
                    i6 = i5;
                    j09Var3 = j09Var2;
                    f9 = f4;
                }
                l46Var2.s();
                zBooleanValue = ((Boolean) z7f.w(m77Var, l46Var2, (i6 >> 6) & 14).getValue()).booleanValue();
                jC = wneVar.c(z2, z3, zBooleanValue);
                t39Var = t39.d;
                fxdVarZ = vpf.Z(t39Var, l46Var2);
                if (z2) {
                    l46Var2.f0(-1674507999);
                    t39Var2 = t39Var;
                    f10 = f5;
                    h0eVarI = qkd.a(jC, fxdVarZ, null, l46Var2, 0, 12);
                    l46Var2.r(false);
                } else {
                    f10 = f5;
                    t39Var2 = t39Var;
                    l46Var2.f0(-1674427244);
                    h0eVarI = q1c.i(new y72(jC), l46Var2);
                    l46Var2.r(false);
                }
                h0e h0eVar = h0eVarI;
                fxdVarZ2 = vpf.Z(t39.b, l46Var2);
                if (z2) {
                    l46Var2.f0(-1674245832);
                    if (zBooleanValue) {
                        f11 = f9;
                    } else {
                        f11 = f10;
                    }
                    h0eVarI2 = vx.a(f11, fxdVarZ2, null, l46Var, 0, 12);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1674063769);
                    h0eVarI2 = q1c.i(new yi4(f10), l46Var2);
                    l46Var2.r(false);
                }
                e89 e89VarI = q1c.i(x57.b(((y72) h0eVar.getValue()).a, ((yi4) h0eVarI2.getValue()).a), l46Var2);
                if (!z2) {
                    j = wneVar.g;
                } else if (z3) {
                    j = wneVar.h;
                } else if (
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v3 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 553
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qk6.a(boolean, boolean, m77, j09, wne, x4d, float, float, l46, int, int):void");
            }

            @Override // defpackage.r8f
            public boolean a0(w4c w4cVar, w4c w4cVar2) {
                w4cVar.getClass();
                w4cVar2.getClass();
                return false;
            }

            @Override // defpackage.r8f
            public boolean b(e8f e8fVar, k7f k7fVar) {
                G0(e8fVar);
                throw null;
            }

            @Override // defpackage.r8f
            public e8f b0(k7f k7fVar, int i) {
                Object obj = xo1.g((em7) k7fVar).get(i);
                obj.getClass();
                return (ao7) obj;
            }

            @Override // defpackage.bc2
            public Object c(hbc hbcVar) {
                Object objR = hbcVar.r(new y3b(l58.class, Executor.class));
                objR.getClass();
                return t72.z((Executor) objR);
            }

            @Override // defpackage.r8f
            public boolean c0(k7f k7fVar, k7f k7fVar2) {
                k7fVar.getClass();
                k7fVar2.getClass();
                return k7fVar.equals(k7fVar2);
            }

            @Override // defpackage.z0g
            public WebViewProviderBoundaryInterface createWebView(WebView webView) {
                throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
            }

            @Override // defpackage.z0g
            public String[] d() {
                return F0;
            }

            @Override // defpackage.r8f
            public boolean d0(w4c w4cVar) {
                w4c w4cVarM0 = m0(w4cVar);
                fp1 fp1Var = null;
                if (w4cVarM0 != null) {
                    vjd vjdVarA0 = A0(w4cVarM0);
                    if (vjdVarA0 instanceof fp1) {
                        fp1Var = (fp1) vjdVarA0;
                    }
                }
                return fp1Var != null;
            }

            @Override // defpackage.mm0
            public int e() {
                return 1;
            }

            @Override // defpackage.r8f
            public boolean e0(xt7 xt7Var) {
                xt7Var.getClass();
                return false;
            }

            @Override // defpackage.r8f
            public w4c g(w4c w4cVar) {
                return ((j2) w4cVar).C(false);
            }

            @Override // defpackage.r8f
            public dj5 g0(xt7 xt7Var) {
                xt7Var.getClass();
                if (!(xt7Var instanceof j2) || ((j2) xt7Var).y() == null) {
                    return null;
                }
                return (dj5) xt7Var;
            }

            @Override // defpackage.z0g
            public StaticsBoundaryInterface getStatics() {
                throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
            }

            @Override // defpackage.r8f
            public w4c h(dj5 dj5Var) {
                j2 j2VarF = ((j2) dj5Var).F();
                j2VarF.getClass();
                return j2VarF;
            }

            public lv3 h0(w4c w4cVar) {
                w4cVar.getClass();
                if ((w4cVar instanceof j2) && ((j2) w4cVar).m()) {
                    return (lv3) w4cVar;
                }
                return null;
            }

            @Override // defpackage.n21
            public Rect i(Activity activity) throws Exception {
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    objInvoke.getClass();
                    return new Rect((Rect) objInvoke);
                } catch (Exception e2) {
                    if (!(e2 instanceof NoSuchFieldException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException)) {
                        throw e2;
                    }
                    n21.i.getClass();
                    b1.m(e2, m21.b);
                    return hj6.e.i(activity);
                }
            }

            @Override // defpackage.r8f
            public k7f i0(xt7 xt7Var) {
                xt7Var.getClass();
                w4c w4cVarM0 = m0(xt7Var);
                if (w4cVarM0 == null) {
                    w4cVarM0 = C(xt7Var);
                }
                return G(w4cVarM0);
            }

            @Override // defpackage.r8f
            public w4c j(dj5 dj5Var) {
                j2 j2VarY = ((j2) dj5Var).y();
                j2VarY.getClass();
                return j2VarY;
            }

            @Override // defpackage.r8f
            public boolean j0(k7f k7fVar) {
                return false;
            }

            @Override // defpackage.wea
            public boolean k(u09 u09Var, r04 r04Var) {
                u09Var.getClass();
                return !r04Var.getAnnotations().E(xea.a);
            }

            @Override // defpackage.r8f
            public w4c k0(w4c w4cVar) {
                List listA;
                int i;
                yn7 yn7Var = (yn7) w4cVar;
                um7 um7VarB = yn7Var.B();
                em7 em7Var = um7VarB instanceof em7 ? (em7) um7VarB : null;
                if (em7Var != null && ((listA = yn7Var.A()) == null || !listA.isEmpty())) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        io7 io7Var = ((do7) it.next()).a;
                        io7 io7Var2 = io7.a;
                        if (io7Var != io7Var2) {
                            List listG = xo1.g(em7Var);
                            if (listG.size() != listA.size()) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList(t72.u(listA, 10));
                            Iterator it2 = listA.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                do7 do7VarB0 = (do7) it2.next();
                                io7 io7Var3 = do7VarB0.a;
                                if (io7Var3 != io7Var2) {
                                    yn7 yn7Var2 = do7VarB0.b;
                                    if (io7Var3 != io7.b) {
                                        yn7Var2 = null;
                                    }
                                    do7 do7Var = do7.c;
                                    do7VarB0 = db6.b0(new vo1(yn7Var2, new wo1(do7VarB0), false));
                                }
                                arrayList.add(do7VarB0);
                            }
                            fo7 fo7Var = fo7.c;
                            List listG2 = xo1.g(em7Var);
                            if (listG2.size() != arrayList.size()) {
                                StringBuilder sb = new StringBuilder("Params vs args count mismatch (");
                                sb.append(listG2.size());
                                sb.append(" != ");
                                sb.append(arrayList.size());
                                sb.append(") for class '");
                                sb.append(em7Var);
                                qc0.m(sb, "' with args: ", s72.D0(arrayList, null, null, null, null, 63));
                                break;
                            }
                            fo7 fo7VarA = listG2.isEmpty() ? fo7.c.a(false) : new fo7(bm8.W(s72.r1(listG2, arrayList)), false);
                            int size = listA.size();
                            for (i = 0; i < size; i++) {
                                do7 do7Var2 = (do7) listA.get(i);
                                if (do7Var2.a != io7Var2) {
                                    List upperBounds = ((ao7) listG.get(i)).getUpperBounds();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = upperBounds.iterator();
                                    while (it3.hasNext()) {
                                        yn7 yn7Var3 = fo7VarA.b((yn7) it3.next(), io7Var2).b;
                                        yn7Var3.getClass();
                                        arrayList2.add(yn7Var3);
                                    }
                                    if (do7Var2.a == io7.c) {
                                        yn7 yn7Var4 = do7Var2.b;
                                        yn7Var4.getClass();
                                        arrayList2.add(yn7Var4);
                                    }
                                    yn7 yn7Var5 = ((do7) arrayList.get(i)).b;
                                    yn7Var5.getClass();
                                    ((vo1) yn7Var5).c.b = arrayList2;
                                }
                            }
                            boolean zO = yn7Var.o();
                            List annotations = yn7Var.getAnnotations();
                            boolean z2 = yn7Var instanceof j2;
                            j2 j2Var = z2 ? (j2) yn7Var : null;
                            yn7 yn7VarD = j2Var != null ? j2Var.d() : null;
                            j2 j2Var2 = z2 ? (j2) yn7Var : null;
                            return new ljd(em7Var, arrayList, zO, annotations, yn7VarD, false, false, false, j2Var2 != null ? j2Var2.f() : null, null);
                        }
                    }
                }
                return null;
            }

            @Override // defpackage.r8f
            public int l(xt7 xt7Var) {
                xt7Var.getClass();
                return ((yn7) xt7Var).A().size();
            }

            @Override // defpackage.pkf
            public boolean l0() {
                return false;
            }

            @Override // defpackage.r8f
            public boolean m(fp1 fp1Var) {
                return false;
            }

            @Override // defpackage.r8f
            public w4c m0(xt7 xt7Var) {
                xt7Var.getClass();
                if (g0(xt7Var) != null) {
                    return null;
                }
                return (w4c) xt7Var;
            }

            @Override // defpackage.r8f
            public boolean n(d7f d7fVar) {
                d7fVar.getClass();
                do7 do7Var = ((eo7) d7fVar).a;
                do7 do7Var2 = do7.c;
                return pa7.t(do7Var, do7.c);
            }

            @Override // defpackage.r8f
            public fp1 n0(w4c w4cVar) {
                vjd vjdVarA0 = A0(w4cVar);
                if (vjdVarA0 instanceof fp1) {
                    return (fp1) vjdVarA0;
                }
                return null;
            }

            @Override // defpackage.r8f
            public int o(c7f c7fVar) {
                c7fVar.getClass();
                if (c7fVar instanceof w4c) {
                    return l((xt7) c7fVar);
                }
                if (c7fVar instanceof pc0) {
                    return ((pc0) c7fVar).size();
                }
                StringBuilder sb = new StringBuilder("unknown type argument list type: ");
                sb.append(c7fVar);
                cva.r(sb, job.a.b(c7fVar.getClass()));
                return 0;
            }

            @Override // defpackage.r8f
            public boolean o0(k7f k7fVar) {
                return k7fVar.equals(job.a.b(Object.class));
            }

            @Override // defpackage.r8f
            public x8f p(d7f d7fVar) {
                d7fVar.getClass();
                io7 io7Var = ((eo7) d7fVar).a.a;
                x8f x8fVar = x8f.OUT;
                if (io7Var == null) {
                    return x8fVar;
                }
                int iOrdinal = io7Var.ordinal();
                if (iOrdinal == 0) {
                    return x8f.INV;
                }
                if (iOrdinal == 1) {
                    return x8f.IN;
                }
                if (iOrdinal == 2) {
                    return x8fVar;
                }
                ap.c();
                return null;
            }

            @Override // defpackage.r8f
            public boolean p0(fp1 fp1Var) {
                return false;
            }

            @Override // defpackage.m23
            public Iterable q(Object obj) {
                switch (this.a) {
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        int i = qz3.a;
                        Collection collectionL = ((xrf) obj).l();
                        ArrayList arrayList = new ArrayList(t72.u(collectionL, 10));
                        Iterator it = ((ArrayList) collectionL).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((xrf) it.next()).a());
                        }
                        return arrayList;
                    default:
                        int i2 = ky7.p;
                        Collection collectionE = ((u09) obj).h().e();
                        collectionE.getClass();
                        return new sd0(2, fyc.y(new td0(1, collectionE), tj7.H0));
                }
            }

            @Override // defpackage.r8f
            public boolean q0(k7f k7fVar) {
                k7fVar.getClass();
                return k7fVar.equals(ah9.b);
            }

            @Override // defpackage.r8f
            public void r(xt7 xt7Var) {
                xt7Var.getClass();
            }

            @Override // defpackage.r8f
            public xt7 s(d7f d7fVar) {
                d7fVar.getClass();
                return (xt7) ((eo7) d7fVar).a.b;
            }

            @Override // defpackage.r8f
            public d7f s0(c7f c7fVar, int i) {
                c7fVar.getClass();
                if (c7fVar instanceof vjd) {
                    return u0((xt7) c7fVar, i);
                }
                if (c7fVar instanceof pc0) {
                    E e2 = ((pc0) c7fVar).get(i);
                    e2.getClass();
                    return (d7f) e2;
                }
                StringBuilder sb = new StringBuilder("unknown type argument list type: ");
                sb.append(c7fVar);
                cva.r(sb, job.a.b(c7fVar.getClass()));
                return null;
            }

            @Override // defpackage.r8f
            public boolean t(k7f k7fVar) {
                return false;
            }

            @Override // defpackage.r8f
            public boolean t0(k7f k7fVar) {
                d09 d09Var;
                if (!(k7fVar instanceof nm7)) {
                    return false;
                }
                nm7 nm7Var = (nm7) k7fVar;
                Class cls = nm7Var.b;
                hq7 hq7VarU = nm7Var.U();
                if (hq7VarU == null || (d09Var = (d09) si0.b.M(si0.a[7], hq7VarU)) == null) {
                    if (cls.isAnnotation() || cls.isEnum()) {
                        d09Var = d09.FINAL;
                    } else if (pa7.t(cgg.H(cls), Boolean.TRUE)) {
                        d09Var = d09.SEALED;
                    } else if (Modifier.isAbstract(cls.getModifiers())) {
                        d09Var = d09.ABSTRACT;
                    } else {
                        d09Var = !Modifier.isFinal(cls.getModifiers()) ? d09.OPEN : d09.FINAL;
                    }
                }
                return (d09Var != d09.FINAL || nm7Var.S() == k22.ENUM_CLASS || nm7Var.S() == k22.ENUM_ENTRY || nm7Var.S() == k22.ANNOTATION_CLASS) ? false : true;
            }

            public String toString() {
                switch (this.a) {
                    case 22:
                        return "NeverEqualPolicy";
                    default:
                        return super.toString();
                }
            }

            @Override // defpackage.r8f
            public ep1 u(fp1 fp1Var) {
                return ((vo1) fp1Var).c;
            }

            @Override // defpackage.r8f
            public d7f u0(xt7 xt7Var, int i) {
                xt7Var.getClass();
                return new eo7((do7) ((yn7) xt7Var).A().get(i));
            }

            @Override // defpackage.cu2
            public Object v(Object obj) {
                return obj.toString();
            }

            @Override // defpackage.r8f
            public boolean w(k7f k7fVar) {
                return k7fVar instanceof em7;
            }

            @Override // defpackage.r8f
            public boolean x(w4c w4cVar) {
                w4cVar.getClass();
                if (!q0(i0(w4cVar))) {
                    return false;
                }
                G0(w4cVar);
                throw null;
            }

            @Override // defpackage.r8f
            public boolean x0(xt7 xt7Var) {
                xt7Var.getClass();
                return !pa7.t(G(C(xt7Var)), G(U(xt7Var)));
            }

            @Override // defpackage.r8f
            public boolean y(w4c w4cVar) {
                w4cVar.getClass();
                k7f k7fVarG = G(w4cVar);
                k7fVarG.getClass();
                return k7fVarG instanceof em7;
            }

            @Override // defpackage.r8f
            public d7f z(w4c w4cVar, int i) {
                if (i < 0 || i >= l(w4cVar)) {
                    return null;
                }
                return u0(w4cVar, i);
            }

            @Override // defpackage.r8f
            public boolean z0(xt7 xt7Var) {
                xt7Var.getClass();
                return ((yn7) xt7Var).o();
            }

            @Override // defpackage.r8f
            public void f0(w4c w4cVar) {
            }

            @Override // defpackage.r8f
            public void B0(w4c w4cVar, k7f k7fVar) {
            }
        }
