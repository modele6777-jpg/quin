package defpackage;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class gm7 implements x16 {
    public final /* synthetic */ int a;
    public final nm7 b;

    public /* synthetic */ gm7(nm7 nm7Var, int i) {
        this.a = i;
        this.b = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02da  */
    /* JADX WARN: Code duplicated, block: B:132:0x030c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0334  */
    /* JADX WARN: Code duplicated, block: B:136:0x033e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0340  */
    /* JADX WARN: Code duplicated, block: B:148:0x0368  */
    /* JADX WARN: Code duplicated, block: B:155:0x037d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0392  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:173:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:274:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // defpackage.x16
    public final Object invoke() throws InvocationTargetException {
        u09 u09VarP;
        int i;
        fo7 fo7Var;
        xm7 xm7VarS;
        wnb wnbVarP;
        ux4 ux4VarH;
        Object obj;
        wnb wnbVar;
        wnb wnbVarP2;
        ym7 ym7Var;
        ?? r29;
        ?? r30;
        ?? r31;
        ?? r28;
        va2 va2Var;
        ?? arrayList;
        em7 em7VarQ;
        Class cls;
        int i2 = this.a;
        km7 km7Var = km7.b;
        int i3 = 1;
        int i4 = 0;
        nm7 nm7Var = this.b;
        switch (i2) {
            case 0:
                return new jm7(nm7Var);
            case 1:
                return nm7Var.V(nm7Var.T().S().F(), km7.a);
            case 2:
                return nm7Var.V(nm7Var.T().S().F(), km7Var);
            case 3:
                dr8 dr8VarC0 = nm7Var.T().c0();
                dr8VarC0.getClass();
                return nm7Var.V(dr8VarC0, km7Var);
            case 4:
                j22 j22VarR = nm7Var.R();
                Class cls2 = nm7Var.b;
                fob fobVar = ((jm7) nm7Var.c.getValue()).a;
                wn7 wn7Var = wm7.b[0];
                Object objInvoke = fobVar.invoke();
                objInvoke.getClass();
                k8c k8cVar = (k8c) objInvoke;
                tz3 tz3Var = k8cVar.a;
                w09 w09Var = tz3Var.b;
                if (j22VarR.c && cls2.isAnnotationPresent(Metadata.class)) {
                    h22 h22Var = tz3Var.t;
                    Set set = h22.c;
                    u09VarP = h22Var.a(j22VarR, null);
                } else {
                    u09VarP = od4.p(w09Var, j22VarR);
                }
                if (u09VarP != null) {
                    return u09VarP;
                }
                if (cls2.isSynthetic()) {
                    return nm7.Q(j22VarR, k8cVar);
                }
                cob cobVarG0 = hkg.g0(cls2);
                yr7 yr7Var = cobVarG0 != null ? cobVarG0.b.a : null;
                switch (yr7Var != null ? lm7.a[yr7Var.ordinal()] : -1) {
                    case -1:
                    case 6:
                        r82.h("Unresolved class: ", cls2, " (kind = ", yr7Var);
                        return null;
                    case 0:
                    default:
                        ap.c();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return nm7.Q(j22VarR, k8cVar);
                    case 5:
                        r82.h("Unknown class: ", cls2, " (kind = ", yr7Var);
                        return null;
                }
            case 5:
                va2 va2Var2 = ia5.a;
                tx4 tx4Var = tx4.I;
                sx4 sx4Var = sx4.I;
                HashMap map = new HashMap();
                boolean z = af1.R(nm7Var).getAnnotation(Metadata.class) != null;
                HashMap map2 = new HashMap();
                if (z) {
                    for (wnb wnbVar2 : ia5.b(nm7Var)) {
                        if (!ia5.d(nm7Var, wnbVar2)) {
                            map2.put(ia5.h(wnbVar2, tx4Var), wnbVar2);
                        }
                    }
                }
                int i5 = 0;
                int i6 = 0;
                for (yn7 yn7Var : nm7Var.e()) {
                    um7 um7VarB = yn7Var.B();
                    em7 em7Var = um7VarB instanceof em7 ? (em7) um7VarB : null;
                    if (em7Var == null) {
                        yg5.n("Non-denotable supertypes are not possible. Supertype '", yn7Var, "' appears non-denotable in class '", nm7Var);
                        return null;
                    }
                    fo7 fo7Var2 = fo7.c;
                    fo7 fo7VarE = dj6.E(yn7Var);
                    ha5 ha5VarC = ia5.c(em7Var);
                    int i7 = (i5 != 0 || ha5VarC.b) ? i3 : i4;
                    int i8 = (i6 != 0 || ha5VarC.c) ? i3 : i4;
                    Iterator it = ha5VarC.a.entrySet().iterator();
                    while (it.hasNext()) {
                        wnb wnbVar3 = (wnb) ((Map.Entry) it.next()).getValue();
                        dm7 dm7Var = ((xnb) wnbVar3).a;
                        dm7Var.getClass();
                        fo7VarE.getClass();
                        fo7 fo7Var3 = dm7Var.a;
                        if (fo7Var3 != null) {
                            Map map3 = fo7Var3.a;
                            boolean z2 = fo7VarE.b;
                            if (fo7Var3.b) {
                                i = i4;
                            } else {
                                if (map3.isEmpty()) {
                                    fo7Var3 = fo7.c.a(z2);
                                } else if (fo7VarE.a.isEmpty()) {
                                    fo7Var3 = fo7Var3.a(z2);
                                } else {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(map3.size()));
                                    for (Map.Entry entry : map3.entrySet()) {
                                        Object key = entry.getKey();
                                        do7 do7VarB = (do7) entry.getValue();
                                        yn7 yn7Var2 = do7VarB.b;
                                        int i9 = i4;
                                        io7 io7Var = do7VarB.a;
                                        if (yn7Var2 != null && io7Var != null) {
                                            do7VarB = fo7VarE.b(yn7Var2, io7Var);
                                        }
                                        linkedHashMap.put(key, do7VarB);
                                        i4 = i9;
                                    }
                                    i = i4;
                                    fo7Var3 = new fo7(linkedHashMap, z2);
                                }
                                i = i4;
                            }
                            if (fo7Var3 != null) {
                                fo7Var = fo7Var3;
                            }
                            dm7 dm7VarA = dm7.a(dm7Var, fo7Var, null, null, null, null, false, false, false, false, 510);
                            xm7VarS = ((xnb) wnbVar3).a.d;
                            if (xm7VarS == null) {
                                xm7VarS = wnbVar3.s();
                            }
                            wnbVarP = wnbVar3.p(nm7Var, dm7.a(dm7VarA, null, null, Boolean.valueOf(ia5.e(wnbVar3)), xm7VarS, wnbVar3.getTypeParameters(), false, false, false, false, 483));
                            ux4VarH = ia5.h(wnbVarP, tx4Var);
                            if (!map2.containsKey(ux4VarH)) {
                                fo7 fo7Var4 = fo7VarE;
                                ux4 ux4Var = new ux4(ux4VarH.a, ux4VarH.b, ux4VarH.c, ux4VarH.d, ux4VarH.e, ux4VarH.f, ux4VarH.g, ux4VarH.h, sx4Var);
                                obj = map.get(ux4Var);
                                if (obj != null) {
                                    wnbVar = (wnb) obj;
                                    if (ww2.b.compare(wnbVar, wnbVarP) <= 0) {
                                        wnbVarP2 = wnbVar;
                                    } else {
                                        wnbVarP2 = wnbVarP;
                                    }
                                    if ((wnbVar instanceof ym7) && (wnbVarP instanceof ym7)) {
                                        xm7 xm7VarS2 = wnbVarP2.s();
                                        dm7 dm7Var2 = ((xnb) wnbVarP2).a;
                                        ym7Var = (ym7) wnbVar;
                                        if (!ym7Var.isOperator() || ((ym7) wnbVarP).isOperator()) {
                                            r29 = 1;
                                        } else {
                                            r29 = i;
                                        }
                                        if (!ym7Var.isInfix() || ((ym7) wnbVarP).isInfix()) {
                                            r30 = 1;
                                        } else {
                                            r30 = i;
                                        }
                                        if (!ym7Var.isInline() || ((ym7) wnbVarP).isInline()) {
                                            r31 = 1;
                                        } else {
                                            r31 = i;
                                        }
                                        if (!ym7Var.isExternal() || ((ym7) wnbVarP).isExternal()) {
                                            r28 = 1;
                                        } else {
                                            r28 = i;
                                        }
                                        va2Var = ia5.a;
                                        va2Var.getClass();
                                        if (va2Var.compare(wnbVar, wnbVarP) > 0) {
                                            wnbVar = wnbVarP;
                                        }
                                        wnbVarP2 = wnbVarP2.p(xm7VarS2, dm7.a(dm7Var2, null, wnbVar.i(), null, null, null, r28, r29, r30, r31, 29));
                                    }
                                    if (wnbVarP2 != null) {
                                        wnbVarP = wnbVarP2;
                                    }
                                }
                                map.put(ux4Var, wnbVarP);
                                fo7VarE = fo7Var4;
                            }
                            i4 = i;
                            i3 = 1;
                        } else {
                            i = i4;
                        }
                        fo7Var = fo7VarE;
                        dm7 dm7VarA2 = dm7.a(dm7Var, fo7Var, null, null, null, null, false, false, false, false, 510);
                        xm7VarS = ((xnb) wnbVar3).a.d;
                        if (xm7VarS == null) {
                            xm7VarS = wnbVar3.s();
                        }
                        wnbVarP = wnbVar3.p(nm7Var, dm7.a(dm7VarA2, null, null, Boolean.valueOf(ia5.e(wnbVar3)), xm7VarS, wnbVar3.getTypeParameters(), false, false, false, false, 483));
                        ux4VarH = ia5.h(wnbVarP, tx4Var);
                        if (!map2.containsKey(ux4VarH)) {
                            fo7 fo7Var5 = fo7VarE;
                            ux4 ux4Var2 = new ux4(ux4VarH.a, ux4VarH.b, ux4VarH.c, ux4VarH.d, ux4VarH.e, ux4VarH.f, ux4VarH.g, ux4VarH.h, sx4Var);
                            obj = map.get(ux4Var2);
                            if (obj != null) {
                                wnbVar = (wnb) obj;
                                if (ww2.b.compare(wnbVar, wnbVarP) <= 0) {
                                    wnbVarP2 = wnbVar;
                                } else {
                                    wnbVarP2 = wnbVarP;
                                }
                                if (wnbVar instanceof ym7) {
                                    xm7 xm7VarS3 = wnbVarP2.s();
                                    dm7 dm7Var3 = ((xnb) wnbVarP2).a;
                                    ym7Var = (ym7) wnbVar;
                                    if (ym7Var.isOperator()) {
                                        r29 = 1;
                                    } else {
                                        r29 = 1;
                                    }
                                    if (ym7Var.isInfix()) {
                                        r30 = 1;
                                    } else {
                                        r30 = 1;
                                    }
                                    if (ym7Var.isInline()) {
                                        r31 = 1;
                                    } else {
                                        r31 = 1;
                                    }
                                    if (ym7Var.isExternal()) {
                                        r28 = 1;
                                    } else {
                                        r28 = 1;
                                    }
                                    va2Var = ia5.a;
                                    va2Var.getClass();
                                    if (va2Var.compare(wnbVar, wnbVarP) > 0) {
                                        wnbVar = wnbVarP;
                                    }
                                    wnbVarP2 = wnbVarP2.p(xm7VarS3, dm7.a(dm7Var3, null, wnbVar.i(), null, null, null, r28, r29, r30, r31, 29));
                                }
                                if (wnbVarP2 != null) {
                                    wnbVarP = wnbVarP2;
                                }
                            }
                            map.put(ux4Var2, wnbVarP);
                            fo7VarE = fo7Var5;
                        }
                        i4 = i;
                        i3 = 1;
                    }
                    i5 = i7;
                    i6 = i8;
                }
                int i10 = i4;
                ?? r8 = i5;
                ?? r9 = i6;
                for (Map.Entry entry2 : map2.entrySet()) {
                    ux4 ux4Var3 = (ux4) entry2.getKey();
                    wnb wnbVar4 = (wnb) entry2.getValue();
                    int i11 = (r8 != 0 || ia5.e(wnbVar4)) ? 1 : i10;
                    int i12 = (r9 != 0 || wnbVar4.E()) ? 1 : i10;
                    map.put(new ux4(ux4Var3.a, ux4Var3.b, ux4Var3.c, ux4Var3.d, ux4Var3.e, ux4Var3.f, ux4Var3.g, ux4Var3.h, sx4Var), wnbVar4);
                    r8 = i11;
                    r9 = i12;
                }
                if (!z) {
                    for (wnb wnbVar5 : ia5.b(nm7Var)) {
                        if (!ia5.d(nm7Var, wnbVar5)) {
                            r8 = (r8 != 0 || ia5.e(wnbVar5)) ? 1 : i10;
                            r9 = (r9 != 0 || wnbVar5.E()) ? 1 : i10;
                            map.put(ia5.h(wnbVar5, sx4Var), wnbVar5);
                        }
                    }
                }
                return new ha5(map, r8, r9);
            case 6:
                Class cls3 = nm7Var.b;
                Annotation[] annotations = cls3.getAnnotations();
                if (annotations.length != cls3.getDeclaredAnnotations().length) {
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Class superclass = cls3;
                    do {
                        Annotation[] declaredAnnotations = superclass.getDeclaredAnnotations();
                        for (int length = declaredAnnotations.length - 1; -1 < length; length--) {
                            Annotation annotation = declaredAnnotations[length];
                            if (!nm7.d.contains(af1.R(af1.Q(annotation)).getName())) {
                                if (superclass != cls3) {
                                    dx5 dx5Var = sqf.a;
                                    if (af1.R(af1.Q(annotation)).getAnnotation(Inherited.class) != null) {
                                        if (sqf.j(af1.Q(annotation))) {
                                            Class<?> componentType = af1.R(af1.Q(annotation)).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                            componentType.getClass();
                                            if (af1.R(job.a.b(componentType)).getAnnotation(Inherited.class) != null) {
                                                dx5 dx5Var2 = sqf.a;
                                                em7VarQ = af1.Q(annotation);
                                                if (sqf.j(em7VarQ)) {
                                                    Class<?> componentType2 = af1.R(em7VarQ).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                    componentType2.getClass();
                                                    em7VarQ = job.a.b(componentType2);
                                                }
                                                cls = (Class) linkedHashMap2.get(em7VarQ);
                                                if (cls == null) {
                                                    linkedHashMap2.put(em7VarQ, superclass);
                                                }
                                                if (cls != null || cls.equals(superclass)) {
                                                    arrayList2.add(annotation);
                                                }
                                            }
                                        } else {
                                            dx5 dx5Var3 = sqf.a;
                                            em7VarQ = af1.Q(annotation);
                                            if (sqf.j(em7VarQ)) {
                                                Class<?> componentType3 = af1.R(em7VarQ).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                componentType3.getClass();
                                                em7VarQ = job.a.b(componentType3);
                                            }
                                            cls = (Class) linkedHashMap2.get(em7VarQ);
                                            if (cls == null) {
                                                linkedHashMap2.put(em7VarQ, superclass);
                                            }
                                            if (cls != null) {
                                                arrayList2.add(annotation);
                                            } else {
                                                arrayList2.add(annotation);
                                            }
                                        }
                                    }
                                } else {
                                    dx5 dx5Var4 = sqf.a;
                                    em7VarQ = af1.Q(annotation);
                                    if (sqf.j(em7VarQ)) {
                                        Class<?> componentType4 = af1.R(em7VarQ).getDeclaredMethod("value", null).getReturnType().getComponentType();
                                        componentType4.getClass();
                                        em7VarQ = job.a.b(componentType4);
                                    }
                                    cls = (Class) linkedHashMap2.get(em7VarQ);
                                    if (cls == null) {
                                        linkedHashMap2.put(em7VarQ, superclass);
                                    }
                                    if (cls != null) {
                                        arrayList2.add(annotation);
                                    } else {
                                        arrayList2.add(annotation);
                                    }
                                }
                            }
                        }
                        superclass = superclass.getSuperclass();
                    } while (superclass != null);
                    arrayList = s72.V0(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    int length2 = annotations.length;
                    while (i4 < length2) {
                        Annotation annotation2 = annotations[i4];
                        if (!nm7.d.contains(af1.R(af1.Q(annotation2)).getName())) {
                            arrayList.add(annotation2);
                        }
                        i4++;
                    }
                }
                return sqf.t(arrayList);
            case 7:
                Class cls4 = nm7Var.b;
                if (cls4.isAnonymousClass()) {
                    return null;
                }
                j22 j22VarR2 = nm7Var.R();
                if (!j22VarR2.c) {
                    String strB = j22VarR2.f().b();
                    strB.getClass();
                    return strB;
                }
                String simpleName = cls4.getSimpleName();
                Method enclosingMethod = cls4.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return v4e.f0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls4.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    int iN = v4e.N(simpleName, '$', 0, 6);
                    return iN == -1 ? simpleName : simpleName.substring(iN + 1, simpleName.length());
                }
                return v4e.f0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            default:
                if (nm7Var.b.isAnonymousClass()) {
                    return null;
                }
                j22 j22VarR3 = nm7Var.R();
                if (j22VarR3.c) {
                    return null;
                }
                return j22VarR3.a().a.a;
        }
    }

    public /* synthetic */ gm7(nm7 nm7Var, jm7 jm7Var, int i) {
        this.a = i;
        this.b = nm7Var;
    }
}
