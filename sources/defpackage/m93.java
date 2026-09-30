package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MotionEvent;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m93 {
    public static final dd2 a = new dd2(new kd2(2), false, -1169797585);
    public static final dd2 b = new dd2(new kd2(3), false, -239670312);
    public static final dd2 c = new dd2(new yd2(16), false, 429357132);
    public static final dd2 d = new dd2(new he2(0), false, 569848504);
    public static final dd2 e = new dd2(new ce2(25), false, -1751337489);
    public static final dd2 f = new dd2(new ce2(26), false, 33524971);
    public static final int[][] g = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] h = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] i = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] j = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final n82 k = n82.X;
    public static final rh5 l = new rh5(0, 0, 0);
    public static x16 m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;

    public static void A(int i2, int i3, yl9 yl9Var) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = g[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                yl9Var.x(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void B(int i2, int i3, yl9 yl9Var) throws vcg {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!F(yl9Var.w(i2, i5))) {
                throw new vcg();
            }
            yl9Var.x(i2, i5, 0);
        }
    }

    public static sv8 C(sv8 sv8Var, cv7 cv7Var, mue mueVar, sw3 sw3Var, xp5 xp5Var) {
        if (sv8Var != null && cv7Var == sv8Var.a && a6c.k(mueVar, cv7Var).equals(sv8Var.b) && sw3Var.getDensity() == sv8Var.c.a && xp5Var == sv8Var.d) {
            return sv8Var;
        }
        sv8 sv8Var2 = sv8.h;
        if (sv8Var2 != null && cv7Var == sv8Var2.a && a6c.k(mueVar, cv7Var).equals(sv8Var2.b) && sw3Var.getDensity() == sv8Var2.c.a && xp5Var == sv8Var2.d) {
            return sv8Var2;
        }
        sv8 sv8Var3 = new sv8(cv7Var, a6c.k(mueVar, cv7Var), new vw3(sw3Var.getDensity(), sw3Var.h0()), xp5Var);
        sv8.h = sv8Var3;
        return sv8Var3;
    }

    public static final jg1 D(vf vfVar, vf vfVar2) {
        String strD = vfVar2 != null ? vfVar2.a.d() : null;
        ep0 ep0Var = ((we1) vfVar.c).a;
        String strD2 = vfVar.a.d();
        strD2.getClass();
        return v(strD2, strD, ep0Var);
    }

    public static final ng8 E(ng8 ng8Var) {
        LayoutNode layoutNodeF = ng8Var.J0.J0;
        while (true) {
            LayoutNode layoutNodeF2 = layoutNodeF.F();
            if ((layoutNodeF2 != null ? layoutNodeF2.w : null) == null) {
                ng8 ng8VarF1 = layoutNodeF.getOuterCoordinator$ui().f1();
                ng8VarF1.getClass();
                return ng8VarF1;
            }
            LayoutNode layoutNodeF3 = layoutNodeF.F();
            LayoutNode layoutNode = layoutNodeF3 != null ? layoutNodeF3.w : null;
            layoutNode.getClass();
            if (layoutNode.v) {
                layoutNodeF = layoutNodeF.F();
                layoutNodeF.getClass();
            } else {
                LayoutNode layoutNodeF4 = layoutNodeF.F();
                layoutNodeF4.getClass();
                layoutNodeF = layoutNodeF4.w;
                layoutNodeF.getClass();
            }
        }
    }

    public static boolean F(int i2) {
        return i2 == -1;
    }

    public static final boolean G(yx9 yx9Var, float f2) {
        yx9Var.k().getClass();
        return !(((yx9Var.q() ? -f2 : y(yx9Var)) > 0.0f ? 1 : ((yx9Var.q() ? -f2 : y(yx9Var)) == 0.0f ? 0 : -1)) > 0);
    }

    public static boolean H(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (n == null) {
            n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            o = boolValueOf;
        }
        return boolValueOf.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final j09 I(l46 l46Var, j09 j09Var) {
        if (j09Var.g(new cz1(12))) {
            return j09Var;
        }
        l46Var.g0(1219399079);
        j09 j09Var2 = (j09) j09Var.c(new i1(7, l46Var), g09.a);
        l46Var.r(false);
        return j09Var2;
    }

    public static final j09 J(l46 l46Var, j09 j09Var) {
        l46Var.f0(439770924);
        j09 j09VarI = I(l46Var, j09Var);
        l46Var.r(false);
        return j09VarI;
    }

    public static PorterDuff.Mode K(int i2) {
        if (i2 == 0) {
            return null;
        }
        switch (kv2.B(i2)) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return PorterDuff.Mode.DST_ATOP;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return PorterDuff.Mode.XOR;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return PorterDuff.Mode.ADD;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return PorterDuff.Mode.DARKEN;
            case 17:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    public static final cs3 L(x16 x16Var, a26 a26Var, int i2, l46 l46Var, int i3, int i4) {
        x16Var.getClass();
        a26Var.getClass();
        int i5 = 0;
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        int iIntValue = ((Number) x16Var.invoke()).intValue();
        int i6 = iIntValue > 0 ? (1073741823 - (1073741823 % iIntValue)) + i2 : 0;
        boolean zE = l46Var.e(iIntValue);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        Object obj2 = objR;
        if (zE || objR == obj) {
            Object a12Var = new a12(iIntValue, i5);
            l46Var.p0(a12Var);
            obj2 = a12Var;
        }
        cs3 cs3VarB = ay9.b(i6, 0, 2, (x16) obj2, l46Var);
        int i7 = (l46Var.g(cs3VarB) ? 1 : 0) | (((((i3 & 112) ^ 48) > 32 && l46Var.g(a26Var)) || (i3 & 48) == 32) ? 1 : 0) | (l46Var.e(iIntValue) ? 1 : 0);
        Object objR2 = l46Var.R();
        Object obj3 = objR2;
        if (i7 != 0 || objR2 == obj) {
            Object h12Var = new h12(iIntValue, null, a26Var, cs3VarB);
            l46Var.p0(h12Var);
            obj3 = h12Var;
        }
        af1.o((l26) obj3, l46Var, cs3VarB);
        return cs3VarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object M(File file, a26 a26Var, zn2 zn2Var) throws IOException {
        xd5 xd5Var;
        if (zn2Var instanceof xd5) {
            xd5Var = (xd5) zn2Var;
            int i2 = xd5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xd5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                xd5Var = new xd5(zn2Var);
            }
        } else {
            xd5Var = new xd5(zn2Var);
        }
        Object obj = xd5Var.result;
        int i3 = xd5Var.label;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return obj;
            }
            jzb.q(obj);
            xd5Var.L$0 = file;
            xd5Var.label = 1;
            Object objD = a26Var.d(xd5Var);
            Object obj2 = bw2.a;
            return objD == obj2 ? obj2 : objD;
        } catch (IOException e2) {
            if (e2 instanceof mw2) {
                throw e2;
            }
            file.getClass();
            if (!file.exists()) {
                throw cn1.n(file, e2);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw cn1.n(file, e2);
                    }
                    throw cn1.n(file, e2);
                }
                if (file.canWrite()) {
                    throw cn1.n(file, e2);
                }
                throw cn1.n(file, e2);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw cn1.n(file, e2);
                }
                throw cn1.n(file, e2);
            }
            if (file.canWrite()) {
                throw cn1.n(file, e2);
            }
            throw cn1.n(file, e2);
        }
    }

    public static final wv4 N(n3f n3fVar, a26 a26Var, Object obj, l46 l46Var) {
        l46Var.d0(-422486566, n3fVar);
        boolean zH = n3fVar.h();
        s3f s3fVar = n3fVar.a;
        wv4 wv4Var = wv4.c;
        wv4 wv4Var2 = wv4.b;
        wv4 wv4Var3 = wv4.a;
        if (zH) {
            l46Var.f0(-212166497);
            l46Var.r(false);
            if (((Boolean) a26Var.d(obj)).booleanValue()) {
                wv4Var = wv4Var2;
            } else if (!((Boolean) a26Var.d(s3fVar.a())).booleanValue()) {
                wv4Var = wv4Var3;
            }
        } else {
            l46Var.f0(-211886815);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object value = n3fVar.e.getValue();
            if (((Boolean) a26Var.d(s3fVar.a())).booleanValue() || (value != null && ((Boolean) a26Var.d(value)).booleanValue())) {
                e89Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) a26Var.d(obj)).booleanValue()) {
                wv4Var = wv4Var2;
            } else if ((value != null && ((Boolean) a26Var.d(value)).booleanValue()) || !((Boolean) e89Var.getValue()).booleanValue()) {
                wv4Var = wv4Var3;
            }
            l46Var.r(false);
        }
        l46Var.r(false);
        return wv4Var;
    }

    public static final ExtractedText O(zse zseVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = zseVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = zseVar.b;
        extractedText.selectionStart = eue.g(j2);
        extractedText.selectionEnd = eue.f(j2);
        extractedText.flags = !v4e.G(zseVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void P(hia hiaVar, long j2, a26 a26Var, boolean z) {
        MotionEvent motionEventA = hiaVar.a();
        if (motionEventA == null) {
            qc0.j("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
        a26Var.d(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        motionEventA.setAction(action);
    }

    /* JADX WARN: Code duplicated, block: B:233:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:235:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:237:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:239:0x0510  */
    /* JADX WARN: Code duplicated, block: B:241:0x0527  */
    /* JADX WARN: Code duplicated, block: B:243:0x0535  */
    /* JADX WARN: Code duplicated, block: B:245:0x054a  */
    /* JADX WARN: Code duplicated, block: B:247:0x0558  */
    /* JADX WARN: Code duplicated, block: B:249:0x0564  */
    /* JADX WARN: Code duplicated, block: B:251:0x057c  */
    /* JADX WARN: Code duplicated, block: B:266:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:268:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:270:0x05df  */
    /* JADX WARN: Code duplicated, block: B:278:0x060c  */
    /* JADX WARN: Code duplicated, block: B:282:0x0615  */
    /* JADX WARN: Code duplicated, block: B:287:0x0623  */
    /* JADX WARN: Code duplicated, block: B:289:0x0626  */
    /* JADX WARN: Code duplicated, block: B:291:0x0632  */
    /* JADX WARN: Code duplicated, block: B:293:0x0652  */
    /* JADX WARN: Code duplicated, block: B:295:0x0668  */
    /* JADX WARN: Code duplicated, block: B:297:0x0674  */
    /* JADX WARN: Code duplicated, block: B:299:0x068b  */
    /* JADX WARN: Code duplicated, block: B:301:0x069b  */
    /* JADX WARN: Code duplicated, block: B:302:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:305:0x06ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:311:0x071d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:312:0x071f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0743 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x0745  */
    /* JADX WARN: Code duplicated, block: B:319:0x078e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0799  */
    /* JADX WARN: Code duplicated, block: B:323:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:324:0x07bd  */
    public static final void a(n3f n3fVar, a26 a26Var, j09 j09Var, bx4 bx4Var, e45 e45Var, l26 l26Var, n26 n26Var, l46 l46Var, int i2, int i3) {
        int i4;
        n26 n26Var2;
        l46 l46Var2;
        boolean z;
        ood oodVar;
        vv1 vv1Var;
        y6f y6fVar;
        p3f p3fVar;
        vv1 vv1Var2;
        boolean z2;
        boolean z3;
        vv1 vv1Var3;
        y6f y6fVar2;
        p3f p3fVar2;
        g3f g3fVar;
        g3f g3fVar2;
        g3f g3fVar3;
        vv1 vv1Var4;
        boolean z4;
        x3c x3cVar;
        g09 g09Var;
        scd scdVar;
        bx4 bx4Var2;
        j09 vsfVar;
        y6f y6fVar3;
        g09 g09Var2;
        x16 x16Var;
        boolean z5;
        boolean z6;
        scd scdVar2;
        y6f y6fVar4;
        g3f g3fVar4;
        boolean z7;
        g3f g3fVar5;
        g3f g3fVarF;
        boolean zI;
        Object objR;
        e45 e45Var2;
        bx4 bx4Var3;
        boolean zI2;
        Object objR2;
        boolean zH;
        Object objR3;
        Object objR4;
        pz pzVar;
        boolean z8;
        Object objR5;
        Object objR6;
        Object objR7;
        Object objR8;
        Object objR9;
        Object objR10;
        n26 n26Var3;
        wv4 wv4VarN;
        j09 j09Var2 = j09Var;
        n26 n26Var4 = n26Var;
        l46 l46Var3 = l46Var;
        l46Var3.h0(-1310802509);
        if ((i2 & 6) == 0) {
            i4 = (l46Var3.g(n3fVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var3.i(a26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var3.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var3.g(bx4Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= l46Var3.g(e45Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i4 |= l46Var3.i(l26Var) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= (2097152 & i2) == 0 ? l46Var3.g(null) : l46Var3.i(null) ? 1048576 : 524288;
        }
        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= l46Var3.i(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= l46Var3.i(n26Var4) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if (l46Var3.W(i5 & 1, (i5 & 38347923) != 38347922)) {
            vz9 vz9Var = n3fVar.e;
            vz9 vz9Var2 = n3fVar.d;
            s3f s3fVar = n3fVar.a;
            Object value = vz9Var.getValue();
            Object objR11 = l46Var3.R();
            i8c i8cVar = sf2.a;
            if (objR11 == i8cVar) {
                objR11 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR11);
            }
            e89 e89Var = (e89) objR11;
            Object objR12 = l46Var3.R();
            if (objR12 == i8cVar) {
                objR12 = new dz(e89Var);
                l46Var3.p0(objR12);
            }
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            rw4.a(n3fVar, (x16) objR12, l46Var3, i7);
            if (value != null && ((Boolean) a26Var.d(value)).booleanValue()) {
                e89Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) a26Var.d(vz9Var2.getValue())).booleanValue() || ((Boolean) a26Var.d(s3fVar.a())).booleanValue() || ((value != null && ((Boolean) a26Var.d(value)).booleanValue()) || ((((Boolean) e89Var.getValue()).booleanValue() && !pa7.t(s3fVar.a(), vz9Var2.getValue())) || n3fVar.h() || n3fVar.d()))) {
                l46Var3.f0(-273709037);
                int i8 = i7 & 14;
                boolean z9 = ((i8 ^ 6) > 4 && l46Var3.g(n3fVar)) || (i7 & 6) == 4;
                Object objR13 = l46Var3.R();
                if (z9 || objR13 == i8cVar) {
                    objR13 = s3fVar.a();
                    l46Var3.p0(objR13);
                }
                if (n3fVar.h()) {
                    objR13 = s3fVar.a();
                }
                l46Var3.f0(2016262395);
                wv4 wv4VarN2 = N(n3fVar, a26Var, objR13, l46Var3);
                l46Var3.r(false);
                Object value2 = vz9Var2.getValue();
                l46Var3.f0(2016262395);
                wv4 wv4VarN3 = N(n3fVar, a26Var, value2, l46Var3);
                l46Var3.r(false);
                p3f p3fVarE = g21.E(n3fVar, wv4VarN2, wv4VarN3, "EnterExitTransition", l46Var, i8 | 3072);
                l46 l46Var4 = l46Var;
                if (n3fVar.h()) {
                    l46Var4.f0(782538635);
                    l46Var4.r(false);
                } else {
                    l46Var4.f0(782386797);
                    Object value3 = n3fVar.e.getValue();
                    if (value3 == null) {
                        l46Var4.f0(782437481);
                        l46Var4.r(false);
                        wv4VarN = null;
                    } else {
                        l46Var4.f0(782437482);
                        l46Var4.f0(2016262395);
                        wv4VarN = N(n3fVar, a26Var, value3, l46Var4);
                        l46Var4.r(false);
                        l46Var4.r(false);
                    }
                    p3fVarE.r(wv4VarN);
                    l46Var4.r(false);
                }
                boolean zG = l46Var4.g(p3fVarE);
                Object objR14 = l46Var4.R();
                if (zG || objR14 == i8cVar) {
                    objR14 = q1c.f(bx4Var);
                    l46Var4.p0(objR14);
                }
                e89 e89Var2 = (e89) objR14;
                s3f s3fVar2 = p3fVarE.a;
                vz9 vz9Var3 = p3fVarE.d;
                Object objA = s3fVar2.a();
                Object value4 = vz9Var3.getValue();
                wv4 wv4Var = wv4.c;
                wv4 wv4Var2 = wv4.b;
                if (objA == value4 && p3fVarE.a.a() == wv4Var2) {
                    if (p3fVarE.h()) {
                        e89Var2.setValue(bx4Var);
                    } else {
                        e89Var2.setValue(bx4.a);
                    }
                } else if (vz9Var3.getValue() != wv4Var) {
                    e89Var2.setValue(((bx4) e89Var2.getValue()).a(bx4Var));
                }
                bx4 bx4Var4 = (bx4) e89Var2.getValue();
                vz9 vz9Var4 = p3fVarE.d;
                s3f s3fVar3 = p3fVarE.a;
                boolean zG2 = l46Var4.g(p3fVarE);
                Object objR15 = l46Var4.R();
                if (zG2 || objR15 == i8cVar) {
                    objR15 = q1c.f(e45Var);
                    l46Var4.p0(objR15);
                }
                e89 e89Var3 = (e89) objR15;
                if (s3fVar3.a() == vz9Var4.getValue() && s3fVar3.a() == wv4Var2) {
                    l46Var4.f0(-505142498);
                    l46Var4.r(false);
                    if (p3fVarE.h()) {
                        e89Var3.setValue(e45Var);
                    } else {
                        e89Var3.setValue(e45.a);
                    }
                } else if (vz9Var4.getValue() != wv4Var2) {
                    l46Var4.f0(-504838512);
                    x95 x95Var = ((f45) ((e45) e89Var3.getValue())).c.a;
                    x95 x95Var2 = x95Var != null ? new x95(1.0f, x95Var.b) : null;
                    aec aecVar = ((f45) ((e45) e89Var3.getValue())).c.d;
                    aec aecVar2 = aecVar != null ? new aec(1.0f, aecVar.b, aecVar.c) : null;
                    ood oodVar2 = ((f45) ((e45) e89Var3.getValue())).c.b;
                    if (oodVar2 == null) {
                        l46Var4.f0(-504119809);
                        z = false;
                        l46Var4.r(false);
                        oodVar = null;
                    } else {
                        l46Var4.f0(-708998590);
                        Object objR16 = l46Var4.R();
                        if (objR16 == i8cVar) {
                            objR16 = xx.O0;
                            l46Var4.p0(objR16);
                        }
                        ood oodVar3 = new ood(oodVar2.b, (a26) objR16);
                        z = false;
                        l46Var4.r(false);
                        oodVar = oodVar3;
                    }
                    vv1 vv1Var5 = ((f45) ((e45) e89Var3.getValue())).c.c;
                    if (vv1Var5 == null) {
                        l46Var4.f0(-504024174);
                        l46Var4.r(z);
                        vv1Var = null;
                    } else {
                        l46Var4.f0(-708995505);
                        Object objR17 = l46Var4.R();
                        if (objR17 == i8cVar) {
                            objR17 = xx.P0;
                            l46Var4.p0(objR17);
                        }
                        vv1 vv1Var6 = new vv1(vv1Var5.a, (a26) objR17, vv1Var5.c, vv1Var5.d);
                        l46Var4.r(false);
                        vv1Var = vv1Var6;
                    }
                    o3f o3fVar = ((f45) ((e45) e89Var3.getValue())).c;
                    e89Var3.setValue(new f45(new o3f(x95Var2, oodVar, vv1Var, aecVar2, (LinkedHashMap) null, 96)).a(e45Var));
                    l46Var4.r(false);
                } else {
                    l46Var4.f0(-503833306);
                    l46Var4.r(false);
                }
                e45 e45Var3 = (e45) e89Var3.getValue();
                e89 e89VarI = q1c.i(l26Var, l46Var4);
                Object objZ = l26Var.z(s3fVar3.a(), vz9Var4.getValue());
                boolean zG3 = l46Var4.g(p3fVarE) | l46Var4.g(e89VarI);
                Object objR18 = l46Var4.R();
                if (zG3 || objR18 == i8cVar) {
                    objR18 = new hz(p3fVarE, e89VarI, null);
                    l46Var4.p0(objR18);
                }
                e89 e89VarX = uyb.x((l26) objR18, l46Var4, objZ);
                if (s3fVar3.a() == wv4Var && vz9Var4.getValue() == wv4Var && ((Boolean) e89VarX.getValue()).booleanValue()) {
                    l46Var4.f0(-270520625);
                    z8 = false;
                    l46Var4.r(false);
                    j09Var2 = j09Var;
                    n26Var3 = n26Var4;
                } else {
                    l46Var4.f0(-272022668);
                    boolean z10 = i6 == 4;
                    Object objR19 = l46Var4.R();
                    if (z10 || objR19 == i8cVar) {
                        objR19 = new pz(p3fVarE);
                        l46Var4.p0(objR19);
                    }
                    pz pzVar2 = (pz) objR19;
                    scd scdVar3 = pzVar2.c;
                    y6f y6fVar5 = xo1.m;
                    Object objR20 = l46Var4.R();
                    if (objR20 == i8cVar) {
                        objR20 = su3.c;
                        l46Var4.p0(objR20);
                    }
                    x16 x16Var2 = (x16) objR20;
                    l46Var4.f0(-1491182875);
                    l46Var4.r(false);
                    l46Var4.f0(-1491180092);
                    l46Var4.r(false);
                    l46Var4.f0(-31257052);
                    l46Var4.r(false);
                    scdVar3.e(p3fVarE.e.getValue() != null);
                    boolean zI3 = l46Var4.i(scdVar3);
                    Object objR21 = l46Var4.R();
                    if (zI3 || objR21 == i8cVar) {
                        objR21 = new qw4(scdVar3);
                        l46Var4.p0(objR21);
                    }
                    rw4.a(p3fVarE, (x16) objR21, l46Var4, 0);
                    o3f o3fVar2 = ((cx4) bx4Var4).b;
                    f45 f45Var = (f45) e45Var3;
                    o3f o3fVar3 = f45Var.c;
                    o3f o3fVar4 = f45Var.c;
                    boolean zA = faf.a(scdVar3.f, y72.j);
                    o3f o3fVar5 = ((cx4) bx4Var4).b;
                    ood oodVar4 = o3fVar5.b;
                    vv1 vv1Var7 = o3fVar5.c;
                    if (oodVar4 == null && o3fVar4.b == null) {
                        y6fVar = y6fVar5;
                        p3fVar = p3fVarE;
                        vv1Var2 = vv1Var7;
                        if (w67.b(scdVar3.j, 0L)) {
                            z2 = false;
                        }
                        if (vv1Var2 == null || o3fVar4.c != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            l46Var4.f0(1018653691);
                            objR10 = l46Var4.R();
                            if (objR10 == i8cVar) {
                                objR10 = "Built-in slide";
                                l46Var4.p0("Built-in slide");
                            }
                            String str = (String) objR10;
                            vv1Var3 = vv1Var2;
                            y6f y6fVar6 = y6fVar;
                            p3fVar2 = p3fVar;
                            g3f g3fVarF2 = g21.F(p3fVar2, y6fVar6, str, l46Var4, 384, 0);
                            y6fVar2 = y6fVar6;
                            l46Var4.r(false);
                            g3fVar = g3fVarF2;
                        } else {
                            vv1Var3 = vv1Var2;
                            y6fVar2 = y6fVar;
                            p3fVar2 = p3fVar;
                            l46Var4.f0(1018759494);
                            l46Var4.r(false);
                            g3fVar = null;
                        }
                        if (z3) {
                            l46Var4.f0(1018851285);
                            y6f y6fVar7 = xo1.n;
                            objR9 = l46Var4.R();
                            if (objR9 == i8cVar) {
                                objR9 = "Built-in shrink/expand";
                                l46Var4.p0("Built-in shrink/expand");
                            }
                            g3f g3fVarF3 = g21.F(p3fVar2, y6fVar7, (String) objR9, l46Var4, 384, 0);
                            l46Var4.r(false);
                            g3fVar2 = g3fVarF3;
                        } else {
                            l46Var4.f0(1018962109);
                            l46Var4.r(false);
                            g3fVar2 = null;
                        }
                        if (z3) {
                            l46Var4.f0(1019035735);
                            objR8 = l46Var4.R();
                            if (objR8 == i8cVar) {
                                objR8 = "Built-in InterruptionHandlingOffset";
                                l46Var4.p0("Built-in InterruptionHandlingOffset");
                            }
                            g3f g3fVarF4 = g21.F(p3fVar2, y6fVar2, (String) objR8, l46Var4, 384, 0);
                            l46Var4.r(false);
                            g3fVar3 = g3fVarF4;
                        } else {
                            l46Var4.f0(1019206141);
                            l46Var4.r(false);
                            g3fVar3 = null;
                        }
                        z4 = (vv1Var3 == null && !vv1Var3.d) || !(((vv1Var4 = o3fVar4.c) == null || vv1Var4.d) && z3);
                        x3cVar = s82.e;
                        g09Var = g09.a;
                        if (zA) {
                            scdVar = scdVar3;
                            bx4Var2 = bx4Var4;
                            l46Var4.f0(1020031362);
                            l46Var4.r(false);
                            vsfVar = g09Var;
                        } else {
                            l46Var4.f0(1019733235);
                            y6f y6fVar8 = new y6f(xx.X, new w82(x3cVar));
                            objR7 = l46Var4.R();
                            if (objR7 == i8cVar) {
                                objR7 = "Built-in veil";
                                l46Var4.p0("Built-in veil");
                            }
                            vsfVar = new vsf(p3fVar2, g21.F(p3fVar2, y6fVar8, (String) objR7, l46Var4, 384, 0), bx4Var4, e45Var3, scdVar3);
                            bx4Var2 = bx4Var4;
                            scdVar = scdVar3;
                            l46Var4.r(false);
                        }
                        o3f o3fVar6 = ((f45) e45Var3).c;
                        y6fVar3 = xo1.g;
                        if (o3fVar5.a == null || o3fVar6.a != null) {
                            g09Var2 = g09Var;
                            x16Var = x16Var2;
                        } else {
                            g09Var2 = g09Var;
                            x16Var = x16Var2;
                            z5 = scdVar.g != 1.0f;
                            if (o3fVar5.d != null && o3fVar6.d == null && scdVar.h == 1.0f) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (z5) {
                                l46Var4.f0(-1511865571);
                                objR6 = l46Var4.R();
                                if (objR6 == i8cVar) {
                                    objR6 = "Built-in alpha";
                                    l46Var4.p0("Built-in alpha");
                                }
                                scd scdVar4 = scdVar;
                                y6fVar4 = y6fVar3;
                                scdVar2 = scdVar4;
                                g3f g3fVarF5 = g21.F(p3fVar2, y6fVar4, (String) objR6, l46Var4, 384, 0);
                                l46Var4.r(false);
                                g3fVar4 = g3fVarF5;
                            } else {
                                scdVar2 = scdVar;
                                y6fVar4 = y6fVar3;
                                l46Var4.f0(-1511696126);
                                l46Var4.r(false);
                                g3fVar4 = null;
                            }
                            if (z6 != 0) {
                                l46Var4.f0(-1511628483);
                                objR5 = l46Var4.R();
                                if (objR5 == i8cVar) {
                                    objR5 = "Built-in scale";
                                    l46Var4.p0("Built-in scale");
                                }
                                g3f g3fVarF6 = g21.F(p3fVar2, y6fVar4, (String) objR5, l46Var4, 384, 0);
                                z7 = false;
                                l46Var4.r(false);
                                g3fVar5 = g3fVarF6;
                            } else {
                                z7 = false;
                                l46Var4.f0(-1511459038);
                                l46Var4.r(false);
                                g3fVar5 = null;
                            }
                            if (z6) {
                                l46Var4.f0(-1511381382);
                                g3fVarF = g21.F(p3fVar2, rw4.a, "TransformOriginInterruptionHandling", l46Var4, 384, 0);
                                l46Var4.r(z7);
                            } else {
                                l46Var4.f0(-1511209054);
                                l46Var4.r(z7);
                                g3fVarF = null;
                            }
                            zI = l46Var4.i(g3fVar4) | l46Var4.g(bx4Var2) | l46Var4.g(e45Var3) | l46Var4.i(scdVar2) | l46Var4.i(g3fVar5) | l46Var4.g(p3fVar2) | l46Var4.i(g3fVarF);
                            objR = l46Var4.R();
                            if (!zI || objR == i8cVar) {
                                e45Var2 = e45Var3;
                                bx4Var3 = bx4Var2;
                                objR = new yv4(g3fVar4, scdVar2, g3fVar5, p3fVar2, bx4Var3, e45Var2, g3fVarF);
                                l46Var4.p0(objR);
                            } else {
                                e45Var2 = e45Var3;
                                bx4Var3 = bx4Var2;
                            }
                            yv4 yv4Var = (yv4) objR;
                            c1b c1bVar = tu3.a;
                            zI2 = l46Var4.i(scdVar2);
                            objR2 = l46Var4.R();
                            if (zI2 || objR2 == i8cVar) {
                                objR2 = new gw4(scdVar2);
                                l46Var4.p0(objR2);
                            }
                            q09 q09Var = new q09((x16) objR2);
                            g09 g09Var3 = g09Var2;
                            j09 j09VarD = q09Var.D(g09Var3);
                            zH = l46Var4.h(z4) | l46Var4.g(x16Var);
                            objR3 = l46Var4.R();
                            if (zH || objR3 == i8cVar) {
                                objR3 = new hw4(x16Var, z4);
                                l46Var4.p0(objR3);
                            }
                            j09 j09VarD2 = j09VarD.D(bzd.x(g09Var3, (a26) objR3)).D(new xv4(p3fVar2, g3fVar2, g3fVar3, g3fVar, bx4Var3, e45Var2, scdVar2, x16Var, yv4Var)).D(vsfVar);
                            l46Var4.f0(-1255657861);
                            l46Var4.r(false);
                            j09Var2 = j09Var;
                            j09 j09VarD3 = j09Var2.D(j09VarD2.D(g09Var3));
                            objR4 = l46Var4.R();
                            if (objR4 == i8cVar) {
                                pzVar = pzVar2;
                                objR4 = new wy(pzVar);
                                l46Var4.p0(objR4);
                            } else {
                                pzVar = pzVar2;
                            }
                            wy wyVar = (wy) objR4;
                            int iHashCode = Long.hashCode(l46Var4.T);
                            u8a u8aVarM = l46Var4.m();
                            j09 j09VarJ = J(l46Var4, j09VarD3);
                            lf2.q.getClass();
                            l46Var4.j0();
                            if (l46Var4.S) {
                                l46Var4.l(LayoutNode.h1);
                            } else {
                                l46Var4.s0();
                            }
                            dec.l(hj6.z, l46Var4, wyVar);
                            dec.l(hj6.y, l46Var4, u8aVarM);
                            dec.h(l46Var4, Integer.valueOf(iHashCode));
                            dec.k(l46Var4);
                            dec.l(hj6.x, l46Var4, j09VarJ);
                            n26 n26Var5 = n26Var;
                            n26Var5.m(pzVar, l46Var4, Integer.valueOf((i5 >> 21) & 112));
                            l46Var4.r(true);
                            z8 = false;
                            l46Var4.r(false);
                            n26Var3 = n26Var5;
                        }
                        if (o3fVar5.d != null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (z5) {
                            l46Var4.f0(-1511865571);
                            objR6 = l46Var4.R();
                            if (objR6 == i8cVar) {
                                objR6 = "Built-in alpha";
                                l46Var4.p0("Built-in alpha");
                            }
                            scd scdVar5 = scdVar;
                            y6fVar4 = y6fVar3;
                            scdVar2 = scdVar5;
                            g3f g3fVarF7 = g21.F(p3fVar2, y6fVar4, (String) objR6, l46Var4, 384, 0);
                            l46Var4.r(false);
                            g3fVar4 = g3fVarF7;
                        } else {
                            scdVar2 = scdVar;
                            y6fVar4 = y6fVar3;
                            l46Var4.f0(-1511696126);
                            l46Var4.r(false);
                            g3fVar4 = null;
                        }
                        if (z6 != 0) {
                            l46Var4.f0(-1511628483);
                            objR5 = l46Var4.R();
                            if (objR5 == i8cVar) {
                                objR5 = "Built-in scale";
                                l46Var4.p0("Built-in scale");
                            }
                            g3f g3fVarF8 = g21.F(p3fVar2, y6fVar4, (String) objR5, l46Var4, 384, 0);
                            z7 = false;
                            l46Var4.r(false);
                            g3fVar5 = g3fVarF8;
                        } else {
                            z7 = false;
                            l46Var4.f0(-1511459038);
                            l46Var4.r(false);
                            g3fVar5 = null;
                        }
                        if (z6) {
                            l46Var4.f0(-1511381382);
                            g3fVarF = g21.F(p3fVar2, rw4.a, "TransformOriginInterruptionHandling", l46Var4, 384, 0);
                            l46Var4.r(z7);
                        } else {
                            l46Var4.f0(-1511209054);
                            l46Var4.r(z7);
                            g3fVarF = null;
                        }
                        zI = l46Var4.i(g3fVar4) | l46Var4.g(bx4Var2) | l46Var4.g(e45Var3) | l46Var4.i(scdVar2) | l46Var4.i(g3fVar5) | l46Var4.g(p3fVar2) | l46Var4.i(g3fVarF);
                        objR = l46Var4.R();
                        if (zI) {
                            e45Var2 = e45Var3;
                            bx4Var3 = bx4Var2;
                            objR = new yv4(g3fVar4, scdVar2, g3fVar5, p3fVar2, bx4Var3, e45Var2, g3fVarF);
                            l46Var4.p0(objR);
                        } else {
                            e45Var2 = e45Var3;
                            bx4Var3 = bx4Var2;
                            objR = new yv4(g3fVar4, scdVar2, g3fVar5, p3fVar2, bx4Var3, e45Var2, g3fVarF);
                            l46Var4.p0(objR);
                        }
                        yv4 yv4Var2 = (yv4) objR;
                        c1b c1bVar2 = tu3.a;
                        zI2 = l46Var4.i(scdVar2);
                        objR2 = l46Var4.R();
                        if (zI2) {
                            objR2 = new gw4(scdVar2);
                            l46Var4.p0(objR2);
                        } else {
                            objR2 = new gw4(scdVar2);
                            l46Var4.p0(objR2);
                        }
                        q09 q09Var2 = new q09((x16) objR2);
                        g09 g09Var4 = g09Var2;
                        j09 j09VarD4 = q09Var2.D(g09Var4);
                        zH = l46Var4.h(z4) | l46Var4.g(x16Var);
                        objR3 = l46Var4.R();
                        if (zH) {
                            objR3 = new hw4(x16Var, z4);
                            l46Var4.p0(objR3);
                        } else {
                            objR3 = new hw4(x16Var, z4);
                            l46Var4.p0(objR3);
                        }
                        j09 j09VarD5 = j09VarD4.D(bzd.x(g09Var4, (a26) objR3)).D(new xv4(p3fVar2, g3fVar2, g3fVar3, g3fVar, bx4Var3, e45Var2, scdVar2, x16Var, yv4Var2)).D(vsfVar);
                        l46Var4.f0(-1255657861);
                        l46Var4.r(false);
                        j09Var2 = j09Var;
                        j09 j09VarD6 = j09Var2.D(j09VarD5.D(g09Var4));
                        objR4 = l46Var4.R();
                        if (objR4 == i8cVar) {
                            pzVar = pzVar2;
                            objR4 = new wy(pzVar);
                            l46Var4.p0(objR4);
                        } else {
                            pzVar = pzVar2;
                        }
                        wy wyVar2 = (wy) objR4;
                        int iHashCode2 = Long.hashCode(l46Var4.T);
                        u8a u8aVarM2 = l46Var4.m();
                        j09 j09VarJ2 = J(l46Var4, j09VarD6);
                        lf2.q.getClass();
                        l46Var4.j0();
                        if (l46Var4.S) {
                            l46Var4.l(LayoutNode.h1);
                        } else {
                            l46Var4.s0();
                        }
                        dec.l(hj6.z, l46Var4, wyVar2);
                        dec.l(hj6.y, l46Var4, u8aVarM2);
                        dec.h(l46Var4, Integer.valueOf(iHashCode2));
                        dec.k(l46Var4);
                        dec.l(hj6.x, l46Var4, j09VarJ2);
                        n26 n26Var6 = n26Var;
                        n26Var6.m(pzVar, l46Var4, Integer.valueOf((i5 >> 21) & 112));
                        l46Var4.r(true);
                        z8 = false;
                        l46Var4.r(false);
                        n26Var3 = n26Var6;
                    } else {
                        y6fVar = y6fVar5;
                        p3fVar = p3fVarE;
                        vv1Var2 = vv1Var7;
                    }
                    z2 = true;
                    if (vv1Var2 == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (z2) {
                        l46Var4.f0(1018653691);
                        objR10 = l46Var4.R();
                        if (objR10 == i8cVar) {
                            objR10 = "Built-in slide";
                            l46Var4.p0("Built-in slide");
                        }
                        String str2 = (String) objR10;
                        vv1Var3 = vv1Var2;
                        y6f y6fVar9 = y6fVar;
                        p3fVar2 = p3fVar;
                        g3f g3fVarF9 = g21.F(p3fVar2, y6fVar9, str2, l46Var4, 384, 0);
                        y6fVar2 = y6fVar9;
                        l46Var4.r(false);
                        g3fVar = g3fVarF9;
                    } else {
                        vv1Var3 = vv1Var2;
                        y6fVar2 = y6fVar;
                        p3fVar2 = p3fVar;
                        l46Var4.f0(1018759494);
                        l46Var4.r(false);
                        g3fVar = null;
                    }
                    if (z3) {
                        l46Var4.f0(1018851285);
                        y6f y6fVar10 = xo1.n;
                        objR9 = l46Var4.R();
                        if (objR9 == i8cVar) {
                            objR9 = "Built-in shrink/expand";
                            l46Var4.p0("Built-in shrink/expand");
                        }
                        g3f g3fVarF10 = g21.F(p3fVar2, y6fVar10, (String) objR9, l46Var4, 384, 0);
                        l46Var4.r(false);
                        g3fVar2 = g3fVarF10;
                    } else {
                        l46Var4.f0(1018962109);
                        l46Var4.r(false);
                        g3fVar2 = null;
                    }
                    if (z3) {
                        l46Var4.f0(1019035735);
                        objR8 = l46Var4.R();
                        if (objR8 == i8cVar) {
                            objR8 = "Built-in InterruptionHandlingOffset";
                            l46Var4.p0("Built-in InterruptionHandlingOffset");
                        }
                        g3f g3fVarF11 = g21.F(p3fVar2, y6fVar2, (String) objR8, l46Var4, 384, 0);
                        l46Var4.r(false);
                        g3fVar3 = g3fVarF11;
                    } else {
                        l46Var4.f0(1019206141);
                        l46Var4.r(false);
                        g3fVar3 = null;
                    }
                    if (vv1Var3 == null) {
                    }
                    x3cVar = s82.e;
                    g09Var = g09.a;
                    if (zA) {
                        l46Var4.f0(1019733235);
                        y6f y6fVar11 = new y6f(xx.X, new w82(x3cVar));
                        objR7 = l46Var4.R();
                        if (objR7 == i8cVar) {
                            objR7 = "Built-in veil";
                            l46Var4.p0("Built-in veil");
                        }
                        vsfVar = new vsf(p3fVar2, g21.F(p3fVar2, y6fVar11, (String) objR7, l46Var4, 384, 0), bx4Var4, e45Var3, scdVar3);
                        bx4Var2 = bx4Var4;
                        scdVar = scdVar3;
                        l46Var4.r(false);
                    } else {
                        scdVar = scdVar3;
                        bx4Var2 = bx4Var4;
                        l46Var4.f0(1020031362);
                        l46Var4.r(false);
                        vsfVar = g09Var;
                    }
                    o3f o3fVar7 = ((f45) e45Var3).c;
                    y6fVar3 = xo1.g;
                    if (o3fVar5.a == null) {
                        g09Var2 = g09Var;
                        x16Var = x16Var2;
                    } else {
                        g09Var2 = g09Var;
                        x16Var = x16Var2;
                    }
                    if (o3fVar5.d != null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (z5) {
                        l46Var4.f0(-1511865571);
                        objR6 = l46Var4.R();
                        if (objR6 == i8cVar) {
                            objR6 = "Built-in alpha";
                            l46Var4.p0("Built-in alpha");
                        }
                        scd scdVar6 = scdVar;
                        y6fVar4 = y6fVar3;
                        scdVar2 = scdVar6;
                        g3f g3fVarF12 = g21.F(p3fVar2, y6fVar4, (String) objR6, l46Var4, 384, 0);
                        l46Var4.r(false);
                        g3fVar4 = g3fVarF12;
                    } else {
                        scdVar2 = scdVar;
                        y6fVar4 = y6fVar3;
                        l46Var4.f0(-1511696126);
                        l46Var4.r(false);
                        g3fVar4 = null;
                    }
                    if (z6 != 0) {
                        l46Var4.f0(-1511628483);
                        objR5 = l46Var4.R();
                        if (objR5 == i8cVar) {
                            objR5 = "Built-in scale";
                            l46Var4.p0("Built-in scale");
                        }
                        g3f g3fVarF13 = g21.F(p3fVar2, y6fVar4, (String) objR5, l46Var4, 384, 0);
                        z7 = false;
                        l46Var4.r(false);
                        g3fVar5 = g3fVarF13;
                    } else {
                        z7 = false;
                        l46Var4.f0(-1511459038);
                        l46Var4.r(false);
                        g3fVar5 = null;
                    }
                    if (z6) {
                        l46Var4.f0(-1511381382);
                        g3fVarF = g21.F(p3fVar2, rw4.a, "TransformOriginInterruptionHandling", l46Var4, 384, 0);
                        l46Var4.r(z7);
                    } else {
                        l46Var4.f0(-1511209054);
                        l46Var4.r(z7);
                        g3fVarF = null;
                    }
                    zI = l46Var4.i(g3fVar4) | l46Var4.g(bx4Var2) | l46Var4.g(e45Var3) | l46Var4.i(scdVar2) | l46Var4.i(g3fVar5) | l46Var4.g(p3fVar2) | l46Var4.i(g3fVarF);
                    objR = l46Var4.R();
                    if (zI) {
                        e45Var2 = e45Var3;
                        bx4Var3 = bx4Var2;
                        objR = new yv4(g3fVar4, scdVar2, g3fVar5, p3fVar2, bx4Var3, e45Var2, g3fVarF);
                        l46Var4.p0(objR);
                    } else {
                        e45Var2 = e45Var3;
                        bx4Var3 = bx4Var2;
                        objR = new yv4(g3fVar4, scdVar2, g3fVar5, p3fVar2, bx4Var3, e45Var2, g3fVarF);
                        l46Var4.p0(objR);
                    }
                    yv4 yv4Var3 = (yv4) objR;
                    c1b c1bVar3 = tu3.a;
                    zI2 = l46Var4.i(scdVar2);
                    objR2 = l46Var4.R();
                    if (zI2) {
                        objR2 = new gw4(scdVar2);
                        l46Var4.p0(objR2);
                    } else {
                        objR2 = new gw4(scdVar2);
                        l46Var4.p0(objR2);
                    }
                    q09 q09Var3 = new q09((x16) objR2);
                    g09 g09Var5 = g09Var2;
                    j09 j09VarD7 = q09Var3.D(g09Var5);
                    zH = l46Var4.h(z4) | l46Var4.g(x16Var);
                    objR3 = l46Var4.R();
                    if (zH) {
                        objR3 = new hw4(x16Var, z4);
                        l46Var4.p0(objR3);
                    } else {
                        objR3 = new hw4(x16Var, z4);
                        l46Var4.p0(objR3);
                    }
                    j09 j09VarD8 = j09VarD7.D(bzd.x(g09Var5, (a26) objR3)).D(new xv4(p3fVar2, g3fVar2, g3fVar3, g3fVar, bx4Var3, e45Var2, scdVar2, x16Var, yv4Var3)).D(vsfVar);
                    l46Var4.f0(-1255657861);
                    l46Var4.r(false);
                    j09Var2 = j09Var;
                    j09 j09VarD9 = j09Var2.D(j09VarD8.D(g09Var5));
                    objR4 = l46Var4.R();
                    if (objR4 == i8cVar) {
                        pzVar = pzVar2;
                        objR4 = new wy(pzVar);
                        l46Var4.p0(objR4);
                    } else {
                        pzVar = pzVar2;
                    }
                    wy wyVar3 = (wy) objR4;
                    int iHashCode3 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM3 = l46Var4.m();
                    j09 j09VarJ3 = J(l46Var4, j09VarD9);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(LayoutNode.h1);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, wyVar3);
                    dec.l(hj6.y, l46Var4, u8aVarM3);
                    dec.h(l46Var4, Integer.valueOf(iHashCode3));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ3);
                    n26 n26Var7 = n26Var;
                    n26Var7.m(pzVar, l46Var4, Integer.valueOf((i5 >> 21) & 112));
                    l46Var4.r(true);
                    z8 = false;
                    l46Var4.r(false);
                    n26Var3 = n26Var7;
                }
                l46Var4.r(z8);
                l46Var2 = l46Var4;
                n26Var2 = n26Var3;
            } else {
                l46Var3.f0(-270514673);
                l46Var3.r(false);
                l46Var2 = l46Var3;
                n26Var2 = n26Var4;
            }
        } else {
            l46Var3.Z();
            l46Var2 = l46Var3;
            n26Var2 = n26Var4;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ez(n3fVar, a26Var, j09Var2, bx4Var, e45Var, l26Var, n26Var2, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void b(d92 d92Var, boolean z, j09 j09Var, bx4 bx4Var, e45 e45Var, String str, n26 n26Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        bx4 bx4Var2;
        int i6;
        int i7;
        e45 e45Var2;
        int i8;
        int i9;
        String str2;
        int i10;
        n26 n26Var2;
        boolean z2;
        e45 e45Var3;
        j09 j09Var3;
        String str3;
        ojb ojbVarV;
        bx4 bx4VarA;
        e45 e45VarA;
        Object objR;
        int i11;
        l46Var.h0(1799879339);
        if ((i2 & 48) == 0) {
            i4 = (l46Var.h(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    bx4Var2 = bx4Var;
                    if (l46Var.g(bx4Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        e45Var2 = e45Var;
                        if (l46Var.g(e45Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            str2 = str;
                            if (l46Var.g(str2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i4 |= i10;
                        }
                        if ((1572864 & i2) == 0) {
                            n26Var2 = n26Var;
                            if (l46Var.i(n26Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        } else {
                            n26Var2 = n26Var;
                        }
                        if ((599185 & i4) != 599184) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (l46Var.W(i4 & 1, z2)) {
                            if (i12 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i5 != 0) {
                                bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                            } else {
                                bx4VarA = bx4Var2;
                            }
                            if (i7 != 0) {
                                e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                            } else {
                                e45VarA = e45Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            p3f p3fVarI0 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = xx.z;
                                l46Var.p0(objR);
                            }
                            e(p3fVarI0, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                            e45Var3 = e45VarA;
                            bx4Var2 = bx4VarA;
                            str3 = str2;
                            j09Var3 = j09Var2;
                        } else {
                            l46Var.Z();
                            e45Var3 = e45Var2;
                            j09Var3 = j09Var2;
                            str3 = str2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    str2 = str;
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI1 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.z;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI1, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 24576;
                e45Var2 = e45Var;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI2 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.z;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI2, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 196608;
                str2 = str;
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI3 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.z;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI3, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 3072;
            bx4Var2 = bx4Var;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    e45Var2 = e45Var;
                    if (l46Var.g(e45Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI4 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.z;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI4, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 196608;
                str2 = str;
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI5 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.z;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI5, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 24576;
            e45Var2 = e45Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI6 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.z;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI6, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 196608;
            str2 = str;
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI7 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.z;
                    l46Var.p0(objR);
                }
                e(p3fVarI7, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                bx4Var2 = bx4Var;
                if (l46Var.g(bx4Var2)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    e45Var2 = e45Var;
                    if (l46Var.g(e45Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI8 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.z;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI8, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 196608;
                str2 = str;
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI9 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.z;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI9, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 24576;
            e45Var2 = e45Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI10 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.z;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI10, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 196608;
            str2 = str;
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI11 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.z;
                    l46Var.p0(objR);
                }
                e(p3fVarI11, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 3072;
        bx4Var2 = bx4Var;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                e45Var2 = e45Var;
                if (l46Var.g(e45Var2)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI12 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.z;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI12, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 196608;
            str2 = str;
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI13 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.z;
                    l46Var.p0(objR);
                }
                e(p3fVarI13, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 24576;
        e45Var2 = e45Var;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((196608 & i2) == 0) {
                str2 = str;
                if (l46Var.g(str2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI14 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.z;
                    l46Var.p0(objR);
                }
                e(p3fVarI14, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 196608;
        str2 = str;
        if ((1572864 & i2) == 0) {
            n26Var2 = n26Var;
            if (l46Var.i(n26Var2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        } else {
            n26Var2 = n26Var;
        }
        if ((599185 & i4) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i4 & 1, z2)) {
            if (i12 != 0) {
                j09Var2 = g09.a;
            }
            if (i5 != 0) {
                bx4VarA = rw4.f(null, 3).a(rw4.e(null, null, 15));
            } else {
                bx4VarA = bx4Var2;
            }
            if (i7 != 0) {
                e45VarA = rw4.g(null, 3).a(rw4.l(null, null, 15));
            } else {
                e45VarA = e45Var2;
            }
            if (i9 != 0) {
                str2 = "AnimatedVisibility";
            }
            p3f p3fVarI15 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
            objR = l46Var.R();
            if (objR == sf2.a) {
                objR = xx.z;
                l46Var.p0(objR);
            }
            e(p3fVarI15, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
            e45Var3 = e45VarA;
            bx4Var2 = bx4VarA;
            str3 = str2;
            j09Var3 = j09Var2;
        } else {
            l46Var.Z();
            e45Var3 = e45Var2;
            j09Var3 = j09Var2;
            str3 = str2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kz(d92Var, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void c(u7c u7cVar, boolean z, j09 j09Var, bx4 bx4Var, e45 e45Var, String str, n26 n26Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        bx4 bx4Var2;
        int i6;
        int i7;
        e45 e45Var2;
        int i8;
        int i9;
        String str2;
        int i10;
        n26 n26Var2;
        boolean z2;
        e45 e45Var3;
        j09 j09Var3;
        String str3;
        ojb ojbVarV;
        bx4 bx4VarA;
        e45 e45VarA;
        Object objR;
        int i11;
        l46Var.h0(234057107);
        if ((i2 & 48) == 0) {
            i4 = (l46Var.h(z) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    bx4Var2 = bx4Var;
                    if (l46Var.g(bx4Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        e45Var2 = e45Var;
                        if (l46Var.g(e45Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            str2 = str;
                            if (l46Var.g(str2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i4 |= i10;
                        }
                        if ((1572864 & i2) == 0) {
                            n26Var2 = n26Var;
                            if (l46Var.i(n26Var2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        } else {
                            n26Var2 = n26Var;
                        }
                        if ((599185 & i4) != 599184) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (l46Var.W(i4 & 1, z2)) {
                            if (i12 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i5 != 0) {
                                bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                            } else {
                                bx4VarA = bx4Var2;
                            }
                            if (i7 != 0) {
                                e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                            } else {
                                e45VarA = e45Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            p3f p3fVarI0 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = xx.y;
                                l46Var.p0(objR);
                            }
                            e(p3fVarI0, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                            e45Var3 = e45VarA;
                            bx4Var2 = bx4VarA;
                            str3 = str2;
                            j09Var3 = j09Var2;
                        } else {
                            l46Var.Z();
                            e45Var3 = e45Var2;
                            j09Var3 = j09Var2;
                            str3 = str2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    str2 = str;
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI1 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.y;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI1, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 24576;
                e45Var2 = e45Var;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI2 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.y;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI2, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 196608;
                str2 = str;
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI3 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.y;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI3, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 3072;
            bx4Var2 = bx4Var;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    e45Var2 = e45Var;
                    if (l46Var.g(e45Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI4 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.y;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI4, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 196608;
                str2 = str;
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI5 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.y;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI5, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 24576;
            e45Var2 = e45Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI6 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.y;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI6, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 196608;
            str2 = str;
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI7 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.y;
                    l46Var.p0(objR);
                }
                e(p3fVarI7, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                bx4Var2 = bx4Var;
                if (l46Var.g(bx4Var2)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    e45Var2 = e45Var;
                    if (l46Var.g(e45Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    if ((1572864 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((599185 & i4) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI8 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.y;
                            l46Var.p0(objR);
                        }
                        e(p3fVarI8, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                        e45Var3 = e45VarA;
                        bx4Var2 = bx4VarA;
                        str3 = str2;
                        j09Var3 = j09Var2;
                    } else {
                        l46Var.Z();
                        e45Var3 = e45Var2;
                        j09Var3 = j09Var2;
                        str3 = str2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 196608;
                str2 = str;
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI9 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.y;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI9, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 24576;
            e45Var2 = e45Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI10 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.y;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI10, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 196608;
            str2 = str;
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI11 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.y;
                    l46Var.p0(objR);
                }
                e(p3fVarI11, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 3072;
        bx4Var2 = bx4Var;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                e45Var2 = e45Var;
                if (l46Var.g(e45Var2)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                if ((1572864 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((599185 & i4) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI12 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.y;
                        l46Var.p0(objR);
                    }
                    e(p3fVarI12, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                    e45Var3 = e45VarA;
                    bx4Var2 = bx4VarA;
                    str3 = str2;
                    j09Var3 = j09Var2;
                } else {
                    l46Var.Z();
                    e45Var3 = e45Var2;
                    j09Var3 = j09Var2;
                    str3 = str2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
                }
            }
            i4 |= 196608;
            str2 = str;
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI13 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.y;
                    l46Var.p0(objR);
                }
                e(p3fVarI13, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 24576;
        e45Var2 = e45Var;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((196608 & i2) == 0) {
                str2 = str;
                if (l46Var.g(str2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            if ((1572864 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((599185 & i4) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI14 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.y;
                    l46Var.p0(objR);
                }
                e(p3fVarI14, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
                e45Var3 = e45VarA;
                bx4Var2 = bx4VarA;
                str3 = str2;
                j09Var3 = j09Var2;
            } else {
                l46Var.Z();
                e45Var3 = e45Var2;
                j09Var3 = j09Var2;
                str3 = str2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
            }
        }
        i4 |= 196608;
        str2 = str;
        if ((1572864 & i2) == 0) {
            n26Var2 = n26Var;
            if (l46Var.i(n26Var2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        } else {
            n26Var2 = n26Var;
        }
        if ((599185 & i4) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i4 & 1, z2)) {
            if (i12 != 0) {
                j09Var2 = g09.a;
            }
            if (i5 != 0) {
                bx4VarA = rw4.f(null, 3).a(rw4.b(null, null, 15));
            } else {
                bx4VarA = bx4Var2;
            }
            if (i7 != 0) {
                e45VarA = rw4.g(null, 3).a(rw4.i(null, null, 15));
            } else {
                e45VarA = e45Var2;
            }
            if (i9 != 0) {
                str2 = "AnimatedVisibility";
            }
            p3f p3fVarI15 = g21.i0(Boolean.valueOf(z), str2, l46Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
            objR = l46Var.R();
            if (objR == sf2.a) {
                objR = xx.y;
                l46Var.p0(objR);
            }
            e(p3fVarI15, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016), 32);
            e45Var3 = e45VarA;
            bx4Var2 = bx4VarA;
            str3 = str2;
            j09Var3 = j09Var2;
        } else {
            l46Var.Z();
            e45Var3 = e45Var2;
            j09Var3 = j09Var2;
            str3 = str2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jz(u7cVar, z, j09Var3, bx4Var2, e45Var3, str3, n26Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:56:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void d(boolean z, j09 j09Var, bx4 bx4Var, e45 e45Var, String str, n26 n26Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        bx4 bx4Var2;
        int i6;
        int i7;
        e45 e45Var2;
        int i8;
        int i9;
        String str2;
        int i10;
        n26 n26Var2;
        boolean z2;
        bx4 bx4VarA;
        e45 e45VarA;
        String str3;
        ojb ojbVarV;
        Object objR;
        int i11;
        l46Var.h0(-1448730565);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    bx4Var2 = bx4Var;
                    if (l46Var.g(bx4Var2)) {
                        i6 = 256;
                    } else {
                        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        e45Var2 = e45Var;
                        if (l46Var.g(e45Var2)) {
                            i8 = 2048;
                        } else {
                            i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            str2 = str;
                            if (l46Var.g(str2)) {
                                i10 = 16384;
                            } else {
                                i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                            }
                            i4 |= i10;
                        }
                        if ((196608 & i2) == 0) {
                            n26Var2 = n26Var;
                            if (l46Var.i(n26Var2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i4 |= i11;
                        } else {
                            n26Var2 = n26Var;
                        }
                        if ((74899 & i4) != 74898) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (l46Var.W(i4 & 1, z2)) {
                            if (i12 != 0) {
                                j09Var2 = g09.a;
                            }
                            if (i5 != 0) {
                                bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                            } else {
                                bx4VarA = bx4Var2;
                            }
                            if (i7 != 0) {
                                e45VarA = rw4.k(15).a(rw4.g(null, 3));
                            } else {
                                e45VarA = e45Var2;
                            }
                            if (i9 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            p3f p3fVarI0 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = xx.x;
                                l46Var.p0(objR);
                            }
                            int i13 = i4 << 3;
                            e(p3fVarI0, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016), 32);
                        } else {
                            l46Var.Z();
                            bx4VarA = bx4Var2;
                            e45VarA = e45Var2;
                        }
                        str3 = str2;
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                        }
                    }
                    i4 |= 24576;
                    str2 = str;
                    if ((196608 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.k(15).a(rw4.g(null, 3));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI1 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.x;
                            l46Var.p0(objR);
                        }
                        int i14 = i4 << 3;
                        e(p3fVarI1, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i14 & 896) | 48 | (i14 & 7168) | (57344 & i14) | (i14 & 3670016), 32);
                    } else {
                        l46Var.Z();
                        bx4VarA = bx4Var2;
                        e45VarA = e45Var2;
                    }
                    str3 = str2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 3072;
                e45Var2 = e45Var;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.k(15).a(rw4.g(null, 3));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI2 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.x;
                            l46Var.p0(objR);
                        }
                        int i15 = i4 << 3;
                        e(p3fVarI2, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i15 & 896) | 48 | (i15 & 7168) | (57344 & i15) | (i15 & 3670016), 32);
                    } else {
                        l46Var.Z();
                        bx4VarA = bx4Var2;
                        e45VarA = e45Var2;
                    }
                    str3 = str2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                if ((196608 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.k(15).a(rw4.g(null, 3));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI3 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.x;
                        l46Var.p0(objR);
                    }
                    int i16 = i4 << 3;
                    e(p3fVarI3, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i16 & 896) | 48 | (i16 & 7168) | (57344 & i16) | (i16 & 3670016), 32);
                } else {
                    l46Var.Z();
                    bx4VarA = bx4Var2;
                    e45VarA = e45Var2;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                }
            }
            i4 |= 384;
            bx4Var2 = bx4Var;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    e45Var2 = e45Var;
                    if (l46Var.g(e45Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.k(15).a(rw4.g(null, 3));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI4 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.x;
                            l46Var.p0(objR);
                        }
                        int i17 = i4 << 3;
                        e(p3fVarI4, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i17 & 3670016), 32);
                    } else {
                        l46Var.Z();
                        bx4VarA = bx4Var2;
                        e45VarA = e45Var2;
                    }
                    str3 = str2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                if ((196608 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.k(15).a(rw4.g(null, 3));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI5 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.x;
                        l46Var.p0(objR);
                    }
                    int i18 = i4 << 3;
                    e(p3fVarI5, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i18 & 896) | 48 | (i18 & 7168) | (57344 & i18) | (i18 & 3670016), 32);
                } else {
                    l46Var.Z();
                    bx4VarA = bx4Var2;
                    e45VarA = e45Var2;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                }
            }
            i4 |= 3072;
            e45Var2 = e45Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.k(15).a(rw4.g(null, 3));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI6 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.x;
                        l46Var.p0(objR);
                    }
                    int i19 = i4 << 3;
                    e(p3fVarI6, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i19 & 896) | 48 | (i19 & 7168) | (57344 & i19) | (i19 & 3670016), 32);
                } else {
                    l46Var.Z();
                    bx4VarA = bx4Var2;
                    e45VarA = e45Var2;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            if ((196608 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.k(15).a(rw4.g(null, 3));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI7 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.x;
                    l46Var.p0(objR);
                }
                int i110 = i4 << 3;
                e(p3fVarI7, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i110 & 896) | 48 | (i110 & 7168) | (57344 & i110) | (i110 & 3670016), 32);
            } else {
                l46Var.Z();
                bx4VarA = bx4Var2;
                e45VarA = e45Var2;
            }
            str3 = str2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
            }
        }
        i4 |= 48;
        j09Var2 = j09Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                bx4Var2 = bx4Var;
                if (l46Var.g(bx4Var2)) {
                    i6 = 256;
                } else {
                    i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    e45Var2 = e45Var;
                    if (l46Var.g(e45Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        str2 = str;
                        if (l46Var.g(str2)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i10;
                    }
                    if ((196608 & i2) == 0) {
                        n26Var2 = n26Var;
                        if (l46Var.i(n26Var2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i4 |= i11;
                    } else {
                        n26Var2 = n26Var;
                    }
                    if ((74899 & i4) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i4 & 1, z2)) {
                        if (i12 != 0) {
                            j09Var2 = g09.a;
                        }
                        if (i5 != 0) {
                            bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                        } else {
                            bx4VarA = bx4Var2;
                        }
                        if (i7 != 0) {
                            e45VarA = rw4.k(15).a(rw4.g(null, 3));
                        } else {
                            e45VarA = e45Var2;
                        }
                        if (i9 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        p3f p3fVarI8 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = xx.x;
                            l46Var.p0(objR);
                        }
                        int i111 = i4 << 3;
                        e(p3fVarI8, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i111 & 896) | 48 | (i111 & 7168) | (57344 & i111) | (i111 & 3670016), 32);
                    } else {
                        l46Var.Z();
                        bx4VarA = bx4Var2;
                        e45VarA = e45Var2;
                    }
                    str3 = str2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                    }
                }
                i4 |= 24576;
                str2 = str;
                if ((196608 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.k(15).a(rw4.g(null, 3));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI9 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.x;
                        l46Var.p0(objR);
                    }
                    int i112 = i4 << 3;
                    e(p3fVarI9, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i112 & 896) | 48 | (i112 & 7168) | (57344 & i112) | (i112 & 3670016), 32);
                } else {
                    l46Var.Z();
                    bx4VarA = bx4Var2;
                    e45VarA = e45Var2;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                }
            }
            i4 |= 3072;
            e45Var2 = e45Var;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.k(15).a(rw4.g(null, 3));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI10 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.x;
                        l46Var.p0(objR);
                    }
                    int i113 = i4 << 3;
                    e(p3fVarI10, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i113 & 896) | 48 | (i113 & 7168) | (57344 & i113) | (i113 & 3670016), 32);
                } else {
                    l46Var.Z();
                    bx4VarA = bx4Var2;
                    e45VarA = e45Var2;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            if ((196608 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.k(15).a(rw4.g(null, 3));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI11 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.x;
                    l46Var.p0(objR);
                }
                int i114 = i4 << 3;
                e(p3fVarI11, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i114 & 896) | 48 | (i114 & 7168) | (57344 & i114) | (i114 & 3670016), 32);
            } else {
                l46Var.Z();
                bx4VarA = bx4Var2;
                e45VarA = e45Var2;
            }
            str3 = str2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
            }
        }
        i4 |= 384;
        bx4Var2 = bx4Var;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                e45Var2 = e45Var;
                if (l46Var.g(e45Var2)) {
                    i8 = 2048;
                } else {
                    i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    str2 = str;
                    if (l46Var.g(str2)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i10;
                }
                if ((196608 & i2) == 0) {
                    n26Var2 = n26Var;
                    if (l46Var.i(n26Var2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                } else {
                    n26Var2 = n26Var;
                }
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i4 & 1, z2)) {
                    if (i12 != 0) {
                        j09Var2 = g09.a;
                    }
                    if (i5 != 0) {
                        bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                    } else {
                        bx4VarA = bx4Var2;
                    }
                    if (i7 != 0) {
                        e45VarA = rw4.k(15).a(rw4.g(null, 3));
                    } else {
                        e45VarA = e45Var2;
                    }
                    if (i9 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    p3f p3fVarI12 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = xx.x;
                        l46Var.p0(objR);
                    }
                    int i115 = i4 << 3;
                    e(p3fVarI12, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i115 & 896) | 48 | (i115 & 7168) | (57344 & i115) | (i115 & 3670016), 32);
                } else {
                    l46Var.Z();
                    bx4VarA = bx4Var2;
                    e45VarA = e45Var2;
                }
                str3 = str2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
                }
            }
            i4 |= 24576;
            str2 = str;
            if ((196608 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.k(15).a(rw4.g(null, 3));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI13 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.x;
                    l46Var.p0(objR);
                }
                int i116 = i4 << 3;
                e(p3fVarI13, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i116 & 896) | 48 | (i116 & 7168) | (57344 & i116) | (i116 & 3670016), 32);
            } else {
                l46Var.Z();
                bx4VarA = bx4Var2;
                e45VarA = e45Var2;
            }
            str3 = str2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
            }
        }
        i4 |= 3072;
        e45Var2 = e45Var;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                str2 = str;
                if (l46Var.g(str2)) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i10;
            }
            if ((196608 & i2) == 0) {
                n26Var2 = n26Var;
                if (l46Var.i(n26Var2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            } else {
                n26Var2 = n26Var;
            }
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i12 != 0) {
                    j09Var2 = g09.a;
                }
                if (i5 != 0) {
                    bx4VarA = rw4.f(null, 3).a(rw4.d(15));
                } else {
                    bx4VarA = bx4Var2;
                }
                if (i7 != 0) {
                    e45VarA = rw4.k(15).a(rw4.g(null, 3));
                } else {
                    e45VarA = e45Var2;
                }
                if (i9 != 0) {
                    str2 = "AnimatedVisibility";
                }
                p3f p3fVarI14 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = xx.x;
                    l46Var.p0(objR);
                }
                int i117 = i4 << 3;
                e(p3fVarI14, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i117 & 896) | 48 | (i117 & 7168) | (57344 & i117) | (i117 & 3670016), 32);
            } else {
                l46Var.Z();
                bx4VarA = bx4Var2;
                e45VarA = e45Var2;
            }
            str3 = str2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
            }
        }
        i4 |= 24576;
        str2 = str;
        if ((196608 & i2) == 0) {
            n26Var2 = n26Var;
            if (l46Var.i(n26Var2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i4 |= i11;
        } else {
            n26Var2 = n26Var;
        }
        if ((74899 & i4) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i4 & 1, z2)) {
            if (i12 != 0) {
                j09Var2 = g09.a;
            }
            if (i5 != 0) {
                bx4VarA = rw4.f(null, 3).a(rw4.d(15));
            } else {
                bx4VarA = bx4Var2;
            }
            if (i7 != 0) {
                e45VarA = rw4.k(15).a(rw4.g(null, 3));
            } else {
                e45VarA = e45Var2;
            }
            if (i9 != 0) {
                str2 = "AnimatedVisibility";
            }
            p3f p3fVarI15 = g21.i0(Boolean.valueOf(z), str2, l46Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
            objR = l46Var.R();
            if (objR == sf2.a) {
                objR = xx.x;
                l46Var.p0(objR);
            }
            int i118 = i4 << 3;
            e(p3fVarI15, (a26) objR, j09Var2, bx4VarA, e45VarA, n26Var2, l46Var, (i118 & 896) | 48 | (i118 & 7168) | (57344 & i118) | (i118 & 3670016), 32);
        } else {
            l46Var.Z();
            bx4VarA = bx4Var2;
            e45VarA = e45Var2;
        }
        str3 = str2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iz(z, j09Var2, bx4VarA, e45VarA, str3, n26Var, i2, i3);
        }
    }

    public static final void e(n3f n3fVar, a26 a26Var, j09 j09Var, bx4 bx4Var, e45 e45Var, n26 n26Var, l46 l46Var, int i2, int i3) {
        int i4;
        bx4 bx4Var2;
        e45 e45Var2;
        n26 n26Var2;
        l46Var.h0(-497872534);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(n3fVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            bx4Var2 = bx4Var;
            i4 |= l46Var.g(bx4Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            bx4Var2 = bx4Var;
        }
        if ((i2 & 24576) == 0) {
            e45Var2 = e45Var;
            i4 |= l46Var.g(e45Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            e45Var2 = e45Var;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= l46Var.i(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            n26Var2 = n26Var;
            i4 |= l46Var.i(n26Var2) ? 1048576 : 524288;
        } else {
            n26Var2 = n26Var;
        }
        if (l46Var.W(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new mz(a26Var, n3fVar);
                l46Var.p0(objR);
            }
            j09 j09VarZ = jgb.Z(j09Var, (n26) objR);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = hy.c;
                l46Var.p0(objR2);
            }
            int i7 = 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            bx4 bx4Var3 = bx4Var2;
            e45 e45Var3 = e45Var2;
            a(n3fVar, a26Var, j09VarZ, bx4Var3, e45Var3, (l26) objR2, n26Var2, l46Var, (i8 & 234881024) | i7 | (29360128 & i8), 64);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new nz(n3fVar, a26Var, j09Var, bx4Var, e45Var, n26Var, i2, i3);
        }
    }

    public static final void f(v50 v50Var, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(685003993);
        int i3 = i2 | (l46Var.e(v50Var == null ? -1 : v50Var.ordinal()) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            e89 e89VarT = tm7.t(((t30) z5c.G(job.a.b(t30.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null)).c, l46Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            l46Var2 = l46Var;
            rs0.f(b.c, false, af1.b0(-27442282, new g30(x16Var2, v50Var, e89Var, e89VarT, x16Var, x16Var3, z), l46Var), l46Var2, 390, 2);
            l40 l40Var = (l40) e89VarT.getValue();
            k40 k40Var = l40Var instanceof k40 ? (k40) l40Var : null;
            if (k40Var != null) {
                l46Var2.f0(1566678559);
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Object objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = new i8(e89Var, 10);
                    l46Var2.p0(objR2);
                }
                od4.a(3504, af1.b0(347341825, new k30(k40Var, z, i4), l46Var2), (x16) objR2, l46Var2, "annual-overview-share", zBooleanValue);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1566964937);
                l46Var2.r(false);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(v50Var, z, x16Var, x16Var2, x16Var3, i2, 0);
        }
    }

    public static final void g(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-293375822);
        int i3 = i2 | (l46Var.g(j09Var) ? 4 : 2) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = J(l46Var, j09Var);
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
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarC = b.c(g09.a, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(i4)), ndb.z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = J(l46Var2, j09VarC);
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
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            bx9 bx9Var = v51.a;
            pr4 pr4Var = l8b.a;
            c8b.k(jw7Var, false, null, v51.a(((e8b) l46Var2.k(pr4Var)).m, 0L, 0L, 0L, l46Var2, 14), null, new bx9(8.0f, 4.0f, 8.0f, 4.0f), false, x16Var, rxg.b, l46Var, ((i3 << 15) & 29360128) | 100859904, 86);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            c8b.k(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, null, v51.a(((e8b) l46Var.k(pr4Var)).u, ((e8b) l46Var.k(pr4Var)).v, 0L, 0L, l46Var, 12), null, new bx9(8.0f, 4.0f, 8.0f, 4.0f), false, x16Var2, rxg.c, l46Var, ((i3 << 12) & 29360128) | 100859952, 84);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(j09Var, x16Var, x16Var2, i2, 2);
        }
    }

    public static final void h(final ArrayList arrayList, final yx9 yx9Var, j09 j09Var, float f2, float f3, l46 l46Var, int i2) {
        float f4;
        float f5;
        final float f6;
        final float f7;
        l46Var.h0(1114359266);
        int i3 = i2 | (l46Var.g(arrayList) ? 4 : 2) | (l46Var.g(yx9Var) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 27648;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                f6 = -30.0f;
                f7 = 12.0f;
            } else {
                l46Var.Z();
                f6 = f2;
                f7 = f3;
            }
            l46Var.s();
            final float aspectRatio = ((die) l46Var.k(snd.a)).a.getAspectRatio();
            nk8.d(j09Var, null, af1.b0(1304234956, new n26() { // from class: b12
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    e31 e31Var = (e31) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fC = e31Var.c();
                        final float f8 = aspectRatio;
                        float fD = (e31Var.d() - (fC * f8)) / 2.0f;
                        bx9 bx9Var = new bx9(fD, 16.0f, fD, 16.0f);
                        final ArrayList arrayList2 = arrayList;
                        final yx9 yx9Var2 = yx9Var;
                        final float f9 = f7;
                        cn1.h(f6, 2, 24576, 16330, null, af1.b0(102044331, new o26() { // from class: d12
                            @Override // defpackage.o26
                            public final Object t(Object obj4, Object obj5, Object obj6, Object obj7) {
                                pr4 pr4Var;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                l46 l46Var3 = (l46) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                ((rx9) obj4).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= l46Var3.e(iIntValue2) ? 32 : 16;
                                }
                                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                    ArrayList arrayList3 = arrayList2;
                                    o8e o8eVar = (o8e) arrayList3.get(iIntValue2 % arrayList3.size());
                                    yx9 yx9Var3 = yx9Var2;
                                    float fJ = ((qz9) yx9Var3.d.d).j() + (((sz9) yx9Var3.d.c).j() - iIntValue2);
                                    float fMin = Math.min(1.0f, Math.abs(fJ));
                                    float f10 = 1.0f - (0.2f * fMin);
                                    float f11 = 1.0f - (0.55f * fMin);
                                    float f12 = f9 * fMin * (-Math.signum(fJ));
                                    g09 g09Var = g09.a;
                                    j09 j09VarW = dj6.w(od4.i(g09Var, fMin * 4.0f).D(b.b), f8);
                                    boolean zD = l46Var3.d(f10) | l46Var3.d(f12) | l46Var3.d(f11);
                                    Object objR = l46Var3.R();
                                    if (zD || objR == sf2.a) {
                                        objR = new e12(f10, f12, f11, 0);
                                        l46Var3.p0(objR);
                                    }
                                    j09 j09VarX = bzd.x(j09VarW, (a26) objR);
                                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
                                    int iHashCode = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM = l46Var3.m();
                                    j09 j09VarJ = m93.J(l46Var3, j09VarX);
                                    lf2.q.getClass();
                                    l46Var3.j0();
                                    boolean z = l46Var3.S;
                                    ov7 ov7Var = LayoutNode.h1;
                                    if (z) {
                                        l46Var3.l(ov7Var);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    he2 he2Var = hj6.z;
                                    dec.l(he2Var, l46Var3, c92VarA);
                                    he2 he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var3, u8aVarM);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    he2 he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var3, numValueOf);
                                    dec.k(l46Var3);
                                    he2 he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var3, j09VarJ);
                                    String str = o8eVar.c;
                                    qhe qheVar = o8eVar.b;
                                    mue mueVar = pue.a;
                                    mue mueVarN = pue.n(l46Var3);
                                    pr4 pr4Var2 = l8b.a;
                                    iqf.a(str, null, ((e8b) l46Var3.k(pr4Var2)).q, mueVarN, w6c.l(14), pue.n(l46Var3).a.b, l46Var3, 24576, 2);
                                    l46 l46Var4 = l46Var3;
                                    o7c.d(new jw7(1.0f, true), o8eVar.b, null, false, null, 8.0f, null, false, l46Var4, 196608, 220);
                                    t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var4, 54);
                                    int iHashCode2 = Long.hashCode(l46Var4.T);
                                    u8a u8aVarM2 = l46Var4.m();
                                    j09 j09VarJ2 = m93.J(l46Var4, g09Var);
                                    l46Var4.j0();
                                    if (l46Var4.S) {
                                        l46Var4.l(ov7Var);
                                    } else {
                                        l46Var4.s0();
                                    }
                                    dec.l(he2Var, l46Var4, t7cVarA);
                                    dec.l(he2Var2, l46Var4, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var4, he2Var3, l46Var4);
                                    dec.l(he2Var4, l46Var4, j09VarJ2);
                                    if (qheVar.b == 0) {
                                        l46Var4.f0(1913815735);
                                        pr4Var = pr4Var2;
                                        nte.b(afc.q(R.string.text_reverse_tag, l46Var4), ynb.Z(tm7.o(b.s(g09Var, ndb.f, 2), ((e8b) l46Var4.k(pr4Var2)).m, a7c.b(2.0f)), 2.0f), ((e8b) l46Var4.k(pr4Var2)).r, w6c.l(8), null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.h(l46Var4), l46Var4, 24576, 0, 130024);
                                        l46Var4 = l46Var4;
                                        l46Var4.r(false);
                                    } else {
                                        pr4Var = pr4Var2;
                                        l46Var4.f0(1914252401);
                                        l46Var4.r(false);
                                    }
                                    l46 l46Var5 = l46Var4;
                                    nte.b(afc.q(r8c.f(qheVar), l46Var4), null, ((e8b) l46Var4.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var4), l46Var5, 0, 0, 131066);
                                    l46Var5.r(true);
                                    l46Var5.r(true);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, null, null, null, bx9Var, null, yx9Var2, null, null, false);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i3 >> 6) & 14) | 3072, 6);
            f4 = f6;
            f5 = f7;
        } else {
            l46Var.Z();
            f4 = f2;
            f5 = f3;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new c12(arrayList, yx9Var, j09Var, f4, f5, i2, 0);
        }
    }

    public static final void i(final k40 k40Var, boolean z, j09 j09Var, l46 l46Var, int i2) {
        int i3;
        float f2;
        l46Var.h0(-79321596);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(k40Var) : l46Var.i(k40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = J(l46Var, j09Var);
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
            fj8 fj8Var = k40Var.e;
            g09 g09Var = g09.a;
            if (fj8Var == null) {
                l46Var.f0(857755330);
                l46Var.r(false);
                f2 = 20.0f;
            } else {
                l46Var.f0(857755331);
                f2 = 20.0f;
                d8c.b(b.r(b.c(g09Var, 1.0f)), null, new bx9(20.0f, 20.0f, 20.0f, 20.0f), af1.b0(-1571622628, new n26() { // from class: h30
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        int i6 = i5;
                        g09 g09Var2 = g09.a;
                        wef wefVar = wef.a;
                        k40 k40Var2 = k40Var;
                        switch (i6) {
                            case 0:
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    l46Var2.Z();
                                } else {
                                    String str = k40Var2.c;
                                    char[] cArr = {'*', '-'};
                                    str.getClass();
                                    int length = str.length() - 1;
                                    int i7 = 0;
                                    boolean z2 = false;
                                    while (i7 <= length) {
                                        char cCharAt = str.charAt(!z2 ? i7 : length);
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= 2) {
                                                i8 = -1;
                                            } else if (cCharAt != cArr[i8]) {
                                                i8++;
                                            }
                                        }
                                        boolean z3 = i8 >= 0;
                                        if (z2) {
                                            if (!z3) {
                                                nte.b(str.subSequence(i7, length + 1).toString(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var2.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var2, 0, 0, 131070);
                                            } else {
                                                length--;
                                            }
                                            break;
                                        } else if (z3) {
                                            i7++;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    nte.b(str.subSequence(i7, length + 1).toString(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var2.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var2, 0, 0, 131070);
                                }
                                break;
                            case 1:
                                l46 l46Var3 = (l46) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    l46Var3.Z();
                                } else {
                                    n16.o(k40Var2.e, b.c(g09Var2, 1.0f), l46Var3, 48, 0);
                                }
                                break;
                            default:
                                l46 l46Var4 = (l46) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var4.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    l46Var4.Z();
                                } else {
                                    c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var4, 0);
                                    int iHashCode2 = Long.hashCode(l46Var4.T);
                                    u8a u8aVarM2 = l46Var4.m();
                                    j09 j09VarJ2 = m93.J(l46Var4, g09Var2);
                                    lf2.q.getClass();
                                    l46Var4.j0();
                                    if (l46Var4.S) {
                                        l46Var4.l(LayoutNode.h1);
                                    } else {
                                        l46Var4.s0();
                                    }
                                    dec.l(hj6.z, l46Var4, c92VarA2);
                                    dec.l(hj6.y, l46Var4, u8aVarM2);
                                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode2));
                                    dec.k(l46Var4);
                                    dec.l(hj6.x, l46Var4, j09VarJ2);
                                    String str2 = k40Var2.d;
                                    mue mueVar = pue.a;
                                    nte.b(str2, null, ((e8b) l46Var4.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                                    if (ca2.a.a()) {
                                        l46Var4.f0(-1504075724);
                                        jgb.c(null, l46Var4, 6);
                                        l46Var4.r(false);
                                    } else {
                                        l46Var4.f0(-1504033440);
                                        l46Var4.r(false);
                                    }
                                    l46Var4.r(true);
                                }
                                break;
                        }
                        return wefVar;
                    }
                }, l46Var), l46Var, 3462, 2);
                l46Var.r(false);
            }
            d8c.b(b.r(b.c(g09Var, 1.0f)), null, new bx9(f2, f2, f2, f2), af1.b0(-1094627157, new k30(k40Var, z, i5), l46Var), l46Var, 3462, 2);
            if (k40Var.d == null) {
                l46Var.f0(858753654);
                l46Var.r(false);
            } else {
                l46Var.f0(858753655);
                final int i6 = 2;
                d8c.b(b.r(b.c(g09Var, 1.0f)), null, new bx9(f2, f2, f2, f2), af1.b0(34824952, new n26() { // from class: h30
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        int i7 = i6;
                        g09 g09Var2 = g09.a;
                        wef wefVar = wef.a;
                        k40 k40Var2 = k40Var;
                        switch (i7) {
                            case 0:
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    l46Var2.Z();
                                } else {
                                    String str = k40Var2.c;
                                    char[] cArr = {'*', '-'};
                                    str.getClass();
                                    int length = str.length() - 1;
                                    int i8 = 0;
                                    boolean z2 = false;
                                    while (i8 <= length) {
                                        char cCharAt = str.charAt(!z2 ? i8 : length);
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= 2) {
                                                i9 = -1;
                                            } else if (cCharAt != cArr[i9]) {
                                                i9++;
                                            }
                                        }
                                        boolean z3 = i9 >= 0;
                                        if (z2) {
                                            if (!z3) {
                                                nte.b(str.subSequence(i8, length + 1).toString(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var2.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var2, 0, 0, 131070);
                                            } else {
                                                length--;
                                            }
                                            break;
                                        } else if (z3) {
                                            i8++;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    nte.b(str.subSequence(i8, length + 1).toString(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var2.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var2, 0, 0, 131070);
                                }
                                break;
                            case 1:
                                l46 l46Var3 = (l46) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    l46Var3.Z();
                                } else {
                                    n16.o(k40Var2.e, b.c(g09Var2, 1.0f), l46Var3, 48, 0);
                                }
                                break;
                            default:
                                l46 l46Var4 = (l46) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var4.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    l46Var4.Z();
                                } else {
                                    c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var4, 0);
                                    int iHashCode2 = Long.hashCode(l46Var4.T);
                                    u8a u8aVarM2 = l46Var4.m();
                                    j09 j09VarJ2 = m93.J(l46Var4, g09Var2);
                                    lf2.q.getClass();
                                    l46Var4.j0();
                                    if (l46Var4.S) {
                                        l46Var4.l(LayoutNode.h1);
                                    } else {
                                        l46Var4.s0();
                                    }
                                    dec.l(hj6.z, l46Var4, c92VarA2);
                                    dec.l(hj6.y, l46Var4, u8aVarM2);
                                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode2));
                                    dec.k(l46Var4);
                                    dec.l(hj6.x, l46Var4, j09VarJ2);
                                    String str2 = k40Var2.d;
                                    mue mueVar = pue.a;
                                    nte.b(str2, null, ((e8b) l46Var4.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                                    if (ca2.a.a()) {
                                        l46Var4.f0(-1504075724);
                                        jgb.c(null, l46Var4, 6);
                                        l46Var4.r(false);
                                    } else {
                                        l46Var4.f0(-1504033440);
                                        l46Var4.r(false);
                                    }
                                    l46Var4.r(true);
                                }
                                break;
                        }
                        return wefVar;
                    }
                }, l46Var), l46Var, 3462, 2);
                l46Var.r(false);
            }
            if (k40Var.c == null) {
                l46Var.f0(859225877);
                l46Var.r(false);
            } else {
                l46Var.f0(859225878);
                d8c.b(b.r(b.c(g09Var, 1.0f)), null, new bx9(f2, f2, f2, f2), af1.b0(319960855, new n26() { // from class: h30
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        int i7 = i4;
                        g09 g09Var2 = g09.a;
                        wef wefVar = wef.a;
                        k40 k40Var2 = k40Var;
                        switch (i7) {
                            case 0:
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    l46Var2.Z();
                                } else {
                                    String str = k40Var2.c;
                                    char[] cArr = {'*', '-'};
                                    str.getClass();
                                    int length = str.length() - 1;
                                    int i8 = 0;
                                    boolean z2 = false;
                                    while (i8 <= length) {
                                        char cCharAt = str.charAt(!z2 ? i8 : length);
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= 2) {
                                                i9 = -1;
                                            } else if (cCharAt != cArr[i9]) {
                                                i9++;
                                            }
                                        }
                                        boolean z3 = i9 >= 0;
                                        if (z2) {
                                            if (!z3) {
                                                nte.b(str.subSequence(i8, length + 1).toString(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var2.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var2, 0, 0, 131070);
                                            } else {
                                                length--;
                                            }
                                            break;
                                        } else if (z3) {
                                            i8++;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    nte.b(str.subSequence(i8, length + 1).toString(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var2.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var2, 0, 0, 131070);
                                }
                                break;
                            case 1:
                                l46 l46Var3 = (l46) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    l46Var3.Z();
                                } else {
                                    n16.o(k40Var2.e, b.c(g09Var2, 1.0f), l46Var3, 48, 0);
                                }
                                break;
                            default:
                                l46 l46Var4 = (l46) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                ((c31) obj).getClass();
                                if (!l46Var4.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    l46Var4.Z();
                                } else {
                                    c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var4, 0);
                                    int iHashCode2 = Long.hashCode(l46Var4.T);
                                    u8a u8aVarM2 = l46Var4.m();
                                    j09 j09VarJ2 = m93.J(l46Var4, g09Var2);
                                    lf2.q.getClass();
                                    l46Var4.j0();
                                    if (l46Var4.S) {
                                        l46Var4.l(LayoutNode.h1);
                                    } else {
                                        l46Var4.s0();
                                    }
                                    dec.l(hj6.z, l46Var4, c92VarA2);
                                    dec.l(hj6.y, l46Var4, u8aVarM2);
                                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode2));
                                    dec.k(l46Var4);
                                    dec.l(hj6.x, l46Var4, j09VarJ2);
                                    String str2 = k40Var2.d;
                                    mue mueVar = pue.a;
                                    nte.b(str2, null, ((e8b) l46Var4.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                                    if (ca2.a.a()) {
                                        l46Var4.f0(-1504075724);
                                        jgb.c(null, l46Var4, 6);
                                        l46Var4.r(false);
                                    } else {
                                        l46Var4.f0(-1504033440);
                                        l46Var4.r(false);
                                    }
                                    l46Var4.r(true);
                                }
                                break;
                        }
                        return wefVar;
                    }
                }, l46Var), l46Var, 3462, 2);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(k40Var, z, j09Var, i2, 0);
        }
    }

    public static final void j(LocalDate localDate, boolean z, boolean z2, x16 x16Var, j09 j09Var, l46 l46Var, int i2) {
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        String strI;
        localDate.getClass();
        x16Var.getClass();
        l46Var.h0(-1818463185);
        int i7 = i2 | (l46Var.i(localDate) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i7 & 1, (i7 & 9363) != 9362)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            Locale locale = ((Configuration) l46Var.k(uq.a)).getLocales().get(0);
            j09 j09VarC = androidx.compose.foundation.b.c(oa7.E(tm7.o(j09Var, eze.a(l46Var).e.c.c, eze.a(l46Var).e.c.a), eze.a(l46Var).e.c.a), false, null, null, x16Var, 15);
            xn8 xn8VarC = s21.c(ndb.v, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            boolean z4 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
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
            j09 j09VarD0 = ynb.d0(24.0f, 0.0f, 12.0f, 0.0f, 10, b.c);
            kx0 kx0Var = ndb.z;
            t7c t7cVarA = s7c.a(xc0.a, kx0Var, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = J(l46Var, j09VarD0);
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
            g09 g09Var = g09.a;
            no6.a(null, z, zF, androidx.compose.ui.platform.b.a(b.l(g09Var, 80.0f), "calendar_daily_fortune_empty_artwork"), l46Var, (i7 & 112) | 3078);
            j09 j09VarD1 = ynb.d0(16.0f, 0.0f, 0.0f, 0.0f, 14, new jw7(1.0f, true));
            c92 c92VarA = a92.a(new uc0(4.0f, false, new jv2(2, kx0Var)), ndb.Y, l46Var, 54);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = J(l46Var, j09VarD1);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            if (z2 && z) {
                i3 = 674755431;
                i4 = R.string.card_of_day_view_tomorrow_tarot;
                z3 = false;
            } else {
                z3 = false;
                if (z2) {
                    i3 = 674758116;
                    i4 = R.string.card_of_day_view_today_tarot;
                } else if (z) {
                    i3 = 674760678;
                    i4 = R.string.day_affirmation_tomorrow_tarot;
                } else {
                    i3 = 674763100;
                    i4 = R.string.daily_universe_tarot;
                }
            }
            String strI2 = tec.i(l46Var, i3, i4, l46Var, z3);
            mue mueVar = pue.a;
            boolean z5 = z3;
            nte.b(strI2, null, 0L, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.p(l46Var), l46Var, 0, 0, 130942);
            if (z2) {
                l46Var.f0(674770873);
                l46Var.r(z5);
                strI = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale));
            } else {
                if (z) {
                    i5 = 674775082;
                    i6 = R.string.calendar_tomorrow_fortune_subtitle;
                } else {
                    i5 = 674777637;
                    i6 = R.string.daily_universe_tarot_subtitle;
                }
                strI = tec.i(l46Var, i5, i6, l46Var, z5);
            }
            String str = strI;
            str.getClass();
            nte.b(str, null, y72.b(((m82) l46Var.k(o82.a)).q, 0.64f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            l46Var.r(true);
            no6.i(6, z5 ? 1 : 0, l46Var, androidx.compose.ui.platform.b.a(ynb.d0(8.0f, 0.0f, 0.0f, 0.0f, 14, g09Var), "calendar_daily_fortune_chevron"));
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z50(localDate, z, z2, x16Var, j09Var, i2, 3);
        }
    }

    public static final void k(final j09 j09Var, final fy9 fy9Var, final int i2, float f2, float f3, final x16 x16Var, l46 l46Var, final int i3) {
        final float f4;
        final float f5;
        boolean z;
        boolean z2;
        float f6;
        float f7;
        float f8;
        List list;
        boolean z3;
        l46 l46Var2 = l46Var;
        fy9Var.getClass();
        x16Var.getClass();
        l46Var2.h0(325780293);
        int i4 = i3 | (l46Var2.i(fy9Var) ? 32 : 16) | 27648 | (l46Var2.i(x16Var) ? 131072 : 65536);
        if (l46Var2.W(i4 & 1, (74899 & i4) != 74898)) {
            Configuration configuration = (Configuration) l46Var2.k(uq.a);
            sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                List listM1 = s72.m1(s72.j1(aie.a.keySet()));
                Collections.shuffle(listM1);
                List<String> listC1 = s72.c1(listM1, 6);
                ArrayList arrayList = new ArrayList(t72.u(listC1, 10));
                for (String str : listC1) {
                    str.getClass();
                    arrayList.add(new qhe(str, 1));
                }
                l46Var2.p0(arrayList);
                objR = arrayList;
            }
            List list2 = (List) objR;
            float fP0 = sw3Var.p0(configuration.screenWidthDp);
            float fP1 = sw3Var.p0(configuration.screenHeightDp);
            float f9 = fP0 / 2.0f;
            float f10 = fP1 / 2.0f;
            float f11 = fP0 * 0.55f;
            float f12 = fP1 * 0.18f;
            float f13 = fP1 * 0.48f;
            boolean z4 = true;
            float f14 = (-(f13 - f12)) / 2.0f;
            float fP2 = sw3Var.p0(80.0f);
            float fP3 = sw3Var.p0(140.0f);
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            Object objR3 = l46Var2.R();
            if (objR3 == i8cVar) {
                objR3 = qk2.d(1.0f);
                l46Var2.p0(objR3);
            }
            jx jxVar = (jx) objR3;
            Boolean bool = (Boolean) e89Var.getValue();
            bool.getClass();
            boolean zI = l46Var2.i(jxVar) | ((i4 & 458752) == 131072);
            Object objR4 = l46Var2.R();
            if (zI || objR4 == i8cVar) {
                objR4 = new ct4(jxVar, x16Var, e89Var, null);
                l46Var2.p0(objR4);
            }
            af1.o((l26) objR4, l46Var2, bool);
            Object objR5 = l46Var2.R();
            if (objR5 == i8cVar) {
                objR5 = new dt4(e89Var, null);
                l46Var2.p0(objR5);
            }
            af1.o((l26) objR5, l46Var2, wef.a);
            j09 j09VarP = pa7.p(j09Var.D(b.c), 2.0f - ((Number) jxVar.e()).floatValue());
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = J(l46Var2, j09VarP);
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
            l46Var2.f0(1477266939);
            int i5 = 0;
            while (i5 < i2) {
                float f15 = (360.0f / i2) * i5;
                double radians = Math.toRadians(f15);
                double d2 = f9;
                double dCos = (Math.cos(radians) * ((double) f11)) + d2;
                double d3 = f10;
                double dSin = (Math.sin(radians) * ((double) (radians > 3.141592653589793d ? f12 : f13))) + (0.9d * d3) + ((double) f14);
                double dDoubleValue = (((Number) jxVar.e()).doubleValue() * (dCos - d2)) + d2;
                double dDoubleValue2 = (((Number) jxVar.e()).doubleValue() * (dSin - d3)) + d3;
                boolean zE = l46Var2.e(i5);
                Object objR6 = l46Var2.R();
                if (zE || objR6 == i8cVar) {
                    objR6 = Float.valueOf((float) (Math.random() * 360.0d));
                    l46Var2.p0(objR6);
                }
                float fFloatValue = ((Number) objR6).floatValue();
                boolean zE2 = l46Var2.e(i5);
                Object objR7 = l46Var2.R();
                if (zE2 || objR7 == i8cVar) {
                    objR7 = Float.valueOf(((float) (Math.random() * 360.0d)) * 5.0f);
                    l46Var2.p0(objR7);
                }
                float fFloatValue2 = (((Number) jxVar.e()).floatValue() * ((Number) objR7).floatValue()) + f15 + fFloatValue;
                j09 j09VarM = b.m(g09.a, 80.0f, 140.0f);
                Object objJ = l46Var2.J();
                if ((objJ instanceof Double) && dDoubleValue == ((Number) objJ).doubleValue()) {
                    z = false;
                } else {
                    l46Var2.q0(Double.valueOf(dDoubleValue));
                    z = z4;
                }
                boolean zD = z | l46Var2.d(fP2);
                Object objJ2 = l46Var2.J();
                int i6 = i5;
                if ((objJ2 instanceof Double) && dDoubleValue2 == ((Number) objJ2).doubleValue()) {
                    z2 = false;
                } else {
                    l46Var2.q0(Double.valueOf(dDoubleValue2));
                    z2 = z4;
                }
                boolean zD2 = z2 | zD | l46Var2.d(fP3);
                Object objR8 = l46Var2.R();
                if (zD2 || objR8 == i8cVar) {
                    f6 = fP3;
                    f7 = fP2;
                    objR8 = new at4(dDoubleValue, f7, dDoubleValue2, f6, 0);
                    l46Var2.p0(objR8);
                } else {
                    f6 = fP3;
                    f7 = fP2;
                }
                j09 j09VarL = tm7.L(j09VarM, (a26) objR8);
                boolean zD3 = l46Var2.d(fFloatValue2);
                Object objR9 = l46Var2.R();
                int i7 = 3;
                if (zD3 || objR9 == i8cVar) {
                    objR9 = new uc2(i7, fFloatValue2);
                    l46Var2.p0(objR9);
                }
                j09 j09VarE = oa7.E(bzd.x(j09VarL, (a26) objR9), a7c.b(8.0f));
                boolean z5 = !((Boolean) e89Var.getValue()).booleanValue();
                Object objR10 = l46Var2.R();
                if (objR10 == i8cVar) {
                    objR10 = new ok3(e89Var, 15);
                    l46Var2.p0(objR10);
                }
                j09 j09VarC = androidx.compose.foundation.b.c(j09VarE, z5, null, null, (x16) objR10, 14);
                if (i6 % 6 == 0) {
                    l46Var2.f0(-978768024);
                    z3 = z4;
                    f8 = f14;
                    list = list2;
                    o7c.d(j09VarC, (qhe) list2.get(i6 / 5), null, false, null, 8.0f, null, false, l46Var, 196608, 220);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    f8 = f14;
                    list = list2;
                    z3 = z4;
                    l46Var2.f0(-978616217);
                    feg.j(fy9Var, null, j09VarC, null, null, 0.0f, null, l46Var2, 56 | ((i4 >> 3) & 14), 120);
                    l46Var2.r(false);
                }
                list2 = list;
                z4 = z3;
                f10 = f10;
                f14 = f8;
                e89Var = e89Var;
                i8cVar = i8cVar;
                i5 = i6 + 1;
                f11 = f11;
                f9 = f9;
                fP2 = f7;
                fP3 = f6;
            }
            l46Var2.r(false);
            l46Var2.r(z4);
            f5 = 80.0f;
            f4 = 140.0f;
        } else {
            l46Var2.Z();
            f4 = f2;
            f5 = f3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(fy9Var, i2, f4, f5, x16Var, i3) { // from class: bt4
                public final /* synthetic */ fy9 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ x16 f;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(455);
                    m93.k(this.a, this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void l(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(673322578);
        int i3 = i2 | 6 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            t72.b(x16Var2, null, af1.b0(-867460133, new b20(x16Var2, x16Var, 9), l46Var), l46Var, ((i3 >> 6) & 14) | 384, 2);
            j09Var2 = g09.a;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(j09Var2, x16Var, x16Var2, i2, 4);
        }
    }

    public static final void m(int i2, x16 x16Var, l46 l46Var, j09 j09Var) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1814668201);
        int i4 = i2 | (l46Var.g(j09Var) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16);
        int i5 = 0;
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = J(l46Var, j09Var);
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
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarS = b.s(g09.a, null, 3);
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(i5)), ndb.Z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = J(l46Var2, j09VarS);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            gu6.b(od4.A(R.drawable.ic_none_card, 0, l46Var2), null, null, 0L, l46Var2, 56, 12);
            String strQ = afc.q(R.string.home_history_empty_text, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, new jme(3), w6c.l(32), 0, false, 0, 0, null, pue.e(l46Var2), l46Var, 0, 48, 127994);
            l46Var2 = l46Var;
            String strQ2 = afc.q(R.string.reading_start_conversation, l46Var2);
            boolean z2 = (i4 & 112) == 32;
            Object objR = l46Var2.R();
            if (z2 || objR == sf2.a) {
                objR = new c20(28, x16Var);
                l46Var2.p0(objR);
            }
            nk8.i(strQ2, (x16) objR, null, 0.0f, 0.0f, 0.0f, false, null, null, null, false, l46Var2, 0, 0, 4092);
            i3 = 1;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            i3 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var, x16Var, i2, i3);
        }
    }

    public static final void n(boolean z, x16 x16Var, j09 j09Var, boolean z2, jbb jbbVar, l46 l46Var, int i2) {
        l46 l46Var2;
        j09 j09Var2;
        boolean z3;
        jbb jbbVar2;
        jbb jbbVar3;
        boolean z4;
        jbb jbbVar4;
        j09 j09Var3;
        long j2;
        Object objI;
        int i3;
        j09 j09VarV;
        l46Var.h0(408580840);
        int i4 = i2 | (l46Var.h(z) ? 4 : 2) | 208256;
        if (l46Var.W(i4 & 1, (74899 & i4) != 74898)) {
            l46Var.b0();
            int i5 = i2 & 1;
            j09 j09Var4 = g09.a;
            if (i5 == 0 || l46Var.C()) {
                m82 m82Var = (m82) l46Var.k(o82.a);
                jbb jbbVar5 = m82Var.j0;
                if (jbbVar5 == null) {
                    jbbVar3 = new jbb(o82.c(m82Var, kj0.m), o82.c(m82Var, kj0.o), y72.b(o82.c(m82Var, kj0.j), 0.38f), y72.b(o82.c(m82Var, kj0.k), 0.38f));
                    m82Var.j0 = jbbVar3;
                } else {
                    jbbVar3 = jbbVar5;
                }
                z4 = true;
                jbbVar4 = jbbVar3;
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var;
                z4 = z2;
                jbbVar4 = jbbVar;
            }
            l46Var.s();
            h0e h0eVarA = vx.a(z ? 6.0f : 0.0f, vpf.Z(t39.b, l46Var), null, l46Var, 0, 12);
            jbbVar4.getClass();
            if (z4 && z) {
                j2 = jbbVar4.a;
            } else if (!z4 || z) {
                j2 = (z4 || !z) ? jbbVar4.d : jbbVar4.c;
            } else {
                j2 = jbbVar4.b;
            }
            if (z4) {
                l46Var.f0(1194696477);
                objI = qkd.a(j2, vpf.Z(t39.c, l46Var), null, l46Var, 0, 12);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2 = l46Var;
                l46Var2.f0(1194874138);
                objI = q1c.i(new y72(j2), l46Var2);
                l46Var2.r(false);
            }
            Object obj = objI;
            if (x16Var != null) {
                z3 = z4;
                i3 = 3;
                j09VarV = n16.V(j09Var4, z, null, d5c.a(kj0.n / 2.0f, 4, 0L, false), z3, new i5c(3), x16Var);
            } else {
                i3 = 3;
                z3 = z4;
                j09VarV = j09Var4;
            }
            if (x16Var != null) {
                oq6 oq6Var = p77.a;
                j09Var4 = xv8.a;
            }
            j09 j09VarH = b.h(ynb.Z(b.s(j09Var3.D(j09Var4).D(j09VarV), ndb.f, 2), 2.0f), kj0.l);
            boolean zG = l46Var2.g(obj) | l46Var2.g(h0eVarA);
            Object objR = l46Var2.R();
            if (zG || objR == sf2.a) {
                objR = new h6b(i3, obj, h0eVarA);
                l46Var2.p0(objR);
            }
            nk8.e(0, (a26) objR, l46Var2, j09VarH);
            j09Var2 = j09Var3;
            jbbVar2 = jbbVar4;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            j09Var2 = j09Var;
            z3 = z2;
            jbbVar2 = jbbVar;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z50(z, x16Var, j09Var2, z3, jbbVar2, i2);
        }
    }

    public static rh5 o(int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return new rh5(0, i2, 0);
    }

    public static nh5 p(float f2, float f3, int i2) {
        float f4 = (i2 & 4) != 0 ? 0.0f : 16.0f;
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        return new nh5(f2, f4, f3);
    }

    public static final f57 q(g7g g7gVar, l46 l46Var) {
        return new f57(g7gVar, (sw3) l46Var.k(zg2.h));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x022b  */
    public static void s(qy0 qy0Var, cy4 cy4Var, mtf mtfVar, int i2, yl9 yl9Var) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte[][] bArr = (byte[][]) yl9Var.d;
        int i11 = yl9Var.b;
        int i12 = yl9Var.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = g[0].length;
        A(0, 0, yl9Var);
        int i13 = i11 - length;
        A(i13, 0, yl9Var);
        A(0, i13, yl9Var);
        z(0, 7, yl9Var);
        int i14 = i11 - 8;
        z(i14, 7, yl9Var);
        z(0, i14, yl9Var);
        B(7, 0, yl9Var);
        int i15 = i12 - 8;
        B(i15, 0, yl9Var);
        int i16 = i12 - 7;
        B(7, i16, yl9Var);
        if (yl9Var.w(8, i15) == 0) {
            throw new vcg();
        }
        yl9Var.x(8, i15, 1);
        int i17 = mtfVar.a;
        if (i17 < 2) {
            i3 = 0;
        } else {
            i3 = 0;
            int[] iArr = i[i17 - 1];
            int length2 = iArr.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = iArr[i18];
                if (i19 >= 0) {
                    int length3 = iArr.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = iArr[i20];
                        if (i21 >= 0 && F(yl9Var.w(i21, i19))) {
                            int i22 = i21 - 2;
                            int i23 = i19 - 2;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= 5) {
                                    break;
                                }
                                int[] iArr2 = h[i24];
                                int i25 = i24;
                                int i26 = 0;
                                for (int i27 = 5; i26 < i27; i27 = 5) {
                                    int i28 = i26;
                                    yl9Var.x(i22 + i26, i23 + i25, iArr2[i28]);
                                    i26 = i28 + 1;
                                    length3 = length3;
                                }
                                i24 = i25 + 1;
                            }
                        }
                        i20++;
                        bArr = bArr;
                        i11 = i11;
                        length3 = length3;
                    }
                }
                i18++;
                bArr = bArr;
                i11 = i11;
            }
        }
        byte[][] bArr3 = bArr;
        int i29 = i11;
        int i30 = 8;
        while (i30 < i14) {
            int i31 = i30 + 1;
            int i32 = i31 % 2;
            if (F(yl9Var.w(i30, 6))) {
                yl9Var.x(i30, 6, i32);
            }
            if (F(yl9Var.w(6, i30))) {
                yl9Var.x(6, i30, i32);
            }
            i30 = i31;
        }
        qy0 qy0Var2 = new qy0();
        if (i2 < 0 || i2 >= 8) {
            throw new vcg("Invalid mask pattern");
        }
        int iA = (cy4Var.a() << 3) | i2;
        qy0Var2.b(iA, 5);
        qy0Var2.b(t(iA, 1335), 10);
        qy0 qy0Var3 = new qy0();
        qy0Var3.b(21522, 15);
        if (qy0Var2.b != qy0Var3.b) {
            qc0.j("Sizes don't match");
            return;
        }
        int i33 = i3;
        while (true) {
            int[] iArr3 = qy0Var2.a;
            if (i33 >= iArr3.length) {
                break;
            }
            iArr3[i33] = iArr3[i33] ^ qy0Var3.a[i33];
            i33++;
        }
        if (qy0Var2.b != 15) {
            throw new vcg("should not happen but we got: " + qy0Var2.b);
        }
        int i34 = i3;
        while (true) {
            int i35 = qy0Var2.b;
            if (i34 >= i35) {
                break;
            }
            boolean zD = qy0Var2.d((i35 - 1) - i34);
            int[] iArr4 = j[i34];
            int i36 = iArr4[i3];
            byte[] bArr4 = bArr3[iArr4[1]];
            byte b2 = zD ? (byte) 1 : (byte) 0;
            bArr4[i36] = b2;
            if (i34 < 8) {
                i10 = (i29 - i34) - 1;
                i9 = 8;
            } else {
                i9 = (i34 - 8) + i16;
                i10 = 8;
            }
            bArr3[i9][i10] = b2;
            i34++;
        }
        if (i17 >= 7) {
            qy0 qy0Var4 = new qy0();
            qy0Var4.b(i17, 6);
            qy0Var4.b(t(i17, 7973), 12);
            if (qy0Var4.b != 18) {
                throw new vcg("should not happen but we got: " + qy0Var4.b);
            }
            int i37 = 17;
            for (int i38 = i3; i38 < 6; i38++) {
                for (int i39 = i3; i39 < 3; i39++) {
                    boolean zD2 = qy0Var4.d(i37);
                    i37--;
                    int i40 = (i12 - 11) + i39;
                    byte[] bArr5 = bArr3[i40];
                    byte b3 = zD2 ? (byte) 1 : (byte) 0;
                    bArr5[i38] = b3;
                    bArr3[i38][i40] = b3;
                }
            }
        }
        int i41 = i29 - 1;
        int i42 = i12 - 1;
        int i43 = i3;
        int i44 = -1;
        while (i41 > 0) {
            if (i41 == 6) {
                i41--;
            }
            while (i42 >= 0 && i42 < i12) {
                for (int i45 = i3; i45 < 2; i45++) {
                    int i46 = i41 - i45;
                    if (F(yl9Var.w(i46, i42))) {
                        if (i43 < qy0Var.b) {
                            boolean zD3 = qy0Var.d(i43);
                            i43++;
                            i4 = zD3;
                        } else {
                            i4 = i3;
                        }
                        if (i2 != -1) {
                            switch (i2) {
                                case 0:
                                    i5 = i42 + i46;
                                    i6 = i5 & 1;
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                case 1:
                                    i6 = i42 & 1;
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                case 2:
                                    i6 = i46 % 3;
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                case 3:
                                    i6 = (i42 + i46) % 3;
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                case 4:
                                    i6 = ((i46 / 3) + (i42 / 2)) & 1;
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                case 5:
                                    int i47 = i42 * i46;
                                    i6 = (i47 % 3) + (i47 & 1);
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                case 6:
                                    int i48 = i42 * i46;
                                    i7 = i48 & 1;
                                    i8 = i48 % 3;
                                    i5 = i8 + i7;
                                    i6 = i5 & 1;
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                case 7:
                                    i8 = (i42 * i46) % 3;
                                    i7 = (i42 + i46) & 1;
                                    i5 = i8 + i7;
                                    i6 = i5 & 1;
                                    if (i6 == 0) {
                                        i4 = ~i4;
                                    }
                                    break;
                                default:
                                    qc0.j(tec.e(i2, "Invalid mask pattern: "));
                                    return;
                            }
                        }
                        bArr3[i42][i46] = (byte) i4;
                    }
                }
                i42 += i44;
            }
            i44 = -i44;
            i42 += i44;
            i41 -= 2;
        }
        if (i43 == qy0Var.b) {
            return;
        }
        throw new vcg("Not all bits consumed: " + i43 + '/' + qy0Var.b);
    }

    public static int t(int i2, int i3) {
        if (i3 == 0) {
            qc0.j("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i2 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i4) {
            iNumberOfLeadingZeros2 ^= i3 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i4);
        }
        return iNumberOfLeadingZeros2;
    }

    public static final j09 u(j09 j09Var, n26 n26Var) {
        return j09Var.D(new rf2(n26Var));
    }

    public static final jg1 v(String str, String str2, ep0 ep0Var) {
        str.getClass();
        ArrayList arrayListK = t72.K(str);
        if (str2 != null) {
            arrayListK.add(str2);
        }
        return new jg1(arrayListK, ep0Var);
    }

    public static void w(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        s8f.p(file, "Unable to create parent directories of ");
    }

    public static void x(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (t13 t13Var : (Set) it2.next()) {
                        for (xw3 xw3Var : t13Var.a.c) {
                            if (xw3Var.c == 0) {
                                Set<t13> set = (Set) map.get(new u13(xw3Var.a, xw3Var.b == 2));
                                if (set != null) {
                                    for (t13 t13Var2 : set) {
                                        t13Var.b.add(t13Var2);
                                        t13Var2.c.add(t13Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<t13> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (t13 t13Var3 : hashSet) {
                    if (t13Var3.c.isEmpty()) {
                        hashSet2.add(t13Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    t13 t13Var4 = (t13) hashSet2.iterator().next();
                    hashSet2.remove(t13Var4);
                    i2++;
                    for (t13 t13Var5 : t13Var4.b) {
                        t13Var5.c.remove(t13Var4);
                        if (t13Var5.c.isEmpty()) {
                            hashSet2.add(t13Var5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (t13 t13Var6 : hashSet) {
                    if (!t13Var6.c.isEmpty() && !t13Var6.b.isEmpty()) {
                        arrayList2.add(t13Var6.a);
                    }
                }
                throw new zw3(arrayList2);
            }
            lb2 lb2Var = (lb2) it.next();
            t13 t13Var7 = new t13(lb2Var);
            for (y3b y3bVar : lb2Var.b) {
                boolean z = lb2Var.e == 0;
                u13 u13Var = new u13(y3bVar, !z);
                if (!map.containsKey(u13Var)) {
                    map.put(u13Var, new HashSet());
                }
                Set set2 = (Set) map.get(u13Var);
                if (!set2.isEmpty() && z) {
                    r3.m(y3bVar, ".", "Multiple components provide ");
                    return;
                }
                set2.add(t13Var7);
            }
        }
    }

    public static final float y(yx9 yx9Var) {
        return yx9Var.k().e == ks9.b ? Float.intBitsToFloat((int) (yx9Var.p() >> 32)) : Float.intBitsToFloat((int) (yx9Var.p() & 4294967295L));
    }

    public static void z(int i2, int i3, yl9 yl9Var) throws vcg {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!F(yl9Var.w(i5, i3))) {
                throw new vcg();
            }
            yl9Var.x(i5, i3, 0);
        }
    }

    public abstract String r();
}
