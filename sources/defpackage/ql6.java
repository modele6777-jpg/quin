package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ql6 implements ListIterator, zm7 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public ql6(jsd jsdVar, int i) {
        this.a = 3;
        this.e = jsdVar;
        this.b = i - 1;
        this.c = -1;
        this.d = z5c.A(jsdVar);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                b();
                b78 b78Var = (b78) obj2;
                int i2 = this.b;
                this.b = i2 + 1;
                b78Var.add(i2, obj);
                this.c = -1;
                this.d = ((AbstractList) b78Var).modCount;
                return;
            case 2:
                c();
                c78 c78Var = (c78) obj2;
                int i3 = this.b;
                this.b = i3 + 1;
                c78Var.add(i3, obj);
                this.c = -1;
                this.d = ((AbstractList) c78Var).modCount;
                return;
            default:
                d();
                jsd jsdVar = (jsd) obj2;
                jsdVar.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = z5c.A(jsdVar);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((b78) this.e).root).modCount == this.d) {
            return;
        }
        qc0.e();
    }

    public void c() {
        if (((AbstractList) ((c78) this.e)).modCount == this.d) {
            return;
        }
        qc0.e();
    }

    public void d() {
        if (z5c.A((jsd) this.e) == this.d) {
            return;
        }
        qc0.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                return this.b < this.d;
            case 1:
                return this.b < ((b78) obj).length;
            case 2:
                return this.b < ((c78) obj).length;
            default:
                return this.b < ((jsd) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b > this.c;
            case 1:
                return this.b > 0;
            case 2:
                return this.b > 0;
            default:
                return this.b >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                i79 i79Var = ((sl6) obj).a;
                int i2 = this.b;
                this.b = i2 + 1;
                Object objB = i79Var.b(i2);
                objB.getClass();
                return (i09) objB;
            case 1:
                b();
                b78 b78Var = (b78) obj;
                if (this.b >= b78Var.length) {
                    s8f.c();
                    return null;
                }
                int i3 = this.b;
                this.b = i3 + 1;
                this.c = i3;
                return b78Var.backing[b78Var.offset + this.c];
            case 2:
                c();
                c78 c78Var = (c78) obj;
                if (this.b >= c78Var.length) {
                    s8f.c();
                    return null;
                }
                int i4 = this.b;
                this.b = i4 + 1;
                this.c = i4;
                return c78Var.backing[this.c];
            default:
                d();
                int i5 = this.b + 1;
                this.c = i5;
                jsd jsdVar = (jsd) obj;
                z5c.M(i5, jsdVar.size());
                Object obj2 = jsdVar.get(i5);
                this.b = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                i79 i79Var = ((sl6) obj).a;
                int i2 = this.b - 1;
                this.b = i2;
                Object objB = i79Var.b(i2);
                objB.getClass();
                return (i09) objB;
            case 1:
                b78 b78Var = (b78) obj;
                b();
                int i3 = this.b;
                if (i3 <= 0) {
                    s8f.c();
                    return null;
                }
                int i4 = i3 - 1;
                this.b = i4;
                this.c = i4;
                return b78Var.backing[b78Var.offset + this.c];
            case 2:
                c();
                int i5 = this.b;
                if (i5 <= 0) {
                    s8f.c();
                    return null;
                }
                int i6 = i5 - 1;
                this.b = i6;
                this.c = i6;
                return ((c78) obj).backing[this.c];
            default:
                d();
                jsd jsdVar = (jsd) obj;
                z5c.M(this.b, jsdVar.size());
                int i7 = this.b;
                this.c = i7;
                Object obj2 = jsdVar.get(i7);
                this.b--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                return (this.b - this.c) - 1;
            case 1:
                i = this.b;
                break;
            case 2:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                b78 b78Var = (b78) obj;
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    qc0.p("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                b78Var.d(i2);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) b78Var).modCount;
                return;
            case 2:
                c78 c78Var = (c78) obj;
                c();
                int i3 = this.c;
                if (i3 == -1) {
                    qc0.p("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c78Var.d(i3);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) c78Var).modCount;
                return;
            default:
                d();
                jsd jsdVar = (jsd) obj;
                jsdVar.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = z5c.A(jsdVar);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    ((b78) obj2).set(i2, obj);
                    return;
                } else {
                    qc0.p("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                c();
                int i3 = this.c;
                if (i3 != -1) {
                    ((c78) obj2).set(i3, obj);
                    return;
                } else {
                    qc0.p("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                jsd jsdVar = (jsd) obj2;
                d();
                int i4 = this.c;
                if (i4 < 0) {
                    qc0.p("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    jsdVar.set(i4, obj);
                    this.d = z5c.A(jsdVar);
                    return;
                }
        }
    }

    public ql6(c78 c78Var, int i) {
        this.a = 2;
        this.e = c78Var;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) c78Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ql6(sl6 sl6Var, int i, int i2) {
        this(sl6Var, (i2 & 1) != 0 ? 0 : i, 0, sl6Var.a.b);
        this.a = 0;
    }

    public ql6(sl6 sl6Var, int i, int i2, int i3) {
        this.a = 0;
        this.e = sl6Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public ql6(b78 b78Var, int i) {
        this.a = 1;
        this.e = b78Var;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) b78Var).modCount;
    }
}
