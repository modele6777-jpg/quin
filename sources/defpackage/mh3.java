package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import android.content.Context;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mh3 {
    public static final pv8 A;
    public static final pv8 B;
    public static final pv8 C;
    public static final pv8 D;
    public static final pv8 E;
    public static final pv8 F;
    public static final pv8 G;
    public static final ksf H;
    public static final ksf I;
    public static final n8g J;
    public static final n8g K;
    public static gx6 L = null;
    public static final float M = 32.0f;
    public static gx6 N;
    public static final q9f a = q9f.g;
    public static final dd2 b;
    public static final dd2 c;
    public static final dd2 d;
    public static final dd2 e;
    public static final dd2 f;
    public static final dd2 g;
    public static final n82 h;
    public static final g5d i;
    public static final n82 j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final pv8 n;
    public static final pv8 o;
    public static final pv8 p;
    public static final pv8 q;
    public static final pv8 r;
    public static final pv8 s;
    public static final pv8 t;
    public static final pv8 u;
    public static final pv8 v;
    public static final pv8 w;
    public static final pv8 x;
    public static final pv8 y;
    public static final pv8 z;

    static {
        int i2 = 16;
        b = new dd2(new gd2(i2), false, -1735919593);
        int i3 = 5;
        c = new dd2(new kd2(i3), false, -2134791811);
        int i4 = 6;
        d = new dd2(new kd2(i4), false, 95254181);
        int i5 = 17;
        e = new dd2(new gd2(i5), false, -2109981379);
        int i6 = 18;
        new dd2(new gd2(i6), false, -1710314215);
        int i7 = 26;
        f = new dd2(new xd2(i7), false, 805707222);
        int i8 = 28;
        g = new dd2(new ce2(i8), false, 328710496);
        h = n82.G0;
        i = g5d.e;
        j = n82.I0;
        k = 0.38f;
        l = 6.0f;
        m = 1.0f;
        int i9 = 1;
        int i10 = 2;
        int i11 = 20;
        n = new pv8(i9, i10, i11);
        int i12 = 3;
        o = new pv8(i10, i12, 22);
        int i13 = 4;
        p = new pv8(i12, i13, 23);
        q = new pv8(i13, i3, 24);
        r = new pv8(i3, i4, 25);
        int i14 = 7;
        s = new pv8(i4, i14, i7);
        int i15 = 8;
        t = new pv8(i14, i15, 27);
        int i16 = 9;
        u = new pv8(i15, i16, i8);
        int i17 = 10;
        int i18 = 29;
        v = new pv8(i16, i17, i18);
        int i19 = 11;
        w = new pv8(i17, i19, i17);
        int i20 = 12;
        x = new pv8(i19, i20, i19);
        int i21 = 13;
        y = new pv8(i20, i21, i20);
        int i22 = 14;
        z = new pv8(i21, i22, i21);
        int i23 = 15;
        A = new pv8(i22, i23, i22);
        B = new pv8(i23, i2, i23);
        C = new pv8(i2, i5, i2);
        D = new pv8(i5, i6, i5);
        int i24 = 19;
        E = new pv8(i6, i24, i6);
        F = new pv8(i24, i11, i24);
        int i25 = 21;
        G = new pv8(i11, i25, i25);
        H = new ksf(i8);
        I = new ksf(i18);
        J = new n8g(0);
        K = new n8g(i9);
    }

    public static final rd0 A(yg1 yg1Var) {
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        Object objC = ((nc1) yg1Var).c(key);
        Object obj = {0};
        if (objC != null) {
            obj = objC;
        }
        return new rd0((int[]) obj);
    }

    public static final rd0 B(yg1 yg1Var) {
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key.getClass();
        Object objC = ((nc1) yg1Var).c(key);
        Object obj = {0};
        if (objC != null) {
            obj = objC;
        }
        return new rd0((int[]) obj);
    }

    public static final rd0 C(yg1 yg1Var) {
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
        key.getClass();
        Object objC = ((nc1) yg1Var).c(key);
        Object obj = {0};
        if (objC != null) {
            obj = objC;
        }
        return new rd0((int[]) obj);
    }

    public static final Rect D(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        bp.x(textPaint2, charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            bp.x(textPaint, charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static auc E(m82 m82Var) {
        auc aucVar = m82Var.b0;
        if (aucVar != null) {
            return aucVar;
        }
        long j2 = y72.j;
        auc aucVar2 = new auc(j2, o82.c(m82Var, n16.u), o82.c(m82Var, n16.y), o82.c(m82Var, n16.C), j2, y72.b(o82.c(m82Var, n16.h), n16.i), y72.b(o82.c(m82Var, n16.v), n16.w), y72.b(o82.c(m82Var, n16.z), n16.A), o82.c(m82Var, n16.o), y72.b(o82.c(m82Var, n16.k), n16.l), o82.c(m82Var, n16.t), o82.c(m82Var, n16.x), o82.c(m82Var, n16.B));
        m82Var.b0 = aucVar2;
        return aucVar2;
    }

    public static final String F(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final gx6 G() {
        gx6 gx6Var = N;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("NavigationUp", 28.0f, 28.0f, 28.0f, 28.0f, 0L, 0, false, 224);
        dtd dtdVar = new dtd(abg.d(4279440148L));
        s71 s71Var = new s71(1);
        s71Var.p(7.5644f, 13.9492f);
        s71Var.i(7.571f, 13.7474f, 7.61f, 13.5618f, 7.6816f, 13.3926f);
        s71Var.i(7.7598f, 13.2233f, 7.8769f, 13.0605f, 8.0332f, 12.9043f);
        s71Var.n(15.5527f, 5.5508f);
        s71Var.i(15.8001f, 5.3034f, 16.1029f, 5.1797f, 16.4609f, 5.1797f);
        s71Var.i(16.7083f, 5.1797f, 16.9297f, 5.2383f, 17.125f, 5.3555f);
        s71Var.i(17.3268f, 5.4727f, 17.4863f, 5.6322f, 17.6035f, 5.834f);
        s71Var.i(17.7272f, 6.0293f, 17.7891f, 6.2474f, 17.7891f, 6.4883f);
        s71Var.i(17.7891f, 6.8529f, 17.6523f, 7.1719f, 17.3789f, 7.4453f);
        s71Var.n(10.6895f, 13.9492f);
        s71Var.n(17.3789f, 20.4531f);
        s71Var.i(17.6523f, 20.7331f, 17.7891f, 21.0521f, 17.7891f, 21.4102f);
        s71Var.i(17.7891f, 21.6576f, 17.7272f, 21.8789f, 17.6035f, 22.0742f);
        s71Var.i(17.4863f, 22.2695f, 17.3268f, 22.4258f, 17.125f, 22.543f);
        s71Var.i(16.9297f, 22.6602f, 16.7083f, 22.7188f, 16.4609f, 22.7188f);
        s71Var.i(16.1029f, 22.7188f, 15.8001f, 22.5951f, 15.5527f, 22.3477f);
        s71Var.n(8.0332f, 14.9941f);
        s71Var.i(7.8704f, 14.8379f, 7.75f, 14.6751f, 7.6719f, 14.5059f);
        s71Var.i(7.6003f, 14.3301f, 7.5644f, 14.1445f, 7.5644f, 13.9492f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 0.88f, 0.0f, 0, 4.0f);
        gx6 gx6VarB = fx6Var.b();
        N = gx6VarB;
        return gx6VarB;
    }

    public static final int H(yg1 yg1Var, int i2) {
        yg1Var.getClass();
        if (A(yg1Var).contains(Integer.valueOf(i2))) {
            return i2;
        }
        return A(yg1Var).contains(1) ? 1 : 0;
    }

    public static final ArrayList J(cm7 cm7Var) {
        cm7Var.getClass();
        List parameters = cm7Var.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((aob) obj).t() == on7.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static j09 K(j09 j09Var, ghc ghcVar) {
        return V(j09Var, ghcVar, true, false, true, null);
    }

    public static final j09 L(j09 j09Var) {
        return j09Var.D(new nce(J));
    }

    public static final boolean M(yg1 yg1Var) {
        yg1Var.getClass();
        return Build.VERSION.SDK_INT >= 28 && H(yg1Var, 5) == 5;
    }

    public static final j09 N(j09 j09Var) {
        return j09Var.D(new nce(K));
    }

    /* JADX WARN: Code duplicated, block: B:196:0x046c A[EDGE_INSN: B:196:0x046c->B:198:0x0494 BREAK  A[LOOP:1: B:54:0x0129->B:59:0x0141]] */
    /* JADX WARN: Code duplicated, block: B:197:0x0482 A[EDGE_INSN: B:197:0x0482->B:198:0x0494 BREAK  A[LOOP:1: B:54:0x0129->B:59:0x0141]] */
    /* JADX WARN: Instruction removed from duplicated block: B:197:0x0482, please report this as an issue */
    public static w57 Q(CharSequence charSequence) {
        int i2;
        b67 b67VarE0;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        char cCharAt2;
        charSequence.getClass();
        if (charSequence.length() == 0) {
            b67VarE0 = new k47(charSequence, "An empty string is not a valid Instant");
        } else {
            char cCharAt3 = charSequence.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i2 = 1;
            } else {
                i2 = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i6 = i2;
            while (i6 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i6)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (charSequence.charAt(i6) - '0');
                i6++;
            }
            int i7 = i6 - i2;
            if (i7 > 10) {
                b67VarE0 = hkg.F0(charSequence, "Expected at most 10 digits for the year number, got " + i7 + " digits");
            } else if (i7 == 10 && charSequence.charAt(i2) >= '2') {
                b67VarE0 = hkg.F0(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i7 + " digits");
            } else if (i7 < 4) {
                b67VarE0 = hkg.F0(charSequence, "The year number must be padded to 4 digits, got " + i7 + " digits");
            } else if (cCharAt3 == '+' && i7 == 4) {
                b67VarE0 = hkg.F0(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i7 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i8 = i6 + 16;
                if (charSequence.length() >= i8) {
                    k47 k47VarE0 = hkg.E0(charSequence, "'-'", i6, new tk6(24));
                    if (k47VarE0 == null) {
                        b67VarE0 = hkg.E0(charSequence, "'-'", i6 + 3, new tk6(25));
                        if (b67VarE0 == null && (b67VarE0 = hkg.E0(charSequence, "'T' or 't'", i6 + 6, new tk6(26))) == null && (b67VarE0 = hkg.E0(charSequence, "':'", i6 + 9, new tk6(27))) == null && (b67VarE0 = hkg.E0(charSequence, "':'", i6 + 12, new tk6(28))) == null) {
                            int[] iArr = hkg.g;
                            int i9 = 0;
                            while (true) {
                                int i10 = 29;
                                if (i9 >= 10) {
                                    int iG0 = hkg.G0(charSequence, i6 + 1);
                                    int iG1 = hkg.G0(charSequence, i6 + 4);
                                    int iG2 = hkg.G0(charSequence, i6 + 7);
                                    int iG3 = hkg.G0(charSequence, i6 + 10);
                                    int iG4 = hkg.G0(charSequence, i6 + 13);
                                    int i11 = i6 + 15;
                                    if (charSequence.charAt(i11) == '.') {
                                        i11 = i8;
                                        int iCharAt2 = 0;
                                        while (i11 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i11)) && cCharAt < ':') {
                                            iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i11) - '0');
                                            i11++;
                                        }
                                        int i12 = i11 - i8;
                                        if (1 > i12 || i12 >= 10) {
                                            b67VarE0 = hkg.F0(charSequence, "1..9 digits are supported for the fraction of the second, got " + i12 + " digits");
                                            break;
                                        }
                                        i3 = iCharAt2 * hkg.f[9 - i12];
                                    } else {
                                        i3 = 0;
                                    }
                                    if (i11 < charSequence.length()) {
                                        char cCharAt4 = charSequence.charAt(i11);
                                        if (cCharAt4 != '+' && cCharAt4 != '-') {
                                            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                                                b67VarE0 = hkg.F0(charSequence, "Expected the UTC offset at position " + i11 + ", got '" + cCharAt4 + '\'');
                                                break;
                                            }
                                            int i13 = i11 + 1;
                                            if (charSequence.length() != i13) {
                                                b67VarE0 = hkg.F0(charSequence, "Extra text after the instant at position " + i13);
                                                break;
                                            }
                                            i4 = 0;
                                            if (1 <= iG0) {
                                                b67VarE0 = hkg.F0(charSequence, "Expected a month number in 1..12, got " + iG0);
                                                break;
                                            }
                                            b67VarE0 = hkg.F0(charSequence, "Expected a month number in 1..12, got " + iG0);
                                            break;
                                        }
                                        int length = charSequence.length() - i11;
                                        if (length <= 9) {
                                            if (length % 3 == 0) {
                                                int[] iArr2 = hkg.h;
                                                int i14 = 0;
                                                for (int i15 = 2; i14 < i15; i15 = 2) {
                                                    int i16 = i11 + iArr2[i14];
                                                    if (i16 >= charSequence.length()) {
                                                        break;
                                                    }
                                                    if (charSequence.charAt(i16) != ':') {
                                                        StringBuilder sbN = ub3.n(i16, "Expected ':' at index ", ", got '");
                                                        sbN.append(charSequence.charAt(i16));
                                                        sbN.append('\'');
                                                        b67VarE0 = hkg.F0(charSequence, sbN.toString());
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                                int[] iArr3 = hkg.i;
                                                int i17 = 0;
                                                while (i17 < 6 && (i5 = iArr3[i17] + i11) < charSequence.length()) {
                                                    char cCharAt5 = charSequence.charAt(i5);
                                                    int[] iArr4 = iArr3;
                                                    if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                        StringBuilder sbN2 = ub3.n(i5, "Expected an ASCII digit at index ", ", got '");
                                                        sbN2.append(charSequence.charAt(i5));
                                                        sbN2.append('\'');
                                                        b67VarE0 = hkg.F0(charSequence, sbN2.toString());
                                                        break;
                                                    }
                                                    i17++;
                                                    iArr3 = iArr4;
                                                }
                                                int iG5 = hkg.G0(charSequence, i11 + 1);
                                                int iG6 = length > 3 ? hkg.G0(charSequence, i11 + 4) : 0;
                                                int iG7 = length > 6 ? hkg.G0(charSequence, i11 + 7) : 0;
                                                if (iG6 <= 59) {
                                                    if (iG7 <= 59) {
                                                        if (iG5 > 17 && (iG5 != 18 || iG6 != 0 || iG7 != 0)) {
                                                            b67VarE0 = hkg.F0(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i11, charSequence.length()).toString());
                                                            break;
                                                        }
                                                        i4 = ((iG6 * 60) + (iG5 * 3600) + iG7) * (cCharAt4 == '-' ? -1 : 1);
                                                        if (1 <= iG0 && iG0 < 13) {
                                                            if (1 <= iG1) {
                                                                int i18 = iCharAt & 3;
                                                                if (iG1 > (iG0 != 2 ? (iG0 == 4 || iG0 == 6 || iG0 == 9 || iG0 == 11) ? 30 : 31 : i18 == 0 && (iCharAt % 100 != 0 || iCharAt % Constants.MINIMAL_ERROR_STATUS_CODE == 0) ? 29 : 28)) {
                                                                    StringBuilder sbN3 = ib8.n(iG0, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                                    sbN3.append(iG1);
                                                                    b67VarE0 = hkg.F0(charSequence, sbN3.toString());
                                                                    break;
                                                                }
                                                                if (iG2 <= 23) {
                                                                    if (iG3 <= 59) {
                                                                        if (iG4 <= 59) {
                                                                            long j2 = iCharAt;
                                                                            long j3 = 365 * j2;
                                                                            long j4 = (j2 >= 0 ? ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3 : j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))))) + ((long) (((iG0 * 367) - 362) / 12)) + ((long) (iG1 - 1));
                                                                            if (iG0 > 2) {
                                                                                j4 = (i18 != 0 || (iCharAt % 100 == 0 && iCharAt % Constants.MINIMAL_ERROR_STATUS_CODE != 0)) ? j4 - 2 : (-1) + j4;
                                                                            }
                                                                            b67VarE0 = new a67((((j4 - 719528) * 86400) + ((long) (((iG3 * 60) + (iG2 * 3600)) + iG4))) - ((long) i4), i3);
                                                                            break;
                                                                        }
                                                                        b67VarE0 = hkg.F0(charSequence, "Expected second-of-minute in 0..59, got " + iG4);
                                                                        break;
                                                                    }
                                                                    b67VarE0 = hkg.F0(charSequence, "Expected minute-of-hour in 0..59, got " + iG3);
                                                                    break;
                                                                }
                                                                b67VarE0 = hkg.F0(charSequence, "Expected hour in 0..23, got " + iG2);
                                                                break;
                                                            }
                                                            StringBuilder sbN4 = ib8.n(iG0, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                            sbN4.append(iG1);
                                                            b67VarE0 = hkg.F0(charSequence, sbN4.toString());
                                                            break;
                                                        }
                                                        b67VarE0 = hkg.F0(charSequence, "Expected a month number in 1..12, got " + iG0);
                                                        break;
                                                    }
                                                    b67VarE0 = hkg.F0(charSequence, "Expected offset-second-of-minute in 0..59, got " + iG7);
                                                    break;
                                                }
                                                b67VarE0 = hkg.F0(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iG6);
                                                break;
                                            }
                                            b67VarE0 = hkg.F0(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i11, charSequence.length()).toString() + '\"');
                                            break;
                                        }
                                        b67VarE0 = hkg.F0(charSequence, "The UTC offset string \"" + hkg.R0(charSequence.subSequence(i11, charSequence.length()).toString(), 16) + "\" is too long");
                                        break;
                                    }
                                    b67VarE0 = hkg.F0(charSequence, "The UTC offset at the end of the string is missing");
                                    break;
                                }
                                k47 k47VarE1 = hkg.E0(charSequence, "an ASCII digit", i6 + iArr[i9], new tk6(i10));
                                if (k47VarE1 != null) {
                                    b67VarE0 = k47VarE1;
                                    break;
                                }
                                i9++;
                            }
                        }
                    } else {
                        b67VarE0 = k47VarE0;
                    }
                } else {
                    b67VarE0 = hkg.F0(charSequence, "The input string is too short");
                }
            } else {
                b67VarE0 = hkg.F0(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return b67VarE0.toInstant();
    }

    public static final boolean S(Set set, x16 x16Var, l46 l46Var, int i2, int i3) {
        Set linkedHashSet;
        boolean z2;
        x16Var.getClass();
        l46Var.f0(-164806276);
        if ((i3 & 1) != 0) {
            MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
            if (mixedDeckSnapshot != null) {
                Set<String> setKeySet = mixedDeckSnapshot.getSkinsByCard().keySet();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    TarotSkinIdentify tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                    if (tarotSkinIdentifySkinFor != null) {
                        arrayList.add(tarotSkinIdentifySkinFor);
                    }
                }
                linkedHashSet = new LinkedHashSet();
                for (Object obj : arrayList) {
                    if (((TarotSkinIdentify) obj).getRequiresDownload()) {
                        linkedHashSet.add(obj);
                    }
                }
            } else {
                linkedHashSet = null;
            }
            if (linkedHashSet == null) {
                linkedHashSet = xu4.a;
            }
        } else {
            linkedHashSet = set;
        }
        Set set2 = linkedHashSet;
        boolean z3 = set2 instanceof Collection;
        if (!z3 || !set2.isEmpty()) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                if (((TarotSkinIdentify) it2.next()).getRequiresDownload()) {
                    nfc nfcVarB = kr7.b(l46Var);
                    boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                    Object objR = l46Var.R();
                    Object obj2 = sf2.a;
                    if (zG || objR == obj2) {
                        objR = nfcVarB.b(job.a.b(cmd.class), null, null);
                        l46Var.p0(objR);
                    }
                    cmd cmdVar = (cmd) objR;
                    nfc nfcVarB2 = kr7.b(l46Var);
                    boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == obj2) {
                        objR2 = nfcVarB2.b(job.a.b(dx8.class), null, null);
                        l46Var.p0(objR2);
                    }
                    cx8 cx8Var = ((dx8) objR2).a;
                    whb whbVar = ((ys3) cmdVar).v;
                    e89 e89VarI = jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0);
                    whb whbVar2 = cx8Var.c;
                    e89 e89VarI2 = jzb.i(whbVar2, whbVar2.getValue(), l46Var, 0, 0);
                    if (z3 && set2.isEmpty()) {
                        z2 = true;
                        break;
                    }
                    Iterator it3 = set2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z2 = true;
                            break;
                        }
                        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) it3.next();
                        if (tarotSkinIdentify.getRequiresDownload()) {
                            hmd hmdVar = (hmd) ((Map) e89VarI.getValue()).get(tarotSkinIdentify);
                            if ((hmdVar != null ? hmdVar.a : null) != gmd.e) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    int i4 = (i2 & 14) ^ 6;
                    boolean z4 = (i4 > 4 && l46Var.g(linkedHashSet)) || (i2 & 6) == 4;
                    Object objR3 = l46Var.R();
                    if (z4 || objR3 == obj2) {
                        objR3 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR3);
                    }
                    e89 e89Var = (e89) objR3;
                    Object objR4 = l46Var.R();
                    if (objR4 == obj2) {
                        objR4 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR4);
                    }
                    e89 e89Var2 = (e89) objR4;
                    Boolean boolValueOf = Boolean.valueOf(((sw8) e89VarI2.getValue()).c);
                    boolean zG3 = l46Var.g(e89VarI2);
                    boolean z5 = true;
                    Object objR5 = l46Var.R();
                    if (zG3 || objR5 == obj2) {
                        objR5 = new ex8(e89VarI2, e89Var2, null);
                        l46Var.p0(objR5);
                    }
                    af1.o((l26) objR5, l46Var, boolValueOf);
                    if (z2 || ((Boolean) e89Var.getValue()).booleanValue()) {
                        l46Var.f0(-595047866);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-595331361);
                        if (((Boolean) e89Var2.getValue()).booleanValue()) {
                            l46Var.f0(-595312885);
                            Object objR6 = l46Var.R();
                            if (objR6 == obj2) {
                                objR6 = new x08(e89Var2, 5);
                                l46Var.p0(objR6);
                            }
                            qn4.q((x16) objR6, l46Var, 6);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-595244034);
                            sw8 sw8Var = (sw8) e89VarI2.getValue();
                            boolean zG4 = l46Var.g(e89Var) | ((((i2 & 112) ^ 48) > 32 && l46Var.g(x16Var)) || (i2 & 48) == 32);
                            Object objR7 = l46Var.R();
                            if (zG4 || objR7 == obj2) {
                                objR7 = new k8(x16Var, e89Var, 7);
                                l46Var.p0(objR7);
                            }
                            x16 x16Var2 = (x16) objR7;
                            boolean zI = l46Var.i(cx8Var);
                            if ((i4 <= 4 || !l46Var.i(linkedHashSet)) && (i2 & 6) != 4) {
                                z5 = false;
                            }
                            boolean z6 = zI | z5;
                            Object objR8 = l46Var.R();
                            if (z6 || objR8 == obj2) {
                                objR8 = new jf6(20, cx8Var, linkedHashSet);
                                l46Var.p0(objR8);
                            }
                            g(sw8Var, x16Var2, (x16) objR8, l46Var, 0);
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                    return z2;
                }
            }
        }
        l46Var.r(false);
        return true;
    }

    public static final ghc T(l46 l46Var) {
        Object[] objArr = new Object[0];
        boolean zE = l46Var.e(0);
        Object objR = l46Var.R();
        if (zE || objR == sf2.a) {
            objR = new kgc(1);
            l46Var.p0(objR);
        }
        return (ghc) vfh.J(objArr, ghc.k, (x16) objR, l46Var, 0);
    }

    public static final j09 V(j09 j09Var, ghc ghcVar, boolean z2, boolean z3, boolean z4, lcg lcgVar) {
        j09 j09VarE;
        ks9 ks9Var = ks9.a;
        ks9 ks9Var2 = z3 ? ks9Var : ks9.b;
        if (z4) {
            u69 u69Var = ghcVar.e;
            g09 g09Var = g09.a;
            j09VarE = j09Var.D(ks9Var2 == ks9Var ? oa7.E(g09Var, y02.d) : oa7.E(g09Var, y02.c)).D(new hhc(null, null, u69Var, ks9Var2, null, ghcVar, z2, true));
        } else {
            j09VarE = od4.E(j09Var, ghcVar, ks9Var2, lcgVar, z2, null, ghcVar.e, null);
        }
        return j09VarE.D(new ScrollingLayoutElement(ghcVar, z3));
    }

    public static final j09 W(j09 j09Var) {
        return j09Var.D(new nce(I));
    }

    public static x67 X(z67 z67Var, int i2) {
        z67Var.getClass();
        k(i2 > 0, Integer.valueOf(i2));
        int i3 = z67Var.a;
        int i4 = z67Var.b;
        if (z67Var.c <= 0) {
            i2 = -i2;
        }
        return new x67(i3, i4, i2);
    }

    public static final j09 Y(j09 j09Var) {
        return j09Var.D(new nce(H));
    }

    public static final String Z(xn2 xn2Var) {
        Object dzbVar;
        if (xn2Var instanceof z94) {
            return ((z94) xn2Var).toString();
        }
        try {
            dzbVar = xn2Var + '@' + F(xn2Var);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (ezb.a(dzbVar) != null) {
            dzbVar = xn2Var.getClass().getName() + '@' + F(xn2Var);
        }
        return (String) dzbVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void a(e1b e1bVar, l26 l26Var, l46 l46Var, int i2) {
        srf srfVar;
        boolean z2;
        ojb ojbVarV;
        l46Var.h0(-149765515);
        f77 f77Var = l46Var.x;
        u8a u8aVarM = l46Var.m();
        l46Var.c0(201, wf2.b);
        Object objR = l46Var.R();
        if (pa7.t(objR, sf2.a)) {
            srfVar = null;
        } else {
            objR.getClass();
            srfVar = (srf) objR;
        }
        b1b b1bVar = e1bVar.a;
        srf srfVarD = b1bVar.d(e1bVar, srfVar);
        boolean zEquals = srfVarD.equals(srfVar);
        if (!zEquals) {
            l46Var.p0(srfVarD);
        }
        if (!l46Var.S) {
            kpd kpdVar = l46Var.G;
            Object objB = kpdVar.b(kpdVar.b, kpdVar.g);
            objB.getClass();
            u8a u8aVar = (u8a) objB;
            if (!(l46Var.F() && zEquals) && (e1bVar.g || !u8aVarM.containsKey(b1bVar))) {
                u8aVarM = u8aVarM.i(b1bVar, srfVarD);
            } else if ((zEquals && !l46Var.w) || !l46Var.w) {
                u8aVarM = u8aVar;
            }
            if (l46Var.y || u8aVar != u8aVarM) {
                z2 = true;
            }
            if (z2 && !l46Var.S) {
                l46Var.P(u8aVarM);
            }
            f77Var.e(l46Var.w ? 1 : 0);
            l46Var.w = z2;
            l46Var.K = u8aVarM;
            l46Var.a0(wf2.c, 202, u8aVarM, 0);
            l26Var.z(l46Var, Integer.valueOf((i2 >> 3) & 14));
            l46Var.r(false);
            l46Var.r(false);
            l46Var.w = f77Var.d() != 0;
            l46Var.K = null;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new gc(e1bVar, l26Var, i2, 11);
            }
        }
        if (e1bVar.g || !u8aVarM.containsKey(b1bVar)) {
            u8aVarM = u8aVarM.i(b1bVar, srfVarD);
        }
        l46Var.J = true;
        z2 = false;
        if (z2) {
            l46Var.P(u8aVarM);
        }
        f77Var.e(l46Var.w ? 1 : 0);
        l46Var.w = z2;
        l46Var.K = u8aVarM;
        l46Var.a0(wf2.c, 202, u8aVarM, 0);
        l26Var.z(l46Var, Integer.valueOf((i2 >> 3) & 14));
        l46Var.r(false);
        l46Var.r(false);
        l46Var.w = f77Var.d() != 0;
        l46Var.K = null;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(e1bVar, l26Var, i2, 11);
        }
    }

    public static final m40 a0(v50 v50Var) {
        v50Var.getClass();
        if (v50Var.ordinal() >= 5) {
            return m40.CompletedDomain;
        }
        if (v50Var.ordinal() >= 3) {
            return m40.CompletedMonthly;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void b(e1b[] e1bVarArr, l26 l26Var, l46 l46Var, int i2) {
        u8a u8aVarI;
        boolean z2;
        ojb ojbVarV;
        l46Var.h0(415205898);
        f77 f77Var = l46Var.x;
        u8a u8aVarM = l46Var.m();
        l46Var.c0(201, wf2.b);
        boolean z3 = l46Var.S;
        dq9 dq9Var = wf2.d;
        if (z3) {
            u8a u8aVarH = od4.H(e1bVarArr, u8aVarM, u8a.d);
            u8aVarM.getClass();
            t8a t8aVar = new t8a(u8aVarM);
            t8aVar.g = u8aVarM;
            t8aVar.putAll(u8aVarH);
            u8aVarI = t8aVar.f();
            l46Var.c0(204, dq9Var);
            l46Var.J();
            l46Var.q0(u8aVarI);
            l46Var.J();
            l46Var.q0(u8aVarH);
            l46Var.r(false);
            l46Var.J = true;
        } else {
            kpd kpdVar = l46Var.G;
            Object objH = kpdVar.h(kpdVar.g, 0);
            objH.getClass();
            u8a u8aVar = (u8a) objH;
            kpd kpdVar2 = l46Var.G;
            Object objH2 = kpdVar2.h(kpdVar2.g, 1);
            objH2.getClass();
            u8a u8aVar2 = (u8a) objH2;
            u8a u8aVarH2 = od4.H(e1bVarArr, u8aVarM, u8aVar2);
            if (!l46Var.F() || l46Var.y || !u8aVar2.equals(u8aVarH2)) {
                u8aVarM.getClass();
                t8a t8aVar2 = new t8a(u8aVarM);
                t8aVar2.g = u8aVarM;
                t8aVar2.putAll(u8aVarH2);
                u8aVarI = t8aVar2.f();
                l46Var.c0(204, dq9Var);
                l46Var.J();
                l46Var.q0(u8aVarI);
                l46Var.J();
                l46Var.q0(u8aVarH2);
                l46Var.r(false);
                if (l46Var.y || !u8aVarI.equals(u8aVar)) {
                    z2 = true;
                }
                if (z2 && !l46Var.S) {
                    l46Var.P(u8aVarI);
                }
                f77Var.e(l46Var.w ? 1 : 0);
                l46Var.w = z2;
                l46Var.K = u8aVarI;
                l46Var.a0(wf2.c, 202, u8aVarI, 0);
                l26Var.z(l46Var, Integer.valueOf((i2 >> 3) & 14));
                l46Var.r(false);
                l46Var.r(false);
                l46Var.w = f77Var.d() != 0;
                l46Var.K = null;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new gc(e1bVarArr, l26Var, i2, 12);
                }
            }
            l46Var.l = l46Var.G.s() + l46Var.l;
            u8aVarI = u8aVar;
        }
        z2 = false;
        if (z2) {
            l46Var.P(u8aVarI);
        }
        f77Var.e(l46Var.w ? 1 : 0);
        l46Var.w = z2;
        l46Var.K = u8aVarI;
        l46Var.a0(wf2.c, 202, u8aVarI, 0);
        l26Var.z(l46Var, Integer.valueOf((i2 >> 3) & 14));
        l46Var.r(false);
        l46Var.r(false);
        l46Var.w = f77Var.d() != 0;
        l46Var.K = null;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(e1bVarArr, l26Var, i2, 12);
        }
    }

    public static j22 b0(dx5 dx5Var) {
        dx5Var.getClass();
        return new j22(dx5Var.b(), dx5Var.a.g());
    }

    public static final long c(float f2, boolean z2, boolean z3) {
        return (((z2 ? 1L : 0L) | (z3 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static z67 c0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new z67(i2, i3 - 1, 1);
        }
        z67 z67Var = z67.d;
        return z67.d;
    }

    public static final void d(j09 j09Var, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-26651627);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            pr4 pr4Var = l8b.a;
            int i4 = k8b.f((e8b) l46Var2.k(pr4Var)) ? R.drawable.friend_coupon_empty_box_neo : R.drawable.friend_coupon_empty_box;
            j09 j09VarB0 = ynb.b0(16.0f, 0.0f, j09Var, 2);
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i3)), jx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
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
            fy9 fy9VarA = od4.A(i4, 0, l46Var2);
            g09 g09Var = g09.a;
            feg.j(fy9VarA, null, b.l(g09Var, 120.0f), null, null, 0.0f, null, l46Var2, 440, 120);
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(i3)), jx0Var, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            String strQ = afc.q(R.string.friend_coupon_empty_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, we6.e(l46Var2) ? pue.n(l46Var2) : mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 0, 130042);
            nte.b(afc.q(R.string.friend_coupon_empty_subtitle, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i2, 26, j09Var);
        }
    }

    public static j09 d0(j09 j09Var, ghc ghcVar, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return V(j09Var, ghcVar, z2, true, true, null);
    }

    public static final void e(uh8 uh8Var, x16 x16Var, j09 j09Var, boolean z2, boolean z3, boolean z4, boolean z5, rqb rqbVar, boolean z6, yi yiVar, bn2 bn2Var, boolean z7, boolean z8, Map map, jh0 jh0Var, boolean z9, l46 l46Var, int i2, int i3, int i4) {
        x16Var.getClass();
        l46Var.h0(382909894);
        j09 j09Var2 = (i4 & 4) != 0 ? g09.a : j09Var;
        boolean z10 = (i4 & 8) != 0 ? false : z2;
        boolean z11 = (i4 & 16) != 0 ? false : z3;
        boolean z12 = (i4 & 32) != 0 ? true : z4;
        boolean z13 = (i4 & 64) != 0 ? false : z5;
        rqb rqbVar2 = (i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? rqb.a : rqbVar;
        boolean z14 = (i4 & 256) != 0 ? false : z6;
        yi yiVar2 = (i4 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? ndb.f : yiVar;
        bn2 bn2Var2 = (i4 & 2048) != 0 ? an2.b : bn2Var;
        boolean z15 = (i4 & 4096) != 0 ? true : z7;
        boolean z16 = (i4 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z8;
        Map map2 = (i4 & 16384) != 0 ? null : map;
        jh0 jh0Var2 = (i4 & 32768) != 0 ? jh0.a : jh0Var;
        boolean z17 = (i4 & 65536) != 0 ? false : z9;
        l46Var.g0(185152185);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new oi8();
            l46Var.p0(objR);
        }
        oi8 oi8Var = (oi8) objR;
        l46Var.r(false);
        l46Var.g0(185152232);
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = new Matrix();
            l46Var.p0(objR2);
        }
        Matrix matrix = (Matrix) objR2;
        l46Var.r(false);
        l46Var.g0(185152312);
        boolean zG = l46Var.g(uh8Var);
        Object objR3 = l46Var.R();
        if (zG || objR3 == i8cVar) {
            objR3 = q1c.f(null);
            l46Var.p0(objR3);
        }
        e89 e89Var = (e89) objR3;
        l46Var.r(false);
        l46Var.g0(185152364);
        if (uh8Var == null || uh8Var.b() == 0.0f) {
            j09 j09Var3 = j09Var2;
            Map map3 = map2;
            boolean z18 = z13;
            rqb rqbVar3 = rqbVar2;
            boolean z19 = z11;
            boolean z20 = z14;
            jh0 jh0Var3 = jh0Var2;
            boolean z21 = z16;
            boolean z22 = z17;
            s21.a(j09Var3, l46Var, (i2 >> 6) & 14);
            l46Var.r(false);
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new hh8(uh8Var, x16Var, j09Var3, z10, z19, z12, z18, rqbVar3, z20, yiVar2, bn2Var2, z15, z21, map3, jh0Var3, z22, i2, i3, i4);
                return;
            }
            return;
        }
        l46Var.r(false);
        yi yiVar3 = yiVar2;
        Rect rect = uh8Var.k;
        Context context = (Context) l46Var.k(uq.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        j09Var2.getClass();
        j09 j09VarD = j09Var2.D(new nh8(iWidth, iHeight));
        j09 j09Var4 = j09Var2;
        bn2 bn2Var3 = bn2Var2;
        boolean z23 = z12;
        Map map4 = map2;
        boolean z24 = z13;
        rqb rqbVar4 = rqbVar2;
        jh0 jh0Var4 = jh0Var2;
        boolean z25 = z17;
        boolean z26 = z15;
        boolean z27 = z10;
        jh8 jh8Var = new jh8(rect, bn2Var3, yiVar3, matrix, oi8Var, z24, z25, rqbVar4, jh0Var4, uh8Var, map4, z27, z11, z23, z14, z26, z16, context, x16Var, e89Var);
        boolean z28 = z14;
        boolean z29 = z11;
        boolean z30 = z16;
        nk8.e(0, jh8Var, l46Var, j09VarD);
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new kh8(uh8Var, x16Var, j09Var4, z27, z29, z23, z24, rqbVar4, z28, yiVar3, bn2Var3, z26, z30, map4, jh0Var4, z25, i2, i3, i4);
        }
    }

    public static final void f(uh8 uh8Var, j09 j09Var, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6, boolean z7, rqb rqbVar, boolean z8, boolean z9, yi yiVar, bn2 bn2Var, boolean z10, boolean z11, Map map, boolean z12, jh0 jh0Var, l46 l46Var, int i3, int i4, int i5, int i6) {
        l46Var.h0(1331239405);
        j09 j09Var2 = (i6 & 2) != 0 ? g09.a : j09Var;
        boolean z13 = (i6 & 4) != 0 ? true : z2;
        boolean z14 = (i6 & 8) != 0 ? true : z3;
        float f3 = (i6 & 32) != 0 ? 1.0f : f2;
        int i7 = (i6 & 64) != 0 ? 1 : i2;
        boolean z15 = (i6 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? false : z4;
        boolean z16 = (i6 & 256) != 0 ? false : z5;
        boolean z17 = (i6 & 512) != 0 ? true : z6;
        boolean z18 = (i6 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z7;
        rqb rqbVar2 = (i6 & 2048) != 0 ? rqb.a : rqbVar;
        boolean z19 = (i6 & 4096) != 0 ? false : z8;
        boolean z20 = (i6 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z9;
        yi yiVar2 = (i6 & 32768) != 0 ? ndb.f : yiVar;
        bn2 bn2Var2 = (i6 & 65536) != 0 ? an2.b : bn2Var;
        boolean z21 = (i6 & 131072) == 0 ? z10 : true;
        boolean z22 = (i6 & 262144) != 0 ? false : z11;
        Map map2 = (i6 & 524288) != 0 ? null : map;
        boolean z23 = (i6 & 1048576) != 0 ? false : z12;
        jh0 jh0Var2 = (i6 & 2097152) != 0 ? jh0.a : jh0Var;
        boolean z24 = z13;
        boolean z25 = z14;
        float f4 = f3;
        int i8 = i7;
        boolean z26 = z19;
        ug8 ug8VarL = rs0.l(uh8Var, z24, z25, z26, f4, i8, l46Var, 896);
        l46Var.g0(185157769);
        boolean zG = l46Var.g(ug8VarL);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new lh8(ug8VarL);
            l46Var.p0(objR);
        }
        l46Var.r(false);
        int i9 = i3 >> 12;
        int i10 = ((i3 << 3) & 896) | 1073741832 | (i9 & 7168) | (57344 & i9) | (i9 & 458752);
        int i11 = i4 << 18;
        int i12 = i10 | (i11 & 3670016) | (i11 & 29360128) | ((i4 << 15) & 234881024);
        int i13 = i4 >> 15;
        boolean z27 = z18;
        boolean z28 = z22;
        boolean z29 = z17;
        boolean z30 = z21;
        boolean z31 = z16;
        bn2 bn2Var3 = bn2Var2;
        boolean z32 = z15;
        rqb rqbVar3 = rqbVar2;
        boolean z33 = z20;
        yi yiVar3 = yiVar2;
        Map map3 = map2;
        boolean z34 = z23;
        jh0 jh0Var3 = jh0Var2;
        e(uh8Var, (x16) objR, j09Var2, z32, z31, z29, z27, rqbVar3, z33, yiVar3, bn2Var3, z30, z28, map3, jh0Var3, z34, l46Var, i12, (i13 & 7168) | (i13 & 896) | (i13 & 14) | 32768 | (i13 & 112) | ((i5 << 12) & 458752) | ((i5 << 18) & 3670016), 0);
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mh8(uh8Var, j09Var2, z24, z25, f4, i8, z32, z31, z29, z27, rqbVar3, z26, z33, yiVar3, bn2Var3, z30, z28, map3, z34, jh0Var3, i3, i4, i5, i6);
        }
    }

    public static final void g(sw8 sw8Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        String strI;
        sw8Var.getClass();
        gmd gmdVar = sw8Var.a;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1323591541);
        int i3 = i2 | (l46Var.g(sw8Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = gmdVar == gmd.c;
            String strQ = afc.q(R.string.skin_predraw_title, l46Var);
            boolean z3 = z2;
            dd2 dd2Var = xo1.c;
            if (z3) {
                l46Var.f0(661163791);
                strI = afc.r(R.string.skin_predraw_downloading_progress, new Object[]{Integer.valueOf((int) (sw8Var.b * 100.0f))}, l46Var);
                l46Var.r(false);
            } else {
                strI = gmdVar == gmd.d ? tec.i(l46Var, 661168218, R.string.button_retry, l46Var, false) : tec.i(l46Var, 661169895, R.string.skin_predraw_download_now, l46Var, false);
            }
            int i4 = i3 << 21;
            kj0.F(strQ, dd2Var, strI, null, !z3, false, null, null, x16Var, x16Var2, l46Var, (234881024 & i4) | 48 | (i4 & 1879048192), 232);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, sw8Var, x16Var, x16Var2, 15);
        }
    }

    public static final p69 j(rz7 rz7Var, b08 b08Var, ssg ssgVar) {
        int iMin;
        i4 i4Var = z5c.z(b08Var.a).c;
        p89 p89Var = (p89) ssgVar.b;
        int i2 = 1;
        if (!(p89Var.c != 0) && i4Var.isEmpty()) {
            return s67.a;
        }
        p69 p69Var = new p69();
        if (((p89) ssgVar.b).c != 0) {
            int i3 = p89Var.c;
            if (i3 == 0) {
                r3.n("MutableVector is empty.");
                return null;
            }
            Object[] objArr = p89Var.a;
            int i4 = ((uy7) objArr[0]).a;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = ((uy7) objArr[i5]).a;
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            if (i4 < 0) {
                l37.a("negative minIndex");
            }
            int i7 = p89Var.c;
            if (i7 == 0) {
                r3.n("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = p89Var.a;
            int i8 = ((uy7) objArr2[0]).b;
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = ((uy7) objArr2[i9]).b;
                if (i10 > i8) {
                    i8 = i10;
                }
            }
            iMin = Math.min(i8, rz7Var.a() - 1);
            i2 = i4;
        } else {
            iMin = 0;
        }
        int iC = i4Var.c();
        for (int i11 = 0; i11 < iC; i11++) {
            a08 a08Var = (a08) i4Var.get(i11);
            int I2 = db6.I(rz7Var, a08Var.a, a08Var.c);
            if ((i2 > I2 || I2 > iMin) && I2 >= 0 && I2 < rz7Var.a()) {
                p69Var.c(I2);
            }
        }
        if (i2 <= iMin) {
            while (true) {
                p69Var.c(i2);
                if (i2 == iMin) {
                    break;
                }
                i2++;
            }
        }
        int i12 = p69Var.b;
        if (i12 == 0) {
            return p69Var;
        }
        int[] iArr = p69Var.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i12);
        return p69Var;
    }

    public static final void k(boolean z2, Number number) {
        if (z2) {
            return;
        }
        cva.g(46, number, "Step must be positive, was: ");
    }

    public static Comparable l(yi4 yi4Var, yi4 yi4Var2) {
        return yi4Var.compareTo(yi4Var2) < 0 ? yi4Var2 : yi4Var;
    }

    public static double m(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            return d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float n(float f2, float f3, float f4) {
        if (f3 <= f4) {
            if (f2 < f3) {
                return f3;
            }
            return f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int o(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            return i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static int p(int i2, c62 c62Var) {
        if (c62Var instanceof b62) {
            return ((Number) r(Integer.valueOf(i2), (b62) c62Var)).intValue();
        }
        if (c62Var.isEmpty()) {
            cva.g(46, c62Var, "Cannot coerce value to an empty range: ");
            return 0;
        }
        if (i2 < ((Number) c62Var.c()).intValue()) {
            return ((Number) c62Var.c()).intValue();
        }
        return i2 > ((Number) c62Var.d()).intValue() ? ((Number) c62Var.d()).intValue() : i2;
    }

    public static long q(long j2, long j3, long j4) {
        if (j3 <= j4) {
            if (j2 < j3) {
                return j3;
            }
            return j2 > j4 ? j4 : j2;
        }
        StringBuilder sbP = ub3.p("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j4);
        sbP.append(j3);
        sbP.append('.');
        throw new IllegalArgumentException(sbP.toString());
    }

    public static Comparable r(Comparable comparable, b62 b62Var) {
        b62Var.getClass();
        float f2 = b62Var.b;
        float f3 = b62Var.a;
        if (b62Var.isEmpty()) {
            cva.g(46, b62Var, "Cannot coerce value to an empty range: ");
            return null;
        }
        if (!b62.a(comparable, Float.valueOf(f3)) || b62.a(Float.valueOf(f3), comparable)) {
            return (!b62.a(Float.valueOf(f2), comparable) || b62.a(comparable, Float.valueOf(f2))) ? comparable : Float.valueOf(f2);
        }
        return Float.valueOf(f3);
    }

    public static Comparable s(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        comparable.getClass();
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                pd4.j("Cannot coerce value to an empty range: maximum ", comparable3, " is less than minimum ", comparable2, 46);
                return null;
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static rt t(dy9 dy9Var, int i2, BlurMaskFilter blurMaskFilter, int i3) {
        long j2 = y72.b;
        if ((i3 & 2) != 0) {
            i2 = 3;
        }
        if ((i3 & 4) != 0) {
            blurMaskFilter = null;
        }
        int i4 = (i3 & 8) != 0 ? 0 : 1;
        rt rtVar = (rt) dy9Var;
        rtVar.f(j2);
        rtVar.e(i2);
        rtVar.n(i4);
        urg.E(rtVar).setMaskFilter(blurMaskFilter);
        return rtVar;
    }

    public static final xn7 v(k4 k4Var, zf2 zf2Var, String str) {
        xn7 xn7VarF = k4Var.f(zf2Var, str);
        if (xn7VarF != null) {
            return xn7VarF;
        }
        tq.O(k4Var.h(), str);
        throw null;
    }

    public static final xn7 w(k4 k4Var, ev4 ev4Var, Object obj) {
        obj.getClass();
        xn7 xn7VarG = k4Var.g(ev4Var, obj);
        if (xn7VarG != null) {
            return xn7VarG;
        }
        em7 em7VarB = job.a.b(obj.getClass());
        em7 em7VarH = k4Var.h();
        em7VarH.getClass();
        String strR = em7VarB.r();
        if (strR == null) {
            strR = String.valueOf(em7VarB);
        }
        tq.O(em7VarH, strR);
        throw null;
    }

    public static w57 x(long j2) {
        long j3 = j2 / 1000;
        if ((j2 ^ 1000) < 0 && j3 * 1000 != j2) {
            j3--;
        }
        long j4 = j2 % 1000;
        int i2 = (int) ((j4 + (1000 & (((j4 ^ 1000) & ((-j4) | j4)) >> 63))) * 1000000);
        if (j3 < -31557014167219200L) {
            return w57.a;
        }
        return j3 > 31556889864403199L ? w57.b : y(i2, j3);
    }

    public static w57 y(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / 1000000000;
        if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
            j4--;
        }
        long j5 = j2 + j4;
        if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
            return j2 > 0 ? w57.b : w57.a;
        }
        if (j5 < -31557014167219200L) {
            return w57.a;
        }
        if (j5 > 31556889864403199L) {
            return w57.b;
        }
        long j6 = j3 % 1000000000;
        return new w57(j5, (int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)));
    }

    public static j22 z(String str, boolean z2) {
        String strA;
        str.getClass();
        int iN = v4e.N(str, '`', 0, 6);
        if (iN == -1) {
            iN = str.length();
        }
        int iT = v4e.T(str, "/", iN, 4);
        String str2 = "";
        if (iT == -1) {
            strA = c5e.A(str, "`", "");
        } else {
            String strReplace = str.substring(0, iT).replace('/', '.');
            strReplace.getClass();
            strA = c5e.A(str.substring(iT + 1), "`", "");
            str2 = strReplace;
        }
        return new j22(new dx5(str2), new dx5(strA), z2);
    }

    public ze I(Context context, Object obj) {
        return null;
    }

    public abstract void O(Throwable th);

    public abstract void P(szc szcVar);

    public abstract Object R(Intent intent, int i2);

    public abstract Object U();

    public abstract boolean i(Object obj);

    public abstract Intent u(Context context, Object obj);

    public void h(Object obj) {
    }
}
