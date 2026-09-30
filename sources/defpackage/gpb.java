package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gpb extends vy6 {
    public static final gpb v;
    public final transient jy6 g;

    static {
        ey6 ey6Var = jy6.b;
        v = new gpb(yob.e, ba9.a);
    }

    public gpb(jy6 jy6Var, Comparator comparator) {
        super(comparator);
        this.g = jy6Var;
    }

    @Override // defpackage.ry6, defpackage.ay6
    public final jy6 a() {
        return this.g;
    }

    @Override // defpackage.ay6
    public final int c(int i, Object[] objArr) {
        return this.g.c(i, objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iW = w(obj, true);
        jy6 jy6Var = this.g;
        if (iW == jy6Var.size()) {
            return null;
        }
        return jy6Var.get(iW);
    }

    @Override // defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.g, obj, this.d) >= 0) {
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
        if (collection instanceof oy6) {
            collection = ((epb) ((oy6) collection)).k();
        }
        Comparator comparator = this.d;
        if (!v2c.u(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        gff it = iterator();
        Iterator it2 = collection.iterator();
        ey6 ey6Var = (ey6) it;
        if (!ey6Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = ey6Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!ey6Var.hasNext()) {
                        return false;
                    }
                    next2 = ey6Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.ay6
    public final Object[] d() {
        return this.g.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.g.w().listIterator(0);
    }

    @Override // defpackage.ay6
    public final int e() {
        return this.g.e();
    }

    @Override // defpackage.ry6, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (!v2c.u(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            gff it2 = iterator();
            do {
                ey6 ey6Var = (ey6) it2;
                if (!ey6Var.hasNext()) {
                    return true;
                }
                next = ey6Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.g.get(0);
        }
        s8f.c();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iV = v(obj, true) - 1;
        if (iV == -1) {
            return null;
        }
        return this.g.get(iV);
    }

    @Override // defpackage.ay6
    public final int g() {
        return this.g.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iW = w(obj, false);
        jy6 jy6Var = this.g;
        if (iW == jy6Var.size()) {
            return null;
        }
        return jy6Var.get(iW);
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return this.g.i();
    }

    @Override // defpackage.ay6
    /* JADX INFO: renamed from: j */
    public final gff iterator() {
        return this.g.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            s8f.c();
            return null;
        }
        jy6 jy6Var = this.g;
        return jy6Var.get(jy6Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iV = v(obj, false) - 1;
        if (iV == -1) {
            return null;
        }
        return this.g.get(iV);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.size();
    }

    public final gpb t(int i, int i2) {
        jy6 jy6Var = this.g;
        if (i == 0 && i2 == jy6Var.size()) {
            return this;
        }
        Comparator comparator = this.d;
        return i < i2 ? new gpb(jy6Var.subList(i, i2), comparator) : vy6.r(comparator);
    }

    public final int v(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g, obj, this.d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int w(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g, obj, this.d);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // defpackage.vy6, defpackage.ry6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }
}
