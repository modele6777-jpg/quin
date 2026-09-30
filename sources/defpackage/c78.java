package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c78 extends n3 implements RandomAccess, Serializable {
    public static final c78 a;
    private Object[] backing;
    private boolean isReadOnly;
    private int length;

    static {
        c78 c78Var = new c78(0);
        c78Var.isReadOnly = true;
        a = c78Var;
    }

    public c78(int i) {
        if (i >= 0) {
            this.backing = new Object[i];
        } else {
            qc0.j("capacity must be non-negative.");
            throw null;
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new azc(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        o();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
        } else {
            m(i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        o();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        k(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.n3
    public final int c() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        o();
        r(0, this.length);
    }

    @Override // defpackage.n3
    public final Object d(int i) {
        o();
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return q(i);
        }
        r3.i(ks0.k("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.backing;
            int i = this.length;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (pa7.t(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return this.backing[i];
        }
        r3.i(ks0.k("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.backing;
        int i = this.length;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (pa7.t(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        p(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (pa7.t(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.length;
        if (i >= 0 && i <= i2) {
            return new ql6(this, i);
        }
        r3.i(ks0.k("index: ", i, ", size: ", i2));
        return null;
    }

    public final void m(int i, Object obj) {
        ((AbstractList) this).modCount++;
        p(i, 1);
        this.backing[i] = obj;
    }

    public final c78 n() {
        o();
        this.isReadOnly = true;
        return this.length > 0 ? this : a;
    }

    public final void o() {
        if (this.isReadOnly) {
            cva.f();
        }
    }

    public final void p(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.backing;
        if (i3 > objArrCopyOf.length) {
            int length = objArrCopyOf.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            this.backing = objArrCopyOf;
        }
        qd0.Z(i + i2, i, this.length, objArrCopyOf, objArrCopyOf);
        this.length += i2;
    }

    public final Object q(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.backing;
        Object obj = objArr[i];
        qd0.Z(i, i + 1, this.length, objArr, objArr);
        Object[] objArr2 = this.backing;
        int i2 = this.length - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.length--;
        return obj;
    }

    public final void r(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.backing;
        qd0.Z(i, i + i2, this.length, objArr, objArr);
        Object[] objArr2 = this.backing;
        int i3 = this.length;
        hkg.K0(objArr2, i3 - i2, i3);
        this.length -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        o();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        o();
        return s(0, this.length, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        o();
        return s(0, this.length, collection, true) > 0;
    }

    public final int s(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.backing;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.backing;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        qd0.Z(i + i4, i2 + i, this.length, objArr, objArr);
        Object[] objArr3 = this.backing;
        int i7 = this.length;
        hkg.K0(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        o();
        int i2 = this.length;
        if (i < 0 || i >= i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.backing;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        y7h.p(i, i2, this.length);
        return new b78(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.length;
        Object[] objArr2 = this.backing;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        qd0.Z(0, 0, i, objArr2, objArr);
        int i2 = this.length;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return hkg.P0(this.backing, 0, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        o();
        m(this.length, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return qd0.f0(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        o();
        int size = collection.size();
        k(this.length, collection, size);
        return size > 0;
    }
}
