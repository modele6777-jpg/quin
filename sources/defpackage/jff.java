package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jff extends AbstractList implements RandomAccess, w18 {
    public final t18 a;

    public jff(t18 t18Var) {
        this.a = t18Var;
    }

    @Override // defpackage.w18
    public final z61 g0(int i) {
        return this.a.g0(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // defpackage.w18
    public final List h() {
        return Collections.unmodifiableList(this.a.a);
    }

    @Override // defpackage.w18
    public final void h0(m98 m98Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        iff iffVar = new iff(0);
        iffVar.b = this.a.iterator();
        return iffVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        hff hffVar = new hff(0);
        hffVar.b = this.a.listIterator(i);
        return hffVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.w18
    public final jff l() {
        return this;
    }
}
