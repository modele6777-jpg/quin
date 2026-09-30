package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y7f {
    public static final y7f a = new y7f();

    public static ArrayList a(AbstractCollection abstractCollection, l26 l26Var) {
        ArrayList<tjd> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            tjd tjdVar = (tjd) it.next();
            if (!arrayList.isEmpty()) {
                for (tjd tjdVar2 : arrayList) {
                    if (tjdVar2 != tjdVar) {
                        tjdVar2.getClass();
                        tjdVar.getClass();
                        if (((Boolean) l26Var.z(tjdVar2, tjdVar)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [e7f] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [e7f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v17, types: [tjd] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, tjd, tt7] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.Set] */
    public final tjd b(ArrayList arrayList) {
        tjd tjdVarA;
        arrayList.size();
        ArrayList<tjd> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tjd tjdVar = (tjd) it.next();
            if (tjdVar.c0() instanceof ca7) {
                Collection collectionE = tjdVar.c0().e();
                collectionE.getClass();
                Collection<tt7> collection = collectionE;
                ArrayList arrayList3 = new ArrayList(t72.u(collection, 10));
                for (tt7 tt7Var : collection) {
                    tt7Var.getClass();
                    tjd tjdVarJ0 = pa7.j0(tt7Var);
                    if (tjdVar.i0()) {
                        tjdVarJ0 = tjdVarJ0.l0(true);
                    }
                    arrayList3.add(tjdVarJ0);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(tjdVar);
            }
        }
        Iterator it2 = arrayList2.iterator();
        x7f x7fVarA = x7f.a;
        while (it2.hasNext()) {
            x7fVarA = x7fVarA.a((jgf) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (tjd tjdVarL0 : arrayList2) {
            if (x7fVarA == x7f.d) {
                if (tjdVarL0 instanceof ue9) {
                    ue9 ue9Var = (ue9) tjdVarL0;
                    tjdVarL0 = new ue9(ue9Var.b, ue9Var.c, ue9Var.d, ue9Var.e, ue9Var.f, true);
                }
                tjdVarL0.getClass();
                tjd tjdVarK0 = qfc.K0(tjdVarL0, false);
                tjdVarL0 = (tjdVarK0 == null && (tjdVarK0 = o7c.w(tjdVarL0)) == null) ? tjdVarL0.l0(false) : tjdVarK0;
            }
            linkedHashSet.add(tjdVarL0);
        }
        ArrayList arrayList4 = new ArrayList(t72.u(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((tjd) it3.next()).a0());
        }
        Iterator it4 = arrayList4.iterator();
        tjd tjdVar2 = null;
        if (!it4.hasNext()) {
            s8f.i("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            e7f e7fVar = (e7f) it4.next();
            next = (e7f) next;
            next.getClass();
            lqb lqbVar = e7f.b;
            e7fVar.getClass();
            if (!next.isEmpty() || !e7fVar.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) lqbVar.b).values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    k10 k10Var = (k10) next.a.get(iIntValue);
                    k10 k10Var2 = (k10) e7fVar.a.get(iIntValue);
                    if (k10Var != null) {
                        if (!pa7.t(k10Var2, k10Var)) {
                            k10Var = null;
                        }
                        k10Var2 = k10Var;
                    } else if (k10Var2 == null || !pa7.t(k10Var, k10Var2)) {
                        k10Var2 = null;
                    }
                    if (k10Var2 != null) {
                        arrayList5.add(k10Var2);
                    }
                }
                next = lqb.e(arrayList5);
            }
        }
        e7f e7fVar2 = (e7f) next;
        if (linkedHashSet.size() == 1) {
            tjdVarA = (tjd) s72.W0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new v5c(2, this, y7f.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, 11));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    s8f.i("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    tjd tjdVar3 = (tjd) it6.next();
                    next2 = (tjd) next2;
                    if (next2 != 0 && tjdVar3 != null) {
                        j7f j7fVarC0 = next2.c0();
                        j7f j7fVarC1 = tjdVar3.c0();
                        boolean z = j7fVarC0 instanceof h77;
                        if (z && (j7fVarC1 instanceof h77)) {
                            Set set = ((h77) j7fVarC0).a;
                            Set set2 = ((h77) j7fVarC1).a;
                            set.getClass();
                            set2.getClass();
                            Set setN1 = s72.n1(set);
                            x72.g0(setN1, set2);
                            h77 h77Var = new h77(setN1);
                            e7f.b.getClass();
                            e7f e7fVar3 = e7f.c;
                            e7fVar3.getClass();
                            next2 = rxg.U(sy4.a(ny4.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), e7fVar3, h77Var, pu4.a, false);
                        } else if (z) {
                            if (((h77) j7fVarC0).a.contains(tjdVar3)) {
                                next2 = tjdVar3;
                            }
                        } else if (!(j7fVarC1 instanceof h77) || !((h77) j7fVarC1).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                tjdVar2 = (tjd) next2;
            }
            if (tjdVar2 != null) {
                tjdVarA = tjdVar2;
            } else {
                bf9.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new v5c(2, af9.b, cf9.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, 12));
                arrayListA2.isEmpty();
                tjdVarA = arrayListA2.size() < 2 ? (tjd) s72.W0(arrayListA2) : new ca7(linkedHashSet).a();
            }
        }
        return tjdVarA.n0(e7fVar2);
    }
}
