package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class s72 extends x72 {
    public static LinkedHashSet A0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionH0 = x72.h0(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionH0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static final void B0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, a26 a26Var) throws IOException {
        iterable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                sfc.e(appendable, obj, a26Var);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void C0(Iterable iterable, Appendable appendable, String str, String str2, String str3, a26 a26Var, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            a26Var = null;
        }
        B0(iterable, appendable, str4, str5, str6, -1, "...", a26Var);
    }

    public static String D0(Iterable iterable, CharSequence charSequence, String str, String str2, a26 a26Var, int i) throws IOException {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        int i2 = (i & 8) != 0 ? -1 : 5;
        if ((i & 32) != 0) {
            a26Var = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        B0(iterable, sb, charSequence2, str3, str4, i2, "...", a26Var);
        return sb.toString();
    }

    public static Object E0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return F0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            r3.n("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object F0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        r3.n("List is empty.");
        return null;
    }

    public static Object G0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object H0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable I0(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float J0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable K0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float L0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList M0(Object obj, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && pa7.t(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List N0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Collection collectionH0 = x72.h0(iterable2);
        if (collectionH0.isEmpty()) {
            return j1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionH0.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList O0(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return Q0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        x72.g0(arrayList, iterable);
        x72.g0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList P0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return R0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        x72.g0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList Q0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            x72.g0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList R0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object S0(Collection collection) {
        lbb lbbVar = mbb.a;
        collection.getClass();
        if (collection.isEmpty()) {
            r3.n("Collection is empty.");
            return null;
        }
        Collection collection2 = collection;
        int i = mbb.b.i(collection.size());
        boolean z = collection2 instanceof List;
        if (z) {
            return ((List) collection2).get(i);
        }
        xp xpVar = new xp(i, 2);
        if (z) {
            List list = (List) collection2;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            xpVar.d(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            xpVar.d(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection2) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        xpVar.d(Integer.valueOf(i));
        throw null;
    }

    public static final int T0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbN = ub3.n(i, "Element index ", " must be in range [");
        sbN.append(new z67(0, list.size() - 1, 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public static final int U0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbN = ub3.n(i, "Position index ", " must be in range [");
        sbN.append(new z67(0, list.size(), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public static List V0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return j1(iterable);
        }
        List listM1 = m1(iterable);
        Collections.reverse(listM1);
        return listM1;
    }

    public static Object W0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return X0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            r3.n("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        qc0.j("Collection has more than one element.");
        return null;
    }

    public static Object X0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            r3.n("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        qc0.j("List has more than one element.");
        return null;
    }

    public static Object Y0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object Z0(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List a1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM1 = m1(iterable);
            w72.e0(listM1);
            return listM1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return j1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return qd0.R(array);
    }

    public static List b1(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (!(iterable instanceof Collection)) {
            List listM1 = m1(iterable);
            w72.f0(listM1, comparator);
            return listM1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return j1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        qd0.z0(comparator, array);
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List c1(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            qc0.o(tec.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return pu4.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return j1(iterable);
            }
            if (i == 1) {
                return t72.H(u0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return t72.M(arrayList);
    }

    public static List d1(int i, List list) {
        list.getClass();
        if (i < 0) {
            qc0.o(tec.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return pu4.a;
        }
        int size = list.size();
        if (i >= size) {
            return j1(list);
        }
        if (i == 1) {
            return t72.H(F0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] e1(List list) {
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final void f1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] g1(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static HashSet h1(List list) {
        list.getClass();
        HashSet hashSet = new HashSet(bm8.F(t72.u(list, 12)));
        f1(list, hashSet);
        return hashSet;
    }

    public static int[] i1(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List j1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return t72.M(m1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return pu4.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return t72.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] k1(List list) {
        list.getClass();
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList l1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static td0 m0(Iterable iterable) {
        iterable.getClass();
        return new td0(1, iterable);
    }

    public static final List m1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        f1(iterable, arrayList);
        return arrayList;
    }

    public static ArrayList n0(Iterable iterable, int i) {
        iterable.getClass();
        return p1(iterable, i, i, true);
    }

    public static Set n1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean o0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return z0(iterable, obj) >= 0;
    }

    public static Set o1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return n3d.p(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(bm8.F(collection.size()));
                f1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            f1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : n3d.p(linkedHashSet2.iterator().next());
            }
        }
        return xu4.a;
    }

    public static int p0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                t72.Y();
                throw null;
            }
        }
        return i;
    }

    public static final ArrayList p1(Iterable iterable, int i, int i2, boolean z) {
        iterable.getClass();
        if (i <= 0 || i2 <= 0) {
            qc0.o(i != i2 ? kv2.h(i, i2, "Both size ", " and step ", " must be greater than zero.") : tec.f(i, "size ", " must be greater than zero."));
            return null;
        }
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            Iterator itI = !it.hasNext() ? ou4.a : dec.i(new jpd(i, i2, it, false, z, null));
            while (itI.hasNext()) {
                arrayList.add((List) itI.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            if (i4 < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static List q0(Iterable iterable) {
        iterable.getClass();
        return j1(n1(iterable));
    }

    public static sd0 q1(Iterable iterable) {
        iterable.getClass();
        return new sd0(1, new p(24, iterable));
    }

    public static List r0(Iterable iterable, int i) {
        ArrayList arrayList;
        iterable.getClass();
        if (i < 0) {
            qc0.o(tec.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return j1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return pu4.a;
            }
            if (size == 1) {
                return t72.H(E0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return t72.M(arrayList);
    }

    public static ArrayList r1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t72.u(iterable, 10), t72.u(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new iy9(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List s0(int i, List list) {
        list.getClass();
        if (i < 0) {
            qc0.o(tec.f(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return c1(list, size);
    }

    public static ArrayList t0(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object u0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return v0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        r3.n("Collection is empty.");
        return null;
    }

    public static Object v0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        r3.n("List is empty.");
        return null;
    }

    public static Object w0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object x0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object y0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int z0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                t72.Z();
                throw null;
            }
            if (pa7.t(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
