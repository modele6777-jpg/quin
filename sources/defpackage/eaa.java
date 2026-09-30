package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eaa extends p2 {
    public final caa c;
    public int d;
    public n4f e;
    public int f;

    public eaa(caa caaVar, int i) {
        super(i, caaVar.v);
        this.c = caaVar;
        this.d = caaVar.i();
        this.f = -1;
        c();
    }

    @Override // defpackage.p2, java.util.ListIterator
    public final void add(Object obj) {
        b();
        int i = this.a;
        caa caaVar = this.c;
        caaVar.add(i, obj);
        this.a++;
        this.b = caaVar.c();
        this.d = caaVar.i();
        this.f = -1;
        c();
    }

    public final void b() {
        if (this.d == this.c.i()) {
            return;
        }
        qc0.e();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void c() {
        caa caaVar = this.c;
        Object[] objArr = caaVar.f;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (caaVar.v - 1) & (-32);
        int i2 = this.a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (caaVar.d / 5) + 1;
        n4f n4fVar = this.e;
        if (n4fVar == null) {
            this.e = new n4f(objArr, i2, i, i3);
            return;
        }
        n4fVar.a = i2;
        n4fVar.b = i;
        n4fVar.c = i3;
        Object[] objArr2 = n4fVar.d;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            n4fVar.d = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        n4fVar.e = r0;
        n4fVar.c(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        int i = this.a;
        this.f = i;
        n4f n4fVar = this.e;
        caa caaVar = this.c;
        if (n4fVar == null) {
            Object[] objArr = caaVar.g;
            this.a = i + 1;
            return objArr[i];
        }
        if (n4fVar.hasNext()) {
            this.a++;
            return n4fVar.next();
        }
        Object[] objArr2 = caaVar.g;
        int i2 = this.a;
        this.a = i2 + 1;
        return objArr2[i2 - n4fVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        if (!hasPrevious()) {
            s8f.c();
            return null;
        }
        int i = this.a;
        this.f = i - 1;
        n4f n4fVar = this.e;
        caa caaVar = this.c;
        if (n4fVar == null) {
            Object[] objArr = caaVar.g;
            int i2 = i - 1;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = n4fVar.b;
        if (i <= i3) {
            this.a = i - 1;
            return n4fVar.previous();
        }
        Object[] objArr2 = caaVar.g;
        int i4 = i - 1;
        this.a = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.p2, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        b();
        int i = this.f;
        if (i == -1) {
            r3.l();
            return;
        }
        caa caaVar = this.c;
        caaVar.d(i);
        int i2 = this.f;
        if (i2 < this.a) {
            this.a = i2;
        }
        this.b = caaVar.c();
        this.d = caaVar.i();
        this.f = -1;
        c();
    }

    @Override // defpackage.p2, java.util.ListIterator
    public final void set(Object obj) {
        b();
        int i = this.f;
        if (i == -1) {
            r3.l();
            return;
        }
        caa caaVar = this.c;
        caaVar.set(i, obj);
        this.d = caaVar.i();
        c();
    }
}
