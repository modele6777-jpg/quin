package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kff extends AbstractList implements v18, RandomAccess {
    public final u18 a;

    public kff(u18 u18Var) {
        this.a = u18Var;
    }

    @Override // defpackage.v18
    public final void W(y61 y61Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // defpackage.v18
    public final List h() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        iff iffVar = new iff(1);
        iffVar.b = this.a.iterator();
        return iffVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        hff hffVar = new hff(1);
        hffVar.b = this.a.listIterator(i);
        return hffVar;
    }

    @Override // defpackage.v18
    public final Object p0(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // defpackage.v18
    public final v18 l() {
        return this;
    }
}
