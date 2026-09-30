package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.data.quickdecision.QuickDecisionAnswer;
import ai.askquin.model.TarotSkinIdentify;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Matrix;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.WeekFields;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq {
    public static final dd2 e;
    public static final qu g;
    public static Constructor j;
    public static Method k;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final dd2 b = new dd2(new ym0(29), false, 176445399);
    public static final dd2 c = new dd2(new xd2(12), false, -1722260168);
    public static final dd2 d = new dd2(new xd2(13), false, 1022516026);
    public static final ww2 f = new ww2(19);
    public static final n82 h = n82.z;
    public static final n82 i = n82.Y;

    static {
        int i2 = 16;
        e = new dd2(new de2(i2), false, -1006623687);
        g = new qu(i2);
    }

    public static final hr7 A(ComponentCallbacks componentCallbacks) {
        if (componentCallbacks instanceof lr7) {
            return lr7.j();
        }
        hr7 hr7Var = af8.Z;
        if (hr7Var != null) {
            return hr7Var;
        }
        qc0.p("KoinApplication has not been started");
        return null;
    }

    public static final YearMonth B(LocalDate localDate) {
        localDate.getClass();
        YearMonth yearMonthOf = YearMonth.of(localDate.getYear(), localDate.getMonth());
        yearMonthOf.getClass();
        return yearMonthOf;
    }

    public static final void C(pv2 pv2Var, Throwable th) {
        if (th instanceof y94) {
            th = ((y94) th).getCause();
        }
        try {
            tv2 tv2Var = (tv2) pv2Var.F0(qk6.w);
            if (tv2Var != null) {
                tv2Var.G(pv2Var, th);
            } else {
                vfh.w(pv2Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                bzd.m(runtimeException, th);
                th = runtimeException;
            }
            vfh.w(pv2Var, th);
        }
    }

    public static Object D(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = j;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            j = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static final ta4 E(dg7 dg7Var, boolean z, hg7 hg7Var) {
        if (dg7Var instanceof rg7) {
            return ((rg7) dg7Var).P(z, hg7Var);
        }
        return dg7Var.h0(hg7Var.m(), z, new uj3(1, hg7Var, hg7.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 28));
    }

    public static final boolean F(pv2 pv2Var) {
        dg7 dg7Var = (dg7) pv2Var.F0(ndb.Y0);
        if (dg7Var != null) {
            return dg7Var.b();
        }
        return true;
    }

    public static boolean G(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static ArrayList H(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final boolean I(j4a j4aVar, int i2) {
        ale.a.getClass();
        int iK = pzd.k(i2);
        lm4 lm4Var = j4aVar.c;
        p9b p9bVarB = lm4.b(((eab) j4aVar.a).b(), iK);
        QuotaBlockReason quotaBlockReason = QuotaBlockReason.DailyLimit;
        o9b o9bVar = p9bVarB instanceof o9b ? (o9b) p9bVarB : null;
        return (o9bVar != null ? o9bVar.a : null) == quotaBlockReason;
    }

    public static final void J(float[] fArr, float[] fArr2) {
        float fU = u(0, 0, fArr2, fArr);
        float fU2 = u(0, 1, fArr2, fArr);
        float fU3 = u(0, 2, fArr2, fArr);
        float fU4 = u(0, 3, fArr2, fArr);
        float fU5 = u(1, 0, fArr2, fArr);
        float fU6 = u(1, 1, fArr2, fArr);
        float fU7 = u(1, 2, fArr2, fArr);
        float fU8 = u(1, 3, fArr2, fArr);
        float fU9 = u(2, 0, fArr2, fArr);
        float fU10 = u(2, 1, fArr2, fArr);
        float fU11 = u(2, 2, fArr2, fArr);
        float fU12 = u(2, 3, fArr2, fArr);
        float fU13 = u(3, 0, fArr2, fArr);
        float fU14 = u(3, 1, fArr2, fArr);
        float fU15 = u(3, 2, fArr2, fArr);
        float fU16 = u(3, 3, fArr2, fArr);
        fArr[0] = fU;
        fArr[1] = fU2;
        fArr[2] = fU3;
        fArr[3] = fU4;
        fArr[4] = fU5;
        fArr[5] = fU6;
        fArr[6] = fU7;
        fArr[7] = fU8;
        fArr[8] = fU9;
        fArr[9] = fU10;
        fArr[10] = fU11;
        fArr[11] = fU12;
        fArr[12] = fU13;
        fArr[13] = fU14;
        fArr[14] = fU15;
        fArr[15] = fU16;
    }

    public static final void K(float[] fArr, float f2, float f3, float[] fArr2) {
        zm8.d(fArr2);
        zm8.f(fArr2, f2, f3);
        J(fArr, fArr2);
    }

    public static List L(List list) {
        if (list instanceof jy6) {
            return ((jy6) list).w();
        }
        if (list instanceof i98) {
            return ((i98) list).a;
        }
        return list instanceof RandomAccess ? new g98(list) : new i98(list);
    }

    public static final j09 M(l46 l46Var, j09 j09Var) {
        long jC;
        long j2;
        boolean zS = g21.S(l46Var);
        if (zS) {
            l46Var.f0(111008827);
            jC = ((e8b) l46Var.k(l8b.a)).f;
            l46Var.r(false);
        } else {
            l46Var.f0(111007865);
            l46Var.r(false);
            jC = abg.c(268435455);
        }
        if (zS) {
            l46Var.f0(111011548);
            j2 = ((e8b) l46Var.k(l8b.a)).B;
        } else {
            l46Var.f0(111010709);
            j2 = ((e8b) l46Var.k(l8b.a)).m;
        }
        l46Var.r(false);
        y6c y6cVarB = a7c.b(we6.e(l46Var) ? 8.0f : 20.0f);
        return db6.w(tm7.o(b.c(j09Var, 1.0f), jC, y6cVarB), 0.5f, j2, y6cVarB);
    }

    public static final void N(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final void O(em7 em7Var, String str) {
        String string;
        em7Var.getClass();
        String str2 = "in the polymorphic scope of '" + em7Var.r() + '\'';
        if (str == null) {
            string = ks0.g('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbO = ib8.o("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            ub3.v(sbO, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbO.append(em7Var.r());
            sbO.append("' has to be sealed and '@Serializable'.");
            string = sbO.toString();
        }
        throw new yyc(string);
    }

    public static AbstractList P(List list, i26 i26Var) {
        return list instanceof RandomAccess ? new k98(list, i26Var) : new l98(list, i26Var);
    }

    public static void Q(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            Q((View) parent, fArr, fArr2, iArr);
            K(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            K(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            K(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            K(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        hkg.M0(matrix, fArr2);
        J(fArr, fArr2);
    }

    public static final void a(j09 j09Var, o4c o4cVar, n26 n26Var, l46 l46Var, int i2, int i3) {
        int i4;
        n26Var.getClass();
        l46Var.h0(1819794447);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= l46Var.g(o4cVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.i(n26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                j09Var = g09.a;
            }
            if (i6 != 0) {
                o4cVar = null;
            }
            zr5.c(af1.b0(234074522, new x6(o4cVar, j09Var, n26Var, 6), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        o4c o4cVar2 = o4cVar;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(j09Var2, o4cVar2, n26Var, i2, i3, 2);
        }
    }

    public static final void b(QuickDecisionAnswer quickDecisionAnswer, TarotCardChoice tarotCardChoice, l26 l26Var, l46 l46Var, int i2) {
        TarotCardChoice tarotCardChoice2;
        tt1 tt1Var;
        tt1 tt1Var2;
        j09 j09VarA;
        l46 l46Var2 = l46Var;
        l46Var2.h0(766354132);
        int i3 = i2 | (l46Var2.e(quickDecisionAnswer.ordinal()) ? 4 : 2) | (l46Var2.g(tarotCardChoice) ? 32 : 16) | (l46Var2.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            qhe qheVarR = q7c.r(tarotCardChoice);
            TarotSkinIdentify tarotSkinIdentify = ((die) l46Var2.k(snd.a)).a;
            float f2 = we6.e(l46Var2) ? 8.0f : 12.0f;
            x4d x4dVarB = a7c.b(f2);
            if (we6.e(l46Var2)) {
                x4dVarB = g21.f;
            }
            x4d x4dVar = x4dVarB;
            boolean zBooleanValue = ((Boolean) l46Var2.k(h57.a)).booleanValue();
            if (zBooleanValue) {
                l46Var2.f0(-1589622647);
                l46Var2.r(false);
                tt1Var = null;
            } else {
                l46Var2.f0(2026932603);
                tt1Var = (tt1) l46Var2.k(vt1.a);
                l46Var2.r(false);
            }
            g09 g09Var = g09.a;
            if (zBooleanValue) {
                l46Var2.f0(2026933980);
                l46Var2.r(false);
                tt1Var2 = tt1Var;
                j09VarA = g09Var;
            } else {
                l46Var2.f0(2026934907);
                tt1Var2 = tt1Var;
                j09VarA = vt1.a(g09Var, tarotCardChoice.getCard().getCardKey(), new yi4(f2), l46Var2, 6, 6);
                l46Var2.r(false);
            }
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            j09 j09Var = j09VarA;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            float f3 = f2;
            nte.b(quickDecisionAnswer.name(), null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, new mue(0L, w6c.l(42), ar5.w, null, cr5.b(), w6c.k(-0.42d), 0L, 0, 0, w6c.l(42), null, null, 16645977), l46Var, 0, 0, 130042);
            j09 j09VarD = rrb.q(dj6.w(b.p(g09Var, 168.0f), tarotSkinIdentify.getAspectRatio()), 12.0f, x4dVar, y72.b(((m82) l46Var.k(o82.a)).a, 0.3f), 0L, 20).D(j09Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            int i5 = i3 & 112;
            tt1 tt1Var3 = tt1Var2;
            boolean zE = l46Var.e(tarotSkinIdentify.ordinal()) | (i5 == 32) | l46Var.g(tt1Var3) | ((i3 & 896) == 256);
            Object objR2 = l46Var.R();
            if (zE || objR2 == i8cVar) {
                jr jrVar = new jr(tt1Var3, tarotCardChoice, tarotSkinIdentify, l26Var, 28);
                tarotCardChoice2 = tarotCardChoice;
                l46Var.p0(jrVar);
                objR2 = jrVar;
            } else {
                tarotCardChoice2 = tarotCardChoice;
            }
            j09 j09VarB = androidx.compose.foundation.b.b(j09VarD, t69Var, null, false, null, (x16) objR2, 28);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarB);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            o7c.d(b.c, qheVarR, tarotSkinIdentify, false, null, f3, null, false, l46Var, 6, 216);
            l46Var2 = l46Var;
            l46Var2.r(true);
            cgg.c(null, tarotCardChoice2, l46Var2, i5, 1);
            l46Var2.r(true);
        } else {
            tarotCardChoice2 = tarotCardChoice;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, quickDecisionAnswer, tarotCardChoice2, l26Var, 27);
        }
    }

    public static final void c(j09 j09Var, x16 x16Var, boolean z, boolean z2, x16 x16Var2, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        x16 x16Var3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        x16Var2.getClass();
        l46Var.h0(-366225452);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i2 | 48;
            x16Var3 = x16Var;
        } else {
            x16Var3 = x16Var;
            i4 = (l46Var.i(x16Var3) ? 32 : 16) | i2;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i4 | 384;
            z3 = z;
        } else {
            z3 = z;
            i5 = i4 | (l46Var.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i6 = i5 | 3072;
            z4 = z2;
        } else {
            z4 = z2;
            i6 = i5 | (l46Var.h(z4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
        if ((i2 & 24576) == 0) {
            i6 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i6 & 1, (74899 & i6) != 74898)) {
            x16 x16Var4 = i7 != 0 ? null : x16Var3;
            boolean z7 = i8 != 0 ? true : z3;
            boolean z8 = i9 != 0 ? true : z4;
            v70.a(dd2Var, mh3.W(j09Var), af1.b0(-489069573, new ek3(z7, x16Var2, z8), l46Var), af1.b0(-175763484, new ie2(x16Var4), l46Var), 0.0f, null, fdc.v(y72.j, 0L, 0L, ((m82) l46Var.k(o82.a)).o, l46Var, 46), l46Var, 3462, 176);
            z6 = z8;
            z5 = z7;
            x16Var3 = x16Var4;
        } else {
            l46Var.Z();
            z5 = z3;
            z6 = z4;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb0(j09Var, x16Var3, z5, z6, x16Var2, dd2Var, i2, i3);
        }
    }

    public static fg7 d() {
        return new fg7(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final List list, final jie jieVar, List list2, final float f2, final float f3, fy9 fy9Var, l46 l46Var, int i2) throws Throwable {
        fy9 fy9Var2;
        List list3;
        l46 l46Var2;
        ojb ojbVarV;
        xu7 xu7Var;
        Object obj;
        int i3;
        Throwable th;
        l46 l46Var3 = l46Var;
        list.getClass();
        jieVar.getClass();
        vz9 vz9Var = jieVar.d;
        sz9 sz9Var = jieVar.e;
        list2.getClass();
        l46Var3.h0(-939432469);
        int i4 = 4;
        int i5 = (l46Var3.g(list) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i5 |= l46Var3.g(jieVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= (i2 & 512) == 0 ? l46Var3.g(list2) : l46Var3.i(list2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i6 = 16384;
        int i7 = i5 | (l46Var3.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var3.d(f3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if ((196608 & i2) == 0) {
            fy9Var2 = fy9Var;
            i7 |= l46Var3.i(fy9Var2) ? 131072 : 65536;
        } else {
            fy9Var2 = fy9Var;
        }
        int i8 = 1;
        if (l46Var3.W(i7 & 1, (74899 & i7) != 74898)) {
            final fgd fgdVar = (fgd) s72.x0(list);
            if (fgdVar == null) {
                ojbVarV = l46Var3.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    xu7Var = new xu7(list, jieVar, list2, f2, f3, fy9Var2, i2, 0);
                }
            } else {
                list3 = list2;
                Throwable th2 = null;
                final float fB = snd.b(null, l46Var3, 1);
                final int i9 = 0;
                for (Object obj2 : jieVar.b()) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        Throwable th3 = th2;
                        t72.Z();
                        throw th3;
                    }
                    int iIntValue = ((Number) obj2).intValue();
                    l46Var3.d0(1074576716, Integer.valueOf(iIntValue));
                    final cle cleVar = (cle) list3.get(iIntValue);
                    int i11 = ((kie) vz9Var.getValue()) != kie.a ? i8 : 0;
                    int size = ((kie) vz9Var.getValue()) == kie.c ? i9 < sz9Var.j() ? (jieVar.b().size() + i9) - sz9Var.j() : i9 - sz9Var.j() : i9;
                    int i12 = (i9 == list.size() - i8 || (i11 != 0 && i9 == sz9Var.j() - i8)) ? i8 : 0;
                    int size2 = list.size();
                    float f4 = cleVar.d;
                    j09 j09VarP = b.p(fdc.w(g09.a, size), 72.0f);
                    boolean zE = ((57344 & i7) == i6) | l46Var3.e(i9) | ((i7 & 14) == i4) | ((i7 & 112) == 32) | l46Var3.d(fB) | ((i7 & 7168) == 2048) | l46Var3.i(cleVar) | l46Var3.g(fgdVar);
                    Object objR = l46Var3.R();
                    if (zE || objR == sf2.a) {
                        i3 = i7;
                        th = null;
                        obj = new a26() { // from class: yu7
                            /* JADX WARN: Code duplicated, block: B:12:0x0088  */
                            /* JADX WARN: Code duplicated, block: B:14:0x008c  */
                            /* JADX WARN: Code duplicated, block: B:16:0x0093 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:17:0x0095  */
                            /* JADX WARN: Code duplicated, block: B:19:0x0099  */
                            /* JADX WARN: Code duplicated, block: B:22:0x009f  */
                            /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
                            /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
                            /* JADX WARN: Code duplicated, block: B:30:0x00be  */
                            /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
                            /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
                            /* JADX WARN: Code duplicated, block: B:36:0x010b  */
                            /* JADX WARN: Code duplicated, block: B:37:0x0111 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:39:0x0116  */
                            /* JADX WARN: Code duplicated, block: B:42:0x0120  */
                            @Override // defpackage.a26
                            public final Object d(Object obj3) {
                                int i13;
                                float f5;
                                boolean z;
                                boolean z2;
                                kie kieVar;
                                float f6;
                                float f7;
                                float radians;
                                float f8;
                                float f9;
                                float fCos;
                                float f10;
                                int i14;
                                gie gieVar;
                                g0c g0cVar = (g0c) obj3;
                                g0cVar.getClass();
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (g0cVar.G0 >> 32));
                                float f11 = f3;
                                float f12 = fIntBitsToFloat * f11;
                                int size3 = list.size();
                                jie jieVar2 = jieVar;
                                int iJ = jieVar2.e.j();
                                kie kieVar2 = (kie) jieVar2.d.getValue();
                                float fFloatValue = ((Number) jieVar2.b.e()).floatValue();
                                float fJ = jieVar2.f.j();
                                float f13 = f12 / fB;
                                float density = g0cVar.I0.getDensity() * 20.0f;
                                cle cleVar2 = cleVar;
                                float density2 = g0cVar.I0.getDensity() * cleVar2.a;
                                float density3 = g0cVar.I0.getDensity() * cleVar2.b;
                                float f14 = cleVar2.c;
                                kieVar2.getClass();
                                int i15 = i9;
                                float f15 = f2;
                                float fCos2 = ((-i15) * f15) + density3;
                                int i16 = size3 - 1;
                                if (i15 != i16) {
                                    i13 = size3;
                                    if (i15 != iJ - 1) {
                                        f5 = f14;
                                    }
                                    if (kieVar2 == kie.a) {
                                        if (i15 == i16) {
                                            f14 = 0.0f;
                                        }
                                        gieVar = new gie(density2, fCos2, f14);
                                    } else {
                                        if (i15 >= iJ) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        z2 = z;
                                        kieVar = kie.b;
                                        if (kieVar2 == kieVar) {
                                            f6 = fFloatValue;
                                        } else {
                                            f6 = 1.0f;
                                        }
                                        if (z2) {
                                            f7 = fJ * f6;
                                        } else {
                                            f7 = 0.0f;
                                        }
                                        radians = (float) Math.toRadians(f7);
                                        f8 = (-iJ) * f15;
                                        f9 = fCos2 - f8;
                                        if (z2) {
                                            double d2 = radians;
                                            fCos = ((((float) Math.cos(d2)) * density2) + ((0.55f * f12) * f6)) - (((float) Math.sin(d2)) * f9);
                                        } else {
                                            fCos = density2 - (density * f6);
                                        }
                                        if (z2) {
                                            float f16 = f8 - ((0.3f * f13) * f6);
                                            double d3 = radians;
                                            fCos2 = (f9 * ((float) Math.cos(d3))) + (((float) Math.sin(d3)) * density2) + f16;
                                        }
                                        f10 = f5 + f7;
                                        if (kieVar2 == kieVar) {
                                            gieVar = new gie(fCos, fCos2, f10);
                                        } else {
                                            if (!z2) {
                                                i15 += i13;
                                            }
                                            i14 = i15 - iJ;
                                            float f17 = ((-i14) * f15) + density3;
                                            if (i14 == i16) {
                                                f14 = 0.0f;
                                            }
                                            gieVar = new gie(ks0.a(fCos, density2, fFloatValue, density2), ks0.a(fCos2, f17, fFloatValue, f17), ks0.a(f10, f14, fFloatValue, f14));
                                        }
                                    }
                                    fgd fgdVar2 = fgdVar;
                                    g0cVar.E(fgdVar2.a + gieVar.a);
                                    g0cVar.G(fgdVar2.b + gieVar.b);
                                    g0cVar.p(gieVar.c);
                                    g0cVar.q(f11);
                                    g0cVar.r(f11);
                                    return wef.a;
                                }
                                i13 = size3;
                                f5 = 0.0f;
                                if (kieVar2 == kie.a) {
                                    if (i15 == i16) {
                                        f14 = 0.0f;
                                    }
                                    gieVar = new gie(density2, fCos2, f14);
                                } else {
                                    if (i15 >= iJ) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    z2 = z;
                                    kieVar = kie.b;
                                    if (kieVar2 == kieVar) {
                                        f6 = fFloatValue;
                                    } else {
                                        f6 = 1.0f;
                                    }
                                    if (z2) {
                                        f7 = fJ * f6;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    radians = (float) Math.toRadians(f7);
                                    f8 = (-iJ) * f15;
                                    f9 = fCos2 - f8;
                                    if (z2) {
                                        double d4 = radians;
                                        fCos = ((((float) Math.cos(d4)) * density2) + ((0.55f * f12) * f6)) - (((float) Math.sin(d4)) * f9);
                                    } else {
                                        fCos = density2 - (density * f6);
                                    }
                                    if (z2) {
                                        float f18 = f8 - ((0.3f * f13) * f6);
                                        double d5 = radians;
                                        fCos2 = (f9 * ((float) Math.cos(d5))) + (((float) Math.sin(d5)) * density2) + f18;
                                    }
                                    f10 = f5 + f7;
                                    if (kieVar2 == kieVar) {
                                        gieVar = new gie(fCos, fCos2, f10);
                                    } else {
                                        if (!z2) {
                                            i15 += i13;
                                        }
                                        i14 = i15 - iJ;
                                        float f19 = ((-i14) * f15) + density3;
                                        if (i14 == i16) {
                                            f14 = 0.0f;
                                        }
                                        gieVar = new gie(ks0.a(fCos, density2, fFloatValue, density2), ks0.a(fCos2, f19, fFloatValue, f19), ks0.a(f10, f14, fFloatValue, f14));
                                    }
                                }
                                fgd fgdVar3 = fgdVar;
                                g0cVar.E(fgdVar3.a + gieVar.a);
                                g0cVar.G(fgdVar3.b + gieVar.b);
                                g0cVar.p(gieVar.c);
                                g0cVar.q(f11);
                                g0cVar.r(f11);
                                return wef.a;
                            }
                        };
                        l46Var3.p0(obj);
                    } else {
                        i3 = i7;
                        obj = objR;
                        th = null;
                    }
                    l46 l46Var4 = l46Var3;
                    z8c.b(size, size2, fy9Var, bzd.x(j09VarP, (a26) obj), Integer.valueOf(iIntValue), 0.0f, i12, Float.valueOf(f4), l46Var4, ((i3 >> 9) & 896) | 512, 32);
                    l46Var4.r(false);
                    l46Var3 = l46Var4;
                    i7 = i3;
                    i9 = i10;
                    i6 = 16384;
                    th2 = th;
                    fgdVar = fgdVar;
                    fB = fB;
                    i4 = 4;
                    i8 = 1;
                }
                l46Var2 = l46Var3;
            }
            ojbVarV.d = xu7Var;
        }
        list3 = list2;
        l46Var2 = l46Var3;
        l46Var2.Z();
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            xu7Var = new xu7(list, jieVar, list3, f2, f3, fy9Var, i2, 1);
            ojbVarV.d = xu7Var;
        }
    }

    public static final void f(da9 da9Var, qcc qccVar, dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(233973821);
        if ((((l46Var.i(da9Var) ? 4 : 2) | i2 | (l46Var.i(qccVar) ? 32 : 16)) & 147) == 146 && l46Var.F()) {
            l46Var.Z();
        } else {
            mh3.b(new e1b[]{qd8.a.a(da9Var), cb8.a.a(da9Var), hb8.a.a(da9Var)}, af1.b0(1808964477, new fw0(10, qccVar, dd2Var), l46Var), l46Var, 56);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, da9Var, qccVar, dd2Var, 20);
        }
    }

    public static final void g(int i2, x16 x16Var, l46 l46Var, j09 j09Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(243541777);
        int i3 = i2 | (l46Var.g(j09Var) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            j09 j09VarC = b.c(j09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.quick_decision_deeper_hint, l46Var2);
            mue mueVar = pue.a;
            mue mueVarG = pue.g(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarG, l46Var2, 0, 0, 131066);
            x4d x4dVarF = we6.f(a7c.b(20.0f), l46Var2);
            j09 j09VarO = tm7.o(oa7.E(g09.a, x4dVarF), we6.c(eze.a(l46Var2).b.z(l46Var2), ((e8b) l46Var2.k(pr4Var)).i, l46Var2), x4dVarF);
            q11 q11VarA = we6.a(null, l46Var2, 1);
            j09 j09VarA0 = ynb.a0(androidx.compose.foundation.b.c(db6.x(j09VarO, q11VarA.a, q11VarA.b, x4dVarF), false, null, null, x16Var, 15), 32.0f, 12.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarA0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            nte.b(afc.q(R.string.quick_decision_new_reading, l46Var2), null, we6.c(eze.a(l46Var2).b.A(l46Var2), ((e8b) l46Var2.k(pr4Var)).j, l46Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var2), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var, x16Var, i2, 6);
        }
    }

    public static final void h(u6b u6bVar, dba dbaVar, x16 x16Var, l26 l26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(1769958681);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(u6bVar) : l46Var.i(u6bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(dbaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(l26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            xdc.a(b.c, af1.b0(915029461, new wf8(11, dbaVar), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-437946326, new j41(u6bVar, x16Var, l26Var, 17), l46Var), l46Var, 805306422, 508);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb((Object) u6bVar, (Object) dbaVar, x16Var, (Object) l26Var, i2, 14);
        }
    }

    public static final void i(long j2, String str, dba dbaVar, ro2 ro2Var, l26 l26Var, l46 l46Var, int i2) {
        l26Var.getClass();
        l46Var.h0(-2105930502);
        int i3 = i2 | (l46Var.f(j2) ? 4 : 2) | (l46Var.g(str) ? 32 : 16) | (l46Var.i(dbaVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(ro2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(l26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            w6b w6bVar = (w6b) z5c.G(job.a.b(w6b.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarT = tm7.t(w6bVar.e, l46Var);
            Long lValueOf = Long.valueOf(j2);
            boolean zI = l46Var.i(w6bVar) | ((i3 & 14) == 4);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                objR = new q6b(w6bVar, j2, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, lValueOf);
            boolean z = (i3 & 112) == 32;
            Object objR2 = l46Var.R();
            if (z || objR2 == obj) {
                objR2 = new bt5(str, 27);
                l46Var.p0(objR2);
            }
            dec.b("page_view", (a26) objR2, l46Var, 6);
            u6b u6bVar = (u6b) e89VarT.getValue();
            boolean z2 = (i3 & 7168) == 2048;
            Object objR3 = l46Var.R();
            if (z2 || objR3 == obj) {
                objR3 = new hla(4, ro2Var);
                l46Var.p0(objR3);
            }
            h(u6bVar, dbaVar, (x16) objR3, l26Var, l46Var, (i3 >> 3) & 7280);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ln6(j2, str, dbaVar, ro2Var, l26Var, i2);
        }
    }

    public static final void j(int i2, l46 l46Var, j09 j09Var, String str, String str2) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1737951129);
        int i3 = i2 | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16) | 384;
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            mue mueVar = pue.a;
            nte.b(str, b.c(g09Var, 1.0f), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.b(), 0L, null, 0, 0L, null, null, 16777183), l46Var2, (i3 & 14) | 48, 0, 130040);
            nte.b(str2, null, 0L, 0L, null, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).k, l46Var2, (i3 >> 3) & 14, 48, 129022);
            l46Var2 = l46Var2;
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ke0(i2, str, str2, j09Var2, 3);
        }
    }

    public static final void k(qcc qccVar, dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(832919318);
        int i3 = 4;
        int i4 = (l46Var.i(qccVar) ? 4 : 2) | i2 | (l46Var.i(dd2Var) ? 32 : 16);
        if ((i4 & 19) == 18 && l46Var.F()) {
            l46Var.Z();
        } else {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new d59(i3);
                l46Var.p0(objR);
            }
            a26 a26Var = (a26) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            kob kobVar = job.a;
            em7 em7VarB = kobVar.b(gs0.class);
            oz1 oz1Var = new oz1(1);
            oz1Var.b(kobVar.b(gs0.class), a26Var);
            gs0 gs0Var = (gs0) fbc.m(em7VarB, pwfVarA, oz1Var.c(), pwfVarA instanceof lh6 ? ((lh6) pwfVarA).e() : ey2.b, l46Var);
            gs0Var.c = new g5b(qccVar);
            qccVar.b(gs0Var.b, dd2Var, l46Var, ((i4 << 6) & 896) | (i4 & 112));
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(qccVar, dd2Var, i2, 12);
        }
    }

    public static final void l(t6b t6bVar, xw9 xw9Var, x16 x16Var, l26 l26Var, l46 l46Var, int i2) {
        Object next;
        l46Var.h0(816925201);
        int i3 = i2 | (l46Var.g(t6bVar) ? 4 : 2) | (l46Var.g(xw9Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(l26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = we6.e(l46Var) ? 24.0f : 16.0f;
            Iterator<E> it = TarotCardType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!pa7.t(((TarotCardType) next).getCardKey(), t6bVar.a));
            TarotCardType tarotCardType = (TarotCardType) next;
            if (tarotCardType == null) {
                tarotCardType = TarotCardType.THE_FOOL;
            }
            TarotCardChoice tarotCardChoice = new TarotCardChoice(tarotCardType, t6bVar.b, (String) null, 4, (rp3) null);
            j09 j09VarY = ynb.Y(b.c, xw9Var);
            uc0 uc0Var = new uc0(we6.e(l46Var) ? 16.0f : 12.0f, true, new qc0(i4));
            bx9 bx9VarR = ynb.r(we6.e(l46Var) ? 0.0f : f2, 0.0f, we6.e(l46Var) ? 0.0f : f2, 24.0f, 2);
            boolean zD = l46Var.d(f2) | ((i3 & 14) == 4) | l46Var.g(tarotCardChoice) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objR = l46Var.R();
            if (zD || objR == sf2.a) {
                Object m11Var = new m11(f2, t6bVar, tarotCardChoice, l26Var, x16Var);
                l46Var.p0(m11Var);
                objR = m11Var;
            }
            af1.s(j09VarY, null, bx9VarR, uc0Var, null, null, false, null, (a26) objR, l46Var, 0, 490);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(t6bVar, xw9Var, x16Var, l26Var, i2, 5);
        }
    }

    public static final void m(c78 c78Var, sr5 sr5Var) {
        if (sr5Var instanceof ru0) {
            c78Var.add(((ru0) sr5Var).a);
            return;
        }
        if (sr5Var instanceof fh2) {
            Iterator it = ((fh2) sr5Var).a.iterator();
            while (it.hasNext()) {
                m(c78Var, (gg9) it.next());
            }
            return;
        }
        if (sr5Var instanceof zk2) {
            return;
        }
        if (sr5Var instanceof rid) {
            m(c78Var, ((rid) sr5Var).a);
            return;
        }
        if (!(sr5Var instanceof zj)) {
            if (sr5Var instanceof xr9) {
                m(c78Var, ((xr9) sr5Var).b);
                return;
            } else {
                ap.c();
                return;
            }
        }
        zj zjVar = (zj) sr5Var;
        m(c78Var, zjVar.a);
        Iterator it2 = zjVar.b.iterator();
        while (it2.hasNext()) {
            m(c78Var, (sr5) it2.next());
        }
    }

    public static final void n(pv2 pv2Var, CancellationException cancellationException) {
        dg7 dg7Var = (dg7) pv2Var.F0(ndb.Y0);
        if (dg7Var != null) {
            dg7Var.h(cancellationException);
        }
    }

    public static void o(int i2) {
        if (2 > i2 || i2 >= 37) {
            qc0.l(ub3.n(i2, "radix ", " was not in valid range "), new z67(2, 36, 1));
        }
    }

    public static final tme p(rv3 rv3Var) {
        gne gneVar;
        rme rmeVar = new rme();
        n3d.s(rv3Var, vme.a, new i2e(4, new trd(11, rmeVar), new dne(1, rmeVar, rme.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0)));
        i79 i79Var = new i79();
        i79 i79Var2 = rmeVar.a;
        Object[] objArr = i79Var2.a;
        int i2 = i79Var2.b;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        sme smeVar = null;
        while (true) {
            gneVar = gne.b;
            if (i4 >= i2) {
                break;
            }
            sme smeVar2 = (sme) objArr[i4];
            if (!z || smeVar2 != gneVar) {
                if (smeVar2 == gneVar && smeVar == gneVar) {
                    z = false;
                } else {
                    if (smeVar2 != gneVar) {
                        i79 i79Var3 = rmeVar.b;
                        Object[] objArr2 = i79Var3.a;
                        int i5 = i79Var3.b;
                        int i6 = 0;
                        while (true) {
                            if (i6 < i5) {
                                if (((Boolean) ((a26) objArr2[i6]).d(smeVar2)).booleanValue()) {
                                    i6++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    i79Var.h(smeVar2);
                    z = false;
                    smeVar = smeVar2;
                }
            }
            i4++;
        }
        if (((sme) (i79Var.d() ? null : i79Var.a[i79Var.b - 1])) == gneVar) {
            i79Var.m(i79Var.b - 1);
        }
        g79 g79Var = i79Var.c;
        if (g79Var == null) {
            g79Var = new g79(i3, i79Var);
            i79Var.c = g79Var;
        }
        return new tme(g79Var);
    }

    public static final boolean q(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static Handler r(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return s.j(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            b1.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            b1.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            b1.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            yg5.p(cause);
            return null;
        }
    }

    public static ArrayList s() {
        int iOrdinal = 7 - y().ordinal();
        mx4 mx4Var = x85.a;
        return s72.Q0(s72.d1(iOrdinal, mx4Var), s72.s0(iOrdinal, mx4Var));
    }

    public static boolean t(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static final float u(int i2, int i3, float[] fArr, float[] fArr2) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void v(pv2 pv2Var) {
        dg7 dg7Var = (dg7) pv2Var.F0(ndb.Y0);
        if (dg7Var != null && !dg7Var.b()) {
            throw dg7Var.N();
        }
    }

    public static final boolean w(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final j09 x(a26 a26Var) {
        return new re5(a26Var);
    }

    public static DayOfWeek y() {
        Locale locale = Locale.getDefault();
        locale.getClass();
        DayOfWeek firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek();
        firstDayOfWeek.getClass();
        return firstDayOfWeek;
    }

    public static final dg7 z(pv2 pv2Var) {
        dg7 dg7Var = (dg7) pv2Var.F0(ndb.Y0);
        if (dg7Var != null) {
            return dg7Var;
        }
        pd4.i(pv2Var, "Current context doesn't contain Job in it: ");
        return null;
    }
}
