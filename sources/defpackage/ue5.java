package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ue5 implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ cyc e;

    public ue5(ie5 ie5Var) {
        this.a = 2;
        this.e = ie5Var;
        this.b = ((cyc) ie5Var.b).iterator();
        this.c = -1;
    }

    public void b() {
        Object next;
        ve5 ve5Var = (ve5) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ve5Var.c.d(next)).booleanValue() != ve5Var.b);
        this.d = next;
        this.c = 1;
    }

    public void c() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((a26) ((ie5) this.e).c).d(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            zi5 zi5Var = (zi5) this.e;
            it = (Iterator) zi5Var.c.d(zi5Var.b.d(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1;
            case 1:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return d();
            default:
                if (this.c == -1) {
                    c();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    s8f.c();
                    return null;
                }
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            case 1:
                int i = this.c;
                if (i == 2) {
                    s8f.c();
                    return null;
                }
                if (i == 0 && !d()) {
                    s8f.c();
                    return null;
                }
                this.c = 0;
                Iterator it = (Iterator) this.d;
                it.getClass();
                return it.next();
            default:
                if (this.c == -1) {
                    c();
                }
                if (this.c == 0) {
                    s8f.c();
                    return null;
                }
                Object obj2 = this.d;
                this.d = null;
                this.c = -1;
                return obj2;
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

    public ue5(zi5 zi5Var) {
        this.a = 1;
        this.e = zi5Var;
        this.b = zi5Var.a.iterator();
    }

    public ue5(ve5 ve5Var) {
        this.a = 0;
        this.e = ve5Var;
        this.b = ve5Var.a.iterator();
        this.c = -1;
    }
}
