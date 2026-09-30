package io.sentry.cache.tape;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterator {
    public final h a;
    public final /* synthetic */ d b;

    public c(d dVar, h hVar) {
        this.b = dVar;
        this.a = hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.c.b((byte[]) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() throws IOException {
        this.a.remove();
    }
}
