package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jvg extends dug {
    public static final jvg w;
    public final transient qtg v;

    static {
        wsg wsgVar = qtg.d;
        w = new jvg(wug.g, qug.b);
    }

    public jvg(qtg qtgVar, Comparator comparator) {
        super(comparator);
        this.v = qtgVar;
    }

    @Override // defpackage.olg
    public final int a(Object[] objArr) {
        return this.v.a(objArr);
    }

    @Override // defpackage.olg
    public final int c() {
        return this.v.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iS = s(obj, true);
        qtg qtgVar = this.v;
        if (iS == qtgVar.size()) {
            return null;
        }
        return qtgVar.get(iS);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.v, obj, this.f) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof oug) {
            collection = ((oug) collection).b();
        }
        Comparator comparator = this.f;
        if (!o8c.s(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        wsg wsgVarListIterator = this.v.listIterator(0);
        Iterator it = collection.iterator();
        if (wsgVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = wsgVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!wsgVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = wsgVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.v.m().listIterator(0);
    }

    @Override // defpackage.olg
    public final int e() {
        return this.v.e();
    }

    @Override // defpackage.vtg, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            qtg qtgVar = this.v;
            if (qtgVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f;
                if (!o8c.s(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    wsg wsgVarListIterator = qtgVar.listIterator(0);
                    while (wsgVarListIterator.hasNext()) {
                        Object next = wsgVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.dug, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.v.get(0);
        }
        s8f.c();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iR = r(obj, true) - 1;
        if (iR == -1) {
            return null;
        }
        return this.v.get(iR);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iS = s(obj, false);
        qtg qtgVar = this.v;
        if (iS == qtgVar.size()) {
            return null;
        }
        return qtgVar.get(iS);
    }

    @Override // defpackage.olg
    public final gff i() {
        return this.v.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.v.listIterator(0);
    }

    @Override // defpackage.olg
    public final Object[] j() {
        return this.v.j();
    }

    @Override // defpackage.dug, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            s8f.c();
            return null;
        }
        qtg qtgVar = this.v;
        return qtgVar.get(qtgVar.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iR = r(obj, false) - 1;
        if (iR == -1) {
            return null;
        }
        return this.v.get(iR);
    }

    @Override // defpackage.vtg
    public final qtg m() {
        return this.v;
    }

    public final int r(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.v, obj, this.f);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int s(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.v, obj, this.f);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v.size();
    }

    public final jvg t(int i, int i2) {
        qtg qtgVar = this.v;
        if (i == 0) {
            if (i2 == qtgVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.f;
        return i < i2 ? new jvg(qtgVar.subList(i, i2), comparator) : dug.q(comparator);
    }
}
