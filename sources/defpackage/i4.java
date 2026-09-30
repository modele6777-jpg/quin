package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i4 extends o2 {
    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.d1, java.util.Collection
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

    public abstract i4 d(int i, Object obj);

    public abstract i4 e(Object obj);

    public i4 g(Collection collection) {
        caa caaVarI = i();
        caaVarI.addAll(collection);
        return caaVarI.e();
    }

    public abstract caa i();

    @Override // defpackage.o2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract i4 j(h4 h4Var);

    public abstract i4 k(int i);

    @Override // defpackage.o2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract i4 m(int i, Object obj);

    @Override // defpackage.o2, java.util.List
    public final List subList(int i, int i2) {
        return new iy6(this, i, i2);
    }
}
