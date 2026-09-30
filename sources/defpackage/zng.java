package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zng {
    public static final m8c a;

    static {
        int i = slg.a;
        a = new m8c(9);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

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
    public static void b(Object obj, Object obj2) {
        omg omgVar = (omg) obj;
        gog gogVar = omgVar.zzc;
        gog gogVar2 = ((omg) obj2).zzc;
        gog gogVar3 = gog.f;
        if (!gogVar3.equals(gogVar2)) {
            if (gogVar3.equals(gogVar)) {
                int i = gogVar.a + gogVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(gogVar.b, i);
                System.arraycopy(gogVar2.b, 0, iArrCopyOf, gogVar.a, gogVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(gogVar.c, i);
                System.arraycopy(gogVar2.c, 0, objArrCopyOf, gogVar.a, gogVar2.a);
                gogVar = new gog(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                gogVar.getClass();
                if (!gogVar2.equals(gogVar3)) {
                    if (!gogVar.e) {
                        cva.f();
                        return;
                    }
                    int i2 = gogVar.a + gogVar2.a;
                    gogVar.e(i2);
                    System.arraycopy(gogVar2.b, 0, gogVar.b, gogVar.a, gogVar2.a);
                    System.arraycopy(gogVar2.c, 0, gogVar.c, gogVar.a, gogVar2.a);
                    gogVar.a = i2;
                }
            }
        }
        omgVar.zzc = gogVar;
    }

    public static Object c(Object obj, int i, zmg zmgVar, llg llgVar, Object obj2, m8c m8cVar) {
        if (llgVar == null) {
            return obj2;
        }
        if (zmgVar == null) {
            Iterator it = zmgVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!llgVar.a(iIntValue)) {
                    if (obj2 == null) {
                        m8cVar.getClass();
                        obj2 = m8c.C(obj);
                    }
                    m8cVar.getClass();
                    ((gog) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zmgVar.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) zmgVar.get(i3);
            int iIntValue2 = num.intValue();
            if (llgVar.a(iIntValue2)) {
                if (i3 != i2) {
                    zmgVar.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    m8cVar.getClass();
                    obj2 = m8c.C(obj);
                }
                m8cVar.getClass();
                ((gog) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            zmgVar.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void d(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gmgVar.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        gmgVar.r(i3);
        while (i2 < list.size()) {
            gmgVar.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void e(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gmgVar.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        gmgVar.r(i3);
        while (i2 < list.size()) {
            gmgVar.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void f(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof fng)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += gmg.b(((Long) list.get(i3)).longValue());
            }
            gmgVar.r(iB);
            while (i2 < list.size()) {
                gmgVar.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fng fngVar = (fng) list;
        if (!z) {
            while (i2 < fngVar.c) {
                gmgVar.h(i, fngVar.c(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < fngVar.c; i4++) {
            iB2 += gmg.b(fngVar.c(i4));
        }
        gmgVar.r(iB2);
        while (i2 < fngVar.c) {
            gmgVar.t(fngVar.c(i2));
            i2++;
        }
    }

    public static void g(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof fng)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += gmg.b(((Long) list.get(i3)).longValue());
            }
            gmgVar.r(iB);
            while (i2 < list.size()) {
                gmgVar.t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fng fngVar = (fng) list;
        if (!z) {
            while (i2 < fngVar.c) {
                gmgVar.h(i, fngVar.c(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < fngVar.c; i4++) {
            iB2 += gmg.b(fngVar.c(i4));
        }
        gmgVar.r(iB2);
        while (i2 < fngVar.c) {
            gmgVar.t(fngVar.c(i2));
            i2++;
        }
    }

    public static void h(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof fng)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    gmgVar.h(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iB += gmg.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            gmgVar.r(iB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                gmgVar.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        fng fngVar = (fng) list;
        if (!z) {
            while (i2 < fngVar.c) {
                long jC = fngVar.c(i2);
                gmgVar.h(i, (jC >> 63) ^ (jC + jC));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < fngVar.c; i4++) {
            long jC2 = fngVar.c(i4);
            iB2 += gmg.b((jC2 >> 63) ^ (jC2 + jC2));
        }
        gmgVar.r(iB2);
        while (i2 < fngVar.c) {
            long jC3 = fngVar.c(i2);
            gmgVar.t((jC3 >> 63) ^ (jC3 + jC3));
            i2++;
        }
    }

    public static void i(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof fng)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            gmgVar.r(i3);
            while (i2 < list.size()) {
                gmgVar.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fng fngVar = (fng) list;
        if (!z) {
            while (i2 < fngVar.c) {
                gmgVar.i(i, fngVar.c(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < fngVar.c; i6++) {
            fngVar.c(i6);
            i5 += 8;
        }
        gmgVar.r(i5);
        while (i2 < fngVar.c) {
            gmgVar.u(fngVar.c(i2));
            i2++;
        }
    }

    public static void j(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof fng)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            gmgVar.r(i3);
            while (i2 < list.size()) {
                gmgVar.u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fng fngVar = (fng) list;
        if (!z) {
            while (i2 < fngVar.c) {
                gmgVar.i(i, fngVar.c(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < fngVar.c; i6++) {
            fngVar.c(i6);
            i5 += 8;
        }
        gmgVar.r(i5);
        while (i2 < fngVar.c) {
            gmgVar.u(fngVar.c(i2));
            i2++;
        }
    }

    public static void k(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof pmg)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += gmg.b(((Integer) list.get(i3)).intValue());
            }
            gmgVar.r(iB);
            while (i2 < list.size()) {
                gmgVar.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pmg pmgVar = (pmg) list;
        if (!z) {
            while (i2 < pmgVar.c) {
                gmgVar.e(i, pmgVar.d(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < pmgVar.c; i4++) {
            iB2 += gmg.b(pmgVar.d(i4));
        }
        gmgVar.r(iB2);
        while (i2 < pmgVar.c) {
            gmgVar.q(pmgVar.d(i2));
            i2++;
        }
    }

    public static void l(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof pmg)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iA += gmg.a(((Integer) list.get(i3)).intValue());
            }
            gmgVar.r(iA);
            while (i2 < list.size()) {
                gmgVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pmg pmgVar = (pmg) list;
        if (!z) {
            while (i2 < pmgVar.c) {
                gmgVar.f(i, pmgVar.d(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < pmgVar.c; i4++) {
            iA2 += gmg.a(pmgVar.d(i4));
        }
        gmgVar.r(iA2);
        while (i2 < pmgVar.c) {
            gmgVar.r(pmgVar.d(i2));
            i2++;
        }
    }

    public static void m(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof pmg)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    gmgVar.f(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iA += gmg.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            gmgVar.r(iA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                gmgVar.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        pmg pmgVar = (pmg) list;
        if (!z) {
            while (i2 < pmgVar.c) {
                int iD = pmgVar.d(i2);
                gmgVar.f(i, (iD >> 31) ^ (iD + iD));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int iA2 = 0;
        for (int i4 = 0; i4 < pmgVar.c; i4++) {
            int iD2 = pmgVar.d(i4);
            iA2 += gmg.a((iD2 >> 31) ^ (iD2 + iD2));
        }
        gmgVar.r(iA2);
        while (i2 < pmgVar.c) {
            int iD3 = pmgVar.d(i2);
            gmgVar.r((iD3 >> 31) ^ (iD3 + iD3));
            i2++;
        }
    }

    public static void n(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof pmg)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            gmgVar.r(i3);
            while (i2 < list.size()) {
                gmgVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pmg pmgVar = (pmg) list;
        if (!z) {
            while (i2 < pmgVar.c) {
                gmgVar.g(i, pmgVar.d(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pmgVar.c; i6++) {
            pmgVar.d(i6);
            i5 += 4;
        }
        gmgVar.r(i5);
        while (i2 < pmgVar.c) {
            gmgVar.s(pmgVar.d(i2));
            i2++;
        }
    }

    public static void o(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof pmg)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            gmgVar.r(i3);
            while (i2 < list.size()) {
                gmgVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pmg pmgVar = (pmg) list;
        if (!z) {
            while (i2 < pmgVar.c) {
                gmgVar.g(i, pmgVar.d(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pmgVar.c; i6++) {
            pmgVar.d(i6);
            i5 += 4;
        }
        gmgVar.r(i5);
        while (i2 < pmgVar.c) {
            gmgVar.s(pmgVar.d(i2));
            i2++;
        }
    }

    public static void p(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!(list instanceof pmg)) {
            if (!z) {
                while (i2 < list.size()) {
                    gmgVar.e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            gmgVar.d(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += gmg.b(((Integer) list.get(i3)).intValue());
            }
            gmgVar.r(iB);
            while (i2 < list.size()) {
                gmgVar.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        pmg pmgVar = (pmg) list;
        if (!z) {
            while (i2 < pmgVar.c) {
                gmgVar.e(i, pmgVar.d(i2));
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < pmgVar.c; i4++) {
            iB2 += gmg.b(pmgVar.d(i4));
        }
        gmgVar.r(iB2);
        while (i2 < pmgVar.c) {
            gmgVar.q(pmgVar.d(i2));
            i2++;
        }
    }

    public static void q(int i, List list, g5b g5bVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gmg gmgVar = (gmg) g5bVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                gmgVar.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        gmgVar.d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        gmgVar.r(i3);
        while (i2 < list.size()) {
            gmgVar.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fng)) {
            int iB = 0;
            while (i < size) {
                iB += gmg.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        fng fngVar = (fng) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += gmg.b(fngVar.c(i));
            i++;
        }
        return iB2;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fng)) {
            int iB = 0;
            while (i < size) {
                iB += gmg.b(((Long) list.get(i)).longValue());
                i++;
            }
            return iB;
        }
        fng fngVar = (fng) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += gmg.b(fngVar.c(i));
            i++;
        }
        return iB2;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fng)) {
            int iB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iB += gmg.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iB;
        }
        fng fngVar = (fng) list;
        int iB2 = 0;
        while (i < size) {
            long jC = fngVar.c(i);
            iB2 += gmg.b((jC >> 63) ^ (jC + jC));
            i++;
        }
        return iB2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pmg)) {
            int iB = 0;
            while (i < size) {
                iB += gmg.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        pmg pmgVar = (pmg) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += gmg.b(pmgVar.d(i));
            i++;
        }
        return iB2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pmg)) {
            int iB = 0;
            while (i < size) {
                iB += gmg.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        pmg pmgVar = (pmg) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += gmg.b(pmgVar.d(i));
            i++;
        }
        return iB2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pmg)) {
            int iA = 0;
            while (i < size) {
                iA += gmg.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iA;
        }
        pmg pmgVar = (pmg) list;
        int iA2 = 0;
        while (i < size) {
            iA2 += gmg.a(pmgVar.d(i));
            i++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pmg)) {
            int iA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iA += gmg.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iA;
        }
        pmg pmgVar = (pmg) list;
        int iA2 = 0;
        while (i < size) {
            int iD = pmgVar.d(i);
            iA2 += gmg.a((iD >> 31) ^ (iD + iD));
            i++;
        }
        return iA2;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (gmg.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (gmg.a(i << 3) + 8) * size;
    }
}
