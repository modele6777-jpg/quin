package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z79 implements Iterator, zm7 {
    public int a = -1;
    public final dyc b;
    public final /* synthetic */ a89 c;

    public z79(a89 a89Var) {
        this.c = a89Var;
        this.b = dec.i(new y79(a89Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        if (i != -1) {
            this.c.b.n(i);
            this.a = -1;
        }
    }
}
