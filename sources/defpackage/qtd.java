package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qtd implements Iterator, zm7 {
    public final lpd a;
    public final int b;
    public final t4c c;
    public final int d;
    public int e;

    public qtd(lpd lpdVar, int i, n46 n46Var, t4c t4cVar) {
        this.a = lpdVar;
        this.b = i;
        this.c = t4cVar;
        this.d = lpdVar.v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
