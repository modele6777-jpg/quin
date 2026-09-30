package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ff6 implements Iterator, zm7 {
    public final lpd a;
    public final int b;
    public int c;
    public final int d;

    public ff6(lpd lpdVar, int i, int i2) {
        this.a = lpdVar;
        this.b = i2;
        this.c = i;
        this.d = lpdVar.v;
        if (lpdVar.g) {
            npd.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        lpd lpdVar = this.a;
        int i = lpdVar.v;
        int i2 = this.d;
        if (i != i2) {
            npd.e();
        }
        int i3 = this.c;
        this.c = lpdVar.a[(i3 * 5) + 3] + i3;
        return new mpd(lpdVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
