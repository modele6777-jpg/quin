package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
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
public final class b78 extends n3 implements RandomAccess, Serializable {
    private Object[] backing;
    private int length;
    private final int offset;
    private final b78 parent;
    private final c78 root;

    public b78(Object[] objArr, int i, int i2, b78 b78Var, c78 c78Var) {
        objArr.getClass();
        c78Var.getClass();
        this.backing = objArr;
        this.offset = i;
        this.length = i2;
        this.parent = b78Var;
        this.root = c78Var;
        ((AbstractList) this).modCount = ((AbstractList) c78Var).modCount;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.root.isReadOnly) {
            return new azc(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        p();
        o();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
        } else {
            n(this.offset + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        p();
        o();
        int i2 = this.length;
        if (i < 0 || i > i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        m(this.offset + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.n3
    public final int c() {
        o();
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        p();
        o();
        r(this.offset, this.length);
    }

    @Override // defpackage.n3
    public final Object d(int i) {
        p();
        o();
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return q(this.offset + i);
        }
        r3.i(ks0.k("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        o();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.backing;
            int i = this.offset;
            int i2 = this.length;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (pa7.t(objArr[i + i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        o();
        int i2 = this.length;
        if (i >= 0 && i < i2) {
            return this.backing[this.offset + i];
        }
        r3.i(ks0.k("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        o();
        Object[] objArr = this.backing;
        int i = this.offset;
        int i2 = this.length;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        o();
        for (int i = 0; i < this.length; i++) {
            if (pa7.t(this.backing[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        o();
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        o();
        for (int i = this.length - 1; i >= 0; i--) {
            if (pa7.t(this.backing[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        o();
        int i2 = this.length;
        if (i >= 0 && i <= i2) {
            return new ql6(this, i);
        }
        r3.i(ks0.k("index: ", i, ", size: ", i2));
        return null;
    }

    public final void m(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        b78 b78Var = this.parent;
        if (b78Var != null) {
            b78Var.m(i, collection, i2);
        } else {
            c78 c78Var = this.root;
            c78 c78Var2 = c78.a;
            c78Var.k(i, collection, i2);
        }
        this.backing = this.root.backing;
        this.length += i2;
    }

    public final void n(int i, Object obj) {
        ((AbstractList) this).modCount++;
        b78 b78Var = this.parent;
        if (b78Var != null) {
            b78Var.n(i, obj);
        } else {
            c78 c78Var = this.root;
            c78 c78Var2 = c78.a;
            c78Var.m(i, obj);
        }
        this.backing = this.root.backing;
        this.length++;
    }

    public final void o() {
        if (((AbstractList) this.root).modCount == ((AbstractList) this).modCount) {
            return;
        }
        qc0.e();
    }

    public final void p() {
        if (this.root.isReadOnly) {
            cva.f();
        }
    }

    public final Object q(int i) {
        Object objQ;
        ((AbstractList) this).modCount++;
        b78 b78Var = this.parent;
        if (b78Var != null) {
            objQ = b78Var.q(i);
        } else {
            c78 c78Var = this.root;
            c78 c78Var2 = c78.a;
            objQ = c78Var.q(i);
        }
        this.length--;
        return objQ;
    }

    public final void r(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        b78 b78Var = this.parent;
        if (b78Var != null) {
            b78Var.r(i, i2);
        } else {
            c78 c78Var = this.root;
            c78 c78Var2 = c78.a;
            c78Var.r(i, i2);
        }
        this.length -= i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        p();
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
        p();
        o();
        return s(this.offset, this.length, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        p();
        o();
        return s(this.offset, this.length, collection, true) > 0;
    }

    public final int s(int i, int i2, Collection collection, boolean z) {
        int iS;
        b78 b78Var = this.parent;
        if (b78Var != null) {
            iS = b78Var.s(i, i2, collection, z);
        } else {
            c78 c78Var = this.root;
            c78 c78Var2 = c78.a;
            iS = c78Var.s(i, i2, collection, z);
        }
        if (iS > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= iS;
        return iS;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        p();
        o();
        int i2 = this.length;
        if (i < 0 || i >= i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.backing;
        int i3 = this.offset;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        y7h.p(i, i2, this.length);
        return new b78(this.backing, this.offset + i, i2 - i, this, this.root);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        o();
        int length = objArr.length;
        int i = this.length;
        Object[] objArr2 = this.backing;
        int i2 = this.offset;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        qd0.Z(0, i2, i + i2, objArr2, objArr);
        int i3 = this.length;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        o();
        return hkg.P0(this.backing, this.offset, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        p();
        o();
        n(this.offset + this.length, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        o();
        Object[] objArr = this.backing;
        int i = this.offset;
        return qd0.f0(objArr, i, this.length + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        p();
        o();
        int size = collection.size();
        m(this.offset + this.length, collection, size);
        return size > 0;
    }
}
