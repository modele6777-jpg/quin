package defpackage;

import ai.askquin.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lq extends i6 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final p69 c1;
    public final q69 E0;
    public final q69 F0;
    public final fud G0;
    public final fud H0;
    public int I0;
    public Integer J0;
    public final od0 K0;
    public final r41 L0;
    public boolean M0;
    public iq N0;
    public q69 O0;
    public final r69 P0;
    public final o69 Q0;
    public final o69 R0;
    public final String S0;
    public final String T0;
    public final psd U0;
    public final q69 V0;
    public zwc W0;
    public t6 X;
    public boolean X0;
    public t6 Y;
    public final o69 Y0;
    public boolean Z;
    public final j1 Z0;
    public final ArrayList a1;
    public final fq b1;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final fq f = new fq(this, 0);
    public final AccessibilityManager g;
    public long v;
    public List w;
    public final hq x;
    public int y;
    public int z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        p69 p69Var = s67.a;
        p69 p69Var2 = new p69(32);
        int i = p69Var2.b;
        if (i < 0) {
            r3.i("");
            return;
        }
        int i2 = i + 32;
        p69Var2.d(i2);
        int[] iArr2 = p69Var2.a;
        int i3 = p69Var2.b;
        if (i != i3) {
            qd0.Y(i2, i, i3, iArr2, iArr2);
        }
        qd0.c0(i, 0, 12, iArr, iArr2);
        p69Var2.b += 32;
        c1 = p69Var2;
    }

    public lq(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.g = (AccessibilityManager) systemService;
        this.v = 100L;
        new Handler(Looper.getMainLooper());
        this.x = new hq(this);
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.E0 = new q69();
        this.F0 = new q69();
        this.G0 = new fud(0);
        this.H0 = new fud(0);
        this.I0 = -1;
        this.K0 = new od0(0);
        this.L0 = urg.a(1, null, null, 6);
        this.M0 = true;
        q69 q69Var = v67.a;
        q69Var.getClass();
        this.O0 = q69Var;
        this.P0 = new r69();
        this.Q0 = new o69();
        this.R0 = new o69();
        this.S0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.T0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.U0 = new psd(12, (byte) 0);
        this.V0 = new q69();
        this.W0 = new zwc(androidComposeView.getSemanticsOwner().a(), q69Var);
        int i = n67.a;
        this.Y0 = new o69();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.Z0 = new j1(3, this);
        this.a1 = new ArrayList();
        this.b1 = new fq(this, 1);
    }

    public static /* synthetic */ void E(lq lqVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        lqVar.D(i, i2, num, null);
    }

    public static Rect L(vs9 vs9Var, float f, float f2) {
        if (!(vs9Var instanceof ts9) && !(vs9Var instanceof us9)) {
            return null;
        }
        hkb hkbVarA = vs9Var.a();
        return new Rect((int) (hkbVarA.a + f), (int) (hkbVarA.b + f2), (int) (hkbVarA.c + f), (int) (hkbVarA.d + f2));
    }

    public static float[] N(vs9 vs9Var) {
        if (!(vs9Var instanceof us9)) {
            return null;
        }
        v6c v6cVar = ((us9) vs9Var).a;
        long j = v6cVar.h;
        long j2 = v6cVar.g;
        long j3 = v6cVar.f;
        long j4 = v6cVar.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(vs9 vs9Var, float f, float f2) {
        if (vs9Var instanceof ss9) {
            ss9 ss9Var = (ss9) vs9Var;
            hkb hkbVarJ = ss9Var.a().j(f, f2);
            Region region = new Region(new Rect((int) (hkbVarJ.a + 0.0f), (int) (hkbVarJ.b + 0.0f), (int) (hkbVarJ.c + 0.0f), (int) (hkbVarJ.d + 0.0f)));
            Region region2 = new Region();
            zt ztVar = ss9Var.a;
            if (ztVar instanceof zt) {
                Path path = ztVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            s8f.i("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(ywc ywcVar) {
        k00 k00Var;
        if (ywcVar != null) {
            twc twcVar = ywcVar.d;
            w79 w79Var = twcVar.a;
            gxc gxcVar = cxc.a;
            if (w79Var.c(gxcVar)) {
                return k88.a((List) twcVar.e(gxcVar), ",", null, 62);
            }
            gxc gxcVar2 = cxc.G;
            if (w79Var.c(gxcVar2)) {
                Object objG = w79Var.g(gxcVar2);
                if (objG == null) {
                    objG = null;
                }
                k00 k00Var2 = (k00) objG;
                if (k00Var2 != null) {
                    return k00Var2.b;
                }
            } else {
                Object objG2 = w79Var.g(cxc.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (k00Var = (k00) s72.x0(list)) != null) {
                    return k00Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean x(rgc rgcVar, float f) {
        x16 x16Var = rgcVar.a;
        if (f >= 0.0f || ((Number) x16Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) x16Var.invoke()).floatValue() < ((Number) rgcVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(rgc rgcVar) {
        x16 x16Var = rgcVar.a;
        if (((Number) x16Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) x16Var.invoke()).floatValue();
        ((Number) rgcVar.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(rgc rgcVar) {
        x16 x16Var = rgcVar.a;
        if (((Number) x16Var.invoke()).floatValue() < ((Number) rgcVar.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) x16Var.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.d.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(ywc ywcVar, zwc zwcVar) {
        int[] iArr = d77.a;
        r69 r69Var = new r69();
        List listI = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
        LayoutNode layoutNode = ywcVar.c;
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            ywc ywcVar2 = (ywc) listI.get(i);
            u67 u67VarS = s();
            int i2 = ywcVar2.f;
            if (u67VarS.a(i2)) {
                if (!zwcVar.b.c(i2)) {
                    w(layoutNode);
                    return;
                }
                r69Var.a(i2);
            }
        }
        r69 r69Var2 = zwcVar.b;
        int[] iArr2 = r69Var2.b;
        long[] jArr = r69Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !r69Var.c(iArr2[(i3 << 3) + i5])) {
                            w(layoutNode);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listI2 = ywcVar.i((4 & 1) != 0 ? !ywcVar.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ywc ywcVar3 = (ywc) listI2.get(i6);
            zwc zwcVar2 = (zwc) this.V0.b(ywcVar3.f);
            if (zwcVar2 != null && s().a(ywcVar3.f)) {
                B(ywcVar3, zwcVar2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.Z = true;
        }
        try {
            return ((Boolean) this.f.d(accessibilityEvent)).booleanValue();
        } finally {
            this.Z = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(k88.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        iq iqVar = this.N0;
        if (iqVar != null) {
            ywc ywcVar = iqVar.a;
            if (i != ywcVar.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - iqVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(ywcVar.f), 131072);
                accessibilityEventO.setFromIndex(iqVar.d);
                accessibilityEventO.setToIndex(iqVar.e);
                accessibilityEventO.setAction(iqVar.b);
                accessibilityEventO.setMovementGranularity(iqVar.c);
                accessibilityEventO.getText().add(t(ywcVar));
                C(accessibilityEventO);
            }
        }
        this.N0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0254  */
    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:105:0x0292  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02de  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:130:0x0308  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0312  */
    /* JADX WARN: Code duplicated, block: B:138:0x031f A[LOOP:4: B:133:0x030e->B:138:0x031f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x032d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0341 A[LOOP:5: B:141:0x0329->B:146:0x0341, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x0367  */
    /* JADX WARN: Code duplicated, block: B:158:0x0372  */
    /* JADX WARN: Code duplicated, block: B:163:0x039a  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:170:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:172:0x03df  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:175:0x0401  */
    /* JADX WARN: Code duplicated, block: B:177:0x0407  */
    /* JADX WARN: Code duplicated, block: B:186:0x044f  */
    /* JADX WARN: Code duplicated, block: B:190:0x045e  */
    /* JADX WARN: Code duplicated, block: B:255:0x053e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0551 A[LOOP:6: B:254:0x053c->B:258:0x0551, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x0562  */
    /* JADX WARN: Code duplicated, block: B:265:0x056f  */
    /* JADX WARN: Code duplicated, block: B:269:0x057d  */
    /* JADX WARN: Code duplicated, block: B:295:0x065e  */
    /* JADX WARN: Code duplicated, block: B:317:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0328 A[EDGE_INSN: B:318:0x0328->B:140:0x0328 BREAK  A[LOOP:4: B:133:0x030e->B:138:0x031f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0346 A[EDGE_INSN: B:319:0x0346->B:148:0x0346 BREAK  A[LOOP:5: B:141:0x0329->B:146:0x0341], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:63:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x021b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0243  */
    /* JADX WARN: Code duplicated, block: B:96:0x024b  */
    /* JADX WARN: Code duplicated, block: B:98:0x024f  */
    public final void H(u67 u67Var) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        twc twcVar;
        ywc ywcVar;
        int i8;
        int i9;
        int i10;
        int i11;
        w79 w79Var;
        LayoutNode layoutNode;
        int i12;
        twc twcVar2;
        long j;
        int i13;
        int i14;
        Integer num5;
        ehc ehcVar;
        boolean z;
        gxc gxcVar;
        int i15;
        gxc gxcVar2;
        gxc gxcVar3;
        String str;
        gxc gxcVar4;
        int size;
        int i16;
        ehc ehcVar2;
        Object objG;
        Object objG2;
        m26 m26Var;
        int i17;
        int i18;
        Object objG3;
        k00 k00Var;
        String str2;
        Object objG4;
        k00 k00Var2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceP;
        int length;
        int length2;
        int i19;
        Integer num6;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zC;
        boolean z2;
        boolean z3;
        AccessibilityEvent accessibilityEventP;
        Object objG6;
        i5c i5cVar;
        Object objG7;
        AccessibilityEvent accessibilityEventO;
        Object objG8;
        String strA;
        Object objG9;
        List list;
        String strA2;
        String str3;
        boolean zC2;
        int i24;
        lq lqVar = this;
        u67 u67Var2 = u67Var;
        Integer num7 = 64;
        ArrayList arrayList5 = lqVar.a1;
        ArrayList arrayList6 = new ArrayList(arrayList5);
        arrayList5.clear();
        int[] iArr3 = u67Var2.b;
        long[] jArr3 = u67Var2.a;
        int i25 = 2;
        int length3 = jArr3.length - 2;
        int i26 = 0;
        Integer num8 = 0;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j2 = jArr3[i27];
            int i28 = i25;
            int i29 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j3 = j2;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j3 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        zwc zwcVar = (zwc) lqVar.V0.b(i33);
                        if (zwcVar == null) {
                            i3 = i32;
                            num3 = num7;
                            arrayList3 = arrayList6;
                            arrayList4 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i31;
                            i5 = i26;
                            i6 = i27;
                            num4 = num8;
                            i7 = i30;
                        } else {
                            twc twcVar3 = zwcVar.a;
                            w79 w79Var2 = twcVar3.a;
                            axc axcVar = (axc) u67Var2.b(i33);
                            int i34 = i30;
                            ywc ywcVar2 = axcVar != null ? axcVar.a : null;
                            if (ywcVar2 == null) {
                                throw kv2.d("no value for specified key");
                            }
                            LayoutNode layoutNode2 = ywcVar2.c;
                            twc twcVar4 = ywcVar2.d;
                            iArr2 = iArr3;
                            int i35 = ywcVar2.f;
                            jArr2 = jArr3;
                            w79 w79Var3 = twcVar4.a;
                            i6 = i27;
                            Object[] objArr = w79Var3.b;
                            Object[] objArr2 = w79Var3.c;
                            long[] jArr4 = w79Var3.a;
                            i3 = i32;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                LayoutNode layoutNode3 = layoutNode2;
                                i4 = i31;
                                int i36 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i36];
                                    ywc ywcVar3 = ywcVar2;
                                    int i37 = i36;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j4 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length4;
                                                Object obj2 = objArr2[i40];
                                                twcVar2 = twcVar3;
                                                gxc gxcVar5 = (gxc) obj;
                                                j = j4;
                                                gxc gxcVar6 = cxc.v;
                                                if (pa7.t(gxcVar5, gxcVar6) || pa7.t(gxcVar5, cxc.w)) {
                                                    int size2 = arrayList6.size();
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size2) {
                                                            ehcVar = null;
                                                            break;
                                                        }
                                                        int i43 = size2;
                                                        if (((ehc) arrayList6.get(i42)).a == i33) {
                                                            ehcVar = (ehc) arrayList6.get(i42);
                                                            break;
                                                        } else {
                                                            i42++;
                                                            size2 = i43;
                                                        }
                                                    }
                                                    if (ehcVar != null) {
                                                        z = false;
                                                    } else {
                                                        ehcVar = new ehc(i33, arrayList5);
                                                        z = true;
                                                    }
                                                    arrayList5.add(ehcVar);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    gxcVar = cxc.d;
                                                    if (pa7.t(gxcVar5, gxcVar)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zC2 = w79Var2.c(gxcVar);
                                                        i24 = i34;
                                                        if (zC2) {
                                                            lqVar.F(i33, i24, str3);
                                                        }
                                                    } else {
                                                        i15 = i34;
                                                        if (pa7.t(gxcVar5, cxc.b)) {
                                                            E(lqVar, lqVar.A(i33), 2048, num7, i15);
                                                            E(lqVar, lqVar.A(i33), 2048, num8, i15);
                                                        } else if (pa7.t(gxcVar5, cxc.L)) {
                                                            E(lqVar, lqVar.A(i33), 2048, Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE), 8);
                                                            E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                        } else if (pa7.t(gxcVar5, cxc.O)) {
                                                            E(lqVar, lqVar.A(i33), 2048, 3072, 8);
                                                        } else if (pa7.t(gxcVar5, cxc.c)) {
                                                            E(lqVar, lqVar.A(i33), 2048, num7, 8);
                                                            E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                        } else {
                                                            gxcVar2 = cxc.K;
                                                            arrayList6 = arrayList6;
                                                            if (pa7.t(gxcVar5, gxcVar2)) {
                                                                objG6 = w79Var3.g(cxc.z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                i5cVar = (i5c) objG6;
                                                                if (i5cVar == null && i5cVar.a == 4) {
                                                                    objG7 = w79Var3.g(gxcVar2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (pa7.t(objG7, Boolean.TRUE)) {
                                                                        accessibilityEventO = lqVar.o(lqVar.A(i33), 4);
                                                                        ywcVar3 = ywcVar3;
                                                                        layoutNode3 = layoutNode3;
                                                                        ywc ywcVar4 = new ywc(ywcVar3.a, true, layoutNode3, twcVar4);
                                                                        objG8 = ywcVar4.k().a.g(cxc.a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list2 = (List) objG8;
                                                                        strA = list2 != null ? k88.a(list2, ",", null, 62) : null;
                                                                        objG9 = ywcVar4.k().a.g(cxc.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        list = (List) objG9;
                                                                        if (list != null) {
                                                                            strA2 = k88.a(list, ",", null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventO.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventO.getText().add(strA2);
                                                                        }
                                                                        lqVar.C(accessibilityEventO);
                                                                    } else {
                                                                        layoutNode3 = layoutNode3;
                                                                        ywcVar3 = ywcVar3;
                                                                        E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    layoutNode3 = layoutNode3;
                                                                    ywcVar3 = ywcVar3;
                                                                    E(lqVar, lqVar.A(i33), 2048, num7, 8);
                                                                    E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                                }
                                                                num5 = num8;
                                                                i14 = i33;
                                                                w79Var2 = w79Var2;
                                                                num7 = num7;
                                                                arrayList5 = arrayList5;
                                                                i13 = i41;
                                                            } else {
                                                                arrayList5 = arrayList5;
                                                                layoutNode3 = layoutNode3;
                                                                ywcVar3 = ywcVar3;
                                                                i38 = i38;
                                                                if (pa7.t(gxcVar5, cxc.a)) {
                                                                    int iA = lqVar.A(i33);
                                                                    obj2.getClass();
                                                                    lqVar.D(iA, 2048, 4, (List) obj2);
                                                                    num5 = num8;
                                                                    i14 = i33;
                                                                    w79Var2 = w79Var2;
                                                                    num7 = num7;
                                                                } else {
                                                                    gxcVar3 = cxc.G;
                                                                    str = "";
                                                                    if (pa7.t(gxcVar5, gxcVar3)) {
                                                                        if (w79Var3.c(swc.k)) {
                                                                            objG4 = w79Var2.g(gxcVar3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            k00Var2 = (k00) objG4;
                                                                            if (k00Var2 == null) {
                                                                                k00Var2 = "";
                                                                            }
                                                                            objG5 = w79Var3.g(gxcVar3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (k00) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceP = P(charSequence);
                                                                            length = k00Var2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i19 = length2;
                                                                            } else {
                                                                                i19 = length;
                                                                            }
                                                                            num6 = num8;
                                                                            i20 = 0;
                                                                            while (true) {
                                                                                num7 = num7;
                                                                                if (i20 < i19) {
                                                                                    i21 = length;
                                                                                    break;
                                                                                }
                                                                                i21 = length;
                                                                                if (k00Var2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                length = i21;
                                                                                num7 = num7;
                                                                            }
                                                                            i22 = 0;
                                                                            while (true) {
                                                                                if (i22 < i19 - i20) {
                                                                                    i23 = i22;
                                                                                    break;
                                                                                }
                                                                                i23 = i22;
                                                                                if (k00Var2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                    break;
                                                                                } else {
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                            }
                                                                            int i44 = (i21 - i23) - i20;
                                                                            int i45 = (length2 - i23) - i20;
                                                                            gxc gxcVar7 = cxc.N;
                                                                            boolean zC3 = w79Var2.c(gxcVar7);
                                                                            boolean zC4 = w79Var3.c(gxcVar7);
                                                                            zC = w79Var2.c(cxc.G);
                                                                            if (zC || zC3 || !zC4) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (zC || !zC3 || zC4) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (!z2 || z3) {
                                                                                i14 = i33;
                                                                                num8 = num6;
                                                                                accessibilityEventP = lqVar.p(lqVar.A(i33), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                            } else {
                                                                                accessibilityEventP = lqVar.o(lqVar.A(i33), 16);
                                                                                accessibilityEventP.setFromIndex(i20);
                                                                                accessibilityEventP.setRemovedCount(i44);
                                                                                accessibilityEventP.setAddedCount(i45);
                                                                                accessibilityEventP.setBeforeText(k00Var2);
                                                                                accessibilityEventP.getText().add(charSequenceP);
                                                                                i14 = i33;
                                                                                num8 = num6;
                                                                            }
                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                gq.c(ywcVar3, accessibilityEventP);
                                                                            }
                                                                            lqVar.C(accessibilityEventP);
                                                                            if (z2 || z3) {
                                                                                long j5 = ((eue) twcVar4.e(cxc.H)).a;
                                                                                accessibilityEventP.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventP.setToIndex((int) (j5 & 4294967295L));
                                                                                lqVar.C(accessibilityEventP);
                                                                            }
                                                                        } else {
                                                                            i14 = i33;
                                                                            w79Var2 = w79Var2;
                                                                            num7 = num7;
                                                                            E(lqVar, lqVar.A(i14), 2048, Integer.valueOf(i28), 8);
                                                                        }
                                                                        num5 = num8;
                                                                    } else {
                                                                        i14 = i33;
                                                                        w79Var2 = w79Var2;
                                                                        num7 = num7;
                                                                        i13 = i41;
                                                                        gxcVar4 = cxc.H;
                                                                        if (pa7.t(gxcVar5, gxcVar4)) {
                                                                            objG3 = w79Var3.g(gxcVar3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            k00Var = (k00) objG3;
                                                                            if (k00Var != null && (str2 = k00Var.b) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((eue) twcVar4.e(gxcVar4)).a;
                                                                            num5 = num8;
                                                                            lqVar = this;
                                                                            lqVar.C(lqVar.p(lqVar.A(i14), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                            lqVar.G(i35);
                                                                        } else {
                                                                            num5 = num8;
                                                                            if (!pa7.t(gxcVar5, gxcVar6) || pa7.t(gxcVar5, cxc.w)) {
                                                                                lqVar.w(layoutNode3);
                                                                                size = arrayList5.size();
                                                                                i16 = 0;
                                                                                while (true) {
                                                                                    if (i16 >= size) {
                                                                                        arrayList5 = arrayList5;
                                                                                        ehcVar2 = null;
                                                                                        break;
                                                                                    }
                                                                                    arrayList5 = arrayList5;
                                                                                    if (((ehc) arrayList5.get(i16)).a == i14) {
                                                                                        ehcVar2 = (ehc) arrayList5.get(i16);
                                                                                        break;
                                                                                    } else {
                                                                                        i16++;
                                                                                        arrayList5 = arrayList5;
                                                                                    }
                                                                                }
                                                                                ehcVar2.getClass();
                                                                                objG = w79Var3.g(gxcVar6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                ehcVar2.e = (rgc) objG;
                                                                                objG2 = w79Var3.g(cxc.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                ehcVar2.f = (rgc) objG2;
                                                                                if (ehcVar2.b.contains(ehcVar2)) {
                                                                                    lqVar.d.getSnapshotObserver().a.d(ehcVar2, lqVar.b1, new v6(5, ehcVar2, lqVar));
                                                                                }
                                                                            } else if (pa7.t(gxcVar5, cxc.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i18 = 8;
                                                                                    lqVar.C(lqVar.o(lqVar.A(i35), 8));
                                                                                } else {
                                                                                    i18 = 8;
                                                                                }
                                                                                E(lqVar, lqVar.A(i35), 2048, num5, i18);
                                                                            } else {
                                                                                gxc gxcVar8 = swc.x;
                                                                                if (pa7.t(gxcVar5, gxcVar8)) {
                                                                                    List list3 = (List) twcVar4.e(gxcVar8);
                                                                                    Object objG10 = w79Var2.g(gxcVar8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        x79 x79Var = mec.a;
                                                                                        x79 x79Var2 = new x79();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            r3.f();
                                                                                            return;
                                                                                        }
                                                                                        x79 x79Var3 = new x79();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            r3.f();
                                                                                            return;
                                                                                        }
                                                                                        i17 = (i10 == 0 && x79Var2.equals(x79Var3)) ? 0 : 1;
                                                                                    } else {
                                                                                        i17 = (i10 == 0 && list3.isEmpty()) ? 0 : 1;
                                                                                    }
                                                                                    i10 = i17;
                                                                                } else if (i10 == 0 && (obj2 instanceof f6)) {
                                                                                    f6 f6Var = (f6) obj2;
                                                                                    Object objG11 = w79Var2.g(gxcVar5);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (f6Var != objG11) {
                                                                                        if (objG11 instanceof f6) {
                                                                                            String str4 = f6Var.a;
                                                                                            f6 f6Var2 = (f6) objG11;
                                                                                            m26 m26Var2 = f6Var2.b;
                                                                                            if (pa7.t(str4, f6Var2.a) && (((m26Var = f6Var.b) != null || m26Var2 == null) && (m26Var == null || m26Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        i10 = 1;
                                                                                    }
                                                                                    i10 = 0;
                                                                                } else {
                                                                                    i10 = 1;
                                                                                }
                                                                                arrayList5 = arrayList5;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i13 = i41;
                                                            }
                                                        }
                                                    }
                                                    i13 = i41;
                                                } else {
                                                    Object objG12 = w79Var2.g(gxcVar5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (!pa7.t(obj2, objG12)) {
                                                        gxcVar = cxc.d;
                                                        if (pa7.t(gxcVar5, gxcVar)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zC2 = w79Var2.c(gxcVar);
                                                            i24 = i34;
                                                            if (zC2) {
                                                                lqVar.F(i33, i24, str3);
                                                            }
                                                        } else {
                                                            i15 = i34;
                                                            if (pa7.t(gxcVar5, cxc.b)) {
                                                                E(lqVar, lqVar.A(i33), 2048, num7, i15);
                                                                E(lqVar, lqVar.A(i33), 2048, num8, i15);
                                                            } else if (pa7.t(gxcVar5, cxc.L)) {
                                                                E(lqVar, lqVar.A(i33), 2048, Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE), 8);
                                                                E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                            } else if (pa7.t(gxcVar5, cxc.O)) {
                                                                E(lqVar, lqVar.A(i33), 2048, 3072, 8);
                                                            } else if (pa7.t(gxcVar5, cxc.c)) {
                                                                E(lqVar, lqVar.A(i33), 2048, num7, 8);
                                                                E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                            } else {
                                                                gxcVar2 = cxc.K;
                                                                arrayList6 = arrayList6;
                                                                if (pa7.t(gxcVar5, gxcVar2)) {
                                                                    objG6 = w79Var3.g(cxc.z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    i5cVar = (i5c) objG6;
                                                                    if (i5cVar == null) {
                                                                        layoutNode3 = layoutNode3;
                                                                        ywcVar3 = ywcVar3;
                                                                        E(lqVar, lqVar.A(i33), 2048, num7, 8);
                                                                        E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                                    } else {
                                                                        objG7 = w79Var3.g(gxcVar2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        if (pa7.t(objG7, Boolean.TRUE)) {
                                                                            accessibilityEventO = lqVar.o(lqVar.A(i33), 4);
                                                                            ywcVar3 = ywcVar3;
                                                                            layoutNode3 = layoutNode3;
                                                                            ywc ywcVar5 = new ywc(ywcVar3.a, true, layoutNode3, twcVar4);
                                                                            objG8 = ywcVar5.k().a.g(cxc.a);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            List list5 = (List) objG8;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objG9 = ywcVar5.k().a.g(cxc.C);
                                                                            if (objG9 == null) {
                                                                                objG9 = null;
                                                                            }
                                                                            list = (List) objG9;
                                                                            if (list != null) {
                                                                                strA2 = k88.a(list, ",", null, 62);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventO.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventO.getText().add(strA2);
                                                                            }
                                                                            lqVar.C(accessibilityEventO);
                                                                        } else {
                                                                            layoutNode3 = layoutNode3;
                                                                            ywcVar3 = ywcVar3;
                                                                            E(lqVar, lqVar.A(i33), 2048, num8, 8);
                                                                        }
                                                                    }
                                                                    num5 = num8;
                                                                    i14 = i33;
                                                                    w79Var2 = w79Var2;
                                                                    num7 = num7;
                                                                    arrayList5 = arrayList5;
                                                                    i13 = i41;
                                                                } else {
                                                                    arrayList5 = arrayList5;
                                                                    layoutNode3 = layoutNode3;
                                                                    ywcVar3 = ywcVar3;
                                                                    i38 = i38;
                                                                    if (pa7.t(gxcVar5, cxc.a)) {
                                                                        int iA2 = lqVar.A(i33);
                                                                        obj2.getClass();
                                                                        lqVar.D(iA2, 2048, 4, (List) obj2);
                                                                        num5 = num8;
                                                                        i14 = i33;
                                                                        w79Var2 = w79Var2;
                                                                        num7 = num7;
                                                                    } else {
                                                                        gxcVar3 = cxc.G;
                                                                        str = "";
                                                                        if (pa7.t(gxcVar5, gxcVar3)) {
                                                                            if (w79Var3.c(swc.k)) {
                                                                                objG4 = w79Var2.g(gxcVar3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                k00Var2 = (k00) objG4;
                                                                                if (k00Var2 == null) {
                                                                                    k00Var2 = "";
                                                                                }
                                                                                objG5 = w79Var3.g(gxcVar3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (k00) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceP = P(charSequence);
                                                                                length = k00Var2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i19 = length2;
                                                                                } else {
                                                                                    i19 = length;
                                                                                }
                                                                                num6 = num8;
                                                                                i20 = 0;
                                                                                while (true) {
                                                                                    num7 = num7;
                                                                                    if (i20 < i19) {
                                                                                        i21 = length;
                                                                                        break;
                                                                                    }
                                                                                    i21 = length;
                                                                                    if (k00Var2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i20++;
                                                                                        length = i21;
                                                                                        num7 = num7;
                                                                                    }
                                                                                }
                                                                                i22 = 0;
                                                                                while (true) {
                                                                                    if (i22 < i19 - i20) {
                                                                                        i23 = i22;
                                                                                        break;
                                                                                    }
                                                                                    i23 = i22;
                                                                                    if (k00Var2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                                int i46 = (i21 - i23) - i20;
                                                                                int i47 = (length2 - i23) - i20;
                                                                                gxc gxcVar9 = cxc.N;
                                                                                boolean zC5 = w79Var2.c(gxcVar9);
                                                                                boolean zC6 = w79Var3.c(gxcVar9);
                                                                                zC = w79Var2.c(cxc.G);
                                                                                if (zC) {
                                                                                    z2 = false;
                                                                                } else {
                                                                                    z2 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (z2) {
                                                                                    i14 = i33;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = lqVar.p(lqVar.A(i33), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                } else {
                                                                                    i14 = i33;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = lqVar.p(lqVar.A(i33), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                }
                                                                                accessibilityEventP.setClassName("android.widget.EditText");
                                                                                if (Build.VERSION.SDK_INT >= 37) {
                                                                                    gq.c(ywcVar3, accessibilityEventP);
                                                                                }
                                                                                lqVar.C(accessibilityEventP);
                                                                                if (z2) {
                                                                                    long j7 = ((eue) twcVar4.e(cxc.H)).a;
                                                                                    accessibilityEventP.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j7 & 4294967295L));
                                                                                    lqVar.C(accessibilityEventP);
                                                                                } else {
                                                                                    long j8 = ((eue) twcVar4.e(cxc.H)).a;
                                                                                    accessibilityEventP.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j8 & 4294967295L));
                                                                                    lqVar.C(accessibilityEventP);
                                                                                }
                                                                            } else {
                                                                                i14 = i33;
                                                                                w79Var2 = w79Var2;
                                                                                num7 = num7;
                                                                                E(lqVar, lqVar.A(i14), 2048, Integer.valueOf(i28), 8);
                                                                            }
                                                                            num5 = num8;
                                                                        } else {
                                                                            i14 = i33;
                                                                            w79Var2 = w79Var2;
                                                                            num7 = num7;
                                                                            i13 = i41;
                                                                            gxcVar4 = cxc.H;
                                                                            if (pa7.t(gxcVar5, gxcVar4)) {
                                                                                objG3 = w79Var3.g(gxcVar3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                k00Var = (k00) objG3;
                                                                                if (k00Var != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((eue) twcVar4.e(gxcVar4)).a;
                                                                                num5 = num8;
                                                                                lqVar = this;
                                                                                lqVar.C(lqVar.p(lqVar.A(i14), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                                lqVar.G(i35);
                                                                            } else {
                                                                                num5 = num8;
                                                                                if (pa7.t(gxcVar5, gxcVar6)) {
                                                                                    lqVar.w(layoutNode3);
                                                                                    size = arrayList5.size();
                                                                                    i16 = 0;
                                                                                    while (true) {
                                                                                        if (i16 >= size) {
                                                                                            arrayList5 = arrayList5;
                                                                                            ehcVar2 = null;
                                                                                            break;
                                                                                        }
                                                                                        arrayList5 = arrayList5;
                                                                                        if (((ehc) arrayList5.get(i16)).a == i14) {
                                                                                            ehcVar2 = (ehc) arrayList5.get(i16);
                                                                                            break;
                                                                                        } else {
                                                                                            i16++;
                                                                                            arrayList5 = arrayList5;
                                                                                        }
                                                                                    }
                                                                                    ehcVar2.getClass();
                                                                                    objG = w79Var3.g(gxcVar6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    ehcVar2.e = (rgc) objG;
                                                                                    objG2 = w79Var3.g(cxc.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    ehcVar2.f = (rgc) objG2;
                                                                                    if (ehcVar2.b.contains(ehcVar2)) {
                                                                                        lqVar.d.getSnapshotObserver().a.d(ehcVar2, lqVar.b1, new v6(5, ehcVar2, lqVar));
                                                                                    }
                                                                                } else {
                                                                                    lqVar.w(layoutNode3);
                                                                                    size = arrayList5.size();
                                                                                    i16 = 0;
                                                                                    while (true) {
                                                                                        if (i16 >= size) {
                                                                                            arrayList5 = arrayList5;
                                                                                            ehcVar2 = null;
                                                                                            break;
                                                                                        }
                                                                                        arrayList5 = arrayList5;
                                                                                        if (((ehc) arrayList5.get(i16)).a == i14) {
                                                                                            ehcVar2 = (ehc) arrayList5.get(i16);
                                                                                            break;
                                                                                        } else {
                                                                                            i16++;
                                                                                            arrayList5 = arrayList5;
                                                                                        }
                                                                                    }
                                                                                    ehcVar2.getClass();
                                                                                    objG = w79Var3.g(gxcVar6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    ehcVar2.e = (rgc) objG;
                                                                                    objG2 = w79Var3.g(cxc.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    ehcVar2.f = (rgc) objG2;
                                                                                    if (ehcVar2.b.contains(ehcVar2)) {
                                                                                        lqVar.d.getSnapshotObserver().a.d(ehcVar2, lqVar.b1, new v6(5, ehcVar2, lqVar));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i13 = i41;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i13 = i41;
                                                }
                                                i34 = 8;
                                                i33 = i14;
                                                w79Var2 = w79Var2;
                                                layoutNode3 = layoutNode3;
                                                i38 = i38;
                                                arrayList5 = arrayList5;
                                                i39++;
                                                ywcVar3 = ywcVar3;
                                                twcVar3 = twcVar2;
                                                j4 = j >> 8;
                                                length4 = i13;
                                                num8 = num5;
                                                arrayList6 = arrayList6;
                                                num7 = num7;
                                            } else {
                                                twcVar2 = twcVar3;
                                                j = j4;
                                                i39 = i39;
                                                i13 = length4;
                                            }
                                            num5 = num8;
                                            i14 = i33;
                                            i38 = i38;
                                            w79Var2 = w79Var2;
                                            i34 = 8;
                                            i33 = i14;
                                            w79Var2 = w79Var2;
                                            layoutNode3 = layoutNode3;
                                            i38 = i38;
                                            arrayList5 = arrayList5;
                                            i39++;
                                            ywcVar3 = ywcVar3;
                                            twcVar3 = twcVar2;
                                            j4 = j >> 8;
                                            length4 = i13;
                                            num8 = num5;
                                            arrayList6 = arrayList6;
                                            num7 = num7;
                                        }
                                        twcVar = twcVar3;
                                        num3 = num7;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList5;
                                        int i48 = i38;
                                        layoutNode = layoutNode3;
                                        ywcVar = ywcVar3;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num8;
                                        i9 = i33;
                                        w79Var = w79Var2;
                                        i5 = 0;
                                        if (i48 != i34) {
                                            break;
                                        }
                                    } else {
                                        twcVar = twcVar3;
                                        w79Var = w79Var2;
                                        num3 = num7;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList5;
                                        layoutNode = layoutNode3;
                                        ywcVar = ywcVar3;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num8;
                                        i9 = i33;
                                        i5 = 0;
                                    }
                                    if (i37 == i12) {
                                        break;
                                    }
                                    num8 = num4;
                                    i33 = i9;
                                    w79Var2 = w79Var;
                                    layoutNode3 = layoutNode;
                                    arrayList6 = arrayList3;
                                    i34 = 8;
                                    i36 = i37 + 1;
                                    arrayList5 = arrayList4;
                                    length4 = i12;
                                    ywcVar2 = ywcVar;
                                    twcVar3 = twcVar;
                                    num7 = num3;
                                }
                            } else {
                                twcVar = twcVar3;
                                num3 = num7;
                                arrayList3 = arrayList6;
                                arrayList4 = arrayList5;
                                i4 = i31;
                                ywcVar = ywcVar2;
                                i8 = 1;
                                num4 = num8;
                                i9 = i33;
                                i5 = 0;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = twcVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    } else {
                                        if (!ywcVar.k().a.c((gxc) ((Map.Entry) it.next()).getKey())) {
                                            i11 = i8;
                                            break;
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                i7 = 8;
                                E(lqVar, lqVar.A(i9), 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    } else {
                        i3 = i32;
                        num3 = num7;
                        arrayList3 = arrayList6;
                        arrayList4 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i31;
                        i5 = i26;
                        i6 = i27;
                        num4 = num8;
                        i7 = i30;
                    }
                    j3 >>= i7;
                    i32 = i3 + 1;
                    u67Var2 = u67Var;
                    i26 = i5;
                    arrayList5 = arrayList4;
                    num8 = num4;
                    i30 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i6;
                    i31 = i4;
                    arrayList6 = arrayList3;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                int i49 = i27;
                num2 = num8;
                if (i31 != i30) {
                    return;
                } else {
                    i2 = i49;
                }
            } else {
                num = num7;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                num2 = num8;
                i2 = i27;
            }
            if (i2 == i29) {
                return;
            }
            i27 = i2 + 1;
            u67Var2 = u67Var;
            length3 = i29;
            i26 = i;
            arrayList5 = arrayList2;
            num8 = num2;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList6 = arrayList;
            num7 = num;
        }
    }

    public final void I(LayoutNode layoutNode, r69 r69Var) {
        twc twcVarH;
        if (layoutNode.W() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            LayoutNode layoutNode2 = null;
            if (!layoutNode.V0.i(8)) {
                layoutNode = layoutNode.F();
                while (true) {
                    if (layoutNode == null) {
                        layoutNode = null;
                        break;
                    } else if (layoutNode.V0.i(8)) {
                        break;
                    } else {
                        layoutNode = layoutNode.F();
                    }
                }
            }
            if (layoutNode == null || (twcVarH = layoutNode.H()) == null) {
                return;
            }
            if (!twcVarH.c) {
                for (LayoutNode layoutNodeF = layoutNode.F(); layoutNodeF != null; layoutNodeF = layoutNodeF.F()) {
                    twc twcVarH2 = layoutNodeF.H();
                    if (twcVarH2 != null && twcVarH2.c) {
                        layoutNode2 = layoutNodeF;
                        break;
                    }
                }
                if (layoutNode2 != null) {
                    layoutNode = layoutNode2;
                }
            }
            int i = layoutNode.b;
            if (r69Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(LayoutNode layoutNode) {
        if (layoutNode.W() && !this.d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i = layoutNode.b;
            rgc rgcVar = (rgc) this.E0.b(i);
            rgc rgcVar2 = (rgc) this.F0.b(i);
            if (rgcVar == null && rgcVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (rgcVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) rgcVar.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) rgcVar.b.invoke()).floatValue());
            }
            if (rgcVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) rgcVar2.a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) rgcVar2.b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(ywc ywcVar, int i, int i2, boolean z) {
        String strT;
        twc twcVar = ywcVar.d;
        int i3 = ywcVar.f;
        gxc gxcVar = swc.j;
        if (twcVar.a.c(gxcVar) && bzd.r(ywcVar)) {
            n26 n26Var = (n26) ((f6) ywcVar.d.e(gxcVar)).b;
            if (n26Var != null) {
                return ((Boolean) n26Var.m(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.I0) && (strT = t(ywcVar)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.I0 = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.I0) : null, z2 ? Integer.valueOf(this.I0) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        AndroidComposeView androidComposeView = this.d;
        long jQ = androidComposeView.q(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jQ2 = androidComposeView.q((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jQ >> 32);
        int i2 = (int) (jQ2 >> 32);
        int i3 = (int) (jQ & 4294967295L);
        int i4 = (int) (jQ2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        zwc zwcVar;
        r69 r69Var = new r69();
        r69 r69Var2 = this.P0;
        int[] iArr = r69Var2.b;
        long[] jArr3 = r69Var2.a;
        int length = jArr3.length - 2;
        q69 q69Var = this.V0;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            axc axcVar = (axc) s().b(i6);
                            Object obj = null;
                            ywc ywcVar = axcVar != null ? axcVar.a : null;
                            if (ywcVar != null) {
                                if (!ywcVar.d.a.c(cxc.d)) {
                                    r69Var.a(i6);
                                    zwcVar = (zwc) q69Var.b(i6);
                                    if (zwcVar != null) {
                                        Object objG = zwcVar.a.a.g(cxc.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(i6, 32, obj);
                                }
                            } else {
                                r69Var.a(i6);
                                zwcVar = (zwc) q69Var.b(i6);
                                if (zwcVar != null) {
                                    Object objG2 = zwcVar.a.a.g(cxc.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = r69Var.b;
        long[] jArr4 = r69Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = r69Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = r69Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (r69Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                r69Var2.g(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        q69Var.c();
        u67 u67VarS = s();
        int[] iArr3 = u67VarS.b;
        Object[] objArr = u67VarS.c;
        long[] jArr6 = u67VarS.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            ywc ywcVar2 = ((axc) objArr[i25]).a;
                            twc twcVar = ywcVar2.d;
                            gxc gxcVar = cxc.d;
                            if (twcVar.a.c(gxcVar) && r69Var2.a(i26)) {
                                F(i26, 16, (String) ywcVar2.d.e(gxcVar));
                            }
                            q69Var.i(i26, new zwc(ywcVar2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.W0 = new zwc(this.d.getSemanticsOwner().a(), s());
    }

    @Override // defpackage.i6
    public final kd9 b(View view) {
        return this.x;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    public final void j(int i, t6 t6Var, String str, Bundle bundle) {
        ywc ywcVar;
        RectF[] rectFArr;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        axc axcVar = (axc) s().b(i);
        if (axcVar == null || (ywcVar = axcVar.a) == null) {
            return;
        }
        LayoutNode layoutNode = ywcVar.c;
        twc twcVar = ywcVar.d;
        w79 w79Var = twcVar.a;
        String strT = t(ywcVar);
        if (pa7.t(str, this.S0)) {
            int iD = this.Q0.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (pa7.t(str, this.T0)) {
            int iD2 = this.R0.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = w79Var.c(swc.a);
        AndroidComposeView androidComposeView = this.d;
        int i3 = 0;
        if (zC && bundle != null && pa7.t(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                    ste steVarC = ndc.c(twcVar);
                    if (steVarC == null) {
                        rectFArr = null;
                    } else {
                        c47 c47Var = (c47) layoutNode.V0.d;
                        if (!c47Var.t1.Y) {
                            c47Var = null;
                        }
                        if (c47Var != null) {
                            long jN = c47Var.N(0L);
                            hkb hkbVarG = ywcVar.g();
                            RectF[] rectFArr2 = new RectF[i5];
                            while (i3 < i5) {
                                int i6 = i4 + i3;
                                if (i6 >= steVarC.a.a.b.length()) {
                                    i2 = i3;
                                } else {
                                    hkb hkbVarK = steVarC.b(i6).k(jN);
                                    hkb hkbVarG2 = hkbVarK.i(hkbVarG) ? hkbVarK.g(hkbVarG) : null;
                                    if (hkbVarG2 != null) {
                                        i2 = i3;
                                        long jQ = androidComposeView.q((((long) Float.floatToRawIntBits(hkbVarG2.a)) << 32) | (((long) Float.floatToRawIntBits(hkbVarG2.b)) & 4294967295L));
                                        long jQ2 = androidComposeView.q((((long) Float.floatToRawIntBits(hkbVarG2.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(hkbVarG2.c)) << 32));
                                        int i7 = (int) (jQ >> 32);
                                        int i8 = (int) (jQ2 >> 32);
                                        int i9 = (int) (jQ & 4294967295L);
                                        int i10 = (int) (jQ2 & 4294967295L);
                                        rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                i3 = i2 + 1;
                                steVarC = steVarC;
                                i5 = i5;
                                hkbVarG = hkbVarG;
                                i4 = i4;
                            }
                            rectFArr = rectFArr2;
                        } else {
                            rectFArr = null;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            b1.d("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        gxc gxcVar = cxc.A;
        if (w79Var.c(gxcVar) && bundle != null && pa7.t(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = w79Var.g(gxcVar);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (pa7.t(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, ywcVar.f);
            return;
        }
        if (pa7.t(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = w79Var.g(cxc.S);
            x4d x4dVar = (x4d) (objG2 == null ? null : objG2);
            if (x4dVar != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                hkb hkbVarU = u(ywcVar, rect, x4dVar);
                float f = hkbVarU.b;
                float f2 = hkbVarU.a;
                vs9 vs9VarA = x4dVar.a(hkbVarU.e(), layoutNode.P0, androidComposeView.getDensity());
                if (vs9VarA instanceof ts9) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(vs9VarA, f2, f));
                    return;
                } else if (vs9VarA instanceof us9) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(vs9VarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(vs9VarA));
                    return;
                } else if (!(vs9VarA instanceof ss9)) {
                    ap.c();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(vs9VarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (pa7.t(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = w79Var.g(cxc.S);
            x4d x4dVar2 = (x4d) (objG3 == null ? null : objG3);
            if (x4dVar2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                hkb hkbVarU2 = u(ywcVar, rect2, x4dVar2);
                Rect rectL = L(x4dVar2.a(hkbVarU2.e(), layoutNode.P0, androidComposeView.getDensity()), hkbVarU2.a, hkbVarU2.b);
                if (rectL != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (pa7.t(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = w79Var.g(cxc.S);
            x4d x4dVar3 = (x4d) (objG4 == null ? null : objG4);
            if (x4dVar3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrN = N(x4dVar3.a(u(ywcVar, rect3, x4dVar3).e(), layoutNode.P0, androidComposeView.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (pa7.t(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = w79Var.g(cxc.S);
            x4d x4dVar4 = (x4d) (objG5 == null ? null : objG5);
            if (x4dVar4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                hkb hkbVarU3 = u(ywcVar, rect4, x4dVar4);
                Region regionO = O(x4dVar4.a(hkbVarU3.e(), layoutNode.P0, androidComposeView.getDensity()), hkbVarU3.a, hkbVarU3.b);
                if (regionO != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(axc axcVar) {
        a77 a77Var = axcVar.b;
        return M(a77Var.a, a77Var.b, a77Var.c, a77Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0030, B:24:0x005e, B:28:0x0070, B:30:0x0078, B:32:0x0081, B:39:0x009f, B:42:0x00ae, B:43:0x00b6, B:44:0x00b9, B:45:0x00ba, B:20:0x0048, B:23:0x004f, B:33:0x0086, B:35:0x008b, B:38:0x009c), top: B:52:0x0022, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0030, B:24:0x005e, B:28:0x0070, B:30:0x0078, B:32:0x0081, B:39:0x009f, B:42:0x00ae, B:43:0x00b6, B:44:0x00b9, B:45:0x00ba, B:20:0x0048, B:23:0x004f, B:33:0x0086, B:35:0x008b, B:38:0x009c), top: B:52:0x0022, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[Catch: all -> 0x009a, LOOP:0: B:34:0x0089->B:35:0x008b, LOOP_END, TryCatch #1 {all -> 0x009a, blocks: (B:33:0x0086, B:35:0x008b, B:38:0x009c), top: B:54:0x0086, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        if (defpackage.vfh.q(r7, r0) == r5) goto L47;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d3 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.zn2 r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq.l(zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean m(int i, long j, boolean z) {
        gxc gxcVar;
        int i2;
        if (pa7.t(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            u67 u67VarS = s();
            if (!hl9.c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    gxcVar = cxc.w;
                } else {
                    if (z) {
                        ap.c();
                        return false;
                    }
                    gxcVar = cxc.v;
                }
                Object[] objArr = u67VarS.c;
                long[] jArr = u67VarS.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    axc axcVar = (axc) objArr[(i3 << 3) + i6];
                                    a77 a77Var = axcVar.b;
                                    float f = a77Var.a;
                                    i2 = i4;
                                    float f2 = a77Var.b;
                                    float f3 = a77Var.c;
                                    float f4 = a77Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = axcVar.a.d.a.g(gxcVar);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        rgc rgcVar = (rgc) objG;
                                        if (rgcVar != null) {
                                            x16 x16Var = rgcVar.a;
                                            if (i < 0) {
                                                if (((Number) x16Var.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) x16Var.invoke()).floatValue() < ((Number) rgcVar.b.invoke()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.getSemanticsOwner().a(), this.W0);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        axc axcVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (v() && (axcVar = (axc) s().b(i)) != null) {
            ywc ywcVar = axcVar.a;
            accessibilityEventObtain.setPassword(ywcVar.d.a.c(cxc.N));
            Object objG = ywcVar.d.a.g(cxc.o);
            if (objG == null) {
                objG = null;
            }
            boolean zT = pa7.t(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                hgc.R(accessibilityEventObtain, zT);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.w = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.w = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager.isEnabled()) {
            this.w = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.d.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.Z0);
        AccessibilityManager accessibilityManager = this.g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(ywc ywcVar) {
        twc twcVar = ywcVar.d;
        if (!twcVar.a.c(cxc.a)) {
            gxc gxcVar = cxc.H;
            if (twcVar.a.c(gxcVar)) {
                return (int) (((eue) twcVar.e(gxcVar)).a & 4294967295L);
            }
        }
        return this.I0;
    }

    public final int r(ywc ywcVar) {
        twc twcVar = ywcVar.d;
        if (!twcVar.a.c(cxc.a)) {
            gxc gxcVar = cxc.H;
            if (twcVar.a.c(gxcVar)) {
                return (int) (((eue) twcVar.e(gxcVar)).a >> 32);
            }
        }
        return this.I0;
    }

    public final u67 s() {
        if (this.M0) {
            this.M0 = false;
            AndroidComposeView androidComposeView = this.d;
            this.O0 = x57.P(androidComposeView.getSemanticsOwner(), new z4(21));
            if (v()) {
                q69 q69Var = this.O0;
                Resources resources = androidComposeView.getContext().getResources();
                o69 o69Var = this.Q0;
                o69Var.a();
                o69 o69Var2 = this.R0;
                o69Var2.a();
                axc axcVar = (axc) q69Var.b(-1);
                ywc ywcVar = axcVar != null ? axcVar.a : null;
                ywcVar.getClass();
                ArrayList arrayListB = ixc.b(ywcVar, new c1(12, q69Var), new c1(13, resources), t72.H(ywcVar));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((ywc) arrayListB.get(i - 1)).f;
                        int i3 = ((ywc) arrayListB.get(i)).f;
                        o69Var.f(i2, i3);
                        o69Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.O0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final hkb u(ywc ywcVar, Rect rect, x4d x4dVar) {
        kq kqVar = new kq(x4dVar);
        LayoutNode layoutNode = ywcVar.c;
        i09 i09Var = (i09) layoutNode.V0.g;
        rv3 rv3Var = null;
        if ((i09Var.d & 8) != 0) {
            loop0: while (i09Var != null) {
                if ((i09Var.c & 8) == 0) {
                    if ((i09Var.d & 8) != 0) {
                        break;
                        break;
                    }
                    i09Var = i09Var.f;
                } else {
                    i09 i09VarM0 = i09Var;
                    p89 p89Var = null;
                    while (i09VarM0 != null) {
                        if (i09VarM0 instanceof wwc) {
                            ((wwc) i09VarM0).R0(kqVar);
                            if (kqVar.a) {
                                rv3Var = i09VarM0;
                                break loop0;
                            }
                        } else if ((i09VarM0.c & 8) != 0 && (i09VarM0 instanceof sv3)) {
                            int i = 0;
                            for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                if ((i09Var2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        i09VarM0 = i09Var2;
                                    } else {
                                        if (p89Var == null) {
                                            p89Var = new p89(0, new i09[16]);
                                        }
                                        if (i09VarM0 != null) {
                                            p89Var.b(i09VarM0);
                                            i09VarM0 = null;
                                        }
                                        p89Var.b(i09Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        i09VarM0 = vd0.m0(p89Var);
                    }
                    if ((i09Var.d & 8) != 0) {
                        break;
                    }
                    i09Var = i09Var.f;
                }
            }
        }
        rv3 rv3Var2 = (wwc) rv3Var;
        if (rv3Var2 == null || !((i09) rv3Var2).a.Y) {
            return vd0.N(layoutNode.getOuterCoordinator$ui(), false);
        }
        yf9 yf9VarR0 = vd0.r0(rv3Var2);
        hkb hkbVarM = vd0.S(yf9VarR0).M(yf9VarR0, false);
        Rect rectM = M(hkbVarM.a, hkbVarM.b, hkbVarM.c, hkbVarM.d);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new hkb(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.w;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.w = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(LayoutNode layoutNode) {
        if (this.K0.add(layoutNode)) {
            this.L0.d(wef.a);
        }
    }
}
