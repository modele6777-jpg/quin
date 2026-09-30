package defpackage;

import ai.askquin.R;
import ai.askquin.ui.draw.model.CardBoxState;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cgg {
    public static ufg a;
    public static final dd2 b = new dd2(new a7(9), false, 255572233);
    public static final dd2 c = new dd2(new ed2(4), false, 517122107);
    public static final dd2 d = new dd2(new ed2(5), false, 1576139321);
    public static final dd2 e = new dd2(new ed2(6), false, 437091242);
    public static final dd2 f = new dd2(new ed2(8), false, 2012130829);
    public static final int[] g = new int[0];
    public static final long[] h = new long[0];
    public static final Object[] i = new Object[0];
    public static final y3g j = new y3g(0.31006f, 0.31616f);
    public static final y3g k = new y3g(0.34567f, 0.3585f);
    public static final y3g l = new y3g(0.32168f, 0.33767f);
    public static final y3g m = new y3g(0.31271f, 0.32902f);
    public static final float[] n = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] o = new StackTraceElement[0];
    public static final cj4 p = new cj4();
    public static szc q;
    public static gx6 r;

    public static final nfc A(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof lr7) {
            return (nfc) lr7.j().c.e;
        }
        hr7 hr7Var = af8.Z;
        if (hr7Var != null) {
            return (nfc) hr7Var.c.e;
        }
        qc0.p("KoinApplication has not been started");
        return null;
    }

    public static final gx6 B() {
        gx6 gx6Var = r;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Outlined.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        ArrayList arrayList = s71Var.b;
        s71Var.p(12.0f, 6.0f);
        s71Var.j(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        s71Var.r(-0.9f, 2.0f, -2.0f, 2.0f);
        s71Var.r(-2.0f, -0.9f, -2.0f, -2.0f);
        s71Var.r(0.9f, -2.0f, 2.0f, -2.0f);
        arrayList.add(new x1a(0.0f, 10.0f));
        s71Var.j(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
        s71Var.n(6.0f, 18.0f);
        s71Var.j(0.23f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
        arrayList.add(new x1a(0.0f, -12.0f));
        s71Var.i(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        s71Var.r(1.79f, 4.0f, 4.0f, 4.0f);
        s71Var.r(4.0f, -1.79f, 4.0f, -4.0f);
        s71Var.r(-1.79f, -4.0f, -4.0f, -4.0f);
        s71Var.h();
        s71Var.p(12.0f, 14.0f);
        s71Var.j(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        s71Var.t(2.0f);
        s71Var.m(16.0f);
        s71Var.t(-2.0f);
        s71Var.j(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        s71Var.h();
        fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        r = gx6VarB;
        return gx6VarB;
    }

    public static final fr8 C(kza kzaVar, u99 u99Var, bu3 bu3Var, boolean z, boolean z2, boolean z3) {
        u99Var.getClass();
        s56 s56Var = rl7.d;
        s56Var.getClass();
        ll7 ll7Var = (ll7) vpf.F(kzaVar, s56Var);
        if (ll7Var == null) {
            return null;
        }
        if (z) {
            o85 o85Var = sl7.a;
            rk7 rk7VarB = sl7.b(kzaVar, u99Var, bu3Var, z3);
            if (rk7VarB == null) {
                return null;
            }
            return b21.x(rk7VarB);
        }
        if (!z2 || !ll7Var.A()) {
            return null;
        }
        jl7 jl7VarU = ll7Var.u();
        jl7VarU.getClass();
        return new fr8(u99Var.getString(jl7VarU.o()).concat(u99Var.getString(jl7VarU.n())));
    }

    public static szc E() {
        szc szcVar;
        szc szcVar2 = q;
        if (szcVar2 != null) {
            return szcVar2;
        }
        Object obj = null;
        try {
            szcVar = new szc(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 21);
        } catch (NoSuchMethodException unused) {
            szcVar = new szc(obj, obj, obj, obj, 21);
        }
        q = szcVar;
        return szcVar;
    }

    public static final void F(l46 l46Var, l26 l26Var) {
        l26Var.getClass();
        z7f.t(2, l26Var);
        l26Var.z(l46Var, 1);
    }

    public static final boolean G(bob bobVar) {
        bobVar.getClass();
        return xm7.a.g(bobVar.getSignature());
    }

    public static Boolean H(Class cls) throws IllegalAccessException, InvocationTargetException {
        Method method = (Method) E().b;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    public static final String I(e96 e96Var) {
        if (pa7.t(e96Var, b96.a)) {
            return "Idle";
        }
        if (pa7.t(e96Var, d96.a)) {
            return "SubmittingDraft";
        }
        if (pa7.t(e96Var, x86.a)) {
            return "AwaitingPayment";
        }
        if (e96Var instanceof z86) {
            return "Confirming";
        }
        if (e96Var instanceof y86) {
            return "ConfirmationFailed";
        }
        if (pa7.t(e96Var, a96.a)) {
            return "DelayedIssuance";
        }
        if (pa7.t(e96Var, c96.a)) {
            return "Issued";
        }
        ap.c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long J(int i2, String str) {
        int iU = u(str, 0, i2, false);
        Matcher matcher = eu2.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iO = -1;
        int i6 = -1;
        int i7 = -1;
        while (iU < i2) {
            int iU2 = u(str, iU + 1, i2, true);
            matcher.region(iU, iU2);
            if (i4 == -1 && matcher.usePattern(eu2.n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(eu2.m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i5 = Integer.parseInt(strGroup4);
            } else if (iO == -1) {
                Pattern pattern = eu2.l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iO = v4e.O(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i3 != -1 && matcher.usePattern(eu2.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i3 = Integer.parseInt(strGroup6);
                }
            } else if (i3 != -1) {
            }
            iU = u(str, iU2 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            qc0.j("Failed requirement.");
            return 0L;
        }
        if (iO == -1) {
            qc0.j("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            qc0.j("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            qc0.j("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            qc0.j("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            qc0.j("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(keg.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iO - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static int K(zu1 zu1Var, int i2, int i3, int i4) {
        pa7.A(Math.max(Math.max(i2, i3), i4) <= 31);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        od4.k(od4.k(i5, i6), 1 << i4);
        if (zu1Var.b() < i2) {
            return -1;
        }
        int iG = zu1Var.g(i2);
        if (iG == i5) {
            if (zu1Var.b() < i3) {
                return -1;
            }
            int iG2 = zu1Var.g(i3);
            iG += iG2;
            if (iG2 == i6) {
                if (zu1Var.b() < i4) {
                    return -1;
                }
                return zu1Var.g(i4) + iG;
            }
        }
        return iG;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    public static boolean L(xg3 xg3Var) {
        char cM;
        if (xg3Var.f()) {
            if (!xg3Var.k('<')) {
                int i2 = 0;
                boolean z = true;
                while (xg3Var.f()) {
                    char cM2 = xg3Var.m();
                    if (cM2 == ' ') {
                        return !z;
                    }
                    if (cM2 == '\\') {
                        xg3Var.j();
                        char cM3 = xg3Var.m();
                        switch (cM3) {
                            default:
                                switch (cM3) {
                                    default:
                                        switch (cM3) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                            case '^':
                                            case '_':
                                            case '`':
                                                break;
                                            default:
                                                switch (cM3) {
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                break;
                                        }
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                        xg3Var.j();
                                        break;
                                }
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                xg3Var.j();
                                break;
                        }
                    } else if (cM2 == '(') {
                        i2++;
                        if (i2 <= 32) {
                            xg3Var.j();
                        }
                    } else if (cM2 != ')') {
                        if (Character.isISOControl(cM2)) {
                            return !z;
                        }
                        xg3Var.j();
                    } else {
                        if (i2 == 0) {
                            return true;
                        }
                        i2--;
                        xg3Var.j();
                    }
                    z = false;
                }
                return true;
            }
            while (xg3Var.f() && (cM = xg3Var.m()) != '\n' && cM != '<') {
                if (cM == '>') {
                    xg3Var.j();
                    return true;
                }
                if (cM == '\\') {
                    xg3Var.j();
                    char cM4 = xg3Var.m();
                    switch (cM4) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            xg3Var.j();
                            break;
                        default:
                            switch (cM4) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                    xg3Var.j();
                                    break;
                                default:
                                    switch (cM4) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            xg3Var.j();
                                            break;
                                        default:
                                            switch (cM4) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            xg3Var.j();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    xg3Var.j();
                }
            }
        }
        return false;
    }

    public static boolean M(xg3 xg3Var) {
        while (xg3Var.f()) {
            switch (xg3Var.m()) {
                case '[':
                    return false;
                case '\\':
                    xg3Var.j();
                    char cM = xg3Var.m();
                    switch (cM) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            xg3Var.j();
                            break;
                        default:
                            switch (cM) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                    xg3Var.j();
                                    break;
                                default:
                                    switch (cM) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            xg3Var.j();
                                            break;
                                        default:
                                            switch (cM) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            xg3Var.j();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    xg3Var.j();
                    break;
            }
        }
        return true;
    }

    public static boolean N(xg3 xg3Var, char c2) {
        while (xg3Var.f()) {
            char cM = xg3Var.m();
            if (cM == '\\') {
                xg3Var.j();
                char cM2 = xg3Var.m();
                switch (cM2) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                        xg3Var.j();
                        break;
                    default:
                        switch (cM2) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                xg3Var.j();
                                break;
                            default:
                                switch (cM2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        xg3Var.j();
                                        break;
                                    default:
                                        switch (cM2) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        xg3Var.j();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cM == c2) {
                    return true;
                }
                if (c2 == ')' && cM == '(') {
                    return false;
                }
                xg3Var.j();
            }
        }
        return true;
    }

    public static void O(zu1 zu1Var) {
        zu1Var.o(3);
        zu1Var.o(8);
        boolean zF = zu1Var.f();
        boolean zF2 = zu1Var.f();
        if (zF) {
            zu1Var.o(5);
        }
        if (zF2) {
            zu1Var.o(6);
        }
    }

    public static void P(zu1 zu1Var) {
        int iG;
        int iG2 = zu1Var.g(2);
        if (iG2 == 0) {
            zu1Var.o(6);
            return;
        }
        int iK = K(zu1Var, 5, 8, 16) + 1;
        if (iG2 == 1) {
            zu1Var.o(iK * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = zu1Var.f();
            int i2 = zF ? 1 : 5;
            int i3 = zF ? 7 : 5;
            int i4 = zF ? 8 : 6;
            int i5 = 0;
            while (i5 < iK) {
                if (zu1Var.f()) {
                    zu1Var.o(7);
                    iG = 0;
                } else {
                    if (zu1Var.g(2) == 3 && zu1Var.g(i3) * i2 != 0) {
                        zu1Var.n();
                    }
                    iG = zu1Var.g(i4) * i2;
                    if (iG != 0 && iG != 180) {
                        zu1Var.n();
                    }
                    zu1Var.n();
                }
                if (iG != 0 && iG != 180 && zu1Var.f()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    public static final j09 Q(j09 j09Var, boolean z, boolean z2, x16 x16Var) {
        if (!z || !g6e.a) {
            return j09Var;
        }
        if (z2) {
            j09Var = j09Var.D(new h6e(p));
        }
        return j09Var.D(new d6e(x16Var));
    }

    public static String R(long j2) {
        if (y(j2, 12884901888L)) {
            return "Rgb";
        }
        if (y(j2, 12884901889L)) {
            return "Xyz";
        }
        if (y(j2, 12884901890L)) {
            return "Lab";
        }
        return y(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static w12 S(x12 x12Var, shb shbVar) {
        int i2 = x12Var.b;
        shbVar.getClass();
        return new w12(shbVar, x12Var.a, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0110  */
    /* JADX WARN: Code duplicated, block: B:105:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0124  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:111:0x013b  */
    /* JADX WARN: Code duplicated, block: B:125:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0160  */
    /* JADX WARN: Code duplicated, block: B:128:0x0165  */
    /* JADX WARN: Code duplicated, block: B:131:0x016b  */
    /* JADX WARN: Code duplicated, block: B:134:0x017a  */
    /* JADX WARN: Code duplicated, block: B:137:0x018f  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x019f  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:159:0x020a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0222  */
    /* JADX WARN: Code duplicated, block: B:166:0x0238  */
    /* JADX WARN: Code duplicated, block: B:167:0x023a  */
    /* JADX WARN: Code duplicated, block: B:169:0x023e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0241  */
    /* JADX WARN: Code duplicated, block: B:172:0x0245  */
    /* JADX WARN: Code duplicated, block: B:173:0x0248  */
    /* JADX WARN: Code duplicated, block: B:175:0x024c  */
    /* JADX WARN: Code duplicated, block: B:176:0x024f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0257  */
    /* JADX WARN: Code duplicated, block: B:180:0x0272  */
    /* JADX WARN: Code duplicated, block: B:183:0x0291  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:199:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:209:0x0306  */
    /* JADX WARN: Code duplicated, block: B:211:0x0357  */
    /* JADX WARN: Code duplicated, block: B:214:0x0367  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    public static final void a(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, z51 z51Var, q11 q11Var, xw9 xw9Var, n26 n26Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        boolean z2;
        int i6;
        x4d x4dVarB;
        u51 u51VarC;
        z51 z51Var2;
        int i7;
        q11 q11Var2;
        int i8;
        int i9;
        xw9 xw9Var2;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        xw9 xw9Var3;
        j09 j09Var3;
        boolean z5;
        x4d x4dVar2;
        u51 u51Var2;
        z51 z51Var3;
        q11 q11Var3;
        ojb ojbVarV;
        z51 z51Var4;
        xw9 xw9Var4;
        x4d x4dVar3;
        q11 q11Var4;
        xw9 xw9Var5;
        j09 j09Var4;
        int i12;
        u51 u51Var3;
        Object objR;
        Object obj;
        t69 t69Var;
        long j2;
        long j3;
        int i13;
        Object objR2;
        jsd jsdVar;
        boolean zG;
        Object objR3;
        l77 l77Var;
        float f2;
        Object objR4;
        jx jxVar;
        boolean zI;
        Object objR5;
        boolean z6;
        z51 z51Var5;
        wz wzVar;
        float f3;
        Object objR6;
        int i14;
        int i15;
        int i16;
        l46Var.h0(-1310015664);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i6 = 256;
                    } else {
                        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        x4dVarB = x4dVar;
                        if (l46Var.g(x4dVarB)) {
                            i16 = 2048;
                        }
                        i4 |= i16;
                    } else {
                        x4dVarB = x4dVar;
                    }
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i4 |= i16;
                } else {
                    x4dVarB = x4dVar;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        u51VarC = u51Var;
                        if (l46Var.g(u51VarC)) {
                            i15 = 16384;
                        }
                        i4 |= i15;
                    } else {
                        u51VarC = u51Var;
                    }
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    i4 |= i15;
                } else {
                    u51VarC = u51Var;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        z51Var2 = z51Var;
                        int i18 = l46Var.g(z51Var2) ? 131072 : 65536;
                        i4 |= i18;
                    } else {
                        z51Var2 = z51Var;
                    }
                    i4 |= i18;
                } else {
                    z51Var2 = z51Var;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    if ((1572864 & i2) == 0) {
                        q11Var2 = q11Var;
                        if (l46Var.g(q11Var2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i9 != 0) {
                        i4 |= 12582912;
                        xw9Var2 = xw9Var;
                    } else {
                        xw9Var2 = xw9Var;
                        if ((i2 & 12582912) == 0) {
                            if (l46Var.g(xw9Var2)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i4 |= i10;
                        }
                    }
                    if ((i3 & 256) != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (l46Var.g(null)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i4 |= i11;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (l46Var.i(n26Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i4 |= i14;
                    }
                    z3 = true;
                    if ((i4 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (l46Var.W(i4 & 1, z4)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0 || l46Var.C()) {
                            if (i17 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 8) != 0) {
                                bx9 bx9Var = v51.a;
                                i4 &= -7169;
                                x4dVarB = u5d.b(k99.a, l46Var);
                            }
                            if ((i3 & 16) != 0) {
                                bx9 bx9Var2 = v51.a;
                                i4 &= -57345;
                                u51VarC = v51.c((m82) l46Var.k(o82.a));
                            }
                            if ((i3 & 32) != 0) {
                                bx9 bx9Var3 = v51.a;
                                z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                                i4 &= -458753;
                            } else {
                                z51Var4 = z51Var2;
                            }
                            if (i7 != 0) {
                                q11Var2 = null;
                            }
                            if (i9 != 0) {
                                xw9Var4 = v51.a;
                            } else {
                                xw9Var4 = xw9Var2;
                            }
                            z51Var2 = z51Var4;
                            x4dVar3 = x4dVarB;
                            q11Var4 = q11Var2;
                            xw9Var5 = xw9Var4;
                            j09Var4 = j09Var2;
                        } else {
                            l46Var.Z();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            xw9Var5 = xw9Var2;
                            j09Var4 = j09Var2;
                            x4dVar3 = x4dVarB;
                            q11Var4 = q11Var2;
                        }
                        i12 = i4;
                        u51Var3 = u51VarC;
                        l46Var.s();
                        l46Var.f0(1691738187);
                        objR = l46Var.R();
                        obj = sf2.a;
                        if (objR == obj) {
                            objR = ib8.e(l46Var);
                        }
                        t69Var = (t69) objR;
                        l46Var.r(false);
                        if (z2) {
                            j2 = u51Var3.a;
                        } else {
                            j2 = u51Var3.c;
                        }
                        if (z2) {
                            j3 = u51Var3.b;
                        } else {
                            j3 = u51Var3.d;
                        }
                        if (z51Var2 == null) {
                            l46Var.f0(1691921830);
                            l46Var.r(false);
                            u51Var3 = u51Var3;
                            xw9Var5 = xw9Var5;
                            z6 = z2;
                            q11Var4 = q11Var4;
                            t69Var = t69Var;
                            z51Var5 = z51Var2;
                            wzVar = null;
                        } else {
                            l46Var.f0(-499611205);
                            i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                            objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new jsd();
                                l46Var.p0(objR2);
                            }
                            jsdVar = (jsd) objR2;
                            zG = l46Var.g(t69Var);
                            objR3 = l46Var.R();
                            if (zG || objR3 == obj) {
                                objR3 = new x51(t69Var, jsdVar, null);
                                l46Var.p0(objR3);
                            }
                            af1.o((l26) objR3, l46Var, t69Var);
                            l77Var = (l77) s72.H0(jsdVar);
                            if (!z2) {
                                f2 = 0.0f;
                            } else if (l77Var instanceof pta) {
                                f2 = z51Var2.b;
                            } else if (l77Var instanceof yq6) {
                                f2 = z51Var2.d;
                            } else if (l77Var instanceof rn5) {
                                f2 = z51Var2.c;
                            } else {
                                f2 = z51Var2.a;
                            }
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                                l46Var.p0(objR4);
                            }
                            jxVar = (jx) objR4;
                            yi4 yi4Var = new yi4(f2);
                            boolean zI2 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                            if ((((i13 & 896) ^ 384) > 256 || !l46Var.g(z51Var2)) && (i13 & 384) != 256) {
                            }
                            zI = zI2 | z3 | l46Var.i(l77Var);
                            objR5 = l46Var.R();
                            if (!zI || objR5 == obj) {
                                boolean z7 = z2;
                                z51 z51Var6 = z51Var2;
                                objR5 = new y51(jxVar, f2, z7, z51Var6, l77Var, null);
                                z6 = z7;
                                z51Var5 = z51Var6;
                                l46Var.p0(objR5);
                            } else {
                                z6 = z2;
                                z51Var5 = z51Var2;
                            }
                            af1.o((l26) objR5, l46Var, yi4Var);
                            wzVar = jxVar.c;
                            l46Var.r(false);
                        }
                        if (wzVar != null) {
                            f3 = ((yi4) wzVar.b.getValue()).a;
                        } else {
                            f3 = 0.0f;
                        }
                        objR6 = l46Var.R();
                        if (objR6 == obj) {
                            objR6 = new wu0(9);
                            l46Var.p0(objR6);
                        }
                        q11 q11Var5 = q11Var4;
                        nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var5, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                        z5 = z6;
                        q11Var3 = q11Var5;
                        z51Var3 = z51Var5;
                        j09Var3 = j09Var4;
                        x4dVar2 = x4dVar3;
                        u51Var2 = u51Var3;
                        xw9Var3 = xw9Var5;
                    } else {
                        l46Var.Z();
                        xw9Var3 = xw9Var2;
                        j09Var3 = j09Var2;
                        z5 = z2;
                        x4dVar2 = x4dVarB;
                        u51Var2 = u51VarC;
                        z51Var3 = z51Var2;
                        q11Var3 = q11Var2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
                    }
                }
                i4 |= 1572864;
                q11Var2 = q11Var;
                i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 != 0) {
                    i4 |= 12582912;
                    xw9Var2 = xw9Var;
                } else {
                    xw9Var2 = xw9Var;
                    if ((i2 & 12582912) == 0) {
                        if (l46Var.g(xw9Var2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (l46Var.g(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i2 & 805306368) == 0) {
                    if (l46Var.i(n26Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                z3 = true;
                if ((i4 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i4 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var4 = v51.a;
                            i4 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var5 = v51.a;
                            i4 &= -57345;
                            u51VarC = v51.c((m82) l46Var.k(o82.a));
                        }
                        if ((i3 & 32) != 0) {
                            bx9 bx9Var6 = v51.a;
                            z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                            i4 &= -458753;
                        } else {
                            z51Var4 = z51Var2;
                        }
                        if (i7 != 0) {
                            q11Var2 = null;
                        }
                        if (i9 != 0) {
                            xw9Var4 = v51.a;
                        } else {
                            xw9Var4 = xw9Var2;
                        }
                        z51Var2 = z51Var4;
                        x4dVar3 = x4dVarB;
                        q11Var4 = q11Var2;
                        xw9Var5 = xw9Var4;
                        j09Var4 = j09Var2;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var7 = v51.a;
                            i4 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var8 = v51.a;
                            i4 &= -57345;
                            u51VarC = v51.c((m82) l46Var.k(o82.a));
                        }
                        if ((i3 & 32) != 0) {
                            bx9 bx9Var9 = v51.a;
                            z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                            i4 &= -458753;
                        } else {
                            z51Var4 = z51Var2;
                        }
                        if (i7 != 0) {
                            q11Var2 = null;
                        }
                        if (i9 != 0) {
                            xw9Var4 = v51.a;
                        } else {
                            xw9Var4 = xw9Var2;
                        }
                        z51Var2 = z51Var4;
                        x4dVar3 = x4dVarB;
                        q11Var4 = q11Var2;
                        xw9Var5 = xw9Var4;
                        j09Var4 = j09Var2;
                    }
                    i12 = i4;
                    u51Var3 = u51VarC;
                    l46Var.s();
                    l46Var.f0(1691738187);
                    objR = l46Var.R();
                    obj = sf2.a;
                    if (objR == obj) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    if (z2) {
                        j2 = u51Var3.a;
                    } else {
                        j2 = u51Var3.c;
                    }
                    if (z2) {
                        j3 = u51Var3.b;
                    } else {
                        j3 = u51Var3.d;
                    }
                    if (z51Var2 == null) {
                        l46Var.f0(1691921830);
                        l46Var.r(false);
                        u51Var3 = u51Var3;
                        xw9Var5 = xw9Var5;
                        z6 = z2;
                        q11Var4 = q11Var4;
                        t69Var = t69Var;
                        z51Var5 = z51Var2;
                        wzVar = null;
                    } else {
                        l46Var.f0(-499611205);
                        i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new jsd();
                            l46Var.p0(objR2);
                        }
                        jsdVar = (jsd) objR2;
                        zG = l46Var.g(t69Var);
                        objR3 = l46Var.R();
                        if (zG) {
                            objR3 = new x51(t69Var, jsdVar, null);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new x51(t69Var, jsdVar, null);
                            l46Var.p0(objR3);
                        }
                        af1.o((l26) objR3, l46Var, t69Var);
                        l77Var = (l77) s72.H0(jsdVar);
                        if (!z2) {
                            f2 = 0.0f;
                        } else if (l77Var instanceof pta) {
                            f2 = z51Var2.b;
                        } else if (l77Var instanceof yq6) {
                            f2 = z51Var2.d;
                        } else if (l77Var instanceof rn5) {
                            f2 = z51Var2.c;
                        } else {
                            f2 = z51Var2.a;
                        }
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                            l46Var.p0(objR4);
                        }
                        jxVar = (jx) objR4;
                        yi4 yi4Var2 = new yi4(f2);
                        boolean zI3 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                        z3 = ((i13 & 896) ^ 384) > 256 ? false : false;
                        zI = zI3 | z3 | l46Var.i(l77Var);
                        objR5 = l46Var.R();
                        if (zI) {
                            boolean z8 = z2;
                            z51 z51Var7 = z51Var2;
                            objR5 = new y51(jxVar, f2, z8, z51Var7, l77Var, null);
                            z6 = z8;
                            z51Var5 = z51Var7;
                            l46Var.p0(objR5);
                        } else {
                            boolean z9 = z2;
                            z51 z51Var8 = z51Var2;
                            objR5 = new y51(jxVar, f2, z9, z51Var8, l77Var, null);
                            z6 = z9;
                            z51Var5 = z51Var8;
                            l46Var.p0(objR5);
                        }
                        af1.o((l26) objR5, l46Var, yi4Var2);
                        wzVar = jxVar.c;
                        l46Var.r(false);
                    }
                    if (wzVar != null) {
                        f3 = ((yi4) wzVar.b.getValue()).a;
                    } else {
                        f3 = 0.0f;
                    }
                    objR6 = l46Var.R();
                    if (objR6 == obj) {
                        objR6 = new wu0(9);
                        l46Var.p0(objR6);
                    }
                    q11 q11Var6 = q11Var4;
                    nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var6, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                    z5 = z6;
                    q11Var3 = q11Var6;
                    z51Var3 = z51Var5;
                    j09Var3 = j09Var4;
                    x4dVar2 = x4dVar3;
                    u51Var2 = u51Var3;
                    xw9Var3 = xw9Var5;
                } else {
                    l46Var.Z();
                    xw9Var3 = xw9Var2;
                    j09Var3 = j09Var2;
                    z5 = z2;
                    x4dVar2 = x4dVarB;
                    u51Var2 = u51VarC;
                    z51Var3 = z51Var2;
                    q11Var3 = q11Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
                }
            }
            i4 |= 384;
            z2 = z;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    x4dVarB = x4dVar;
                    if (l46Var.g(x4dVarB)) {
                        i16 = 2048;
                    }
                    i4 |= i16;
                } else {
                    x4dVarB = x4dVar;
                }
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i4 |= i16;
            } else {
                x4dVarB = x4dVar;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    u51VarC = u51Var;
                    if (l46Var.g(u51VarC)) {
                        i15 = 16384;
                    }
                    i4 |= i15;
                } else {
                    u51VarC = u51Var;
                }
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i4 |= i15;
            } else {
                u51VarC = u51Var;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    z51Var2 = z51Var;
                    if (l46Var.g(z51Var2)) {
                    }
                    i4 |= i18;
                } else {
                    z51Var2 = z51Var;
                }
                i4 |= i18;
            } else {
                z51Var2 = z51Var;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    q11Var2 = q11Var;
                    if (l46Var.g(q11Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 != 0) {
                    i4 |= 12582912;
                    xw9Var2 = xw9Var;
                } else {
                    xw9Var2 = xw9Var;
                    if ((i2 & 12582912) == 0) {
                        if (l46Var.g(xw9Var2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (l46Var.g(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i2 & 805306368) == 0) {
                    if (l46Var.i(n26Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                z3 = true;
                if ((i4 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i4 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var10 = v51.a;
                            i4 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var11 = v51.a;
                            i4 &= -57345;
                            u51VarC = v51.c((m82) l46Var.k(o82.a));
                        }
                        if ((i3 & 32) != 0) {
                            bx9 bx9Var12 = v51.a;
                            z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                            i4 &= -458753;
                        } else {
                            z51Var4 = z51Var2;
                        }
                        if (i7 != 0) {
                            q11Var2 = null;
                        }
                        if (i9 != 0) {
                            xw9Var4 = v51.a;
                        } else {
                            xw9Var4 = xw9Var2;
                        }
                        z51Var2 = z51Var4;
                        x4dVar3 = x4dVarB;
                        q11Var4 = q11Var2;
                        xw9Var5 = xw9Var4;
                        j09Var4 = j09Var2;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var13 = v51.a;
                            i4 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var14 = v51.a;
                            i4 &= -57345;
                            u51VarC = v51.c((m82) l46Var.k(o82.a));
                        }
                        if ((i3 & 32) != 0) {
                            bx9 bx9Var15 = v51.a;
                            z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                            i4 &= -458753;
                        } else {
                            z51Var4 = z51Var2;
                        }
                        if (i7 != 0) {
                            q11Var2 = null;
                        }
                        if (i9 != 0) {
                            xw9Var4 = v51.a;
                        } else {
                            xw9Var4 = xw9Var2;
                        }
                        z51Var2 = z51Var4;
                        x4dVar3 = x4dVarB;
                        q11Var4 = q11Var2;
                        xw9Var5 = xw9Var4;
                        j09Var4 = j09Var2;
                    }
                    i12 = i4;
                    u51Var3 = u51VarC;
                    l46Var.s();
                    l46Var.f0(1691738187);
                    objR = l46Var.R();
                    obj = sf2.a;
                    if (objR == obj) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    if (z2) {
                        j2 = u51Var3.a;
                    } else {
                        j2 = u51Var3.c;
                    }
                    if (z2) {
                        j3 = u51Var3.b;
                    } else {
                        j3 = u51Var3.d;
                    }
                    if (z51Var2 == null) {
                        l46Var.f0(1691921830);
                        l46Var.r(false);
                        u51Var3 = u51Var3;
                        xw9Var5 = xw9Var5;
                        z6 = z2;
                        q11Var4 = q11Var4;
                        t69Var = t69Var;
                        z51Var5 = z51Var2;
                        wzVar = null;
                    } else {
                        l46Var.f0(-499611205);
                        i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new jsd();
                            l46Var.p0(objR2);
                        }
                        jsdVar = (jsd) objR2;
                        zG = l46Var.g(t69Var);
                        objR3 = l46Var.R();
                        if (zG) {
                            objR3 = new x51(t69Var, jsdVar, null);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new x51(t69Var, jsdVar, null);
                            l46Var.p0(objR3);
                        }
                        af1.o((l26) objR3, l46Var, t69Var);
                        l77Var = (l77) s72.H0(jsdVar);
                        if (!z2) {
                            f2 = 0.0f;
                        } else if (l77Var instanceof pta) {
                            f2 = z51Var2.b;
                        } else if (l77Var instanceof yq6) {
                            f2 = z51Var2.d;
                        } else if (l77Var instanceof rn5) {
                            f2 = z51Var2.c;
                        } else {
                            f2 = z51Var2.a;
                        }
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                            l46Var.p0(objR4);
                        }
                        jxVar = (jx) objR4;
                        yi4 yi4Var3 = new yi4(f2);
                        boolean zI4 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                        if (((i13 & 896) ^ 384) > 256) {
                        }
                        zI = zI4 | z3 | l46Var.i(l77Var);
                        objR5 = l46Var.R();
                        if (zI) {
                            boolean z10 = z2;
                            z51 z51Var9 = z51Var2;
                            objR5 = new y51(jxVar, f2, z10, z51Var9, l77Var, null);
                            z6 = z10;
                            z51Var5 = z51Var9;
                            l46Var.p0(objR5);
                        } else {
                            boolean z11 = z2;
                            z51 z51Var10 = z51Var2;
                            objR5 = new y51(jxVar, f2, z11, z51Var10, l77Var, null);
                            z6 = z11;
                            z51Var5 = z51Var10;
                            l46Var.p0(objR5);
                        }
                        af1.o((l26) objR5, l46Var, yi4Var3);
                        wzVar = jxVar.c;
                        l46Var.r(false);
                    }
                    if (wzVar != null) {
                        f3 = ((yi4) wzVar.b.getValue()).a;
                    } else {
                        f3 = 0.0f;
                    }
                    objR6 = l46Var.R();
                    if (objR6 == obj) {
                        objR6 = new wu0(9);
                        l46Var.p0(objR6);
                    }
                    q11 q11Var7 = q11Var4;
                    nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var7, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                    z5 = z6;
                    q11Var3 = q11Var7;
                    z51Var3 = z51Var5;
                    j09Var3 = j09Var4;
                    x4dVar2 = x4dVar3;
                    u51Var2 = u51Var3;
                    xw9Var3 = xw9Var5;
                } else {
                    l46Var.Z();
                    xw9Var3 = xw9Var2;
                    j09Var3 = j09Var2;
                    z5 = z2;
                    x4dVar2 = x4dVarB;
                    u51Var2 = u51VarC;
                    z51Var3 = z51Var2;
                    q11Var3 = q11Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
                }
            }
            i4 |= 1572864;
            q11Var2 = q11Var;
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                i4 |= 12582912;
                xw9Var2 = xw9Var;
            } else {
                xw9Var2 = xw9Var;
                if ((i2 & 12582912) == 0) {
                    if (l46Var.g(xw9Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (l46Var.g(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.i(n26Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            z3 = true;
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i4 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var16 = v51.a;
                        i4 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var17 = v51.a;
                        i4 &= -57345;
                        u51VarC = v51.c((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 32) != 0) {
                        bx9 bx9Var18 = v51.a;
                        z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                        i4 &= -458753;
                    } else {
                        z51Var4 = z51Var2;
                    }
                    if (i7 != 0) {
                        q11Var2 = null;
                    }
                    if (i9 != 0) {
                        xw9Var4 = v51.a;
                    } else {
                        xw9Var4 = xw9Var2;
                    }
                    z51Var2 = z51Var4;
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                    xw9Var5 = xw9Var4;
                    j09Var4 = j09Var2;
                } else {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var19 = v51.a;
                        i4 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var110 = v51.a;
                        i4 &= -57345;
                        u51VarC = v51.c((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 32) != 0) {
                        bx9 bx9Var111 = v51.a;
                        z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                        i4 &= -458753;
                    } else {
                        z51Var4 = z51Var2;
                    }
                    if (i7 != 0) {
                        q11Var2 = null;
                    }
                    if (i9 != 0) {
                        xw9Var4 = v51.a;
                    } else {
                        xw9Var4 = xw9Var2;
                    }
                    z51Var2 = z51Var4;
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                    xw9Var5 = xw9Var4;
                    j09Var4 = j09Var2;
                }
                i12 = i4;
                u51Var3 = u51VarC;
                l46Var.s();
                l46Var.f0(1691738187);
                objR = l46Var.R();
                obj = sf2.a;
                if (objR == obj) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                if (z2) {
                    j2 = u51Var3.a;
                } else {
                    j2 = u51Var3.c;
                }
                if (z2) {
                    j3 = u51Var3.b;
                } else {
                    j3 = u51Var3.d;
                }
                if (z51Var2 == null) {
                    l46Var.f0(1691921830);
                    l46Var.r(false);
                    u51Var3 = u51Var3;
                    xw9Var5 = xw9Var5;
                    z6 = z2;
                    q11Var4 = q11Var4;
                    t69Var = t69Var;
                    z51Var5 = z51Var2;
                    wzVar = null;
                } else {
                    l46Var.f0(-499611205);
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        objR2 = new jsd();
                        l46Var.p0(objR2);
                    }
                    jsdVar = (jsd) objR2;
                    zG = l46Var.g(t69Var);
                    objR3 = l46Var.R();
                    if (zG) {
                        objR3 = new x51(t69Var, jsdVar, null);
                        l46Var.p0(objR3);
                    } else {
                        objR3 = new x51(t69Var, jsdVar, null);
                        l46Var.p0(objR3);
                    }
                    af1.o((l26) objR3, l46Var, t69Var);
                    l77Var = (l77) s72.H0(jsdVar);
                    if (!z2) {
                        f2 = 0.0f;
                    } else if (l77Var instanceof pta) {
                        f2 = z51Var2.b;
                    } else if (l77Var instanceof yq6) {
                        f2 = z51Var2.d;
                    } else if (l77Var instanceof rn5) {
                        f2 = z51Var2.c;
                    } else {
                        f2 = z51Var2.a;
                    }
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                        l46Var.p0(objR4);
                    }
                    jxVar = (jx) objR4;
                    yi4 yi4Var4 = new yi4(f2);
                    boolean zI5 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zI = zI5 | z3 | l46Var.i(l77Var);
                    objR5 = l46Var.R();
                    if (zI) {
                        boolean z12 = z2;
                        z51 z51Var11 = z51Var2;
                        objR5 = new y51(jxVar, f2, z12, z51Var11, l77Var, null);
                        z6 = z12;
                        z51Var5 = z51Var11;
                        l46Var.p0(objR5);
                    } else {
                        boolean z13 = z2;
                        z51 z51Var12 = z51Var2;
                        objR5 = new y51(jxVar, f2, z13, z51Var12, l77Var, null);
                        z6 = z13;
                        z51Var5 = z51Var12;
                        l46Var.p0(objR5);
                    }
                    af1.o((l26) objR5, l46Var, yi4Var4);
                    wzVar = jxVar.c;
                    l46Var.r(false);
                }
                if (wzVar != null) {
                    f3 = ((yi4) wzVar.b.getValue()).a;
                } else {
                    f3 = 0.0f;
                }
                objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = new wu0(9);
                    l46Var.p0(objR6);
                }
                q11 q11Var8 = q11Var4;
                nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var8, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                z5 = z6;
                q11Var3 = q11Var8;
                z51Var3 = z51Var5;
                j09Var3 = j09Var4;
                x4dVar2 = x4dVar3;
                u51Var2 = u51Var3;
                xw9Var3 = xw9Var5;
            } else {
                l46Var.Z();
                xw9Var3 = xw9Var2;
                j09Var3 = j09Var2;
                z5 = z2;
                x4dVar2 = x4dVarB;
                u51Var2 = u51VarC;
                z51Var3 = z51Var2;
                q11Var3 = q11Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
            }
        }
        i4 |= 48;
        j09Var2 = j09Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                if (l46Var.h(z2)) {
                    i6 = 256;
                } else {
                    i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    x4dVarB = x4dVar;
                    if (l46Var.g(x4dVarB)) {
                        i16 = 2048;
                    }
                    i4 |= i16;
                } else {
                    x4dVarB = x4dVar;
                }
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i4 |= i16;
            } else {
                x4dVarB = x4dVar;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    u51VarC = u51Var;
                    if (l46Var.g(u51VarC)) {
                        i15 = 16384;
                    }
                    i4 |= i15;
                } else {
                    u51VarC = u51Var;
                }
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i4 |= i15;
            } else {
                u51VarC = u51Var;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    z51Var2 = z51Var;
                    if (l46Var.g(z51Var2)) {
                    }
                    i4 |= i18;
                } else {
                    z51Var2 = z51Var;
                }
                i4 |= i18;
            } else {
                z51Var2 = z51Var;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    q11Var2 = q11Var;
                    if (l46Var.g(q11Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 != 0) {
                    i4 |= 12582912;
                    xw9Var2 = xw9Var;
                } else {
                    xw9Var2 = xw9Var;
                    if ((i2 & 12582912) == 0) {
                        if (l46Var.g(xw9Var2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (l46Var.g(null)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                }
                if ((i2 & 805306368) == 0) {
                    if (l46Var.i(n26Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i4 |= i14;
                }
                z3 = true;
                if ((i4 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i4 & 1, z4)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var112 = v51.a;
                            i4 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var113 = v51.a;
                            i4 &= -57345;
                            u51VarC = v51.c((m82) l46Var.k(o82.a));
                        }
                        if ((i3 & 32) != 0) {
                            bx9 bx9Var114 = v51.a;
                            z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                            i4 &= -458753;
                        } else {
                            z51Var4 = z51Var2;
                        }
                        if (i7 != 0) {
                            q11Var2 = null;
                        }
                        if (i9 != 0) {
                            xw9Var4 = v51.a;
                        } else {
                            xw9Var4 = xw9Var2;
                        }
                        z51Var2 = z51Var4;
                        x4dVar3 = x4dVarB;
                        q11Var4 = q11Var2;
                        xw9Var5 = xw9Var4;
                        j09Var4 = j09Var2;
                    } else {
                        if (i17 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var115 = v51.a;
                            i4 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var116 = v51.a;
                            i4 &= -57345;
                            u51VarC = v51.c((m82) l46Var.k(o82.a));
                        }
                        if ((i3 & 32) != 0) {
                            bx9 bx9Var117 = v51.a;
                            z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                            i4 &= -458753;
                        } else {
                            z51Var4 = z51Var2;
                        }
                        if (i7 != 0) {
                            q11Var2 = null;
                        }
                        if (i9 != 0) {
                            xw9Var4 = v51.a;
                        } else {
                            xw9Var4 = xw9Var2;
                        }
                        z51Var2 = z51Var4;
                        x4dVar3 = x4dVarB;
                        q11Var4 = q11Var2;
                        xw9Var5 = xw9Var4;
                        j09Var4 = j09Var2;
                    }
                    i12 = i4;
                    u51Var3 = u51VarC;
                    l46Var.s();
                    l46Var.f0(1691738187);
                    objR = l46Var.R();
                    obj = sf2.a;
                    if (objR == obj) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    if (z2) {
                        j2 = u51Var3.a;
                    } else {
                        j2 = u51Var3.c;
                    }
                    if (z2) {
                        j3 = u51Var3.b;
                    } else {
                        j3 = u51Var3.d;
                    }
                    if (z51Var2 == null) {
                        l46Var.f0(1691921830);
                        l46Var.r(false);
                        u51Var3 = u51Var3;
                        xw9Var5 = xw9Var5;
                        z6 = z2;
                        q11Var4 = q11Var4;
                        t69Var = t69Var;
                        z51Var5 = z51Var2;
                        wzVar = null;
                    } else {
                        l46Var.f0(-499611205);
                        i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new jsd();
                            l46Var.p0(objR2);
                        }
                        jsdVar = (jsd) objR2;
                        zG = l46Var.g(t69Var);
                        objR3 = l46Var.R();
                        if (zG) {
                            objR3 = new x51(t69Var, jsdVar, null);
                            l46Var.p0(objR3);
                        } else {
                            objR3 = new x51(t69Var, jsdVar, null);
                            l46Var.p0(objR3);
                        }
                        af1.o((l26) objR3, l46Var, t69Var);
                        l77Var = (l77) s72.H0(jsdVar);
                        if (!z2) {
                            f2 = 0.0f;
                        } else if (l77Var instanceof pta) {
                            f2 = z51Var2.b;
                        } else if (l77Var instanceof yq6) {
                            f2 = z51Var2.d;
                        } else if (l77Var instanceof rn5) {
                            f2 = z51Var2.c;
                        } else {
                            f2 = z51Var2.a;
                        }
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                            l46Var.p0(objR4);
                        }
                        jxVar = (jx) objR4;
                        yi4 yi4Var5 = new yi4(f2);
                        boolean zI6 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                        if (((i13 & 896) ^ 384) > 256) {
                        }
                        zI = zI6 | z3 | l46Var.i(l77Var);
                        objR5 = l46Var.R();
                        if (zI) {
                            boolean z14 = z2;
                            z51 z51Var13 = z51Var2;
                            objR5 = new y51(jxVar, f2, z14, z51Var13, l77Var, null);
                            z6 = z14;
                            z51Var5 = z51Var13;
                            l46Var.p0(objR5);
                        } else {
                            boolean z15 = z2;
                            z51 z51Var14 = z51Var2;
                            objR5 = new y51(jxVar, f2, z15, z51Var14, l77Var, null);
                            z6 = z15;
                            z51Var5 = z51Var14;
                            l46Var.p0(objR5);
                        }
                        af1.o((l26) objR5, l46Var, yi4Var5);
                        wzVar = jxVar.c;
                        l46Var.r(false);
                    }
                    if (wzVar != null) {
                        f3 = ((yi4) wzVar.b.getValue()).a;
                    } else {
                        f3 = 0.0f;
                    }
                    objR6 = l46Var.R();
                    if (objR6 == obj) {
                        objR6 = new wu0(9);
                        l46Var.p0(objR6);
                    }
                    q11 q11Var9 = q11Var4;
                    nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var9, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                    z5 = z6;
                    q11Var3 = q11Var9;
                    z51Var3 = z51Var5;
                    j09Var3 = j09Var4;
                    x4dVar2 = x4dVar3;
                    u51Var2 = u51Var3;
                    xw9Var3 = xw9Var5;
                } else {
                    l46Var.Z();
                    xw9Var3 = xw9Var2;
                    j09Var3 = j09Var2;
                    z5 = z2;
                    x4dVar2 = x4dVarB;
                    u51Var2 = u51VarC;
                    z51Var3 = z51Var2;
                    q11Var3 = q11Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
                }
            }
            i4 |= 1572864;
            q11Var2 = q11Var;
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                i4 |= 12582912;
                xw9Var2 = xw9Var;
            } else {
                xw9Var2 = xw9Var;
                if ((i2 & 12582912) == 0) {
                    if (l46Var.g(xw9Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (l46Var.g(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.i(n26Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            z3 = true;
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i4 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var118 = v51.a;
                        i4 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var119 = v51.a;
                        i4 &= -57345;
                        u51VarC = v51.c((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 32) != 0) {
                        bx9 bx9Var1110 = v51.a;
                        z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                        i4 &= -458753;
                    } else {
                        z51Var4 = z51Var2;
                    }
                    if (i7 != 0) {
                        q11Var2 = null;
                    }
                    if (i9 != 0) {
                        xw9Var4 = v51.a;
                    } else {
                        xw9Var4 = xw9Var2;
                    }
                    z51Var2 = z51Var4;
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                    xw9Var5 = xw9Var4;
                    j09Var4 = j09Var2;
                } else {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var1111 = v51.a;
                        i4 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var1112 = v51.a;
                        i4 &= -57345;
                        u51VarC = v51.c((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 32) != 0) {
                        bx9 bx9Var1113 = v51.a;
                        z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                        i4 &= -458753;
                    } else {
                        z51Var4 = z51Var2;
                    }
                    if (i7 != 0) {
                        q11Var2 = null;
                    }
                    if (i9 != 0) {
                        xw9Var4 = v51.a;
                    } else {
                        xw9Var4 = xw9Var2;
                    }
                    z51Var2 = z51Var4;
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                    xw9Var5 = xw9Var4;
                    j09Var4 = j09Var2;
                }
                i12 = i4;
                u51Var3 = u51VarC;
                l46Var.s();
                l46Var.f0(1691738187);
                objR = l46Var.R();
                obj = sf2.a;
                if (objR == obj) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                if (z2) {
                    j2 = u51Var3.a;
                } else {
                    j2 = u51Var3.c;
                }
                if (z2) {
                    j3 = u51Var3.b;
                } else {
                    j3 = u51Var3.d;
                }
                if (z51Var2 == null) {
                    l46Var.f0(1691921830);
                    l46Var.r(false);
                    u51Var3 = u51Var3;
                    xw9Var5 = xw9Var5;
                    z6 = z2;
                    q11Var4 = q11Var4;
                    t69Var = t69Var;
                    z51Var5 = z51Var2;
                    wzVar = null;
                } else {
                    l46Var.f0(-499611205);
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        objR2 = new jsd();
                        l46Var.p0(objR2);
                    }
                    jsdVar = (jsd) objR2;
                    zG = l46Var.g(t69Var);
                    objR3 = l46Var.R();
                    if (zG) {
                        objR3 = new x51(t69Var, jsdVar, null);
                        l46Var.p0(objR3);
                    } else {
                        objR3 = new x51(t69Var, jsdVar, null);
                        l46Var.p0(objR3);
                    }
                    af1.o((l26) objR3, l46Var, t69Var);
                    l77Var = (l77) s72.H0(jsdVar);
                    if (!z2) {
                        f2 = 0.0f;
                    } else if (l77Var instanceof pta) {
                        f2 = z51Var2.b;
                    } else if (l77Var instanceof yq6) {
                        f2 = z51Var2.d;
                    } else if (l77Var instanceof rn5) {
                        f2 = z51Var2.c;
                    } else {
                        f2 = z51Var2.a;
                    }
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                        l46Var.p0(objR4);
                    }
                    jxVar = (jx) objR4;
                    yi4 yi4Var6 = new yi4(f2);
                    boolean zI7 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zI = zI7 | z3 | l46Var.i(l77Var);
                    objR5 = l46Var.R();
                    if (zI) {
                        boolean z16 = z2;
                        z51 z51Var15 = z51Var2;
                        objR5 = new y51(jxVar, f2, z16, z51Var15, l77Var, null);
                        z6 = z16;
                        z51Var5 = z51Var15;
                        l46Var.p0(objR5);
                    } else {
                        boolean z17 = z2;
                        z51 z51Var16 = z51Var2;
                        objR5 = new y51(jxVar, f2, z17, z51Var16, l77Var, null);
                        z6 = z17;
                        z51Var5 = z51Var16;
                        l46Var.p0(objR5);
                    }
                    af1.o((l26) objR5, l46Var, yi4Var6);
                    wzVar = jxVar.c;
                    l46Var.r(false);
                }
                if (wzVar != null) {
                    f3 = ((yi4) wzVar.b.getValue()).a;
                } else {
                    f3 = 0.0f;
                }
                objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = new wu0(9);
                    l46Var.p0(objR6);
                }
                q11 q11Var10 = q11Var4;
                nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var10, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                z5 = z6;
                q11Var3 = q11Var10;
                z51Var3 = z51Var5;
                j09Var3 = j09Var4;
                x4dVar2 = x4dVar3;
                u51Var2 = u51Var3;
                xw9Var3 = xw9Var5;
            } else {
                l46Var.Z();
                xw9Var3 = xw9Var2;
                j09Var3 = j09Var2;
                z5 = z2;
                x4dVar2 = x4dVarB;
                u51Var2 = u51VarC;
                z51Var3 = z51Var2;
                q11Var3 = q11Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                x4dVarB = x4dVar;
                if (l46Var.g(x4dVarB)) {
                    i16 = 2048;
                }
                i4 |= i16;
            } else {
                x4dVarB = x4dVar;
            }
            i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i4 |= i16;
        } else {
            x4dVarB = x4dVar;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                u51VarC = u51Var;
                if (l46Var.g(u51VarC)) {
                    i15 = 16384;
                }
                i4 |= i15;
            } else {
                u51VarC = u51Var;
            }
            i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i4 |= i15;
        } else {
            u51VarC = u51Var;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                z51Var2 = z51Var;
                if (l46Var.g(z51Var2)) {
                }
                i4 |= i18;
            } else {
                z51Var2 = z51Var;
            }
            i4 |= i18;
        } else {
            z51Var2 = z51Var;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            if ((1572864 & i2) == 0) {
                q11Var2 = q11Var;
                if (l46Var.g(q11Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                i4 |= 12582912;
                xw9Var2 = xw9Var;
            } else {
                xw9Var2 = xw9Var;
                if ((i2 & 12582912) == 0) {
                    if (l46Var.g(xw9Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
            }
            if ((i3 & 256) != 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (l46Var.g(null)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            }
            if ((i2 & 805306368) == 0) {
                if (l46Var.i(n26Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            z3 = true;
            if ((i4 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i4 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var1114 = v51.a;
                        i4 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var1115 = v51.a;
                        i4 &= -57345;
                        u51VarC = v51.c((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 32) != 0) {
                        bx9 bx9Var1116 = v51.a;
                        z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                        i4 &= -458753;
                    } else {
                        z51Var4 = z51Var2;
                    }
                    if (i7 != 0) {
                        q11Var2 = null;
                    }
                    if (i9 != 0) {
                        xw9Var4 = v51.a;
                    } else {
                        xw9Var4 = xw9Var2;
                    }
                    z51Var2 = z51Var4;
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                    xw9Var5 = xw9Var4;
                    j09Var4 = j09Var2;
                } else {
                    if (i17 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var1117 = v51.a;
                        i4 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var1118 = v51.a;
                        i4 &= -57345;
                        u51VarC = v51.c((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 32) != 0) {
                        bx9 bx9Var1119 = v51.a;
                        z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                        i4 &= -458753;
                    } else {
                        z51Var4 = z51Var2;
                    }
                    if (i7 != 0) {
                        q11Var2 = null;
                    }
                    if (i9 != 0) {
                        xw9Var4 = v51.a;
                    } else {
                        xw9Var4 = xw9Var2;
                    }
                    z51Var2 = z51Var4;
                    x4dVar3 = x4dVarB;
                    q11Var4 = q11Var2;
                    xw9Var5 = xw9Var4;
                    j09Var4 = j09Var2;
                }
                i12 = i4;
                u51Var3 = u51VarC;
                l46Var.s();
                l46Var.f0(1691738187);
                objR = l46Var.R();
                obj = sf2.a;
                if (objR == obj) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                if (z2) {
                    j2 = u51Var3.a;
                } else {
                    j2 = u51Var3.c;
                }
                if (z2) {
                    j3 = u51Var3.b;
                } else {
                    j3 = u51Var3.d;
                }
                if (z51Var2 == null) {
                    l46Var.f0(1691921830);
                    l46Var.r(false);
                    u51Var3 = u51Var3;
                    xw9Var5 = xw9Var5;
                    z6 = z2;
                    q11Var4 = q11Var4;
                    t69Var = t69Var;
                    z51Var5 = z51Var2;
                    wzVar = null;
                } else {
                    l46Var.f0(-499611205);
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        objR2 = new jsd();
                        l46Var.p0(objR2);
                    }
                    jsdVar = (jsd) objR2;
                    zG = l46Var.g(t69Var);
                    objR3 = l46Var.R();
                    if (zG) {
                        objR3 = new x51(t69Var, jsdVar, null);
                        l46Var.p0(objR3);
                    } else {
                        objR3 = new x51(t69Var, jsdVar, null);
                        l46Var.p0(objR3);
                    }
                    af1.o((l26) objR3, l46Var, t69Var);
                    l77Var = (l77) s72.H0(jsdVar);
                    if (!z2) {
                        f2 = 0.0f;
                    } else if (l77Var instanceof pta) {
                        f2 = z51Var2.b;
                    } else if (l77Var instanceof yq6) {
                        f2 = z51Var2.d;
                    } else if (l77Var instanceof rn5) {
                        f2 = z51Var2.c;
                    } else {
                        f2 = z51Var2.a;
                    }
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                        l46Var.p0(objR4);
                    }
                    jxVar = (jx) objR4;
                    yi4 yi4Var7 = new yi4(f2);
                    boolean zI8 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zI = zI8 | z3 | l46Var.i(l77Var);
                    objR5 = l46Var.R();
                    if (zI) {
                        boolean z18 = z2;
                        z51 z51Var17 = z51Var2;
                        objR5 = new y51(jxVar, f2, z18, z51Var17, l77Var, null);
                        z6 = z18;
                        z51Var5 = z51Var17;
                        l46Var.p0(objR5);
                    } else {
                        boolean z19 = z2;
                        z51 z51Var18 = z51Var2;
                        objR5 = new y51(jxVar, f2, z19, z51Var18, l77Var, null);
                        z6 = z19;
                        z51Var5 = z51Var18;
                        l46Var.p0(objR5);
                    }
                    af1.o((l26) objR5, l46Var, yi4Var7);
                    wzVar = jxVar.c;
                    l46Var.r(false);
                }
                if (wzVar != null) {
                    f3 = ((yi4) wzVar.b.getValue()).a;
                } else {
                    f3 = 0.0f;
                }
                objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = new wu0(9);
                    l46Var.p0(objR6);
                }
                q11 q11Var11 = q11Var4;
                nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var11, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                z5 = z6;
                q11Var3 = q11Var11;
                z51Var3 = z51Var5;
                j09Var3 = j09Var4;
                x4dVar2 = x4dVar3;
                u51Var2 = u51Var3;
                xw9Var3 = xw9Var5;
            } else {
                l46Var.Z();
                xw9Var3 = xw9Var2;
                j09Var3 = j09Var2;
                z5 = z2;
                x4dVar2 = x4dVarB;
                u51Var2 = u51VarC;
                z51Var3 = z51Var2;
                q11Var3 = q11Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
            }
        }
        i4 |= 1572864;
        q11Var2 = q11Var;
        i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i9 != 0) {
            i4 |= 12582912;
            xw9Var2 = xw9Var;
        } else {
            xw9Var2 = xw9Var;
            if ((i2 & 12582912) == 0) {
                if (l46Var.g(xw9Var2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (l46Var.g(null)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i4 |= i11;
        }
        if ((i2 & 805306368) == 0) {
            if (l46Var.i(n26Var)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        z3 = true;
        if ((i4 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i4 & 1, z4)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i17 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 8) != 0) {
                    bx9 bx9Var11110 = v51.a;
                    i4 &= -7169;
                    x4dVarB = u5d.b(k99.a, l46Var);
                }
                if ((i3 & 16) != 0) {
                    bx9 bx9Var11111 = v51.a;
                    i4 &= -57345;
                    u51VarC = v51.c((m82) l46Var.k(o82.a));
                }
                if ((i3 & 32) != 0) {
                    bx9 bx9Var11112 = v51.a;
                    z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                    i4 &= -458753;
                } else {
                    z51Var4 = z51Var2;
                }
                if (i7 != 0) {
                    q11Var2 = null;
                }
                if (i9 != 0) {
                    xw9Var4 = v51.a;
                } else {
                    xw9Var4 = xw9Var2;
                }
                z51Var2 = z51Var4;
                x4dVar3 = x4dVarB;
                q11Var4 = q11Var2;
                xw9Var5 = xw9Var4;
                j09Var4 = j09Var2;
            } else {
                if (i17 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if ((i3 & 8) != 0) {
                    bx9 bx9Var11113 = v51.a;
                    i4 &= -7169;
                    x4dVarB = u5d.b(k99.a, l46Var);
                }
                if ((i3 & 16) != 0) {
                    bx9 bx9Var11114 = v51.a;
                    i4 &= -57345;
                    u51VarC = v51.c((m82) l46Var.k(o82.a));
                }
                if ((i3 & 32) != 0) {
                    bx9 bx9Var11115 = v51.a;
                    z51Var4 = new z51(0.0f, 0.0f, 0.0f, eb3.x);
                    i4 &= -458753;
                } else {
                    z51Var4 = z51Var2;
                }
                if (i7 != 0) {
                    q11Var2 = null;
                }
                if (i9 != 0) {
                    xw9Var4 = v51.a;
                } else {
                    xw9Var4 = xw9Var2;
                }
                z51Var2 = z51Var4;
                x4dVar3 = x4dVarB;
                q11Var4 = q11Var2;
                xw9Var5 = xw9Var4;
                j09Var4 = j09Var2;
            }
            i12 = i4;
            u51Var3 = u51VarC;
            l46Var.s();
            l46Var.f0(1691738187);
            objR = l46Var.R();
            obj = sf2.a;
            if (objR == obj) {
                objR = ib8.e(l46Var);
            }
            t69Var = (t69) objR;
            l46Var.r(false);
            if (z2) {
                j2 = u51Var3.a;
            } else {
                j2 = u51Var3.c;
            }
            if (z2) {
                j3 = u51Var3.b;
            } else {
                j3 = u51Var3.d;
            }
            if (z51Var2 == null) {
                l46Var.f0(1691921830);
                l46Var.r(false);
                u51Var3 = u51Var3;
                xw9Var5 = xw9Var5;
                z6 = z2;
                q11Var4 = q11Var4;
                t69Var = t69Var;
                z51Var5 = z51Var2;
                wzVar = null;
            } else {
                l46Var.f0(-499611205);
                i13 = ((i12 >> 9) & 896) | ((i12 >> 6) & 14);
                objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = new jsd();
                    l46Var.p0(objR2);
                }
                jsdVar = (jsd) objR2;
                zG = l46Var.g(t69Var);
                objR3 = l46Var.R();
                if (zG) {
                    objR3 = new x51(t69Var, jsdVar, null);
                    l46Var.p0(objR3);
                } else {
                    objR3 = new x51(t69Var, jsdVar, null);
                    l46Var.p0(objR3);
                }
                af1.o((l26) objR3, l46Var, t69Var);
                l77Var = (l77) s72.H0(jsdVar);
                if (!z2) {
                    f2 = 0.0f;
                } else if (l77Var instanceof pta) {
                    f2 = z51Var2.b;
                } else if (l77Var instanceof yq6) {
                    f2 = z51Var2.d;
                } else if (l77Var instanceof rn5) {
                    f2 = z51Var2.c;
                } else {
                    f2 = z51Var2.a;
                }
                objR4 = l46Var.R();
                if (objR4 == obj) {
                    objR4 = new jx(new yi4(f2), xo1.i, null, 12);
                    l46Var.p0(objR4);
                }
                jxVar = (jx) objR4;
                yi4 yi4Var8 = new yi4(f2);
                boolean zI9 = l46Var.i(jxVar) | l46Var.d(f2) | ((((i13 & 14) ^ 6) <= 4 && l46Var.h(z2)) || (i13 & 6) == 4);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zI = zI9 | z3 | l46Var.i(l77Var);
                objR5 = l46Var.R();
                if (zI) {
                    boolean z110 = z2;
                    z51 z51Var19 = z51Var2;
                    objR5 = new y51(jxVar, f2, z110, z51Var19, l77Var, null);
                    z6 = z110;
                    z51Var5 = z51Var19;
                    l46Var.p0(objR5);
                } else {
                    boolean z111 = z2;
                    z51 z51Var110 = z51Var2;
                    objR5 = new y51(jxVar, f2, z111, z51Var110, l77Var, null);
                    z6 = z111;
                    z51Var5 = z51Var110;
                    l46Var.p0(objR5);
                }
                af1.o((l26) objR5, l46Var, yi4Var8);
                wzVar = jxVar.c;
                l46Var.r(false);
            }
            if (wzVar != null) {
                f3 = ((yi4) wzVar.b.getValue()).a;
            } else {
                f3 = 0.0f;
            }
            objR6 = l46Var.R();
            if (objR6 == obj) {
                objR6 = new wu0(9);
                l46Var.p0(objR6);
            }
            q11 q11Var12 = q11Var4;
            nae.c(x16Var, vwc.b(j09Var4, false, (a26) objR6), z6, x4dVar3, j2, j3, 0.0f, f3, q11Var12, t69Var, af1.b0(-535639973, new d61(j3, xw9Var5, n26Var, 0), l46Var), l46Var, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
            z5 = z6;
            q11Var3 = q11Var12;
            z51Var3 = z51Var5;
            j09Var3 = j09Var4;
            x4dVar2 = x4dVar3;
            u51Var2 = u51Var3;
            xw9Var3 = xw9Var5;
        } else {
            l46Var.Z();
            xw9Var3 = xw9Var2;
            j09Var3 = j09Var2;
            z5 = z2;
            x4dVar2 = x4dVarB;
            u51Var2 = u51VarC;
            z51Var3 = z51Var2;
            q11Var3 = q11Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b61(x16Var, j09Var3, z5, x4dVar2, u51Var2, z51Var3, q11Var3, xw9Var3, n26Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x0171  */
    /* JADX WARN: Code duplicated, block: B:86:0x0177  */
    /* JADX WARN: Code duplicated, block: B:88:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void b(j09 j09Var, String str, boolean z, mue mueVar, y72 y72Var, l46 l46Var, int i2, int i3) {
        int i4;
        mue mueVar2;
        int i5;
        y72 y72Var2;
        int i6;
        boolean z2;
        l46 l46Var2;
        mue mueVar3;
        y72 y72Var3;
        ojb ojbVarV;
        y72 y72Var4;
        mue mueVar4;
        long jB;
        pr4 pr4Var;
        int iOrdinal;
        ar5 ar5Var;
        l46Var.h0(-662076963);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                mueVar2 = mueVar;
                i4 |= l46Var.g(mueVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    y72Var2 = y72Var;
                    if (l46Var.g(y72Var2)) {
                        i6 = 16384;
                    } else {
                        i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i6;
                }
                if ((i4 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i7 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar2;
                    }
                    if (i5 != 0) {
                        y72Var4 = null;
                    } else {
                        y72Var4 = y72Var2;
                    }
                    if (mueVar3 == null) {
                        l46Var.f0(-600795249);
                        mue mueVar5 = pue.a;
                        mue mueVarJ = pue.j(l46Var);
                        if (z) {
                            ar5Var = ar5.c;
                        } else {
                            ar5Var = ar5.b;
                        }
                        mue mueVarA = mue.a(mueVarJ, 0L, 0L, ar5Var, null, 0L, null, 0, 0L, null, null, 16777211);
                        l46Var.r(false);
                        mueVar4 = mueVarA;
                    } else {
                        l46Var.f0(-600796086);
                        l46Var.r(false);
                        mueVar4 = mueVar3;
                    }
                    if (y72Var4 == null) {
                        l46Var.f0(-1444666167);
                        pr4Var = l8b.a;
                        iOrdinal = ((e8b) l46Var.k(pr4Var)).C.ordinal();
                        if (iOrdinal != 0) {
                            l46Var.f0(-600789181);
                            if (z) {
                                l46Var.f0(-600788437);
                                jB = ((e8b) l46Var.k(pr4Var)).q;
                            } else {
                                l46Var.f0(-600787569);
                                jB = ((e8b) l46Var.k(pr4Var)).t;
                            }
                            l46Var.r(false);
                            l46Var.r(false);
                        } else {
                            if (iOrdinal == 1) {
                                throw tec.d(-600791463, l46Var, false);
                            }
                            l46Var.f0(-600785360);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).q, 0.95f);
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-600791742);
                        l46Var.r(false);
                        jB = y72Var4.a;
                    }
                    xn8 xn8VarC = s21.c(ndb.f, false);
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
                    nte.b(str, null, jB, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar4, l46Var, (i4 >> 3) & 14, 0, 130042);
                    l46Var2 = l46Var;
                    l46Var2.r(true);
                    y72Var3 = y72Var4;
                } else {
                    l46Var2 = l46Var;
                    l46Var2.Z();
                    mueVar3 = mueVar2;
                    y72Var3 = y72Var2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jv1(j09Var, str, z, mueVar3, y72Var3, i2, i3, 0);
                }
            }
            i4 |= 24576;
            y72Var2 = y72Var;
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i7 != 0) {
                    mueVar3 = null;
                } else {
                    mueVar3 = mueVar2;
                }
                if (i5 != 0) {
                    y72Var4 = null;
                } else {
                    y72Var4 = y72Var2;
                }
                if (mueVar3 == null) {
                    l46Var.f0(-600795249);
                    mue mueVar6 = pue.a;
                    mue mueVarJ2 = pue.j(l46Var);
                    if (z) {
                        ar5Var = ar5.c;
                    } else {
                        ar5Var = ar5.b;
                    }
                    mue mueVarA2 = mue.a(mueVarJ2, 0L, 0L, ar5Var, null, 0L, null, 0, 0L, null, null, 16777211);
                    l46Var.r(false);
                    mueVar4 = mueVarA2;
                } else {
                    l46Var.f0(-600796086);
                    l46Var.r(false);
                    mueVar4 = mueVar3;
                }
                if (y72Var4 == null) {
                    l46Var.f0(-1444666167);
                    pr4Var = l8b.a;
                    iOrdinal = ((e8b) l46Var.k(pr4Var)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-600789181);
                        if (z) {
                            l46Var.f0(-600788437);
                            jB = ((e8b) l46Var.k(pr4Var)).q;
                        } else {
                            l46Var.f0(-600787569);
                            jB = ((e8b) l46Var.k(pr4Var)).t;
                        }
                        l46Var.r(false);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-600791463, l46Var, false);
                        }
                        l46Var.f0(-600785360);
                        jB = y72.b(((e8b) l46Var.k(pr4Var)).q, 0.95f);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(-600791742);
                    l46Var.r(false);
                    jB = y72Var4.a;
                }
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09Var);
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
                nte.b(str, null, jB, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar4, l46Var, (i4 >> 3) & 14, 0, 130042);
                l46Var2 = l46Var;
                l46Var2.r(true);
                y72Var3 = y72Var4;
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
                mueVar3 = mueVar2;
                y72Var3 = y72Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jv1(j09Var, str, z, mueVar3, y72Var3, i2, i3, 0);
            }
        }
        i4 |= 3072;
        mueVar2 = mueVar;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                y72Var2 = y72Var;
                if (l46Var.g(y72Var2)) {
                    i6 = 16384;
                } else {
                    i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i6;
            }
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i7 != 0) {
                    mueVar3 = null;
                } else {
                    mueVar3 = mueVar2;
                }
                if (i5 != 0) {
                    y72Var4 = null;
                } else {
                    y72Var4 = y72Var2;
                }
                if (mueVar3 == null) {
                    l46Var.f0(-600795249);
                    mue mueVar7 = pue.a;
                    mue mueVarJ3 = pue.j(l46Var);
                    if (z) {
                        ar5Var = ar5.c;
                    } else {
                        ar5Var = ar5.b;
                    }
                    mue mueVarA3 = mue.a(mueVarJ3, 0L, 0L, ar5Var, null, 0L, null, 0, 0L, null, null, 16777211);
                    l46Var.r(false);
                    mueVar4 = mueVarA3;
                } else {
                    l46Var.f0(-600796086);
                    l46Var.r(false);
                    mueVar4 = mueVar3;
                }
                if (y72Var4 == null) {
                    l46Var.f0(-1444666167);
                    pr4Var = l8b.a;
                    iOrdinal = ((e8b) l46Var.k(pr4Var)).C.ordinal();
                    if (iOrdinal != 0) {
                        l46Var.f0(-600789181);
                        if (z) {
                            l46Var.f0(-600788437);
                            jB = ((e8b) l46Var.k(pr4Var)).q;
                        } else {
                            l46Var.f0(-600787569);
                            jB = ((e8b) l46Var.k(pr4Var)).t;
                        }
                        l46Var.r(false);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal == 1) {
                            throw tec.d(-600791463, l46Var, false);
                        }
                        l46Var.f0(-600785360);
                        jB = y72.b(((e8b) l46Var.k(pr4Var)).q, 0.95f);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(-600791742);
                    l46Var.r(false);
                    jB = y72Var4.a;
                }
                xn8 xn8VarC3 = s21.c(ndb.f, false);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09Var);
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
                nte.b(str, null, jB, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar4, l46Var, (i4 >> 3) & 14, 0, 130042);
                l46Var2 = l46Var;
                l46Var2.r(true);
                y72Var3 = y72Var4;
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
                mueVar3 = mueVar2;
                y72Var3 = y72Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jv1(j09Var, str, z, mueVar3, y72Var3, i2, i3, 0);
            }
        }
        i4 |= 24576;
        y72Var2 = y72Var;
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i4 & 1, z2)) {
            if (i7 != 0) {
                mueVar3 = null;
            } else {
                mueVar3 = mueVar2;
            }
            if (i5 != 0) {
                y72Var4 = null;
            } else {
                y72Var4 = y72Var2;
            }
            if (mueVar3 == null) {
                l46Var.f0(-600795249);
                mue mueVar8 = pue.a;
                mue mueVarJ4 = pue.j(l46Var);
                if (z) {
                    ar5Var = ar5.c;
                } else {
                    ar5Var = ar5.b;
                }
                mue mueVarA4 = mue.a(mueVarJ4, 0L, 0L, ar5Var, null, 0L, null, 0, 0L, null, null, 16777211);
                l46Var.r(false);
                mueVar4 = mueVarA4;
            } else {
                l46Var.f0(-600796086);
                l46Var.r(false);
                mueVar4 = mueVar3;
            }
            if (y72Var4 == null) {
                l46Var.f0(-1444666167);
                pr4Var = l8b.a;
                iOrdinal = ((e8b) l46Var.k(pr4Var)).C.ordinal();
                if (iOrdinal != 0) {
                    l46Var.f0(-600789181);
                    if (z) {
                        l46Var.f0(-600788437);
                        jB = ((e8b) l46Var.k(pr4Var)).q;
                    } else {
                        l46Var.f0(-600787569);
                        jB = ((e8b) l46Var.k(pr4Var)).t;
                    }
                    l46Var.r(false);
                    l46Var.r(false);
                } else {
                    if (iOrdinal == 1) {
                        throw tec.d(-600791463, l46Var, false);
                    }
                    l46Var.f0(-600785360);
                    jB = y72.b(((e8b) l46Var.k(pr4Var)).q, 0.95f);
                    l46Var.r(false);
                }
                l46Var.r(false);
            } else {
                l46Var.f0(-600791742);
                l46Var.r(false);
                jB = y72Var4.a;
            }
            xn8 xn8VarC4 = s21.c(ndb.f, false);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09Var);
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
            nte.b(str, null, jB, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar4, l46Var, (i4 >> 3) & 14, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
            y72Var3 = y72Var4;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            mueVar3 = mueVar2;
            y72Var3 = y72Var2;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jv1(j09Var, str, z, mueVar3, y72Var3, i2, i3, 0);
        }
    }

    public static final void c(j09 j09Var, TarotCardChoice tarotCardChoice, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        TarotCardChoice tarotCardChoice2;
        j09 j09Var3;
        j09 j09Var4;
        boolean z;
        long jB;
        l46 l46Var2 = l46Var;
        tarotCardChoice.getClass();
        l46Var2.h0(979348995);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = i2 | (l46Var2.g(j09Var2) ? 4 : 2);
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            tarotCardChoice2 = tarotCardChoice;
            i4 |= l46Var2.g(tarotCardChoice2) ? 32 : 16;
        } else {
            tarotCardChoice2 = tarotCardChoice;
        }
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09Var5 = i5 != 0 ? g09Var : j09Var2;
            t7c t7cVarA = s7c.a(xc0.e, ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var5);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            if (tarotCardChoice2.isReversed()) {
                l46Var2.f0(-2116347949);
                j09 j09VarS = b.s(g09Var, ndb.f, 2);
                pr4 pr4Var = l8b.a;
                j09 j09VarZ = ynb.Z(tm7.o(j09VarS, ((e8b) l46Var2.k(pr4Var)).m, a7c.b(2.0f)), 2.0f);
                String strQ = afc.q(R.string.text_reverse_tag, l46Var2);
                mue mueVar = pue.a;
                j09Var4 = j09Var5;
                nte.b(strQ, j09VarZ, ((e8b) l46Var2.k(pr4Var)).r, w6c.l(8), null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.h(l46Var2), l46Var, 24576, 0, 130024);
                l46Var2 = l46Var;
                o5c.f(l46Var2, b.p(g09Var, 2.0f));
                z = false;
                l46Var2.r(false);
            } else {
                j09Var4 = j09Var5;
                z = false;
                l46Var2.f0(-2115932797);
                l46Var2.r(false);
            }
            String strQ2 = afc.q(r8c.f(q7c.r(tarotCardChoice)), l46Var2);
            mue mueVar2 = pue.a;
            mue mueVarH = pue.h(l46Var2);
            pr4 pr4Var2 = l8b.a;
            if (k8b.e((e8b) l46Var2.k(pr4Var2))) {
                l46Var2.f0(-345345071);
                jB = ((e8b) l46Var2.k(pr4Var2)).t;
                l46Var2.r(z);
            } else {
                l46Var2.f0(-345343406);
                jB = y72.b(((e8b) l46Var2.k(pr4Var2)).q, 0.48f);
                l46Var2.r(z);
            }
            nte.b(strQ2, null, jB, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarH, l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var3 = j09Var4;
        } else {
            l46Var2.Z();
            j09Var3 = j09Var2;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(j09Var3, tarotCardChoice, i2, i3, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final void d(j09 j09Var, final j09 j09Var2, sdd sddVar, final ly lyVar, final CardBoxState cardBoxState, final boolean z, final boolean z2, final float f2, final x16 x16Var, l46 l46Var, final int i2) {
        boolean z3;
        sdd sddVar2;
        final j09 j09Var3;
        l46 l46Var2;
        Object obj;
        k31 k31Var;
        e89 e89Var;
        Boolean bool;
        int i3;
        float f3;
        boolean z4;
        boolean z5;
        j09 j09VarC;
        ?? r13;
        l46 l46Var3;
        boolean z6;
        Object obj2;
        l46 l46Var4 = l46Var;
        l46Var4.h0(-371916811);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= l46Var4.g(j09Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var4.d(80.0f) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var4.g(sddVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? l46Var4.g(lyVar) : l46Var4.i(lyVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i4 |= (262144 & i2) == 0 ? l46Var4.g(cardBoxState) : l46Var4.i(cardBoxState) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= l46Var4.h(z) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z3 = z2;
            i4 |= l46Var4.h(z3) ? 8388608 : 4194304;
        } else {
            z3 = z2;
        }
        if ((100663296 & i2) == 0) {
            i4 |= l46Var4.d(f2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= l46Var4.i(x16Var) ? 536870912 : 268435456;
        }
        if (l46Var4.W(i4 & 1, (306783379 & i4) != 306783378)) {
            Object objR = l46Var4.R();
            Object obj3 = sf2.a;
            if (objR == obj3) {
                obj = objR;
                Object n31Var = new n31();
                l46Var4.p0(n31Var);
                obj = n31Var;
            }
            obj = objR;
            k31 k31Var2 = (k31) obj;
            sw3 sw3Var = (sw3) l46Var4.k(zg2.h);
            Object objR2 = l46Var4.R();
            Object obj4 = objR2;
            if (objR2 == obj3) {
                Object objF = q1c.f(new e77(0L));
                l46Var4.p0(objF);
                obj4 = objF;
            }
            e89 e89Var2 = (e89) obj4;
            Boolean boolValueOf = Boolean.valueOf(z3);
            e77 e77Var = (e77) e89Var2.getValue();
            long j2 = e77Var.a;
            yi4 yi4Var = new yi4(f2);
            int i5 = i4;
            boolean zI = ((i4 & 7168) == 2048) | ((29360128 & i4) == 8388608) | l46Var4.i(k31Var2) | l46Var4.g(sw3Var) | ((i5 & 234881024) == 67108864);
            Object objR3 = l46Var4.R();
            if (zI || objR3 == obj3) {
                k31Var = k31Var2;
                e89Var = e89Var2;
                bool = boolValueOf;
                Object qv1Var = new qv1(z2, sddVar, k31Var, sw3Var, e89Var, f2, null);
                sddVar2 = sddVar;
                l46Var4.p0(qv1Var);
                objR3 = qv1Var;
            } else {
                bool = boolValueOf;
                k31Var = k31Var2;
                e89Var = e89Var2;
                sddVar2 = sddVar;
            }
            af1.q(bool, e77Var, yi4Var, (l26) objR3, l46Var4);
            g09 g09Var = g09.a;
            j09 j09VarP = ym8.p(g09Var, k31Var);
            Object objR4 = l46Var4.R();
            Object obj5 = objR4;
            if (objR4 == obj3) {
                Object pgVar = new pg(e89Var, 13);
                l46Var4.p0(pgVar);
                obj5 = pgVar;
            }
            j09 j09VarD = ym8.D(j09VarP, (a26) obj5);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var4, 0);
            int iHashCode = Long.hashCode(l46Var4.T);
            u8a u8aVarM = l46Var4.m();
            j09 j09VarJ = m93.J(l46Var4, j09VarD);
            lf2.q.getClass();
            l46Var4.j0();
            if (l46Var4.S) {
                l46Var4.l(LayoutNode.h1);
            } else {
                l46Var4.s0();
            }
            dec.l(hj6.z, l46Var4, c92VarA);
            dec.l(hj6.y, l46Var4, u8aVarM);
            dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
            dec.k(l46Var4);
            dec.l(hj6.x, l46Var4, j09VarJ);
            if (cardBoxState.getTarotCard() != null) {
                l46Var4.f0(972533122);
                l46Var4.f0(-107171152);
                j09 j09VarP2 = b.p(j09Var2, 80.0f);
                if (cardBoxState.getShouldShareAnimation()) {
                    l46Var4.f0(1202858232);
                    sddVar2.getClass();
                    rdd rddVarB = sdd.b("selected_card_key", l46Var4);
                    Object objR5 = l46Var4.R();
                    if (objR5 == obj3) {
                        z6 = false;
                        Object fv1Var = new fv1(false ? 1 : 0);
                        l46Var4.p0(fv1Var);
                        obj2 = fv1Var;
                    } else {
                        z6 = false;
                        obj2 = objR5;
                    }
                    j09VarP2 = j09VarP2.D(sdd.d(sddVar2, g09Var, rddVarB, lyVar, (p21) obj2));
                    l46Var4.r(z6);
                } else {
                    z6 = false;
                    l46Var4.f0(1202869245);
                    l46Var4.r(false);
                }
                l46Var4.r(z6);
                i3 = i5;
                f3 = 80.0f;
                boolean z7 = z6;
                o7c.d(db6.w(j09VarP2, 0.5f, ((e8b) l46Var4.k(l8b.a)).A, a7c.b(8.0f)), q7c.r(cardBoxState.getTarotCard()), null, false, an2.d, eze.a(l46Var4).a.f, null, false, l46Var4, 24576, 204);
                l46 l46Var5 = l46Var4;
                l46Var5.r(z7);
                r13 = z7;
                z5 = true;
                l46Var3 = l46Var5;
            } else {
                i3 = i5;
                f3 = 80.0f;
                l46Var4.f0(973354498);
                if (cardBoxState.getHighlights()) {
                    z4 = false;
                    z5 = true;
                    j09VarC = androidx.compose.foundation.b.c(j09Var2, false, null, null, x16Var, 15);
                } else {
                    z4 = false;
                    z5 = true;
                    j09VarC = j09Var2;
                }
                h(i3 & 896, l46Var4, j09VarC, cardBoxState.getHighlights());
                l46Var4.r(z4);
                l46Var3 = l46Var4;
                r13 = z4;
            }
            String boxName = cardBoxState.getBoxName();
            if (boxName == null) {
                l46Var3.f0(973610123);
                l46Var3.r(r13);
            } else {
                ib8.r(8.0f, 973610124, l46Var3, l46Var3, g09Var);
                b(b.p(g09Var, f3), boxName, z, null, null, l46Var3, (i3 >> 12) & 896, 24);
                l46Var3.r(r13);
            }
            if (cardBoxState.getTarotCard() == null || !z) {
                l46Var3.f0(974022083);
                l46Var3.r(r13);
            } else {
                ib8.r(2.0f, 973849103, l46Var3, l46Var3, g09Var);
                c(b.p(g09Var, f3), cardBoxState.getTarotCard(), l46Var3, r13, r13);
                l46Var3.r(r13);
            }
            l46Var3.r(z5);
            j09Var3 = g09Var;
            l46Var2 = l46Var3;
        } else {
            sddVar2 = sddVar;
            l46Var4.Z();
            j09Var3 = j09Var;
            l46Var2 = l46Var4;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final sdd sddVar3 = sddVar2;
            ojbVarV.d = new l26() { // from class: gv1
                @Override // defpackage.l26
                public final Object z(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    cgg.d(j09Var3, j09Var2, sddVar3, lyVar, cardBoxState, z, z2, f2, x16Var, (l46) obj6, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void e(final sdd sddVar, final j09 j09Var, final ly lyVar, final bx9 bx9Var, final List list, final List list2, int i2, final boolean z, final boolean z2, final l26 l26Var, final x16 x16Var, l46 l46Var, final int i3, final int i4) {
        int i5;
        int i6;
        final int i7;
        int size;
        int i8;
        final l26 l26Var2 = l26Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        sddVar.getClass();
        lyVar.getClass();
        list.getClass();
        list2.getClass();
        l26Var2.getClass();
        x16Var.getClass();
        l46Var.h0(-1370863799);
        if ((i3 & 6) == 0) {
            i5 = i3 | (l46Var.g(sddVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= (i3 & 512) == 0 ? l46Var.g(lyVar) : l46Var.i(lyVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i5 |= l46Var.g(bx9Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i5 |= (i3 & 32768) == 0 ? l46Var.g(list) : l46Var.i(list) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i5 |= (i3 & 262144) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= l46Var.h(z) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= l46Var.h(z2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= l46Var.i(l26Var2) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (l46Var.i(x16Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (l46Var.W(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            l46Var.b0();
            if ((i3 & 1) == 0 || l46Var.C()) {
                size = list2.size();
                i8 = i5 & (-3670017);
            } else {
                l46Var.Z();
                i8 = i5 & (-3670017);
                size = i2;
            }
            l46Var.s();
            boolean zE = ((i8 & 458752) == 131072 || ((i8 & 262144) != 0 && l46Var.g(list2))) | ((i8 & 57344) == 16384 || ((i8 & 32768) != 0 && l46Var.g(list))) | l46Var.e(size);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zE || objR == i8cVar) {
                objR = zrd.b(new lv1(list, size, list2));
                l46Var.p0(objR);
            }
            h0e h0eVar = (h0e) objR;
            float f2 = ((Configuration) l46Var.k(uq.a)).screenWidthDp;
            boolean zD = l46Var.d(f2);
            Object objR2 = l46Var.R();
            int i9 = size;
            if (zD || objR2 == i8cVar) {
                objR2 = Integer.valueOf(mh3.o((int) (((f2 - 24.0f) + 12.0f) / 92.0f), 1, 5));
                l46Var.p0(objR2);
            }
            int iIntValue = ((Number) objR2).intValue();
            boolean zG = l46Var.g((List) h0eVar.getValue()) | l46Var.e(iIntValue);
            Object objR3 = l46Var.R();
            if (zG || objR3 == i8cVar) {
                objR3 = zrd.b(new uj(iIntValue, h0eVar));
                l46Var.p0(objR3);
            }
            h0e h0eVar2 = (h0e) objR3;
            j09 j09VarY = ynb.Y(j09Var, bx9Var);
            c92 c92VarA = a92.a(new uc0(12.0f, false, new jv2(2, ndb.z)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, c92VarA);
            dec.l(he2Var3, l46Var, u8aVarM);
            ib8.s(iHashCode, l46Var, he2Var2, l46Var);
            dec.l(he2Var, l46Var, j09VarJ);
            l46Var.f0(1024560488);
            Iterator it = ((List) h0eVar2.getValue()).iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    t72.Z();
                    throw null;
                }
                List list3 = (List) next;
                g09 g09Var = g09.a;
                j09 j09VarC = b.c(g09Var, 1.0f);
                Iterator it2 = it;
                g09 g09Var2 = g09Var;
                char c2 = 0;
                t7c t7cVarA = s7c.a(new uc0(12.0f, true, new jv2(3, ndb.Z)), ndb.y, l46Var, 54);
                int i12 = iIntValue;
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, t7cVarA);
                dec.l(he2Var3, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var2, l46Var);
                Iterator itS = kv2.s(l46Var, j09VarJ2, he2Var, -734235489, list3);
                final int i13 = 0;
                while (itS.hasNext()) {
                    Object next2 = itS.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        t72.Z();
                        throw null;
                    }
                    CardBoxState cardBoxState = (CardBoxState) next2;
                    Iterator it3 = itS;
                    final int i15 = i12;
                    boolean zE2 = ((i8 & 1879048192) == 536870912) | l46Var.e(i10) | l46Var.e(i15) | l46Var.e(i13);
                    Object objR4 = l46Var.R();
                    if (zE2 || objR4 == i8cVar) {
                        objR4 = new a26() { // from class: mv1
                            @Override // defpackage.a26
                            public final Object d(Object obj) {
                                bv7 bv7Var = (bv7) obj;
                                bv7Var.getClass();
                                l26Var2.z(Integer.valueOf((i10 * i15) + i13), bv7Var);
                                return wef.a;
                            }
                        };
                        l46Var.p0(objR4);
                    }
                    g09 g09Var3 = g09Var2;
                    int i16 = i10;
                    d(null, nk8.w(g09Var3, (a26) objR4), sddVar, lyVar, cardBoxState, z, z2 && cardBoxState.getShouldShareAnimation(), bx9Var.d, x16Var, l46Var, ((i8 << 9) & 7168) | 384 | ((i8 << 6) & 57344) | (CardBoxState.$stable << 15) | ((i8 >> 3) & 3670016) | ((i6 << 27) & 1879048192));
                    l26Var2 = l26Var;
                    i12 = i15;
                    he2Var = he2Var;
                    i13 = i14;
                    he2Var2 = he2Var2;
                    itS = it3;
                    he2Var3 = he2Var3;
                    he2Var4 = he2Var4;
                    i9 = i9;
                    i10 = i16;
                    g09Var2 = g09Var3;
                    c2 = 0;
                }
                l46Var.r(false);
                l46Var.r(true);
                l26Var2 = l26Var;
                i10 = i11;
                it = it2;
                i9 = i9;
                iIntValue = i12;
            }
            l46Var.r(false);
            l46Var.r(true);
            i7 = i9;
        } else {
            l46Var.Z();
            i7 = i2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: nv1
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i3 | 1);
                    int iP2 = k99.P(i4);
                    cgg.e(sddVar, j09Var, lyVar, bx9Var, list, list2, i7, z, z2, l26Var, x16Var, (l46) obj, iP, iP2);
                    return wef.a;
                }
            };
        }
    }

    public static final long f(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void g(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, z51 z51Var, xw9 xw9Var, dd2 dd2Var, l46 l46Var, int i2) {
        boolean z2;
        x4d x4dVar2;
        z51 z51Var2;
        xw9 xw9Var2;
        int i3;
        xw9 xw9Var3;
        z51 z51Var3;
        boolean z3;
        l46Var.h0(-102343472);
        int i4 = i2 | (l46Var.i(x16Var) ? 4 : 2) | 1408 | (l46Var.g(u51Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | 114884608;
        if (l46Var.W(i4 & 1, (306783379 & i4) != 306783378)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                bx9 bx9Var = v51.a;
                x4dVar = u5d.b(k99.a, l46Var);
                z51 z51Var4 = new z51(0.0f, 0.0f, 0.0f, qn4.g);
                i3 = i4 & (-465921);
                xw9Var3 = v51.a;
                z51Var3 = z51Var4;
                z3 = true;
            } else {
                l46Var.Z();
                i3 = i4 & (-465921);
                z3 = z;
                z51Var3 = z51Var;
                xw9Var3 = xw9Var;
            }
            x4d x4dVar3 = x4dVar;
            l46Var.s();
            a(x16Var, j09Var, z3, x4dVar3, u51Var, z51Var3, null, xw9Var3, dd2Var, l46Var, i3 & 2147483646, 0);
            z2 = z3;
            xw9Var2 = xw9Var3;
            z51Var2 = z51Var3;
            x4dVar2 = x4dVar3;
        } else {
            l46Var.Z();
            z2 = z;
            x4dVar2 = x4dVar;
            z51Var2 = z51Var;
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p20(x16Var, j09Var, z2, x4dVar2, u51Var, z51Var2, xw9Var2, dd2Var, i2);
        }
    }

    public static final void h(int i2, l46 l46Var, j09 j09Var, final boolean z) {
        int i3;
        l46Var.h0(288863049);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.d(80.0f) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            final float f2 = eze.a(l46Var).a.f;
            xn8 xn8VarC = s21.c(ndb.b, false);
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
            s21.a(z7f.K(tm7.o(k8b.g(k8b.h(dj6.w(b.p(g09.a, 80.0f), snd.b(null, l46Var, 1)), new n26() { // from class: hv1
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    long j2;
                    long j3;
                    int i6 = i5;
                    float f3 = 0.6f;
                    float f4 = f2;
                    boolean z2 = z;
                    j09 j09Var2 = (j09) obj;
                    l46 l46Var2 = (l46) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            j09Var2.getClass();
                            l46Var2.f0(1138264238);
                            if (z2) {
                                l46Var2.f0(-1344725349);
                                j2 = ((e8b) l46Var2.k(l8b.a)).u;
                            } else {
                                l46Var2.f0(-1344724510);
                                j2 = ((e8b) l46Var2.k(l8b.a)).z;
                            }
                            l46Var2.r(false);
                            j09 j09VarW = db6.w(j09Var2, 0.6f, j2, a7c.b(f4));
                            l46Var2.r(false);
                            return j09VarW;
                        default:
                            j09Var2.getClass();
                            l46Var2.f0(1163901475);
                            if (z2) {
                                l46Var2.f0(1817823120);
                                j3 = ((e8b) l46Var2.k(l8b.a)).u;
                            } else {
                                l46Var2.f0(1817823959);
                                j3 = ((e8b) l46Var2.k(l8b.a)).z;
                            }
                            l46Var2.r(false);
                            j09 j09VarU = m93.u(j09Var2, new ev1(f3, f4, j3));
                            l46Var2.r(false);
                            return j09VarU;
                    }
                }
            }, l46Var, 0), new n26() { // from class: hv1
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    long j2;
                    long j3;
                    int i6 = i4;
                    float f3 = 0.6f;
                    float f4 = f2;
                    boolean z2 = z;
                    j09 j09Var2 = (j09) obj;
                    l46 l46Var2 = (l46) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            j09Var2.getClass();
                            l46Var2.f0(1138264238);
                            if (z2) {
                                l46Var2.f0(-1344725349);
                                j2 = ((e8b) l46Var2.k(l8b.a)).u;
                            } else {
                                l46Var2.f0(-1344724510);
                                j2 = ((e8b) l46Var2.k(l8b.a)).z;
                            }
                            l46Var2.r(false);
                            j09 j09VarW = db6.w(j09Var2, 0.6f, j2, a7c.b(f4));
                            l46Var2.r(false);
                            return j09VarW;
                        default:
                            j09Var2.getClass();
                            l46Var2.f0(1163901475);
                            if (z2) {
                                l46Var2.f0(1817823120);
                                j3 = ((e8b) l46Var2.k(l8b.a)).u;
                            } else {
                                l46Var2.f0(1817823959);
                                j3 = ((e8b) l46Var2.k(l8b.a)).z;
                            }
                            l46Var2.r(false);
                            j09 j09VarU = m93.u(j09Var2, new ev1(f3, f4, j3));
                            l46Var2.r(false);
                            return j09VarU;
                    }
                }
            }, l46Var, 0), ((e8b) l46Var.k(l8b.a)).m, a7c.b(f2)), null, 3), l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iv1(j09Var, z, i2);
        }
    }

    public static final void i(mfc mfcVar, List list, wp9 wp9Var, x16 x16Var, a26 a26Var, x16 x16Var2, boolean z, l46 l46Var, int i2) {
        l46Var.h0(1967745477);
        int i3 = 2;
        int i4 = i2 | (l46Var.e(mfcVar.ordinal()) ? 4 : 2) | (l46Var.g(list) ? 32 : 16) | (l46Var.g(wp9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536) | (l46Var.h(z) ? 1048576 : 524288);
        if (l46Var.W(i4 & 1, (599187 & i4) != 599186)) {
            xdc.a(b.c, af1.b0(1204077953, new xi6(x16Var, wp9Var, i3), l46Var), af1.b0(-980197984, new mb0(z, x16Var2, 5), l46Var), null, null, 0, y72.j, 0L, null, af1.b0(269509142, new j41(mfcVar, list, a26Var, 15), l46Var), l46Var, 806879670, 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dj3(mfcVar, list, wp9Var, x16Var, a26Var, x16Var2, z, i2);
        }
    }

    public static final void j(x16 x16Var, wp9 wp9Var, List list, x16 x16Var2, l46 l46Var, int i2) {
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1846263072);
        int i3 = i2 | (l46Var.i(x16Var) ? 4 : 2) | (l46Var.g(wp9Var) ? 32 : 16) | (l46Var.g(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var.b0();
            if ((i2 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            lve lveVar = (lve) z5c.G(job.a.b(lve.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarI = jzb.i(k8b.a, k8b.c(), l46Var, 0, 2);
            Context context = (Context) l46Var.k(uq.b);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            e89 e89VarI2 = q1c.i((mfc) e89VarI.getValue(), l46Var);
            e89 e89VarI3 = q1c.i(x16Var2, l46Var);
            boolean zG = l46Var.g(lveVar) | l46Var.g(context);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new bq9(new ek9(3, new x08(e89VarI2, 14), new wg(lveVar, context, e89Var, e89VarI3, 24)));
                l46Var.p0(objR2);
            }
            lmg.J(b.c, af1.b0(-1830561399, new bq1(list, wp9Var, x16Var, lveVar, context, (bq9) objR2, e89VarI, e89Var), l46Var), l46Var, 54);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(i2, 1, x16Var, wp9Var, list, x16Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:109:0x015e  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    public static final void k(final x16 x16Var, final j09 j09Var, boolean z, final x4d x4dVar, u51 u51Var, q11 q11Var, xw9 xw9Var, final dd2 dd2Var, l46 l46Var, final int i2, final int i3) {
        x16 x16Var2;
        int i4;
        j09 j09Var2;
        boolean z2;
        u51 u51VarD;
        int i5;
        q11 q11VarF;
        int i6;
        xw9 xw9Var2;
        int i7;
        int i8;
        boolean z3;
        final boolean z4;
        final u51 u51Var2;
        final q11 q11Var2;
        final xw9 xw9Var3;
        ojb ojbVarV;
        int i9;
        int i10;
        int i11;
        l46Var.h0(399974542);
        if ((i2 & 6) == 0) {
            x16Var2 = x16Var;
            i4 = (l46Var.i(x16Var2) ? 4 : 2) | i2;
        } else {
            x16Var2 = x16Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j09Var2 = j09Var;
            i4 |= l46Var.g(j09Var2) ? 32 : 16;
        } else {
            j09Var2 = j09Var;
        }
        int i12 = i3 & 4;
        if (i12 == 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) != 0) {
                if (l46Var.g(x4dVar)) {
                    i11 = 2048;
                } else {
                    i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i11;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    u51VarD = u51Var;
                    if (l46Var.g(u51VarD)) {
                        i10 = 16384;
                    }
                    i4 |= i10;
                } else {
                    u51VarD = u51Var;
                }
                i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i4 |= i10;
            } else {
                u51VarD = u51Var;
            }
            i5 = i4 | 196608;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    q11VarF = q11Var;
                    int i13 = l46Var.g(q11VarF) ? 1048576 : 524288;
                    i5 |= i13;
                } else {
                    q11VarF = q11Var;
                }
                i5 |= i13;
            } else {
                q11VarF = q11Var;
            }
            i6 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i6 != 0) {
                if ((12582912 & i2) == 0) {
                    xw9Var2 = xw9Var;
                    if (l46Var.g(xw9Var2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i5 |= i7;
                }
                i8 = i5 | 100663296;
                if ((805306368 & i2) != 0) {
                    if (l46Var.i(dd2Var)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i8 |= i9;
                }
                if ((306783379 & i8) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i8 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var = v51.a;
                            i8 &= -57345;
                            u51VarD = v51.d((m82) l46Var.k(o82.a));
                        }
                        if ((i3 & 64) != 0) {
                            bx9 bx9Var2 = v51.a;
                            i8 &= -3670017;
                            q11VarF = v51.f(z2, l46Var);
                        }
                        if (i6 != 0) {
                            xw9Var2 = v51.a;
                        }
                    } else {
                        l46Var.Z();
                        if ((i3 & 16) != 0) {
                            i8 &= -57345;
                        }
                        if ((i3 & 64) != 0) {
                            i8 &= -3670017;
                        }
                    }
                    l46Var.s();
                    int i14 = i8 & 2147483646;
                    j09 j09Var3 = j09Var2;
                    boolean z5 = z2;
                    u51 u51Var3 = u51VarD;
                    q11Var2 = q11VarF;
                    xw9Var3 = xw9Var2;
                    a(x16Var2, j09Var3, z5, x4dVar, u51Var3, null, q11Var2, xw9Var3, dd2Var, l46Var, i14, 0);
                    z4 = z5;
                    u51Var2 = u51Var3;
                } else {
                    l46Var.Z();
                    z4 = z2;
                    u51Var2 = u51VarD;
                    q11Var2 = q11VarF;
                    xw9Var3 = xw9Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: a61
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            cgg.k(x16Var, j09Var, z4, x4dVar, u51Var2, q11Var2, xw9Var3, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 12582912;
            xw9Var2 = xw9Var;
            i8 = i5 | 100663296;
            if ((805306368 & i2) != 0) {
                if (l46Var.i(dd2Var)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i8 |= i9;
            }
            if ((306783379 & i8) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i8 & 1, z3)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var3 = v51.a;
                        i8 &= -57345;
                        u51VarD = v51.d((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 64) != 0) {
                        bx9 bx9Var4 = v51.a;
                        i8 &= -3670017;
                        q11VarF = v51.f(z2, l46Var);
                    }
                    if (i6 != 0) {
                        xw9Var2 = v51.a;
                    }
                } else {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var5 = v51.a;
                        i8 &= -57345;
                        u51VarD = v51.d((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 64) != 0) {
                        bx9 bx9Var6 = v51.a;
                        i8 &= -3670017;
                        q11VarF = v51.f(z2, l46Var);
                    }
                    if (i6 != 0) {
                        xw9Var2 = v51.a;
                    }
                }
                l46Var.s();
                int i15 = i8 & 2147483646;
                j09 j09Var4 = j09Var2;
                boolean z6 = z2;
                u51 u51Var4 = u51VarD;
                q11Var2 = q11VarF;
                xw9Var3 = xw9Var2;
                a(x16Var2, j09Var4, z6, x4dVar, u51Var4, null, q11Var2, xw9Var3, dd2Var, l46Var, i15, 0);
                z4 = z6;
                u51Var2 = u51Var4;
            } else {
                l46Var.Z();
                z4 = z2;
                u51Var2 = u51VarD;
                q11Var2 = q11VarF;
                xw9Var3 = xw9Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: a61
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        cgg.k(x16Var, j09Var, z4, x4dVar, u51Var2, q11Var2, xw9Var3, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) != 0) {
            if (l46Var.g(x4dVar)) {
                i11 = 2048;
            } else {
                i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i4 |= i11;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                u51VarD = u51Var;
                if (l46Var.g(u51VarD)) {
                    i10 = 16384;
                }
                i4 |= i10;
            } else {
                u51VarD = u51Var;
            }
            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i4 |= i10;
        } else {
            u51VarD = u51Var;
        }
        i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                q11VarF = q11Var;
                if (l46Var.g(q11VarF)) {
                }
                i5 |= i13;
            } else {
                q11VarF = q11Var;
            }
            i5 |= i13;
        } else {
            q11VarF = q11Var;
        }
        i6 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i6 != 0) {
            if ((12582912 & i2) == 0) {
                xw9Var2 = xw9Var;
                if (l46Var.g(xw9Var2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i5 |= i7;
            }
            i8 = i5 | 100663296;
            if ((805306368 & i2) != 0) {
                if (l46Var.i(dd2Var)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i8 |= i9;
            }
            if ((306783379 & i8) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i8 & 1, z3)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var7 = v51.a;
                        i8 &= -57345;
                        u51VarD = v51.d((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 64) != 0) {
                        bx9 bx9Var8 = v51.a;
                        i8 &= -3670017;
                        q11VarF = v51.f(z2, l46Var);
                    }
                    if (i6 != 0) {
                        xw9Var2 = v51.a;
                    }
                } else {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var9 = v51.a;
                        i8 &= -57345;
                        u51VarD = v51.d((m82) l46Var.k(o82.a));
                    }
                    if ((i3 & 64) != 0) {
                        bx9 bx9Var10 = v51.a;
                        i8 &= -3670017;
                        q11VarF = v51.f(z2, l46Var);
                    }
                    if (i6 != 0) {
                        xw9Var2 = v51.a;
                    }
                }
                l46Var.s();
                int i16 = i8 & 2147483646;
                j09 j09Var5 = j09Var2;
                boolean z7 = z2;
                u51 u51Var5 = u51VarD;
                q11Var2 = q11VarF;
                xw9Var3 = xw9Var2;
                a(x16Var2, j09Var5, z7, x4dVar, u51Var5, null, q11Var2, xw9Var3, dd2Var, l46Var, i16, 0);
                z4 = z7;
                u51Var2 = u51Var5;
            } else {
                l46Var.Z();
                z4 = z2;
                u51Var2 = u51VarD;
                q11Var2 = q11VarF;
                xw9Var3 = xw9Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: a61
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        cgg.k(x16Var, j09Var, z4, x4dVar, u51Var2, q11Var2, xw9Var3, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 12582912;
        xw9Var2 = xw9Var;
        i8 = i5 | 100663296;
        if ((805306368 & i2) != 0) {
            if (l46Var.i(dd2Var)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i8 |= i9;
        }
        if ((306783379 & i8) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i8 & 1, z3)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    bx9 bx9Var11 = v51.a;
                    i8 &= -57345;
                    u51VarD = v51.d((m82) l46Var.k(o82.a));
                }
                if ((i3 & 64) != 0) {
                    bx9 bx9Var12 = v51.a;
                    i8 &= -3670017;
                    q11VarF = v51.f(z2, l46Var);
                }
                if (i6 != 0) {
                    xw9Var2 = v51.a;
                }
            } else {
                if (i12 != 0) {
                    z2 = true;
                }
                if ((i3 & 16) != 0) {
                    bx9 bx9Var13 = v51.a;
                    i8 &= -57345;
                    u51VarD = v51.d((m82) l46Var.k(o82.a));
                }
                if ((i3 & 64) != 0) {
                    bx9 bx9Var14 = v51.a;
                    i8 &= -3670017;
                    q11VarF = v51.f(z2, l46Var);
                }
                if (i6 != 0) {
                    xw9Var2 = v51.a;
                }
            }
            l46Var.s();
            int i17 = i8 & 2147483646;
            j09 j09Var6 = j09Var2;
            boolean z8 = z2;
            u51 u51Var6 = u51VarD;
            q11Var2 = q11VarF;
            xw9Var3 = xw9Var2;
            a(x16Var2, j09Var6, z8, x4dVar, u51Var6, null, q11Var2, xw9Var3, dd2Var, l46Var, i17, 0);
            z4 = z8;
            u51Var2 = u51Var6;
        } else {
            l46Var.Z();
            z4 = z2;
            u51Var2 = u51VarD;
            q11Var2 = q11VarF;
            xw9Var3 = xw9Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: a61
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cgg.k(x16Var, j09Var, z4, x4dVar, u51Var2, q11Var2, xw9Var3, dd2Var, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void l(long j2, mue mueVar, l26 l26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-684938728);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.f(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(mueVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            pr4 pr4Var = nte.a;
            mh3.b(new e1b[]{ib8.f(j2, em2.a), pr4Var.a(((mue) l46Var.k(pr4Var)).e(mueVar))}, l26Var, l46Var, ((i3 >> 3) & 112) | 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new d1b(j2, mueVar, l26Var, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:111:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0130  */
    /* JADX WARN: Code duplicated, block: B:113:0x0133  */
    /* JADX WARN: Code duplicated, block: B:116:0x0137  */
    /* JADX WARN: Code duplicated, block: B:119:0x013d  */
    /* JADX WARN: Code duplicated, block: B:122:0x014c  */
    /* JADX WARN: Code duplicated, block: B:124:0x015e  */
    /* JADX WARN: Code duplicated, block: B:127:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0108  */
    public static final void m(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, xw9 xw9Var, n26 n26Var, l46 l46Var, int i2, int i3) {
        x16 x16Var2;
        int i4;
        j09 j09Var2;
        int i5;
        boolean z2;
        int i6;
        x4d x4dVarB;
        u51 u51VarE;
        int i7;
        int i8;
        int i9;
        xw9 xw9Var2;
        int i10;
        int i11;
        boolean z3;
        j09 j09Var3;
        boolean z4;
        x4d x4dVar2;
        u51 u51Var2;
        xw9 xw9Var3;
        ojb ojbVarV;
        j09 j09Var4;
        int i12;
        j09 j09Var5;
        x4d x4dVar3;
        u51 u51Var3;
        xw9 xw9Var4;
        boolean z5;
        int i13;
        int i14;
        int i15;
        l46Var.h0(-1061374109);
        if ((i2 & 6) == 0) {
            x16Var2 = x16Var;
            i4 = (l46Var.i(x16Var2) ? 4 : 2) | i2;
        } else {
            x16Var2 = x16Var;
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i6 = 256;
                    } else {
                        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        x4dVarB = x4dVar;
                        if (l46Var.g(x4dVarB)) {
                            i15 = 2048;
                        }
                        i4 |= i15;
                    } else {
                        x4dVarB = x4dVar;
                    }
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i4 |= i15;
                } else {
                    x4dVarB = x4dVar;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        u51VarE = u51Var;
                        if (l46Var.g(u51VarE)) {
                            i14 = 16384;
                        }
                        i4 |= i14;
                    } else {
                        u51VarE = u51Var;
                    }
                    i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    i4 |= i14;
                } else {
                    u51VarE = u51Var;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    if (l46Var.g(null)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i4 |= i7;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (l46Var.g(null)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 != 0) {
                    if ((12582912 & i2) == 0) {
                        xw9Var2 = xw9Var;
                        if (l46Var.g(xw9Var2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i4 |= i10;
                    }
                    i11 = i4 | 100663296;
                    if ((805306368 & i2) != 0) {
                        if (l46Var.i(n26Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i11 |= i13;
                    }
                    if ((306783379 & i11) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i11 & 1, z3)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0 || l46Var.C()) {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            boolean z6 = i5 == 0 ? z2 : true;
                            if ((i3 & 8) != 0) {
                                bx9 bx9Var = v51.a;
                                i11 &= -7169;
                                x4dVarB = u5d.b(k99.a, l46Var);
                            }
                            if ((i3 & 16) != 0) {
                                bx9 bx9Var2 = v51.a;
                                i11 &= -57345;
                                u51VarE = v51.e((m82) l46Var.k(o82.a));
                            }
                            if (i9 != 0) {
                                xw9Var2 = v51.b;
                            }
                            i12 = i11;
                            j09Var5 = j09Var4;
                            x4dVar3 = x4dVarB;
                            u51Var3 = u51VarE;
                            xw9Var4 = xw9Var2;
                            z5 = z6;
                        } else {
                            l46Var.Z();
                            if ((i3 & 8) != 0) {
                                i11 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i11 &= -57345;
                            }
                            z5 = z2;
                            u51Var3 = u51VarE;
                            xw9Var4 = xw9Var2;
                            i12 = i11;
                            j09Var5 = j09Var2;
                            x4dVar3 = x4dVarB;
                        }
                        l46Var.s();
                        a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
                        u51Var2 = u51Var3;
                        xw9Var3 = xw9Var4;
                        x4dVar2 = x4dVar3;
                        z4 = z5;
                        j09Var3 = j09Var5;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        z4 = z2;
                        x4dVar2 = x4dVarB;
                        u51Var2 = u51VarE;
                        xw9Var3 = xw9Var2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
                    }
                }
                i4 |= 12582912;
                xw9Var2 = xw9Var;
                i11 = i4 | 100663296;
                if ((805306368 & i2) != 0) {
                    if (l46Var.i(n26Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 |= i13;
                }
                if ((306783379 & i11) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i11 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var3 = v51.a;
                            i11 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var4 = v51.a;
                            i11 &= -57345;
                            u51VarE = v51.e((m82) l46Var.k(o82.a));
                        }
                        if (i9 != 0) {
                            xw9Var2 = v51.b;
                        }
                        i12 = i11;
                        j09Var5 = j09Var4;
                        x4dVar3 = x4dVarB;
                        u51Var3 = u51VarE;
                        xw9Var4 = xw9Var2;
                        z5 = z6;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var5 = v51.a;
                            i11 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var6 = v51.a;
                            i11 &= -57345;
                            u51VarE = v51.e((m82) l46Var.k(o82.a));
                        }
                        if (i9 != 0) {
                            xw9Var2 = v51.b;
                        }
                        i12 = i11;
                        j09Var5 = j09Var4;
                        x4dVar3 = x4dVarB;
                        u51Var3 = u51VarE;
                        xw9Var4 = xw9Var2;
                        z5 = z6;
                    }
                    l46Var.s();
                    a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
                    u51Var2 = u51Var3;
                    xw9Var3 = xw9Var4;
                    x4dVar2 = x4dVar3;
                    z4 = z5;
                    j09Var3 = j09Var5;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    z4 = z2;
                    x4dVar2 = x4dVarB;
                    u51Var2 = u51VarE;
                    xw9Var3 = xw9Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
                }
            }
            i4 |= 384;
            z2 = z;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    x4dVarB = x4dVar;
                    if (l46Var.g(x4dVarB)) {
                        i15 = 2048;
                    }
                    i4 |= i15;
                } else {
                    x4dVarB = x4dVar;
                }
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i4 |= i15;
            } else {
                x4dVarB = x4dVar;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    u51VarE = u51Var;
                    if (l46Var.g(u51VarE)) {
                        i14 = 16384;
                    }
                    i4 |= i14;
                } else {
                    u51VarE = u51Var;
                }
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i4 |= i14;
            } else {
                u51VarE = u51Var;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (l46Var.g(null)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (l46Var.g(null)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                if ((12582912 & i2) == 0) {
                    xw9Var2 = xw9Var;
                    if (l46Var.g(xw9Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 100663296;
                if ((805306368 & i2) != 0) {
                    if (l46Var.i(n26Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 |= i13;
                }
                if ((306783379 & i11) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i11 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var7 = v51.a;
                            i11 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var8 = v51.a;
                            i11 &= -57345;
                            u51VarE = v51.e((m82) l46Var.k(o82.a));
                        }
                        if (i9 != 0) {
                            xw9Var2 = v51.b;
                        }
                        i12 = i11;
                        j09Var5 = j09Var4;
                        x4dVar3 = x4dVarB;
                        u51Var3 = u51VarE;
                        xw9Var4 = xw9Var2;
                        z5 = z6;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var9 = v51.a;
                            i11 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var10 = v51.a;
                            i11 &= -57345;
                            u51VarE = v51.e((m82) l46Var.k(o82.a));
                        }
                        if (i9 != 0) {
                            xw9Var2 = v51.b;
                        }
                        i12 = i11;
                        j09Var5 = j09Var4;
                        x4dVar3 = x4dVarB;
                        u51Var3 = u51VarE;
                        xw9Var4 = xw9Var2;
                        z5 = z6;
                    }
                    l46Var.s();
                    a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
                    u51Var2 = u51Var3;
                    xw9Var3 = xw9Var4;
                    x4dVar2 = x4dVar3;
                    z4 = z5;
                    j09Var3 = j09Var5;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    z4 = z2;
                    x4dVar2 = x4dVarB;
                    u51Var2 = u51VarE;
                    xw9Var3 = xw9Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
                }
            }
            i4 |= 12582912;
            xw9Var2 = xw9Var;
            i11 = i4 | 100663296;
            if ((805306368 & i2) != 0) {
                if (l46Var.i(n26Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            if ((306783379 & i11) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i11 & 1, z3)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var11 = v51.a;
                        i11 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var12 = v51.a;
                        i11 &= -57345;
                        u51VarE = v51.e((m82) l46Var.k(o82.a));
                    }
                    if (i9 != 0) {
                        xw9Var2 = v51.b;
                    }
                    i12 = i11;
                    j09Var5 = j09Var4;
                    x4dVar3 = x4dVarB;
                    u51Var3 = u51VarE;
                    xw9Var4 = xw9Var2;
                    z5 = z6;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var13 = v51.a;
                        i11 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var14 = v51.a;
                        i11 &= -57345;
                        u51VarE = v51.e((m82) l46Var.k(o82.a));
                    }
                    if (i9 != 0) {
                        xw9Var2 = v51.b;
                    }
                    i12 = i11;
                    j09Var5 = j09Var4;
                    x4dVar3 = x4dVarB;
                    u51Var3 = u51VarE;
                    xw9Var4 = xw9Var2;
                    z5 = z6;
                }
                l46Var.s();
                a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
                u51Var2 = u51Var3;
                xw9Var3 = xw9Var4;
                x4dVar2 = x4dVar3;
                z4 = z5;
                j09Var3 = j09Var5;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                z4 = z2;
                x4dVar2 = x4dVarB;
                u51Var2 = u51VarE;
                xw9Var3 = xw9Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
            }
        }
        i4 |= 48;
        j09Var2 = j09Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                if (l46Var.h(z2)) {
                    i6 = 256;
                } else {
                    i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    x4dVarB = x4dVar;
                    if (l46Var.g(x4dVarB)) {
                        i15 = 2048;
                    }
                    i4 |= i15;
                } else {
                    x4dVarB = x4dVar;
                }
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i4 |= i15;
            } else {
                x4dVarB = x4dVar;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    u51VarE = u51Var;
                    if (l46Var.g(u51VarE)) {
                        i14 = 16384;
                    }
                    i4 |= i14;
                } else {
                    u51VarE = u51Var;
                }
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i4 |= i14;
            } else {
                u51VarE = u51Var;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (l46Var.g(null)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (l46Var.g(null)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 != 0) {
                if ((12582912 & i2) == 0) {
                    xw9Var2 = xw9Var;
                    if (l46Var.g(xw9Var2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i4 |= i10;
                }
                i11 = i4 | 100663296;
                if ((805306368 & i2) != 0) {
                    if (l46Var.i(n26Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 |= i13;
                }
                if ((306783379 & i11) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i11 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var15 = v51.a;
                            i11 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var16 = v51.a;
                            i11 &= -57345;
                            u51VarE = v51.e((m82) l46Var.k(o82.a));
                        }
                        if (i9 != 0) {
                            xw9Var2 = v51.b;
                        }
                        i12 = i11;
                        j09Var5 = j09Var4;
                        x4dVar3 = x4dVarB;
                        u51Var3 = u51VarE;
                        xw9Var4 = xw9Var2;
                        z5 = z6;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) != 0) {
                            bx9 bx9Var17 = v51.a;
                            i11 &= -7169;
                            x4dVarB = u5d.b(k99.a, l46Var);
                        }
                        if ((i3 & 16) != 0) {
                            bx9 bx9Var18 = v51.a;
                            i11 &= -57345;
                            u51VarE = v51.e((m82) l46Var.k(o82.a));
                        }
                        if (i9 != 0) {
                            xw9Var2 = v51.b;
                        }
                        i12 = i11;
                        j09Var5 = j09Var4;
                        x4dVar3 = x4dVarB;
                        u51Var3 = u51VarE;
                        xw9Var4 = xw9Var2;
                        z5 = z6;
                    }
                    l46Var.s();
                    a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
                    u51Var2 = u51Var3;
                    xw9Var3 = xw9Var4;
                    x4dVar2 = x4dVar3;
                    z4 = z5;
                    j09Var3 = j09Var5;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    z4 = z2;
                    x4dVar2 = x4dVarB;
                    u51Var2 = u51VarE;
                    xw9Var3 = xw9Var2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
                }
            }
            i4 |= 12582912;
            xw9Var2 = xw9Var;
            i11 = i4 | 100663296;
            if ((805306368 & i2) != 0) {
                if (l46Var.i(n26Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            if ((306783379 & i11) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i11 & 1, z3)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var19 = v51.a;
                        i11 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var110 = v51.a;
                        i11 &= -57345;
                        u51VarE = v51.e((m82) l46Var.k(o82.a));
                    }
                    if (i9 != 0) {
                        xw9Var2 = v51.b;
                    }
                    i12 = i11;
                    j09Var5 = j09Var4;
                    x4dVar3 = x4dVarB;
                    u51Var3 = u51VarE;
                    xw9Var4 = xw9Var2;
                    z5 = z6;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var111 = v51.a;
                        i11 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var112 = v51.a;
                        i11 &= -57345;
                        u51VarE = v51.e((m82) l46Var.k(o82.a));
                    }
                    if (i9 != 0) {
                        xw9Var2 = v51.b;
                    }
                    i12 = i11;
                    j09Var5 = j09Var4;
                    x4dVar3 = x4dVarB;
                    u51Var3 = u51VarE;
                    xw9Var4 = xw9Var2;
                    z5 = z6;
                }
                l46Var.s();
                a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
                u51Var2 = u51Var3;
                xw9Var3 = xw9Var4;
                x4dVar2 = x4dVar3;
                z4 = z5;
                j09Var3 = j09Var5;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                z4 = z2;
                x4dVar2 = x4dVarB;
                u51Var2 = u51VarE;
                xw9Var3 = xw9Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                x4dVarB = x4dVar;
                if (l46Var.g(x4dVarB)) {
                    i15 = 2048;
                }
                i4 |= i15;
            } else {
                x4dVarB = x4dVar;
            }
            i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i4 |= i15;
        } else {
            x4dVarB = x4dVar;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                u51VarE = u51Var;
                if (l46Var.g(u51VarE)) {
                    i14 = 16384;
                }
                i4 |= i14;
            } else {
                u51VarE = u51Var;
            }
            i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i4 |= i14;
        } else {
            u51VarE = u51Var;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (l46Var.g(null)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i4 |= i7;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (l46Var.g(null)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
        }
        i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i9 != 0) {
            if ((12582912 & i2) == 0) {
                xw9Var2 = xw9Var;
                if (l46Var.g(xw9Var2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i4 | 100663296;
            if ((805306368 & i2) != 0) {
                if (l46Var.i(n26Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            if ((306783379 & i11) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i11 & 1, z3)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var113 = v51.a;
                        i11 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var114 = v51.a;
                        i11 &= -57345;
                        u51VarE = v51.e((m82) l46Var.k(o82.a));
                    }
                    if (i9 != 0) {
                        xw9Var2 = v51.b;
                    }
                    i12 = i11;
                    j09Var5 = j09Var4;
                    x4dVar3 = x4dVarB;
                    u51Var3 = u51VarE;
                    xw9Var4 = xw9Var2;
                    z5 = z6;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 8) != 0) {
                        bx9 bx9Var115 = v51.a;
                        i11 &= -7169;
                        x4dVarB = u5d.b(k99.a, l46Var);
                    }
                    if ((i3 & 16) != 0) {
                        bx9 bx9Var116 = v51.a;
                        i11 &= -57345;
                        u51VarE = v51.e((m82) l46Var.k(o82.a));
                    }
                    if (i9 != 0) {
                        xw9Var2 = v51.b;
                    }
                    i12 = i11;
                    j09Var5 = j09Var4;
                    x4dVar3 = x4dVarB;
                    u51Var3 = u51VarE;
                    xw9Var4 = xw9Var2;
                    z5 = z6;
                }
                l46Var.s();
                a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
                u51Var2 = u51Var3;
                xw9Var3 = xw9Var4;
                x4dVar2 = x4dVar3;
                z4 = z5;
                j09Var3 = j09Var5;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                z4 = z2;
                x4dVar2 = x4dVarB;
                u51Var2 = u51VarE;
                xw9Var3 = xw9Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
            }
        }
        i4 |= 12582912;
        xw9Var2 = xw9Var;
        i11 = i4 | 100663296;
        if ((805306368 & i2) != 0) {
            if (l46Var.i(n26Var)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i11 |= i13;
        }
        if ((306783379 & i11) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i11 & 1, z3)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) != 0) {
                    bx9 bx9Var117 = v51.a;
                    i11 &= -7169;
                    x4dVarB = u5d.b(k99.a, l46Var);
                }
                if ((i3 & 16) != 0) {
                    bx9 bx9Var118 = v51.a;
                    i11 &= -57345;
                    u51VarE = v51.e((m82) l46Var.k(o82.a));
                }
                if (i9 != 0) {
                    xw9Var2 = v51.b;
                }
                i12 = i11;
                j09Var5 = j09Var4;
                x4dVar3 = x4dVarB;
                u51Var3 = u51VarE;
                xw9Var4 = xw9Var2;
                z5 = z6;
            } else {
                if (i16 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) != 0) {
                    bx9 bx9Var119 = v51.a;
                    i11 &= -7169;
                    x4dVarB = u5d.b(k99.a, l46Var);
                }
                if ((i3 & 16) != 0) {
                    bx9 bx9Var1110 = v51.a;
                    i11 &= -57345;
                    u51VarE = v51.e((m82) l46Var.k(o82.a));
                }
                if (i9 != 0) {
                    xw9Var2 = v51.b;
                }
                i12 = i11;
                j09Var5 = j09Var4;
                x4dVar3 = x4dVarB;
                u51Var3 = u51VarE;
                xw9Var4 = xw9Var2;
                z5 = z6;
            }
            l46Var.s();
            a(x16Var2, j09Var5, z5, x4dVar3, u51Var3, null, null, xw9Var4, n26Var, l46Var, i12 & 2147483646, 0);
            u51Var2 = u51Var3;
            xw9Var3 = xw9Var4;
            x4dVar2 = x4dVar3;
            z4 = z5;
            j09Var3 = j09Var5;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            z4 = z2;
            x4dVar2 = x4dVarB;
            u51Var2 = u51VarE;
            xw9Var3 = xw9Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new c61(x16Var, j09Var3, z4, x4dVar2, u51Var2, xw9Var3, n26Var, i2, i3);
        }
    }

    public static synchronized ufg n(Context context) {
        ufg ufgVar;
        ufgVar = a;
        if (ufgVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ufg ufgVar2 = new ufg(new ysd(5, context));
            a = ufgVar2;
            ufgVar = ufgVar2;
        }
        return ufgVar;
    }

    public static void o(StringBuilder sb, String str, Map map) {
        String strValueOf;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                strValueOf = ((CameraCharacteristics.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                strValueOf = ((CaptureRequest.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                strValueOf = ((CaptureResult.Key) key).getName();
                strValueOf.getClass();
            } else {
                strValueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            arrayList.add(new iy9(strValueOf, value instanceof Object[] ? qd0.t0((Object[]) value, null, "[", "]", new i73(16), 25) : String.valueOf(value)));
        }
        for (iy9 iy9Var : s72.b1(arrayList, new ww2(18))) {
            sb.append("  " + v4e.V(50, (String) iy9Var.d()) + ' ' + ((String) iy9Var.e()) + '\n');
        }
    }

    public static final fy9 p(bv6 bv6Var, Context context, int i2) {
        if (bv6Var instanceof gz0) {
            return an1.b(new ks(((gz0) bv6Var).a), i2);
        }
        return bv6Var instanceof ao4 ? new DrawablePainter(y7h.j(bv6Var, context.getResources()).mutate()) : new ImagePainter(bv6Var);
    }

    public static final int q(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int r(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final LinkedHashMap s(List list) {
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ot8 ot8Var = (ot8) it.next();
            if (ot8Var instanceof ht8) {
                ht8 ht8Var = (ht8) ot8Var;
                linkedHashMap.put(ht8Var.a, new x12(ht8Var.b, i2, null, null));
            } else if (ot8Var instanceof ft8) {
                ft8 ft8Var = (ft8) ot8Var;
                String str = ft8Var.c;
                x12 x12Var = (x12) linkedHashMap.get(str);
                if (x12Var != null) {
                    i2++;
                    Integer numValueOf = Integer.valueOf(i2);
                    TarotCardChoice tarotCardChoice = (TarotCardChoice) s72.x0(ft8Var.b);
                    String str2 = x12Var.a;
                    int i3 = x12Var.b;
                    str2.getClass();
                    linkedHashMap.put(str, new x12(str2, i3, numValueOf, tarotCardChoice));
                }
            }
        }
        return linkedHashMap;
    }

    public static final void t(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    tec.y(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    bzd.m(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    cva.s();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static int u(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final float v(long j2, hkb hkbVar) {
        float f2 = hkbVar.d;
        float f3 = hkbVar.c;
        if (dj6.D(j2, hkbVar)) {
            return 0.0f;
        }
        float fE = hl9.e(hl9.f(hkbVar.f(), j2));
        if (fE >= Float.MAX_VALUE) {
            fE = Float.MAX_VALUE;
        }
        float fE2 = hl9.e(hl9.f((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(hkbVar.b)) & 4294967295L), j2));
        if (fE2 < fE) {
            fE = fE2;
        }
        float fE3 = hl9.e(hl9.f((((long) Float.floatToRawIntBits(hkbVar.a)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), j2));
        if (fE3 < fE) {
            fE = fE3;
        }
        float fE4 = hl9.e(hl9.f((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), j2));
        return fE4 < fE ? fE4 : fE;
    }

    public static boolean w(String str, String str2) {
        return pa7.t(str, str2) || (c5e.u(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !geg.a.g(str));
    }

    public static final void x(rp5 rp5Var) {
        x1f x1fVar = x1f.a;
        x1f.i(2, new ot1(26, rp5Var), rp5Var.a);
    }

    public static final boolean y(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z(bob bobVar, Member member) throws yu6 {
        try {
            uy3.Y.getClass();
            Object obj = uy3.E0;
            if (obj == null || obj == null) {
                List parameters = bobVar.getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((aob) it.next()).t() != on7.c);
                }
                throw new RuntimeException('\'' + bobVar + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objJ = ynb.Q(bobVar) ? ynb.J(bobVar) : null;
            uy3.Y.getClass();
            if (objJ == uy3.E0) {
                objJ = null;
            }
            ynb.Q(bobVar);
            AccessibleObject accessibleObject = member != 0 ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(od4.x(bobVar));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objJ);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objJ == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    objJ = sqf.f(cls);
                }
                return method.invoke(null, objJ);
            }
            if (length == 2) {
                Method method2 = (Method) member;
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                return method2.invoke(null, objJ, sqf.f(cls2));
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e2) {
            throw new yu6("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e2);
        }
    }
}
