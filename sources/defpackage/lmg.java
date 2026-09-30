package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lmg implements ev4, ag2 {
    public static final kaf k;
    public static final kaf l;
    public static final kaf m;
    public static final kaf n;
    public static final kaf o;
    public static final kaf p;
    public static final kaf q;
    public static final e97 r;
    public static final e97 s;
    public static final e97 t;
    public static final e97 u;
    public static final dd2 a = new dd2(new ym0(16), false, -1131826196);
    public static final dd2 b = new dd2(new md2(25), false, 782775783);
    public static final dd2 c = new dd2(new md2(26), false, 414988604);
    public static final dd2 d = new dd2(new xd2(2), false, -1888464069);
    public static final dd2 e = new dd2(new xd2(3), false, 1742379516);
    public static final dd2 f = new dd2(new xd2(4), false, 993353828);
    public static final dd2 g = new dd2(new md2(27), false, 1960651157);
    public static final dd2 h = new dd2(new md2(28), false, 101515079);
    public static final dd2 i = new dd2(new xd2(5), false, -1597756567);
    public static final dd2 j = new dd2(new de2(10), false, -1468652220);
    public static final xn7[] v = new xn7[0];
    public static final StackTraceElement[] w = new StackTraceElement[0];

    static {
        boolean z = true;
        k = new kaf(z, 5);
        l = new kaf(z, 1);
        boolean z2 = false;
        m = new kaf(z2, 3);
        n = new kaf(z, 2);
        o = new kaf(z, 4);
        p = new kaf(z, 6);
        q = new kaf(z2, 7);
        r = new e97(z, 2);
        s = new e97(z, 3);
        t = new e97(z, 0);
        u = new e97(z, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v13 b28
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void F(final defpackage.zse r67, defpackage.a26 r68, defpackage.j09 r69, final defpackage.mue r70, final defpackage.syf r71, defpackage.a26 r72, defpackage.t69 r73, defpackage.dtd r74, final boolean r75, final int r76, final int r77, defpackage.rx6 r78, defpackage.uo7 r79, boolean r80, final defpackage.dd2 r81, defpackage.l46 r82, int r83, int r84) {
        /*
            Method dump skipped, instruction units count: 2451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmg.F(zse, a26, j09, mue, syf, a26, t69, dtd, boolean, int, int, rx6, uo7, boolean, dd2, l46, int, int):void");
    }

    public static final void G(j09 j09Var, cre creVar, dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(2036174316);
        int i3 = (l46Var.g(j09Var) ? 4 : 2) | i2 | (l46Var.i(creVar) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            xn8 xn8VarC = s21.c(ndb.b, true);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            ynb.e(creVar, dd2Var, l46Var, (i3 >> 3) & 126);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, j09Var, creVar, dd2Var, 15);
        }
    }

    public static final void H(final j09 j09Var, final float f2, final int i2, final float f3, final float f4, long j2, l46 l46Var, final int i3) {
        int i4;
        int i5 = i2;
        final long j3 = j2;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var.h0(-594342337);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.d(f2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.e(i5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.d(f3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var.d(f4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var.f(j3) ? 131072 : 65536;
        }
        if (l46Var.W(i4 & 1, (74899 & i4) != 74898)) {
            l46Var.b0();
            if ((i3 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            long jB = y72.b(j3, 0.2f);
            j09 j09VarQ = b.q(0.0f, 200.0f, j09Var, 1);
            t7c t7cVarA = s7c.a(new uc0(f4, true, new qc0(0)), ndb.y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarQ);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, t7cVarA);
            dec.l(he2Var3, l46Var, u8aVarM);
            dec.l(he2Var2, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(he2Var, l46Var, j09VarJ);
            l46Var.f0(-569456749);
            int i6 = 0;
            while (i6 < i5) {
                float fN = mh3.n(f2 - i6, 0.0f, 1.0f);
                j09 j09VarO = tm7.o(oa7.E(b.d(new jw7(1.0f, true), f3), eze.a(l46Var).a.a), jB, eze.a(l46Var).a.a);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int i7 = i6;
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarO);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, xn8VarC);
                dec.l(he2Var3, l46Var, u8aVarM2);
                dec.l(he2Var2, l46Var, Integer.valueOf(iHashCode2));
                dec.k(l46Var);
                dec.l(he2Var, l46Var, j09VarJ2);
                if (fN > 0.0f) {
                    l46Var.f0(1064160274);
                    s21.a(tm7.o(b.d(b.c(g09.a, fN), f3), j2, eze.a(l46Var).a.a), l46Var, 0);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1064374577);
                    l46Var.r(false);
                }
                l46Var.r(true);
                i5 = i2;
                i6 = i7 + 1;
            }
            j3 = j2;
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: wb6
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lmg.H(j09Var, f2, i2, f3, f4, j3, (l46) obj, k99.P(i3 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void I(j09 j09Var, final int i2, final int i3, float f2, float f3, long j2, l46 l46Var, final int i4, final int i5) {
        int i6;
        long j3;
        final j09 j09Var2;
        final float f4;
        final long j4;
        final float f5;
        float f6;
        long j5;
        j09 j09Var3;
        float f7;
        l46Var.h0(879546770);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (l46Var.g(j09Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= l46Var.e(i3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i8 = i6 | 27648;
        if ((196608 & i4) == 0) {
            if ((i5 & 32) == 0) {
                j3 = j2;
                int i9 = l46Var.f(j3) ? 131072 : 65536;
                i8 |= i9;
            } else {
                j3 = j2;
            }
            i8 |= i9;
        } else {
            j3 = j2;
        }
        if (l46Var.W(i8 & 1, (74899 & i8) != 74898)) {
            l46Var.b0();
            if ((i4 & 1) == 0 || l46Var.C()) {
                if (i7 != 0) {
                    j09Var = g09.a;
                }
                if ((i5 & 32) != 0) {
                    j3 = ((m82) l46Var.k(o82.a)).a;
                    i8 &= -458753;
                }
                long j6 = j3;
                f6 = 4.0f;
                j5 = j6;
                j09Var3 = j09Var;
                f7 = 6.0f;
            } else {
                l46Var.Z();
                if ((i5 & 32) != 0) {
                    i8 &= -458753;
                }
                j09Var3 = j09Var;
                j5 = j3;
                f6 = f2;
                f7 = f3;
            }
            l46Var.s();
            H(j09Var3, i2, i3, f6, f7, j5, l46Var, 524174 & i8);
            j09Var2 = j09Var3;
            j4 = j5;
            f4 = f7;
            f5 = f6;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            f4 = f3;
            j4 = j3;
            f5 = f2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: vb6
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lmg.I(j09Var2, i2, i3, f5, f4, j4, (l46) obj, k99.P(i4 | 1), i5);
                    return wef.a;
                }
            };
        }
    }

    public static final void J(j09 j09Var, dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(-446525577);
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarH = k8b.h(j09Var, new ie2(23), l46Var, 6);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarH);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (k8b.e((e8b) l46Var.k(l8b.a))) {
                l46Var.f0(553099493);
                feg.j(od4.A(R.drawable.bg_onboarding_gradient, 0, l46Var), null, b.c, null, an2.a, 0.0f, null, l46Var, 25016, 104);
                l46Var.r(false);
            } else {
                l46Var.f0(553314757);
                l46Var.r(false);
            }
            tec.q(6, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eu8(j09Var, dd2Var, i2, i3);
        }
    }

    public static final void K(int i2, x16 x16Var, x16 x16Var2, a26 a26Var, l46 l46Var) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(180242373);
        int i3 = i2 | (l46Var.i(a26Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            jx4 jx4Var = (jx4) z5c.G(job.a.b(jx4.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            FillElement fillElement = b.c;
            feg.j(od4.A(R.drawable.bg_personality, 0, l46Var), null, fillElement, null, an2.g, 0.0f, null, l46Var, 25016, 104);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, g09Var);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            y7h.g(null, null, null, 0L, x16Var, x16Var2, l46Var, (i3 << 9) & 516096, 15);
            bzd.l(fillElement, ((Boolean) jx4Var.c.getValue()).booleanValue(), 0L, null, ndb.f, af1.b0(-456741627, new s19(7, jx4Var, a26Var), l46Var), l46Var, 1597446, 44);
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, a26Var, x16Var, x16Var2, 24);
        }
    }

    public static final void L(cre creVar, boolean z, l46 l46Var, int i2) {
        tte tteVarD;
        l46Var.h0(626339208);
        int i3 = (l46Var.i(creVar) ? 4 : 2) | i2 | (l46Var.h(z) ? 32 : 16);
        int i4 = 0;
        if (!l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            l46Var.Z();
        } else if (z) {
            l46Var.f0(1530097388);
            r38 r38Var = creVar.d;
            ste steVar = null;
            if (r38Var != null && (tteVarD = r38Var.d()) != null) {
                ste steVar2 = tteVarD.a;
                r38 r38Var2 = creVar.d;
                if (!(r38Var2 != null ? r38Var2.p : true)) {
                    steVar = steVar2;
                }
            }
            if (steVar == null) {
                l46Var.f0(1530097387);
                l46Var.r(false);
            } else {
                l46Var.f0(1530097388);
                if (eue.d(creVar.l().b)) {
                    l46Var.f0(2110860558);
                    l46Var.r(false);
                } else {
                    l46Var.f0(2109807302);
                    int iV = creVar.b.v((int) (creVar.l().b >> 32));
                    int iV2 = creVar.b.v((int) (creVar.l().b & 4294967295L));
                    txb txbVarA = steVar.a(iV);
                    txb txbVarA2 = steVar.a(Math.max(iV2 - 1, 0));
                    r38 r38Var3 = creVar.d;
                    if (r38Var3 == null || !((Boolean) r38Var3.m.getValue()).booleanValue()) {
                        l46Var.f0(2110490542);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(2110225306);
                        aic.b(true, txbVarA, creVar, l46Var, ((i3 << 6) & 896) | 6);
                        l46Var.r(false);
                    }
                    r38 r38Var4 = creVar.d;
                    if (r38Var4 == null || !((Boolean) r38Var4.n.getValue()).booleanValue()) {
                        l46Var.f0(2110838734);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(2110574459);
                        aic.b(false, txbVarA2, creVar, l46Var, ((i3 << 6) & 896) | 6);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                }
                r38 r38Var5 = creVar.d;
                if (r38Var5 != null) {
                    vz9 vz9Var = r38Var5.l;
                    if (!pa7.t(creVar.t.a.b, creVar.l().a.b)) {
                        vz9Var.setValue(Boolean.FALSE);
                    }
                    if (r38Var5.b()) {
                        if (((Boolean) vz9Var.getValue()).booleanValue()) {
                            creVar.s();
                        } else {
                            creVar.m();
                        }
                    }
                }
                l46Var.r(false);
            }
            l46Var.r(false);
        } else {
            l46Var.f0(1989076778);
            l46Var.r(false);
            creVar.m();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new nu2(i2, i4, creVar, z);
        }
    }

    public static final void M(cre creVar, l46 l46Var, int i2) {
        k00 k00VarK;
        l46Var.h0(-1436003720);
        int i3 = (l46Var.i(creVar) ? 4 : 2) | i2;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            r38 r38Var = creVar.d;
            if (r38Var == null || !((Boolean) r38Var.o.getValue()).booleanValue() || (k00VarK = creVar.k()) == null || k00VarK.b.length() <= 0) {
                l46Var.f0(-2111042550);
                l46Var.r(false);
            } else {
                l46Var.f0(-2112351432);
                boolean zG = l46Var.g(creVar);
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (zG || objR == i8cVar) {
                    objR = new uqe(creVar);
                    l46Var.p0(objR);
                }
                qne qneVar = (qne) objR;
                sw3 sw3Var = (sw3) l46Var.k(zg2.h);
                sl9 sl9Var = creVar.b;
                long j2 = creVar.l().b;
                int i5 = eue.c;
                int iV = sl9Var.v((int) (j2 >> 32));
                r38 r38Var2 = creVar.d;
                tte tteVarD = r38Var2 != null ? r38Var2.d() : null;
                tteVarD.getClass();
                ste steVar = tteVarD.a;
                hkb hkbVarC = steVar.c(mh3.o(iV, 0, steVar.a.a.b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((sw3Var.p0(2.0f) / 2.0f) + hkbVarC.a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(hkbVarC.d)));
                boolean zF = l46Var.f(jFloatToRawIntBits);
                Object objR2 = l46Var.R();
                if (zF || objR2 == i8cVar) {
                    objR2 = new yu2(jFloatToRawIntBits);
                    l46Var.p0(objR2);
                }
                ul9 ul9Var = (ul9) objR2;
                boolean zI = l46Var.i(qneVar) | l46Var.i(creVar);
                Object objR3 = l46Var.R();
                if (zI || objR3 == i8cVar) {
                    objR3 = new u42(i4, qneVar, creVar);
                    l46Var.p0(objR3);
                }
                j09 j09VarA = ibe.a(g09.a, qneVar, (PointerInputEventHandler) objR3);
                boolean zF2 = l46Var.f(jFloatToRawIntBits);
                Object objR4 = l46Var.R();
                if (zF2 || objR4 == i8cVar) {
                    objR4 = new ac(jFloatToRawIntBits, 3);
                    l46Var.p0(objR4);
                }
                fr.a(ul9Var, vwc.b(j09VarA, false, (a26) objR4), 0L, l46Var, 0, 4);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i1(creVar, i2, 11);
        }
    }

    public static final i94 N(i94 i94Var, i94 i94Var2, uvc uvcVar, long j2, uuc uucVar) {
        if (uucVar == null) {
            return hcc.l(i94Var, i94Var2);
        }
        int iCompare = uvcVar.g.compare(Long.valueOf(uucVar.c), Long.valueOf(j2));
        if (iCompare < 0) {
            return i94.a;
        }
        return iCompare > 0 ? i94.c : i94.b;
    }

    public static final pa1 O(za2 za2Var, String str) {
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            za2Var.E(new ks2(3, la1Var, za2Var));
            la1Var.a = str;
            return pa1Var;
        } catch (Exception e2) {
            pa1Var.a(e2);
            return pa1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object P(nu3 nu3Var, long j2, zn2 zn2Var) {
        lv2 lv2Var;
        if (zn2Var instanceof lv2) {
            lv2Var = (lv2) zn2Var;
            int i2 = lv2Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lv2Var.label = i2 - Integer.MIN_VALUE;
            } else {
                lv2Var = new lv2(zn2Var);
            }
        } else {
            lv2Var = new lv2(zn2Var);
        }
        Object objS = lv2Var.result;
        int i3 = lv2Var.label;
        if (i3 == 0) {
            jzb.q(objS);
            mv2 mv2Var = new mv2(nu3Var, null);
            lv2Var.label = 1;
            objS = rs0.S(j2, mv2Var, lv2Var);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objS);
        }
        return Boolean.valueOf(objS != null);
    }

    public static String Q(a71 a71Var, a71[] a71VarArr, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int iE = a71Var.e();
        int i6 = 0;
        while (i6 < iE) {
            int i7 = (i6 + iE) / 2;
            while (i7 > -1 && a71Var.k(i7) != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (a71Var.k(i3) == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i4 = 46;
                    z = false;
                } else {
                    byte bK = a71VarArr[i11].k(i12);
                    byte[] bArr = ieg.a;
                    int i14 = bK & 255;
                    z = z2;
                    i4 = i14;
                }
                byte bK2 = a71Var.k(i8 + i13);
                byte[] bArr2 = ieg.a;
                i5 = i4 - (bK2 & 255);
                if (i5 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (a71VarArr[i11].e() != i12) {
                    z2 = z;
                } else {
                    if (i11 == a71VarArr.length - 1) {
                        break;
                    }
                    i11++;
                    i12 = -1;
                    z2 = true;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i15 = i10 - i13;
                    int iE2 = a71VarArr[i11].e() - i12;
                    int length = a71VarArr.length;
                    for (int i16 = i11 + 1; i16 < length; i16++) {
                        iE2 += a71VarArr[i16].e();
                    }
                    if (iE2 >= i15) {
                        if (iE2 <= i15) {
                            return a71Var.q(i8, i10 + i8).p(ox1.a);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            iE = i7;
        }
        return null;
    }

    public static final float R(ph3 ph3Var, float f2, float f3) {
        pj5 pj5Var = ((qh3) ph3Var).a;
        xz xzVar = new xz(0.0f);
        int iB = xzVar.b();
        int i2 = 0;
        while (i2 < iB) {
            xzVar.e(i2, pj5Var.n(i2 == 0 ? f2 : 0.0f, i2 == 0 ? f3 : 0.0f));
            i2++;
        }
        return xzVar.a;
    }

    public static final void S(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            r3.i(ks0.k("index: ", i2, ", size: ", i3));
        }
    }

    public static final void T(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            r3.i(ks0.k("index: ", i2, ", size: ", i3));
        }
    }

    public static final void U(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            r3.g(i4, ib8.n(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            qc0.j(ks0.k("fromIndex: ", i2, " > toIndex: ", i3));
        }
    }

    public static final Object V(xn2 xn2Var, xj5 xj5Var, x16 x16Var, n26 n26Var, wj5[] wj5VarArr) throws Throwable {
        i92 i92Var = new i92(null, xj5Var, x16Var, n26Var, wj5VarArr);
        zj5 zj5Var = new zj5(xn2Var, xn2Var.getContext());
        Object objC = gcc.C(zj5Var, true, zj5Var, i92Var);
        return objC == bw2.a ? objC : wef.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c78 W(ms7 ms7Var, List list, wq7 wq7Var, List list2, g8f g8fVar, boolean z) {
        list.getClass();
        list2.getClass();
        g8fVar.getClass();
        c78 c78VarW = t72.w();
        if (z) {
            Object objS = ms7Var.s();
            if (objS instanceof nm7) {
                if (ynb.R(ms7Var)) {
                    if (((nm7) objS).j()) {
                        Class<?> declaringClass = af1.R((em7) objS).getDeclaringClass();
                        declaringClass.getClass();
                        c78VarW.add(new v57(ms7Var, job.a.b(declaringClass)));
                    }
                } else if (!(ms7Var instanceof kt7) || !cgg.G((bob) ms7Var)) {
                    StringBuilder sb = new StringBuilder("Only top-level callables are supported for now: ");
                    sb.append(objS);
                    String name = ms7Var.getName();
                    sb.append('/');
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c78VarW.add(new ys7(ms7Var, (ar7) it.next(), c78VarW.c(), on7.b, g8fVar));
            }
            if (wq7Var != null) {
                String strB = sud.d.b();
                strB.getClass();
                ar7 ar7Var = new ar7(0, strB);
                ar7Var.c = wq7Var;
                c78VarW.add(new ys7(ms7Var, ar7Var, c78VarW.c(), on7.c, g8fVar));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c78VarW.add(new ys7(ms7Var, (ar7) it2.next(), c78VarW.c(), on7.d, g8fVar));
        }
        return c78VarW.n();
    }

    public static final boolean X(lj4 lj4Var, long j2) {
        if (!lj4Var.a.Y) {
            return false;
        }
        c47 c47Var = (c47) vd0.s0(lj4Var).V0.d;
        if (!c47Var.t1.Y) {
            return false;
        }
        long jN = c47Var.N(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN & 4294967295L));
        long j3 = lj4Var.G0;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final long Y(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        int i2 = inputStream.read(bArr);
        long j2 = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j2 += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j2;
    }

    public static dr8 Z(String str, List list) {
        cr8 cr8Var;
        cqd cqdVar = new cqd();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cr8Var = cr8.b;
            if (!zHasNext) {
                break;
            }
            dr8 dr8Var = (dr8) it.next();
            if (dr8Var != cr8Var) {
                if (dr8Var instanceof sv1) {
                    dr8[] dr8VarArr = ((sv1) dr8Var).c;
                    dr8VarArr.getClass();
                    List listAsList = Arrays.asList(dr8VarArr);
                    listAsList.getClass();
                    cqdVar.addAll(listAsList);
                } else {
                    cqdVar.add(dr8Var);
                }
            }
        }
        int i2 = cqdVar.a;
        if (i2 != 0) {
            return i2 != 1 ? new sv1(str, (dr8[]) cqdVar.toArray(new dr8[0])) : (dr8) cqdVar.get(0);
        }
        return cr8Var;
    }

    public static final zp5 a0(Context context) {
        return new zp5(new bs(context, 0), new cs(Build.VERSION.SDK_INT >= 31 ? br5.a.a(context) : 0));
    }

    public static final void b0(b59 b59Var, vl1 vl1Var, b41 b41Var, float f2, o4d o4dVar, mne mneVar, un4 un4Var) {
        vl1Var.g();
        ArrayList arrayList = b59Var.h;
        if (arrayList.size() <= 1 || (b41Var instanceof dtd)) {
            c0(b59Var, vl1Var, b41Var, f2, o4dVar, mneVar, un4Var);
        } else {
            if (!(b41Var instanceof l4d)) {
                ap.c();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                tt ttVar = ((oy9) arrayList.get(i2)).a;
                f3 += ttVar.f;
                fMax = Math.max(fMax, ttVar.c());
            }
            Shader shaderC = ((l4d) b41Var).c((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                tt ttVar2 = ((oy9) arrayList.get(i3)).a;
                ttVar2.f(vl1Var, new c41(shaderC), f2, o4dVar, mneVar, un4Var);
                vl1Var.n(0.0f, ttVar2.f);
                matrix.setTranslate(0.0f, -ttVar2.f);
                shaderC.setLocalMatrix(matrix);
            }
        }
        vl1Var.o();
    }

    public static final void c0(b59 b59Var, vl1 vl1Var, b41 b41Var, float f2, o4d o4dVar, mne mneVar, un4 un4Var) {
        ArrayList arrayList = b59Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oy9 oy9Var = (oy9) arrayList.get(i2);
            oy9Var.a.f(vl1Var, b41Var, f2, o4dVar, mneVar, un4Var);
            vl1Var.n(0.0f, oy9Var.a.f);
        }
    }

    public static final void f0(r38 r38Var) {
        jte jteVar = r38Var.e;
        if (jteVar != null) {
            r38Var.v.d(zse.a((zse) r38Var.d.b, null, 0L, 3));
            gte gteVar = jteVar.a;
            AtomicReference atomicReference = gteVar.b;
            while (!atomicReference.compareAndSet(jteVar, null)) {
                if (atomicReference.get() != jteVar) {
                }
            }
            gteVar.a.c();
        }
        r38Var.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [da9] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static final k75 g0(da9 da9Var, ka9 ka9Var, TarotSkinIdentify tarotSkinIdentify, l46 l46Var, int i2) {
        ewf ewfVarG;
        boolean z = (((i2 & 896) ^ 384) > 256 && l46Var.e(tarotSkinIdentify.ordinal())) || (i2 & 384) == 256;
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (z || objR == i8cVar) {
            objR = new uo2(17, tarotSkinIdentify);
            l46Var.p0(objR);
        }
        x16 x16Var = (x16) objR;
        l46Var.f0(-1133765112);
        ?? r1 = da9Var;
        ya9 ya9Var = r1.b.c;
        Object objD = null;
        String str = ya9Var != null ? (String) ya9Var.b.f : null;
        if (str == null) {
            l46Var.f0(-373403315);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            ewfVarG = z5c.G(job.a.b(k75.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var);
            l46Var.r(false);
        } else {
            l46Var.f0(1373427154);
            l46Var.r(false);
            boolean zI = l46Var.i(ka9Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                uj3 uj3Var = new uj3(1, ka9Var, ka9.class, "getBackStackEntry", "getBackStackEntry(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", 0, 11);
                l46Var.p0(uj3Var);
                objR2 = uj3Var;
            }
            a26 a26Var = (a26) ((ym7) objR2);
            a26Var.getClass();
            try {
                objD = a26Var.d(str);
            } catch (IllegalArgumentException unused) {
            }
            if (objD != null) {
                r1 = objD;
            }
            da9 da9Var2 = (da9) r1;
            ewfVarG = z5c.G(job.a.b(k75.class), da9Var2.g(), null, b21.r(da9Var2), kr7.b(l46Var), x16Var);
        }
        l46Var.r(false);
        return (k75) ewfVarG;
    }

    public static qh3 h0(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return new qh3(new ij5(f2, 0.1f));
    }

    public static final int i0(long j2, ste steVar) {
        int i2 = (int) (4294967295L & j2);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        b59 b59Var = steVar.b;
        return fIntBitsToFloat >= b59Var.e ? steVar.a.a.b.length() : b59Var.g(j2);
    }

    public static final cv6 j0(int i2, l46 l46Var) {
        Resources resources = (Resources) l46Var.k(uq.c);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new TypedValue();
            l46Var.p0(objR);
        }
        TypedValue typedValue = (TypedValue) objR;
        resources.getValue(i2, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean zG = l46Var.g(charSequence.toString());
        Object objR2 = l46Var.R();
        if (zG || objR2 == i8cVar) {
            Drawable drawable = resources.getDrawable(i2, null);
            drawable.getClass();
            objR2 = new ks(((BitmapDrawable) drawable).getBitmap());
            l46Var.p0(objR2);
        }
        return (cv6) objR2;
    }

    public static final boolean k0(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean l0(wxa wxaVar) {
        wxaVar.getClass();
        return wxaVar.b() == null;
    }

    public static fob m0(ea1 ea1Var, x16 x16Var) {
        if (x16Var != null) {
            return new fob(ea1Var, x16Var);
        }
        qc0.j("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    public static final void n0(r38 r38Var, zse zseVar, sl9 sl9Var) {
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            tte tteVarD = r38Var.d();
            if (tteVarD == null) {
                return;
            }
            jte jteVar = r38Var.e;
            if (jteVar == null) {
                return;
            }
            bv7 bv7VarC = r38Var.c();
            if (bv7VarC == null) {
                return;
            }
            dec.j(zseVar, r38Var.a, tteVarD.a, bv7VarC, jteVar, r38Var.b(), sl9Var);
        } finally {
            iqf.p(irdVarJ, irdVarL, a26VarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o0(nu3 nu3Var, ya2 ya2Var) {
        nu3Var.getClass();
        ya2Var.getClass();
        ((rg7) nu3Var).E(new ks2(2, nu3Var, ya2Var));
    }

    public static final byte[] p0(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(UserMetadata.MAX_INTERNAL_KEY_SIZE, inputStream.available()));
        Y(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final void q0(gte gteVar, r38 r38Var, zse zseVar, rx6 rx6Var, sl9 sl9Var) {
        fz3 fz3Var = r38Var.d;
        ou2 ou2Var = r38Var.v;
        ou2 ou2Var2 = r38Var.w;
        mmb mmbVar = new mmb();
        bv9 bv9Var = new bv9(fz3Var, ou2Var, mmbVar, 16);
        gga ggaVar = gteVar.a;
        ggaVar.h(zseVar, rx6Var, bv9Var, ou2Var2);
        jte jteVar = new jte(gteVar, ggaVar);
        gteVar.b.set(jteVar);
        mmbVar.element = jteVar;
        r38Var.e = jteVar;
        n0(r38Var, zseVar, sl9Var);
    }

    public static final CharSequence r0(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? v4e.l0(charSequence, 4999) : v4e.l0(charSequence, 5000);
    }

    public static hmg s0() {
        ClassLoader classLoader = lmg.class.getClassLoader();
        if (hmg.class.equals(hmg.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new lmg[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e3) {
                    Logger.getLogger(gmg.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(hmg.class.getSimpleName()), (Throwable) e3);
                }
            }
            if (arrayList.size() == 1) {
                return (hmg) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (hmg) hmg.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    @Override // defpackage.ag2
    public void A(nyc nycVar, int i2, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        d0(nycVar, i2);
        if (xn7Var.e().c()) {
            h(xn7Var, obj);
        } else if (obj == null) {
            f();
        } else {
            h(xn7Var, obj);
        }
    }

    @Override // defpackage.ev4
    public void B(long j2) {
        e0(Long.valueOf(j2));
    }

    @Override // defpackage.ag2
    public ev4 C(dua duaVar, int i2) {
        d0(duaVar, i2);
        return n(duaVar.i(i2));
    }

    @Override // defpackage.ev4
    public void D(String str) {
        str.getClass();
        e0(str);
    }

    @Override // defpackage.ag2
    public void E(nyc nycVar, int i2, float f2) {
        nycVar.getClass();
        d0(nycVar, i2);
        q(f2);
    }

    @Override // defpackage.ag2
    public void b(nyc nycVar) {
        nycVar.getClass();
    }

    @Override // defpackage.ev4
    public ag2 c(nyc nycVar) {
        nycVar.getClass();
        return this;
    }

    public void d0(nyc nycVar, int i2) {
        nycVar.getClass();
    }

    @Override // defpackage.ag2
    public void e(dua duaVar, int i2, double d2) {
        d0(duaVar, i2);
        i(d2);
    }

    public void e0(Object obj) {
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        kob kobVar = job.a;
        sb.append(kobVar.b(cls));
        sb.append(" is not supported by ");
        sb.append(kobVar.b(getClass()));
        sb.append(" encoder");
        throw new yyc(sb.toString());
    }

    @Override // defpackage.ev4
    public void f() {
        throw new yyc("'null' is not supported by default");
    }

    @Override // defpackage.ev4
    public void i(double d2) {
        e0(Double.valueOf(d2));
    }

    @Override // defpackage.ev4
    public void j(short s2) {
        e0(Short.valueOf(s2));
    }

    @Override // defpackage.ag2
    public void k(nyc nycVar, int i2, long j2) {
        nycVar.getClass();
        d0(nycVar, i2);
        B(j2);
    }

    @Override // defpackage.ev4
    public void l(byte b2) {
        e0(Byte.valueOf(b2));
    }

    @Override // defpackage.ev4
    public void m(boolean z) {
        e0(Boolean.valueOf(z));
    }

    @Override // defpackage.ev4
    public ev4 n(nyc nycVar) {
        nycVar.getClass();
        return this;
    }

    @Override // defpackage.ag2
    public void o(nyc nycVar, int i2, boolean z) {
        nycVar.getClass();
        d0(nycVar, i2);
        m(z);
    }

    @Override // defpackage.ag2
    public void p(nyc nycVar, int i2, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        d0(nycVar, i2);
        h(xn7Var, obj);
    }

    @Override // defpackage.ev4
    public void q(float f2) {
        e0(Float.valueOf(f2));
    }

    @Override // defpackage.ag2
    public void r(dua duaVar, int i2, byte b2) {
        d0(duaVar, i2);
        l(b2);
    }

    @Override // defpackage.ev4
    public void s(char c2) {
        e0(Character.valueOf(c2));
    }

    @Override // defpackage.ev4
    public void t(nyc nycVar, int i2) {
        nycVar.getClass();
        e0(Integer.valueOf(i2));
    }

    @Override // defpackage.ag2
    public void u(dua duaVar, int i2, short s2) {
        d0(duaVar, i2);
        j(s2);
    }

    @Override // defpackage.ag2
    public void v(int i2, int i3, nyc nycVar) {
        nycVar.getClass();
        d0(nycVar, i2);
        y(i3);
    }

    @Override // defpackage.ag2
    public void w(nyc nycVar, int i2, String str) {
        nycVar.getClass();
        str.getClass();
        d0(nycVar, i2);
        D(str);
    }

    @Override // defpackage.ag2
    public void x(dua duaVar, int i2, char c2) {
        d0(duaVar, i2);
        s(c2);
    }

    @Override // defpackage.ev4
    public void y(int i2) {
        e0(Integer.valueOf(i2));
    }
}
