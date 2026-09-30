package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import defpackage.a26;
import defpackage.abg;
import defpackage.ap;
import defpackage.bv7;
import defpackage.c47;
import defpackage.cxc;
import defpackage.eb3;
import defpackage.f6;
import defpackage.fy9;
import defpackage.hkb;
import defpackage.j09;
import defpackage.j6;
import defpackage.k82;
import defpackage.lw7;
import defpackage.mue;
import defpackage.n09;
import defpackage.pa7;
import defpackage.s72;
import defpackage.ste;
import defpackage.swc;
import defpackage.twc;
import defpackage.v4e;
import defpackage.vd0;
import defpackage.w79;
import defpackage.wo0;
import defpackage.wue;
import defpackage.y72;
import defpackage.z18;
import io.sentry.android.replay.d0;
import io.sentry.q5;
import io.sentry.z0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final lw7 a = eb3.N(z18.c, a.a);
    public static boolean b;
    public static WeakReference c;

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    public static boolean a(twc twcVar, boolean z, j6 j6Var) {
        String str;
        Object obj = null;
        if (twcVar != null) {
            Object objG = twcVar.a.g(d0.a);
            obj = (String) (objG != null ? objG : null);
        }
        if (pa7.t(obj, "unmask")) {
            j6Var.x();
            return false;
        }
        if (pa7.t(obj, "mask")) {
            j6Var.x();
            return true;
        }
        if (z) {
            str = "android.widget.ImageView";
        } else if (twcVar != null) {
            w79 w79Var = twcVar.a;
            if (w79Var.c(cxc.C) || w79Var.c(swc.k) || w79Var.c(cxc.G)) {
                str = "android.widget.TextView";
            } else {
                str = "android.view.View";
            }
        } else {
            str = "android.view.View";
        }
        if (((CopyOnWriteArraySet) j6Var.b).contains(str)) {
            return false;
        }
        return ((CopyOnWriteArraySet) j6Var.a).contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0272  */
    /* JADX WARN: Code duplicated, block: B:106:0x027c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0281  */
    /* JADX WARN: Code duplicated, block: B:114:0x0295  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x0319  */
    /* JADX WARN: Code duplicated, block: B:137:0x031e  */
    /* JADX WARN: Code duplicated, block: B:140:0x032e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0333  */
    /* JADX WARN: Code duplicated, block: B:144:0x0337  */
    /* JADX WARN: Code duplicated, block: B:147:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x034e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0351  */
    /* JADX WARN: Code duplicated, block: B:153:0x035f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0390  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x03d7 A[Catch: all -> 0x03db, EDGE_INSN: B:161:0x03d7->B:165:0x03e1 BREAK  A[LOOP:2: B:156:0x03a7->B:164:0x03de], TRY_LEAVE, TryCatch #6 {all -> 0x03db, blocks: (B:159:0x03c1, B:161:0x03d7), top: B:234:0x03c1 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x03de A[LOOP:2: B:156:0x03a7->B:164:0x03de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:173:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:175:0x040c  */
    /* JADX WARN: Code duplicated, block: B:180:0x041e  */
    /* JADX WARN: Code duplicated, block: B:182:0x042a  */
    /* JADX WARN: Code duplicated, block: B:183:0x042c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0434  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:197:0x047d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0496  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:207:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:211:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:214:0x04de  */
    /* JADX WARN: Code duplicated, block: B:234:0x03c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x021b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0231  */
    /* JADX WARN: Code duplicated, block: B:90:0x024d A[PHI: r9
  0x024d: PHI (r9v6 boolean) = (r9v15 boolean), (r9v17 boolean) binds: [B:89:0x024b, B:84:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0252  */
    /* JADX WARN: Code duplicated, block: B:96:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [bv7] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [bv7] */
    public static void b(LayoutNode layoutNode, g gVar, boolean z, j6 j6Var, z0 z0Var) throws Throwable {
        List<LayoutNode> children$ui;
        List<LayoutNode> children$ui2;
        ArrayList arrayList;
        int size;
        int i;
        LayoutNode layoutNode2;
        boolean zX;
        ArrayList arrayList2;
        int i2;
        g gVar2;
        ?? r15;
        g fVar;
        ArrayList arrayList3;
        ?? S;
        hkb hkbVar;
        int i3;
        g cVar;
        ?? r6;
        twc twcVarH;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List listD;
        int size2;
        int i5;
        fy9 fy9Var;
        boolean z6;
        boolean z7;
        fy9 fy9Var2;
        boolean z8;
        String name;
        j09 j09Var;
        Object obj;
        boolean z9;
        ArrayList arrayList4;
        ste steVar;
        y72 y72Var;
        boolean z10;
        wue wueVar;
        long j;
        boolean zA;
        io.sentry.d dVar;
        Integer numValueOf;
        mue mueVar;
        mue mueVar2;
        Object objG;
        f6 f6Var;
        a26 a26Var;
        bv7 bv7Var;
        g gVar3 = gVar;
        lw7 lw7Var = a;
        Boolean bool = io.sentry.config.a.a;
        Boolean bool2 = Boolean.FALSE;
        g gVar4 = null;
        if (pa7.t(bool, bool2)) {
            children$ui = layoutNode.getChildren$ui();
        } else {
            if (!pa7.t(bool, Boolean.TRUE)) {
                if (bool != null) {
                    ap.c();
                    return;
                }
                try {
                    children$ui2 = layoutNode.getChildren$ui();
                    io.sentry.config.a.a = bool2;
                } catch (NoSuchMethodError unused) {
                    io.sentry.config.a.a = Boolean.TRUE;
                    Method method = (Method) io.sentry.config.a.n().b;
                    method.getClass();
                    Object objInvoke = method.invoke(layoutNode, null);
                    objInvoke.getClass();
                    children$ui = (List) objInvoke;
                    children$ui2 = children$ui;
                }
                if (children$ui2.isEmpty()) {
                    return;
                }
                arrayList = new ArrayList(children$ui2.size());
                size = children$ui2.size();
                for (i = 0; i < size; i = i2 + 1) {
                    layoutNode2 = children$ui2.get(i);
                    zX = layoutNode2.X();
                    wo0 wo0Var = layoutNode2.V0;
                    if (zX || !layoutNode2.W()) {
                        children$ui2 = children$ui2;
                        arrayList2 = arrayList;
                        size = size;
                        i2 = i;
                        layoutNode2 = layoutNode2;
                        gVar2 = gVar4;
                        r15 = 0;
                        fVar = gVar2;
                    } else {
                        if (z) {
                            c = new WeakReference(vd0.S((c47) wo0Var.d));
                        }
                        c47 c47Var = (c47) wo0Var.d;
                        WeakReference weakReference = c;
                        if (weakReference != null) {
                            bv7Var = (bv7) weakReference.get();
                        } else {
                            S = gVar4;
                        }
                        if (S == 0) {
                            S = bv7Var;
                            S = vd0.S(c47Var);
                        }
                        S = bv7Var;
                        float fL = (int) (S.l() >> 32);
                        int i6 = i;
                        float fL2 = (int) (S.l() & 4294967295L);
                        hkb hkbVarM = S.M(c47Var, true);
                        float f = hkbVarM.a;
                        if (f < 0.0f) {
                            f = 0.0f;
                        }
                        if (f > fL) {
                            f = fL;
                        }
                        float f2 = hkbVarM.b;
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (f2 > fL2) {
                            f2 = fL2;
                        }
                        float f3 = hkbVarM.c;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        if (f3 <= fL) {
                            fL = f3;
                        }
                        float f4 = hkbVarM.d;
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                        if (f4 <= fL2) {
                            fL2 = f4;
                        }
                        if (f == fL || f2 == fL2) {
                            hkbVar = new hkb(0.0f, 0.0f, 0.0f, 0.0f);
                            arrayList2 = arrayList;
                            i2 = i6;
                        } else {
                            List<LayoutNode> list = children$ui2;
                            long jC = S.c((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                            long jC2 = S.c((((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                            long jC3 = S.c((((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(fL2)) & 4294967295L));
                            long jC4 = S.c((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fL2)) & 4294967295L));
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC2 >> 32));
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC4 >> 32));
                            ArrayList arrayList5 = arrayList;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC3 >> 32));
                            float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                            float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                            children$ui2 = list;
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jC & 4294967295L));
                            arrayList2 = arrayList5;
                            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jC2 & 4294967295L));
                            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jC4 & 4294967295L));
                            i2 = i6;
                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jC3 & 4294967295L));
                            hkbVar = new hkb(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                        }
                        try {
                            twcVarH = layoutNode2.H();
                        } catch (Throwable th) {
                            try {
                                if (((Method) lw7Var.getValue()) != null) {
                                    Method method2 = (Method) lw7Var.getValue();
                                    method2.getClass();
                                    try {
                                        twcVarH = (twc) method2.invoke(layoutNode2, null);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        gVar2 = null;
                                        i3 = 0;
                                        if (!b) {
                                            b = true;
                                            z0Var.c(q5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                                        }
                                        if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                            throw th;
                                        }
                                        int I = layoutNode2.I();
                                        int iR = layoutNode2.r();
                                        float f5 = gVar3.c;
                                        if (io.sentry.config.a.t(layoutNode2)) {
                                            r6 = i3;
                                        } else {
                                            r6 = i3;
                                        }
                                        cVar = new c(I, iR, f5, gVar3, true, r6, io.sentry.config.a.x(hkbVar));
                                        i4 = i3;
                                    }
                                } else {
                                    i3 = 0;
                                    gVar2 = null;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (!b) {
                                            b = true;
                                            z0Var.c(q5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                                        }
                                        if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                            throw th;
                                        }
                                        int I2 = layoutNode2.I();
                                        int iR2 = layoutNode2.r();
                                        float f6 = gVar3.c;
                                        if (io.sentry.config.a.t(layoutNode2)) {
                                            r6 = i3;
                                        } else {
                                            r6 = i3;
                                        }
                                        cVar = new c(I2, iR2, f6, gVar3, true, r6, io.sentry.config.a.x(hkbVar));
                                        i4 = i3;
                                        fVar = cVar;
                                        r15 = i4;
                                        arrayList3 = arrayList2;
                                        if (fVar != null) {
                                            arrayList3.add(fVar);
                                            b(layoutNode2, fVar, r15, j6Var, z0Var);
                                        }
                                        arrayList = arrayList3;
                                        children$ui2 = children$ui2;
                                        size = size;
                                        gVar4 = gVar2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                i3 = 0;
                                gVar2 = null;
                            }
                            if (!b) {
                                b = true;
                                z0Var.c(q5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                            }
                            if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                throw th;
                            }
                            int I3 = layoutNode2.I();
                            int iR3 = layoutNode2.r();
                            float f7 = gVar3.c;
                            if (io.sentry.config.a.t(layoutNode2) || hkbVar.d - hkbVar.b <= 0.0f || hkbVar.c - hkbVar.a <= 0.0f) {
                                r6 = i3;
                            } else {
                                r6 = 1;
                            }
                            cVar = new c(I3, iR3, f7, gVar3, true, r6, io.sentry.config.a.x(hkbVar));
                            i4 = i3;
                            fVar = cVar;
                            r15 = i4;
                            arrayList3 = arrayList2;
                            if (fVar != null) {
                                arrayList3.add(fVar);
                                b(layoutNode2, fVar, r15, j6Var, z0Var);
                            }
                            arrayList = arrayList3;
                            children$ui2 = children$ui2;
                            size = size;
                            gVar4 = gVar2;
                        }
                        if (io.sentry.config.a.t(layoutNode2)) {
                            z2 = false;
                        } else if (twcVarH != null) {
                            if (twcVarH.a.c(cxc.p)) {
                                z2 = false;
                            } else if (hkbVar.d - hkbVar.b > 0.0f || hkbVar.c - hkbVar.a <= 0.0f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (hkbVar.d - hkbVar.b > 0.0f) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (twcVarH != null) {
                            z3 = true;
                            z4 = twcVarH.a.c(swc.k) ? z3 : false;
                            if (twcVarH != null) {
                                if (twcVarH.a.c(cxc.C) != z3) {
                                    if (z4) {
                                        children$ui2 = children$ui2;
                                        size = size;
                                        arrayList2 = arrayList2;
                                        layoutNode2 = layoutNode2;
                                        z5 = z2;
                                        i2 = i2;
                                        i4 = 0;
                                        i4 = 0;
                                        gVar2 = null;
                                        listD = layoutNode2.D();
                                        size2 = listD.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size2) {
                                                j09Var = ((n09) listD.get(i5)).a;
                                                if (v4e.F(j09Var.getClass().getName(), "Painter", false)) {
                                                    try {
                                                        Field declaredField = j09Var.getClass().getDeclaredField("painter");
                                                        declaredField.setAccessible(true);
                                                        obj = declaredField.get(j09Var);
                                                        if (obj instanceof fy9) {
                                                            fy9Var = (fy9) obj;
                                                            break;
                                                        }
                                                    } catch (Throwable unused2) {
                                                    }
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            fy9Var = null;
                                            break;
                                        }
                                        if (fy9Var != null) {
                                            if (z5 || !a(twcVarH, true, j6Var)) {
                                                z7 = false;
                                            } else {
                                                z7 = true;
                                            }
                                            int I4 = layoutNode2.I();
                                            fy9Var2 = fy9Var;
                                            int iR4 = layoutNode2.r();
                                            float f8 = gVar3.c;
                                            if (z7) {
                                                name = fy9Var2.getClass().getName();
                                                if (!v4e.F(name, "Vector", false) || v4e.F(name, "Color", false) || v4e.F(name, "Brush", false)) {
                                                    z8 = false;
                                                } else {
                                                    z8 = true;
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                            cVar = new d(I4, iR4, f8, gVar3, z8, z5, io.sentry.config.a.x(hkbVar));
                                        } else {
                                            if (z5 || !a(twcVarH, false, j6Var)) {
                                                z6 = false;
                                            } else {
                                                z6 = true;
                                            }
                                            cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.x(hkbVar));
                                        }
                                        fVar = cVar;
                                        r15 = i4;
                                    }
                                }
                                if (z2 || !a(twcVarH, false, j6Var)) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                arrayList4 = new ArrayList();
                                if (twcVarH != null) {
                                    objG = twcVarH.a.g(swc.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    f6Var = (f6) objG;
                                    if (f6Var != null && (a26Var = (a26) f6Var.b) != null) {
                                    }
                                }
                                steVar = (ste) s72.x0(arrayList4);
                                if (steVar != null || (mueVar2 = steVar.a.b) == null) {
                                    y72Var = null;
                                } else {
                                    y72Var = new y72(mueVar2.c());
                                }
                                if (y72Var == null && y72Var.a == 16) {
                                    List listD2 = layoutNode2.D();
                                    int size3 = listD2.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < size3) {
                                            List list2 = listD2;
                                            j09 j09Var2 = ((n09) listD2.get(i7)).a;
                                            int i8 = size3;
                                            int i9 = i7;
                                            z10 = z4;
                                            if (v4e.F(j09Var2.getClass().getName(), "Text", false)) {
                                                try {
                                                    Field declaredField2 = j09Var2.getClass().getDeclaredField("color");
                                                    declaredField2.setAccessible(true);
                                                    Object obj2 = declaredField2.get(j09Var2);
                                                    k82 k82Var = obj2 instanceof k82 ? (k82) obj2 : null;
                                                    if (k82Var != null) {
                                                        y72Var = new y72(k82Var.a());
                                                        break;
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            } else {
                                                i7 = i9 + 1;
                                                listD2 = list2;
                                                size3 = i8;
                                                z4 = z10;
                                            }
                                        } else {
                                            z10 = z4;
                                        }
                                        y72Var = null;
                                        break;
                                    }
                                } else {
                                    z10 = z4;
                                }
                                if (steVar != null || (mueVar = steVar.a.b) == null) {
                                    wueVar = null;
                                } else {
                                    wueVar = new wue(mueVar.a.b);
                                }
                                j = wue.c;
                                if (wueVar == null) {
                                    zA = false;
                                } else {
                                    zA = wue.a(wueVar.a, j);
                                }
                                if (steVar != null || z10 || zA) {
                                    dVar = null;
                                } else {
                                    dVar = new io.sentry.d(6, steVar);
                                }
                                if (y72Var != null) {
                                    numValueOf = Integer.valueOf(abg.Z(y72Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.x(hkbVar));
                                gVar3 = gVar;
                            } else if (z4) {
                                children$ui2 = children$ui2;
                                size = size;
                                arrayList2 = arrayList2;
                                layoutNode2 = layoutNode2;
                                z5 = z2;
                                i2 = i2;
                                i4 = 0;
                                i4 = 0;
                                gVar2 = null;
                                listD = layoutNode2.D();
                                size2 = listD.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        j09Var = ((n09) listD.get(i5)).a;
                                        if (v4e.F(j09Var.getClass().getName(), "Painter", false)) {
                                            Field declaredField3 = j09Var.getClass().getDeclaredField("painter");
                                            declaredField3.setAccessible(true);
                                            obj = declaredField3.get(j09Var);
                                            if (obj instanceof fy9) {
                                                fy9Var = (fy9) obj;
                                                break;
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    fy9Var = null;
                                    break;
                                }
                                if (fy9Var != null) {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    int I5 = layoutNode2.I();
                                    fy9Var2 = fy9Var;
                                    int iR5 = layoutNode2.r();
                                    float f9 = gVar3.c;
                                    if (z7) {
                                        name = fy9Var2.getClass().getName();
                                        if (v4e.F(name, "Vector", false)) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                    } else {
                                        z8 = false;
                                    }
                                    cVar = new d(I5, iR5, f9, gVar3, z8, z5, io.sentry.config.a.x(hkbVar));
                                } else {
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.x(hkbVar));
                                }
                                fVar = cVar;
                                r15 = i4;
                            } else {
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (twcVarH != null) {
                                    objG = twcVarH.a.g(swc.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    f6Var = (f6) objG;
                                    if (f6Var != null) {
                                    }
                                }
                                steVar = (ste) s72.x0(arrayList4);
                                if (steVar != null) {
                                    y72Var = null;
                                } else {
                                    y72Var = null;
                                }
                                if (y72Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (steVar != null) {
                                    wueVar = null;
                                } else {
                                    wueVar = null;
                                }
                                j = wue.c;
                                if (wueVar == null) {
                                    zA = false;
                                } else {
                                    zA = wue.a(wueVar.a, j);
                                }
                                if (steVar != null) {
                                    dVar = null;
                                } else {
                                    dVar = null;
                                }
                                if (y72Var != null) {
                                    numValueOf = Integer.valueOf(abg.Z(y72Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.x(hkbVar));
                                gVar3 = gVar;
                            }
                        } else {
                            z3 = true;
                        }
                        if (twcVarH != null) {
                            if (twcVarH.a.c(cxc.G) == z3) {
                            }
                            if (twcVarH != null) {
                                if (twcVarH.a.c(cxc.C) != z3) {
                                    if (z4) {
                                        children$ui2 = children$ui2;
                                        size = size;
                                        arrayList2 = arrayList2;
                                        layoutNode2 = layoutNode2;
                                        z5 = z2;
                                        i2 = i2;
                                        i4 = 0;
                                        i4 = 0;
                                        gVar2 = null;
                                        listD = layoutNode2.D();
                                        size2 = listD.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size2) {
                                                j09Var = ((n09) listD.get(i5)).a;
                                                if (v4e.F(j09Var.getClass().getName(), "Painter", false)) {
                                                    Field declaredField4 = j09Var.getClass().getDeclaredField("painter");
                                                    declaredField4.setAccessible(true);
                                                    obj = declaredField4.get(j09Var);
                                                    if (obj instanceof fy9) {
                                                        fy9Var = (fy9) obj;
                                                        break;
                                                    }
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            fy9Var = null;
                                            break;
                                        }
                                        if (fy9Var != null) {
                                            if (z5) {
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                            }
                                            int I6 = layoutNode2.I();
                                            fy9Var2 = fy9Var;
                                            int iR6 = layoutNode2.r();
                                            float f10 = gVar3.c;
                                            if (z7) {
                                                name = fy9Var2.getClass().getName();
                                                if (v4e.F(name, "Vector", false)) {
                                                    z8 = false;
                                                } else {
                                                    z8 = false;
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                            cVar = new d(I6, iR6, f10, gVar3, z8, z5, io.sentry.config.a.x(hkbVar));
                                        } else {
                                            if (z5) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.x(hkbVar));
                                        }
                                        fVar = cVar;
                                        r15 = i4;
                                    }
                                }
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (twcVarH != null) {
                                    objG = twcVarH.a.g(swc.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    f6Var = (f6) objG;
                                    if (f6Var != null) {
                                    }
                                }
                                steVar = (ste) s72.x0(arrayList4);
                                if (steVar != null) {
                                    y72Var = null;
                                } else {
                                    y72Var = null;
                                }
                                if (y72Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (steVar != null) {
                                    wueVar = null;
                                } else {
                                    wueVar = null;
                                }
                                j = wue.c;
                                if (wueVar == null) {
                                    zA = false;
                                } else {
                                    zA = wue.a(wueVar.a, j);
                                }
                                if (steVar != null) {
                                    dVar = null;
                                } else {
                                    dVar = null;
                                }
                                if (y72Var != null) {
                                    numValueOf = Integer.valueOf(abg.Z(y72Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.x(hkbVar));
                                gVar3 = gVar;
                            } else if (z4) {
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (twcVarH != null) {
                                    objG = twcVarH.a.g(swc.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    f6Var = (f6) objG;
                                    if (f6Var != null) {
                                    }
                                }
                                steVar = (ste) s72.x0(arrayList4);
                                if (steVar != null) {
                                    y72Var = null;
                                } else {
                                    y72Var = null;
                                }
                                if (y72Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (steVar != null) {
                                    wueVar = null;
                                } else {
                                    wueVar = null;
                                }
                                j = wue.c;
                                if (wueVar == null) {
                                    zA = false;
                                } else {
                                    zA = wue.a(wueVar.a, j);
                                }
                                if (steVar != null) {
                                    dVar = null;
                                } else {
                                    dVar = null;
                                }
                                if (y72Var != null) {
                                    numValueOf = Integer.valueOf(abg.Z(y72Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.x(hkbVar));
                                gVar3 = gVar;
                            } else {
                                children$ui2 = children$ui2;
                                size = size;
                                arrayList2 = arrayList2;
                                layoutNode2 = layoutNode2;
                                z5 = z2;
                                i2 = i2;
                                i4 = 0;
                                i4 = 0;
                                gVar2 = null;
                                listD = layoutNode2.D();
                                size2 = listD.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        j09Var = ((n09) listD.get(i5)).a;
                                        if (v4e.F(j09Var.getClass().getName(), "Painter", false)) {
                                            Field declaredField5 = j09Var.getClass().getDeclaredField("painter");
                                            declaredField5.setAccessible(true);
                                            obj = declaredField5.get(j09Var);
                                            if (obj instanceof fy9) {
                                                fy9Var = (fy9) obj;
                                                break;
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    fy9Var = null;
                                    break;
                                }
                                if (fy9Var != null) {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    int I7 = layoutNode2.I();
                                    fy9Var2 = fy9Var;
                                    int iR7 = layoutNode2.r();
                                    float f11 = gVar3.c;
                                    if (z7) {
                                        name = fy9Var2.getClass().getName();
                                        if (v4e.F(name, "Vector", false)) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                    } else {
                                        z8 = false;
                                    }
                                    cVar = new d(I7, iR7, f11, gVar3, z8, z5, io.sentry.config.a.x(hkbVar));
                                } else {
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.x(hkbVar));
                                }
                                fVar = cVar;
                                r15 = i4;
                            }
                        }
                        if (twcVarH != null) {
                            if (twcVarH.a.c(cxc.C) != z3) {
                                if (z4) {
                                    children$ui2 = children$ui2;
                                    size = size;
                                    arrayList2 = arrayList2;
                                    layoutNode2 = layoutNode2;
                                    z5 = z2;
                                    i2 = i2;
                                    i4 = 0;
                                    i4 = 0;
                                    gVar2 = null;
                                    listD = layoutNode2.D();
                                    size2 = listD.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < size2) {
                                            j09Var = ((n09) listD.get(i5)).a;
                                            if (v4e.F(j09Var.getClass().getName(), "Painter", false)) {
                                                Field declaredField6 = j09Var.getClass().getDeclaredField("painter");
                                                declaredField6.setAccessible(true);
                                                obj = declaredField6.get(j09Var);
                                                if (obj instanceof fy9) {
                                                    fy9Var = (fy9) obj;
                                                    break;
                                                }
                                            } else {
                                                i5++;
                                            }
                                        }
                                        fy9Var = null;
                                        break;
                                    }
                                    if (fy9Var != null) {
                                        if (z5) {
                                            z7 = false;
                                        } else {
                                            z7 = false;
                                        }
                                        int I8 = layoutNode2.I();
                                        fy9Var2 = fy9Var;
                                        int iR8 = layoutNode2.r();
                                        float f12 = gVar3.c;
                                        if (z7) {
                                            name = fy9Var2.getClass().getName();
                                            if (v4e.F(name, "Vector", false)) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                        } else {
                                            z8 = false;
                                        }
                                        cVar = new d(I8, iR8, f12, gVar3, z8, z5, io.sentry.config.a.x(hkbVar));
                                    } else {
                                        if (z5) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.x(hkbVar));
                                    }
                                    fVar = cVar;
                                    r15 = i4;
                                }
                            }
                            if (z2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            arrayList4 = new ArrayList();
                            if (twcVarH != null) {
                                objG = twcVarH.a.g(swc.a);
                                if (objG == null) {
                                    objG = null;
                                }
                                f6Var = (f6) objG;
                                if (f6Var != null) {
                                }
                            }
                            steVar = (ste) s72.x0(arrayList4);
                            if (steVar != null) {
                                y72Var = null;
                            } else {
                                y72Var = null;
                            }
                            if (y72Var == null) {
                                z10 = z4;
                            } else {
                                z10 = z4;
                            }
                            if (steVar != null) {
                                wueVar = null;
                            } else {
                                wueVar = null;
                            }
                            j = wue.c;
                            if (wueVar == null) {
                                zA = false;
                            } else {
                                zA = wue.a(wueVar.a, j);
                            }
                            if (steVar != null) {
                                dVar = null;
                            } else {
                                dVar = null;
                            }
                            if (y72Var != null) {
                                numValueOf = Integer.valueOf(abg.Z(y72Var.a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            layoutNode2 = layoutNode2;
                            i2 = i2;
                            arrayList2 = arrayList2;
                            r15 = 0;
                            gVar2 = null;
                            size = size;
                            children$ui2 = children$ui2;
                            fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.x(hkbVar));
                            gVar3 = gVar;
                        } else if (z4) {
                            if (z2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            arrayList4 = new ArrayList();
                            if (twcVarH != null) {
                                objG = twcVarH.a.g(swc.a);
                                if (objG == null) {
                                    objG = null;
                                }
                                f6Var = (f6) objG;
                                if (f6Var != null) {
                                }
                            }
                            steVar = (ste) s72.x0(arrayList4);
                            if (steVar != null) {
                                y72Var = null;
                            } else {
                                y72Var = null;
                            }
                            if (y72Var == null) {
                                z10 = z4;
                            } else {
                                z10 = z4;
                            }
                            if (steVar != null) {
                                wueVar = null;
                            } else {
                                wueVar = null;
                            }
                            j = wue.c;
                            if (wueVar == null) {
                                zA = false;
                            } else {
                                zA = wue.a(wueVar.a, j);
                            }
                            if (steVar != null) {
                                dVar = null;
                            } else {
                                dVar = null;
                            }
                            if (y72Var != null) {
                                numValueOf = Integer.valueOf(abg.Z(y72Var.a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            layoutNode2 = layoutNode2;
                            i2 = i2;
                            arrayList2 = arrayList2;
                            r15 = 0;
                            gVar2 = null;
                            size = size;
                            children$ui2 = children$ui2;
                            fVar = new f(dVar, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.x(hkbVar));
                            gVar3 = gVar;
                        } else {
                            children$ui2 = children$ui2;
                            size = size;
                            arrayList2 = arrayList2;
                            layoutNode2 = layoutNode2;
                            z5 = z2;
                            i2 = i2;
                            i4 = 0;
                            i4 = 0;
                            gVar2 = null;
                            listD = layoutNode2.D();
                            size2 = listD.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size2) {
                                    j09Var = ((n09) listD.get(i5)).a;
                                    if (v4e.F(j09Var.getClass().getName(), "Painter", false)) {
                                        Field declaredField7 = j09Var.getClass().getDeclaredField("painter");
                                        declaredField7.setAccessible(true);
                                        obj = declaredField7.get(j09Var);
                                        if (obj instanceof fy9) {
                                            fy9Var = (fy9) obj;
                                            break;
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                                fy9Var = null;
                                break;
                            }
                            if (fy9Var != null) {
                                if (z5) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                int I9 = layoutNode2.I();
                                fy9Var2 = fy9Var;
                                int iR9 = layoutNode2.r();
                                float f13 = gVar3.c;
                                if (z7) {
                                    name = fy9Var2.getClass().getName();
                                    if (v4e.F(name, "Vector", false)) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                } else {
                                    z8 = false;
                                }
                                cVar = new d(I9, iR9, f13, gVar3, z8, z5, io.sentry.config.a.x(hkbVar));
                            } else {
                                if (z5) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.x(hkbVar));
                            }
                            fVar = cVar;
                            r15 = i4;
                        }
                    }
                    arrayList3 = arrayList2;
                    if (fVar != null) {
                        arrayList3.add(fVar);
                        b(layoutNode2, fVar, r15, j6Var, z0Var);
                    }
                    arrayList = arrayList3;
                    children$ui2 = children$ui2;
                    size = size;
                    gVar4 = gVar2;
                }
                gVar3.g = arrayList;
            }
            Method method3 = (Method) io.sentry.config.a.n().b;
            method3.getClass();
            Object objInvoke2 = method3.invoke(layoutNode, null);
            objInvoke2.getClass();
            children$ui = (List) objInvoke2;
        }
        children$ui2 = children$ui;
        if (children$ui2.isEmpty()) {
            return;
        }
        arrayList = new ArrayList(children$ui2.size());
        size = children$ui2.size();
        while (i < size) {
            layoutNode2 = children$ui2.get(i);
            zX = layoutNode2.X();
            wo0 wo0Var2 = layoutNode2.V0;
            if (zX) {
                children$ui2 = children$ui2;
                arrayList2 = arrayList;
                size = size;
                i2 = i;
                layoutNode2 = layoutNode2;
                gVar2 = gVar4;
                r15 = 0;
                fVar = gVar2;
            } else {
                children$ui2 = children$ui2;
                arrayList2 = arrayList;
                size = size;
                i2 = i;
                layoutNode2 = layoutNode2;
                gVar2 = gVar4;
                r15 = 0;
                fVar = gVar2;
            }
            arrayList3 = arrayList2;
            if (fVar != null) {
                arrayList3.add(fVar);
                b(layoutNode2, fVar, r15, j6Var, z0Var);
            }
            arrayList = arrayList3;
            children$ui2 = children$ui2;
            size = size;
            gVar4 = gVar2;
        }
        gVar3.g = arrayList;
    }
}
