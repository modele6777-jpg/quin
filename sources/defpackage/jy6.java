package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jy6 extends ay6 implements List, RandomAccess {
    public static final ey6 b = new ey6(yob.e, 0);
    private static final long serialVersionUID = -889275714;

    public static yob k(int i, Object[] objArr) {
        return i == 0 ? yob.e : new yob(i, objArr);
    }

    public static dy6 m() {
        return new dy6(4);
    }

    public static dy6 n(int i) {
        ynb.D(i, "expectedSize");
        return new dy6(i);
    }

    public static jy6 o(Collection collection) {
        if (!(collection instanceof ay6)) {
            Object[] array = collection.toArray();
            nk8.n(array.length, array);
            return k(array.length, array);
        }
        jy6 jy6VarA = ((ay6) collection).a();
        if (!jy6VarA.i()) {
            return jy6VarA;
        }
        Object[] array2 = jy6VarA.toArray(ay6.a);
        return k(array2.length, array2);
    }

    public static yob p(Object[] objArr) {
        if (objArr.length == 0) {
            return yob.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        nk8.n(objArr2.length, objArr2);
        return k(objArr2.length, objArr2);
    }

    public static yob r(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        nk8.n(5, objArr);
        return k(5, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static yob s(Object obj) {
        Object[] objArr = {obj};
        nk8.n(1, objArr);
        return k(1, objArr);
    }

    public static yob t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        nk8.n(2, objArr);
        return k(2, objArr);
    }

    public static yob v(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        pa7.z("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        nk8.n(length, objArr2);
        return k(length, objArr2);
    }

    public static yob x(is9 is9Var, List list) {
        is9Var.getClass();
        if (list == null) {
            list = tq.H(list.iterator());
        }
        Object[] array = list.toArray();
        nk8.n(array.length, array);
        Arrays.sort(array, is9Var);
        return k(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ay6
    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && ok8.t(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (ok8.t(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.ay6
    /* JADX INFO: renamed from: j */
    public final gff iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final ey6 listIterator(int i) {
        pa7.G(i, size());
        return isEmpty() ? b : new ey6(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public jy6 w() {
        return size() <= 1 ? this : new fy6(this);
    }

    @Override // defpackage.ay6
    public Object writeReplace() {
        return new gy6(toArray(ay6.a));
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public jy6 subList(int i, int i2) {
        pa7.H(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? yob.e : new hy6(this, i, i3);
    }

    @Override // defpackage.ay6
    public final jy6 a() {
        return this;
    }
}
