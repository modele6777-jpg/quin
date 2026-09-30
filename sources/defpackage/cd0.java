package defpackage;

import com.google.gson.JsonArray;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cd0 implements List {
    public final List a;

    public cd0(Object obj) {
        if (obj instanceof List) {
            this.a = (List) ((List) obj).stream().map(new fj0(5)).collect(Collectors.toList());
            return;
        }
        if (obj != null && obj.getClass().isArray()) {
            this.a = new ArrayList();
            for (int i = 0; i < Array.getLength(obj); i++) {
                this.a.add(i, kb6.r(Array.get(obj, i)));
            }
            return;
        }
        if (obj instanceof JsonArray) {
            this.a = (List) g21.L((JsonArray) obj);
            return;
        }
        if (!(obj instanceof Iterable)) {
            qc0.j("ArrayLike only works with lists, iterables, arrays, or JsonArray");
            throw null;
        }
        this.a = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            this.a.add(kb6.r(it.next()));
        }
    }

    public static boolean a(Object obj) {
        if (obj != null) {
            return (obj instanceof Iterable) || obj.getClass().isArray();
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            int i = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                List list = this.a;
                if (!zHasNext) {
                    list.size();
                    break;
                }
                Object next = it.next();
                if (i >= list.size() || !Objects.equals(next, list.get(i))) {
                    return false;
                }
                i++;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.a.toArray();
    }

    public final String toString() {
        return Arrays.toString(this.a.toArray());
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("ArrayLike is immutable");
    }
}
