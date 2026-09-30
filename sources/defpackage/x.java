package defpackage;

import android.os.CancellationSignal;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements a26 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0357  */
    /* JADX WARN: Code duplicated, block: B:182:0x041f  */
    /* JADX WARN: Code duplicated, block: B:186:0x042e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0510  */
    /* JADX WARN: Code duplicated, block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        k7f k7fVarI0;
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        dx5 dx5VarC;
        Object next;
        kw9 kw9Var;
        lp0 lp0Var;
        kw9 kw9Var2;
        Object next2;
        int i = this.a;
        wef wefVar = wef.a;
        ca7 ca7Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = 0;
                cob cobVar = (cob) obj;
                cobVar.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                a90 a90Var = new a90((hbc) obj2, map, map2);
                Class cls = cobVar.a;
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i3 = 0;
                while (i3 < length) {
                    Method method = declaredMethods[i3];
                    t99 t99VarE = t99.e(method.getName());
                    StringBuilder sb = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    int length2 = parameterTypes.length;
                    for (int i4 = i2; i4 < length2; i4++) {
                        Class<?> cls2 = parameterTypes[i4];
                        cls2.getClass();
                        sb.append(smb.b(cls2));
                    }
                    sb.append(")");
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    sb.append(smb.b(returnType));
                    String string = sb.toString();
                    String strB = t99VarE.b();
                    strB.getClass();
                    szc szcVar = new szc(a90Var, new fr8(strB.concat(string)));
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    declaredAnnotations.getClass();
                    int length3 = declaredAnnotations.length;
                    for (int i5 = i2; i5 < length3; i5++) {
                        Annotation annotation = declaredAnnotations[i5];
                        annotation.getClass();
                        t72.S(szcVar, annotation);
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    parameterAnnotations.getClass();
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length4 = annotationArr.length;
                    int i6 = i2;
                    while (i6 < length4) {
                        Annotation[] annotationArr2 = annotationArr[i6];
                        annotationArr2.getClass();
                        int length5 = annotationArr2.length;
                        int i7 = i2;
                        while (i7 < length5) {
                            Annotation annotation2 = annotationArr2[i7];
                            Class cls3 = cls;
                            Class clsR = af1.R(af1.Q(annotation2));
                            Method[] methodArr = declaredMethods;
                            int i8 = length;
                            hc2 hc2VarV = szcVar.V(i6, smb.a(clsR), new rmb(annotation2));
                            if (hc2VarV != null) {
                                t72.T(hc2VarV, annotation2, clsR);
                            }
                            i7++;
                            cls = cls3;
                            declaredMethods = methodArr;
                            length = i8;
                        }
                        i6++;
                        i2 = 0;
                    }
                    szcVar.d();
                    i3++;
                    i2 = 0;
                }
                Class cls4 = cls;
                Constructor<?>[] declaredConstructors = cls4.getDeclaredConstructors();
                declaredConstructors.getClass();
                int length6 = declaredConstructors.length;
                int i9 = 0;
                while (i9 < length6) {
                    Constructor<?> constructor = declaredConstructors[i9];
                    t99 t99Var = sud.e;
                    constructor.getClass();
                    StringBuilder sb2 = new StringBuilder("(");
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    parameterTypes2.getClass();
                    for (Class<?> cls5 : parameterTypes2) {
                        cls5.getClass();
                        sb2.append(smb.b(cls5));
                    }
                    sb2.append(")V");
                    String string2 = sb2.toString();
                    t99Var.getClass();
                    String strB2 = t99Var.b();
                    strB2.getClass();
                    szc szcVar2 = new szc(a90Var, new fr8(strB2.concat(string2)));
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    declaredAnnotations2.getClass();
                    for (Annotation annotation3 : declaredAnnotations2) {
                        annotation3.getClass();
                        t72.S(szcVar2, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    parameterAnnotations2.getClass();
                    if (parameterAnnotations2.length != 0) {
                        int length7 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length8 = parameterAnnotations2.length;
                        for (int i10 = 0; i10 < length8; i10++) {
                            Annotation[] annotationArr3 = parameterAnnotations2[i10];
                            annotationArr3.getClass();
                            int length9 = annotationArr3.length;
                            int i11 = 0;
                            while (i11 < length9) {
                                Constructor<?>[] constructorArr = declaredConstructors;
                                Annotation annotation4 = annotationArr3[i11];
                                int i12 = length6;
                                Class clsR2 = af1.R(af1.Q(annotation4));
                                int i13 = i9;
                                int i14 = length7;
                                Annotation[][] annotationArr4 = parameterAnnotations2;
                                hc2 hc2VarV2 = szcVar2.V(i10 + length7, smb.a(clsR2), new rmb(annotation4));
                                if (hc2VarV2 != null) {
                                    t72.T(hc2VarV2, annotation4, clsR2);
                                }
                                i11++;
                                declaredConstructors = constructorArr;
                                i9 = i13;
                                length6 = i12;
                                length7 = i14;
                                parameterAnnotations2 = annotationArr4;
                            }
                        }
                    }
                    Constructor<?>[] constructorArr2 = declaredConstructors;
                    int i15 = length6;
                    int i16 = i9;
                    szcVar2.d();
                    i9 = i16 + 1;
                    declaredConstructors = constructorArr2;
                    length6 = i15;
                }
                Field[] declaredFields = cls4.getDeclaredFields();
                declaredFields.getClass();
                int length10 = declaredFields.length;
                int i17 = 0;
                while (i17 < length10) {
                    Field field = declaredFields[i17];
                    t99 t99VarE2 = t99.e(field.getName());
                    Class<?> type = field.getType();
                    type.getClass();
                    String strB3 = smb.b(type);
                    String strB4 = t99VarE2.b();
                    strB4.getClass();
                    fr8 fr8Var = new fr8(strB4 + '#' + strB3);
                    ArrayList arrayList = new ArrayList();
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    declaredAnnotations3.getClass();
                    int length11 = declaredAnnotations3.length;
                    int i18 = 0;
                    while (i18 < length11) {
                        Annotation annotation5 = declaredAnnotations3[i18];
                        annotation5.getClass();
                        Class clsR3 = af1.R(af1.Q(annotation5));
                        Field[] fieldArr = declaredFields;
                        hc2 hc2VarI0 = ((hbc) a90Var.b).i0(smb.a(clsR3), new rmb(annotation5), arrayList);
                        if (hc2VarI0 != null) {
                            t72.T(hc2VarI0, annotation5, clsR3);
                        }
                        i18++;
                        declaredFields = fieldArr;
                    }
                    Field[] fieldArr2 = declaredFields;
                    if (!arrayList.isEmpty()) {
                        ((HashMap) a90Var.c).put(fr8Var, arrayList);
                    }
                    i17++;
                    declaredFields = fieldArr2;
                }
                return new i10(map, map2, map3);
            case 1:
                ((zt7) obj).getClass();
                return (tjd) ((h0) obj2).b.b.invoke();
            case 2:
                dk7 dk7Var = (dk7) obj2;
                dx5 dx5Var = (dx5) obj;
                dx5Var.getClass();
                k51 k51VarC = dk7Var.c(dx5Var);
                if (k51VarC == null) {
                    return null;
                }
                tz3 tz3Var = dk7Var.c;
                if (tz3Var != null) {
                    k51VarC.E0(tz3Var);
                    return k51VarC;
                }
                pa7.g0("components");
                throw null;
            case 3:
                xs6 xs6Var = (xs6) obj2;
                qfc qfcVar = qfc.d;
                f5 f5Var = (f5) obj;
                f5Var.getClass();
                xt7 xt7Var = f5Var.a;
                if ((xs6Var.b && xt7Var != null && db6.q0(xt7Var)) || xt7Var == null || (k7fVarI0 = qfcVar.i0(xt7Var)) == null) {
                    return null;
                }
                List listR = db6.R(k7fVarI0);
                List listK = db6.K(xt7Var);
                Iterator it = listR.iterator();
                Iterator it2 = listK.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(t72.u(listR, 10), t72.u(listK, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    e8f e8fVar = (e8f) it.next();
                    jgf jgfVarT = db6.T(qfcVar, (d7f) it2.next());
                    xf7 xf7Var = f5Var.b;
                    arrayList2.add(jgfVarT == null ? new f5(null, xf7Var, e8fVar) : new f5(jgfVarT, b10.b(((mf7) ((szc) xs6Var.d).b).j, xf7Var, jgfVarT.getAnnotations()), e8fVar));
                }
                return arrayList2;
            case 4:
                s04 s04Var = (s04) obj2;
                jgf jgfVar = (jgf) obj;
                jgfVar.getClass();
                if (i7h.x(jgfVar)) {
                    z = false;
                } else {
                    y22 y22VarM = jgfVar.c0().m();
                    if (!(y22VarM instanceof c8f) || pa7.t(((c8f) y22VarM).k(), s04Var)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                m5 m5Var = (m5) obj2;
                l5 l5Var = (l5) obj;
                l5Var.getClass();
                m8c m8cVarC = m5Var.c();
                Collection collection = l5Var.a;
                m8cVarC.getClass();
                collection.getClass();
                if (collection.isEmpty()) {
                    tt7 tt7VarB = m5Var.b();
                    List listH = tt7VarB != null ? t72.H(tt7VarB) : null;
                    if (listH == null) {
                        listH = pu4.a;
                    }
                    collection = listH;
                }
                List listJ1 = collection instanceof List ? (List) collection : null;
                if (listJ1 == null) {
                    listJ1 = s72.j1(collection);
                }
                List listH2 = m5Var.h(listJ1);
                listH2.getClass();
                l5Var.b = listH2;
                return wefVar;
            case 6:
                ((bea) obj).k((cea) obj2, 0, 0, 0.0f);
                return wefVar;
            case 7:
                bea beaVar = (bea) obj;
                ArrayList arrayList3 = (ArrayList) obj2;
                int size = arrayList3.size() - 1;
                if (size >= 0) {
                    int i19 = 0;
                    while (true) {
                        beaVar.k((cea) arrayList3.get(i19), 0, 0, 0.0f);
                        if (i19 != size) {
                            i19++;
                        }
                    }
                }
                return wefVar;
            case 8:
                ((rl1) obj2).cancel();
                return wefVar;
            case 9:
                ((ea1) obj).getClass();
                return Boolean.valueOf(qud.i.containsKey(xo1.r((hjd) obj2)));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((cib) obj2).cancel();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                uy5 uy5Var = (uy5) obj;
                uy5Var.getClass();
                xn1 xn1Var = (xn1) obj2;
                es esVarK = uy5Var.k();
                pn1 pn1Var = new pn1(esVarK, xn1Var);
                ym1 ym1Var = xn1Var.n;
                esVarK.a.getFrameNumber();
                return Boolean.valueOf(io2.a(new co1(ym1Var, pn1Var), true));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                onb onbVar = (onb) obj;
                onbVar.getClass();
                if (((Boolean) ((c22) obj2).b.d(onbVar)).booleanValue()) {
                    Class<?> declaringClass = ((Method) onbVar.b()).getDeclaringClass();
                    declaringClass.getClass();
                    if (declaringClass.isInterface()) {
                        String strB5 = onbVar.c().b();
                        int iHashCode = strB5.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB5.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) onbVar.g()).isEmpty();
                                }
                            } else if (strB5.equals("equals")) {
                                unb unbVar = (unb) s72.Z0(onbVar.g());
                                snb snbVar = unbVar != null ? unbVar.a : null;
                                hnb hnbVar = snbVar instanceof hnb ? (hnb) snbVar : null;
                                if (hnbVar != null) {
                                    xd7 xd7Var = hnbVar.b;
                                    if ((xd7Var instanceof enb) && (dx5VarC = ((enb) xd7Var).c()) != null && pa7.t(dx5VarC.a.a, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB5.equals("toString")) {
                            zIsEmpty = ((ArrayList) onbVar.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        z2 = zIsEmpty ? false : true;
                    }
                }
                return Boolean.valueOf(z2);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                h22 h22Var = (h22) obj2;
                g22 g22Var = (g22) obj;
                g22Var.getClass();
                j22 j22Var = g22Var.a;
                tz3 tz3Var2 = h22Var.a;
                Iterator it3 = tz3Var2.k.iterator();
                while (it3.hasNext()) {
                    u09 u09VarA = ((e22) it3.next()).a(j22Var);
                    if (u09VarA != null) {
                        return u09VarA;
                    }
                }
                if (h22.c.contains(j22Var)) {
                    return null;
                }
                a22 a22VarR = g22Var.b;
                if (a22VarR == null && (a22VarR = tz3Var2.d.r(j22Var)) == null) {
                    return null;
                }
                u99 u99Var = a22VarR.a;
                nya nyaVar = a22VarR.b;
                ay0 ay0Var = a22VarR.c;
                ntd ntdVar = a22VarR.d;
                j22 j22VarE = j22Var.e();
                if (j22VarE != null) {
                    u09 u09VarA2 = h22Var.a(j22VarE, null);
                    d04 d04Var = u09VarA2 instanceof d04 ? (d04) u09VarA2 : null;
                    if (d04Var == null) {
                        return null;
                    }
                    if (!d04Var.u0().m().contains(j22Var.f())) {
                        return null;
                    }
                    lp0Var = d04Var.z;
                } else {
                    nw9 nw9Var = tz3Var2.f;
                    dx5 dx5Var2 = j22Var.a;
                    nw9Var.getClass();
                    dx5Var2.getClass();
                    ArrayList arrayList4 = new ArrayList();
                    nw9Var.b(dx5Var2, arrayList4);
                    Iterator it4 = arrayList4.iterator();
                    do {
                        if (it4.hasNext()) {
                            next = it4.next();
                            kw9Var2 = (kw9) next;
                            if (kw9Var2 instanceof k51) {
                            }
                        } else {
                            next = null;
                        }
                        kw9Var = (kw9) next;
                        if (kw9Var == null) {
                            return null;
                        }
                        b0b b0bVarC0 = nyaVar.C0();
                        b0bVarC0.getClass();
                        bu3 bu3Var = new bu3(b0bVarC0);
                        otf otfVar = otf.b;
                        i0b i0bVarE0 = nyaVar.E0();
                        i0bVarE0.getClass();
                        otf otfVarN = p8c.n(i0bVarE0);
                        u99Var.getClass();
                        lp0Var = new lp0(tz3Var2, u99Var, kw9Var, bu3Var, otfVarN, ay0Var, null, null, pu4.a);
                    } while (!((o04) ((k51) kw9Var2).F()).m().contains(j22Var.f()));
                    kw9Var = (kw9) next;
                    if (kw9Var == null) {
                        return null;
                    }
                    b0b b0bVarC1 = nyaVar.C0();
                    b0bVarC1.getClass();
                    bu3 bu3Var2 = new bu3(b0bVarC1);
                    otf otfVar2 = otf.b;
                    i0b i0bVarE1 = nyaVar.E0();
                    i0bVarE1.getClass();
                    otf otfVarN2 = p8c.n(i0bVarE1);
                    u99Var.getClass();
                    lp0Var = new lp0(tz3Var2, u99Var, kw9Var, bu3Var2, otfVarN2, ay0Var, null, null, pu4.a);
                }
                return new d04(lp0Var, nyaVar, u99Var, ay0Var, ntdVar);
            case 14:
                w09 w09Var = (w09) obj;
                w09Var.getClass();
                return w09Var.f().r((jua) obj2);
            case 15:
                ((CancellationSignal) obj2).cancel();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ea1 ea1Var = (ea1) obj;
                if (ea1Var != null) {
                    ((nz3) obj2).s.i(ea1Var);
                    return wefVar;
                }
                qc0.j("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 17:
                byte b = false;
                ca7 ca7Var2 = (ca7) obj2;
                zt7 zt7Var = (zt7) obj;
                zt7Var.getClass();
                LinkedHashSet linkedHashSet = ca7Var2.b;
                ArrayList arrayList5 = new ArrayList(t72.u(linkedHashSet, 10));
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((tt7) it5.next()).j0(zt7Var));
                    b = true;
                }
                if (b != false) {
                    tt7 tt7Var = ca7Var2.a;
                    tt7 tt7VarM0 = tt7Var != null ? tt7Var.j0(zt7Var) : null;
                    arrayList5.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList5);
                    linkedHashSet2.hashCode();
                    ca7 ca7Var3 = new ca7(linkedHashSet2);
                    ca7Var3.a = tt7VarM0;
                    ca7Var = ca7Var3;
                }
                if (ca7Var != null) {
                    ca7Var2 = ca7Var;
                }
                return ca7Var2.a();
            case 18:
                bu7 bu7Var = (bu7) obj2;
                dx5 dx5Var3 = (dx5) obj;
                dx5Var3.getClass();
                dx5 dx5Var4 = jf7.a;
                uj9.R.getClass();
                fz3 fz3Var = tj9.b;
                fz3Var.getClass();
                csb csbVar = (csb) ((mz0) fz3Var.c).d(dx5Var3);
                if (csbVar != null) {
                    return csbVar;
                }
                fz3 fz3Var2 = jf7.c;
                fz3Var2.getClass();
                kf7 kf7Var = (kf7) ((mz0) fz3Var2.c).d(dx5Var3);
                if (kf7Var == null) {
                    return csb.IGNORE;
                }
                bu7 bu7Var2 = kf7Var.b;
                return (bu7Var2 == null || bu7Var2.d - bu7Var.d > 0) ? kf7Var.a : kf7Var.c;
            case 19:
                iy9 iy9Var = (iy9) obj;
                iy9Var.getClass();
                String str = (String) iy9Var.a();
                String str2 = (String) iy9Var.b();
                List listH3 = t72.H(e10.a(((bk7) obj2).a.e, tec.m("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN"));
                return listH3.isEmpty() ? hj6.c : new j10(0, listH3);
            case 20:
                return Boolean.valueOf(pa7.t((em7) obj, (em7) obj2));
            case 21:
                Object obj3 = ((Object[]) obj2)[((Number) obj).intValue()];
                return null;
            case 22:
                px7 px7Var = (px7) obj2;
                tmb tmbVar = (tmb) obj;
                tmbVar.getClass();
                t99 t99Var2 = sd7.a;
                return sd7.b(tmbVar, px7Var.a, px7Var.c);
            case 23:
                rx7 rx7Var = (rx7) obj2;
                ((zt7) obj).getClass();
                return new wx7(rx7Var.x, rx7Var, rx7Var.v, rx7Var.w != null, rx7Var.F0);
            case 24:
                dr8 dr8Var = (dr8) obj;
                dr8Var.getClass();
                return dr8Var.f((t99) obj2, lf9.e);
            case 25:
                r1f r1fVar = (r1f) obj2;
                tnb tnbVar = (tnb) obj;
                tnbVar.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) r1fVar.d;
                bm3 bm3Var = (bm3) r1fVar.c;
                Integer num = (Integer) linkedHashMap.get(tnbVar);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                szc szcVar3 = (szc) r1fVar.b;
                szcVar3.getClass();
                return new my7(if9.s(new szc((mf7) szcVar3.b, r1fVar, (lw7) szcVar3.d), bm3Var.getAnnotations()), tnbVar, r1fVar.a + iIntValue, bm3Var);
            case 26:
                x09 x09Var = (x09) obj2;
                dx5 dx5Var5 = (dx5) obj;
                dx5Var5.getClass();
                tw9 tw9Var = x09Var.g;
                ge8 ge8Var = x09Var.d;
                ((sw9) tw9Var).getClass();
                ge8Var.getClass();
                return new n18(x09Var, dx5Var5, ge8Var);
            case 27:
                dx5 dx5Var6 = (dx5) obj;
                dx5Var6.getClass();
                Map map4 = (Map) ((fz3) obj2).b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map4.entrySet()) {
                    dx5 dx5Var7 = (dx5) entry.getKey();
                    if (!dx5Var6.equals(dx5Var7)) {
                        dx5Var7.getClass();
                        if (pa7.t(dx5Var6.a.c() ? null : dx5Var6.b(), dx5Var7)) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    return null;
                }
                Iterator it6 = linkedHashMap2.entrySet().iterator();
                if (it6.hasNext()) {
                    next2 = it6.next();
                    if (it6.hasNext()) {
                        int length12 = xo1.O((dx5) ((Map.Entry) next2).getKey(), dx5Var6).a.a.length();
                        do {
                            Object next3 = it6.next();
                            int length13 = xo1.O((dx5) ((Map.Entry) next3).getKey(), dx5Var6).a.a.length();
                            if (length12 > length13) {
                                next2 = next3;
                                length12 = length13;
                            }
                        } while (it6.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry2 = (Map.Entry) next2;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 28:
                obj.getClass();
                ((dqd) obj2).add(obj);
                return wefVar;
            default:
                ((pl1) obj2).g(wefVar);
                return wefVar;
        }
    }
}
