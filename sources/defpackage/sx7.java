package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sx7 implements x16 {
    public final /* synthetic */ int a = 1;
    public final szc b;
    public final wx7 c;

    public sx7(wx7 wx7Var, szc szcVar) {
        this.c = wx7Var;
        this.b = szcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [e36, wd7, z12] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [wx7] */
    /* JADX WARN: Type inference failed for: r8v9, types: [wx7] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.x16
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        enb enbVar;
        u09 u09Var;
        Class cls;
        ArrayList arrayList;
        t8f t8fVar;
        List listJ;
        ?? arrayList2;
        ?? r9;
        ?? r8;
        iy9 iy9Var;
        List listD;
        int i = this.a;
        szc szcVar = this.b;
        switch (i) {
            case 0:
                g10 g10Var = hj6.c;
                wx7 wx7Var = this.c;
                enb enbVar2 = wx7Var.o;
                szc szcVar2 = wx7Var.b;
                u09 u09Var2 = wx7Var.n;
                Constructor<?>[] declaredConstructors = enbVar2.a.getDeclaredConstructors();
                declaredConstructors.getClass();
                boolean z = false;
                List<inb> listA = fyc.A(fyc.x(new ve5(qd0.S(declaredConstructors), false, zmb.a), anb.a));
                ArrayList arrayList3 = new ArrayList(listA.size());
                for (inb inbVar : listA) {
                    wd7 wd7VarU0 = wd7.U0(u09Var2, kn2.V(szcVar2, inbVar), z, m8c.B(inbVar));
                    szc szcVar3 = new szc((mf7) szcVar2.b, new r1f(szcVar2, wd7VarU0, inbVar, u09Var2.h0().size()), (lw7) szcVar2.d);
                    Constructor constructor = inbVar.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listD = pu4.a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) qd0.f0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            yg5.r(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) qd0.f0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = inbVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    pk1 pk1VarU = iy7.u(szcVar3, wd7VarU0, listD);
                    List listH0 = u09Var2.h0();
                    listH0.getClass();
                    ArrayList typeParameters = inbVar.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(t72.u(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        wx7 wx7Var2 = wx7Var;
                        c8f c8fVarI = ((f8f) szcVar3.c).i((tnb) it.next());
                        c8fVarI.getClass();
                        arrayList4.add(c8fVarI);
                        wx7Var = wx7Var2;
                    }
                    wd7VarU0.S0((List) pk1VarU.c, t4c.u(inbVar.e()), s72.Q0(listH0, arrayList4));
                    wd7VarU0.K0(false);
                    wd7VarU0.L0(pk1VarU.b);
                    wd7VarU0.M0(u09Var2.S());
                    arrayList3.add(wd7VarU0);
                    wx7Var = wx7Var;
                    z = false;
                }
                wx7 wx7Var3 = wx7Var;
                boolean zG = enbVar2.g();
                Class cls2 = enbVar2.a;
                t8f t8fVar2 = t8f.b;
                if (zG) {
                    Object obj = szcVar2.b;
                    wd7 wd7VarU1 = wd7.U0(u09Var2, g10Var, true, m8c.B(enbVar2));
                    ArrayList<rnb> arrayListF = enbVar2.f();
                    ArrayList arrayList5 = new ArrayList(arrayListF.size());
                    boolean z2 = false;
                    Object obj2 = null;
                    tf7 tf7VarQ = vfh.Q(t8fVar2, false, null, 6);
                    int i2 = 0;
                    for (rnb rnbVar : arrayListF) {
                        ArrayList arrayList6 = arrayList5;
                        Class cls3 = cls2;
                        wd7 wd7Var = wd7VarU1;
                        arrayList6.add(new xrf(wd7Var, null, i2, g10Var, rnbVar.c(), ((ta0) szcVar2.e).T(rnbVar.f(), tf7VarQ), false, false, false, null, m8c.B(rnbVar)));
                        arrayList3 = arrayList3;
                        arrayList5 = arrayList6;
                        wd7VarU1 = wd7Var;
                        i2++;
                        enbVar2 = enbVar2;
                        cls2 = cls3;
                        tf7VarQ = tf7VarQ;
                        u09Var2 = u09Var2;
                        t8fVar2 = t8fVar2;
                        z2 = false;
                        obj2 = null;
                    }
                    enbVar = enbVar2;
                    u09Var = u09Var2;
                    cls = cls2;
                    t8fVar = t8fVar2;
                    ArrayList arrayList7 = arrayList5;
                    z12 z12Var = wd7VarU1;
                    arrayList = arrayList3;
                    z12Var.L0(z2);
                    rz3 visibility = u09Var.getVisibility();
                    visibility.getClass();
                    if (visibility.equals(je7.b)) {
                        visibility = je7.c;
                        visibility.getClass();
                    }
                    z12Var.R0(arrayList7, visibility);
                    z12Var.K0(z2);
                    z12Var.M0(u09Var.S());
                    String strQ = xo1.q(z12Var, 2);
                    if (arrayList.isEmpty()) {
                        arrayList.add(z12Var);
                        Object obj3 = szcVar.b;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList.add(z12Var);
                                Object obj4 = szcVar.b;
                            }
                        } while (!xo1.q((z12) it2.next(), 2).equals(strQ));
                    }
                } else {
                    enbVar = enbVar2;
                    u09Var = u09Var2;
                    cls = cls2;
                    arrayList = arrayList3;
                    t8fVar = t8fVar2;
                }
                u09Var.getClass();
                szcVar.getClass();
                y25 y25Var = ((mf7) szcVar.b).k;
                if (arrayList.isEmpty()) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        Object obj5 = szcVar2.b;
                        ta0 ta0Var = (ta0) szcVar2.e;
                        u09 u09Var3 = u09Var;
                        ?? U0 = wd7.U0(u09Var3, g10Var, true, m8c.B(enbVar));
                        if (zIsAnnotation) {
                            List listD2 = enbVar.d();
                            arrayList2 = new ArrayList(listD2.size());
                            tf7 tf7VarQ2 = vfh.Q(t8fVar, true, null, 6);
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj6 : listD2) {
                                if (pa7.t(((onb) obj6).c(), pj7.b)) {
                                    arrayList8.add(obj6);
                                } else {
                                    arrayList9.add(obj6);
                                }
                            }
                            iy9 iy9Var2 = new iy9(arrayList8, arrayList9);
                            List list = (List) iy9Var2.a();
                            List<onb> list2 = (List) iy9Var2.b();
                            list.size();
                            onb onbVar = (onb) s72.x0(list);
                            if (onbVar != null) {
                                snb snbVarF = onbVar.f();
                                if (snbVarF instanceof xmb) {
                                    xmb xmbVar = (xmb) snbVarF;
                                    iy9Var = new iy9(ta0Var.S(xmbVar, tf7VarQ2, true), ta0Var.T(xmbVar.b, tf7VarQ2));
                                } else {
                                    iy9Var = new iy9(ta0Var.T(snbVarF, tf7VarQ2), null);
                                }
                                tt7 tt7Var = (tt7) iy9Var.a();
                                tt7 tt7Var2 = (tt7) iy9Var.b();
                                ?? r10 = wx7Var3;
                                r10.v(arrayList2, U0, 0, onbVar, tt7Var, tt7Var2);
                                r8 = r10;
                            } else {
                                r8 = wx7Var3;
                            }
                            int i3 = onbVar != null ? 1 : 0;
                            int i4 = 0;
                            for (onb onbVar2 : list2) {
                                r8.v(arrayList2, U0, i4 + i3, onbVar2, ta0Var.T(onbVar2.f(), tf7VarQ2), null);
                                i4++;
                            }
                        } else {
                            arrayList2 = Collections.EMPTY_LIST;
                        }
                        U0.L0(false);
                        rz3 visibility2 = u09Var3.getVisibility();
                        visibility2.getClass();
                        if (visibility2.equals(je7.b)) {
                            visibility2 = je7.c;
                            visibility2.getClass();
                        }
                        U0.R0(arrayList2, visibility2);
                        U0.K0(true);
                        U0.M0(u09Var3.S());
                        r9 = U0;
                    } else {
                        r9 = 0;
                    }
                    listJ = t72.J(r9);
                } else {
                    listJ = arrayList;
                }
                return s72.j1(y25Var.l(szcVar, listJ));
            default:
                this.c.n.getClass();
                szcVar.getClass();
                return s72.o1(new ArrayList());
        }
    }

    public sx7(szc szcVar, wx7 wx7Var) {
        this.b = szcVar;
        this.c = wx7Var;
    }
}
