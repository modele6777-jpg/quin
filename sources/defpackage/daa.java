package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class daa extends p2 {
    public final Object[] c;
    public final n4f d;

    public daa(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new n4f(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        n4f n4fVar = this.d;
        if (n4fVar.hasNext()) {
            this.a++;
            return n4fVar.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i - n4fVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            s8f.c();
            return null;
        }
        int i = this.a;
        n4f n4fVar = this.d;
        int i2 = n4fVar.b;
        if (i <= i2) {
            this.a = i - 1;
            return n4fVar.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.c[i3 - i2];
    }
}
