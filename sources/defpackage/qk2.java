package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import tech.chatmind.api.dailycard.model.DailyCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qk2 {
    public static jzf F0;
    public final /* synthetic */ int a;
    public static final xz b = new xz(Float.POSITIVE_INFINITY);
    public static final yz c = new yz(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final zz d = new zz(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final a00 e = new a00(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final xz f = new xz(Float.NEGATIVE_INFINITY);
    public static final yz g = new yz(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final zz v = new zz(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final a00 w = new a00(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final dd2 x = new dd2(new gd2(15), false, -1509403525);
    public static final dd2 y = new dd2(new yd2(14), false, -1246290790);
    public static final dd2 z = new dd2(new de2(27), false, 835173382);
    public static final dd2 X = new dd2(new de2(28), false, -949655733);
    public static final Object Y = new Object();
    public static final vea Z = new vea(7, new tbc(2), new a4c(5));
    public static final Object E0 = new Object();

    public /* synthetic */ qk2(int i) {
        this.a = i;
    }

    public static int A(Exception exc) {
        boolean zT = false;
        if (!(exc instanceof CameraAccessException)) {
            if (exc instanceof IllegalArgumentException) {
                return 7;
            }
            if (exc instanceof SecurityException) {
                return 8;
            }
            if (Build.VERSION.SDK_INT == 28) {
                if (exc instanceof RuntimeException) {
                    StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                    stackTrace.getClass();
                    zT = pa7.t(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
                }
                if (zT) {
                    return 10;
                }
            }
            b1.l("CXCP", "Unexpected throwable: " + exc);
            return 11;
        }
        CameraAccessException cameraAccessException = (CameraAccessException) exc;
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return 3;
        }
        if (reason == 2) {
            return 6;
        }
        if (reason == 3) {
            return 0;
        }
        if (reason == 4) {
            return 1;
        }
        if (reason == 5) {
            return 2;
        }
        b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
        return 11;
    }

    public static final ao8 B(uz7 uz7Var, int i, long j, ox9 ox9Var, long j2, kx0 kx0Var, cv7 cv7Var, int i2, q69 q69Var) {
        List list;
        Object objB = ox9Var.b(i);
        List list2 = (List) q69Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = uz7Var.a(i);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((tn8) listA.get(i3)).v(j));
            }
            q69Var.i(i, arrayList);
            list = arrayList;
        }
        return new ao8(i, i2, list, j2, objB, kx0Var, cv7Var);
    }

    public static final Class C(nyc nycVar) {
        String strA = c5e.A(nycVar.a(), "?", "");
        try {
            return Class.forName(strA);
        } catch (ClassNotFoundException unused) {
            if (v4e.F(strA, ".", false)) {
                return Class.forName(new rob("(\\.+)(?!.*\\.)").h(strA, "\\$"));
            }
            String strConcat = "Cannot find class with name \"" + nycVar.a() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (nycVar.g() instanceof ryc) {
                strConcat = strConcat.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            qc0.j(strConcat);
            return null;
        }
    }

    public static final y22 D(bm3 bm3Var) {
        bm3 bm3VarK = bm3Var.k();
        if (bm3VarK == null || (bm3Var instanceof kw9)) {
            return null;
        }
        if (!(bm3VarK.k() instanceof kw9)) {
            return D(bm3VarK);
        }
        if (bm3VarK instanceof y22) {
            return (y22) bm3VarK;
        }
        return null;
    }

    public static final q2g E(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return null;
        }
        return i == 0 ? q2g.a : q2g.b;
    }

    public static final long F(long j) {
        if (j < 0) {
            qfc qfcVar = ar4.b;
            return ar4.d;
        }
        qfc qfcVar2 = ar4.b;
        return ar4.c;
    }

    public static final boolean G(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static j09 J(j09 j09Var, ju juVar) {
        return j09Var.D(new kia(juVar));
    }

    public static final boolean K(tt7 tt7Var) {
        y22 y22VarM = tt7Var.c0().m();
        if (y22VarM != null) {
            if (n37.a(y22VarM) && n37.b(y22VarM) && !qz3.g((u09) y22VarM).equals(tyd.h)) {
                return true;
            }
            y22 y22VarM2 = tt7Var.c0().m();
            if (y22VarM2 != null && (y22VarM2 instanceof u09) && (((u09) y22VarM2).n0() instanceof y49) && !w8f.e(tt7Var)) {
                return true;
            }
        }
        y22 y22VarM3 = tt7Var.c0().m();
        c8f c8fVar = y22VarM3 instanceof c8f ? (c8f) y22VarM3 : null;
        return c8fVar != null && K(o7c.q(c8fVar));
    }

    public static final u09 L(w09 w09Var, dx5 dx5Var) {
        dr8 dr8VarJ0;
        w09Var.getClass();
        dx5Var.getClass();
        ex5 ex5Var = dx5Var.a;
        if (!ex5Var.c()) {
            p18 p18Var = w09Var.W(dx5Var.b()).v;
            t99 t99VarG = ex5Var.g();
            lf9 lf9Var = lf9.a;
            y22 y22VarE = p18Var.e(t99VarG, lf9Var);
            u09 u09Var = y22VarE instanceof u09 ? (u09) y22VarE : null;
            if (u09Var != null) {
                return u09Var;
            }
            u09 u09VarL = L(w09Var, dx5Var.b());
            y22 y22VarE2 = (u09VarL == null || (dr8VarJ0 = u09VarL.j0()) == null) ? null : dr8VarJ0.e(ex5Var.g(), lf9Var);
            if (y22VarE2 instanceof u09) {
                return (u09) y22VarE2;
            }
        }
        return null;
    }

    public static final long M(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        gr4 gr4Var = gr4.NANOSECONDS;
        if (j4 >= 0) {
            return y41.U(j3, gr4Var);
        }
        gr4 gr4Var2 = gr4.MILLISECONDS;
        if (gr4Var.compareTo(gr4Var2) >= 0) {
            return ar4.j(F(j3));
        }
        long jConvert = gr4Var.a().convert(1L, gr4Var2.a());
        long j5 = (j / jConvert) - (j2 / jConvert);
        long j6 = (j % jConvert) - (j2 % jConvert);
        qfc qfcVar = ar4.b;
        return ar4.g(y41.U(j5, gr4Var2), y41.U(j6, gr4Var));
    }

    public static void N(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            p6.r(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            p6.r(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            O(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            O(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            O(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        O(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void O(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static ComponentName P(Context context, Intent intent) {
        synchronized (E0) {
            try {
                t(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    F0.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Q(Context context, Uri uri, zn2 zn2Var) {
        a45 a45Var;
        if (zn2Var instanceof a45) {
            a45Var = (a45) zn2Var;
            int i = a45Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a45Var.label = i - Integer.MIN_VALUE;
            } else {
                a45Var = new a45(zn2Var);
            }
        } else {
            a45Var = new a45(zn2Var);
        }
        Object objP0 = a45Var.result;
        int i2 = a45Var.label;
        if (i2 == 0) {
            jzb.q(objP0);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            b45 b45Var = new b45(uri, context, null);
            a45Var.L$0 = null;
            a45Var.L$1 = null;
            a45Var.label = 1;
            objP0 = ynb.p0(hr3Var, b45Var, a45Var);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objP0);
        }
        objP0.getClass();
        return objP0;
    }

    public static final void c(int i, int i2, l46 l46Var, j09 j09Var) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(290044873);
        int i4 = i2 | (l46Var2.e(i) ? 32 : 16);
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            j09 j09VarE = oa7.E(j09Var, a7c.b(24.0f));
            pr4 pr4Var = l8b.a;
            j09 j09VarZ = ynb.Z(tm7.o(j09VarE, ((e8b) l46Var2.k(pr4Var)).a, g21.f), 24.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
            long jL = w6c.l(24);
            ar5 ar5Var = ar5.d;
            xtd xtdVar = new xtd(((e8b) l46Var2.k(pr4Var)).q, jL, ar5Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65528);
            xtd xtdVar2 = new xtd(((e8b) l46Var2.k(pr4Var)).u, w6c.l(48), ar5Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65528);
            int i5 = i4 & 112;
            String strR = afc.r(R.string.invitation_reward_free_counter, new Object[]{Integer.valueOf(i)}, l46Var2);
            String strValueOf = String.valueOf(i);
            i00 i00Var = new i00();
            int iO = v4e.O(strR, strValueOf, 0, false, 4);
            int length = 0;
            while (iO >= 0) {
                int iK = i00Var.k(xtdVar);
                try {
                    i00Var.f(strR.substring(length, iO));
                    i00Var.h(iK);
                    int iK2 = i00Var.k(xtdVar2);
                    try {
                        i00Var.f(strValueOf);
                        i00Var.h(iK2);
                        length = strValueOf.length() + iO;
                        iO = v4e.O(strR, strValueOf, length, false, 4);
                    } catch (Throwable th) {
                        i00Var.h(iK2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    i00Var.h(iK);
                    throw th2;
                }
            }
            if (length < strR.length()) {
                int iK3 = i00Var.k(xtdVar);
                try {
                    i00Var.f(strR.substring(length));
                    i00Var.h(iK3);
                } catch (Throwable th3) {
                    i00Var.h(iK3);
                    throw th3;
                }
            }
            vd0.d(i00Var.l(), null, null, null, 0, false, 1, 0, null, new co0(w6c.l(16), w6c.l(48), w6c.l(1)), l46Var2, 1572864, 0, 958);
            r8c.a(i, i5, l46Var2, null);
            String strH = ks0.h(12.0f, R.string.invitation_achievement_tips, l46Var2, l46Var2, g09.a);
            mue mueVar = pue.a;
            nte.b(strH, null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            i3 = 1;
            l46Var2.r(true);
        } else {
            i3 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(j09Var, i, i2, i3);
        }
    }

    public static jx d(float f2) {
        return new jx(Float.valueOf(f2), xo1.g, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [l46] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l46] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    public static final void e(j09 j09Var, m40 m40Var, l46 l46Var, int i) {
        j09 j09Var2;
        ?? r1;
        long j;
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var2.h0(1999793032);
        int i2 = i | 6 | (l46Var2.e(m40Var == null ? -1 : m40Var.ordinal()) ? 32 : 16);
        int i3 = 0;
        boolean z2 = true;
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            List listJ1 = s72.j1(m40.d);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i3)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, t7cVarA);
            dec.l(he2Var3, l46Var2, u8aVarM);
            dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(he2Var, l46Var2, j09VarJ);
            int iIndexOf = listJ1.indexOf(m40Var);
            l46Var2.f0(1684364349);
            int i4 = 0;
            ?? r2 = l46Var2;
            for (Object obj : listJ1) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    t72.Z();
                    throw null;
                }
                m40 m40Var2 = (m40) obj;
                ?? r6 = i4 <= iIndexOf ? z2 : i3;
                jw7 jw7Var = new jw7(1.0f, z2);
                ?? r19 = r6;
                c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(i3)), ndb.Z, r2, 54);
                int i6 = iIndexOf;
                int iHashCode2 = Long.hashCode(r2.T);
                u8a u8aVarM2 = r2.m();
                j09 j09VarJ2 = m93.J(r2, jw7Var);
                lf2.q.getClass();
                r2.j0();
                if (r2.S) {
                    r2.l(ov7Var);
                } else {
                    r2.s0();
                }
                dec.l(he2Var4, r2, c92VarA);
                dec.l(he2Var3, r2, u8aVarM2);
                dec.l(he2Var2, r2, Integer.valueOf(iHashCode2));
                dec.k(r2);
                dec.l(he2Var, r2, j09VarJ2);
                j09 j09VarE = oa7.E(b.d(b.c(g09Var, 1.0f), 4.0f), eze.a(r2).a.a);
                pr4 pr4Var = l8b.a;
                s21.a(tm7.o(j09VarE, y72.b(((e8b) r2.k(pr4Var)).u, r19 == 0 ? 0.2f : 1.0f), g21.f), r2, 0);
                String strQ = afc.q(m40Var2.a(), r2);
                mue mueVar = pue.a;
                mue mueVarJ = pue.j(r2);
                if (r19 != 0) {
                    r2.f0(1222003264);
                    j = ((e8b) r2.k(pr4Var)).u;
                } else {
                    r2.f0(1222004101);
                    j = ((e8b) r2.k(pr4Var)).t;
                }
                r2.r(false);
                he2 he2Var5 = he2Var;
                g09 g09Var2 = g09Var;
                nte.b(strQ, g09Var2, j, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarJ, l46Var, 48, 0, 130040);
                l46 l46Var3 = l46Var;
                l46Var3.r(true);
                z2 = true;
                g09Var = g09Var2;
                i4 = i5;
                he2Var = he2Var5;
                he2Var3 = he2Var3;
                iIndexOf = i6;
                ov7Var = ov7Var;
                he2Var2 = he2Var2;
                he2Var4 = he2Var4;
                i3 = 0;
                r2 = l46Var3;
            }
            j09Var2 = g09Var;
            r2.r(i3);
            r2.r(z2);
            r1 = r2;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
            r1 = l46Var2;
        }
        ojb ojbVarV = r1.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(j09Var2, m40Var, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x0160  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0176  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:135:0x0282  */
    /* JADX WARN: Code duplicated, block: B:137:0x0295  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2 A[PHI: r2 r7 r9 r11
  0x00d2: PHI (r2v17 int) = (r2v11 int), (r2v11 int), (r2v19 int) binds: [B:83:0x00e7, B:73:0x00ce, B:74:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r7v10 j09) = (r7v4 j09), (r7v2 j09), (r7v2 j09) binds: [B:83:0x00e7, B:73:0x00ce, B:74:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r9v22 boolean) = (r9v4 boolean), (r9v2 boolean), (r9v2 boolean) binds: [B:83:0x00e7, B:73:0x00ce, B:74:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x00d2: PHI (r11v16 float) = (r11v3 float), (r11v2 float), (r11v2 float) binds: [B:83:0x00e7, B:73:0x00ce, B:74:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    public static final void i(final boolean z2, j09 j09Var, boolean z3, float f2, qy1 qy1Var, final a26 a26Var, l46 l46Var, final int i, final int i2) {
        int i3;
        j09 j09Var2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        float f3;
        int i7;
        boolean z5;
        final qy1 qy1Var2;
        final j09 j09Var3;
        final boolean z6;
        final float f4;
        ojb ojbVarV;
        int i8;
        g09 g09Var;
        boolean z7;
        int i9;
        qy1 qy1VarU;
        long j;
        float f5;
        long j2;
        boolean z8;
        int i10;
        boolean z9;
        boolean z10;
        Object objR;
        int i11;
        boolean z11;
        boolean z12;
        Object objR2;
        qy1 qy1Var3;
        boolean z13;
        gx6 gx6VarB;
        int i12;
        a26Var.getClass();
        l46Var.h0(2104246292);
        if ((i & 6) == 0) {
            i3 = (l46Var.h(z2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z4 = z3;
                    if (l46Var.h(z4)) {
                        i5 = 256;
                    } else {
                        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i7 = 2048;
                        } else {
                            i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) != 0) {
                        i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
                    }
                    if ((196608 & i) == 0) {
                        if (l46Var.i(a26Var)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i3 |= i12;
                    }
                    if ((74899 & i3) != 74898) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (l46Var.W(i3 & 1, z5)) {
                        l46Var.b0();
                        i8 = i & 1;
                        g09Var = g09.a;
                        if (i8 != 0 || l46Var.C()) {
                            if (i13 != 0) {
                                j09Var2 = g09Var;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                f3 = 16.0f;
                            }
                            if ((i2 & 16) != 0) {
                                z7 = z4;
                                i9 = i3 & (-57345);
                                j09Var3 = j09Var2;
                                qy1VarU = u(l46Var);
                                f4 = f3;
                            }
                            l46Var.s();
                            j09 j09VarL = b.l(j09Var3, f4);
                            y6c y6cVar = a7c.a;
                            j09 j09VarE = oa7.E(j09VarL, y6cVar);
                            if (z2) {
                                j = qy1VarU.c;
                            } else {
                                j = qy1VarU.d;
                            }
                            j09 j09VarO = tm7.o(j09VarE, j, g21.f);
                            if (z2) {
                                f5 = 0.0f;
                            } else {
                                f5 = 1.5f;
                            }
                            if (z2) {
                                j2 = qy1VarU.c;
                            } else {
                                j2 = qy1VarU.i;
                            }
                            j09 j09VarW = db6.w(j09VarO, f5, j2, y6cVar);
                            if ((458752 & i9) == 131072) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            i10 = i9 & 14;
                            if (i10 == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z10 = z8 | z9;
                            objR = l46Var.R();
                            i11 = 3;
                            i8c i8cVar = sf2.a;
                            if (z10 || objR == i8cVar) {
                                objR = new oy1(i11, a26Var, z2);
                                l46Var.p0(objR);
                            }
                            j09 j09VarC = androidx.compose.foundation.b.c(j09VarW, z7, null, null, (x16) objR, 14);
                            if (i10 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                            objR2 = l46Var.R();
                            if (z12 || objR2 == i8cVar) {
                                objR2 = new bs0(z2, qy1VarU, i11);
                                l46Var.p0(objR2);
                            }
                            j09 j09VarS = b21.s(j09VarC, (a26) objR2);
                            xn8 xn8VarC = s21.c(ndb.f, false);
                            int iHashCode = Long.hashCode(l46Var.T);
                            u8a u8aVarM = l46Var.m();
                            j09 j09VarJ = m93.J(l46Var, j09VarS);
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
                            if (z2) {
                                l46Var.f0(-1081396799);
                                gx6VarB = g21.h;
                                if (gx6VarB == null) {
                                    fx6 fx6Var = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i14 = msf.a;
                                    dtd dtdVar = new dtd(y72.b);
                                    ArrayList arrayList = new ArrayList(32);
                                    arrayList.add(new p1a(9.0f, 16.17f));
                                    arrayList.add(new o1a(4.83f, 12.0f));
                                    arrayList.add(new w1a(-1.42f, 1.41f));
                                    arrayList.add(new o1a(9.0f, 19.0f));
                                    arrayList.add(new o1a(21.0f, 7.0f));
                                    arrayList.add(new w1a(-1.41f, -1.41f));
                                    arrayList.add(l1a.c);
                                    fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                                    gx6VarB = fx6Var.b();
                                    g21.h = gx6VarB;
                                }
                                j09 j09VarZ = ynb.Z(d31.a.b(g09Var), 2.0f);
                                long j3 = qy1VarU.a;
                                qy1 qy1Var4 = qy1VarU;
                                gx6 gx6Var = gx6VarB;
                                qy1Var3 = qy1Var4;
                                z13 = true;
                                gu6.a(gx6Var, null, j09VarZ, j3, l46Var, 48, 0);
                                l46Var.r(false);
                            } else {
                                qy1Var3 = qy1VarU;
                                z13 = true;
                                l46Var.f0(-1081174808);
                                l46Var.r(false);
                            }
                            l46Var.r(z13);
                            qy1Var2 = qy1Var3;
                            z6 = z7;
                        } else {
                            l46Var.Z();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        z7 = z4;
                        f4 = f3;
                        i9 = i3;
                        j09Var3 = j09Var2;
                        qy1VarU = qy1Var;
                        l46Var.s();
                        j09 j09VarL2 = b.l(j09Var3, f4);
                        y6c y6cVar2 = a7c.a;
                        j09 j09VarE2 = oa7.E(j09VarL2, y6cVar2);
                        if (z2) {
                            j = qy1VarU.c;
                        } else {
                            j = qy1VarU.d;
                        }
                        j09 j09VarO2 = tm7.o(j09VarE2, j, g21.f);
                        if (z2) {
                            f5 = 1.5f;
                        } else {
                            f5 = 0.0f;
                        }
                        if (z2) {
                            j2 = qy1VarU.c;
                        } else {
                            j2 = qy1VarU.i;
                        }
                        j09 j09VarW2 = db6.w(j09VarO2, f5, j2, y6cVar2);
                        if ((458752 & i9) == 131072) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        i10 = i9 & 14;
                        if (i10 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z8 | z9;
                        objR = l46Var.R();
                        i11 = 3;
                        i8c i8cVar2 = sf2.a;
                        if (z10) {
                            objR = new oy1(i11, a26Var, z2);
                            l46Var.p0(objR);
                        } else {
                            objR = new oy1(i11, a26Var, z2);
                            l46Var.p0(objR);
                        }
                        j09 j09VarC2 = androidx.compose.foundation.b.c(j09VarW2, z7, null, null, (x16) objR, 14);
                        if (i10 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                        objR2 = l46Var.R();
                        if (z12) {
                            objR2 = new bs0(z2, qy1VarU, i11);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bs0(z2, qy1VarU, i11);
                            l46Var.p0(objR2);
                        }
                        j09 j09VarS2 = b21.s(j09VarC2, (a26) objR2);
                        xn8 xn8VarC2 = s21.c(ndb.f, false);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarS2);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8VarC2);
                        dec.l(hj6.y, l46Var, u8aVarM2);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ2);
                        if (z2) {
                            l46Var.f0(-1081396799);
                            gx6VarB = g21.h;
                            if (gx6VarB == null) {
                                fx6 fx6Var2 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i15 = msf.a;
                                dtd dtdVar2 = new dtd(y72.b);
                                ArrayList arrayList2 = new ArrayList(32);
                                arrayList2.add(new p1a(9.0f, 16.17f));
                                arrayList2.add(new o1a(4.83f, 12.0f));
                                arrayList2.add(new w1a(-1.42f, 1.41f));
                                arrayList2.add(new o1a(9.0f, 19.0f));
                                arrayList2.add(new o1a(21.0f, 7.0f));
                                arrayList2.add(new w1a(-1.41f, -1.41f));
                                arrayList2.add(l1a.c);
                                fx6.a(fx6Var2, arrayList2, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
                                gx6VarB = fx6Var2.b();
                                g21.h = gx6VarB;
                            }
                            j09 j09VarZ2 = ynb.Z(d31.a.b(g09Var), 2.0f);
                            long j4 = qy1VarU.a;
                            qy1 qy1Var5 = qy1VarU;
                            gx6 gx6Var2 = gx6VarB;
                            qy1Var3 = qy1Var5;
                            z13 = true;
                            gu6.a(gx6Var2, null, j09VarZ2, j4, l46Var, 48, 0);
                            l46Var.r(false);
                        } else {
                            qy1Var3 = qy1VarU;
                            z13 = true;
                            l46Var.f0(-1081174808);
                            l46Var.r(false);
                        }
                        l46Var.r(z13);
                        qy1Var2 = qy1Var3;
                        z6 = z7;
                    } else {
                        l46Var.Z();
                        qy1Var2 = qy1Var;
                        j09Var3 = j09Var2;
                        z6 = z4;
                        f4 = f3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: rz1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                                return wef.a;
                            }
                        };
                    }
                }
                i3 |= 3072;
                f3 = f2;
                if ((i & 24576) != 0) {
                    i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
                }
                if ((196608 & i) == 0) {
                    if (l46Var.i(a26Var)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i3 |= i12;
                }
                if ((74899 & i3) != 74898) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (l46Var.W(i3 & 1, z5)) {
                    l46Var.b0();
                    i8 = i & 1;
                    g09Var = g09.a;
                    if (i8 != 0) {
                        if (i13 != 0) {
                            j09Var2 = g09Var;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            f3 = 16.0f;
                        }
                        if ((i2 & 16) != 0) {
                            z7 = z4;
                            i9 = i3 & (-57345);
                            j09Var3 = j09Var2;
                            qy1VarU = u(l46Var);
                            f4 = f3;
                        } else {
                            z7 = z4;
                            f4 = f3;
                            i9 = i3;
                            j09Var3 = j09Var2;
                            qy1VarU = qy1Var;
                        }
                    } else {
                        if (i13 != 0) {
                            j09Var2 = g09Var;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            f3 = 16.0f;
                        }
                        if ((i2 & 16) != 0) {
                            z7 = z4;
                            i9 = i3 & (-57345);
                            j09Var3 = j09Var2;
                            qy1VarU = u(l46Var);
                            f4 = f3;
                        } else {
                            z7 = z4;
                            f4 = f3;
                            i9 = i3;
                            j09Var3 = j09Var2;
                            qy1VarU = qy1Var;
                        }
                    }
                    l46Var.s();
                    j09 j09VarL3 = b.l(j09Var3, f4);
                    y6c y6cVar3 = a7c.a;
                    j09 j09VarE3 = oa7.E(j09VarL3, y6cVar3);
                    if (z2) {
                        j = qy1VarU.c;
                    } else {
                        j = qy1VarU.d;
                    }
                    j09 j09VarO3 = tm7.o(j09VarE3, j, g21.f);
                    if (z2) {
                        f5 = 1.5f;
                    } else {
                        f5 = 0.0f;
                    }
                    if (z2) {
                        j2 = qy1VarU.c;
                    } else {
                        j2 = qy1VarU.i;
                    }
                    j09 j09VarW3 = db6.w(j09VarO3, f5, j2, y6cVar3);
                    if ((458752 & i9) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i10 = i9 & 14;
                    if (i10 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z8 | z9;
                    objR = l46Var.R();
                    i11 = 3;
                    i8c i8cVar3 = sf2.a;
                    if (z10) {
                        objR = new oy1(i11, a26Var, z2);
                        l46Var.p0(objR);
                    } else {
                        objR = new oy1(i11, a26Var, z2);
                        l46Var.p0(objR);
                    }
                    j09 j09VarC3 = androidx.compose.foundation.b.c(j09VarW3, z7, null, null, (x16) objR, 14);
                    if (i10 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                    objR2 = l46Var.R();
                    if (z12) {
                        objR2 = new bs0(z2, qy1VarU, i11);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bs0(z2, qy1VarU, i11);
                        l46Var.p0(objR2);
                    }
                    j09 j09VarS3 = b21.s(j09VarC3, (a26) objR2);
                    xn8 xn8VarC3 = s21.c(ndb.f, false);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, j09VarS3);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC3);
                    dec.l(hj6.y, l46Var, u8aVarM3);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode3));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ3);
                    if (z2) {
                        l46Var.f0(-1081396799);
                        gx6VarB = g21.h;
                        if (gx6VarB == null) {
                            fx6 fx6Var3 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i16 = msf.a;
                            dtd dtdVar3 = new dtd(y72.b);
                            ArrayList arrayList3 = new ArrayList(32);
                            arrayList3.add(new p1a(9.0f, 16.17f));
                            arrayList3.add(new o1a(4.83f, 12.0f));
                            arrayList3.add(new w1a(-1.42f, 1.41f));
                            arrayList3.add(new o1a(9.0f, 19.0f));
                            arrayList3.add(new o1a(21.0f, 7.0f));
                            arrayList3.add(new w1a(-1.41f, -1.41f));
                            arrayList3.add(l1a.c);
                            fx6.a(fx6Var3, arrayList3, dtdVar3, 1.0f, 1.0f, 2, 1.0f);
                            gx6VarB = fx6Var3.b();
                            g21.h = gx6VarB;
                        }
                        j09 j09VarZ3 = ynb.Z(d31.a.b(g09Var), 2.0f);
                        long j5 = qy1VarU.a;
                        qy1 qy1Var6 = qy1VarU;
                        gx6 gx6Var3 = gx6VarB;
                        qy1Var3 = qy1Var6;
                        z13 = true;
                        gu6.a(gx6Var3, null, j09VarZ3, j5, l46Var, 48, 0);
                        l46Var.r(false);
                    } else {
                        qy1Var3 = qy1VarU;
                        z13 = true;
                        l46Var.f0(-1081174808);
                        l46Var.r(false);
                    }
                    l46Var.r(z13);
                    qy1Var2 = qy1Var3;
                    z6 = z7;
                } else {
                    l46Var.Z();
                    qy1Var2 = qy1Var;
                    j09Var3 = j09Var2;
                    z6 = z4;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rz1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z4 = z3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i7 = 2048;
                    } else {
                        i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) != 0) {
                    i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
                }
                if ((196608 & i) == 0) {
                    if (l46Var.i(a26Var)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i3 |= i12;
                }
                if ((74899 & i3) != 74898) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (l46Var.W(i3 & 1, z5)) {
                    l46Var.b0();
                    i8 = i & 1;
                    g09Var = g09.a;
                    if (i8 != 0) {
                        if (i13 != 0) {
                            j09Var2 = g09Var;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            f3 = 16.0f;
                        }
                        if ((i2 & 16) != 0) {
                            z7 = z4;
                            i9 = i3 & (-57345);
                            j09Var3 = j09Var2;
                            qy1VarU = u(l46Var);
                            f4 = f3;
                        } else {
                            z7 = z4;
                            f4 = f3;
                            i9 = i3;
                            j09Var3 = j09Var2;
                            qy1VarU = qy1Var;
                        }
                    } else {
                        if (i13 != 0) {
                            j09Var2 = g09Var;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            f3 = 16.0f;
                        }
                        if ((i2 & 16) != 0) {
                            z7 = z4;
                            i9 = i3 & (-57345);
                            j09Var3 = j09Var2;
                            qy1VarU = u(l46Var);
                            f4 = f3;
                        } else {
                            z7 = z4;
                            f4 = f3;
                            i9 = i3;
                            j09Var3 = j09Var2;
                            qy1VarU = qy1Var;
                        }
                    }
                    l46Var.s();
                    j09 j09VarL4 = b.l(j09Var3, f4);
                    y6c y6cVar4 = a7c.a;
                    j09 j09VarE4 = oa7.E(j09VarL4, y6cVar4);
                    if (z2) {
                        j = qy1VarU.c;
                    } else {
                        j = qy1VarU.d;
                    }
                    j09 j09VarO4 = tm7.o(j09VarE4, j, g21.f);
                    if (z2) {
                        f5 = 1.5f;
                    } else {
                        f5 = 0.0f;
                    }
                    if (z2) {
                        j2 = qy1VarU.c;
                    } else {
                        j2 = qy1VarU.i;
                    }
                    j09 j09VarW4 = db6.w(j09VarO4, f5, j2, y6cVar4);
                    if ((458752 & i9) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i10 = i9 & 14;
                    if (i10 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z8 | z9;
                    objR = l46Var.R();
                    i11 = 3;
                    i8c i8cVar4 = sf2.a;
                    if (z10) {
                        objR = new oy1(i11, a26Var, z2);
                        l46Var.p0(objR);
                    } else {
                        objR = new oy1(i11, a26Var, z2);
                        l46Var.p0(objR);
                    }
                    j09 j09VarC4 = androidx.compose.foundation.b.c(j09VarW4, z7, null, null, (x16) objR, 14);
                    if (i10 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                    objR2 = l46Var.R();
                    if (z12) {
                        objR2 = new bs0(z2, qy1VarU, i11);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bs0(z2, qy1VarU, i11);
                        l46Var.p0(objR2);
                    }
                    j09 j09VarS4 = b21.s(j09VarC4, (a26) objR2);
                    xn8 xn8VarC4 = s21.c(ndb.f, false);
                    int iHashCode4 = Long.hashCode(l46Var.T);
                    u8a u8aVarM4 = l46Var.m();
                    j09 j09VarJ4 = m93.J(l46Var, j09VarS4);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC4);
                    dec.l(hj6.y, l46Var, u8aVarM4);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode4));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ4);
                    if (z2) {
                        l46Var.f0(-1081396799);
                        gx6VarB = g21.h;
                        if (gx6VarB == null) {
                            fx6 fx6Var4 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i17 = msf.a;
                            dtd dtdVar4 = new dtd(y72.b);
                            ArrayList arrayList4 = new ArrayList(32);
                            arrayList4.add(new p1a(9.0f, 16.17f));
                            arrayList4.add(new o1a(4.83f, 12.0f));
                            arrayList4.add(new w1a(-1.42f, 1.41f));
                            arrayList4.add(new o1a(9.0f, 19.0f));
                            arrayList4.add(new o1a(21.0f, 7.0f));
                            arrayList4.add(new w1a(-1.41f, -1.41f));
                            arrayList4.add(l1a.c);
                            fx6.a(fx6Var4, arrayList4, dtdVar4, 1.0f, 1.0f, 2, 1.0f);
                            gx6VarB = fx6Var4.b();
                            g21.h = gx6VarB;
                        }
                        j09 j09VarZ4 = ynb.Z(d31.a.b(g09Var), 2.0f);
                        long j6 = qy1VarU.a;
                        qy1 qy1Var7 = qy1VarU;
                        gx6 gx6Var4 = gx6VarB;
                        qy1Var3 = qy1Var7;
                        z13 = true;
                        gu6.a(gx6Var4, null, j09VarZ4, j6, l46Var, 48, 0);
                        l46Var.r(false);
                    } else {
                        qy1Var3 = qy1VarU;
                        z13 = true;
                        l46Var.f0(-1081174808);
                        l46Var.r(false);
                    }
                    l46Var.r(z13);
                    qy1Var2 = qy1Var3;
                    z6 = z7;
                } else {
                    l46Var.Z();
                    qy1Var2 = qy1Var;
                    j09Var3 = j09Var2;
                    z6 = z4;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rz1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            f3 = f2;
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(a26Var)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i3 |= i12;
            }
            if ((74899 & i3) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (l46Var.W(i3 & 1, z5)) {
                l46Var.b0();
                i8 = i & 1;
                g09Var = g09.a;
                if (i8 != 0) {
                    if (i13 != 0) {
                        j09Var2 = g09Var;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        z7 = z4;
                        i9 = i3 & (-57345);
                        j09Var3 = j09Var2;
                        qy1VarU = u(l46Var);
                        f4 = f3;
                    } else {
                        z7 = z4;
                        f4 = f3;
                        i9 = i3;
                        j09Var3 = j09Var2;
                        qy1VarU = qy1Var;
                    }
                } else {
                    if (i13 != 0) {
                        j09Var2 = g09Var;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        z7 = z4;
                        i9 = i3 & (-57345);
                        j09Var3 = j09Var2;
                        qy1VarU = u(l46Var);
                        f4 = f3;
                    } else {
                        z7 = z4;
                        f4 = f3;
                        i9 = i3;
                        j09Var3 = j09Var2;
                        qy1VarU = qy1Var;
                    }
                }
                l46Var.s();
                j09 j09VarL5 = b.l(j09Var3, f4);
                y6c y6cVar5 = a7c.a;
                j09 j09VarE5 = oa7.E(j09VarL5, y6cVar5);
                if (z2) {
                    j = qy1VarU.c;
                } else {
                    j = qy1VarU.d;
                }
                j09 j09VarO5 = tm7.o(j09VarE5, j, g21.f);
                if (z2) {
                    f5 = 1.5f;
                } else {
                    f5 = 0.0f;
                }
                if (z2) {
                    j2 = qy1VarU.c;
                } else {
                    j2 = qy1VarU.i;
                }
                j09 j09VarW5 = db6.w(j09VarO5, f5, j2, y6cVar5);
                if ((458752 & i9) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                i10 = i9 & 14;
                if (i10 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9;
                objR = l46Var.R();
                i11 = 3;
                i8c i8cVar5 = sf2.a;
                if (z10) {
                    objR = new oy1(i11, a26Var, z2);
                    l46Var.p0(objR);
                } else {
                    objR = new oy1(i11, a26Var, z2);
                    l46Var.p0(objR);
                }
                j09 j09VarC5 = androidx.compose.foundation.b.c(j09VarW5, z7, null, null, (x16) objR, 14);
                if (i10 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                objR2 = l46Var.R();
                if (z12) {
                    objR2 = new bs0(z2, qy1VarU, i11);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new bs0(z2, qy1VarU, i11);
                    l46Var.p0(objR2);
                }
                j09 j09VarS5 = b21.s(j09VarC5, (a26) objR2);
                xn8 xn8VarC5 = s21.c(ndb.f, false);
                int iHashCode5 = Long.hashCode(l46Var.T);
                u8a u8aVarM5 = l46Var.m();
                j09 j09VarJ5 = m93.J(l46Var, j09VarS5);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC5);
                dec.l(hj6.y, l46Var, u8aVarM5);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode5));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ5);
                if (z2) {
                    l46Var.f0(-1081396799);
                    gx6VarB = g21.h;
                    if (gx6VarB == null) {
                        fx6 fx6Var5 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i18 = msf.a;
                        dtd dtdVar5 = new dtd(y72.b);
                        ArrayList arrayList5 = new ArrayList(32);
                        arrayList5.add(new p1a(9.0f, 16.17f));
                        arrayList5.add(new o1a(4.83f, 12.0f));
                        arrayList5.add(new w1a(-1.42f, 1.41f));
                        arrayList5.add(new o1a(9.0f, 19.0f));
                        arrayList5.add(new o1a(21.0f, 7.0f));
                        arrayList5.add(new w1a(-1.41f, -1.41f));
                        arrayList5.add(l1a.c);
                        fx6.a(fx6Var5, arrayList5, dtdVar5, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var5.b();
                        g21.h = gx6VarB;
                    }
                    j09 j09VarZ5 = ynb.Z(d31.a.b(g09Var), 2.0f);
                    long j7 = qy1VarU.a;
                    qy1 qy1Var8 = qy1VarU;
                    gx6 gx6Var5 = gx6VarB;
                    qy1Var3 = qy1Var8;
                    z13 = true;
                    gu6.a(gx6Var5, null, j09VarZ5, j7, l46Var, 48, 0);
                    l46Var.r(false);
                } else {
                    qy1Var3 = qy1VarU;
                    z13 = true;
                    l46Var.f0(-1081174808);
                    l46Var.r(false);
                }
                l46Var.r(z13);
                qy1Var2 = qy1Var3;
                z6 = z7;
            } else {
                l46Var.Z();
                qy1Var2 = qy1Var;
                j09Var3 = j09Var2;
                z6 = z4;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rz1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 48;
        j09Var2 = j09Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z4 = z3;
                if (l46Var.h(z4)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i7 = 2048;
                    } else {
                        i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) != 0) {
                    i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
                }
                if ((196608 & i) == 0) {
                    if (l46Var.i(a26Var)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i3 |= i12;
                }
                if ((74899 & i3) != 74898) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (l46Var.W(i3 & 1, z5)) {
                    l46Var.b0();
                    i8 = i & 1;
                    g09Var = g09.a;
                    if (i8 != 0) {
                        if (i13 != 0) {
                            j09Var2 = g09Var;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            f3 = 16.0f;
                        }
                        if ((i2 & 16) != 0) {
                            z7 = z4;
                            i9 = i3 & (-57345);
                            j09Var3 = j09Var2;
                            qy1VarU = u(l46Var);
                            f4 = f3;
                        } else {
                            z7 = z4;
                            f4 = f3;
                            i9 = i3;
                            j09Var3 = j09Var2;
                            qy1VarU = qy1Var;
                        }
                    } else {
                        if (i13 != 0) {
                            j09Var2 = g09Var;
                        }
                        if (i4 != 0) {
                            z4 = true;
                        }
                        if (i6 != 0) {
                            f3 = 16.0f;
                        }
                        if ((i2 & 16) != 0) {
                            z7 = z4;
                            i9 = i3 & (-57345);
                            j09Var3 = j09Var2;
                            qy1VarU = u(l46Var);
                            f4 = f3;
                        } else {
                            z7 = z4;
                            f4 = f3;
                            i9 = i3;
                            j09Var3 = j09Var2;
                            qy1VarU = qy1Var;
                        }
                    }
                    l46Var.s();
                    j09 j09VarL6 = b.l(j09Var3, f4);
                    y6c y6cVar6 = a7c.a;
                    j09 j09VarE6 = oa7.E(j09VarL6, y6cVar6);
                    if (z2) {
                        j = qy1VarU.c;
                    } else {
                        j = qy1VarU.d;
                    }
                    j09 j09VarO6 = tm7.o(j09VarE6, j, g21.f);
                    if (z2) {
                        f5 = 1.5f;
                    } else {
                        f5 = 0.0f;
                    }
                    if (z2) {
                        j2 = qy1VarU.c;
                    } else {
                        j2 = qy1VarU.i;
                    }
                    j09 j09VarW6 = db6.w(j09VarO6, f5, j2, y6cVar6);
                    if ((458752 & i9) == 131072) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i10 = i9 & 14;
                    if (i10 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z8 | z9;
                    objR = l46Var.R();
                    i11 = 3;
                    i8c i8cVar6 = sf2.a;
                    if (z10) {
                        objR = new oy1(i11, a26Var, z2);
                        l46Var.p0(objR);
                    } else {
                        objR = new oy1(i11, a26Var, z2);
                        l46Var.p0(objR);
                    }
                    j09 j09VarC6 = androidx.compose.foundation.b.c(j09VarW6, z7, null, null, (x16) objR, 14);
                    if (i10 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                    objR2 = l46Var.R();
                    if (z12) {
                        objR2 = new bs0(z2, qy1VarU, i11);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bs0(z2, qy1VarU, i11);
                        l46Var.p0(objR2);
                    }
                    j09 j09VarS6 = b21.s(j09VarC6, (a26) objR2);
                    xn8 xn8VarC6 = s21.c(ndb.f, false);
                    int iHashCode6 = Long.hashCode(l46Var.T);
                    u8a u8aVarM6 = l46Var.m();
                    j09 j09VarJ6 = m93.J(l46Var, j09VarS6);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC6);
                    dec.l(hj6.y, l46Var, u8aVarM6);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode6));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ6);
                    if (z2) {
                        l46Var.f0(-1081396799);
                        gx6VarB = g21.h;
                        if (gx6VarB == null) {
                            fx6 fx6Var6 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i19 = msf.a;
                            dtd dtdVar6 = new dtd(y72.b);
                            ArrayList arrayList6 = new ArrayList(32);
                            arrayList6.add(new p1a(9.0f, 16.17f));
                            arrayList6.add(new o1a(4.83f, 12.0f));
                            arrayList6.add(new w1a(-1.42f, 1.41f));
                            arrayList6.add(new o1a(9.0f, 19.0f));
                            arrayList6.add(new o1a(21.0f, 7.0f));
                            arrayList6.add(new w1a(-1.41f, -1.41f));
                            arrayList6.add(l1a.c);
                            fx6.a(fx6Var6, arrayList6, dtdVar6, 1.0f, 1.0f, 2, 1.0f);
                            gx6VarB = fx6Var6.b();
                            g21.h = gx6VarB;
                        }
                        j09 j09VarZ6 = ynb.Z(d31.a.b(g09Var), 2.0f);
                        long j8 = qy1VarU.a;
                        qy1 qy1Var9 = qy1VarU;
                        gx6 gx6Var6 = gx6VarB;
                        qy1Var3 = qy1Var9;
                        z13 = true;
                        gu6.a(gx6Var6, null, j09VarZ6, j8, l46Var, 48, 0);
                        l46Var.r(false);
                    } else {
                        qy1Var3 = qy1VarU;
                        z13 = true;
                        l46Var.f0(-1081174808);
                        l46Var.r(false);
                    }
                    l46Var.r(z13);
                    qy1Var2 = qy1Var3;
                    z6 = z7;
                } else {
                    l46Var.Z();
                    qy1Var2 = qy1Var;
                    j09Var3 = j09Var2;
                    z6 = z4;
                    f4 = f3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rz1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                            return wef.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            f3 = f2;
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(a26Var)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i3 |= i12;
            }
            if ((74899 & i3) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (l46Var.W(i3 & 1, z5)) {
                l46Var.b0();
                i8 = i & 1;
                g09Var = g09.a;
                if (i8 != 0) {
                    if (i13 != 0) {
                        j09Var2 = g09Var;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        z7 = z4;
                        i9 = i3 & (-57345);
                        j09Var3 = j09Var2;
                        qy1VarU = u(l46Var);
                        f4 = f3;
                    } else {
                        z7 = z4;
                        f4 = f3;
                        i9 = i3;
                        j09Var3 = j09Var2;
                        qy1VarU = qy1Var;
                    }
                } else {
                    if (i13 != 0) {
                        j09Var2 = g09Var;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        z7 = z4;
                        i9 = i3 & (-57345);
                        j09Var3 = j09Var2;
                        qy1VarU = u(l46Var);
                        f4 = f3;
                    } else {
                        z7 = z4;
                        f4 = f3;
                        i9 = i3;
                        j09Var3 = j09Var2;
                        qy1VarU = qy1Var;
                    }
                }
                l46Var.s();
                j09 j09VarL7 = b.l(j09Var3, f4);
                y6c y6cVar7 = a7c.a;
                j09 j09VarE7 = oa7.E(j09VarL7, y6cVar7);
                if (z2) {
                    j = qy1VarU.c;
                } else {
                    j = qy1VarU.d;
                }
                j09 j09VarO7 = tm7.o(j09VarE7, j, g21.f);
                if (z2) {
                    f5 = 1.5f;
                } else {
                    f5 = 0.0f;
                }
                if (z2) {
                    j2 = qy1VarU.c;
                } else {
                    j2 = qy1VarU.i;
                }
                j09 j09VarW7 = db6.w(j09VarO7, f5, j2, y6cVar7);
                if ((458752 & i9) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                i10 = i9 & 14;
                if (i10 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9;
                objR = l46Var.R();
                i11 = 3;
                i8c i8cVar7 = sf2.a;
                if (z10) {
                    objR = new oy1(i11, a26Var, z2);
                    l46Var.p0(objR);
                } else {
                    objR = new oy1(i11, a26Var, z2);
                    l46Var.p0(objR);
                }
                j09 j09VarC7 = androidx.compose.foundation.b.c(j09VarW7, z7, null, null, (x16) objR, 14);
                if (i10 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                objR2 = l46Var.R();
                if (z12) {
                    objR2 = new bs0(z2, qy1VarU, i11);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new bs0(z2, qy1VarU, i11);
                    l46Var.p0(objR2);
                }
                j09 j09VarS7 = b21.s(j09VarC7, (a26) objR2);
                xn8 xn8VarC7 = s21.c(ndb.f, false);
                int iHashCode7 = Long.hashCode(l46Var.T);
                u8a u8aVarM7 = l46Var.m();
                j09 j09VarJ7 = m93.J(l46Var, j09VarS7);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC7);
                dec.l(hj6.y, l46Var, u8aVarM7);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode7));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ7);
                if (z2) {
                    l46Var.f0(-1081396799);
                    gx6VarB = g21.h;
                    if (gx6VarB == null) {
                        fx6 fx6Var7 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i110 = msf.a;
                        dtd dtdVar7 = new dtd(y72.b);
                        ArrayList arrayList7 = new ArrayList(32);
                        arrayList7.add(new p1a(9.0f, 16.17f));
                        arrayList7.add(new o1a(4.83f, 12.0f));
                        arrayList7.add(new w1a(-1.42f, 1.41f));
                        arrayList7.add(new o1a(9.0f, 19.0f));
                        arrayList7.add(new o1a(21.0f, 7.0f));
                        arrayList7.add(new w1a(-1.41f, -1.41f));
                        arrayList7.add(l1a.c);
                        fx6.a(fx6Var7, arrayList7, dtdVar7, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var7.b();
                        g21.h = gx6VarB;
                    }
                    j09 j09VarZ7 = ynb.Z(d31.a.b(g09Var), 2.0f);
                    long j9 = qy1VarU.a;
                    qy1 qy1Var10 = qy1VarU;
                    gx6 gx6Var7 = gx6VarB;
                    qy1Var3 = qy1Var10;
                    z13 = true;
                    gu6.a(gx6Var7, null, j09VarZ7, j9, l46Var, 48, 0);
                    l46Var.r(false);
                } else {
                    qy1Var3 = qy1VarU;
                    z13 = true;
                    l46Var.f0(-1081174808);
                    l46Var.r(false);
                }
                l46Var.r(z13);
                qy1Var2 = qy1Var3;
                z6 = z7;
            } else {
                l46Var.Z();
                qy1Var2 = qy1Var;
                j09Var3 = j09Var2;
                z6 = z4;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rz1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 384;
        z4 = z3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                f3 = f2;
                if (l46Var.d(f3)) {
                    i7 = 2048;
                } else {
                    i7 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i7;
            }
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
            }
            if ((196608 & i) == 0) {
                if (l46Var.i(a26Var)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i3 |= i12;
            }
            if ((74899 & i3) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (l46Var.W(i3 & 1, z5)) {
                l46Var.b0();
                i8 = i & 1;
                g09Var = g09.a;
                if (i8 != 0) {
                    if (i13 != 0) {
                        j09Var2 = g09Var;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        z7 = z4;
                        i9 = i3 & (-57345);
                        j09Var3 = j09Var2;
                        qy1VarU = u(l46Var);
                        f4 = f3;
                    } else {
                        z7 = z4;
                        f4 = f3;
                        i9 = i3;
                        j09Var3 = j09Var2;
                        qy1VarU = qy1Var;
                    }
                } else {
                    if (i13 != 0) {
                        j09Var2 = g09Var;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    }
                    if (i6 != 0) {
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        z7 = z4;
                        i9 = i3 & (-57345);
                        j09Var3 = j09Var2;
                        qy1VarU = u(l46Var);
                        f4 = f3;
                    } else {
                        z7 = z4;
                        f4 = f3;
                        i9 = i3;
                        j09Var3 = j09Var2;
                        qy1VarU = qy1Var;
                    }
                }
                l46Var.s();
                j09 j09VarL8 = b.l(j09Var3, f4);
                y6c y6cVar8 = a7c.a;
                j09 j09VarE8 = oa7.E(j09VarL8, y6cVar8);
                if (z2) {
                    j = qy1VarU.c;
                } else {
                    j = qy1VarU.d;
                }
                j09 j09VarO8 = tm7.o(j09VarE8, j, g21.f);
                if (z2) {
                    f5 = 1.5f;
                } else {
                    f5 = 0.0f;
                }
                if (z2) {
                    j2 = qy1VarU.c;
                } else {
                    j2 = qy1VarU.i;
                }
                j09 j09VarW8 = db6.w(j09VarO8, f5, j2, y6cVar8);
                if ((458752 & i9) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                i10 = i9 & 14;
                if (i10 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z8 | z9;
                objR = l46Var.R();
                i11 = 3;
                i8c i8cVar8 = sf2.a;
                if (z10) {
                    objR = new oy1(i11, a26Var, z2);
                    l46Var.p0(objR);
                } else {
                    objR = new oy1(i11, a26Var, z2);
                    l46Var.p0(objR);
                }
                j09 j09VarC8 = androidx.compose.foundation.b.c(j09VarW8, z7, null, null, (x16) objR, 14);
                if (i10 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
                objR2 = l46Var.R();
                if (z12) {
                    objR2 = new bs0(z2, qy1VarU, i11);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new bs0(z2, qy1VarU, i11);
                    l46Var.p0(objR2);
                }
                j09 j09VarS8 = b21.s(j09VarC8, (a26) objR2);
                xn8 xn8VarC8 = s21.c(ndb.f, false);
                int iHashCode8 = Long.hashCode(l46Var.T);
                u8a u8aVarM8 = l46Var.m();
                j09 j09VarJ8 = m93.J(l46Var, j09VarS8);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8VarC8);
                dec.l(hj6.y, l46Var, u8aVarM8);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode8));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ8);
                if (z2) {
                    l46Var.f0(-1081396799);
                    gx6VarB = g21.h;
                    if (gx6VarB == null) {
                        fx6 fx6Var8 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i111 = msf.a;
                        dtd dtdVar8 = new dtd(y72.b);
                        ArrayList arrayList8 = new ArrayList(32);
                        arrayList8.add(new p1a(9.0f, 16.17f));
                        arrayList8.add(new o1a(4.83f, 12.0f));
                        arrayList8.add(new w1a(-1.42f, 1.41f));
                        arrayList8.add(new o1a(9.0f, 19.0f));
                        arrayList8.add(new o1a(21.0f, 7.0f));
                        arrayList8.add(new w1a(-1.41f, -1.41f));
                        arrayList8.add(l1a.c);
                        fx6.a(fx6Var8, arrayList8, dtdVar8, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var8.b();
                        g21.h = gx6VarB;
                    }
                    j09 j09VarZ8 = ynb.Z(d31.a.b(g09Var), 2.0f);
                    long j10 = qy1VarU.a;
                    qy1 qy1Var11 = qy1VarU;
                    gx6 gx6Var8 = gx6VarB;
                    qy1Var3 = qy1Var11;
                    z13 = true;
                    gu6.a(gx6Var8, null, j09VarZ8, j10, l46Var, 48, 0);
                    l46Var.r(false);
                } else {
                    qy1Var3 = qy1VarU;
                    z13 = true;
                    l46Var.f0(-1081174808);
                    l46Var.r(false);
                }
                l46Var.r(z13);
                qy1Var2 = qy1Var3;
                z6 = z7;
            } else {
                l46Var.Z();
                qy1Var2 = qy1Var;
                j09Var3 = j09Var2;
                z6 = z4;
                f4 = f3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: rz1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 3072;
        f3 = f2;
        if ((i & 24576) != 0) {
            i3 |= ((i2 & 16) == 0 || !l46Var.g(qy1Var)) ? UserMetadata.MAX_INTERNAL_KEY_SIZE : 16384;
        }
        if ((196608 & i) == 0) {
            if (l46Var.i(a26Var)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i3 |= i12;
        }
        if ((74899 & i3) != 74898) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (l46Var.W(i3 & 1, z5)) {
            l46Var.b0();
            i8 = i & 1;
            g09Var = g09.a;
            if (i8 != 0) {
                if (i13 != 0) {
                    j09Var2 = g09Var;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    f3 = 16.0f;
                }
                if ((i2 & 16) != 0) {
                    z7 = z4;
                    i9 = i3 & (-57345);
                    j09Var3 = j09Var2;
                    qy1VarU = u(l46Var);
                    f4 = f3;
                } else {
                    z7 = z4;
                    f4 = f3;
                    i9 = i3;
                    j09Var3 = j09Var2;
                    qy1VarU = qy1Var;
                }
            } else {
                if (i13 != 0) {
                    j09Var2 = g09Var;
                }
                if (i4 != 0) {
                    z4 = true;
                }
                if (i6 != 0) {
                    f3 = 16.0f;
                }
                if ((i2 & 16) != 0) {
                    z7 = z4;
                    i9 = i3 & (-57345);
                    j09Var3 = j09Var2;
                    qy1VarU = u(l46Var);
                    f4 = f3;
                } else {
                    z7 = z4;
                    f4 = f3;
                    i9 = i3;
                    j09Var3 = j09Var2;
                    qy1VarU = qy1Var;
                }
            }
            l46Var.s();
            j09 j09VarL9 = b.l(j09Var3, f4);
            y6c y6cVar9 = a7c.a;
            j09 j09VarE9 = oa7.E(j09VarL9, y6cVar9);
            if (z2) {
                j = qy1VarU.c;
            } else {
                j = qy1VarU.d;
            }
            j09 j09VarO9 = tm7.o(j09VarE9, j, g21.f);
            if (z2) {
                f5 = 1.5f;
            } else {
                f5 = 0.0f;
            }
            if (z2) {
                j2 = qy1VarU.c;
            } else {
                j2 = qy1VarU.i;
            }
            j09 j09VarW9 = db6.w(j09VarO9, f5, j2, y6cVar9);
            if ((458752 & i9) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            i10 = i9 & 14;
            if (i10 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z8 | z9;
            objR = l46Var.R();
            i11 = 3;
            i8c i8cVar9 = sf2.a;
            if (z10) {
                objR = new oy1(i11, a26Var, z2);
                l46Var.p0(objR);
            } else {
                objR = new oy1(i11, a26Var, z2);
                l46Var.p0(objR);
            }
            j09 j09VarC9 = androidx.compose.foundation.b.c(j09VarW9, z7, null, null, (x16) objR, 14);
            if (i10 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | ((((57344 & i9) ^ 24576) <= 16384 && l46Var.g(qy1VarU)) || (i9 & 24576) == 16384);
            objR2 = l46Var.R();
            if (z12) {
                objR2 = new bs0(z2, qy1VarU, i11);
                l46Var.p0(objR2);
            } else {
                objR2 = new bs0(z2, qy1VarU, i11);
                l46Var.p0(objR2);
            }
            j09 j09VarS9 = b21.s(j09VarC9, (a26) objR2);
            xn8 xn8VarC9 = s21.c(ndb.f, false);
            int iHashCode9 = Long.hashCode(l46Var.T);
            u8a u8aVarM9 = l46Var.m();
            j09 j09VarJ9 = m93.J(l46Var, j09VarS9);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC9);
            dec.l(hj6.y, l46Var, u8aVarM9);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode9));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ9);
            if (z2) {
                l46Var.f0(-1081396799);
                gx6VarB = g21.h;
                if (gx6VarB == null) {
                    fx6 fx6Var9 = new fx6("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i112 = msf.a;
                    dtd dtdVar9 = new dtd(y72.b);
                    ArrayList arrayList9 = new ArrayList(32);
                    arrayList9.add(new p1a(9.0f, 16.17f));
                    arrayList9.add(new o1a(4.83f, 12.0f));
                    arrayList9.add(new w1a(-1.42f, 1.41f));
                    arrayList9.add(new o1a(9.0f, 19.0f));
                    arrayList9.add(new o1a(21.0f, 7.0f));
                    arrayList9.add(new w1a(-1.41f, -1.41f));
                    arrayList9.add(l1a.c);
                    fx6.a(fx6Var9, arrayList9, dtdVar9, 1.0f, 1.0f, 2, 1.0f);
                    gx6VarB = fx6Var9.b();
                    g21.h = gx6VarB;
                }
                j09 j09VarZ9 = ynb.Z(d31.a.b(g09Var), 2.0f);
                long j11 = qy1VarU.a;
                qy1 qy1Var12 = qy1VarU;
                gx6 gx6Var9 = gx6VarB;
                qy1Var3 = qy1Var12;
                z13 = true;
                gu6.a(gx6Var9, null, j09VarZ9, j11, l46Var, 48, 0);
                l46Var.r(false);
            } else {
                qy1Var3 = qy1VarU;
                z13 = true;
                l46Var.f0(-1081174808);
                l46Var.r(false);
            }
            l46Var.r(z13);
            qy1Var2 = qy1Var3;
            z6 = z7;
        } else {
            l46Var.Z();
            qy1Var2 = qy1Var;
            j09Var3 = j09Var2;
            z6 = z4;
            f4 = f3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: rz1
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qk2.i(z2, j09Var3, z6, f4, qy1Var2, a26Var, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void j(int r38, defpackage.l46 r39) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk2.j(int, l46):void");
    }

    public static final void l(e89 e89Var, boolean z2) {
        e89Var.setValue(Boolean.valueOf(z2));
    }

    public static final long m(int i) {
        if (!(i > 0)) {
            l37.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final void n(j09 j09Var, final LocalDate localDate, final List list, List list2, LocalDate localDate2, LocalDate localDate3, t91 t91Var, a26 a26Var, final TarotSkinIdentify tarotSkinIdentify, final a26 a26Var2, l46 l46Var, int i) {
        int i2;
        int i3;
        Object objAtDay;
        Object objAtEndOfMonth;
        Object obj;
        a26 a26Var3;
        t2g t2gVar;
        LocalDate localDate4;
        t91 t91Var2 = t91Var;
        localDate.getClass();
        list.getClass();
        list2.getClass();
        localDate2.getClass();
        localDate3.getClass();
        t91Var2.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        l46Var.h0(405085969);
        int i4 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.i(localDate) ? 32 : 16) | (l46Var.g(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(list2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(localDate2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(localDate3) ? 131072 : 65536) | (l46Var.e(t91Var2.ordinal()) ? 1048576 : 524288) | (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 67108864 : 33554432) | (l46Var.i(a26Var2) ? 536870912 : 268435456);
        if (l46Var.W(i4 & 1, (306783379 & i4) != 306783378)) {
            boolean z2 = (i4 & 7168) == 2048;
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (z2 || objR == obj2) {
                int iF = bm8.F(t72.u(list2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF >= 16 ? iF : 16);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    DailyCard dailyCard = (DailyCard) it.next();
                    String date = dailyCard.getDate();
                    String key = dailyCard.getKey();
                    int direction = dailyCard.getDirection();
                    int i5 = i4;
                    if (direction == 0) {
                        i3 = 0;
                    } else {
                        if (direction != 1) {
                            qc0.j(tec.e(direction, "Invalid orientation value: "));
                            return;
                        }
                        i3 = 1;
                    }
                    linkedHashMap.put(date, new qhe(key, i3));
                    i4 = i5;
                }
                i2 = i4;
                l46Var.p0(linkedHashMap);
                objR = linkedHashMap;
            } else {
                i2 = i4;
            }
            final Map map = (Map) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj2) {
                objR2 = tq.s();
                l46Var.p0(objR2);
            }
            List list3 = (List) objR2;
            DayOfWeek dayOfWeekY = (DayOfWeek) s72.v0(list3);
            int i6 = i2 >> 12;
            int i7 = (i6 & 126) | ((i2 << 3) & 896);
            if (false && true) {
                YearMonth yearMonthNow = YearMonth.now();
                yearMonthNow.getClass();
                objAtDay = yearMonthNow.atDay(1);
                objAtDay.getClass();
            } else {
                objAtDay = localDate2;
            }
            if ((0 & 2) != 0) {
                objAtEndOfMonth = YearMonth.now().atEndOfMonth();
                objAtEndOfMonth.getClass();
            } else {
                objAtEndOfMonth = localDate3;
            }
            if ((0 & 4) != 0) {
                Object objNow = LocalDate.now();
                objNow.getClass();
                obj = objNow;
            } else {
                obj = localDate;
            }
            if ((0 & 8) != 0) {
                dayOfWeekY = tq.y();
            }
            Object[] objArr = {objAtDay, objAtEndOfMonth, obj, dayOfWeekY};
            vea veaVar = t2g.k;
            DayOfWeek dayOfWeek = dayOfWeekY;
            boolean zI = l46Var.i(objAtDay) | l46Var.i(objAtEndOfMonth) | l46Var.i(obj) | ((((i7 & 7168) ^ 3072) > 2048 && l46Var.e(dayOfWeek.ordinal())) || (i7 & 3072) == 2048);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj2) {
                objR3 = new zlb(objAtDay, objAtEndOfMonth, obj, dayOfWeek, 3);
                l46Var.p0(objR3);
            }
            final t2g t2gVar2 = (t2g) vfh.J(objArr, veaVar, (x16) objR3, l46Var, 0);
            YearMonth yearMonthB = tq.B(localDate2);
            YearMonth yearMonthB2 = tq.B(localDate3);
            LocalDate localDateNow = LocalDate.now();
            localDateNow.getClass();
            final r91 r91VarA0 = g21.a0(yearMonthB, yearMonthB2, tq.B(localDateNow), (DayOfWeek) s72.v0(list3), l46Var, 16);
            float fP0 = ((sw3) l46Var.k(zg2.h)).p0(48.0f);
            int i8 = i2 & 3670016;
            boolean zD = (i8 == 1048576) | l46Var.d(fP0);
            Object objR4 = l46Var.R();
            if (zD || objR4 == obj2) {
                a26Var3 = a26Var;
                objR4 = new zj6(t91Var2, fP0, a26Var3);
                l46Var.p0(objR4);
            } else {
                a26Var3 = a26Var;
            }
            j09 j09VarA = ibe.a(j09Var, t91Var2, (PointerInputEventHandler) objR4);
            Object objR5 = l46Var.R();
            if (objR5 == obj2) {
                objR5 = new oz5(22);
                l46Var.p0(objR5);
            }
            final a26 a26Var4 = a26Var3;
            kn2.c(t91Var, j09VarA, (a26) objR5, null, null, null, af1.b0(1372612080, new o26() { // from class: xj6
                @Override // defpackage.o26
                public final Object t(Object obj3, Object obj4, Object obj5, Object obj6) {
                    t91 t91Var3 = (t91) obj4;
                    l46 l46Var2 = (l46) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    ((ly) obj3).getClass();
                    t91Var3.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= l46Var2.e(t91Var3.ordinal()) ? 32 : 16;
                    }
                    int i9 = 1;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 145) != 144)) {
                        int iOrdinal = t91Var3.ordinal();
                        LocalDate localDate5 = localDate;
                        Map map2 = map;
                        a26 a26Var5 = a26Var4;
                        a26 a26Var6 = a26Var2;
                        if (iOrdinal == 0) {
                            l46Var2.f0(-897087438);
                            jgb.C(null, false, null, af1.b0(898019881, new n50(t2gVar2, localDate5, map2, a26Var5, a26Var6, 8), l46Var2), l46Var2, 3072, 7);
                            l46Var2.r(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw tec.d(525250211, l46Var2, false);
                            }
                            l46Var2.f0(-896608302);
                            boolean zG = l46Var2.g(a26Var5);
                            Object objR6 = l46Var2.R();
                            i8c i8cVar = sf2.a;
                            if (zG || objR6 == i8cVar) {
                                objR6 = new zh1(a26Var5, 21);
                                l46Var2.p0(objR6);
                            }
                            x16 x16Var = (x16) objR6;
                            boolean zI2 = l46Var2.i(localDate5) | l46Var2.g(a26Var6);
                            Object objR7 = l46Var2.R();
                            if (zI2 || objR7 == i8cVar) {
                                objR7 = new wj6(i9, a26Var6, localDate5);
                                l46Var2.p0(objR7);
                            }
                            nk8.j(null, r91VarA0, localDate5, list, map2, tarotSkinIdentify, x16Var, (a26) objR7, l46Var2, 0);
                            l46Var2.r(false);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i2 >> 18) & 14) | 1573248, 56);
            boolean zG = l46Var.g(t2gVar2) | (i8 == 1048576) | l46Var.i(localDate) | l46Var.g(r91VarA0);
            Object objR6 = l46Var.R();
            if (zG || objR6 == obj2) {
                t2gVar = t2gVar2;
                objR6 = new ak6(t91Var, t2gVar, localDate, r91VarA0, null);
                t91Var2 = t91Var;
                localDate4 = localDate;
                l46Var.p0(objR6);
            } else {
                t91Var2 = t91Var;
                localDate4 = localDate;
                t2gVar = t2gVar2;
            }
            af1.p(t91Var2, localDate4, (l26) objR6, l46Var);
            int i9 = ((i2 >> 6) & 8064) | ((i2 << 9) & 57344) | (i6 & 458752);
            r(t91Var2 == t91.a, t2gVar, localDate2, localDate3, localDate4, a26Var2, l46Var, i9);
            o(t91Var2 == t91.b, r91VarA0, localDate2, localDate3, localDate, a26Var2, l46Var, i9);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qb5(j09Var, localDate, list, list2, localDate2, localDate3, t91Var2, a26Var, tarotSkinIdentify, a26Var2, i);
        }
    }

    public static final void o(boolean z2, r91 r91Var, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, a26 a26Var, l46 l46Var, int i) {
        boolean z3;
        int i2;
        l46Var.h0(-678923402);
        if ((i & 6) == 0) {
            z3 = z2;
            i2 = (l46Var.h(z3) ? 4 : 2) | i;
        } else {
            z3 = z2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(r91Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(localDate) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(localDate2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(localDate3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(a26Var) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2;
            e89 e89VarI = q1c.i(localDate3, l46Var);
            e89 e89VarI2 = q1c.i(a26Var, l46Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = ((i3 & 14) == 4) | ((i3 & 112) == 32) | l46Var.g(e89VarI) | l46Var.i(localDate2) | l46Var.i(localDate) | l46Var.g(e89VarI2);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                Object bk6Var = new bk6(z2, r91Var, localDate2, localDate, e89VarI, e89VarI2, null);
                l46Var.p0(bk6Var);
                objR = bk6Var;
            }
            af1.p(r91Var, boolValueOf, (l26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(z2, r91Var, localDate, localDate2, localDate3, a26Var, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:124:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0202  */
    /* JADX WARN: Code duplicated, block: B:127:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x0221  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x014f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:91:0x0172  */
    /* JADX WARN: Code duplicated, block: B:92:0x0174  */
    /* JADX WARN: Code duplicated, block: B:95:0x0184  */
    /* JADX WARN: Code duplicated, block: B:96:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(final String str, final j09 j09Var, final a26 a26Var, a26 a26Var2, a26 a26Var3, x16 x16Var, l46 l46Var, final int i, final int i2) {
        a26 a26Var4;
        int i3;
        a26 a26Var5;
        int i4;
        int i5;
        int i6;
        x16 x16Var2;
        int i7;
        int i8;
        final char c2;
        final int i9;
        boolean z2;
        final x16 x16Var3;
        final a26 a26Var6;
        final a26 a26Var7;
        ojb ojbVarV;
        Object obj;
        final a26 a26Var8;
        a26 a26Var9;
        final x16 x16Var4;
        a26 a26Var10;
        Context context;
        Object objR;
        Object obj2;
        WebView webView;
        Object objR2;
        Object obj3;
        final i0g i0gVar;
        boolean zI;
        Object obj4;
        Object objP;
        boolean zI2;
        Object obj5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objR3;
        int i10;
        boolean z7;
        Object obj6;
        int i11;
        boolean z8;
        char c3;
        int i12;
        Object obj7;
        ojb ojbVarV2;
        Object objR4;
        Object obj8;
        Object objR5;
        Object obj9;
        str.getClass();
        l46Var.h0(-343006602);
        int i13 = 4;
        int i14 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.g(j09Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i15 = i2 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                a26Var4 = a26Var2;
                i14 |= l46Var.i(a26Var4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 = i2 & 16;
            if (i3 != 0) {
                if ((i & 24576) == 0) {
                    a26Var5 = a26Var3;
                    if (l46Var.i(a26Var5)) {
                        i4 = 16384;
                    } else {
                        i4 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i14 |= i4;
                }
                i5 = 196608 | i14;
                i6 = i2 & 64;
                if (i6 != 0) {
                    i8 = i14 | 1769472;
                    x16Var2 = x16Var;
                } else {
                    x16Var2 = x16Var;
                    if (l46Var.i(x16Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i8 = i5 | i7;
                }
                c2 = 1;
                i9 = 0;
                if ((i8 & 599187) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i8 & 1, z2)) {
                    obj = sf2.a;
                    if (i15 != 0) {
                        objR5 = l46Var.R();
                        if (objR5 == obj) {
                            obj9 = objR5;
                            Object zeaVar = new zea(29);
                            l46Var.p0(zeaVar);
                            obj9 = zeaVar;
                        }
                        obj9 = objR5;
                        a26Var8 = (a26) obj9;
                    } else {
                        a26Var8 = a26Var4;
                    }
                    if (i3 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            obj8 = objR4;
                            Object z8bVar = new z8b(i9);
                            l46Var.p0(z8bVar);
                            obj8 = z8bVar;
                        }
                        obj8 = objR4;
                        a26Var9 = (a26) obj8;
                    } else {
                        a26Var9 = a26Var5;
                    }
                    if (i6 != 0) {
                        x16Var2 = null;
                    }
                    x16Var4 = x16Var2;
                    if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                        ojbVarV2 = l46Var.v();
                        if (ojbVarV2 != null) {
                            final int i16 = 0;
                            final a26 a26Var11 = a26Var9;
                            ojbVarV2.d = new l26() { // from class: a9b
                                @Override // defpackage.l26
                                public final Object z(Object obj10, Object obj11) {
                                    int i17 = i16;
                                    wef wefVar = wef.a;
                                    int i18 = i;
                                    switch (i17) {
                                        case 0:
                                            ((Integer) obj11).getClass();
                                            int iP = k99.P(i18 | 1);
                                            qk2.p(str, j09Var, a26Var, a26Var8, a26Var11, x16Var4, (l46) obj10, iP, i2);
                                            break;
                                        default:
                                            ((Integer) obj11).getClass();
                                            int iP2 = k99.P(i18 | 1);
                                            qk2.p(str, j09Var, a26Var, a26Var8, a26Var11, x16Var4, (l46) obj10, iP2, i2);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    a26Var10 = a26Var8;
                    context = (Context) l46Var.k(uq.b);
                    objR = l46Var.R();
                    if (objR == obj) {
                        obj2 = objR;
                        Object webView2 = new WebView(context);
                        l46Var.p0(webView2);
                        obj2 = webView2;
                    }
                    obj2 = objR;
                    webView = (WebView) obj2;
                    objR2 = l46Var.R();
                    obj3 = objR2;
                    if (objR2 == obj) {
                        Object i0gVar2 = new i0g();
                        l46Var.p0(i0gVar2);
                        obj3 = i0gVar2;
                    }
                    i0gVar = (i0g) obj3;
                    af afVar = new af(i13);
                    zI = l46Var.i(i0gVar);
                    Object objR6 = l46Var.R();
                    obj4 = objR6;
                    if (zI || objR6 == obj) {
                        Object obj10 = new a26() { // from class: b9b
                            @Override // defpackage.a26
                            public final Object d(Object obj11) {
                                Uri[] uriArr;
                                int i17 = i9;
                                i0g i0gVar3 = i0gVar;
                                switch (i17) {
                                    case 0:
                                        xe xeVar = (xe) obj11;
                                        xeVar.getClass();
                                        int i18 = xeVar.a;
                                        Intent intent = xeVar.b;
                                        d9b d9bVar = d9b.a;
                                        z8b z8bVar2 = new z8b(1);
                                        i0gVar3.getClass();
                                        try {
                                            uriArr = (Uri[]) d9bVar.z(Integer.valueOf(i18), intent);
                                            break;
                                        } catch (Exception e2) {
                                            z8bVar2.d(e2);
                                            uriArr = null;
                                        }
                                        i0gVar3.a(uriArr);
                                        return wef.a;
                                    default:
                                        ((ra4) obj11).getClass();
                                        return new lf(18, i0gVar3);
                                }
                            }
                        };
                        l46Var.p0(obj10);
                        obj4 = obj10;
                    }
                    objP = qn4.P(afVar, (a26) obj4, l46Var);
                    zI2 = l46Var.i(i0gVar);
                    Object objR7 = l46Var.R();
                    obj5 = objR7;
                    if (zI2 || objR7 == obj) {
                        Object obj11 = new a26() { // from class: b9b
                            @Override // defpackage.a26
                            public final Object d(Object obj12) {
                                Uri[] uriArr;
                                int i17 = c2;
                                i0g i0gVar3 = i0gVar;
                                switch (i17) {
                                    case 0:
                                        xe xeVar = (xe) obj12;
                                        xeVar.getClass();
                                        int i18 = xeVar.a;
                                        Intent intent = xeVar.b;
                                        d9b d9bVar = d9b.a;
                                        z8b z8bVar2 = new z8b(1);
                                        i0gVar3.getClass();
                                        try {
                                            uriArr = (Uri[]) d9bVar.z(Integer.valueOf(i18), intent);
                                            break;
                                        } catch (Exception e2) {
                                            z8bVar2.d(e2);
                                            uriArr = null;
                                        }
                                        i0gVar3.a(uriArr);
                                        return wef.a;
                                    default:
                                        ((ra4) obj12).getClass();
                                        return new lf(18, i0gVar3);
                                }
                            }
                        };
                        l46Var.p0(obj11);
                        obj5 = obj11;
                    }
                    af1.g(i0gVar, (a26) obj5, l46Var);
                    boolean zI3 = l46Var.i(webView);
                    if ((i8 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z9 = zI3 | z3;
                    if ((57344 & i8) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean zI4 = z9 | z4 | l46Var.i(i0gVar) | l46Var.i(objP);
                    if ((i8 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | zI4;
                    objR3 = l46Var.R();
                    if (!z6 || objR3 == obj) {
                        i10 = i8;
                        Object k11Var = new k11(webView, a26Var, str, a26Var9, i0gVar, objP, 7);
                        l46Var.p0(k11Var);
                        objR3 = k11Var;
                    } else {
                        i10 = i8;
                    }
                    a26 a26Var12 = (a26) objR3;
                    if ((i10 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b8: MOVE (r11v2 'z7' boolean) = (r0v15 boolean) (LINE:441) in method: qk2.p(java.lang.String, j09, a26, a26, a26, x16, l46, int, int):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v15 boolean
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 564
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk2.p(java.lang.String, j09, a26, a26, a26, x16, l46, int, int):void");
                    }

                    public static final void q(int i, l46 l46Var) {
                        l46Var.h0(-2004247593);
                        if (l46Var.W(i & 1, i != 0)) {
                            Object objK = l46Var.k(uq.b);
                            Activity activity = objK instanceof Activity ? (Activity) objK : null;
                            h9g h9gVarX = g21.x(l46Var);
                            boolean zG = l46Var.g(h9gVarX) | l46Var.i(activity);
                            Object objR = l46Var.R();
                            Object obj = sf2.a;
                            if (zG || objR == obj) {
                                objR = new mf2(h9gVarX, activity, null);
                                l46Var.p0(objR);
                            }
                            af1.o((l26) objR, l46Var, h9gVarX);
                            boolean zI = l46Var.i(activity);
                            Object objR2 = l46Var.R();
                            if (zI || objR2 == obj) {
                                objR2 = new ot1(2, activity);
                                l46Var.p0(objR2);
                            }
                            af1.g(wef.a, (a26) objR2, l46Var);
                        } else {
                            l46Var.Z();
                        }
                        ojb ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new he2(i, 24);
                        }
                    }

                    public static final void r(boolean z2, t2g t2gVar, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, a26 a26Var, l46 l46Var, int i) {
                        boolean z3;
                        int i2;
                        l46Var.h0(827120338);
                        if ((i & 6) == 0) {
                            z3 = z2;
                            i2 = (l46Var.h(z3) ? 4 : 2) | i;
                        } else {
                            z3 = z2;
                            i2 = i;
                        }
                        if ((i & 48) == 0) {
                            i2 |= l46Var.g(t2gVar) ? 32 : 16;
                        }
                        if ((i & 384) == 0) {
                            i2 |= l46Var.i(localDate) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= l46Var.i(localDate2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        if ((i & 24576) == 0) {
                            i2 |= l46Var.i(localDate3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        if ((196608 & i) == 0) {
                            i2 |= l46Var.i(a26Var) ? 131072 : 65536;
                        }
                        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
                            int i3 = i2;
                            e89 e89VarI = q1c.i(localDate3, l46Var);
                            e89 e89VarI2 = q1c.i(a26Var, l46Var);
                            Boolean boolValueOf = Boolean.valueOf(z3);
                            boolean zG = ((i3 & 14) == 4) | ((i3 & 112) == 32) | l46Var.g(e89VarI) | l46Var.i(localDate) | l46Var.i(localDate2) | l46Var.g(e89VarI2);
                            Object objR = l46Var.R();
                            if (zG || objR == sf2.a) {
                                Object dk6Var = new dk6(z2, t2gVar, localDate, localDate2, e89VarI, e89VarI2, null);
                                l46Var.p0(dk6Var);
                                objR = dk6Var;
                            }
                            af1.p(t2gVar, boolValueOf, (l26) objR, l46Var);
                        } else {
                            l46Var.Z();
                        }
                        ojb ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new tg(z2, t2gVar, localDate, localDate2, localDate3, a26Var, i, 6);
                        }
                    }

                    public static void t(Context context) {
                        if (F0 == null) {
                            jzf jzfVar = new jzf(context);
                            F0 = jzfVar;
                            synchronized (jzfVar.a) {
                                jzfVar.g = true;
                            }
                        }
                    }

                    public static final qy1 u(l46 l46Var) {
                        long j;
                        long j2;
                        pr4 pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-335255088);
                            j = ((m82) l46Var.k(o82.a)).a;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-335253673);
                            j = ((e8b) l46Var.k(pr4Var)).q;
                            l46Var.r(false);
                        }
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-335250087);
                            j2 = ((m82) l46Var.k(o82.a)).v;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-335248392);
                            j2 = ((e8b) l46Var.k(pr4Var)).a;
                            l46Var.r(false);
                        }
                        qy1 qy1VarN = an1.n(j, 0L, j2, l46Var, 58);
                        int i = g82.z;
                        return qy1VarN.b(qy1VarN.a, qy1VarN.b, (4091 & 4) != 0 ? qy1VarN.c : 0L, qy1VarN.d, qy1VarN.e, qy1VarN.f, qy1VarN.g, qy1VarN.h, (4091 & 256) != 0 ? qy1VarN.i : ((e8b) l46Var.k(pr4Var)).z, qy1VarN.j, qy1VarN.k, qy1VarN.l);
                    }

                    public static void v(Intent intent) {
                        synchronized (E0) {
                            try {
                                if (F0 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                                    F0.c();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    public static long w(int i, q2g q2gVar) {
                        int i2 = d13.a[q2gVar.ordinal()];
                        int i3 = -1;
                        if (i2 != -1) {
                            i3 = 1;
                            if (i2 == 1) {
                                i3 = 0;
                            } else if (i2 != 2) {
                                ap.c();
                                return 0L;
                            }
                        }
                        return (((long) i) << 32) | (((long) i3) & 4294967295L);
                    }

                    public static void x(zd5 zd5Var, e1a e1aVar) {
                        if (zd5Var.G(e1aVar)) {
                            return;
                        }
                        try {
                            zd5Var.g0(e1aVar, false).close();
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused) {
                        }
                    }

                    public static final void y(zd5 zd5Var, e1a e1aVar) throws IOException {
                        try {
                            IOException iOException = null;
                            for (e1a e1aVar2 : zd5Var.N(e1aVar)) {
                                try {
                                    if (zd5Var.R(e1aVar2).c) {
                                        y(zd5Var, e1aVar2);
                                    }
                                    zd5Var.x(e1aVar2);
                                } catch (IOException e2) {
                                    if (iOException == null) {
                                        iOException = e2;
                                    }
                                }
                            }
                            if (iOException != null) {
                                throw iOException;
                            }
                        } catch (FileNotFoundException unused) {
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x001d  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
                    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
                    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
                    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
                    /* JADX WARN: Code duplicated, block: B:44:0x008f A[EDGE_INSN: B:44:0x008f->B:40:0x008f BREAK  A[LOOP:0: B:10:0x0011->B:48:?], SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:50:0x008c A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:51:0x0077 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:54:0x0070 A[SYNTHETIC] */
                    public static final List z(u5c u5cVar, int i, int i2) {
                        LinkedHashMap linkedHashMap;
                        TreeMap treeMap;
                        iy9 iy9Var;
                        Iterator it;
                        boolean z2;
                        int iIntValue;
                        TreeMap treeMap2;
                        if (i == i2) {
                            return pu4.a;
                        }
                        boolean z3 = i2 > i;
                        ArrayList arrayList = new ArrayList();
                        do {
                            if (!z3) {
                                if (i <= i2) {
                                    return arrayList;
                                }
                                linkedHashMap = u5cVar.a;
                                if (z3) {
                                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                                    if (treeMap2 == null) {
                                        iy9Var = null;
                                    } else {
                                        iy9Var = new iy9(treeMap2, treeMap2.descendingKeySet());
                                    }
                                } else {
                                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                                    if (treeMap == null) {
                                        iy9Var = null;
                                    } else {
                                        iy9Var = new iy9(treeMap, treeMap.keySet());
                                    }
                                }
                                if (iy9Var == null) {
                                    Map map = (Map) iy9Var.a();
                                    it = ((Iterable) iy9Var.b()).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            z2 = false;
                                            break;
                                            break;
                                        }
                                        iIntValue = ((Number) it.next()).intValue();
                                        if (!z3) {
                                            if (i + 1 <= iIntValue) {
                                                continue;
                                            }
                                        } else if (i2 <= iIntValue) {
                                            continue;
                                        }
                                    }
                                } else {
                                    break;
                                    break;
                                }
                            } else {
                                if (i >= i2) {
                                    return arrayList;
                                }
                                linkedHashMap = u5cVar.a;
                                if (z3) {
                                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                                    if (treeMap2 == null) {
                                        iy9Var = null;
                                    } else {
                                        iy9Var = new iy9(treeMap2, treeMap2.descendingKeySet());
                                    }
                                } else {
                                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                                    if (treeMap == null) {
                                        iy9Var = null;
                                    } else {
                                        iy9Var = new iy9(treeMap, treeMap.keySet());
                                    }
                                }
                                if (iy9Var == null) {
                                    Map map2 = (Map) iy9Var.a();
                                    it = ((Iterable) iy9Var.b()).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            z2 = false;
                                            break;
                                        }
                                        iIntValue = ((Number) it.next()).intValue();
                                        if (!z3) {
                                            if (i2 <= iIntValue && iIntValue < i) {
                                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                                obj.getClass();
                                                arrayList.add(obj);
                                                z2 = true;
                                                i = iIntValue;
                                                break;
                                                break;
                                            }
                                        } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                                            obj2.getClass();
                                            arrayList.add(obj2);
                                            z2 = true;
                                            i = iIntValue;
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                        } while (z2);
                        return null;
                    }

                    public abstract View H(int i);

                    public abstract boolean I();

                    public abstract String s();

                    public String toString() {
                        switch (this.a) {
                            case 22:
                                return s();
                            default:
                                return super.toString();
                        }
                    }
                }
