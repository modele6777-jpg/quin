package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q4f implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public Object[] b;
    public int c;
    public int d;

    public q4f(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = p4f.e.d;
                break;
            default:
                this.b = o4f.e.d;
                break;
        }
    }

    public void b(Object[] objArr, int i, int i2) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.d < this.c;
            default:
                return this.d < this.c;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
