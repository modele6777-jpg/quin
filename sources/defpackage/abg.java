package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.account.navigation.AuthNavigation$AuthRoute;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import ai.askquin.ui.router.GiftCardFixtureScenario;
import ai.askquin.ui.router.GiftCardPerspective;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class abg {
    public static final dd2 a = new dd2(new ym0(11), false, 712644332);
    public static final dd2 b = new dd2(new md2(20), false, -3836122);
    public static final dd2 c = new dd2(new xd2(0), false, 397468332);
    public static final dd2 d = new dd2(new md2(21), false, 1458523548);
    public static final dd2 e = new dd2(new md2(22), false, 730376826);
    public static final dd2 f = new dd2(new de2(7), false, -2146810918);
    public static final dd2 g = new dd2(new he2(19), false, -1759434350);
    public static final StackTraceElement[] h = new StackTraceElement[0];
    public static final Object i = new Object();

    public static final Method A(ym7 ym7Var) {
        sa1 sa1VarH;
        ym7Var.getClass();
        wnb wnbVarA = sqf.a(ym7Var);
        Member memberB = (wnbVarA == null || (sa1VarH = wnbVarA.h()) == null) ? null : sa1VarH.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static Object B(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        s8f.c();
        return null;
    }

    public static Object C(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return q6.r(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static long D(double d2) {
        pa7.z("not a normal value", G(d2));
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static j09 E(j09 j09Var, t69 t69Var) {
        return j09Var.D(new ar6(t69Var));
    }

    public static boolean F() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Blu")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Blu")) {
                return false;
            }
        }
        return "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean G(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static boolean H() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Itel")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Itel")) {
                return false;
            }
        }
        return "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static final boolean I(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    public static boolean J() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Positivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Positivo")) {
                return false;
            }
        }
        return "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static final boolean K(String str) {
        Double dS;
        if (!L(str) || (dS = b5e.s(str)) == null) {
            return false;
        }
        double dDoubleValue = dS.doubleValue();
        return Math.abs(dDoubleValue) <= Double.MAX_VALUE && dDoubleValue >= 0.0d;
    }

    public static final boolean L(String str) {
        return !v4e.Q(str) && str.length() <= 128;
    }

    public static boolean M() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return c5e.v(Build.DEVICE, "m55xq", true);
    }

    public static final boolean N(pu1 pu1Var) {
        pu1Var.getClass();
        return pu1Var == pu1.College || pu1Var == pu1.MiddleSchoolStudent;
    }

    public static boolean O() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Vivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Vivo")) {
                return false;
            }
        }
        return "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static final float P(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int Q(float f2, int i2, int i3) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static final long R(long j, long j2, float f2) {
        km9 km9Var = s82.x;
        long jA = y72.a(j, km9Var);
        long jA2 = y72.a(j2, km9Var);
        float fC = y72.c(jA);
        float fG = y72.g(jA);
        float f3 = y72.f(jA);
        float fD = y72.d(jA);
        float fC2 = y72.c(jA2);
        float fG2 = y72.g(jA2);
        float f4 = y72.f(jA2);
        float fD2 = y72.d(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return y72.a(l(P(fG, fG2, f2), P(f3, f4, f2), P(fD, fD2, f2), P(fC, fC2, f2), km9Var), y72.e(j2));
    }

    public static final em7 S(ClassLoader classLoader, String str, boolean z) {
        Class cls;
        str.getClass();
        Class clsL = sqf.l(classLoader, b0(str), 0);
        if (clsL == null) {
            return null;
        }
        if (!z && (cls = (Class) smb.b.get(clsL)) != null) {
            clsL = cls;
        }
        return job.a.b(clsL);
    }

    public static final float T(long j) {
        p82 p82VarE = y72.e(j);
        if (!cgg.y(p82VarE.b, 12884901888L)) {
            h37.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(cgg.R(p82VarE.b)));
        }
        r3c r3cVar = ((x3c) p82VarE).p;
        double dB = r3cVar.b(y72.g(j));
        float fB = (float) ((r3cVar.b(y72.d(j)) * 0.0722d) + (r3cVar.b(y72.f(j)) * 0.7152d) + (dB * 0.2126d));
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        if (fB > 1.0f) {
            return 1.0f;
        }
        return fB;
    }

    public static final int U(eza ezaVar) {
        int i2 = ezaVar == null ? -1 : r0b.a[ezaVar.ordinal()];
        if (i2 != 1) {
            int i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                    }
                }
            }
            return i3;
        }
        return 1;
    }

    public static final j09 V(j09 j09Var, boolean z, long j, y6c y6cVar, l46 l46Var, int i2) {
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new l89(null);
            l46Var.p0(objR);
        }
        l89 l89Var = (l89) objR;
        l89Var.c.b(8, z);
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = (((i2 & 896) ^ 384) > 256 && l46Var.f(j)) || (i2 & 384) == 256;
        if ((((i2 & 7168) ^ 3072) <= 2048 || !l46Var.g(y6cVar)) && (i2 & 3072) != 2048) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objR2 = l46Var.R();
        if (z4 || objR2 == i8cVar) {
            objR2 = new eh3(y6cVar, j, i3);
            l46Var.p0(objR2);
        }
        return aic.q(j09Var, l89Var, (p5e) objR2);
    }

    public static void W(List list, npa npaVar, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (npaVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    public static final Annotation X(mp7 mp7Var, ClassLoader classLoader) {
        mp7Var.getClass();
        String str = mp7Var.a;
        Class clsL = sqf.l(classLoader, b0(str), 0);
        if (clsL == null) {
            throw new pt7("Annotation class not found: ".concat(str));
        }
        Map map = mp7Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Y((gq7) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) an1.s(clsL, linkedHashMap);
    }

    public static final Object Y(gq7 gq7Var, String str, String str2, ClassLoader classLoader) {
        List parameters;
        yn7 yn7VarU;
        if (gq7Var instanceof np7) {
            return X(((np7) gq7Var).a, classLoader);
        }
        int i2 = 0;
        if (gq7Var instanceof op7) {
            op7 op7Var = (op7) gq7Var;
            String str3 = op7Var.a;
            em7 em7VarS = S(classLoader, str3, false);
            if (em7VarS == null) {
                throw new pt7("Unresolved class: ".concat(str3));
            }
            Class clsR = af1.R(em7VarS);
            int i3 = op7Var.b;
            while (i2 < i3) {
                clsR = sqf.e(clsR);
                i2++;
            }
            return clsR;
        }
        Object obj = null;
        if (gq7Var instanceof pp7) {
            em7 em7VarS2 = S(classLoader, str, false);
            if (em7VarS2 != null) {
                if (!af1.R(em7VarS2).isAnnotation()) {
                    em7VarS2 = null;
                }
                if (em7VarS2 != null) {
                    ym7 ym7Var = (ym7) s72.Y0(em7VarS2.k());
                    if (ym7Var != null && (parameters = ym7Var.getParameters()) != null) {
                        Iterator it = parameters.iterator();
                        boolean z = false;
                        Object obj2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                if (!z) {
                                    break;
                                }
                                break;
                            }
                            Object next = it.next();
                            if (pa7.t(((aob) next).getName(), str2)) {
                                if (!z) {
                                    z = true;
                                    obj2 = next;
                                }
                            }
                            obj2 = null;
                            break;
                        }
                        aob aobVar = (aob) obj2;
                        if (aobVar != null && (yn7VarU = aobVar.u()) != null) {
                            um7 um7VarB = yn7VarU.B();
                            em7 em7Var = um7VarB instanceof em7 ? (em7) um7VarB : null;
                            if (em7Var == null) {
                                ho7.m(yn7VarU, "Array parameter type is not a class: ");
                                return null;
                            }
                            Class clsR2 = af1.R(em7Var);
                            Class<?> componentType = pa7.t(clsR2.getComponentType(), em7.class) ? Class.class : clsR2.getComponentType();
                            ArrayList arrayList = ((pp7) gq7Var).a;
                            Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Array.set(objNewInstance, i2, Y((gq7) it2.next(), str, null, classLoader));
                                i2++;
                            }
                            objNewInstance.getClass();
                            return objNewInstance;
                        }
                    }
                    throw new pt7(ub3.k("No parameter ", str2, " found in annotation constructor of ", str));
                }
            }
            throw new pt7("Not an annotation class: ".concat(str));
        }
        if (!(gq7Var instanceof up7)) {
            if (gq7Var instanceof xp7) {
                String str4 = ((xp7) gq7Var).a;
                Class clsL = sqf.l(classLoader, b0(str4), 0);
                if (clsL != null) {
                    return clsL;
                }
                throw new pt7("Unresolved class: ".concat(str4));
            }
            if (gq7Var instanceof cq7) {
                return Byte.valueOf(((cq7) gq7Var).a);
            }
            if (gq7Var instanceof fq7) {
                return Short.valueOf(((fq7) gq7Var).a);
            }
            if (gq7Var instanceof dq7) {
                return Integer.valueOf(((dq7) gq7Var).a);
            }
            if (gq7Var instanceof eq7) {
                return Long.valueOf(((eq7) gq7Var).a);
            }
            if (gq7Var instanceof yp7) {
                return ((yp7) gq7Var).a();
            }
            ap.c();
            return null;
        }
        up7 up7Var = (up7) gq7Var;
        String str5 = up7Var.b;
        String str6 = up7Var.a;
        Class clsL2 = sqf.l(classLoader, b0(str6), 0);
        if (clsL2 == null) {
            throw new pt7("Unresolved enum class: ".concat(str6));
        }
        Object[] enumConstants = clsL2.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        boolean z2 = false;
        Object obj3 = null;
        while (true) {
            if (i2 >= length) {
                if (!z2) {
                    break;
                }
                obj = obj3;
                break;
            }
            Object obj4 = enumConstants[i2];
            obj4.getClass();
            if (pa7.t(((Enum) obj4).name(), str5)) {
                if (z2) {
                    break;
                }
                z2 = true;
                obj3 = obj4;
            }
            i2++;
        }
        if (obj != null) {
            return obj;
        }
        throw new pt7("Unresolved enum entry: " + str6 + '.' + str5);
    }

    public static final int Z(long j) {
        float[] fArr = s82.a;
        return (int) (y72.a(j, s82.e) >>> 32);
    }

    public static final void a(cb9 cb9Var, l26 l26Var, x16 x16Var, boolean z, a26 a26Var, l46 l46Var, int i2) {
        cb9 cb9Var2;
        cb9 cb9VarD0;
        int i3;
        l26Var.getClass();
        x16Var.getClass();
        l46Var.h0(162744769);
        int i4 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(l26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                cb9VarD0 = g21.d0(new fc9[0], l46Var);
                eec.b(cb9VarD0, l46Var, 0);
                i3 = i4 & (-15);
            } else {
                l46Var.Z();
                i3 = i4 & (-15);
                cb9VarD0 = cb9Var;
            }
            l46Var.s();
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            qmf qmfVar = (qmf) z5c.G(job.a.b(qmf.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            ql0 ql0Var = (ql0) qmfVar.v.getValue();
            boolean zI = ((i3 & 112) == 32) | l46Var.i(qmfVar) | l46Var.i(cb9VarD0);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                objR = new il0(qmfVar, l26Var, cb9VarD0, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, ql0Var);
            AuthNavigation$AuthRoute authNavigation$AuthRoute = AuthNavigation$AuthRoute.INSTANCE;
            boolean zI2 = ((i3 & 896) == 256) | l46Var.i(qmfVar) | l46Var.i(cb9VarD0) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == obj) {
                Object fl0Var = new fl0(qmfVar, cb9VarD0, x16Var, z, a26Var, 0);
                l46Var.p0(fl0Var);
                objR2 = fl0Var;
            }
            an1.g(cb9VarD0, authNavigation$AuthRoute, null, null, null, null, null, null, null, (a26) objR2, l46Var, 48, 2044);
            cb9Var2 = cb9VarD0;
        } else {
            l46Var.Z();
            cb9Var2 = cb9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(cb9Var2, l26Var, x16Var, z, a26Var, i2);
        }
    }

    public static final Bitmap.Config a0(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final long b(float f2, float f3, float f4, float f5, p82 p82Var) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (p82Var.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = y72.l;
            return j;
        }
        if (((int) (p82Var.b >> 32)) != 3) {
            h37.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = p82Var.c;
        if (i25 == -1) {
            h37.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = p82Var.b(0);
        float fA3 = p82Var.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s = (short) i4;
                    fB = p82Var.b(1);
                    fA = p82Var.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s2 = (short) i11;
                                fB2 = p82Var.b(2);
                                fA2 = p82Var.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s3 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j2 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = y72.l;
                                            return j2;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | 8388608) >> (1 - i16);
                                            if ((i20 & 4096) != 0) {
                                                i20 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s4 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j3 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = y72.l;
                                return j3;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s5 = (short) i11;
                    fB2 = p82Var.b(2);
                    fA2 = p82Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s6 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = y72.l;
                                return j4;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s7 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j5 = (((long) i25) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = y72.l;
                    return j5;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i2);
                    if ((i35 & 4096) != 0) {
                        i35 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s8 = (short) i4;
        fB = p82Var.b(1);
        fA = p82Var.a(1);
        if (f3 >= fB) {
            fB = f3;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s9 = (short) i11;
                    fB2 = p82Var.b(2);
                    fA2 = p82Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s10 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j6 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = y72.l;
                                return j6;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s11 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j7 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = y72.l;
                    return j7;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s12 = (short) i11;
        fB2 = p82Var.b(2);
        fA2 = p82Var.a(2);
        if (f4 >= fB2) {
            fB2 = f4;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s13 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = y72.l;
                    return j8;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s14 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j9 = (((long) i25) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = y72.l;
        return j9;
    }

    public static final j22 b0(String str) {
        str.getClass();
        boolean zC = c5e.C(str, ".", false);
        if (zC) {
            str = str.substring(1);
        }
        int iS = v4e.S(str, '/', 0, 6);
        String strReplace = (iS == -1 ? "" : str.substring(0, iS)).replace('/', '.');
        strReplace.getClass();
        return new j22(new dx5(strReplace), new dx5(v4e.g0('/', str, str)), zC);
    }

    public static final long c(int i2) {
        long j = ((long) i2) << 32;
        int i3 = y72.l;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x025d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0260  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[LOOP:0: B:31:0x00dd->B:33:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0134  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:58:0x016f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0204  */
    /* JADX WARN: Code duplicated, block: B:84:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [x16] */
    public static final j2 c0(wq7 wq7Var, ClassLoader classLoader, g8f g8fVar, boolean z, x16 x16Var) throws Throwable {
        um7 um7VarA;
        um7 um7VarB;
        ArrayList arrayList;
        Iterator it;
        wq7 wq7Var2;
        j2 j2VarD0;
        wn7[] wn7VarArr;
        bzd bzdVarA;
        iq7 iq7Var;
        String str;
        a90 a90Var;
        bzd bzdVarA2;
        iq7 iq7Var2;
        j69 j69VarD;
        Throwable th;
        rq7 rq7Var;
        Throwable th2;
        Object obj;
        Object obj2;
        ljd ljdVar;
        boolean z2;
        List list;
        do7 do7Var;
        ljd ljdVar2;
        StringBuilder sb;
        Object obj3;
        yn7 yn7Var;
        do7 do7Var2;
        yn7 yn7Var2;
        String str2;
        wq7Var.getClass();
        ArrayList arrayList2 = wq7Var.g;
        g8fVar.getClass();
        mmb mmbVar = new mmb();
        List listA = fyc.A(new ie5(new zi5(fyc.u(zo1.S0, wq7Var), zo1.T0, iyc.a), new yt2(classLoader, g8fVar, x16Var, mmbVar, 0)));
        bzd bzdVarA3 = wq7Var.a();
        a90 a90Var2 = si0.w;
        wn7[] wn7VarArr2 = si0.a;
        boolean z3 = a90Var2.F(wn7VarArr2[49], wq7Var) || z;
        if (bzdVarA3 instanceof iq7) {
            String str3 = ((iq7) bzdVarA3).o;
            if (pa7.t(str3, "kotlin/Array")) {
                yn7 yn7Var3 = ((do7) s72.X0(listA)).b;
                if (yn7Var3 == null) {
                    yn7Var3 = qyd.a;
                }
                um7VarB = job.a.b(sqf.e(af1.R(pa7.V(yn7Var3))));
            } else {
                um7VarA = S(classLoader, str3, z3);
                if (um7VarA == null) {
                    throw new pt7("Class not found: ".concat(str3));
                }
            }
            boolean zF = a90Var2.F(wn7VarArr2[49], wq7Var);
            qq7 qq7Var = yl7.c;
            qq7Var.getClass();
            ArrayList arrayList3 = ((yl7) y7h.N(arrayList2, qq7Var)).b;
            arrayList = new ArrayList(t72.u(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(X((mp7) it.next(), classLoader));
            }
            wq7Var2 = wq7Var.d;
            if (wq7Var2 != null) {
                j2VarD0 = d0(wq7Var2, classLoader, g8fVar, null, 12);
            } else {
                j2VarD0 = null;
            }
            a90 a90Var3 = si0.y;
            wn7VarArr = si0.a;
            boolean zF2 = a90Var3.F(wn7VarArr[51], wq7Var);
            bzdVarA = wq7Var.a();
            if (bzdVarA instanceof iq7) {
                iq7Var = (iq7) bzdVarA;
            } else {
                iq7Var = null;
            }
            if (iq7Var != null) {
                str = iq7Var.o;
            } else {
                str = null;
            }
            boolean zT = pa7.t(str, "kotlin/Nothing");
            a90Var = si0.x;
            boolean zF3 = a90Var.F(wn7VarArr[50], wq7Var);
            bzdVarA2 = wq7Var.a();
            if (bzdVarA2 instanceof iq7) {
                iq7Var2 = (iq7) bzdVarA2;
            } else {
                iq7Var2 = null;
            }
            if (iq7Var2 != null || (str2 = iq7Var2.o) == null) {
                j69VarD = null;
            } else {
                j22 j22VarB0 = b0(str2);
                if (qf7.l.containsKey(j22VarB0)) {
                    j69VarD = urg.D(j22VarB0.a(), (em7) um7VarB);
                } else {
                    j69VarD = null;
                }
            }
            mmbVar.element = new ljd(um7VarB, listA, zF, arrayList, j2VarD0, zF2, zT, zF3, j69VarD, x16Var);
            if (a90Var.F(wn7VarArr[50], wq7Var)) {
                obj2 = mmbVar.element;
                if (obj2 != null) {
                    pa7.g0("result");
                    throw null;
                }
                ljdVar = (ljd) obj2;
                z2 = ljdVar.w;
                list = ljdVar.c;
                if (z2) {
                    ho7.y(ljdVar, "Not a suspend function type: ");
                    return null;
                }
                do7Var = (do7) s72.y0(list.size() - 2, list);
                if (do7Var != null || (yn7Var = do7Var.b) == null || !pa7.t(yn7Var.B(), job.a.b(xn2.class)) || (do7Var2 = (do7) s72.Z0(yn7Var.A())) == null || (yn7Var2 = do7Var2.b) == null) {
                    th = null;
                    ljdVar2 = null;
                } else {
                    um7 um7Var = ljdVar.b;
                    List listS0 = s72.s0(2, list);
                    do7 do7Var3 = do7.c;
                    th = null;
                    ljdVar2 = new ljd(um7Var, s72.R0(listS0, db6.b0(yn7Var2)), ljdVar.d, ljdVar.e, ljdVar.f, ljdVar.g, ljdVar.v, true, ljdVar.x, x16Var);
                }
                if (ljdVar2 == null) {
                    sb = new StringBuilder("Invalid suspend function type: ");
                    obj3 = mmbVar.element;
                    if (obj3 == null) {
                        pa7.g0("result");
                        throw th;
                    }
                    sb.append((ljd) obj3);
                    throw new pt7(sb.toString());
                }
                mmbVar.element = ljdVar2;
            } else {
                th = null;
            }
            rq7Var = wq7Var.f;
            if (rq7Var != null || !pa7.t(rq7Var.b, "kotlin.jvm.PlatformType")) {
                th2 = th;
                obj = mmbVar.element;
                if (obj != null) {
                    return (ljd) obj;
                }
                pa7.g0("result");
                throw th2;
            }
            Object obj4 = mmbVar.element;
            if (obj4 == null) {
                pa7.g0("result");
                throw null;
            }
            ljd ljdVar3 = (ljd) obj4;
            j2 j2VarD1 = d0(rq7Var.a, classLoader, g8fVar, th, 12);
            qq7 qq7Var2 = yl7.c;
            qq7Var2.getClass();
            boolean z4 = ((yl7) y7h.N(arrayList2, qq7Var2)).a;
            j2VarD1.getClass();
            return ljdVar3.equals(j2VarD1) ? ljdVar3 : new aj5(ljdVar3, j2VarD1, z4, x16Var);
        }
        if (bzdVarA3 instanceof jq7) {
            um7VarA = new zn7(b0(((jq7) bzdVarA3).o).a());
        } else {
            if (!(bzdVarA3 instanceof kq7)) {
                ap.c();
                return null;
            }
            int i2 = ((kq7) bzdVarA3).o;
            um7VarA = g8fVar.a(i2);
            if (um7VarA == null) {
                um7VarA = new ry4(i2);
            }
        }
        um7VarB = um7VarA;
        boolean zF4 = a90Var2.F(wn7VarArr2[49], wq7Var);
        qq7 qq7Var3 = yl7.c;
        qq7Var3.getClass();
        ArrayList arrayList4 = ((yl7) y7h.N(arrayList2, qq7Var3)).b;
        arrayList = new ArrayList(t72.u(arrayList4, 10));
        it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList.add(X((mp7) it.next(), classLoader));
        }
        wq7Var2 = wq7Var.d;
        if (wq7Var2 != null) {
            j2VarD0 = d0(wq7Var2, classLoader, g8fVar, null, 12);
        } else {
            j2VarD0 = null;
        }
        a90 a90Var4 = si0.y;
        wn7VarArr = si0.a;
        boolean zF5 = a90Var4.F(wn7VarArr[51], wq7Var);
        bzdVarA = wq7Var.a();
        if (bzdVarA instanceof iq7) {
            iq7Var = (iq7) bzdVarA;
        } else {
            iq7Var = null;
        }
        if (iq7Var != null) {
            str = iq7Var.o;
        } else {
            str = null;
        }
        boolean zT2 = pa7.t(str, "kotlin/Nothing");
        a90Var = si0.x;
        boolean zF6 = a90Var.F(wn7VarArr[50], wq7Var);
        bzdVarA2 = wq7Var.a();
        if (bzdVarA2 instanceof iq7) {
            iq7Var2 = (iq7) bzdVarA2;
        } else {
            iq7Var2 = null;
        }
        if (iq7Var2 != null) {
            j69VarD = null;
        } else {
            j69VarD = null;
        }
        mmbVar.element = new ljd(um7VarB, listA, zF4, arrayList, j2VarD0, zF5, zT2, zF6, j69VarD, x16Var);
        if (a90Var.F(wn7VarArr[50], wq7Var)) {
            obj2 = mmbVar.element;
            if (obj2 != null) {
                pa7.g0("result");
                throw null;
            }
            ljdVar = (ljd) obj2;
            z2 = ljdVar.w;
            list = ljdVar.c;
            if (z2) {
                ho7.y(ljdVar, "Not a suspend function type: ");
                return null;
            }
            do7Var = (do7) s72.y0(list.size() - 2, list);
            if (do7Var != null) {
                th = null;
                ljdVar2 = null;
            } else {
                th = null;
                ljdVar2 = null;
            }
            if (ljdVar2 == null) {
                sb = new StringBuilder("Invalid suspend function type: ");
                obj3 = mmbVar.element;
                if (obj3 == null) {
                    pa7.g0("result");
                    throw th;
                }
                sb.append((ljd) obj3);
                throw new pt7(sb.toString());
            }
            mmbVar.element = ljdVar2;
        } else {
            th = null;
        }
        rq7Var = wq7Var.f;
        if (rq7Var != null) {
        }
        th2 = th;
        obj = mmbVar.element;
        if (obj != null) {
            return (ljd) obj;
        }
        pa7.g0("result");
        throw th2;
    }

    public static final long d(long j) {
        long j2 = j << 32;
        int i2 = y72.l;
        return j2;
    }

    public static /* synthetic */ j2 d0(wq7 wq7Var, ClassLoader classLoader, g8f g8fVar, x16 x16Var, int i2) {
        boolean z = (i2 & 4) == 0;
        if ((i2 & 8) != 0) {
            x16Var = null;
        }
        return c0(wq7Var, classLoader, g8fVar, z, x16Var);
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final io7 e0(br7 br7Var) {
        br7Var.getClass();
        int iOrdinal = br7Var.ordinal();
        if (iOrdinal == 0) {
            return io7.a;
        }
        if (iOrdinal == 1) {
            return io7.b;
        }
        if (iOrdinal == 2) {
            return io7.c;
        }
        ap.c();
        return null;
    }

    public static final void f(j09 j09Var, boolean z, String str, String str2, x16 x16Var, l46 l46Var, int i2) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        str.getClass();
        str2.getClass();
        x16Var.getClass();
        l46Var2.h0(-323487141);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.g(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var2.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var2.W(i3 & 1, (i3 & 9363) != 9362)) {
            h0e h0eVarB = vx.b(z ? 0.0f : 180.0f, null, null, null, l46Var2, 0, 30);
            g09 g09Var = g09.a;
            j09 j09VarW = dj6.w(b.d(ynb.a0(g09Var, 8.0f, 4.0f), 24.0f), 1.5f);
            int i4 = g82.z;
            long j = ((e8b) l46Var2.k(l8b.a)).m;
            pr4 pr4Var = u5d.a;
            j09Var2 = g09Var;
            j09 j09VarC = androidx.compose.foundation.b.c(oa7.E(db6.w(tm7.o(j09VarW, j, ((s5d) l46Var2.k(pr4Var)).c), 0.0f, g82.a(l46Var2), ((s5d) l46Var2.k(pr4Var)).c), ((s5d) l46Var2.k(pr4Var)).c), false, null, null, x16Var, 15);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            gu6.a(z5c.x(), z ? str2 : str, q6c.i(j09Var2, ((Number) h0eVarB.getValue()).floatValue()), ((m82) l46Var2.k(o82.a)).s, l46Var2, 0, 0);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(j09Var2, z, str, str2, x16Var, i2, 5);
        }
    }

    public static final jo7 f0(pyf pyfVar) {
        pyfVar.getClass();
        int iOrdinal = pyfVar.ordinal();
        if (iOrdinal == 0) {
            return jo7.c;
        }
        jo7 jo7Var = jo7.d;
        if (iOrdinal == 1) {
            return jo7Var;
        }
        if (iOrdinal == 2) {
            return jo7.b;
        }
        if (iOrdinal == 3) {
            return jo7.a;
        }
        if (iOrdinal != 4) {
            jo7Var = null;
            if (iOrdinal == 5) {
                return null;
            }
            ap.c();
        }
        return jo7Var;
    }

    public static final void g(NewReadingState newReadingState, boolean z, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        NewReadingState newReadingState2;
        int i4;
        l46Var.h0(1606520194);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(newReadingState.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            j09 j09VarD = b.d(g09.a, 40.0f);
            bx9 bx9VarQ = ynb.q(20.0f, 0.0f, 2);
            int i5 = dp5.a[newReadingState.ordinal()];
            if (i5 == 1) {
                i4 = R.string.follow_up_new_reading_start;
            } else if (i5 == 2) {
                i4 = R.string.follow_up_new_reading_resume;
            } else {
                if (i5 != 3) {
                    ap.c();
                    return;
                }
                i4 = R.string.follow_up_new_reading_detail;
            }
            String strQ = afc.q(i4, l46Var);
            newReadingState2 = newReadingState;
            if (newReadingState2 == NewReadingState.Completed) {
                l46Var.f0(1022818286);
                c8b.k(j09VarD, false, null, c8b.n(l46Var), null, bx9VarQ, false, x16Var, af1.b0(794357671, new ob0(strQ, 10), l46Var), l46Var, ((i3 << 15) & 29360128) | 100859910, 86);
                l46Var.r(false);
            } else {
                l46Var.f0(1023103424);
                cgg.a(x16Var, j09VarD, z, eze.a(l46Var).a.a, c8b.m(l46Var), null, null, bx9VarQ, af1.b0(-918869738, new ob0(strQ, 11), l46Var), l46Var, ((i3 >> 6) & 14) | 817889328 | ((i3 << 3) & 896), 352);
                l46Var.r(false);
            }
        } else {
            newReadingState2 = newReadingState;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(newReadingState2, z, x16Var, i2, 5);
        }
    }

    public static final void h(String str, NewReadingState newReadingState, QuotaBlockReason quotaBlockReason, x16 x16Var, j09 j09Var, l46 l46Var, int i2) {
        l46 l46Var2;
        long jB;
        q11 q11VarB;
        long jA;
        Integer numValueOf;
        int i3;
        boolean z;
        str.getClass();
        newReadingState.getClass();
        x16Var.getClass();
        l46Var.h0(-2128029131);
        int i4 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.e(newReadingState.ordinal()) ? 32 : 16) | (l46Var.e(quotaBlockReason == null ? -1 : quotaBlockReason.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            y6c y6cVar = eze.a(l46Var).a.j;
            if (zF) {
                l46Var.f0(1896723955);
                jB = l8b.h(l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(1896756505);
                jB = y72.b(l8b.g(l46Var), 0.48f);
                l46Var.r(false);
            }
            if (zF) {
                l46Var.f0(1896841042);
                q11VarB = x57.b(l8b.m(l46Var), 1.0f);
                l46Var.r(false);
            } else {
                l46Var.f0(1896905367);
                q11VarB = x57.b(l8b.g(l46Var), 0.5f);
                l46Var.r(false);
            }
            boolean z2 = newReadingState == NewReadingState.NotStarted && quotaBlockReason == QuotaBlockReason.DailyLimit;
            j09 j09VarZ = ynb.Z(db6.x(tm7.o(b.c(j09Var, 1.0f), jB, y6cVar), q11VarB.a, q11VarB.b, y6cVar), 20.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i5)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarZ);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf2);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09 j09VarC = b.c(g09.a, 1.0f);
            t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarC);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            String strQ = afc.q(R.string.follow_up_new_reading_title, l46Var);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.d(l46Var), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087);
            if (zF) {
                l46Var.f0(-1648968246);
                jA = l8b.e(l46Var);
            } else {
                l46Var.f0(-1648967352);
                jA = l8b.a(l46Var);
            }
            l46Var.r(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01c5: INVOKE (r52v0 'l46Var' l46), (r19v0 boolean) VIRTUAL call: l46.r(boolean):void A[MD:(boolean):void (m)] (LINE:454) in method: abg.h(java.lang.String, ai.askquin.ui.conversation.dialogue.NewReadingState, ai.askquin.data.QuotaBlockReason, x16, j09, l46, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 820
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abg.h(java.lang.String, ai.askquin.ui.conversation.dialogue.NewReadingState, ai.askquin.data.QuotaBlockReason, x16, j09, l46, int):void");
        }

        public static final void i(GiftCardFixtureScenario giftCardFixtureScenario, x16 x16Var, a26 a26Var, l46 l46Var, int i2) {
            l46 l46Var2;
            boolean z;
            boolean z2;
            i8c i8cVar;
            l46 l46Var3;
            Object obj;
            List list;
            iy9 iy9VarB;
            Object obj2;
            l46 l46Var4 = l46Var;
            giftCardFixtureScenario.getClass();
            x16Var.getClass();
            a26Var.getClass();
            l46Var4.h0(338803727);
            int i3 = 4;
            int i4 = i2 | (l46Var4.e(giftCardFixtureScenario.ordinal()) ? 4 : 2) | (l46Var4.i(x16Var) ? 32 : 16) | (l46Var4.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            int i5 = 0;
            if (l46Var4.W(i4 & 1, (i4 & 147) != 146)) {
                Context context = (Context) l46Var4.k(uq.b);
                boolean z3 = (i4 & 14) == 4;
                Object objR = l46Var4.R();
                i8c i8cVar2 = sf2.a;
                Object obj3 = objR;
                if (z3 || objR == i8cVar2) {
                    vz9 vz9VarF = q1c.f(null);
                    l46Var4.p0(vz9VarF);
                    obj3 = vz9VarF;
                }
                e89 e89Var = (e89) obj3;
                int i6 = p96.a[giftCardFixtureScenario.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2 || i6 == 3) {
                        int i7 = 6;
                        l46Var4.f0(129576616);
                        wa6 wa6Var = giftCardFixtureScenario == GiftCardFixtureScenario.SentList ? wa6.Sent : wa6.Received;
                        Object[] objArr = {giftCardFixtureScenario};
                        boolean zE = l46Var4.e(wa6Var.ordinal());
                        Object objR2 = l46Var4.R();
                        Object obj4 = objR2;
                        if (zE || objR2 == i8cVar2) {
                            uo2 uo2Var = new uo2(24, wa6Var);
                            l46Var4.p0(uo2Var);
                            obj4 = uo2Var;
                        }
                        e89 e89Var2 = (e89) vfh.I(objArr, (x16) obj4, l46Var4, 0);
                        wa6 wa6Var2 = (wa6) e89Var2.getValue();
                        List list2 = l96.a;
                        wa6 wa6Var3 = (wa6) e89Var2.getValue();
                        wa6Var3.getClass();
                        int iOrdinal = wa6Var3.ordinal();
                        if (iOrdinal == 0) {
                            list = l96.a;
                        } else {
                            if (iOrdinal != 1) {
                                ap.c();
                                return;
                            }
                            list = l96.b;
                        }
                        int i8 = 8;
                        p86 p86Var = new p86(wa6Var2, list, i8);
                        boolean zG = l46Var4.g(e89Var2);
                        Object objR3 = l46Var4.R();
                        Object obj5 = objR3;
                        if (zG || objR3 == i8cVar2) {
                            pg pgVar = new pg(e89Var2, 28);
                            l46Var4.p0(pgVar);
                            obj5 = pgVar;
                        }
                        a26 a26Var2 = (a26) obj5;
                        boolean zG2 = l46Var4.g(e89Var2) | ((i4 & 896) == 256);
                        Object objR4 = l46Var4.R();
                        Object obj6 = objR4;
                        if (zG2 || objR4 == i8cVar2) {
                            yx1 yx1Var = new yx1(a26Var, e89Var2, i7);
                            l46Var4.p0(yx1Var);
                            obj6 = yx1Var;
                        }
                        a26 a26Var3 = (a26) obj6;
                        Object objR5 = l46Var4.R();
                        Object obj7 = objR5;
                        if (objR5 == i8cVar2) {
                            w66 w66Var = new w66(i8);
                            l46Var4.p0(w66Var);
                            obj7 = w66Var;
                        }
                        pa6.j(p86Var, x16Var, a26Var2, a26Var3, (x16) obj7, l46Var4, 24584 | (i4 & 112));
                        z = false;
                        l46Var4.r(false);
                    } else {
                        l46Var4.f0(130207683);
                        List list3 = l96.a;
                        List list4 = l96.b;
                        switch (k96.a[giftCardFixtureScenario.ordinal()]) {
                            case 1:
                                iy9VarB = l96.b((GiftCardItem) list3.get(0));
                                break;
                            case 2:
                                iy9VarB = l96.b((GiftCardItem) list3.get(0));
                                break;
                            case 3:
                                iy9VarB = l96.b((GiftCardItem) list3.get(1));
                                break;
                            case 4:
                                iy9VarB = l96.b((GiftCardItem) list3.get(2));
                                break;
                            case 5:
                                iy9VarB = l96.a((GiftCardItem) list4.get(0));
                                break;
                            case 6:
                                iy9VarB = l96.a((GiftCardItem) list4.get(1));
                                break;
                            case 7:
                                iy9VarB = l96.a((GiftCardItem) list4.get(2));
                                break;
                            case 8:
                                iy9VarB = l96.a((GiftCardItem) list4.get(3));
                                break;
                            case 9:
                                iy9VarB = l96.a((GiftCardItem) list4.get(4));
                                break;
                            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                iy9VarB = null;
                                break;
                            default:
                                ap.c();
                                return;
                        }
                        if (iy9VarB == null) {
                            qc0.j("Required value was null.");
                            return;
                        }
                        y76 y76Var = (y76) iy9VarB.a();
                        GiftCardPerspective giftCardPerspective = (GiftCardPerspective) iy9VarB.b();
                        GiftCardFixtureScenario giftCardFixtureScenario2 = GiftCardFixtureScenario.PurchaseSuccess;
                        s76 s76Var = giftCardFixtureScenario == giftCardFixtureScenario2 ? s76.PurchaseSuccess : s76.Detail;
                        z76 z76Var = new z76(y76Var, i3);
                        z2 = giftCardFixtureScenario == giftCardFixtureScenario2;
                        Object objR6 = l46Var4.R();
                        Object obj8 = objR6;
                        if (objR6 == i8cVar2) {
                            w66 w66Var2 = new w66(9);
                            l46Var4.p0(w66Var2);
                            obj8 = w66Var2;
                        }
                        x16 x16Var2 = (x16) obj8;
                        boolean zE2 = l46Var4.e(s76Var.ordinal()) | l46Var4.g(e89Var);
                        Object objR7 = l46Var4.R();
                        Object obj9 = objR7;
                        if (zE2 || objR7 == i8cVar2) {
                            n96 n96Var = new n96(s76Var, e89Var, i5);
                            l46Var4.p0(n96Var);
                            obj9 = n96Var;
                        }
                        a26 a26Var4 = (a26) obj9;
                        boolean zI = l46Var4.i(context) | l46Var4.e(s76Var.ordinal());
                        Object objR8 = l46Var4.R();
                        if (zI || objR8 == i8cVar2) {
                            z = false;
                            o96 o96Var = new o96(context, s76Var, false ? 1 : 0);
                            l46Var4.p0(o96Var);
                            obj2 = o96Var;
                        } else {
                            z = false;
                            obj2 = objR8;
                        }
                        pa6.a(z76Var, giftCardPerspective, z2, x16Var, x16Var2, a26Var4, (l26) obj2, l46Var4, 24584 | ((i4 << 6) & 7168));
                        l46Var4.r(z);
                    }
                    i8cVar = i8cVar2;
                    l46Var3 = l46Var4;
                } else {
                    e89Var = e89Var;
                    z = false;
                    l46Var4.f0(-827121606);
                    List list5 = l96.a;
                    GiftCardSku giftCardSku = GiftCardSku.OneMonth;
                    m86 m86Var = m86.a;
                    iy9 iy9Var = new iy9(giftCardSku, new n07(m86Var, "US$12.99", null, 0.0d, null, m86Var.b(), null, 220));
                    GiftCardSku giftCardSku2 = GiftCardSku.OneYear;
                    m86 m86Var2 = m86.b;
                    f96 f96Var = new f96(bm8.H(iy9Var, new iy9(giftCardSku2, new n07(m86Var2, "US$69.99", null, 0.0d, null, m86Var2.b(), null, 220))), a96.a, null, 103);
                    z2 = (i4 & 896) == 256;
                    Object objR9 = l46Var4.R();
                    Object obj10 = objR9;
                    if (z2 || objR9 == i8cVar2) {
                        zh1 zh1Var = new zh1(a26Var, 17);
                        l46Var4.p0(zh1Var);
                        obj10 = zh1Var;
                    }
                    x16 x16Var3 = (x16) obj10;
                    Object objR10 = l46Var4.R();
                    Object obj11 = objR10;
                    if (objR10 == i8cVar2) {
                        oz5 oz5Var = new oz5(10);
                        l46Var4.p0(oz5Var);
                        obj11 = oz5Var;
                    }
                    a26 a26Var5 = (a26) obj11;
                    Object objR11 = l46Var4.R();
                    Object obj12 = objR11;
                    if (objR11 == i8cVar2) {
                        oz5 oz5Var2 = new oz5(11);
                        l46Var4.p0(oz5Var2);
                        obj12 = oz5Var2;
                    }
                    a26 a26Var6 = (a26) obj12;
                    Object objR12 = l46Var4.R();
                    Object obj13 = objR12;
                    if (objR12 == i8cVar2) {
                        oz5 oz5Var3 = new oz5(12);
                        l46Var4.p0(oz5Var3);
                        obj13 = oz5Var3;
                    }
                    a26 a26Var7 = (a26) obj13;
                    Object objR13 = l46Var4.R();
                    Object obj14 = objR13;
                    if (objR13 == i8cVar2) {
                        w66 w66Var3 = new w66(5);
                        l46Var4.p0(w66Var3);
                        obj14 = w66Var3;
                    }
                    x16 x16Var4 = (x16) obj14;
                    Object objR14 = l46Var4.R();
                    Object obj15 = objR14;
                    if (objR14 == i8cVar2) {
                        w66 w66Var4 = new w66(6);
                        l46Var4.p0(w66Var4);
                        obj15 = w66Var4;
                    }
                    x16 x16Var5 = (x16) obj15;
                    Object objR15 = l46Var4.R();
                    Object obj16 = objR15;
                    if (objR15 == i8cVar2) {
                        w66 w66Var5 = new w66(7);
                        l46Var4.p0(w66Var5);
                        obj16 = w66Var5;
                    }
                    int i9 = (i4 & 112) | 115043336;
                    i8cVar = i8cVar2;
                    pa6.m(f96Var, x16Var, x16Var3, a26Var5, a26Var6, a26Var7, x16Var4, x16Var5, (x16) obj16, l46Var4, i9);
                    l46 l46Var5 = l46Var4;
                    l46Var5.r(false);
                    l46Var3 = l46Var5;
                }
                GiftCardItem giftCardItem = (GiftCardItem) e89Var.getValue();
                if (giftCardItem == null) {
                    l46Var3.f0(130953759);
                    l46Var3.r(z);
                    l46Var2 = l46Var3;
                } else {
                    l46Var3.f0(130953760);
                    boolean zG3 = l46Var3.g(e89Var);
                    Object objR16 = l46Var3.R();
                    if (zG3 || objR16 == i8cVar) {
                        obj = objR16;
                        ok3 ok3Var = new ok3(e89Var, 23);
                        l46Var3.p0(ok3Var);
                        obj = ok3Var;
                    }
                    feg.i(giftCardItem, (x16) obj, l46Var3, GiftCardItem.$stable);
                    l46Var3.r(z);
                    l46Var2 = l46Var3;
                }
            } else {
                l46Var4.Z();
                l46Var2 = l46Var4;
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new m65(i2, giftCardFixtureScenario, x16Var, a26Var, 8);
            }
        }

        public static final void j(final LocalDate localDate, boolean z, final boolean z2, final hh3 hh3Var, final boolean z3, final qhe qheVar, final TarotSkinIdentify tarotSkinIdentify, final a26 a26Var, l46 l46Var, final int i2) {
            final boolean z4;
            int i3;
            boolean zEquals;
            long j;
            TarotSkinIdentify tarotSkinIdentify2;
            l46 l46Var2 = l46Var;
            int i4 = 0;
            localDate.getClass();
            hh3Var.getClass();
            a26Var.getClass();
            l46Var2.h0(853076685);
            int i5 = i2 | (l46Var2.i(localDate) ? 4 : 2) | 16 | (l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.e(hh3Var.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.h(z3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(qheVar) ? 131072 : 65536) | (l46Var2.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 1048576 : 524288) | (l46Var2.i(a26Var) ? 8388608 : 4194304);
            if (l46Var2.W(i5 & 1, (4793491 & i5) != 4793490)) {
                l46Var2.b0();
                if ((i2 & 1) == 0 || l46Var2.C()) {
                    i3 = i5 & (-113);
                    zEquals = localDate.equals(LocalDate.now());
                } else {
                    l46Var2.Z();
                    i3 = i5 & (-113);
                    zEquals = z;
                }
                int i6 = i3;
                l46Var2.s();
                Object objR = l46Var2.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = a7c.b(8.0f);
                    l46Var2.p0(objR);
                }
                y6c y6cVar = (y6c) objR;
                g09 g09Var = g09.a;
                j09 j09VarE = oa7.E(dj6.w(ynb.Z(g09Var, 2.0f), 0.734375f).D(fh3.a[hh3Var.ordinal()] == 1 ? g09Var : pa7.p(g09Var, 0.3f)), y6cVar);
                boolean z5 = hh3Var == hh3.b;
                boolean zI = ((i6 & 29360128) == 8388608) | l46Var2.i(localDate);
                Object objR2 = l46Var2.R();
                if (zI || objR2 == i8cVar) {
                    objR2 = new ah3(i4, a26Var, localDate);
                    l46Var2.p0(objR2);
                }
                j09 j09VarD0 = ynb.d0(0.0f, 4.0f, 0.0f, 8.0f, 5, V(androidx.compose.foundation.b.c(j09VarE, z5, null, null, (x16) objR2, 14), z2, ((y72) eze.a(l46Var2).d.c.z(l46Var2, 0)).a, y6cVar, l46Var2, ((i6 >> 3) & 112) | 3072));
                c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarD0);
                lf2.q.getClass();
                l46Var2.j0();
                boolean z6 = l46Var2.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z6) {
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
                String strValueOf = String.valueOf(localDate.getDayOfMonth());
                mue mueVar = pue.a;
                mue mueVarD = pue.d(l46Var2);
                long jL = w6c.l(24);
                if (z2) {
                    l46Var2.f0(-501567658);
                    j = ((y72) eze.a(l46Var2).d.d.z(l46Var2, 0)).a;
                    l46Var2.r(false);
                } else if (zEquals) {
                    l46Var2.f0(-501565905);
                    j = ((y72) eze.a(l46Var2).d.e.z(l46Var2, 0)).a;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-501564750);
                    j = ((e8b) l46Var2.k(l8b.a)).s;
                    l46Var2.r(false);
                }
                nte.b(strValueOf, null, j, 0L, null, null, 0L, null, new jme(3), jL, 0, false, 0, 0, null, mueVarD, l46Var2, 0, 48, 127994);
                jw7 jw7Var = new jw7(1.0f, true);
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, jw7Var);
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
                if (z3) {
                    l46Var2.f0(1873376934);
                    feg.j(od4.A(eze.a(l46Var2).d.b, 0, l46Var2), null, b.q(16.0f, 0.0f, b.f(28.0f, 0.0f, g09Var, 2), 2), null, an2.e, 0.0f, null, l46Var2, 25016, 104);
                    l46Var2.r(false);
                } else if (qheVar != null) {
                    l46Var2.f0(1873701721);
                    j09 j09VarP = b.p(b.d(g09Var, 28.0f), 16.0f);
                    if (tarotSkinIdentify == null) {
                        l46Var2.f0(-2017760595);
                        TarotSkinIdentify tarotSkinIdentify3 = ((die) l46Var2.k(snd.a)).a;
                        l46Var2.r(false);
                        tarotSkinIdentify2 = tarotSkinIdentify3;
                    } else {
                        l46Var2.f0(-2017761928);
                        l46Var2.r(false);
                        tarotSkinIdentify2 = tarotSkinIdentify;
                    }
                    o7c.d(j09VarP, qheVar, tarotSkinIdentify2, false, null, 2.0f, null, false, l46Var2, ((i6 >> 12) & 112) | 196614, 216);
                    l46Var2 = l46Var2;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(1873982271);
                    s21.a(tm7.o(oa7.E(b.p(b.d(g09Var, 28.0f), 16.0f), a7c.b(2.0f)), c(471605012), g21.f), l46Var2, 0);
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                l46Var2.r(true);
                z4 = zEquals;
            } else {
                l46Var2.Z();
                z4 = z;
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26(localDate, z4, z2, hh3Var, z3, qheVar, tarotSkinIdentify, a26Var, i2) { // from class: bh3
                    public final /* synthetic */ LocalDate a;
                    public final /* synthetic */ boolean b;
                    public final /* synthetic */ boolean c;
                    public final /* synthetic */ hh3 d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ qhe f;
                    public final /* synthetic */ TarotSkinIdentify g;
                    public final /* synthetic */ a26 v;

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(1);
                        abg.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                        return wef.a;
                    }
                };
            }
        }

        public static final void k(x16 x16Var, l26 l26Var, boolean z, a26 a26Var, l46 l46Var, int i2) {
            x16Var.getClass();
            l26Var.getClass();
            l46Var.h0(-872897108);
            int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(l26Var) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
            if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = new d59(28);
                    l46Var.p0(objR);
                }
                af1.g(wef.a, (a26) objR, l46Var);
                int i4 = (i3 & 112) | ((i3 << 6) & 896);
                int i5 = i3 << 3;
                a(null, l26Var, x16Var, z, a26Var, l46Var, i4 | (i5 & 7168) | (i5 & 57344));
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new o50(x16Var, l26Var, z, a26Var, i2, 15);
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:31:0x0095  */
        /* JADX WARN: Code duplicated, block: B:32:0x0097  */
        /* JADX WARN: Code duplicated, block: B:34:0x009a  */
        /* JADX WARN: Code duplicated, block: B:36:0x009e  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:65:0x0100  */
        /* JADX WARN: Code duplicated, block: B:66:0x0102  */
        /* JADX WARN: Code duplicated, block: B:68:0x0108  */
        /* JADX WARN: Code duplicated, block: B:70:0x0112  */
        public static final long l(float f2, float f3, float f4, float f5, p82 p82Var) {
            int i2;
            int i3;
            int i4;
            int iFloatToRawIntBits;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int iFloatToRawIntBits2;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            if (p82Var.c()) {
                long j = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
                int i19 = y72.l;
                return j;
            }
            int iFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
            int i20 = iFloatToRawIntBits3 >>> 31;
            int i21 = (iFloatToRawIntBits3 >>> 23) & 255;
            int i22 = iFloatToRawIntBits3 & 8388607;
            int i23 = 49;
            int i24 = 0;
            if (i21 == 255) {
                i3 = i22 != 0 ? 512 : 0;
                i2 = 31;
            } else {
                i2 = i21 - 112;
                if (i2 >= 31) {
                    i2 = 49;
                    i3 = 0;
                } else {
                    if (i2 > 0) {
                        int i25 = i22 >> 13;
                        if ((iFloatToRawIntBits3 & 4096) != 0) {
                            i4 = (((i2 << 10) | i25) + 1) | (i20 << 15);
                        } else {
                            i3 = i25;
                        }
                        short s = (short) i4;
                        iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                        i5 = iFloatToRawIntBits >>> 31;
                        i6 = (iFloatToRawIntBits >>> 23) & 255;
                        i7 = iFloatToRawIntBits & 8388607;
                        if (i6 == 255) {
                            if (i7 != 0) {
                                i10 = 512;
                            } else {
                                i10 = 0;
                            }
                            i8 = 31;
                        } else {
                            i8 = i6 - 112;
                            if (i8 >= 31) {
                                i8 = 49;
                                i10 = 0;
                            } else {
                                if (i8 <= 0) {
                                    i9 = i7 >> 13;
                                    if ((iFloatToRawIntBits & 4096) != 0) {
                                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                    } else {
                                        i10 = i9;
                                    }
                                    short s2 = (short) i11;
                                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                                    i13 = iFloatToRawIntBits2 >>> 31;
                                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                    i15 = 8388607 & iFloatToRawIntBits2;
                                    if (i14 == 255) {
                                        i16 = i14 - 112;
                                        if (i16 < 31) {
                                            if (i16 <= 0) {
                                                i24 = i15 >> 13;
                                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                                } else {
                                                    i23 = i16;
                                                }
                                            } else if (i16 >= -10) {
                                                i18 = (i15 | 8388608) >> (1 - i16);
                                                if ((i18 & 4096) != 0) {
                                                    i18 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                                }
                                                i23 = 0;
                                                i24 = i18 >> 13;
                                            } else {
                                                i23 = 0;
                                            }
                                        }
                                        long jMax = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
                                        int i26 = y72.l;
                                        return jMax;
                                    }
                                    i24 = i15 == 0 ? 0 : 512;
                                    i23 = 31;
                                    i17 = (i13 << 15) | (i23 << 10) | i24;
                                    long jMax2 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
                                    int i27 = y72.l;
                                    return jMax2;
                                }
                                if (i8 >= -10) {
                                    i12 = (i7 | 8388608) >> (1 - i8);
                                    if ((i12 & 4096) != 0) {
                                        i12 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                    }
                                    i10 = i12 >> 13;
                                    i8 = 0;
                                } else {
                                    i10 = 0;
                                    i8 = 0;
                                }
                            }
                        }
                        i11 = i10 | (i5 << 15) | (i8 << 10);
                        short s3 = (short) i11;
                        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                        i13 = iFloatToRawIntBits2 >>> 31;
                        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                        i15 = 8388607 & iFloatToRawIntBits2;
                        if (i14 == 255) {
                            i16 = i14 - 112;
                            if (i16 < 31) {
                                if (i16 <= 0) {
                                    i24 = i15 >> 13;
                                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                                        i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                    } else {
                                        i23 = i16;
                                    }
                                } else if (i16 >= -10) {
                                    i18 = (i15 | 8388608) >> (1 - i16);
                                    if ((i18 & 4096) != 0) {
                                        i18 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                    }
                                    i23 = 0;
                                    i24 = i18 >> 13;
                                } else {
                                    i23 = 0;
                                }
                            }
                            long jMax3 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
                            int i28 = y72.l;
                            return jMax3;
                        }
                        i24 = i15 == 0 ? 0 : 512;
                        i23 = 31;
                        i17 = (i13 << 15) | (i23 << 10) | i24;
                        long jMax4 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
                        int i29 = y72.l;
                        return jMax4;
                    }
                    if (i2 >= -10) {
                        int i30 = (i22 | 8388608) >> (1 - i2);
                        if ((i30 & 4096) != 0) {
                            i30 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i3 = i30 >> 13;
                        i2 = 0;
                    } else {
                        i3 = 0;
                        i2 = 0;
                    }
                }
            }
            i4 = i3 | (i20 << 15) | (i2 << 10);
            short s4 = (short) i4;
            iFloatToRawIntBits = Float.floatToRawIntBits(f3);
            i5 = iFloatToRawIntBits >>> 31;
            i6 = (iFloatToRawIntBits >>> 23) & 255;
            i7 = iFloatToRawIntBits & 8388607;
            if (i6 == 255) {
                if (i7 != 0) {
                    i10 = 512;
                } else {
                    i10 = 0;
                }
                i8 = 31;
            } else {
                i8 = i6 - 112;
                if (i8 >= 31) {
                    i8 = 49;
                    i10 = 0;
                } else {
                    if (i8 <= 0) {
                        i9 = i7 >> 13;
                        if ((iFloatToRawIntBits & 4096) != 0) {
                            i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                        } else {
                            i10 = i9;
                        }
                        short s5 = (short) i11;
                        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                        i13 = iFloatToRawIntBits2 >>> 31;
                        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                        i15 = 8388607 & iFloatToRawIntBits2;
                        if (i14 == 255) {
                            i16 = i14 - 112;
                            if (i16 < 31) {
                                if (i16 <= 0) {
                                    i24 = i15 >> 13;
                                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                                        i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                    } else {
                                        i23 = i16;
                                    }
                                } else if (i16 >= -10) {
                                    i18 = (i15 | 8388608) >> (1 - i16);
                                    if ((i18 & 4096) != 0) {
                                        i18 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                    }
                                    i23 = 0;
                                    i24 = i18 >> 13;
                                } else {
                                    i23 = 0;
                                }
                            }
                            long jMax5 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
                            int i210 = y72.l;
                            return jMax5;
                        }
                        i24 = i15 == 0 ? 0 : 512;
                        i23 = 31;
                        i17 = (i13 << 15) | (i23 << 10) | i24;
                        long jMax6 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
                        int i211 = y72.l;
                        return jMax6;
                    }
                    if (i8 >= -10) {
                        i12 = (i7 | 8388608) >> (1 - i8);
                        if ((i12 & 4096) != 0) {
                            i12 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i10 = i12 >> 13;
                        i8 = 0;
                    } else {
                        i10 = 0;
                        i8 = 0;
                    }
                }
            }
            i11 = i10 | (i5 << 15) | (i8 << 10);
            short s6 = (short) i11;
            iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
            i13 = iFloatToRawIntBits2 >>> 31;
            i14 = (iFloatToRawIntBits2 >>> 23) & 255;
            i15 = 8388607 & iFloatToRawIntBits2;
            if (i14 == 255) {
                i16 = i14 - 112;
                if (i16 < 31) {
                    if (i16 <= 0) {
                        i24 = i15 >> 13;
                        if ((iFloatToRawIntBits2 & 4096) != 0) {
                            i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                        } else {
                            i23 = i16;
                        }
                    } else if (i16 >= -10) {
                        i18 = (i15 | 8388608) >> (1 - i16);
                        if ((i18 & 4096) != 0) {
                            i18 += UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i23 = 0;
                        i24 = i18 >> 13;
                    } else {
                        i23 = 0;
                    }
                }
                long jMax7 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
                int i212 = y72.l;
                return jMax7;
            }
            i24 = i15 == 0 ? 0 : 512;
            i23 = 31;
            i17 = (i13 << 15) | (i23 << 10) | i24;
            long jMax8 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) p82Var.c) & 63);
            int i213 = y72.l;
            return jMax8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void m(LocalDate localDate, boolean z, boolean z2, boolean z3, boolean z4, a26 a26Var, l46 l46Var, int i2) {
            boolean z5;
            int i3;
            boolean zEquals;
            b1b b1bVar;
            long jB;
            b1b b1bVar2;
            long jB2;
            int i4;
            boolean z6;
            long j;
            localDate.getClass();
            a26Var.getClass();
            l46Var.h0(2050828843);
            int i5 = i2 | (l46Var.i(localDate) ? 4 : 2) | 16 | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(a26Var) ? 131072 : 65536);
            if (l46Var.W(i5 & 1, (74899 & i5) != 74898)) {
                l46Var.b0();
                if ((i2 & 1) == 0 || l46Var.C()) {
                    i3 = i5 & (-113);
                    zEquals = localDate.equals(LocalDate.now());
                } else {
                    l46Var.Z();
                    i3 = i5 & (-113);
                    zEquals = z;
                }
                l46Var.s();
                int i6 = (i3 >> 3) & 112;
                l46Var.f0(-1918236571);
                float f2 = !z4 ? 0.48f : 1.0f;
                if (z2) {
                    l46Var.f0(-1645664858);
                    b1bVar2 = l8b.a;
                    if (((e8b) l46Var.k(b1bVar2)).C == mfc.b) {
                        l46Var.f0(-1645587079);
                        jB = ((e8b) l46Var.k(b1bVar2)).a;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-884365744);
                        l46Var.r(false);
                        jB = y72.b(y72.e, f2);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1645519747);
                    l46Var.r(false);
                    if (z4) {
                        l46Var.f0(-884363621);
                        b1bVar = l8b.a;
                        jB = ((e8b) l46Var.k(b1bVar)).j;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-884362287);
                        b1bVar = l8b.a;
                        jB = ((e8b) l46Var.k(b1bVar)).n;
                        l46Var.r(false);
                    }
                    b1bVar2 = b1bVar;
                }
                l46Var.r(false);
                b1b b1bVar3 = b1bVar2;
                if (z2) {
                    l46Var.f0(-543460194);
                    jB2 = ((y72) eze.a(l46Var).d.d.z(l46Var, 0)).a;
                    l46Var.r(false);
                } else if (zEquals) {
                    l46Var.f0(-543458569);
                    jB2 = ((y72) eze.a(l46Var).d.e.z(l46Var, 0)).a;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-543456610);
                    jB2 = y72.b(((m82) l46Var.k(o82.a)).q, 0.48f);
                    l46Var.r(false);
                }
                long j2 = jB2;
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (objR == obj) {
                    objR = a7c.b(8.0f);
                    l46Var.p0(objR);
                }
                y6c y6cVar = (y6c) objR;
                g09 g09Var = g09.a;
                j09 j09VarE = oa7.E(b.r(b.c(g09Var, 1.0f)), y6cVar);
                boolean zI = ((i3 & 458752) == 131072) | l46Var.i(localDate);
                Object objR2 = l46Var.R();
                if (zI || objR2 == obj) {
                    i4 = 1;
                    objR2 = new ah3(i4, a26Var, localDate);
                    l46Var.p0(objR2);
                } else {
                    i4 = 1;
                }
                long j3 = jB;
                boolean z7 = i4;
                j09 j09VarZ = ynb.Z(V(androidx.compose.foundation.b.c(j09VarE, z3, null, null, (x16) objR2, 14), z2, ((y72) eze.a(l46Var).d.c.z(l46Var, 0)).a, y6cVar, l46Var, i6 | 3072), 4.0f);
                c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarZ);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, c92VarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                String displayName = localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
                displayName.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = displayName.toUpperCase(locale);
                upperCase.getClass();
                b1b b1bVar4 = nte.a;
                mue mueVar = (mue) l46Var.k(b1bVar4);
                if (z2) {
                    l46Var.f0(1943878251);
                    j = ((y72) eze.a(l46Var).d.f.z(l46Var, 0)).a;
                    z6 = false;
                } else {
                    z6 = false;
                    l46Var.f0(1943879367);
                    j = ((e8b) l46Var.k(b1bVar3)).t;
                }
                l46Var.r(z6);
                nte.b(upperCase, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVar, j, w6c.l(10), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, 0L, null, 3, 0L, null, null, 16744440), l46Var, 0, 0, 131070);
                nte.b(String.valueOf(localDate.getDayOfMonth()), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var.k(b1bVar4), j2, w6c.l(15), new ar5(510), null, 0L, null, 3, w6c.l(24), null, null, 16613368), l46Var, 0, 0, 131070);
                t72.d(48, j3, l46Var, b.l(ynb.d0(0.0f, 2.0f, 0.0f, 5.0f, 5, g09Var), 4.0f));
                l46Var.r(z7);
                z5 = zEquals;
            } else {
                l46Var.Z();
                z5 = z;
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new dh3(localDate, z5, z2, z3, z4, a26Var, i2);
            }
        }

        public static final void n(List list, l46 l46Var, int i2) {
            List list2;
            List<DayOfWeek> list3;
            l46 l46Var2 = l46Var;
            l46Var2.h0(720440429);
            int i3 = i2 | 2;
            boolean z = false;
            boolean z2 = true;
            if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
                l46Var2.b0();
                if ((i2 & 1) == 0 || l46Var2.C()) {
                    Object objR = l46Var2.R();
                    if (objR == sf2.a) {
                        objR = tq.s();
                        l46Var2.p0(objR);
                    }
                    list3 = (List) objR;
                } else {
                    l46Var2.Z();
                    list3 = list;
                }
                l46Var2.s();
                g09 g09Var = g09.a;
                j09 j09VarD = b.d(g09Var, 36.0f);
                c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarD);
                lf2.q.getClass();
                l46Var2.j0();
                boolean z3 = l46Var2.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z3) {
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
                float f2 = 1.0f;
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                o5c.f(l46Var2, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                j09 j09VarC = b.c(g09Var, 1.0f);
                t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 0);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, t7cVarA);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                l46Var2.f0(187216352);
                for (DayOfWeek dayOfWeek : list3) {
                    jw7 jw7Var = new jw7(f2, z2);
                    mue mueVar = pue.a;
                    mue mueVarJ = pue.j(l46Var2);
                    long j = ((e8b) l46Var2.k(l8b.a)).s;
                    String displayName = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault());
                    displayName.getClass();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = displayName.toUpperCase(locale);
                    upperCase.getClass();
                    nte.b(upperCase, jw7Var, j, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarJ, l46Var, 0, 0, 130040);
                    l46Var2 = l46Var;
                    f2 = f2;
                    z = false;
                    z2 = true;
                }
                l46Var2.r(z);
                l46Var2.r(true);
                if (2.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                o5c.f(l46Var2, new jw7(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true));
                l46Var2.r(true);
                list2 = list3;
            } else {
                l46Var2.Z();
                list2 = list;
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new ch3(list2, i2);
            }
        }

        public static final Bitmap o(cv6 cv6Var) {
            if (cv6Var instanceof ks) {
                return ((ks) cv6Var).a;
            }
            s8f.i("Unable to obtain android.graphics.Bitmap");
            return null;
        }

        public static final void p(int i2) {
            if (i2 >= 1) {
                return;
            }
            qc0.o(tec.e(i2, "Expected positive parallelism level, but got "));
        }

        public static final Object q(fud fudVar, int i2) {
            Object obj;
            fudVar.getClass();
            int iQ = cgg.q(fudVar.d, i2, fudVar.b);
            if (iQ < 0 || (obj = fudVar.c[iQ]) == i) {
                return null;
            }
            return obj;
        }

        public static final long r(long j, long j2) {
            float f2;
            float f3;
            long jA = y72.a(j, y72.e(j2));
            float fC = y72.c(j2);
            float fC2 = y72.c(jA);
            float f4 = 1.0f - fC2;
            float f5 = (fC * f4) + fC2;
            float fG = y72.g(jA);
            float fG2 = y72.g(j2);
            float f6 = 0.0f;
            if (f5 == 0.0f) {
                f2 = 0.0f;
            } else {
                f2 = (((fG2 * fC) * f4) + (fG * fC2)) / f5;
            }
            float f7 = y72.f(jA);
            float f8 = y72.f(j2);
            if (f5 == 0.0f) {
                f3 = 0.0f;
            } else {
                f3 = (((f8 * fC) * f4) + (f7 * fC2)) / f5;
            }
            float fD = y72.d(jA);
            float fD2 = y72.d(j2);
            if (f5 != 0.0f) {
                f6 = (((fD2 * fC) * f4) + (fD * fC2)) / f5;
            }
            return l(f2, f3, f6, f5, y72.e(j2));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0086  */
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
        public static final String s(uq7 uq7Var, xm7 xm7Var) {
            String strConcat;
            vk7 vk7Var = cn1.D(uq7Var).c;
            if (vk7Var != null) {
                return vk7Var.toString();
            }
            ik7 ik7Var = cn1.D(uq7Var).b;
            if (ik7Var == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder(oj7.a(ik7Var.E0));
            if (si0.b(uq7Var) == pyf.INTERNAL && (xm7Var instanceof nm7)) {
                hq7 hq7VarU = ((nm7) xm7Var).U();
                String str = hq7VarU != null ? cn1.A(hq7VarU).b : null;
                if (str == null) {
                    str = "main";
                }
                strConcat = "$".concat(w99.a.h(str, "_"));
            } else if (si0.b(uq7Var) == pyf.PRIVATE && (xm7Var instanceof nn7)) {
                nn7 nn7Var = (nn7) xm7Var;
                fob fobVar = ((mn7) nn7Var.c.getValue()).d;
                wn7 wn7Var = mn7.g[0];
                cob cobVar = (cob) fobVar.invoke();
                if ((cobVar != null ? cobVar.b.a : null) == yr7.MULTIFILE_CLASS_PART) {
                    strConcat = "$".concat(nn7Var.b.getSimpleName());
                } else {
                    strConcat = "";
                }
            } else {
                strConcat = "";
            }
            sb.append(strConcat);
            sb.append("()");
            sb.append(ik7Var.F0);
            return sb.toString();
        }

        public static final yag t(Context context, si2 si2Var) {
            r5c r5cVarJ;
            context.getClass();
            bbg bbgVar = new bbg(si2Var.c);
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            h80 h80Var = bbgVar.a;
            h80Var.getClass();
            uzd uzdVar = si2Var.d;
            if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
                r5cVarJ = new r5c(applicationContext, WorkDatabase.class, null);
                r5cVarJ.i = true;
            } else {
                r5cVarJ = o5c.j(applicationContext, WorkDatabase.class, "androidx.work.workdb");
                r5cVarJ.h = new cu7(applicationContext);
            }
            if (r5cVarJ.q != null) {
                qc0.j("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
                return null;
            }
            r5cVarJ.f = h80Var;
            r5cVarJ.d.add(new b32());
            r5cVarJ.a(pv8.h);
            r5cVarJ.a(new wtb(applicationContext, 2, 3));
            r5cVarJ.a(pv8.i);
            r5cVarJ.a(pv8.j);
            r5cVarJ.a(new wtb(applicationContext, 5, 6));
            r5cVarJ.a(pv8.k);
            r5cVarJ.a(pv8.l);
            r5cVarJ.a(pv8.m);
            r5cVarJ.a(new wtb(applicationContext));
            r5cVarJ.a(new wtb(applicationContext, 10, 11));
            r5cVarJ.a(pv8.d);
            r5cVarJ.a(pv8.e);
            r5cVarJ.a(pv8.f);
            r5cVarJ.a(pv8.g);
            r5cVarJ.a(new wtb(applicationContext, 21, 22));
            r5cVarJ.n = false;
            r5cVarJ.o = true;
            r5cVarJ.p = true;
            WorkDatabase workDatabase = (WorkDatabase) r5cVarJ.b();
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            y1f y1fVar = new y1f(applicationContext2, bbgVar);
            vva vvaVar = new vva(context.getApplicationContext(), si2Var, bbgVar, workDatabase);
            return new yag(context.getApplicationContext(), si2Var, bbgVar, workDatabase, (List) zag.a.w(context, si2Var, bbgVar, workDatabase, y1fVar, vvaVar), vvaVar, y1fVar);
        }

        public static final rz3 u(j0b j0bVar) {
            switch (j0bVar == null ? -1 : r0b.b[j0bVar.ordinal()]) {
                case 1:
                    rz3 rz3Var = sz3.d;
                    rz3Var.getClass();
                    return rz3Var;
                case 2:
                    rz3 rz3Var2 = sz3.a;
                    rz3Var2.getClass();
                    return rz3Var2;
                case 3:
                    rz3 rz3Var3 = sz3.b;
                    rz3Var3.getClass();
                    return rz3Var3;
                case 4:
                    rz3 rz3Var4 = sz3.c;
                    rz3Var4.getClass();
                    return rz3Var4;
                case 5:
                    rz3 rz3Var5 = sz3.e;
                    rz3Var5.getClass();
                    return rz3Var5;
                case 6:
                    rz3 rz3Var6 = sz3.f;
                    rz3Var6.getClass();
                    return rz3Var6;
                default:
                    rz3 rz3Var7 = sz3.a;
                    rz3Var7.getClass();
                    return rz3Var7;
            }
        }

        public static final float v(float f2) {
            float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
            float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
            return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
        }

        public static final cob w(g5b g5bVar, j22 j22Var, fv8 fv8Var) {
            j22Var.getClass();
            fv8Var.getClass();
            String strZ = c5e.z(j22Var.b.a.a, '.', '$');
            dx5 dx5Var = j22Var.a;
            if (!dx5Var.a.c()) {
                strZ = dx5Var + '.' + strZ;
            }
            ssg ssgVarP = g5bVar.p(strZ);
            if (ssgVarP != null) {
                return (cob) ssgVarP.b;
            }
            return null;
        }

        public static final void x(fud fudVar) {
            int i2 = fudVar.d;
            int[] iArr = fudVar.b;
            Object[] objArr = fudVar.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != i) {
                    if (i4 != i3) {
                        iArr[i3] = iArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            fudVar.a = false;
            fudVar.d = i3;
        }

        public static final Constructor y(ym7 ym7Var) {
            sa1 sa1VarH;
            ym7Var.getClass();
            wnb wnbVarA = sqf.a(ym7Var);
            Member memberB = (wnbVarA == null || (sa1VarH = wnbVarA.h()) == null) ? null : sa1VarH.b();
            if (memberB instanceof Constructor) {
                return (Constructor) memberB;
            }
            return null;
        }

        public static final Field z(wn7 wn7Var) {
            wn7Var.getClass();
            bob bobVarC = sqf.c(wn7Var);
            if (bobVarC != null) {
                return bobVarC.l();
            }
            return null;
        }
    }
