package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h98 implements ListIterator {
    public boolean a;
    public final /* synthetic */ ListIterator b;
    public final /* synthetic */ i98 c;

    public h98(i98 i98Var, ListIterator listIterator) {
        this.b = listIterator;
        this.c = i98Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
        this.a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.b;
        if (listIterator.hasPrevious()) {
            this.a = true;
            return listIterator.previous();
        }
        s8f.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.b;
        if (listIterator.hasNext()) {
            this.a = true;
            return listIterator.next();
        }
        s8f.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        pa7.I("no calls to next() since the last call to remove()", this.a);
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        pa7.J(this.a);
        this.b.set(obj);
    }
}
