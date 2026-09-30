package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bqd implements Iterator {
    public boolean a;
    public final int b;
    public final /* synthetic */ cqd c;

    public bqd(cqd cqdVar) {
        this.c = cqdVar;
        this.b = ((AbstractList) cqdVar).modCount;
    }

    public final void a() {
        cqd cqdVar = this.c;
        int i = ((AbstractList) cqdVar).modCount;
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) cqdVar).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            s8f.c();
            return null;
        }
        this.a = true;
        a();
        return this.c.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.c.clear();
    }
}
