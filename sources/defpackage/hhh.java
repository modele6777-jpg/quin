package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hhh implements Iterator {
    public final ngh a;
    public int b;
    public int c;
    public final /* synthetic */ ihh d;

    public /* synthetic */ hhh(ihh ihhVar, ngh nghVar, int i) {
        this.d = ihhVar;
        this.a = nghVar;
        int i2 = i & 31;
        this.b = i2;
        this.c = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        ihh ihhVar = this.d;
        mxb mxbVar = ihhVar.b;
        int iM = mxbVar.m();
        Object objCast = this.a.b.cast(i >= iM ? ihhVar.c.q(i - iM) : mxbVar.q(i));
        int i2 = this.c;
        if (i2 == 0) {
            this.b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.c >>>= iNumberOfTrailingZeros;
        this.b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
