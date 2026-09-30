package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j6e implements List, an7 {
    public final jsd a;
    public final int b;
    public int c;
    public int d;

    public j6e(jsd jsdVar, int i, int i2) {
        this.a = jsdVar;
        this.b = i;
        this.c = z5c.A(jsdVar);
        this.d = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c();
        int i = this.b + this.d;
        jsd jsdVar = this.a;
        jsdVar.add(i, obj);
        this.d++;
        this.c = z5c.A(jsdVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        int i2 = i + this.b;
        jsd jsdVar = this.a;
        boolean zAddAll = jsdVar.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = z5c.A(jsdVar);
        }
        return zAddAll;
    }

    public final void c() {
        if (z5c.A(this.a) == this.c) {
            return;
        }
        qc0.e();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            c();
            int i = this.d;
            int i2 = this.b;
            jsd jsdVar = this.a;
            jsdVar.e(i2, i + i2);
            this.d = 0;
            this.c = z5c.A(jsdVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        z5c.M(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i = this.d;
        int i2 = this.b;
        Iterator it = mh3.c0(i2, i + i2).iterator();
        while (((y67) it).c) {
            int iNextInt = ((q67) it).nextInt();
            if (pa7.t(obj, this.a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (pa7.t(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        kmb kmbVar = new kmb();
        kmbVar.element = i - 1;
        return new m0c(kmbVar, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        int i2 = this.b + i;
        jsd jsdVar = this.a;
        Object objRemove = jsdVar.remove(i2);
        this.d--;
        this.c = z5c.A(jsdVar);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        c();
        jsd jsdVar = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = jsdVar.size();
        do {
            synchronized (z5c.h) {
                y0e y0eVar = jsdVar.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            caa caaVarI = i4Var.i();
            caaVarI.subList(i2, i3).retainAll(collection);
            i4 i4VarE = caaVarI.e();
            if (pa7.t(i4VarE, i4Var)) {
                break;
            }
            y0e y0eVar3 = jsdVar.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, jsdVar, irdVarH), i, i4VarE, true);
            }
            qrd.l(irdVarH, jsdVar);
        } while (!zJ);
        int size2 = size - jsdVar.size();
        if (size2 > 0) {
            this.c = z5c.A(this.a);
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        z5c.M(i, this.d);
        c();
        int i2 = i + this.b;
        jsd jsdVar = this.a;
        Object obj2 = jsdVar.set(i2, obj);
        this.c = z5c.A(jsdVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            epa.a("fromIndex or toIndex are out of bounds");
        }
        c();
        int i3 = this.b;
        return new j6e(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return bzd.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bzd.K(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        int i2 = this.b + i;
        jsd jsdVar = this.a;
        jsdVar.add(i2, obj);
        this.d++;
        this.c = z5c.A(jsdVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
