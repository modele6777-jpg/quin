package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n4f extends p2 {
    public int c;
    public Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public n4f(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        Object[] objArr2 = new Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    public final Object b() {
        int i = this.a & 31;
        Object obj = this.d[this.c - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void c(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            Object[] objArr = this.d;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[a6c.j(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void d(int i) {
        int i2 = 0;
        while (a6c.j(this.a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            c(this.a, ((this.c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        Object objB = b();
        int i = this.a + 1;
        this.a = i;
        if (i == this.b) {
            this.e = true;
            return objB;
        }
        d(0);
        return objB;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            s8f.c();
            return null;
        }
        this.a--;
        if (this.e) {
            this.e = false;
            return b();
        }
        d(31);
        return b();
    }
}
