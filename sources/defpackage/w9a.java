package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w9a implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public final x9a b;

    public w9a(r9a r9aVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new x9a(r9aVar.a, r9aVar.c, 0);
                break;
            case 2:
                this.b = new x9a(r9aVar.a, r9aVar.c, 0);
                break;
            default:
                this.b = new x9a(r9aVar.a, r9aVar.c, 0);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        x9a x9aVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return x9aVar.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        x9a x9aVar = this.b;
        switch (i) {
            case 0:
                return new kl8(1, x9aVar.b, x9aVar.b().a);
            case 1:
                Object obj = x9aVar.b;
                x9aVar.b();
                return obj;
            default:
                return x9aVar.b().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
