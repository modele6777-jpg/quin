package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.DoubleUnaryOperator;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vpf {
    public static final dd2 b;
    public static final dd2 d;
    public static final dd2 e;
    public static final dd2 f;
    public static final char[] g;
    public static final char[] h;
    public static final StackTraceElement[] i;
    public static final int[] j;
    public static final dd2 a = new dd2(new ym0(10), false, 2081839776);
    public static final dd2 c = new dd2(new md2(19), false, -591190770);

    static {
        int i2 = 18;
        b = new dd2(new md2(i2), false, 1566296357);
        new dd2(new kd2(29), false, 1553653671);
        d = new dd2(new de2(6), false, 71330321);
        e = new dd2(new ce2(12), false, 1950389384);
        f = new dd2(new he2(i2), false, -1397060845);
        g = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        h = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        i = new StackTraceElement[0];
        j = new int[]{1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    }

    public static final String A(ma8 ma8Var, Context context) {
        context.getClass();
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        qfc qfcVar = ag3.a;
        ks2 ks2Var = new ks2(12, locale, ma8Var);
        qfcVar.getClass();
        cg3 cg3Var = new cg3(new mx(1, false));
        ks2Var.d(cg3Var);
        v81 v81VarBuild = cg3Var.build();
        int i2 = eg3.a;
        bg3 bg3Var = new bg3();
        y07 y07Var = bg3Var.a;
        y07Var.getClass();
        Integer numValueOf = Integer.valueOf(ma8Var.j());
        d17 d17Var = y07Var.a;
        d17Var.a = numValueOf;
        d17Var.b = Integer.valueOf(ok8.x(ma8Var.g()));
        y07Var.b = Integer.valueOf(ma8Var.b());
        gh3 gh3VarD = ma8Var.d();
        gh3VarD.getClass();
        y07Var.c = Integer.valueOf(gh3VarD.ordinal() + 1);
        y07Var.d = Integer.valueOf(ma8Var.e());
        StringBuilder sb = new StringBuilder();
        v81VarBuild.b.a(bg3Var, sb, false);
        return sb.toString();
    }

    public static final fxd B(s39 s39Var, t39 t39Var) {
        int iOrdinal = t39Var.ordinal();
        if (iOrdinal == 0) {
            s39Var.getClass();
            fxd fxdVar = s39.b;
            fxdVar.getClass();
            return fxdVar;
        }
        if (iOrdinal == 1) {
            s39Var.getClass();
            fxd fxdVar2 = s39.c;
            fxdVar2.getClass();
            return fxdVar2;
        }
        if (iOrdinal == 2) {
            s39Var.getClass();
            fxd fxdVar3 = s39.d;
            fxdVar3.getClass();
            return fxdVar3;
        }
        if (iOrdinal == 3) {
            s39Var.getClass();
            fxd fxdVar4 = s39.e;
            fxdVar4.getClass();
            return fxdVar4;
        }
        if (iOrdinal == 4) {
            s39Var.getClass();
            fxd fxdVar5 = s39.f;
            fxdVar5.getClass();
            return fxdVar5;
        }
        if (iOrdinal != 5) {
            ap.c();
            return null;
        }
        s39Var.getClass();
        fxd fxdVar6 = s39.g;
        fxdVar6.getClass();
        return fxdVar6;
    }

    public static final oo5 C(oo5 oo5Var) {
        boolean z = oo5Var.a.Y;
        if (z) {
            if (!z) {
                i37.c("visitChildren called on an unattached node");
            }
            p89 p89Var = new p89(0, new i09[16]);
            i09 i09Var = oo5Var.a;
            i09 i09Var2 = i09Var.f;
            if (i09Var2 == null) {
                vd0.H(p89Var, i09Var);
            } else {
                p89Var.b(i09Var2);
            }
            while (true) {
                int i2 = p89Var.c;
                if (i2 == 0) {
                    break;
                }
                i09 i09VarM0 = (i09) p89Var.k(i2 - 1);
                if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                    vd0.H(p89Var, i09VarM0);
                } else {
                    while (i09VarM0 != null) {
                        if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            p89 p89Var2 = null;
                            while (i09VarM0 != null) {
                                if (i09VarM0 instanceof oo5) {
                                    oo5 oo5Var2 = (oo5) i09VarM0;
                                    if (oo5Var2.a.Y) {
                                        int iOrdinal = oo5Var2.q1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return oo5Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            ap.c();
                                            return null;
                                        }
                                    }
                                } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                    int i3 = 0;
                                    for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                        if ((i09Var3.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                i09VarM0 = i09Var3;
                                            } else {
                                                if (p89Var2 == null) {
                                                    p89Var2 = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var2.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var2.b(i09Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                i09VarM0 = vd0.m0(p89Var2);
                            }
                            break;
                        }
                        i09VarM0 = i09VarM0.f;
                    }
                }
            }
        }
        return null;
    }

    public static final int D(ar5 ar5Var, int i2) {
        boolean z = ar5Var.compareTo(ar5.d) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final ArrayList E(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new tmb(annotation));
        }
        return arrayList;
    }

    public static final Object F(q56 q56Var, s56 s56Var) {
        q56Var.getClass();
        if (q56Var.p(s56Var)) {
            return q56Var.m(s56Var);
        }
        return null;
    }

    public static final bo7 G(TypeVariable typeVariable) throws IOException {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (nm7) job.a.b((Class) genericDeclaration);
        }
        boolean z = false;
        Object obj = null;
        if (genericDeclaration instanceof Constructor) {
            Class declaringClass = ((Constructor) genericDeclaration).getDeclaringClass();
            declaringClass.getClass();
            nm7 nm7Var = (nm7) job.a.b(declaringClass);
            Iterator it = nm7Var.k().iterator();
            Object obj2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object next = it.next();
                if (pa7.t(abg.y((ym7) next), genericDeclaration)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            }
            ue7 ue7Var = (ue7) obj;
            if (ue7Var != null) {
                return ue7Var;
            }
            StringBuilder sb = new StringBuilder("Constructor ");
            sb.append(genericDeclaration);
            sb.append(" is not found in ");
            sb.append(nm7Var);
            String strD0 = s72.D0(nm7Var.k(), "\n", null, null, zo1.R0, 30);
            sb.append(":\n");
            sb.append(strD0);
            throw new pt7(sb.toString());
        }
        if (!(genericDeclaration instanceof Method)) {
            r82.h("Unsupported container of a type parameter: ", genericDeclaration, " (", typeVariable);
            return null;
        }
        Method method = (Method) genericDeclaration;
        if (!Modifier.isStatic(method.getModifiers())) {
            ho7.y(genericDeclaration, "Only static methods are supported for now: ");
            return null;
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        declaringClass2.getClass();
        nm7 nm7Var2 = (nm7) job.a.b(declaringClass2);
        Iterator it2 = tm7.G(nm7Var2).iterator();
        Object obj3 = null;
        while (true) {
            if (!it2.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj3;
                break;
            }
            Object next2 = it2.next();
            if (pa7.t(abg.A((ym7) next2), genericDeclaration)) {
                if (z) {
                    break;
                }
                z = true;
                obj3 = next2;
            }
        }
        we7 we7Var = (we7) obj;
        if (we7Var != null) {
            return we7Var;
        }
        StringBuilder sb2 = new StringBuilder("Method ");
        sb2.append(genericDeclaration);
        sb2.append(" is not found in ");
        sb2.append(nm7Var2);
        String strD1 = s72.D0(tm7.G(nm7Var2), "\n", null, null, zo1.L0, 30);
        sb2.append(":\n");
        sb2.append(strD1);
        throw new pt7(sb2.toString());
    }

    public static final o48 H(x48 x48Var) {
        h48 h48VarK = x48Var.k();
        h48VarK.getClass();
        kd9 kd9Var = h48VarK.a;
        while (true) {
            o48 o48Var = (o48) ((AtomicReference) kd9Var.b).get();
            if (o48Var != null) {
                return o48Var;
            }
            t8e t8eVarD = iqf.d();
            js3 js3Var = ga4.a;
            o48 o48Var2 = new o48(h48VarK, i7h.I(t8eVarD, mk8.a.f));
            AtomicReference atomicReference = (AtomicReference) kd9Var.b;
            do {
                if (atomicReference.compareAndSet(null, o48Var2)) {
                    js3 js3Var2 = ga4.a;
                    ynb.V(o48Var2, mk8.a.f, null, new n48(o48Var2, null), 2);
                    return o48Var2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final boolean I(oo5 oo5Var) {
        LayoutNode layoutNode;
        yf9 yf9Var;
        LayoutNode layoutNode2;
        yf9 yf9Var2 = oo5Var.v;
        return (yf9Var2 == null || (layoutNode = yf9Var2.J0) == null || !layoutNode.X() || (yf9Var = oo5Var.v) == null || (layoutNode2 = yf9Var.J0) == null || !layoutNode2.W()) ? false : true;
    }

    public static final boolean J(Member member) {
        member.getClass();
        if (member instanceof Method) {
            Method method = (Method) member;
            if (method.getDeclaringClass().isEnum() && Modifier.isStatic(method.getModifiers())) {
                if (!pa7.t(method.getName(), "values") || method.getParameterTypes().length != 0) {
                    if (pa7.t(method.getName(), "valueOf")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (pa7.t(parameterTypes.length == 1 ? parameterTypes[0] : null, String.class)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean K(f41 f41Var) {
        f41Var.getClass();
        try {
            yhb yhbVarPeek = f41Var.peek();
            for (long j2 = 0; j2 < 16 && !yhbVarPeek.b(); j2++) {
                yhbVarPeek.h0(1L);
                f41 f41Var2 = yhbVarPeek.b;
                byte bG = f41Var2.G(0L);
                if ((bG & 224) == 192) {
                    yhbVarPeek.h0(2L);
                } else if ((bG & 240) == 224) {
                    yhbVarPeek.h0(3L);
                } else if ((bG & 248) == 240) {
                    yhbVarPeek.h0(4L);
                }
                int iB1 = f41Var2.b1();
                if (Character.isISOControl(iB1) && !Character.isWhitespace(iB1)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final String L(LocalDate localDate, Context context, cye cyeVar) {
        localDate.getClass();
        context.getClass();
        String str = DateFormat.getMediumDateFormat(context).format(Date.from(localDate.atTime(0, 0).atZone(cyeVar.a).toInstant()));
        str.getClass();
        return str;
    }

    public static final long M(v86 v86Var, l46 l46Var) {
        v86Var.getClass();
        return g21.S(l46Var) ? u86.a : u86.b;
    }

    public static final v86 N(GiftCardSku giftCardSku) {
        giftCardSku.getClass();
        int i2 = w86.a[giftCardSku.ordinal()];
        if (i2 == 1) {
            v86 v86Var = u86.c;
            return u86.d;
        }
        if (i2 == 2 || i2 == 3) {
            v86 v86Var2 = u86.c;
            return u86.c;
        }
        ap.c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0170  */
    /* JADX WARN: Code duplicated, block: B:112:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0179  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static qsd O(m95 m95Var, boolean z) {
        qsd qsdVar;
        boolean z2;
        long jT;
        int i2;
        int i3;
        long j2;
        boolean z3;
        int[] iArr;
        long length = m95Var.getLength();
        long j3 = -1;
        long j4 = 4096;
        if (length != -1 && length <= 4096) {
            j4 = length;
        }
        int i4 = (int) j4;
        d0a d0aVar = new d0a(64);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (true) {
            if (i6 < i4) {
                d0aVar.J(8);
                if (m95Var.d(d0aVar.a, i5, 8, true)) {
                    long jB = d0aVar.B();
                    int iM = d0aVar.m();
                    if (jB == 1) {
                        m95Var.o(d0aVar.a, 8, 8);
                        i2 = 16;
                        d0aVar.L(16);
                        jT = d0aVar.t();
                    } else {
                        if (jB == 0) {
                            long length2 = m95Var.getLength();
                            if (length2 != j3) {
                                jB = (length2 - m95Var.e()) + 8;
                            }
                        }
                        jT = jB;
                        i2 = 8;
                    }
                    long j5 = i2;
                    if (jT < j5) {
                        qsdVar = null;
                        if (iM != 1718773093 || i2 != 8) {
                            return new rh0(iM, i2, jT);
                        }
                        jT = j5;
                    } else {
                        qsdVar = null;
                    }
                    int i7 = i6 + i2;
                    if (iM == 1836019574 || iM == 1970628964) {
                        i4 += (int) jT;
                        i3 = iM;
                        if (length != -1 && i4 > length) {
                            i4 = (int) length;
                        }
                        if (i3 == 1836019574) {
                            i6 = i7;
                        }
                        j3 = -1;
                        i5 = 0;
                    } else {
                        i3 = iM;
                    }
                    if (i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086) {
                        j2 = length;
                        i6 = i7;
                    } else if (i3 == 1836019558 || i3 == 1836475768) {
                        z2 = true;
                    } else {
                        if (i3 == 1835295092) {
                            z4 = true;
                        }
                        if (i3 != 1937007212 || jT <= 1000000) {
                            j2 = length;
                            if ((((long) i7) + jT) - j5 < i4) {
                                int i8 = (int) (jT - j5);
                                i6 = i7 + i8;
                                if (i3 == 1718909296) {
                                    if (i8 < 8) {
                                        return new rh0(i3, 8, i8);
                                    }
                                    d0aVar.J(i8);
                                    int i9 = 0;
                                    m95Var.o(d0aVar.a, 0, i8);
                                    int iM2 = d0aVar.m();
                                    int i10 = iM2 >>> 8;
                                    int[] iArr2 = j;
                                    if (i10 == 3368816) {
                                        z4 = true;
                                        break;
                                    }
                                    for (int i11 = 0; i11 < 29; i11++) {
                                        if (iArr2[i11] == iM2) {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                    d0aVar.N(4);
                                    int iA = d0aVar.a() / 4;
                                    if (!z4 && iA > 0) {
                                        int[] iArr3 = new int[iA];
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= iA) {
                                                iArr = iArr3;
                                                z3 = z4;
                                                break;
                                            }
                                            int iM3 = d0aVar.m();
                                            iArr3[i12] = iM3;
                                            if ((iM3 >>> 8) != 3368816) {
                                                int i13 = i9;
                                                while (true) {
                                                    if (i13 >= 29) {
                                                        i12++;
                                                        i9 = 0;
                                                    } else if (iArr2[i13] != iM3) {
                                                        i13++;
                                                    }
                                                }
                                            }
                                            iArr = iArr3;
                                            z3 = true;
                                            break;
                                        }
                                    }
                                    z3 = z4;
                                    iArr = qsdVar;
                                    if (!z3) {
                                        return new sug(iArr, iM2);
                                    }
                                    z4 = z3;
                                } else if (i8 != 0) {
                                    m95Var.f(i8);
                                }
                            }
                        }
                        z2 = false;
                    }
                    length = j2;
                    j3 = -1;
                    i5 = 0;
                }
                if (!z4) {
                    return af8.J0;
                }
                if (z != z2) {
                    return z2 ? f17.c : f17.d;
                }
                return qsdVar;
            }
            qsdVar = null;
            z2 = false;
            if (!z4) {
                return af8.J0;
            }
            if (z != z2) {
                if (z2) {
                }
            }
            return qsdVar;
        }
    }

    public static boolean P(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final j2 Q(ljd ljdVar, Type type, b8f b8fVar, boolean z) {
        if (z) {
            return ljdVar;
        }
        um7 um7Var = ljdVar.b;
        List<do7> list = ljdVar.c;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (do7 do7Var : list) {
            yn7 yn7Var = do7Var.b;
            if (yn7Var != null) {
                do7Var = new do7(yn7Var, io7.c);
            }
            arrayList.add(do7Var);
        }
        ljd ljdVarV = v(type, um7Var, arrayList, b8fVar != b8f.a);
        xt2 xt2Var = new xt2(1, type);
        boolean zEquals = ljdVar.equals(ljdVarV);
        Object aj5Var = ljdVar;
        if (!zEquals) {
            aj5Var = new aj5(ljdVar, ljdVarV, false, xt2Var);
        }
        return (aj5) aj5Var;
    }

    public static final String R(byte b2) {
        char[] cArr = tq.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String S(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = tq.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        y7h.o(i3, 8, 8);
        return new String(cArr2, i3, 8 - i3);
    }

    public static final List T(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(s72.v0(list));
        }
        return pu4.a;
    }

    public static final Map U(Map map) {
        int size = map.size();
        if (size == 0) {
            return qu4.a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) s72.u0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:138:0x033d  */
    /* JADX WARN: Code duplicated, block: B:139:0x033f A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    public static yn7 V(Type type, Map map, b8f b8fVar, boolean z, boolean z2, u8f u8fVar, int i2) throws IOException {
        yn7 yn7Var;
        ljd ljdVarV;
        ArrayList arrayList;
        zo1 zo1Var = zo1.Q0;
        zo1 zo1Var2 = zo1.P0;
        int i3 = i2 & 2;
        b8f b8fVar2 = b8f.c;
        b8f b8fVar3 = i3 != 0 ? b8fVar2 : b8fVar;
        boolean z3 = (i2 & 4) != 0 ? false : z;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        u8f u8fVar2 = (i2 & 16) != 0 ? u8f.b : u8fVar;
        type.getClass();
        b8fVar3.getClass();
        u8fVar2.getClass();
        if (type.equals(Void.TYPE)) {
            return qyd.e;
        }
        boolean z5 = type instanceof Class;
        do7 do7VarX = null;
        if (z5) {
            Class cls = (Class) type;
            if (!j(cls).isEmpty() && !z4) {
                em7 em7VarB = (z3 && cls.equals(Class.class)) ? job.a.b(em7.class) : job.a.b(cls);
                List listJ = j(cls);
                ArrayList arrayList2 = new ArrayList(t72.u(listJ, 10));
                int i4 = 0;
                for (Object obj : listJ) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        t72.Z();
                        throw null;
                    }
                    Type[] bounds = ((TypeVariable) fyc.w(fyc.u(zo1.M0, (TypeVariable) obj))).getBounds();
                    bounds.getClass();
                    Type type2 = (Type) qd0.l0(bounds);
                    b8f b8fVar4 = b8f.a;
                    if (!z3) {
                        if (pa7.t(af1.R(em7VarB).getCanonicalName(), em7VarB.g())) {
                            b8fVar4 = b8fVar2;
                        } else if (!oa7.U(qn4.x((um7) xo1.g(em7VarB).get(i4), null, false, 7), qyd.a)) {
                            b8fVar4 = b8f.b;
                        }
                    }
                    do7 do7Var = do7.c;
                    type2.getClass();
                    arrayList2.add(db6.b0(V(type2, map, b8fVar4, false, true, null, 20)));
                    i4 = i5;
                }
                ljd ljdVarV2 = v(cls, em7VarB, arrayList2, false);
                ljd ljdVarW = w(ljdVarV2, cls);
                if (ljdVarW != null) {
                    ljdVarV2 = ljdVarW;
                }
                List<TypeVariable> listJ2 = j(cls);
                ArrayList arrayList3 = new ArrayList(t72.u(listJ2, 10));
                for (TypeVariable typeVariable : listJ2) {
                    arrayList3.add(do7.c);
                }
                ljd ljdVarV3 = v(cls, em7VarB, arrayList3, true);
                return ljdVarV2.equals(ljdVarV3) ? ljdVarV2 : new aj5(ljdVarV2, ljdVarV3, true, new j5(6, cls));
            }
            if (cls.isArray()) {
                if (!cls.getComponentType().isPrimitive()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    do7VarX = X(componentType, map, z3);
                }
                return Q(v(type, job.a.b(cls), t72.J(do7VarX), false), type, b8fVar3, z3);
            }
            em7 em7VarB2 = job.a.b(cls);
            List<TypeVariable> listJ3 = j(cls);
            ArrayList arrayList4 = new ArrayList(t72.u(listJ3, 10));
            for (TypeVariable typeVariable2 : listJ3) {
                arrayList4.add(do7.c);
            }
            ljdVarV = v(type, em7VarB2, arrayList4, false);
            yn7Var = null;
        } else {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                genericComponentType.getClass();
                do7 do7VarX2 = X(genericComponentType, map, z3);
                yn7 yn7Var2 = do7VarX2.b;
                yn7Var2.getClass();
                return Q(v(type, job.a.b(sqf.e(af1.R(pa7.V(yn7Var2)))), t72.H(do7VarX2), false), type, b8fVar3, z3);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                rawType.getClass();
                yn7Var = null;
                Class cls2 = (Class) rawType;
                em7 em7VarB3 = (z3 && cls2.equals(Class.class)) ? job.a.b(em7.class) : job.a.b(cls2);
                if (z4) {
                    List<Type> listA = fyc.A(new zi5(fyc.u(zo1Var2, parameterizedType), zo1Var, iyc.a));
                    arrayList = new ArrayList(t72.u(listA, 10));
                    for (Type type3 : listA) {
                        arrayList.add(do7.c);
                    }
                } else {
                    List listA2 = fyc.A(new zi5(fyc.u(zo1Var2, parameterizedType), zo1Var, iyc.a));
                    arrayList = new ArrayList(t72.u(listA2, 10));
                    Iterator it = listA2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(X((Type) it.next(), map, z3));
                    }
                }
                ljdVarV = v(type, em7VarB3, arrayList, false);
            } else {
                yn7Var = null;
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        ho7.m(type, "Wildcard type is not possible here: ");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type);
                    Class<?> cls3 = type.getClass();
                    sb.append(" (");
                    sb.append(cls3);
                    sb.append(')');
                    throw new pt7(sb.toString());
                }
                TypeVariable typeVariable3 = (TypeVariable) type;
                ao7 ao7Var = (ao7) map.get(typeVariable3);
                if (ao7Var == null) {
                    Iterator it2 = G(typeVariable3).getTypeParameters().iterator();
                    Object obj2 = null;
                    boolean z6 = false;
                    while (true) {
                        if (!it2.hasNext()) {
                            if (!z6) {
                                break;
                            }
                            break;
                        }
                        Object next = it2.next();
                        if (pa7.t(((ao7) next).c, typeVariable3.getName())) {
                            if (!z6) {
                                obj2 = next;
                                z6 = true;
                            }
                        }
                        obj2 = null;
                        break;
                    }
                    ao7Var = (ao7) obj2;
                    if (ao7Var == null) {
                        throw new pt7("Type parameter " + typeVariable3.getName() + " is not found in " + G(typeVariable3));
                    }
                }
                ljdVarV = v(type, ao7Var, pu4.a, false);
            }
        }
        if (!z3) {
            ljd ljdVarW2 = w(ljdVarV, type);
            if (u8fVar2 != u8f.a) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    actualTypeArguments.getClass();
                    Type type4 = (Type) qd0.u0(actualTypeArguments);
                    if ((type4 instanceof WildcardType) && ((WildcardType) type4).getLowerBounds().length == 1 && ljdVarW2 != 0) {
                        um7 um7Var = ljdVarW2.b;
                        um7Var.getClass();
                        if (((ao7) s72.F0(((em7) um7Var).getTypeParameters())).d == io7.c) {
                            if (ljdVarW2 == 0) {
                                ljdVarW2 = ljdVarV;
                            }
                        }
                    }
                }
                if (ljdVarW2 != 0) {
                    xt2 xt2Var = new xt2(0, type);
                    if (!ljdVarW2.equals(ljdVarV)) {
                        ljdVarW2 = new aj5(ljdVarW2, ljdVarV, false, xt2Var);
                    }
                } else {
                    ljdVarW2 = ljdVarV;
                }
            } else if (ljdVarW2 == 0) {
                ljdVarW2 = ljdVarV;
            }
            int iOrdinal = b8fVar3.ordinal();
            if (iOrdinal == 0) {
                return ljdVarW2;
            }
            if (iOrdinal == 1) {
                return ljdVarW2.C(true);
            }
            if (iOrdinal != 2) {
                ap.c();
                return yn7Var;
            }
            if (!z5 || !((Class) type).isPrimitive()) {
                j2 j2VarY = ljdVarW2.y();
                j2 j2Var = j2VarY;
                if (j2VarY == null) {
                    j2Var = ljdVarW2;
                }
                j2 j2VarF = ljdVarW2.F();
                j2 j2Var2 = ljdVarW2;
                if (j2VarF != null) {
                    j2Var2 = j2VarF;
                }
                j2 j2VarC = j2Var2.C(true);
                return j2Var.equals(j2VarC) ? j2Var : new aj5(j2Var, j2VarC, false, new xt2(2, type));
            }
        }
        return ljdVarV;
    }

    public static final List W(TypeVariable[] typeVariableArr, bo7 bo7Var) {
        bo7 bo7VarO0;
        typeVariableArr.getClass();
        int iF = bm8.F(typeVariableArr.length);
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (TypeVariable typeVariable : typeVariableArr) {
            wnb wnbVar = bo7Var instanceof wnb ? (wnb) bo7Var : null;
            if (wnbVar == null || (bo7VarO0 = ynb.o0(wnbVar)) == null) {
                bo7VarO0 = bo7Var;
            }
            String name = typeVariable.getName();
            name.getClass();
            linkedHashMap.put(typeVariable, new ao7(null, bo7VarO0, name, io7.a));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
            ao7 ao7Var = (ao7) entry.getValue();
            Type[] bounds = typeVariable2.getBounds();
            bounds.getClass();
            ArrayList arrayList = new ArrayList(bounds.length);
            for (Type type : bounds) {
                type.getClass();
                arrayList.add(V(type, linkedHashMap, null, false, false, null, 30));
            }
            ao7Var.getClass();
            ao7Var.f = arrayList;
        }
        return s72.j1(linkedHashMap.values());
    }

    public static final do7 X(Type type, Map map, boolean z) {
        if (!(type instanceof WildcardType)) {
            do7 do7Var = do7.c;
            return db6.b0(V(type, map, null, z, false, null, 26));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            ho7.m(type, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            do7 do7Var2 = do7.c;
            Object objY0 = qd0.y0(lowerBounds);
            objY0.getClass();
            yn7 yn7VarV = V((Type) objY0, map, null, z, false, null, 26);
            yn7VarV.getClass();
            return new do7(yn7VarV, io7.b);
        }
        if (upperBounds.length != 1) {
            return do7.c;
        }
        if (pa7.t((Type) qd0.y0(upperBounds), Object.class)) {
            return do7.c;
        }
        do7 do7Var3 = do7.c;
        Object objY1 = qd0.y0(upperBounds);
        objY1.getClass();
        yn7 yn7VarV2 = V((Type) objY1, map, null, z, false, null, 26);
        yn7VarV2.getClass();
        return new do7(yn7VarV2, io7.c);
    }

    public static final w57 Y(Instant instant) {
        instant.getClass();
        w57 w57Var = w57.a;
        return mh3.x(instant.toEpochMilli());
    }

    public static final fxd Z(t39 t39Var, l46 l46Var) {
        return B((s39) l46Var.k(vm8.a), t39Var);
    }

    public static final void a(final nu1 nu1Var, final x16 x16Var, l46 l46Var, int i2) {
        jx jxVar;
        jx jxVar2;
        n69 n69Var;
        final tt1 tt1Var;
        l46Var.h0(-1701204835);
        int i3 = i2 | (l46Var.g(nu1Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            final sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            final gh6 gh6VarW0 = kj0.w0(l46Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            final aw2 aw2Var = (aw2) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = qk2.d(0.0f);
                l46Var.p0(objR2);
            }
            jx jxVar3 = (jx) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new er1();
                l46Var.p0(objR3);
            }
            final er1 er1Var = (er1) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = new qz9(1.0f);
                l46Var.p0(objR4);
            }
            n69 n69Var2 = (n69) objR4;
            final e89 e89VarI = q1c.i(nu1Var.e, l46Var);
            tt1 tt1Var2 = (tt1) l46Var.k(vt1.a);
            Object objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = qk2.d(0.0f);
                l46Var.p0(objR5);
            }
            jx jxVar4 = (jx) objR5;
            Object objR6 = l46Var.R();
            if (objR6 == obj) {
                objR6 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR6);
            }
            e89 e89Var = (e89) objR6;
            Boolean bool = (Boolean) tt1Var2.a.getValue();
            bool.getClass();
            boolean zG = l46Var.g(tt1Var2) | l46Var.i(jxVar4) | l46Var.i(jxVar3);
            Object objR7 = l46Var.R();
            if (zG || objR7 == obj) {
                jxVar = jxVar3;
                jxVar2 = jxVar4;
                n69Var = n69Var2;
                objR7 = new du1(tt1Var2, jxVar2, e89Var, jxVar, n69Var, null);
                tt1Var = tt1Var2;
                l46Var.p0(objR7);
            } else {
                jxVar = jxVar3;
                tt1Var = tt1Var2;
                jxVar2 = jxVar4;
                n69Var = n69Var2;
            }
            af1.o((l26) objR7, l46Var, bool);
            String strA = tt1Var.a();
            boolean zG2 = l46Var.g(tt1Var);
            Object objR8 = l46Var.R();
            if (zG2 || objR8 == obj) {
                objR8 = new eu1(tt1Var, null);
                l46Var.p0(objR8);
            }
            af1.o((l26) objR8, l46Var, strA);
            final e89 e89VarJ = z8c.j(((Boolean) e89Var.getValue()).booleanValue(), l46Var, 384, 2);
            final h0e h0eVarB = vx.b(((Boolean) e89Var.getValue()).booleanValue() ? 1.0f : 0.0f, b21.T(240, 0, null, 6), "cardZoomHighlight", null, l46Var, 3120, 20);
            final boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            final jx jxVar5 = jxVar2;
            final jx jxVar6 = jxVar;
            final n69 n69Var3 = n69Var;
            nk8.d(b.c, null, af1.b0(-1736011789, new n26() { // from class: yt1
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r8v31 */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 jx
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // defpackage.n26
                public final java.lang.Object m(java.lang.Object r52, java.lang.Object r53, java.lang.Object r54) {
                    /*
                        Method dump skipped, instruction units count: 1590
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.yt1.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, l46Var), l46Var, 3078, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(nu1Var, x16Var, i2, 14);
        }
    }

    public static final void b(final tt1 tt1Var, l46 l46Var, final int i2) {
        ojb ojbVarV;
        l26 l26Var;
        tt1Var.getClass();
        l46Var.h0(521652997);
        final int i3 = 0;
        final int i4 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            nu1 nu1Var = (nu1) tt1Var.b.getValue();
            if (nu1Var == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    l26Var = new l26(tt1Var, i2, i4) { // from class: xt1
                        public final /* synthetic */ int a;
                        public final /* synthetic */ tt1 b;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i5 = this.a;
                            wef wefVar = wef.a;
                            tt1 tt1Var2 = this.b;
                            l46 l46Var2 = (l46) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    vpf.b(tt1Var2, l46Var2, k99.P(7));
                                    break;
                                default:
                                    vpf.b(tt1Var2, l46Var2, k99.P(7));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
            } else {
                j09 j09VarW = fdc.w(b.c, 50.0f);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarW);
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
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new hl(0, tt1Var, tt1.class, "dismiss", "dismiss()V", 0, 11);
                    l46Var.p0(objR);
                }
                rxg.a(true, (x16) ((ym7) objR), l46Var, 6, 0);
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new hl(0, tt1Var, tt1.class, "dismiss", "dismiss()V", 0, 12);
                    l46Var.p0(objR2);
                }
                a(nu1Var, (x16) ((ym7) objR2), l46Var, 0);
                l46Var.r(true);
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            l26Var = new l26(tt1Var, i2, i3) { // from class: xt1
                public final /* synthetic */ int a;
                public final /* synthetic */ tt1 b;

                {
                    this.a = i3;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i5 = this.a;
                    wef wefVar = wef.a;
                    tt1 tt1Var2 = this.b;
                    l46 l46Var2 = (l46) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            vpf.b(tt1Var2, l46Var2, k99.P(7));
                            break;
                        default:
                            vpf.b(tt1Var2, l46Var2, k99.P(7));
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void c(final j09 j09Var, final int i2, final int i3, final long j2, final long j3, l46 l46Var, final int i4) {
        l46Var.h0(-1847178063);
        int i5 = i4 | (l46Var.e(i2) ? 32 : 16) | (l46Var.e(i3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.f(j2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.f(j3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i6 = 0;
        if (l46Var.W(i5 & 1, (i5 & 9363) != 9362)) {
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(i6)), ndb.z, l46Var, 54);
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
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var.f0(-19560161);
            int i7 = 0;
            while (i7 < i3) {
                s21.a(tm7.o(oa7.E(b.l(g09.a, 6.0f), a7c.a), i7 == i2 ? j2 : j3, g21.f), l46Var, 0);
                i7++;
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(i2, i3, j2, j3, i4) { // from class: mi4
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(7);
                    vpf.c(this.a, this.b, this.c, this.d, this.e, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(v86 v86Var, j09 j09Var, dd2 dd2Var, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        lx0 lx0Var = ndb.b;
        l46Var2.h0(-1787544910);
        int i3 = i2 | (l46Var2.g(v86Var) ? 4 : 2);
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            d31 d31Var = d31.a;
            ov7 ov7Var = LayoutNode.h1;
            if (v86Var != null) {
                l46Var2.f0(549281062);
                h0e h0eVarA = qkd.a(g21.S(l46Var2) ? v86Var.a : v86Var.b, b21.T(300, 0, null, 6), "giftCardPageBackground", l46Var2, 432, 8);
                l46Var2 = l46Var2;
                long jM = M(v86Var, l46Var2);
                boolean zF = l46Var2.f(((y72) h0eVarA.getValue()).a) | l46Var2.f(jM);
                Object objR = l46Var2.R();
                if (zF || objR == sf2.a) {
                    Float fValueOf = Float.valueOf(0.0f);
                    y72 y72Var = (y72) h0eVarA.getValue();
                    long j2 = y72Var.a;
                    objR = gec.O(new iy9[]{new iy9(fValueOf, y72Var), new iy9(Float.valueOf(0.25f), new y72(jM)), new iy9(Float.valueOf(1.0f), new y72(jM))}, 0.0f, 0.0f, 14);
                    l46Var2.p0(objR);
                }
                j09 j09VarN = tm7.n(j09Var, (b41) objR, null, 6);
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarN);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, xn8VarC);
                dec.l(he2Var3, l46Var2, u8aVarM);
                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ);
                dd2Var.m(d31Var, l46Var2, 54);
                l46Var2.r(true);
                l46Var2.r(false);
            } else {
                pr4 pr4Var = l8b.a;
                if (k8b.f((e8b) l46Var2.k(pr4Var))) {
                    l46Var2.f0(550054202);
                    j09 j09VarO = tm7.o(j09Var, ((e8b) l46Var2.k(pr4Var)).e, g21.f);
                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var4, l46Var2, xn8VarC2);
                    dec.l(he2Var3, l46Var2, u8aVarM2);
                    dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                    dec.k(l46Var2);
                    dec.l(he2Var, l46Var2, j09VarJ2);
                    dd2Var.m(d31Var, l46Var2, 54);
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(550144784);
                    rs0.f(j09Var, false, dd2Var, l46Var2, 390, 2);
                    l46Var2.r(false);
                }
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, v86Var, j09Var, dd2Var, 7);
        }
    }

    public static ks e(int i2, int i3, int i4) {
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace colorSpaceF;
        ColorSpace colorSpaceJ;
        x3c x3cVar = s82.e;
        abg.a0(i4);
        Bitmap.Config configA0 = abg.a0(i4);
        if (pa7.t(x3cVar, x3cVar)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (pa7.t(x3cVar, s82.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (pa7.t(x3cVar, s82.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (pa7.t(x3cVar, s82.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (pa7.t(x3cVar, s82.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (pa7.t(x3cVar, s82.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (pa7.t(x3cVar, s82.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (pa7.t(x3cVar, s82.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (pa7.t(x3cVar, s82.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (pa7.t(x3cVar, s82.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (pa7.t(x3cVar, s82.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (pa7.t(x3cVar, s82.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (pa7.t(x3cVar, s82.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (pa7.t(x3cVar, s82.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (pa7.t(x3cVar, s82.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!pa7.t(x3cVar, s82.n)) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 34 && (colorSpaceJ = hgc.J(x3cVar)) != null) {
                    rgb2 = colorSpaceJ;
                } else if (i5 >= 36 && (colorSpaceF = r6.f(x3cVar)) != null) {
                    rgb2 = colorSpaceF;
                } else if (x3cVar != null) {
                    String str = x3cVar.a;
                    float[] fArrA = x3cVar.d.a();
                    m2f m2fVar = x3cVar.g;
                    ColorSpace.Rgb.TransferParameters transferParameters = m2fVar != null ? new ColorSpace.Rgb.TransferParameters(m2fVar.b, m2fVar.c, m2fVar.d, m2fVar.e, m2fVar.f, m2fVar.g, m2fVar.a) : null;
                    float[] fArr = x3cVar.i;
                    final int i6 = 0;
                    if (transferParameters != null) {
                        ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, x3cVar.h, fArrA, transferParameters);
                        if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                            rgb2 = rgb3;
                        } else {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = x3cVar.h;
                        final w3c w3cVar = x3cVar.l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: q82
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i7 = i6;
                                a26 a26Var = w3cVar;
                                switch (i7) {
                                    case 0:
                                        break;
                                }
                                return ((Number) a26Var.d(Double.valueOf(d2))).doubleValue();
                            }
                        };
                        final v3c v3cVar = x3cVar.o;
                        final int i7 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: q82
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i8 = i7;
                                a26 a26Var = v3cVar;
                                switch (i8) {
                                    case 0:
                                        break;
                                }
                                return ((Number) a26Var.d(Double.valueOf(d2))).doubleValue();
                            }
                        }, x3cVar.e, x3cVar.f);
                    }
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new ks(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configA0, true, rgb2));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb2 = rgb;
        return new ks(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, configA0, true, rgb2));
    }

    public static final void f(int i2, int i3, l46 l46Var, j09 j09Var, List list) {
        list.getClass();
        l46Var.h0(-882086200);
        if ((i3 & 1) != 0) {
            j09Var = g09.a;
        }
        mmb mmbVar = new mmb();
        l46Var.g0(-492369756);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (objR == obj) {
            objR = q1c.f(pu4.a);
            l46Var.p0(objR);
        }
        l46Var.r(false);
        e89 e89Var = (e89) objR;
        l46Var.g0(-492369756);
        Object objR2 = l46Var.R();
        if (objR2 == obj) {
            objR2 = q1c.f(0L);
            l46Var.p0(objR2);
        }
        l46Var.r(false);
        e89 e89Var2 = (e89) objR2;
        l46Var.g0(-492369756);
        Object objR3 = l46Var.R();
        if (objR3 == obj) {
            objR3 = q1c.f(new ju2(0.0f, 0.0f));
            l46Var.p0(objR3);
        }
        l46Var.r(false);
        e89 e89Var3 = (e89) objR3;
        l46Var.g0(-492369756);
        Object objR4 = l46Var.R();
        if (objR4 == obj) {
            objR4 = new bx6();
            l46Var.p0(objR4);
        }
        l46Var.r(false);
        bx6 bx6Var = (bx6) objR4;
        af1.o(new rr7(mmbVar, list, bx6Var, e89Var2, e89Var, e89Var3, null), l46Var, wef.a);
        l46Var.g0(1157296644);
        boolean zG = l46Var.g(e89Var3);
        Object objR5 = l46Var.R();
        if (zG || objR5 == obj) {
            objR5 = new sr7(e89Var3);
            l46Var.p0(objR5);
        }
        l46Var.r(false);
        nk8.e(0, new tr7(e89Var, bx6Var), l46Var, nk8.w(j09Var, (a26) objR5));
        ojb ojbVarV = l46Var.v();
        if (ojbVarV == null) {
            return;
        }
        ojbVarV.d = new ur7(j09Var, list, i2, i3);
    }

    public static final void g(j09 j09Var, String str, boolean z, x16 x16Var, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        long jM;
        long j2;
        j09 j09VarO;
        boolean z2;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(-1390199602);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var2.i(dd2Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var2.W(i3 & 1, (i3 & 9363) != 9362)) {
            y6c y6cVarB = a7c.b(k8b.f((e8b) l46Var2.k(l8b.a)) ? 8.0f : 20.0f);
            long jA = l8b.a(l46Var2);
            if (z) {
                l46Var2.f0(-246975047);
                l46Var2.r(false);
                jM = jA;
                j2 = jM;
            } else {
                l46Var2.f0(-246974268);
                jM = l8b.m(l46Var2);
                l46Var2.r(false);
                j2 = jA;
            }
            long j3 = j2;
            h0e h0eVarA = qkd.a(jM, null, null, l46Var2, 0, 14);
            h0e h0eVarA2 = vx.a(z ? 1.0f : 0.5f, null, null, l46Var, 0, 14);
            b68 b68VarO = gec.O(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(l8b.h(l46Var))), new iy9(Float.valueOf(1.0f), new y72(abg.r(y72.b(j3, 0.1f), l8b.h(l46Var))))}, 0.0f, 0.0f, 14);
            l46Var2 = l46Var;
            h0e h0eVarB = vx.b(z ? 0.25f : 0.0f, null, null, null, l46Var2, 0, 30);
            Object objR = l46Var2.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var2);
            }
            t69 t69Var = (t69) objR;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
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
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(rrb.h(d31Var.b(g09Var), y6cVarB, new n4d(12.0f, y72.b(j3, ((Number) h0eVarB.getValue()).floatValue()), 0.0f, 0L, 60)), y6cVarB);
            if (z) {
                l46Var2.f0(-417203894);
                l46Var2.r(false);
                j09VarO = tm7.n(g09Var, b68VarO, y6cVarB, 4);
            } else {
                l46Var2.f0(-417202005);
                j09VarO = tm7.o(g09Var, l8b.h(l46Var2), y6cVarB);
                l46Var2.r(false);
            }
            int i4 = i3;
            s21.a(o17.a(db6.w(j09VarE.D(j09VarO), ((yi4) h0eVarA2.getValue()).a, ((y72) h0eVarA.getValue()).a, y6cVarB), t69Var, d5c.a(0.0f, 7, 0L, false)), l46Var2, 0);
            j09 j09VarB = androidx.compose.foundation.b.b(b.c, t69Var, null, false, null, x16Var, 28);
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarB);
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
            if (str != null) {
                l46Var2.f0(1076099300);
                z2 = true;
                h(((i4 >> 3) & 14) | 48, l46Var2, tm7.N(0.0f, -7.0f, b.f(14.0f, 0.0f, g09Var, 2), 1), str);
                l46Var2.r(false);
            } else {
                z2 = true;
                l46Var2.f0(1076233840);
                l46Var2.r(false);
            }
            j09 j09VarD0 = ynb.d0(0.0f, str == null ? 16.0f : 2.0f, 0.0f, 16.0f, 5, ynb.b0(4.0f, 0.0f, g09Var, 2));
            int i5 = ((i4 >> 3) & 7168) | 432;
            c92 c92VarA2 = a92.a(new uc0(8.0f, z2, new qc0(0)), jx0Var, l46Var2, 54);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            ks0.q(((i5 >> 6) & 112) | 6, dd2Var, e92.a, l46Var2, z2);
            l46Var2.r(z2);
            l46Var2.r(z2);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(j09Var, str, z, x16Var, dd2Var, i2);
        }
    }

    public static final void h(int i2, l46 l46Var, j09 j09Var, String str) {
        int i3;
        mue mueVarJ;
        long j2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(735198346);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var2.g(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
            y6c y6cVarB = a7c.b(zF ? 2.0f : 12.0f);
            if (zF) {
                l46Var2.f0(-2143985524);
                mue mueVar = pue.a;
                mueVarJ = pue.h(l46Var2);
            } else {
                l46Var2.f0(-2143984916);
                mue mueVar2 = pue.a;
                mueVarJ = pue.j(l46Var2);
            }
            l46Var2.r(false);
            mue mueVar3 = mueVarJ;
            if (zF) {
                l46Var2.f0(-2143981888);
                j2 = ((e8b) l46Var2.k(pr4Var)).j;
            } else {
                l46Var2.f0(-2143980770);
                j2 = ((e8b) l46Var2.k(pr4Var)).i;
            }
            l46Var2.r(false);
            j09 j09VarA0 = ynb.a0(tm7.o(j09Var, j2, y6cVarB), 6.0f, zF ? 1.5f : 1.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
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
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).v, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(mueVar3, 0L, 0L, null, null, 0L, null, 0, mueVar3.a.b, new iga(), new y58(v58.b, 17, 0), 15073279), l46Var2, i3 & 14, 0, 130042);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(str, j09Var, i2, 4, (byte) 0);
        }
    }

    public static final void i(j09 j09Var, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-308517386);
        int i4 = i2 | (l46Var2.g(j09Var) ? 4 : 2);
        int i5 = 0;
        if (l46Var2.W(i4 & 1, (i4 & 3) != 2)) {
            j09 j09VarD = b.d(j09Var, 120.0f);
            y72 y72Var = new y72(y72.j);
            pr4 pr4Var = l8b.a;
            j09 j09VarN = tm7.n(j09VarD, gec.N(0.0f, 14, t72.I(y72Var, new y72(((e8b) l46Var2.k(pr4Var)).b))), null, 6);
            xn8 xn8VarC = s21.c(ndb.w, false);
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
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, mh3.N(g09Var));
            c92 c92VarA = a92.a(new uc0(2.0f, true, new qc0(i5)), ndb.Z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
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
            String strQ = afc.q(R.string.explore_fullscreen_swipe_up_hint, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).s, 0L, null, cr5.b(), 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var2), l46Var, 0, 0, 130938);
            l46Var2 = l46Var;
            gx6 gx6VarB = ynb.l;
            if (gx6VarB == null) {
                fx6 fx6Var = new fx6("Outlined.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i6 = msf.a;
                dtd dtdVar = new dtd(y72.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new p1a(7.41f, 15.41f));
                arrayList.add(new o1a(12.0f, 10.83f));
                arrayList.add(new w1a(4.59f, 4.58f));
                arrayList.add(new o1a(18.0f, 14.0f));
                arrayList.add(new w1a(-6.0f, -6.0f));
                arrayList.add(new w1a(-6.0f, 6.0f));
                arrayList.add(new w1a(1.41f, 1.41f));
                arrayList.add(l1a.c);
                fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                gx6VarB = fx6Var.b();
                ynb.l = gx6VarB;
            }
            gu6.a(gx6VarB, null, b.l(g09Var, 16.0f), ((e8b) l46Var2.k(pr4Var)).s, l46Var2, 432, 0);
            i3 = 1;
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            i3 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i2, i3, j09Var);
        }
    }

    public static final List j(Class cls) {
        return fyc.A(new zi5(fyc.u(zo1.N0, cls), zo1.O0, jyc.a));
    }

    public static int k(yl9 yl9Var, boolean z) {
        int i2 = yl9Var.b;
        int i3 = yl9Var.c;
        int i4 = z ? i3 : i2;
        if (!z) {
            i2 = i3;
        }
        byte[][] bArr = (byte[][]) yl9Var.d;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte b2 = -1;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte b3 = z ? bArr[i6][i8] : bArr[i8][i6];
                if (b3 == b2) {
                    i7++;
                } else {
                    if (i7 >= 5) {
                        i5 += i7 - 2;
                    }
                    i7 = 1;
                    b2 = b3;
                }
            }
            if (i7 >= 5) {
                i5 = (i7 - 2) + i5;
            }
        }
        return i5;
    }

    public static final boolean l(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final sh0 m(boolean z) {
        sh0 sh0Var = new sh0();
        sh0Var.a = z ? 1 : 0;
        return sh0Var;
    }

    public static final wh0 n(int i2) {
        wh0 wh0Var = new wh0();
        wh0Var.a = i2;
        return wh0Var;
    }

    public static final zh0 o(Object obj) {
        zh0 zh0Var = new zh0();
        zh0Var.a = obj;
        return zh0Var;
    }

    public static String p(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (bArr[i2] & 240) >>> 4;
            char[] cArr = g;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static final void q(a26 a26Var, Object obj, pv2 pv2Var) {
        ebf ebfVarR = r(a26Var, obj, null);
        if (ebfVarR != null) {
            tq.C(pv2Var, ebfVarR);
        }
    }

    public static final ebf r(a26 a26Var, Object obj, ebf ebfVar) {
        try {
            a26Var.d(obj);
            return ebfVar;
        } catch (Throwable th) {
            if (ebfVar == null || ebfVar.getCause() == th) {
                return new ebf(ks0.j(obj, "Exception in undelivered element handler for "), th);
            }
            bzd.m(ebfVar, th);
            return ebfVar;
        }
    }

    public static final void s(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder sbP = ub3.p("size=", " offset=", j2);
            sbP.append(j3);
            sbP.append(" byteCount=");
            sbP.append(j4);
            throw new ArrayIndexOutOfBoundsException(sbP.toString());
        }
    }

    public static final dx5 t(dx5 dx5Var, String str) {
        return dx5Var.a(t99.e(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] u(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static ljd v(Type type, um7 um7Var, List list, boolean z) {
        return new ljd(um7Var, list, z, pu4.a, null, false, false, false, null, new xt2(3, type));
    }

    public static final ljd w(ljd ljdVar, Type type) {
        um7 um7Var = ljdVar.b;
        em7 em7Var = um7Var instanceof em7 ? (em7) um7Var : null;
        if (em7Var != null) {
            String str = qf7.a;
            String strG = em7Var.g();
            dx5 dx5VarI = qf7.i(strG != null ? new ex5(strG) : null);
            if (dx5VarI != null) {
                return new ljd(ljdVar.b, ljdVar.c, ljdVar.d, pu4.a, null, false, false, false, urg.D(dx5VarI, em7Var), new xt2(3, type));
            }
        }
        return null;
    }

    public static final oo5 x(oo5 oo5Var) {
        oo5 oo5VarG = ((bo5) vd0.t0(oo5Var).getFocusOwner()).g();
        if (oo5VarG == null || !oo5VarG.Y) {
            return null;
        }
        return oo5VarG;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    public static final tmb y(Annotation[] annotationArr, dx5 dx5Var) {
        annotationArr.getClass();
        dx5Var.getClass();
        for (Annotation annotation : annotationArr) {
            if (pa7.t(smb.a(af1.R(af1.Q(annotation))).a(), dx5Var)) {
                if (annotation != null) {
                    return new tmb(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new tmb(annotation);
        }
        return null;
    }

    public static final hkb z(oo5 oo5Var) {
        yf9 yf9Var;
        if (oo5Var.Y && (yf9Var = oo5Var.v) != null) {
            bv7 bv7VarS = vd0.S(yf9Var);
            if (!bv7VarS.h()) {
                bv7VarS = null;
            }
            if (bv7VarS != null) {
                return oo5Var.o1(bv7VarS);
            }
        }
        return hkb.e;
    }
}
