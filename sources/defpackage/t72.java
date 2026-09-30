package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t72 {
    public static final dd2 a = new dd2(new ym0(8), false, 1561093618);
    public static final dd2 b = new dd2(new ym0(9), false, -913673436);
    public static final dd2 c = new dd2(new kd2(26), false, -43531760);
    public static final dd2 d = new dd2(new md2(17), false, 1343308153);
    public static final dd2 e = new dd2(new kd2(27), false, -1285018670);
    public static final dd2 f = new dd2(new kd2(28), false, -848584005);
    public static final dd2 g = new dd2(new ce2(9), false, 922102871);
    public static final dd2 h = new dd2(new ce2(10), false, -1189209060);
    public static final dd2 i = new dd2(new ce2(11), false, -65127117);
    public static final dd2 j = new dd2(new de2(5), false, 998812262);
    public static final dd2 k = new dd2(new ed2(15), false, 111217211);
    public static final dd2 l = new dd2(new he2(16), false, -1669231076);
    public static final dd2 m = new dd2(new he2(17), false, -1625418004);
    public static final sz5 n = new sz5(6);
    public static final StackTraceElement[] o = new StackTraceElement[0];
    public static final iwe p = new iwe(0, new long[0], new Object[0]);
    public static gx6 q;
    public static gx6 r;

    public static final String A() {
        byte[] bArr = new byte[16];
        vsc.a.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long jD = q6c.d(bArr, 0);
        long jD2 = q6c.d(bArr, 8);
        return ((jD == 0 && jD2 == 0) ? frf.a : new frf(jD, jD2)).toString();
    }

    public static z67 B(Collection collection) {
        collection.getClass();
        return new z67(0, collection.size() - 1, 1);
    }

    public static final gx6 C() {
        gx6 gx6Var = q;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.IosShare", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(16.0f, 5.0f);
        s71Var.o(-1.42f, 1.42f);
        s71Var.o(-1.59f, -1.59f);
        s71Var.n(12.99f, 16.0f);
        s71Var.m(-1.98f);
        s71Var.n(11.01f, 4.83f);
        s71Var.n(9.42f, 6.42f);
        s71Var.n(8.0f, 5.0f);
        s71Var.o(4.0f, -4.0f);
        s71Var.o(4.0f, 4.0f);
        s71Var.h();
        s71Var.p(20.0f, 10.0f);
        s71Var.t(11.0f);
        s71Var.j(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        s71Var.n(6.0f, 23.0f);
        s71Var.j(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        s71Var.n(4.0f, 10.0f);
        s71Var.j(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        s71Var.m(3.0f);
        s71Var.t(2.0f);
        s71Var.n(6.0f, 10.0f);
        s71Var.t(11.0f);
        s71Var.m(12.0f);
        s71Var.n(18.0f, 10.0f);
        s71Var.m(-3.0f);
        s71Var.n(15.0f, 8.0f);
        s71Var.m(3.0f);
        s71Var.j(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        q = gx6VarB;
        return gx6VarB;
    }

    public static final Type D(do7 do7Var) {
        io7 io7Var = do7Var.a;
        if (io7Var == null) {
            return w6g.c;
        }
        yn7 yn7Var = do7Var.b;
        yn7Var.getClass();
        int iOrdinal = io7Var.ordinal();
        if (iOrdinal == 0) {
            return v(yn7Var, true);
        }
        if (iOrdinal == 1) {
            return new w6g(null, v(yn7Var, true));
        }
        if (iOrdinal == 2) {
            return new w6g(v(yn7Var, true), null);
        }
        ap.c();
        return null;
    }

    public static int E(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final xn7 F(xn7 xn7Var) {
        xn7Var.getClass();
        return xn7Var.e().c() ? xn7Var : new yj9(xn7Var);
    }

    public static void G(gh0 gh0Var) {
        if (gh0.i == null) {
            gh0.i = new gh0();
            fh0 fh0Var = new fh0("Okio Watchdog");
            fh0Var.setDaemon(true);
            fh0Var.start();
        }
        long jNanoTime = System.nanoTime();
        long j2 = gh0Var.c;
        boolean z = gh0Var.a;
        if (j2 != 0 && z) {
            gh0Var.g = Math.min(j2, gh0Var.c() - jNanoTime) + jNanoTime;
        } else if (j2 != 0) {
            gh0Var.g = jNanoTime + j2;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            gh0Var.g = gh0Var.c();
        }
        sug sugVar = gh0.h;
        int i2 = sugVar.b + 1;
        sugVar.b = i2;
        gh0[] gh0VarArr = (gh0[]) sugVar.c;
        if (i2 == gh0VarArr.length) {
            gh0[] gh0VarArr2 = new gh0[i2 * 2];
            qd0.d0(0, 0, 14, gh0VarArr, gh0VarArr2);
            sugVar.c = gh0VarArr2;
        }
        sugVar.l(i2, gh0Var);
        if (gh0Var.f == 1) {
            gh0.k.signal();
        }
    }

    public static List H(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List I(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return pu4.a;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List J(Object obj) {
        return obj != null ? H(obj) : pu4.a;
    }

    public static ArrayList K(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new yc0(objArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void L(ytc ytcVar, long j2, a26 a26Var) {
        mn9 mn9Var = new mn9(j2);
        ln9 ln9Var = ln9.a;
        z7f.t(3, ln9Var);
        wtc wtcVar = new wtc(ytcVar, mn9Var, ln9Var, ib1.g, ztc.e, (gbe) a26Var, null);
        int i2 = ytc.g;
        ytcVar.h(wtcVar, false);
    }

    public static final List M(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : H(list.get(0));
        }
        return pu4.a;
    }

    public static final n13 N(oo5 oo5Var, int i2) {
        int iOrdinal = oo5Var.q1().ordinal();
        n13 n13Var = n13.a;
        if (iOrdinal != 0) {
            n13 n13Var2 = n13.b;
            if (iOrdinal == 1) {
                oo5 oo5VarC = vpf.C(oo5Var);
                if (oo5VarC == null) {
                    qc0.j("ActiveParent with no focused child");
                    return null;
                }
                n13 n13VarN = N(oo5VarC, i2);
                n13 n13Var3 = n13VarN != n13Var ? n13VarN : null;
                if (n13Var3 != null) {
                    return n13Var3;
                }
                if (oo5Var.F0) {
                    return n13Var;
                }
                oo5Var.F0 = true;
                try {
                    do5 do5VarN1 = oo5Var.n1();
                    ml1 ml1Var = new ml1(i2);
                    bo5 bo5Var = (bo5) vd0.t0(oo5Var).getFocusOwner();
                    oo5 oo5VarG = bo5Var.g();
                    do5VarN1.k.d(ml1Var);
                    oo5 oo5VarG2 = bo5Var.g();
                    if (ml1Var.b) {
                        fo5 fo5Var = fo5.b;
                        return n13Var2;
                    }
                    if (oo5VarG == oo5VarG2 || oo5VarG2 == null) {
                        return n13Var;
                    }
                    return fo5.d == fo5.c ? n13Var2 : n13.c;
                } finally {
                    oo5Var.F0 = false;
                }
            }
            if (iOrdinal == 2) {
                return n13Var2;
            }
            if (iOrdinal != 3) {
                ap.c();
                return null;
            }
        }
        return n13Var;
    }

    public static final n13 O(oo5 oo5Var, int i2) {
        if (!oo5Var.G0) {
            oo5Var.G0 = true;
            try {
                do5 do5VarN1 = oo5Var.n1();
                ml1 ml1Var = new ml1(i2);
                bo5 bo5Var = (bo5) vd0.t0(oo5Var).getFocusOwner();
                oo5 oo5VarG = bo5Var.g();
                do5VarN1.j.d(ml1Var);
                oo5 oo5VarG2 = bo5Var.g();
                boolean z = ml1Var.b;
                n13 n13Var = n13.b;
                if (z) {
                    fo5 fo5Var = fo5.b;
                    return n13Var;
                }
                if (oo5VarG != oo5VarG2 && oo5VarG2 != null) {
                    return fo5.d == fo5.c ? n13Var : n13.c;
                }
            } finally {
                oo5Var.G0 = false;
            }
        }
        return n13.a;
    }

    public static final n13 P(oo5 oo5Var, int i2) {
        i09 i09VarM0;
        wo0 wo0Var;
        int iOrdinal = oo5Var.q1().ordinal();
        n13 n13Var = n13.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                oo5 oo5VarC = vpf.C(oo5Var);
                if (oo5VarC != null) {
                    return N(oo5VarC, i2);
                }
                qc0.j("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    ap.c();
                    return null;
                }
                if (!oo5Var.a.Y) {
                    i37.c("visitAncestors called on an unattached node");
                }
                i09 i09Var = oo5Var.a.e;
                LayoutNode layoutNodeS0 = vd0.s0(oo5Var);
                loop0: while (true) {
                    if (layoutNodeS0 == null) {
                        i09VarM0 = null;
                        break;
                    }
                    if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        while (i09Var != null) {
                            if ((i09Var.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                i09VarM0 = i09Var;
                                p89 p89Var = null;
                                while (i09VarM0 != null) {
                                    if (i09VarM0 instanceof oo5) {
                                        break loop0;
                                    }
                                    if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                        int i3 = 0;
                                        for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                            if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        if (i3 == 1) {
                                        }
                                    }
                                    i09VarM0 = vd0.m0(p89Var);
                                }
                            }
                            i09Var = i09Var.e;
                        }
                    }
                    layoutNodeS0 = layoutNodeS0.F();
                    i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
                }
                oo5 oo5Var2 = (oo5) i09VarM0;
                if (oo5Var2 == null) {
                    return n13Var;
                }
                int iOrdinal2 = oo5Var2.q1().ordinal();
                if (iOrdinal2 == 0) {
                    return O(oo5Var2, i2);
                }
                if (iOrdinal2 == 1) {
                    return P(oo5Var2, i2);
                }
                if (iOrdinal2 == 2) {
                    return n13.b;
                }
                if (iOrdinal2 != 3) {
                    ap.c();
                    return null;
                }
                n13 n13VarP = P(oo5Var2, i2);
                n13 n13Var2 = n13VarP != n13Var ? n13VarP : null;
                return n13Var2 == null ? O(oo5Var2, i2) : n13Var2;
            }
        }
        return n13Var;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01b9 A[PHI: r16
  0x01b9: PHI (r16v2 p89) = (r16v1 p89), (r16v1 p89), (r16v1 p89), (r16v4 p89) binds: [B:95:0x0168, B:97:0x016e, B:99:0x0172, B:116:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x0257  */
    /* JADX WARN: Code duplicated, block: B:161:0x025e A[ADDED_TO_REGION, LOOP:9: B:161:0x025e->B:168:0x0270, LOOP_START, PHI: r14
  0x025e: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:160:0x025c, B:168:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0260  */
    /* JADX WARN: Code duplicated, block: B:165:0x026b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x026d  */
    /* JADX WARN: Code duplicated, block: B:167:0x026f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0276  */
    /* JADX WARN: Code duplicated, block: B:172:0x027e  */
    /* JADX WARN: Code duplicated, block: B:176:0x028a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:213:0x01f5 A[SYNTHETIC] */
    public static final boolean Q(oo5 oo5Var) {
        p89 p89Var;
        int i2;
        oo5 oo5Var2;
        ko5 ko5Var;
        wo0 wo0Var;
        boolean z;
        wo0 wo0Var2;
        bo5 bo5Var = (bo5) vd0.t0(oo5Var).getFocusOwner();
        oo5 oo5VarG = bo5Var.g();
        ko5 ko5VarQ1 = oo5Var.q1();
        if (oo5VarG == oo5Var) {
            oo5Var.m1(ko5VarQ1, ko5VarQ1);
            return true;
        }
        if ((oo5VarG == null || oo5VarG.Z) && !oo5Var.Z && !((bo5) vd0.t0(oo5Var).getFocusOwner()).a.D()) {
            return false;
        }
        if (oo5VarG != null) {
            p89Var = new p89(0, new oo5[16]);
            if (!oo5VarG.a.Y) {
                i37.c("visitAncestors called on an unattached node");
            }
            i09 i09Var = oo5VarG.a.e;
            LayoutNode layoutNodeS0 = vd0.s0(oo5VarG);
            while (layoutNodeS0 != null) {
                if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    while (i09Var != null) {
                        if ((i09Var.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            i09 i09VarM0 = i09Var;
                            p89 p89Var2 = null;
                            while (i09VarM0 != null) {
                                if (i09VarM0 instanceof oo5) {
                                    p89Var.b((oo5) i09VarM0);
                                } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                    int i3 = 0;
                                    for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                        if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                i09VarM0 = i09Var2;
                                            } else {
                                                if (p89Var2 == null) {
                                                    p89Var2 = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var2.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var2.b(i09Var2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                i09VarM0 = vd0.m0(p89Var2);
                            }
                        }
                        i09Var = i09Var.e;
                    }
                }
                layoutNodeS0 = layoutNodeS0.F();
                i09Var = (layoutNodeS0 == null || (wo0Var2 = layoutNodeS0.V0) == null) ? null : (zde) wo0Var2.f;
            }
        } else {
            p89Var = null;
        }
        Object[] objArr = new oo5[16];
        Object[] objArr2 = new oo5[16];
        if (!oo5Var.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var3 = oo5Var.a.e;
        LayoutNode layoutNodeS1 = vd0.s0(oo5Var);
        boolean z2 = true;
        int i4 = 0;
        int i5 = 0;
        while (layoutNodeS1 != null) {
            if ((((i09) layoutNodeS1.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                while (i09Var3 != null) {
                    if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        i09 i09VarM1 = i09Var3;
                        p89 p89Var3 = null;
                        while (i09VarM1 != null) {
                            if (i09VarM1 instanceof oo5) {
                                oo5 oo5Var3 = (oo5) i09VarM1;
                                if (pa7.t(p89Var != null ? Boolean.valueOf(p89Var.j(oo5Var3)) : null, Boolean.TRUE)) {
                                    int i6 = i4 + 1;
                                    if (objArr.length < i6) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i4] = oo5Var3;
                                    i4 = i6;
                                } else {
                                    bo5Var = bo5Var;
                                    int i7 = i5 + 1;
                                    if (objArr2.length < i7) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i7, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i5] = oo5Var3;
                                    i5 = i7;
                                }
                                if (oo5Var3 == oo5VarG) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                bo5Var = bo5Var;
                                z = true;
                            }
                            if (z && (i09VarM1.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM1 instanceof sv3)) {
                                int i8 = 0;
                                for (i09 i09Var4 = ((sv3) i09VarM1).E0; i09Var4 != null; i09Var4 = i09Var4.f) {
                                    if ((i09Var4.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        int i9 = i8 + 1;
                                        if (i9 == 1) {
                                            i09VarM1 = i09Var4;
                                            i9 = i9;
                                        } else {
                                            p89 p89Var4 = p89Var3 == null ? new p89(0, new i09[16]) : p89Var3;
                                            if (i09VarM1 != null) {
                                                p89Var4.b(i09VarM1);
                                                i09VarM1 = null;
                                            }
                                            p89Var4.b(i09Var4);
                                            p89Var3 = p89Var4;
                                        }
                                        i8 = i9;
                                    }
                                }
                                if (i8 != 1) {
                                    i09VarM1 = vd0.m0(p89Var3);
                                }
                            } else {
                                i09VarM1 = vd0.m0(p89Var3);
                            }
                        }
                    }
                    i09Var3 = i09Var3.e;
                    bo5Var = bo5Var;
                }
            }
            bo5 bo5Var2 = bo5Var;
            layoutNodeS1 = layoutNodeS1.F();
            i09Var3 = (layoutNodeS1 == null || (wo0Var = layoutNodeS1.V0) == null) ? null : (zde) wo0Var.f;
            bo5Var = bo5Var2;
        }
        bo5 bo5Var3 = bo5Var;
        if (!z2 || oo5VarG == null || R(oo5VarG, false)) {
            if9.C(oo5Var, new uo2(20, oo5Var));
            int iOrdinal = oo5Var.q1().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ((bo5) vd0.t0(oo5Var).getFocusOwner()).j(oo5Var);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        ap.c();
                        return false;
                    }
                    ((bo5) vd0.t0(oo5Var).getFocusOwner()).j(oo5Var);
                }
            }
            ko5 ko5Var2 = ko5.c;
            ko5 ko5Var3 = ko5.a;
            if (z2 && oo5VarG != null) {
                oo5VarG.m1(ko5Var3, ko5Var2);
            }
            ko5 ko5Var4 = ko5.b;
            if (p89Var != null) {
                int i10 = p89Var.c - 1;
                Object[] objArr5 = p89Var.a;
                if (i10 < objArr5.length) {
                    while (i10 >= 0) {
                        oo5 oo5Var4 = (oo5) objArr5[i10];
                        if (bo5Var3.g() == oo5Var) {
                            oo5Var4.m1(ko5Var4, ko5Var2);
                            i10--;
                        }
                    }
                    i2 = i5 - 1;
                    if (i2 < objArr2.length) {
                        while (i2 >= 0) {
                            oo5Var2 = (oo5) objArr2[i2];
                            if (bo5Var3.g() == oo5Var) {
                                if (oo5Var2 == oo5VarG) {
                                    ko5Var = ko5Var3;
                                } else {
                                    ko5Var = ko5Var2;
                                }
                                oo5Var2.m1(ko5Var, ko5Var4);
                                i2--;
                            }
                        }
                        if (bo5Var3.g() == oo5Var) {
                            oo5Var.m1(ko5VarQ1, ko5Var3);
                            if (bo5Var3.g() != oo5Var) {
                                return true;
                            }
                        }
                    } else if (bo5Var3.g() == oo5Var) {
                        oo5Var.m1(ko5VarQ1, ko5Var3);
                        if (bo5Var3.g() != oo5Var) {
                            return true;
                        }
                    }
                } else {
                    i2 = i5 - 1;
                    if (i2 < objArr2.length) {
                        while (i2 >= 0) {
                            oo5Var2 = (oo5) objArr2[i2];
                            if (bo5Var3.g() == oo5Var) {
                                if (oo5Var2 == oo5VarG) {
                                    ko5Var = ko5Var3;
                                } else {
                                    ko5Var = ko5Var2;
                                }
                                oo5Var2.m1(ko5Var, ko5Var4);
                                i2--;
                            }
                        }
                        if (bo5Var3.g() == oo5Var) {
                            oo5Var.m1(ko5VarQ1, ko5Var3);
                            if (bo5Var3.g() != oo5Var) {
                                return true;
                            }
                        }
                    } else if (bo5Var3.g() == oo5Var) {
                        oo5Var.m1(ko5VarQ1, ko5Var3);
                        if (bo5Var3.g() != oo5Var) {
                            return true;
                        }
                    }
                }
            } else {
                i2 = i5 - 1;
                if (i2 < objArr2.length) {
                    while (i2 >= 0) {
                        oo5Var2 = (oo5) objArr2[i2];
                        if (bo5Var3.g() == oo5Var) {
                            if (oo5Var2 == oo5VarG) {
                                ko5Var = ko5Var3;
                            } else {
                                ko5Var = ko5Var2;
                            }
                            oo5Var2.m1(ko5Var, ko5Var4);
                            i2--;
                        }
                    }
                    if (bo5Var3.g() == oo5Var) {
                        oo5Var.m1(ko5VarQ1, ko5Var3);
                        if (bo5Var3.g() != oo5Var) {
                            return true;
                        }
                    }
                } else if (bo5Var3.g() == oo5Var) {
                    oo5Var.m1(ko5VarQ1, ko5Var3);
                    if (bo5Var3.g() != oo5Var) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean R(oo5 oo5Var, boolean z) {
        int iOrdinal = oo5Var.q1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                oo5 oo5VarC = vpf.C(oo5Var);
                if (!(oo5VarC != null ? R(oo5VarC, z) : true)) {
                    return false;
                }
                oo5Var.m1(ko5.b, ko5.c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                ap.c();
                return false;
            }
        }
        return true;
    }

    public static void S(ks7 ks7Var, Annotation annotation) throws InvocationTargetException {
        Class clsR = af1.R(af1.Q(annotation));
        is7 is7VarU = ks7Var.u(smb.a(clsR), new rmb(annotation));
        if (is7VarU != null) {
            T(is7VarU, annotation, clsR);
        }
    }

    public static void T(is7 is7Var, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                t99 t99VarE = t99.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    is7Var.m(t99VarE, t((Class) objInvoke));
                } else if (dob.a.contains(enclosingClass)) {
                    is7Var.h(t99VarE, objInvoke);
                } else {
                    List list = smb.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        is7Var.p(t99VarE, smb.a(enclosingClass), t99.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) qd0.y0(interfaces);
                        cls2.getClass();
                        is7 is7VarT = is7Var.t(smb.a(cls2), t99VarE);
                        if (is7VarT != null) {
                            T(is7VarT, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        js7 js7VarN = is7Var.n(t99VarE);
                        if (js7VarN != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                j22 j22VarA = smb.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    js7VarN.i(j22VarA, t99.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    js7VarN.v(t((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    is7 is7VarA = js7VarN.a(smb.a(componentType));
                                    if (is7VarA != null) {
                                        obj3.getClass();
                                        T(is7VarA, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    js7VarN.f(obj4);
                                }
                            }
                            js7VarN.d();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        is7Var.d();
    }

    public static t99 U(t99 t99Var, String str, String str2, int i2) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i2 & 4) != 0;
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if (!t99Var.b) {
            String strC = t99Var.c();
            if (c5e.C(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return t99.e(str2.concat(v4e.Y(str, strC)));
                }
                if (!z) {
                    return t99Var;
                }
                String strY = v4e.Y(str, strC);
                if (strY.length() != 0 && ym8.C(0, strY)) {
                    if (strY.length() != 1 && ym8.C(1, strY)) {
                        Iterator it = new z67(0, strY.length() - 1, 1).iterator();
                        do {
                            if (!((y67) it).c) {
                                next = null;
                                break;
                            }
                            next = ((q67) it).next();
                        } while (ym8.C(((Number) next).intValue(), strY));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strY = ym8.Q(strY.substring(0, iIntValue)).concat(strY.substring(iIntValue));
                        } else {
                            strY = ym8.Q(strY);
                        }
                    } else if (strY.length() != 0 && 'A' <= (cCharAt2 = strY.charAt(0)) && cCharAt2 < '[') {
                        strY = Character.toLowerCase(cCharAt2) + strY.substring(1);
                    }
                }
                if (t99.f(strY)) {
                    return t99.e(strY);
                }
            }
        }
        return null;
    }

    public static final void V(int i2, int i3) {
        if (i3 < 0) {
            qc0.j(tec.f(i3, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i3 <= i2) {
                return;
            }
            r3.i(kv2.h(i3, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final int W(int i2, String str) {
        char cCharAt = str.charAt(i2);
        return (cCharAt << 7) + str.charAt(i2 + 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int X(utc utcVar, int i2) {
        int i3;
        int[] iArr = utcVar.e;
        int i4 = i2 + 1;
        int length = utcVar.d.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            i3 = (i5 + length) >>> 1;
            int i6 = iArr[i3];
            if (i6 < i4) {
                i5 = i3 + 1;
            } else {
                if (i6 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                length = i3 - 1;
            }
        }
        i3 = (-i5) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static void Y() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void Z() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void a(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16 x16Var3;
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(436625570);
        int i4 = i2 | (l46Var2.i(x16Var) ? 4 : 2) | (l46Var2.i(x16Var2) ? 32 : 16);
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(b.c(g09Var, 1.0f), a7c.b(32.0f));
            y72 y72Var = new y72(abg.d(4293449208L));
            y72 y72Var2 = new y72(abg.d(4294302952L));
            long j2 = y72.e;
            j09 j09VarN = tm7.n(j09VarE, new ibb(I(y72Var, y72Var2, new y72(j2)), null, (((long) Float.floatToRawIntBits(0.3f)) << 32) | (((long) Float.floatToRawIntBits(0.2f)) & 4294967295L), 800.0f), null, 6);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarN);
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
            j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
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
            feg.j(od4.A(R.drawable.img_activity_popup_classic, 0, l46Var2), null, b.l(g09Var, 200.0f), null, null, 0.0f, null, l46Var2, 440, 120);
            String strH = ks0.h(24.0f, R.string.activity_popup_title, l46Var2, l46Var2, g09Var);
            mue mueVar = pue.a;
            nte.b(strH, b.c(g09Var, 1.0f), abg.d(4061336340L), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var2, 432, 0, 130040);
            String strH2 = ks0.h(8.0f, R.string.activity_popup_subtitle, l46Var2, l46Var2, g09Var);
            mue mueVar2 = oue.a;
            nte.b(strH2, b.c(g09Var, 1.0f), abg.d(2735936276L), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 432, 0, 130040);
            j09 j09VarD = b.d(kv2.e(g09Var, 24.0f, l46Var2, g09Var, 1.0f), 56.0f);
            y6c y6cVarB = a7c.b(32.0f);
            bx9 bx9Var = v51.a;
            i3 = 16;
            cgg.a(x16Var, j09VarD, false, y6cVarB, v51.a(abg.d(4285820151L), j2, 0L, 0L, l46Var, 12), null, null, null, cn1.e, l46Var, (i4 & 14) | 805306416, 484);
            l46Var2 = l46Var;
            l46Var2.r(true);
            x16Var3 = x16Var2;
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, abg.c(436207616), abg.d(2568164116L), null, x16Var3, l46Var2, ((i4 << 12) & 458752) | 3456, 18);
            l46Var2.r(true);
        } else {
            x16Var3 = x16Var2;
            i3 = 16;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, i3, x16Var, x16Var3);
        }
    }

    public static final void a0(int i2) {
        throw new yyc(tec.e(i2, "An unknown field for index "));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void b(x16 x16Var, s84 s84Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        x16 x16Var2;
        int i4;
        s84 s84Var2;
        boolean z;
        boolean z2;
        s84 s84Var3;
        ojb ojbVarV;
        s84 s84Var4;
        View view;
        sw3 sw3Var;
        cv7 cv7Var;
        j46 j46VarL;
        e89 e89VarI;
        Object objR;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zE;
        Object objR2;
        boolean z3;
        u84 u84Var;
        boolean zI;
        Object obj3;
        boolean z4;
        boolean z5;
        boolean zE2;
        Object objR3;
        int i5;
        boolean z6;
        boolean z7;
        boolean z8;
        l46Var.h0(826668973);
        if ((i2 & 6) == 0) {
            x16Var2 = x16Var;
            i4 = (l46Var.i(x16Var2) ? 4 : 2) | i2;
        } else {
            x16Var2 = x16Var;
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 48) == 0) {
                s84Var2 = s84Var;
                i4 |= l46Var.g(s84Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (l46Var.i(dd2Var)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i5;
            }
            z = false;
            z8 = false;
            z7 = false;
            z6 = false;
            if ((i4 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                if (i6 != 0) {
                    s84Var4 = new s84(z, z6 ? 1 : 0, 7);
                } else {
                    s84Var4 = s84Var2;
                }
                view = (View) l46Var.k(uq.f);
                sw3Var = (sw3) l46Var.k(zg2.h);
                cv7Var = (cv7) l46Var.k(zg2.n);
                j46VarL = an1.L(l46Var);
                e89VarI = q1c.i(dd2Var, l46Var);
                Object[] objArr = new Object[0];
                objR = l46Var.R();
                obj = sf2.a;
                obj2 = objR;
                if (objR == obj) {
                    Object qVar = new q(18);
                    l46Var.p0(qVar);
                    obj2 = qVar;
                }
                uuid = (UUID) vfh.I(objArr, (x16) obj2, l46Var, 48);
                zE = l46Var.e(s84Var4.g) | l46Var.g(view) | l46Var.g(sw3Var) | l46Var.g(null);
                objR2 = l46Var.R();
                if (!zE || objR2 == obj) {
                    u84 u84Var2 = new u84(x16Var2, s84Var4, view, cv7Var, sw3Var, uuid);
                    z3 = true;
                    dd2 dd2Var2 = new dd2(new hr(e89VarI, z8 ? 1 : 0), true, -1338939603);
                    o84 o84Var = u84Var2.v;
                    o84Var.setParentCompositionContext(j46VarL);
                    o84Var.y.setValue(dd2Var2);
                    o84Var.G0 = true;
                    o84Var.d();
                    l46Var.p0(u84Var2);
                    objR2 = u84Var2;
                } else {
                    z3 = true;
                }
                u84Var = (u84) objR2;
                zI = l46Var.i(u84Var);
                Object objR4 = l46Var.R();
                obj3 = objR4;
                if (zI || objR4 == obj) {
                    Object irVar = new ir(u84Var, z7 ? 1 : 0);
                    l46Var.p0(irVar);
                    obj3 = irVar;
                }
                af1.g(u84Var, (a26) obj3, l46Var);
                boolean zI2 = l46Var.i(u84Var);
                if ((i4 & 14) == 4) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                boolean z9 = zI2 | z4;
                if ((i4 & 112) == 32) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                zE2 = z9 | z5 | l46Var.e(cv7Var.ordinal());
                objR3 = l46Var.R();
                if (zE2 || objR3 == obj) {
                    s84 s84Var5 = s84Var4;
                    Object jrVar = new jr(u84Var, x16Var, s84Var5, cv7Var, 0);
                    s84Var4 = s84Var5;
                    l46Var.p0(jrVar);
                    objR3 = jrVar;
                }
                af1.u((x16) objR3, l46Var);
                s84Var3 = s84Var4;
            } else {
                l46Var.Z();
                s84Var3 = s84Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kr(x16Var, s84Var3, dd2Var, i2, i3, 0);
            }
        }
        i4 |= 48;
        s84Var2 = s84Var;
        if ((i2 & 384) == 0) {
            if (l46Var.i(dd2Var)) {
                i5 = 256;
            } else {
                i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i4 |= i5;
        }
        z = false;
        z8 = false;
        z7 = false;
        z6 = false;
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i4 & 1, z2)) {
            if (i6 != 0) {
                s84Var4 = new s84(z, z6 ? 1 : 0, 7);
            } else {
                s84Var4 = s84Var2;
            }
            view = (View) l46Var.k(uq.f);
            sw3Var = (sw3) l46Var.k(zg2.h);
            cv7Var = (cv7) l46Var.k(zg2.n);
            j46VarL = an1.L(l46Var);
            e89VarI = q1c.i(dd2Var, l46Var);
            Object[] objArr2 = new Object[0];
            objR = l46Var.R();
            obj = sf2.a;
            obj2 = objR;
            if (objR == obj) {
                Object qVar2 = new q(18);
                l46Var.p0(qVar2);
                obj2 = qVar2;
            }
            uuid = (UUID) vfh.I(objArr2, (x16) obj2, l46Var, 48);
            zE = l46Var.e(s84Var4.g) | l46Var.g(view) | l46Var.g(sw3Var) | l46Var.g(null);
            objR2 = l46Var.R();
            if (zE) {
                u84 u84Var3 = new u84(x16Var2, s84Var4, view, cv7Var, sw3Var, uuid);
                z3 = true;
                dd2 dd2Var3 = new dd2(new hr(e89VarI, z8 ? 1 : 0), true, -1338939603);
                o84 o84Var2 = u84Var3.v;
                o84Var2.setParentCompositionContext(j46VarL);
                o84Var2.y.setValue(dd2Var3);
                o84Var2.G0 = true;
                o84Var2.d();
                l46Var.p0(u84Var3);
                objR2 = u84Var3;
            } else {
                u84 u84Var4 = new u84(x16Var2, s84Var4, view, cv7Var, sw3Var, uuid);
                z3 = true;
                dd2 dd2Var4 = new dd2(new hr(e89VarI, z8 ? 1 : 0), true, -1338939603);
                o84 o84Var3 = u84Var4.v;
                o84Var3.setParentCompositionContext(j46VarL);
                o84Var3.y.setValue(dd2Var4);
                o84Var3.G0 = true;
                o84Var3.d();
                l46Var.p0(u84Var4);
                objR2 = u84Var4;
            }
            u84Var = (u84) objR2;
            zI = l46Var.i(u84Var);
            Object objR5 = l46Var.R();
            obj3 = objR5;
            if (zI) {
                Object irVar2 = new ir(u84Var, z7 ? 1 : 0);
                l46Var.p0(irVar2);
                obj3 = irVar2;
            } else {
                Object irVar3 = new ir(u84Var, z7 ? 1 : 0);
                l46Var.p0(irVar3);
                obj3 = irVar3;
            }
            af1.g(u84Var, (a26) obj3, l46Var);
            boolean zI3 = l46Var.i(u84Var);
            if ((i4 & 14) == 4) {
                z4 = z3;
            } else {
                z4 = false;
            }
            boolean z10 = zI3 | z4;
            if ((i4 & 112) == 32) {
                z5 = z3;
            } else {
                z5 = false;
            }
            zE2 = z10 | z5 | l46Var.e(cv7Var.ordinal());
            objR3 = l46Var.R();
            if (zE2) {
                s84 s84Var6 = s84Var4;
                Object jrVar2 = new jr(u84Var, x16Var, s84Var6, cv7Var, 0);
                s84Var4 = s84Var6;
                l46Var.p0(jrVar2);
                objR3 = jrVar2;
            } else {
                s84 s84Var7 = s84Var4;
                Object jrVar3 = new jr(u84Var, x16Var, s84Var7, cv7Var, 0);
                s84Var4 = s84Var7;
                l46Var.p0(jrVar3);
                objR3 = jrVar3;
            }
            af1.u((x16) objR3, l46Var);
            s84Var3 = s84Var4;
        } else {
            l46Var.Z();
            s84Var3 = s84Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(x16Var, s84Var3, dd2Var, i2, i3, 0);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final b76 b0(CharSequence charSequence, String str) {
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new g76(charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new h76(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new c76(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new y66(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new jf9(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new d76(charSequence);
                }
                break;
        }
        if (!c5e.C(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new a76(charSequence, str);
        }
        int i2 = l76.b;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!c5e.C(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new dz5();
            }
            int i3 = k76.c;
            return bm8.u(str, string);
        } catch (dz5 unused) {
            return new a76(string, str);
        }
    }

    public static final void c(j09 j09Var, l26 l26Var, l46 l46Var, int i2) {
        l46Var.h0(1090521195);
        int i3 = (l46Var.g(j09Var) ? 4 : 2) | i2 | (l46Var.i(l26Var) ? 32 : 16);
        int i4 = 3;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = mr.b;
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l26Var.z(l46Var, Integer.valueOf((i5 >> 6) & 14));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(j09Var, l26Var, i2, i4);
        }
    }

    public static final String c0(String str) {
        str.getClass();
        int i2 = 15;
        if (str.length() <= 15) {
            return str;
        }
        if (Character.isHighSurrogate(str.charAt(14)) && Character.isLowSurrogate(str.charAt(15))) {
            i2 = 14;
        }
        return str.substring(0, i2);
    }

    public static final void d(int i2, long j2, l46 l46Var, j09 j09Var) {
        l46Var.h0(-1921132226);
        int i3 = (l46Var.f(j2) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            s21.a(tm7.o(j09Var, j2, a7c.a), l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cr(j2, j09Var, i2, 2);
        }
    }

    public static final String d0(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        cyc cycVarU = fyc.u(o9f.a, type);
        StringBuilder sb = new StringBuilder(((Class) fyc.w(cycVarU)).getName());
        Iterator it = cycVarU.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                Y();
                throw null;
            }
        }
        sb.append(c5e.y(i2, "[]"));
        return sb.toString();
    }

    public static final void e(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16 x16Var3 = x16Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1949552179);
        int i3 = i2 | (l46Var2.i(x16Var) ? 4 : 2) | (l46Var2.i(x16Var3) ? 32 : 16);
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarO = tm7.o(oa7.E(b.c(g09Var, 1.0f), a7c.b(32.0f)), abg.d(4280427044L), g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
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
            j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
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
            feg.j(od4.A(R.drawable.img_activity_popup_neo, 0, l46Var2), null, b.l(g09Var, 200.0f), null, null, 0.0f, null, l46Var2, 440, 120);
            String strH = ks0.h(24.0f, R.string.activity_popup_title, l46Var2, l46Var2, g09Var);
            mue mueVar = pue.a;
            nte.b(strH, b.c(g09Var, 1.0f), abg.d(4076863487L), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var2, 432, 0, 130040);
            String strH2 = ks0.h(8.0f, R.string.activity_popup_subtitle, l46Var2, l46Var2, g09Var);
            mue mueVar2 = oue.a;
            nte.b(strH2, b.c(g09Var, 1.0f), abg.d(2583691263L), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 432, 0, 130040);
            j09 j09VarD = b.d(kv2.e(g09Var, 24.0f, l46Var2, g09Var, 1.0f), 56.0f);
            y6c y6cVarB = a7c.b(0.0f);
            bx9 bx9Var = v51.a;
            cgg.a(x16Var, j09VarD, false, y6cVarB, v51.a(y72.e, abg.d(4279440148L), 0L, 0L, l46Var, 12), null, null, null, cn1.f, l46Var, (i3 & 14) | 805306416, 484);
            l46Var2 = l46Var;
            l46Var2.r(true);
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, abg.c(863993727), abg.d(4290953922L), null, x16Var2, l46Var2, ((i3 << 12) & 458752) | 3456, 18);
            x16Var3 = x16Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 17, x16Var, x16Var3);
        }
    }

    public static final void f(int i2, int i3, dd2 dd2Var, l46 l46Var, c4c c4cVar) {
        int i4;
        l46Var.h0(2012414922);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.g(c4cVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = 1;
        if (!l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            l46Var.Z();
        } else {
            if (i2 < 0) {
                qc0.j("Level must be at least 0");
                return;
            }
            l46Var.f0(1195462900);
            mue mueVarD = b4c.d(c4cVar, l46Var);
            l46Var.f0(1195463980);
            long jC = mueVarD.c();
            if (jC == 16) {
                jC = b4c.c(c4cVar, l46Var);
            }
            long j2 = jC;
            l46Var.r(false);
            mue mueVarA = mue.a(mueVarD, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            l46Var.r(false);
            mue mueVarK = a6c.k(mueVarA, (cv7) l46Var.k(zg2.n));
            l26 l26Var = q4c.c(q4c.b(c4cVar, l46Var)).b;
            l26Var.getClass();
            ((r4c) l46Var.k(s4c.a)).b.t(mueVarK.e((mue) l26Var.z(Integer.valueOf(i2), mueVarK)), af1.b0(-969692624, new r62(dd2Var, c4cVar, i5), l46Var), l46Var, 48);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q62(c4cVar, i2, dd2Var, i3);
        }
    }

    public static final void g(f48 f48Var, x48 x48Var, x16 x16Var, l46 l46Var, int i2) {
        l46Var.h0(-709389590);
        int i3 = i2 | 16;
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                x48Var = (x48) l46Var.k(cb8.a);
            } else {
                l46Var.Z();
            }
            l46Var.s();
            if (f48Var == f48.ON_DESTROY) {
                qc0.j("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            e89 e89VarI = q1c.i(x16Var, l46Var);
            boolean zG = l46Var.g(e89VarI) | l46Var.i(x48Var);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new it3(x48Var, f48Var, e89VarI, 21);
                l46Var.p0(objR);
            }
            af1.g(x48Var, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(f48Var, x48Var, x16Var, i2);
        }
    }

    public static final void h(kq6 kq6Var, Object obj, x48 x48Var, a26 a26Var, l46 l46Var, int i2) {
        l46Var.h0(752680142);
        int i3 = (l46Var.i(kq6Var) ? 4 : 2) | i2 | (l46Var.i(obj) ? 32 : 16) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                x48Var = (x48) l46Var.k(cb8.a);
            } else {
                l46Var.Z();
            }
            int i4 = i3 & (-897);
            l46Var.s();
            boolean zG = l46Var.g(kq6Var) | l46Var.g(obj) | l46Var.g(x48Var);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new c58(x48Var.k());
                l46Var.p0(objR);
            }
            i(x48Var, (c58) objR, a26Var, l46Var, (i4 >> 3) & 896);
        } else {
            l46Var.Z();
        }
        x48 x48Var2 = x48Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(i2, 28, kq6Var, obj, x48Var2, a26Var);
        }
    }

    public static final void i(x48 x48Var, c58 c58Var, a26 a26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(912823238);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x48Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(c58Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean zI = l46Var.i(c58Var) | ((i3 & 896) == 256) | l46Var.i(x48Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new it3(x48Var, c58Var, a26Var, 20);
                l46Var.p0(objR);
            }
            af1.h(x48Var, c58Var, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i2, x48Var, c58Var, a26Var, 0);
        }
    }

    public static final void j(Boolean bool, Object obj, x48 x48Var, a26 a26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(696924721);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                x48Var = (x48) l46Var.k(cb8.a);
            } else {
                l46Var.Z();
            }
            int i4 = i3 & (-897);
            l46Var.s();
            boolean zG = l46Var.g(bool) | l46Var.g(obj) | l46Var.g(x48Var);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new g58(x48Var.k());
                l46Var.p0(objR);
            }
            k(x48Var, (g58) objR, a26Var, l46Var, (i4 >> 3) & 896);
        } else {
            l46Var.Z();
        }
        x48 x48Var2 = x48Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(i2, 12, bool, obj, x48Var2, a26Var);
        }
    }

    public static final void k(x48 x48Var, g58 g58Var, a26 a26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(228371534);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x48Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(g58Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean zI = l46Var.i(g58Var) | ((i3 & 896) == 256) | l46Var.i(x48Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new it3(x48Var, g58Var, a26Var, 22);
                l46Var.p0(objR);
            }
            af1.h(x48Var, g58Var, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i2, x48Var, g58Var, a26Var, 2);
        }
    }

    public static final dd0 l(xn7 xn7Var) {
        xn7Var.getClass();
        return new dd0(xn7Var, 0);
    }

    public static final qh6 m(xn7 xn7Var, xn7 xn7Var2) {
        xn7Var.getClass();
        xn7Var2.getClass();
        return new qh6(xn7Var, xn7Var2, 1);
    }

    public static final void n(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16 x16Var3;
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-1402027938);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(x16Var2) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new lm8(2, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            x16Var3 = x16Var2;
            l46Var2 = l46Var;
            b(x16Var3, new s84(z, z2, 5), af1.b0(-1924180569, new np1(k8b.f((e8b) l46Var.k(l8b.a)), x16Var, x16Var2, 3), l46Var), l46Var2, ((i3 >> 3) & 14) | 432, 0);
        } else {
            x16Var3 = x16Var2;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 15, x16Var, x16Var3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029e  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:108:0x0304  */
    /* JADX WARN: Code duplicated, block: B:111:0x0312  */
    /* JADX WARN: Code duplicated, block: B:112:0x0322  */
    /* JADX WARN: Code duplicated, block: B:114:0x0325  */
    /* JADX WARN: Code duplicated, block: B:115:0x0331  */
    /* JADX WARN: Code duplicated, block: B:118:0x0395  */
    /* JADX WARN: Code duplicated, block: B:119:0x0398  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:123:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:132:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:133:0x0406  */
    /* JADX WARN: Code duplicated, block: B:135:0x0414  */
    /* JADX WARN: Code duplicated, block: B:136:0x0417  */
    /* JADX WARN: Code duplicated, block: B:138:0x041a  */
    /* JADX WARN: Code duplicated, block: B:139:0x041f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0430  */
    /* JADX WARN: Code duplicated, block: B:145:0x0433  */
    /* JADX WARN: Code duplicated, block: B:146:0x043e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0441  */
    /* JADX WARN: Code duplicated, block: B:149:0x044e  */
    /* JADX WARN: Code duplicated, block: B:152:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:157:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x0517  */
    /* JADX WARN: Code duplicated, block: B:175:0x051b  */
    /* JADX WARN: Code duplicated, block: B:176:0x051d  */
    /* JADX WARN: Code duplicated, block: B:182:0x052f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0549  */
    /* JADX WARN: Code duplicated, block: B:186:0x054e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0555  */
    /* JADX WARN: Code duplicated, block: B:191:0x0562  */
    /* JADX WARN: Code duplicated, block: B:193:0x0567  */
    /* JADX WARN: Code duplicated, block: B:195:0x056b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0570  */
    /* JADX WARN: Code duplicated, block: B:198:0x0572  */
    /* JADX WARN: Code duplicated, block: B:201:0x0587  */
    /* JADX WARN: Code duplicated, block: B:202:0x0589  */
    /* JADX WARN: Code duplicated, block: B:206:0x0593  */
    /* JADX WARN: Code duplicated, block: B:214:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:217:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:219:0x060a  */
    /* JADX WARN: Code duplicated, block: B:222:0x065e  */
    /* JADX WARN: Code duplicated, block: B:229:0x068d  */
    /* JADX WARN: Code duplicated, block: B:235:0x069b  */
    /* JADX WARN: Code duplicated, block: B:239:0x06af  */
    /* JADX WARN: Code duplicated, block: B:242:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:243:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:246:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:247:0x06de  */
    /* JADX WARN: Code duplicated, block: B:253:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:257:0x071b  */
    /* JADX WARN: Code duplicated, block: B:263:0x073c  */
    /* JADX WARN: Code duplicated, block: B:267:0x0755  */
    /* JADX WARN: Code duplicated, block: B:270:0x0769  */
    /* JADX WARN: Code duplicated, block: B:276:0x0777  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0232  */
    /* JADX WARN: Code duplicated, block: B:92:0x0243  */
    /* JADX WARN: Code duplicated, block: B:95:0x0273  */
    /* JADX WARN: Code duplicated, block: B:96:0x0280  */
    /* JADX WARN: Code duplicated, block: B:99:0x0291  */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x0243, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r52v0, types: [l46] */
    public static final void o(String str, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, l46 l46Var, int i2) {
        x16 x16Var5;
        Object obj;
        final y3a y3aVar;
        boolean z2;
        e89 e89Var;
        List listI;
        boolean z3;
        boolean z4;
        boolean zI;
        Object obj2;
        bwa bwaVar;
        cwa type;
        boolean z5;
        l5a l5aVar;
        boolean z6;
        e89 e89Var2;
        int i3;
        boolean z7;
        boolean z8;
        Object objR;
        int i4;
        int i5;
        final x16 x16Var6;
        boolean zI2;
        ?? r1;
        Object obj3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zG;
        Object obj4;
        e89 e89Var3;
        boolean z13;
        boolean z14;
        boolean z15;
        Object zr2Var;
        final y3a y3aVar2;
        Context context;
        boolean zI3;
        Object obj5;
        boolean zI4;
        final int i6;
        Object obj6;
        boolean zI5;
        Object obj7;
        ?? r24;
        Object obj8;
        bwa bwaVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        r3a r3aVar;
        z6e z6eVar;
        boolean z16;
        String strC;
        boolean z17;
        boolean zContains;
        String strY;
        boolean z18;
        String strI;
        String strI2;
        Double dS;
        Double dValueOf;
        z6e z6eVar2;
        Double dS2;
        String strY2;
        Double dS3;
        Double dValueOf2;
        String strR;
        boolean zContains2;
        String str2;
        boolean z19;
        String strI3;
        String strI4;
        boolean z20;
        n07 n07Var;
        p07 p07VarG;
        thb thbVar;
        int iD;
        double d2;
        Double dValueOf3;
        Double dValueOf4;
        String str3;
        str.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        l46Var.h0(1143632033);
        int i7 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var4) ? 131072 : 65536);
        if (l46Var.W(i7 & 1, (74899 & i7) != 74898)) {
            int i8 = i7 & 14;
            boolean z21 = ((i7 & 112) == 32) | (i8 == 4);
            Object objR2 = l46Var.R();
            i8c i8cVar = sf2.a;
            Object obj9 = objR2;
            if (z21 || objR2 == i8cVar) {
                zs5 zs5Var = new zs5(str, z);
                l46Var.p0(zs5Var);
                obj9 = zs5Var;
            }
            x16 x16Var7 = (x16) obj9;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kob kobVar = job.a;
            y3a y3aVar3 = (y3a) z5c.G(kobVar.b(y3a.class), pwfVarA.g(), null, gy2VarR, nfcVarB, x16Var7);
            Context context2 = (Context) l46Var.k(uq.b);
            boolean zI6 = l46Var.i(context2) | l46Var.i(y3aVar3);
            Object objR3 = l46Var.R();
            if (zI6 || objR3 == i8cVar) {
                obj = objR3;
                g5a g5aVar = new g5a(context2, y3aVar3, null);
                l46Var.p0(g5aVar);
                obj = g5aVar;
            }
            int i9 = y3a.c1;
            af1.o((l26) obj, l46Var, y3aVar3);
            qk2.q(0, l46Var);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == i8cVar) {
                objR4 = nfcVarB2.b(kobVar.b(p5a.class), null, null);
                l46Var.p0(objR4);
            }
            p5a p5aVar = (p5a) objR4;
            e89 e89VarT = tm7.t(y3aVar3.b1, l46Var);
            e89 e89VarT2 = tm7.t(y3aVar3.U0, l46Var);
            y5a y5aVar = (y5a) e89VarT.getValue();
            x5a x5aVar = y5aVar instanceof x5a ? (x5a) y5aVar : null;
            if (x5aVar != null) {
                y3aVar = y3aVar3;
                z2 = x5aVar.a.c;
                if (z2) {
                    l46Var.f0(-2032436525);
                    bwaVar2 = (bwa) e89VarT2.getValue();
                    int i10 = e6a.b;
                    x5aVar.getClass();
                    arrayList = new ArrayList();
                    arrayList2 = x5aVar.g;
                    r3aVar = x5aVar.a;
                    Map map = r3aVar.b;
                    z6eVar = (z6e) map.get(v2a.Month);
                    if (z6eVar != null) {
                        e89Var = e89VarT;
                        boolean z22 = p4a.a(z6eVar, x5aVar.f);
                        z16 = z22;
                        if (z6eVar == null) {
                            l46Var.f0(2040575506);
                            l46Var.r(false);
                            e89VarT2 = e89VarT2;
                            z18 = false;
                            i7 = i7;
                        } else {
                            l46Var.f0(2040575507);
                            strC = z6eVar.c();
                            if (strC == null) {
                                l46Var.f0(-241589051);
                                dS = b5e.s(z6eVar.g());
                                if (dS != null) {
                                    dValueOf = Double.valueOf(dS.doubleValue() / 60.0d);
                                } else {
                                    dValueOf = null;
                                }
                                if (dValueOf == null) {
                                    l46Var.f0(-241589052);
                                    l46Var.r(false);
                                    z17 = false;
                                    strC = null;
                                } else {
                                    l46Var.f0(-241589051);
                                    String strR2 = afc.r(R.string.paywall_sku_per_read, new Object[]{tec.l(z6eVar.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf.doubleValue())}, 1)))}, l46Var);
                                    z17 = false;
                                    l46Var.r(false);
                                    strC = strR2;
                                }
                                l46Var.r(z17);
                            } else {
                                e89VarT2 = e89VarT2;
                                i7 = i7;
                                z17 = false;
                                l46Var.f0(269299237);
                                l46Var.r(false);
                            }
                            String str4 = strC;
                            zContains = arrayList2.contains(z6eVar);
                            boolean z23 = !zContains;
                            if (z16) {
                                l46Var.f0(269317510);
                                l46Var.r(z17);
                                strY = z6eVar.y();
                                z18 = false;
                            } else {
                                l46Var.f0(269318336);
                                strY = z6eVar.y() + afc.q(R.string.paywall_sku_per_month, l46Var);
                                z18 = false;
                                l46Var.r(false);
                            }
                            String str5 = strY;
                            String strQ = afc.q(R.string.paywall_sku_monthly, l46Var);
                            if (z16) {
                                strI = tec.i(l46Var, 269327240, R.string.paywall_first_month_tag, l46Var, z18);
                            } else {
                                l46Var.f0(-240737947);
                                l46Var.r(z18);
                                strI = null;
                            }
                            boolean zT = pa7.t(bwaVar2, z6eVar);
                            if (zContains) {
                                l46Var.f0(-240554427);
                                l46Var.r(z18);
                                strI2 = null;
                            } else {
                                strI2 = tec.i(l46Var, 269333191, R.string.paywall_sku_subscribed, l46Var, z18);
                            }
                            arrayList.add(new i5a(strQ, str5, str4, null, strI, zT, z23, strI2, 24));
                            l46Var.r(z18);
                        }
                        z6eVar2 = (z6e) map.get(v2a.Year);
                        if (z6eVar2 == null) {
                            l46Var.f0(2042006497);
                            l46Var.r(z18);
                        } else {
                            l46Var.f0(2042006498);
                            dS2 = b5e.s(z6eVar2.g());
                            if (dS2 != null) {
                                strY2 = tec.l(z6eVar2.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dS2.doubleValue() / 12.0d)}, 1)));
                            } else {
                                strY2 = z6eVar2.y();
                            }
                            dS3 = b5e.s(z6eVar2.g());
                            if (dS3 != null) {
                                dValueOf2 = Double.valueOf(dS3.doubleValue() / 720.0d);
                            } else {
                                dValueOf2 = null;
                            }
                            if (dValueOf2 == null) {
                                l46Var.f0(1265156878);
                                l46Var.r(false);
                                strR = null;
                            } else {
                                l46Var.f0(1265156879);
                                strR = afc.r(R.string.paywall_sku_per_read, new Object[]{tec.l(z6eVar2.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf2.doubleValue())}, 1)))}, l46Var);
                                l46Var.r(false);
                            }
                            String strL = tec.l(z6eVar2.y(), afc.q(R.string.paywall_sku_per_year, l46Var));
                            String strL2 = tec.l(strY2, afc.q(R.string.paywall_sku_per_month, l46Var));
                            zContains2 = arrayList2.contains(z6eVar2);
                            boolean z24 = !zContains2;
                            String strQ2 = afc.q(R.string.paywall_sku_yearly, l46Var);
                            ca2.a.getClass();
                            if (ca2.c) {
                                str2 = strR;
                            } else {
                                str2 = null;
                            }
                            boolean zT2 = pa7.t(bwaVar2, z6eVar2);
                            if (z16) {
                                l46Var.f0(1265871118);
                                z19 = false;
                                l46Var.r(false);
                                strI3 = null;
                            } else {
                                z19 = false;
                                strI3 = tec.i(l46Var, -1206091071, R.string.paywall_sku_limited_offer, l46Var, false);
                            }
                            if (zContains2) {
                                l46Var.f0(1266063566);
                                l46Var.r(z19);
                                strI4 = null;
                            } else {
                                strI4 = tec.i(l46Var, -1206086882, R.string.paywall_sku_subscribed, l46Var, z19);
                            }
                            arrayList.add(new i5a(strQ2, strL, str2, strL2, strI3, zT2, z24, strI4, 8));
                            l46Var.r(z19);
                        }
                        if (x5aVar.e) {
                            z20 = false;
                            l46Var.f0(2044037494);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1319559262);
                            n07Var = (n07) s72.x0(r3aVar.a);
                            if (n07Var == null) {
                                l46Var.f0(2043335839);
                                z20 = false;
                                l46Var.r(false);
                            } else {
                                l46Var.f0(2043335840);
                                p07VarG = n07Var.g();
                                if (p07VarG instanceof thb) {
                                    thbVar = (thb) p07VarG;
                                } else {
                                    thbVar = null;
                                }
                                if (thbVar != null) {
                                    iD = thbVar.d();
                                } else {
                                    iD = 5;
                                }
                                d2 = n07Var.d();
                                dValueOf3 = Double.valueOf(d2);
                                if (d2 <= 0.0d) {
                                    dValueOf3 = null;
                                }
                                if (dValueOf3 != null) {
                                    dValueOf4 = Double.valueOf(dValueOf3.doubleValue() / ((double) iD));
                                } else {
                                    dValueOf4 = null;
                                }
                                if (dValueOf4 == null) {
                                    l46Var.f0(778925364);
                                    l46Var.r(false);
                                    str3 = null;
                                } else {
                                    l46Var.f0(778925365);
                                    String strR3 = afc.r(R.string.paywall_sku_per_read, new Object[]{tec.l(n07Var.e(), String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf4.doubleValue())}, 1)))}, l46Var);
                                    l46Var.r(false);
                                    str3 = strR3;
                                }
                                arrayList.add(new i5a(afc.r(R.string.paywall_sku_n_times, new Object[]{Integer.valueOf(iD)}, l46Var), n07Var.y(), str3, n07Var.c(), null, pa7.t(bwaVar2, n07Var), false, null, 424));
                                z20 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(z20);
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        l46Var.r(z20);
                        listI = arrayList;
                    } else {
                        e89Var = e89VarT;
                    }
                    z16 = z22;
                    if (z6eVar == null) {
                        l46Var.f0(2040575506);
                        l46Var.r(false);
                        e89VarT2 = e89VarT2;
                        z18 = false;
                        i7 = i7;
                    } else {
                        l46Var.f0(2040575507);
                        strC = z6eVar.c();
                        if (strC == null) {
                            l46Var.f0(-241589051);
                            dS = b5e.s(z6eVar.g());
                            if (dS != null) {
                                dValueOf = Double.valueOf(dS.doubleValue() / 60.0d);
                            } else {
                                dValueOf = null;
                            }
                            if (dValueOf == null) {
                                l46Var.f0(-241589052);
                                l46Var.r(false);
                                z17 = false;
                                strC = null;
                            } else {
                                l46Var.f0(-241589051);
                                String strR4 = afc.r(R.string.paywall_sku_per_read, new Object[]{tec.l(z6eVar.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf.doubleValue())}, 1)))}, l46Var);
                                z17 = false;
                                l46Var.r(false);
                                strC = strR4;
                            }
                            l46Var.r(z17);
                        } else {
                            e89VarT2 = e89VarT2;
                            i7 = i7;
                            z17 = false;
                            l46Var.f0(269299237);
                            l46Var.r(false);
                        }
                        String str6 = strC;
                        zContains = arrayList2.contains(z6eVar);
                        boolean z25 = !zContains;
                        if (z16) {
                            l46Var.f0(269317510);
                            l46Var.r(z17);
                            strY = z6eVar.y();
                            z18 = false;
                        } else {
                            l46Var.f0(269318336);
                            strY = z6eVar.y() + afc.q(R.string.paywall_sku_per_month, l46Var);
                            z18 = false;
                            l46Var.r(false);
                        }
                        String str7 = strY;
                        String strQ3 = afc.q(R.string.paywall_sku_monthly, l46Var);
                        if (z16) {
                            strI = tec.i(l46Var, 269327240, R.string.paywall_first_month_tag, l46Var, z18);
                        } else {
                            l46Var.f0(-240737947);
                            l46Var.r(z18);
                            strI = null;
                        }
                        boolean zT3 = pa7.t(bwaVar2, z6eVar);
                        if (zContains) {
                            strI2 = tec.i(l46Var, 269333191, R.string.paywall_sku_subscribed, l46Var, z18);
                        } else {
                            l46Var.f0(-240554427);
                            l46Var.r(z18);
                            strI2 = null;
                        }
                        arrayList.add(new i5a(strQ3, str7, str6, null, strI, zT3, z25, strI2, 24));
                        l46Var.r(z18);
                    }
                    z6eVar2 = (z6e) map.get(v2a.Year);
                    if (z6eVar2 == null) {
                        l46Var.f0(2042006497);
                        l46Var.r(z18);
                    } else {
                        l46Var.f0(2042006498);
                        dS2 = b5e.s(z6eVar2.g());
                        if (dS2 != null) {
                            strY2 = tec.l(z6eVar2.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dS2.doubleValue() / 12.0d)}, 1)));
                        } else {
                            strY2 = z6eVar2.y();
                        }
                        dS3 = b5e.s(z6eVar2.g());
                        if (dS3 != null) {
                            dValueOf2 = Double.valueOf(dS3.doubleValue() / 720.0d);
                        } else {
                            dValueOf2 = null;
                        }
                        if (dValueOf2 == null) {
                            l46Var.f0(1265156878);
                            l46Var.r(false);
                            strR = null;
                        } else {
                            l46Var.f0(1265156879);
                            strR = afc.r(R.string.paywall_sku_per_read, new Object[]{tec.l(z6eVar2.e(), String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf2.doubleValue())}, 1)))}, l46Var);
                            l46Var.r(false);
                        }
                        String strL3 = tec.l(z6eVar2.y(), afc.q(R.string.paywall_sku_per_year, l46Var));
                        String strL4 = tec.l(strY2, afc.q(R.string.paywall_sku_per_month, l46Var));
                        zContains2 = arrayList2.contains(z6eVar2);
                        boolean z26 = !zContains2;
                        String strQ4 = afc.q(R.string.paywall_sku_yearly, l46Var);
                        ca2.a.getClass();
                        if (ca2.c) {
                            str2 = strR;
                        } else {
                            str2 = null;
                        }
                        boolean zT4 = pa7.t(bwaVar2, z6eVar2);
                        if (z16) {
                            l46Var.f0(1265871118);
                            z19 = false;
                            l46Var.r(false);
                            strI3 = null;
                        } else {
                            z19 = false;
                            strI3 = tec.i(l46Var, -1206091071, R.string.paywall_sku_limited_offer, l46Var, false);
                        }
                        if (zContains2) {
                            strI4 = tec.i(l46Var, -1206086882, R.string.paywall_sku_subscribed, l46Var, z19);
                        } else {
                            l46Var.f0(1266063566);
                            l46Var.r(z19);
                            strI4 = null;
                        }
                        arrayList.add(new i5a(strQ4, strL3, str2, strL4, strI3, zT4, z26, strI4, 8));
                        l46Var.r(z19);
                    }
                    if (x5aVar.e) {
                        l46Var.f0(-1319559262);
                        n07Var = (n07) s72.x0(r3aVar.a);
                        if (n07Var == null) {
                            l46Var.f0(2043335839);
                            z20 = false;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(2043335840);
                            p07VarG = n07Var.g();
                            if (p07VarG instanceof thb) {
                                thbVar = (thb) p07VarG;
                            } else {
                                thbVar = null;
                            }
                            if (thbVar != null) {
                                iD = thbVar.d();
                            } else {
                                iD = 5;
                            }
                            d2 = n07Var.d();
                            dValueOf3 = Double.valueOf(d2);
                            if (d2 <= 0.0d) {
                                dValueOf3 = null;
                            }
                            if (dValueOf3 != null) {
                                dValueOf4 = Double.valueOf(dValueOf3.doubleValue() / ((double) iD));
                            } else {
                                dValueOf4 = null;
                            }
                            if (dValueOf4 == null) {
                                l46Var.f0(778925364);
                                l46Var.r(false);
                                str3 = null;
                            } else {
                                l46Var.f0(778925365);
                                String strR5 = afc.r(R.string.paywall_sku_per_read, new Object[]{tec.l(n07Var.e(), String.format(Locale.ENGLISH, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(dValueOf4.doubleValue())}, 1)))}, l46Var);
                                l46Var.r(false);
                                str3 = strR5;
                            }
                            arrayList.add(new i5a(afc.r(R.string.paywall_sku_n_times, new Object[]{Integer.valueOf(iD)}, l46Var), n07Var.y(), str3, n07Var.c(), null, pa7.t(bwaVar2, n07Var), false, null, 424));
                            z20 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(z20);
                    } else {
                        z20 = false;
                        l46Var.f0(2044037494);
                        l46Var.r(false);
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    l46Var.r(z20);
                    listI = arrayList;
                } else {
                    e89Var = e89VarT;
                    e89VarT2 = e89VarT2;
                    i7 = i7;
                    l46Var.f0(-2032355492);
                    l46Var.r(false);
                    listI = null;
                }
                if (listI != null || listI.isEmpty()) {
                    z3 = false;
                } else {
                    if (!listI.isEmpty()) {
                        Iterator it = listI.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (v4e.Q(((i5a) it.next()).b)) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    z3 = true;
                }
                if (i8 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zI = z4 | l46Var.i(p5aVar);
                Object objR5 = l46Var.R();
                if (!zI || objR5 == i8cVar) {
                    ek9 ek9Var = new ek9(11, str, p5aVar);
                    l46Var.p0(ek9Var);
                    obj2 = ek9Var;
                } else {
                    obj2 = objR5;
                }
                bzd.j(z3, (x16) obj2, l46Var, 0);
                bwaVar = (bwa) e89VarT2.getValue();
                if (bwaVar != null) {
                    type = bwaVar.getType();
                } else {
                    type = null;
                }
                z5 = type instanceof u7e;
                l5aVar = l5a.a;
                if (z5) {
                    if (h5a.a[((u7e) type).ordinal()] == 1) {
                        l5aVar = l5a.b;
                    }
                } else if (type instanceof thb) {
                    l5aVar = l5a.c;
                }
                l5a l5aVar2 = l5aVar;
                if (i8 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                e89Var2 = e89VarT2;
                boolean zI7 = z6 | l46Var.i(p5aVar) | l46Var.g(e89Var2);
                i3 = i7;
                if ((i3 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zI7 | z7;
                objR = l46Var.R();
                if (!z8 || objR == i8cVar) {
                    i4 = i8;
                    i5 = R.string.paywall_sku_monthly;
                    jr jrVar = new jr(str, x16Var2, e89Var2, p5aVar, 27);
                    l46Var.p0(jrVar);
                    objR = jrVar;
                } else {
                    i4 = i8;
                    i5 = R.string.paywall_sku_monthly;
                }
                x16Var6 = (x16) objR;
                zI2 = l46Var.i(y3aVar) | l46Var.g(x16Var6);
                Object objR6 = l46Var.R();
                if (!zI2 || objR6 == i8cVar) {
                    r1 = 0;
                    final boolean z27 = false ? 1 : 0;
                    x16 x16Var8 = new x16() { // from class: f5a
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i11 = z27;
                            wef wefVar = wef.a;
                            x16 x16Var9 = x16Var6;
                            y3a y3aVar4 = y3aVar;
                            switch (i11) {
                                case 0:
                                    if (!y3aVar4.q()) {
                                        x16Var9.invoke();
                                    }
                                    break;
                                default:
                                    if (!y3aVar4.q()) {
                                        x16Var9.invoke();
                                    }
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(x16Var8);
                    obj3 = x16Var8;
                } else {
                    r1 = 0;
                    obj3 = objR6;
                }
                rxg.a(r1, (x16) obj3, l46Var, r1, 1);
                lmd.a.getClass();
                int size = lmd.b.size();
                if (listI == null) {
                    l46Var.f0(-481159776);
                    p5aVar.getClass();
                    int i11 = pa7.t(pa7.b0(4, ((u5a) p5aVar).a("reading-pack-test-202609"), false), "g2_6_readings") ? 6 : 5;
                    int i12 = e6a.b;
                    listI = I(new i5a(afc.q(i5, l46Var), "", null, null, null, false, false, null, 508), new i5a(afc.q(R.string.paywall_sku_yearly, l46Var), "", null, null, null, false, false, null, 508), new i5a(afc.r(R.string.paywall_sku_n_times, new Object[]{Integer.valueOf(i11)}, l46Var), "", null, null, null, false, false, null, 508));
                    z9 = false;
                } else {
                    z9 = false;
                    l46Var.f0(-481160148);
                }
                l46Var.r(z9);
                bwa bwaVar3 = (bwa) e89Var2.getValue();
                z10 = z9;
                boolean zQ = y3aVar.q();
                if (y3aVar.q() && z2 && x5aVar.g.contains((bwa) e89Var2.getValue())) {
                    z11 = true;
                } else {
                    z11 = z10 ? 1 : 0;
                }
                if (x5aVar == null && x5aVar.f) {
                    z12 = true;
                } else {
                    z12 = z10 ? 1 : 0;
                }
                zG = l46Var.g(x5aVar) | l46Var.i(y3aVar);
                Object objR7 = l46Var.R();
                obj4 = objR7;
                if (zG || objR7 == i8cVar) {
                    kz8 kz8Var = new kz8(19, x5aVar, y3aVar);
                    l46Var.p0(kz8Var);
                    obj4 = kz8Var;
                }
                a26 a26Var = (a26) obj4;
                e89Var3 = e89Var;
                boolean z28 = ((l46Var.i(y3aVar) ? 1 : 0) | (l46Var.g(e89Var3) ? 1 : 0) ? 1 : 0) | (l46Var.g(e89Var2) ? 1 : 0);
                if ((i3 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = z10 ? 1 : 0;
                }
                boolean z29 = z13 | (z28 ? 1 : 0);
                if (i4 == 4) {
                    z14 = true;
                } else {
                    z14 = z10 ? 1 : 0;
                }
                z15 = (((z29 ? 1 : 0) | z14 ? 1 : 0) | (l46Var.i(p5aVar) ? 1 : 0) ? 1 : 0) | (l46Var.i(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x06ea: ARITH (r0v26 'z15' boolean) = (wrap boolean:?: TERNARY null = ((wrap boolean:0x06e5: ARITH (wrap boolean:?: TERNARY null = ((wrap boolean:0x06e0: ARITH (wrap boolean:?: TERNARY null = ((r0v23 'z29' boolean) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) | (r1v34 'z14' boolean) A[WRAPPED] (LINE:1761)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x06e1: INVOKE (r52v0 'l46Var' ?? I:l46), (r4v20 'p5aVar' p5a) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1762)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) A[WRAPPED] (LINE:1766)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) | (wrap boolean:?: TERNARY null = ((wrap boolean:0x06e6: INVOKE (r52v0 'l46Var' ?? I:l46), (r26v0 android.content.Context) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:1767)) == true) ? (1 ??[int, boolean, short, byte, char]) : (0 ??[int, boolean, short, byte, char])) (LINE:1771) in method: t72.o(java.lang.String, boolean, x16, x16, x16, x16, l46, int):void, file: classes.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 android.content.Context
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1993
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.t72.o(java.lang.String, boolean, x16, x16, x16, x16, l46, int):void");
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0053  */
            /* JADX WARN: Code duplicated, block: B:28:0x005b  */
            /* JADX WARN: Code duplicated, block: B:29:0x005e  */
            /* JADX WARN: Code duplicated, block: B:33:0x006e  */
            /* JADX WARN: Code duplicated, block: B:34:0x0070  */
            /* JADX WARN: Code duplicated, block: B:37:0x0079  */
            /* JADX WARN: Code duplicated, block: B:39:0x0088  */
            /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
            /* JADX WARN: Code duplicated, block: B:58:0x010a  */
            /* JADX WARN: Code duplicated, block: B:59:0x010e  */
            /* JADX WARN: Code duplicated, block: B:62:0x0162  */
            /* JADX WARN: Code duplicated, block: B:63:0x016f  */
            /* JADX WARN: Code duplicated, block: B:66:0x0205  */
            /* JADX WARN: Code duplicated, block: B:68:0x020d  */
            /* JADX WARN: Code duplicated, block: B:71:0x0229  */
            /* JADX WARN: Code duplicated, block: B:72:0x028c  */
            /* JADX WARN: Code duplicated, block: B:74:0x02df  */
            /* JADX WARN: Code duplicated, block: B:77:0x02ec  */
            /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v16 */
            /* JADX WARN: Type inference failed for: r4v17, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r4v18 */
            public static final void p(final qhe qheVar, final j09 j09Var, float f2, final String str, mue mueVar, mue mueVar2, l46 l46Var, final int i2, final int i3) {
                mue mueVarJ;
                int i4;
                mue mueVarA;
                int i5;
                boolean z;
                final mue mueVar3;
                final mue mueVar4;
                final float f3;
                ojb ojbVarV;
                int i6;
                mue mueVar5;
                mue mueVar6;
                float f4;
                boolean z2;
                ov7 ov7Var;
                g09 g09Var;
                ?? r4;
                boolean z3;
                qheVar.getClass();
                l46Var.h0(608592904);
                int i7 = i2 | (l46Var.i(qheVar) ? 4 : 2);
                if ((i2 & 48) == 0) {
                    i7 |= l46Var.g(j09Var) ? 32 : 16;
                }
                int i8 = i7 | 384 | (l46Var.g(str) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
                if ((i3 & 16) == 0) {
                    mueVarJ = mueVar;
                    if (l46Var.g(mueVarJ)) {
                        i4 = 16384;
                    }
                    int i9 = i8 | i4;
                    if ((i3 & 32) == 0) {
                        mueVarA = mueVar2;
                        int i10 = l46Var.g(mueVarA) ? 131072 : 65536;
                        i5 = i9 | i10;
                        if ((74899 & i5) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (l46Var.W(i5 & 1, z)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0 || l46Var.C()) {
                                if ((i3 & 16) != 0) {
                                    mue mueVar7 = pue.a;
                                    mueVarJ = pue.j(l46Var);
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    mue mueVar8 = pue.a;
                                    mueVarA = mue.a(pue.h(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213);
                                    i5 &= -458753;
                                }
                                i6 = i5;
                                mueVar5 = mueVarJ;
                                mueVar6 = mueVarA;
                                f4 = 6.0f;
                            } else {
                                l46Var.Z();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                f4 = f2;
                                i6 = i5;
                                mueVar5 = mueVarJ;
                                mueVar6 = mueVarA;
                            }
                            l46Var.s();
                            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
                            int iHashCode = Long.hashCode(l46Var.T);
                            u8a u8aVarM = l46Var.m();
                            j09 j09VarJ = m93.J(l46Var, j09Var);
                            lf2.q.getClass();
                            l46Var.j0();
                            z2 = l46Var.S;
                            ov7Var = LayoutNode.h1;
                            if (z2) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            he2 he2Var = hj6.z;
                            dec.l(he2Var, l46Var, c92VarA);
                            he2 he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var, u8aVarM);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            he2 he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var, numValueOf);
                            dec.k(l46Var);
                            he2 he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var, j09VarJ);
                            int i11 = i6 << 9;
                            o7c.d(null, qheVar, null, false, null, f4, null, false, l46Var, 196608 | ((i6 << 3) & 112), 221);
                            g09Var = g09.a;
                            o5c.f(l46Var, b.d(g09Var, 8.0f));
                            if (str == null) {
                                l46Var.f0(-1791235713);
                                l46Var.r(false);
                                z3 = true;
                                r4 = 0;
                            } else {
                                l46Var.f0(-1791235712);
                                mue mueVar9 = pue.a;
                                r4 = 0;
                                z3 = true;
                                vd0.e(str, null, mue.a(pue.i(l46Var), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, new co0(w6c.l(8), w6c.l(14), w6c.l(1)), l46Var, 1597440, 426);
                                l46Var.r(false);
                            }
                            o5c.f(l46Var, b.d(g09Var, 4.0f));
                            t7c t7cVarA = s7c.a(new uc0(2.0f, z3, new qc0(r4)), ndb.z, l46Var, 54);
                            int iHashCode2 = Long.hashCode(l46Var.T);
                            u8a u8aVarM2 = l46Var.m();
                            j09 j09VarJ2 = m93.J(l46Var, g09Var);
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
                            if (qheVar.b == 0) {
                                l46Var.f0(-992853910);
                                j09 j09VarS = b.s(g09Var, ndb.f, 2);
                                pr4 pr4Var = l8b.a;
                                nte.b(afc.q(R.string.text_reverse_tag, l46Var), ynb.Z(tm7.o(j09VarS, ((e8b) l46Var.k(pr4Var)).m, a7c.b(2.0f)), 2.0f), ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar6, l46Var, 0, (i6 << 6) & 29360128, 130040);
                                l46Var.r(r4);
                            } else {
                                l46Var.f0(-992486560);
                                l46Var.r(r4);
                            }
                            mue mueVar10 = mueVar5;
                            nte.b(afc.q(r8c.f(qheVar), l46Var), null, ((e8b) l46Var.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mueVar10, l46Var, 0, (i11 & 29360128) | 24960, 110586);
                            l46Var.r(z3);
                            l46Var.r(z3);
                            mueVar4 = mueVar6;
                            f3 = f4;
                            mueVar3 = mueVar10;
                        } else {
                            l46Var.Z();
                            mueVar3 = mueVarJ;
                            mueVar4 = mueVarA;
                            f3 = f2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: rt1
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    t72.p(qheVar, j09Var, f3, str, mueVar3, mueVar4, (l46) obj, k99.P(i2 | 1), i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    mueVarA = mueVar2;
                    i5 = i9 | i10;
                    if ((74899 & i5) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i5 & 1, z)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if ((i3 & 16) != 0) {
                                mue mueVar11 = pue.a;
                                mueVarJ = pue.j(l46Var);
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                mue mueVar12 = pue.a;
                                mueVarA = mue.a(pue.h(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213);
                                i5 &= -458753;
                            }
                            i6 = i5;
                            mueVar5 = mueVarJ;
                            mueVar6 = mueVarA;
                            f4 = 6.0f;
                        } else {
                            if ((i3 & 16) != 0) {
                                mue mueVar13 = pue.a;
                                mueVarJ = pue.j(l46Var);
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                mue mueVar14 = pue.a;
                                mueVarA = mue.a(pue.h(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213);
                                i5 &= -458753;
                            }
                            i6 = i5;
                            mueVar5 = mueVarJ;
                            mueVar6 = mueVarA;
                            f4 = 6.0f;
                        }
                        l46Var.s();
                        c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var, 48);
                        int iHashCode3 = Long.hashCode(l46Var.T);
                        u8a u8aVarM3 = l46Var.m();
                        j09 j09VarJ3 = m93.J(l46Var, j09Var);
                        lf2.q.getClass();
                        l46Var.j0();
                        z2 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z2) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2 he2Var5 = hj6.z;
                        dec.l(he2Var5, l46Var, c92VarA2);
                        he2 he2Var6 = hj6.y;
                        dec.l(he2Var6, l46Var, u8aVarM3);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        he2 he2Var7 = hj6.X;
                        dec.l(he2Var7, l46Var, numValueOf2);
                        dec.k(l46Var);
                        he2 he2Var8 = hj6.x;
                        dec.l(he2Var8, l46Var, j09VarJ3);
                        int i12 = i6 << 9;
                        o7c.d(null, qheVar, null, false, null, f4, null, false, l46Var, 196608 | ((i6 << 3) & 112), 221);
                        g09Var = g09.a;
                        o5c.f(l46Var, b.d(g09Var, 8.0f));
                        if (str == null) {
                            l46Var.f0(-1791235713);
                            l46Var.r(false);
                            z3 = true;
                            r4 = 0;
                        } else {
                            l46Var.f0(-1791235712);
                            mue mueVar15 = pue.a;
                            r4 = 0;
                            z3 = true;
                            vd0.e(str, null, mue.a(pue.i(l46Var), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, new co0(w6c.l(8), w6c.l(14), w6c.l(1)), l46Var, 1597440, 426);
                            l46Var.r(false);
                        }
                        o5c.f(l46Var, b.d(g09Var, 4.0f));
                        t7c t7cVarA2 = s7c.a(new uc0(2.0f, z3, new qc0(r4)), ndb.z, l46Var, 54);
                        int iHashCode4 = Long.hashCode(l46Var.T);
                        u8a u8aVarM4 = l46Var.m();
                        j09 j09VarJ4 = m93.J(l46Var, g09Var);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var5, l46Var, t7cVarA2);
                        dec.l(he2Var6, l46Var, u8aVarM4);
                        ib8.s(iHashCode4, l46Var, he2Var7, l46Var);
                        dec.l(he2Var8, l46Var, j09VarJ4);
                        if (qheVar.b == 0) {
                            l46Var.f0(-992853910);
                            j09 j09VarS2 = b.s(g09Var, ndb.f, 2);
                            pr4 pr4Var2 = l8b.a;
                            nte.b(afc.q(R.string.text_reverse_tag, l46Var), ynb.Z(tm7.o(j09VarS2, ((e8b) l46Var.k(pr4Var2)).m, a7c.b(2.0f)), 2.0f), ((e8b) l46Var.k(pr4Var2)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar6, l46Var, 0, (i6 << 6) & 29360128, 130040);
                            l46Var.r(r4);
                        } else {
                            l46Var.f0(-992486560);
                            l46Var.r(r4);
                        }
                        mue mueVar16 = mueVar5;
                        nte.b(afc.q(r8c.f(qheVar), l46Var), null, ((e8b) l46Var.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mueVar16, l46Var, 0, (i12 & 29360128) | 24960, 110586);
                        l46Var.r(z3);
                        l46Var.r(z3);
                        mueVar4 = mueVar6;
                        f3 = f4;
                        mueVar3 = mueVar16;
                    } else {
                        l46Var.Z();
                        mueVar3 = mueVarJ;
                        mueVar4 = mueVarA;
                        f3 = f2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: rt1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                t72.p(qheVar, j09Var, f3, str, mueVar3, mueVar4, (l46) obj, k99.P(i2 | 1), i3);
                                return wef.a;
                            }
                        };
                    }
                }
                mueVarJ = mueVar;
                i4 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                int i13 = i8 | i4;
                if ((i3 & 32) == 0) {
                    mueVarA = mueVar2;
                    if (l46Var.g(mueVarA)) {
                    }
                    i5 = i13 | i10;
                    if ((74899 & i5) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i5 & 1, z)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if ((i3 & 16) != 0) {
                                mue mueVar17 = pue.a;
                                mueVarJ = pue.j(l46Var);
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                mue mueVar18 = pue.a;
                                mueVarA = mue.a(pue.h(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213);
                                i5 &= -458753;
                            }
                            i6 = i5;
                            mueVar5 = mueVarJ;
                            mueVar6 = mueVarA;
                            f4 = 6.0f;
                        } else {
                            if ((i3 & 16) != 0) {
                                mue mueVar19 = pue.a;
                                mueVarJ = pue.j(l46Var);
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                mue mueVar110 = pue.a;
                                mueVarA = mue.a(pue.h(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213);
                                i5 &= -458753;
                            }
                            i6 = i5;
                            mueVar5 = mueVarJ;
                            mueVar6 = mueVarA;
                            f4 = 6.0f;
                        }
                        l46Var.s();
                        c92 c92VarA3 = a92.a(xc0.c, ndb.Z, l46Var, 48);
                        int iHashCode5 = Long.hashCode(l46Var.T);
                        u8a u8aVarM5 = l46Var.m();
                        j09 j09VarJ5 = m93.J(l46Var, j09Var);
                        lf2.q.getClass();
                        l46Var.j0();
                        z2 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z2) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2 he2Var9 = hj6.z;
                        dec.l(he2Var9, l46Var, c92VarA3);
                        he2 he2Var10 = hj6.y;
                        dec.l(he2Var10, l46Var, u8aVarM5);
                        Integer numValueOf3 = Integer.valueOf(iHashCode5);
                        he2 he2Var11 = hj6.X;
                        dec.l(he2Var11, l46Var, numValueOf3);
                        dec.k(l46Var);
                        he2 he2Var12 = hj6.x;
                        dec.l(he2Var12, l46Var, j09VarJ5);
                        int i14 = i6 << 9;
                        o7c.d(null, qheVar, null, false, null, f4, null, false, l46Var, 196608 | ((i6 << 3) & 112), 221);
                        g09Var = g09.a;
                        o5c.f(l46Var, b.d(g09Var, 8.0f));
                        if (str == null) {
                            l46Var.f0(-1791235713);
                            l46Var.r(false);
                            z3 = true;
                            r4 = 0;
                        } else {
                            l46Var.f0(-1791235712);
                            mue mueVar111 = pue.a;
                            r4 = 0;
                            z3 = true;
                            vd0.e(str, null, mue.a(pue.i(l46Var), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, new co0(w6c.l(8), w6c.l(14), w6c.l(1)), l46Var, 1597440, 426);
                            l46Var.r(false);
                        }
                        o5c.f(l46Var, b.d(g09Var, 4.0f));
                        t7c t7cVarA3 = s7c.a(new uc0(2.0f, z3, new qc0(r4)), ndb.z, l46Var, 54);
                        int iHashCode6 = Long.hashCode(l46Var.T);
                        u8a u8aVarM6 = l46Var.m();
                        j09 j09VarJ6 = m93.J(l46Var, g09Var);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var9, l46Var, t7cVarA3);
                        dec.l(he2Var10, l46Var, u8aVarM6);
                        ib8.s(iHashCode6, l46Var, he2Var11, l46Var);
                        dec.l(he2Var12, l46Var, j09VarJ6);
                        if (qheVar.b == 0) {
                            l46Var.f0(-992853910);
                            j09 j09VarS3 = b.s(g09Var, ndb.f, 2);
                            pr4 pr4Var3 = l8b.a;
                            nte.b(afc.q(R.string.text_reverse_tag, l46Var), ynb.Z(tm7.o(j09VarS3, ((e8b) l46Var.k(pr4Var3)).m, a7c.b(2.0f)), 2.0f), ((e8b) l46Var.k(pr4Var3)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar6, l46Var, 0, (i6 << 6) & 29360128, 130040);
                            l46Var.r(r4);
                        } else {
                            l46Var.f0(-992486560);
                            l46Var.r(r4);
                        }
                        mue mueVar112 = mueVar5;
                        nte.b(afc.q(r8c.f(qheVar), l46Var), null, ((e8b) l46Var.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mueVar112, l46Var, 0, (i14 & 29360128) | 24960, 110586);
                        l46Var.r(z3);
                        l46Var.r(z3);
                        mueVar4 = mueVar6;
                        f3 = f4;
                        mueVar3 = mueVar112;
                    } else {
                        l46Var.Z();
                        mueVar3 = mueVarJ;
                        mueVar4 = mueVarA;
                        f3 = f2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: rt1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                t72.p(qheVar, j09Var, f3, str, mueVar3, mueVar4, (l46) obj, k99.P(i2 | 1), i3);
                                return wef.a;
                            }
                        };
                    }
                }
                mueVarA = mueVar2;
                i5 = i13 | i10;
                if ((74899 & i5) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i5 & 1, z)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if ((i3 & 16) != 0) {
                            mue mueVar113 = pue.a;
                            mueVarJ = pue.j(l46Var);
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            mue mueVar114 = pue.a;
                            mueVarA = mue.a(pue.h(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213);
                            i5 &= -458753;
                        }
                        i6 = i5;
                        mueVar5 = mueVarJ;
                        mueVar6 = mueVarA;
                        f4 = 6.0f;
                    } else {
                        if ((i3 & 16) != 0) {
                            mue mueVar115 = pue.a;
                            mueVarJ = pue.j(l46Var);
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            mue mueVar116 = pue.a;
                            mueVarA = mue.a(pue.h(l46Var), 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213);
                            i5 &= -458753;
                        }
                        i6 = i5;
                        mueVar5 = mueVarJ;
                        mueVar6 = mueVarA;
                        f4 = 6.0f;
                    }
                    l46Var.s();
                    c92 c92VarA4 = a92.a(xc0.c, ndb.Z, l46Var, 48);
                    int iHashCode7 = Long.hashCode(l46Var.T);
                    u8a u8aVarM7 = l46Var.m();
                    j09 j09VarJ7 = m93.J(l46Var, j09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    z2 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var13 = hj6.z;
                    dec.l(he2Var13, l46Var, c92VarA4);
                    he2 he2Var14 = hj6.y;
                    dec.l(he2Var14, l46Var, u8aVarM7);
                    Integer numValueOf4 = Integer.valueOf(iHashCode7);
                    he2 he2Var15 = hj6.X;
                    dec.l(he2Var15, l46Var, numValueOf4);
                    dec.k(l46Var);
                    he2 he2Var16 = hj6.x;
                    dec.l(he2Var16, l46Var, j09VarJ7);
                    int i15 = i6 << 9;
                    o7c.d(null, qheVar, null, false, null, f4, null, false, l46Var, 196608 | ((i6 << 3) & 112), 221);
                    g09Var = g09.a;
                    o5c.f(l46Var, b.d(g09Var, 8.0f));
                    if (str == null) {
                        l46Var.f0(-1791235713);
                        l46Var.r(false);
                        z3 = true;
                        r4 = 0;
                    } else {
                        l46Var.f0(-1791235712);
                        mue mueVar117 = pue.a;
                        r4 = 0;
                        z3 = true;
                        vd0.e(str, null, mue.a(pue.i(l46Var), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, new co0(w6c.l(8), w6c.l(14), w6c.l(1)), l46Var, 1597440, 426);
                        l46Var.r(false);
                    }
                    o5c.f(l46Var, b.d(g09Var, 4.0f));
                    t7c t7cVarA4 = s7c.a(new uc0(2.0f, z3, new qc0(r4)), ndb.z, l46Var, 54);
                    int iHashCode8 = Long.hashCode(l46Var.T);
                    u8a u8aVarM8 = l46Var.m();
                    j09 j09VarJ8 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var13, l46Var, t7cVarA4);
                    dec.l(he2Var14, l46Var, u8aVarM8);
                    ib8.s(iHashCode8, l46Var, he2Var15, l46Var);
                    dec.l(he2Var16, l46Var, j09VarJ8);
                    if (qheVar.b == 0) {
                        l46Var.f0(-992853910);
                        j09 j09VarS4 = b.s(g09Var, ndb.f, 2);
                        pr4 pr4Var4 = l8b.a;
                        nte.b(afc.q(R.string.text_reverse_tag, l46Var), ynb.Z(tm7.o(j09VarS4, ((e8b) l46Var.k(pr4Var4)).m, a7c.b(2.0f)), 2.0f), ((e8b) l46Var.k(pr4Var4)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar6, l46Var, 0, (i6 << 6) & 29360128, 130040);
                        l46Var.r(r4);
                    } else {
                        l46Var.f0(-992486560);
                        l46Var.r(r4);
                    }
                    mue mueVar118 = mueVar5;
                    nte.b(afc.q(r8c.f(qheVar), l46Var), null, ((e8b) l46Var.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mueVar118, l46Var, 0, (i15 & 29360128) | 24960, 110586);
                    l46Var.r(z3);
                    l46Var.r(z3);
                    mueVar4 = mueVar6;
                    f3 = f4;
                    mueVar3 = mueVar118;
                } else {
                    l46Var.Z();
                    mueVar3 = mueVarJ;
                    mueVar4 = mueVarA;
                    f3 = f2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: rt1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            t72.p(qheVar, j09Var, f3, str, mueVar3, mueVar4, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }

            public static ArrayList q(Object... objArr) {
                return objArr.length == 0 ? new ArrayList() : new ArrayList(new yc0(objArr, true));
            }

            public static gh0 r() throws InterruptedException {
                sug sugVar = gh0.h;
                gh0 gh0Var = ((gh0[]) sugVar.c)[1];
                if (gh0Var == null) {
                    long jNanoTime = System.nanoTime();
                    gh0.k.await(gh0.l, TimeUnit.MILLISECONDS);
                    if (((gh0[]) sugVar.c)[1] != null || System.nanoTime() - jNanoTime < gh0.m) {
                        return null;
                    }
                    return gh0.i;
                }
                long jNanoTime2 = gh0Var.g - System.nanoTime();
                if (jNanoTime2 > 0) {
                    gh0.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
                    return null;
                }
                sugVar.r(gh0Var);
                gh0Var.e = 2;
                return gh0Var;
            }

            public static int s(ArrayList arrayList, Comparable comparable) {
                int size = arrayList.size();
                arrayList.getClass();
                V(arrayList.size(), size);
                int i2 = size - 1;
                int i3 = 0;
                while (i3 <= i2) {
                    int i4 = (i3 + i2) >>> 1;
                    int iM = i7h.m((Comparable) arrayList.get(i4), comparable);
                    if (iM < 0) {
                        i3 = i4 + 1;
                    } else {
                        if (iM <= 0) {
                            return i4;
                        }
                        i2 = i4 - 1;
                    }
                }
                return -(i3 + 1);
            }

            public static m22 t(Class cls) {
                int i2 = 0;
                while (cls.isArray()) {
                    i2++;
                    cls = cls.getComponentType();
                    cls.getClass();
                }
                if (!cls.isPrimitive()) {
                    j22 j22VarA = smb.a(cls);
                    String str = qf7.a;
                    j22 j22VarG = qf7.g(j22VarA.a());
                    if (j22VarG != null) {
                        j22VarA = j22VarG;
                    }
                    return new m22(j22VarA, i2);
                }
                if (cls.equals(Void.TYPE)) {
                    dx5 dx5VarI = syd.d.i();
                    return new m22(new j22(dx5VarI.b(), dx5VarI.a.g()), i2);
                }
                jua juaVarE = al7.b(cls.getName()).e();
                juaVarE.getClass();
                if (i2 > 0) {
                    dx5 dx5VarB = juaVarE.b();
                    dx5VarB.getClass();
                    return new m22(new j22(dx5VarB.b(), dx5VarB.a.g()), i2 - 1);
                }
                dx5 dx5VarD = juaVarE.d();
                dx5VarD.getClass();
                return new m22(new j22(dx5VarD.b(), dx5VarD.a.g()), i2);
            }

            public static int u(Iterable iterable, int i2) {
                iterable.getClass();
                return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
            }

            public static final Type v(yn7 yn7Var, boolean z) {
                um7 um7VarB = yn7Var.B();
                if (um7VarB instanceof ao7) {
                    ao7 ao7Var = (ao7) um7VarB;
                    GenericDeclaration genericDeclaration = (GenericDeclaration) ao7Var.b.getValue();
                    if (genericDeclaration == null) {
                        s8f.n(yn7Var, "javaType is not supported for this type: ");
                        return null;
                    }
                    TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                    typeParameters.getClass();
                    TypeVariable<?> typeVariable = null;
                    boolean z2 = false;
                    for (TypeVariable<?> typeVariable2 : typeParameters) {
                        if (pa7.t(typeVariable2.getName(), ao7Var.c)) {
                            if (z2) {
                                qc0.j("Array contains more than one matching element.");
                                return null;
                            }
                            z2 = true;
                            typeVariable = typeVariable2;
                        }
                    }
                    if (z2) {
                        typeVariable.getClass();
                        return typeVariable;
                    }
                    r3.n("Array contains no element matching the predicate.");
                    return null;
                }
                if (!(um7VarB instanceof em7)) {
                    s8f.n(yn7Var, "Unsupported type classifier: ");
                    return null;
                }
                em7 em7Var = (em7) um7VarB;
                Class clsS = z ? af1.S(em7Var) : af1.R(em7Var);
                List listA = yn7Var.A();
                if (listA.isEmpty()) {
                    return clsS;
                }
                if (!clsS.isArray()) {
                    return x(listA, clsS);
                }
                if (clsS.getComponentType().isPrimitive()) {
                    return clsS;
                }
                do7 do7Var = (do7) s72.Z0(listA);
                if (do7Var == null) {
                    yg5.l(yn7Var, "kotlin.Array must have exactly one type argument: ");
                    return null;
                }
                io7 io7Var = do7Var.a;
                yn7 yn7Var2 = do7Var.b;
                int i2 = io7Var == null ? -1 : n9f.a[io7Var.ordinal()];
                if (i2 == -1 || i2 == 1) {
                    return clsS;
                }
                if (i2 != 2 && i2 != 3) {
                    ap.c();
                    return null;
                }
                yn7Var2.getClass();
                Type typeV = v(yn7Var2, false);
                return typeV instanceof Class ? clsS : new m66(typeV);
            }

            public static c78 w() {
                return new c78(10);
            }

            public static final mz9 x(List list, Class cls) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null) {
                    ArrayList arrayList = new ArrayList(u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(D((do7) it.next()));
                    }
                    return new mz9(cls, null, arrayList);
                }
                if (Modifier.isStatic(cls.getModifiers())) {
                    ArrayList arrayList2 = new ArrayList(u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(D((do7) it2.next()));
                    }
                    return new mz9(cls, declaringClass, arrayList2);
                }
                int length = cls.getTypeParameters().length;
                mz9 mz9VarX = x(list.subList(length, list.size()), declaringClass);
                List listSubList = list.subList(0, length);
                ArrayList arrayList3 = new ArrayList(u(listSubList, 10));
                Iterator it3 = listSubList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(D((do7) it3.next()));
                }
                return new mz9(cls, mz9VarX, arrayList3);
            }

            public static ArrayList y(Iterable iterable) {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    x72.g0(arrayList, (Iterable) it.next());
                }
                return arrayList;
            }

            public static final sv2 z(Executor executor) {
                ea4 ea4Var = executor instanceof ea4 ? (ea4) executor : null;
                return ea4Var != null ? ea4Var.a : new d35(executor);
            }
        }
