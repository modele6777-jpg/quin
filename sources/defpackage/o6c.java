package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o6c implements Iterator {
    public final eg9 a;
    public p61 b;
    public int c;

    public o6c(p6c p6cVar) {
        eg9 eg9Var = new eg9(p6cVar);
        this.a = eg9Var;
        this.b = new p61(eg9Var.a());
        this.c = p6cVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = new p61(this.a.a());
        }
        this.c--;
        return Byte.valueOf(this.b.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
