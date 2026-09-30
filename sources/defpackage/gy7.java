package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gy7 implements a26 {
    public final /* synthetic */ int a;
    public final iy7 b;

    public /* synthetic */ gy7(iy7 iy7Var, int i) {
        this.a = i;
        this.b = iy7Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:91:0x0240  */
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
    @Override // defpackage.a26
    public final Object d(Object obj) {
        snb xmbVar;
        snb qnbVar;
        int i = this.a;
        int i2 = 2;
        iy7 iy7Var = this.b;
        t99 t99Var = (t99) obj;
        switch (i) {
            case 0:
                t99Var.getClass();
                iy7 iy7Var2 = iy7Var.c;
                if (iy7Var2 != null) {
                    return (Collection) iy7Var2.f.d(t99Var);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((im3) iy7Var.e.invoke()).c(t99Var).iterator();
                while (it.hasNext()) {
                    if7 if7VarT = iy7Var.t((onb) it.next());
                    if (iy7Var.r(if7VarT)) {
                        Object obj2 = iy7Var.b.b;
                        arrayList.add(if7VarT);
                    }
                }
                iy7Var.j(t99Var, arrayList);
                return arrayList;
            case 1:
                t99Var.getClass();
                iy7 iy7Var3 = iy7Var.c;
                if (iy7Var3 != null) {
                    return (wxa) iy7Var3.g.d(t99Var);
                }
                lnb lnbVarD = ((im3) iy7Var.e.invoke()).d(t99Var);
                if (lnbVarD != null) {
                    Field field = lnbVarD.a;
                    if (!field.isEnumConstant()) {
                        mmb mmbVar = new mmb();
                        boolean z = !Modifier.isFinal(((Field) lnbVarD.b()).getModifiers());
                        szc szcVar = iy7Var.b;
                        lf7 lf7VarL0 = lf7.L0(iy7Var.q(), kn2.V(szcVar, lnbVarD), t4c.u(lnbVarD.e()), z, lnbVarD.c(), m8c.B(lnbVarD), Modifier.isFinal(((Field) lnbVarD.b()).getModifiers()) && Modifier.isStatic(((Field) lnbVarD.b()).getModifiers()));
                        mmbVar.element = lf7VarL0;
                        lf7VarL0.H0(null, null, null, null);
                        ta0 ta0Var = (ta0) szcVar.e;
                        Type genericType = field.getGenericType();
                        genericType.getClass();
                        boolean z2 = genericType instanceof Class;
                        if (z2) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                qnbVar = new qnb(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z2 && ((Class) genericType).isArray())) {
                                    xmbVar = new xmb(genericType);
                                } else {
                                    xmbVar = genericType instanceof WildcardType ? new vnb((WildcardType) genericType) : new hnb(genericType);
                                }
                                qnbVar = xmbVar;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                xmbVar = new xmb(genericType);
                            } else {
                                xmbVar = new xmb(genericType);
                            }
                            qnbVar = xmbVar;
                        }
                        tt7 tt7VarT = ta0Var.T(qnbVar, vfh.Q(t8f.b, false, null, 7));
                        if ((xr7.G(tt7VarT) || xr7.H(tt7VarT)) && Modifier.isFinal(((Field) lnbVarD.b()).getModifiers())) {
                            Modifier.isStatic(((Field) lnbVarD.b()).getModifiers());
                        }
                        yxa yxaVar = (yxa) mmbVar.element;
                        nw7 nw7VarP = iy7Var.p();
                        pu4 pu4Var = pu4.a;
                        yxaVar.K0(tt7VarT, pu4Var, nw7VarP, null, pu4Var);
                        bm3 bm3VarQ = iy7Var.q();
                        if ((bm3VarQ instanceof u09 ? (u09) bm3VarQ : null) != null) {
                            yxa yxaVar2 = (yxa) mmbVar.element;
                            yxaVar2.getClass();
                            mmbVar.element = yxaVar2;
                        }
                        Object obj3 = mmbVar.element;
                        bsf bsfVar = (bsf) obj3;
                        tt7 type = ((yxa) obj3).getType();
                        if (bsfVar == null) {
                            oz3.a(65);
                            throw null;
                        }
                        if (type == null) {
                            oz3.a(66);
                            throw null;
                        }
                        int i3 = oz3.a;
                        if (!bsfVar.N() && !i7h.x(type)) {
                            if (w8f.b(type)) {
                                ((yxa) mmbVar.element).I0(null, new m04(iy7Var, lnbVarD, mmbVar, i2));
                            } else {
                                xr7 xr7VarE = qz3.e(bsfVar);
                                if (xr7.G(type)) {
                                    ((yxa) mmbVar.element).I0(null, new m04(iy7Var, lnbVarD, mmbVar, i2));
                                } else {
                                    cf9 cf9Var = vt7.a;
                                    if (cf9Var.a(xr7VarE.v(), type) || cf9Var.a(xr7VarE.k("Number").S(), type) || cf9Var.a(xr7VarE.e(), type) || egf.a(type)) {
                                        ((yxa) mmbVar.element).I0(null, new m04(iy7Var, lnbVarD, mmbVar, i2));
                                    }
                                }
                            }
                        }
                        Object obj4 = mmbVar.element;
                        if (((wxa) obj4) != null) {
                            return (wxa) obj4;
                        }
                        y7h.a(6);
                        throw null;
                    }
                }
                return null;
            case 2:
                t99Var.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) iy7Var.f.d(t99Var));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : linkedHashSet) {
                    String strQ = xo1.q((hjd) obj5, 2);
                    Object arrayList2 = linkedHashMap.get(strQ);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strQ, arrayList2);
                    }
                    ((List) arrayList2).add(obj5);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionP = y41.P(list, tj7.E0);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionP);
                    }
                }
                iy7Var.m(linkedHashSet, t99Var);
                szc szcVar2 = iy7Var.b;
                return s72.j1(((mf7) szcVar2.b).k.l(szcVar2, linkedHashSet));
            default:
                t99Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Object objD = iy7Var.g.d(t99Var);
                if (objD != null) {
                    arrayList3.add(objD);
                }
                iy7Var.n(t99Var, arrayList3);
                bm3 bm3VarQ2 = iy7Var.q();
                int i4 = oz3.a;
                if (oz3.l(bm3VarQ2, l22.ANNOTATION_CLASS)) {
                    return s72.j1(arrayList3);
                }
                szc szcVar3 = iy7Var.b;
                return s72.j1(((mf7) szcVar3.b).k.l(szcVar3, arrayList3));
        }
    }
}
