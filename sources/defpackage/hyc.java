package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hyc implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c = true;

    public /* synthetic */ hyc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (this.c) {
                    this.c = false;
                    return obj;
                }
                s8f.c();
                return null;
            case 1:
                if (this.c) {
                    this.c = false;
                    return obj;
                }
                s8f.c();
                return null;
            default:
                if (this.c) {
                    this.c = false;
                    return ((yp9) obj).a;
                }
                s8f.c();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
