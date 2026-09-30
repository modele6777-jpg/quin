package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dyc implements Iterator, xn2, zm7 {
    public int a;
    public Object b;
    public Iterator c;
    public xn2 d;

    public final RuntimeException b() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void c(xn2 xn2Var, Object obj) {
        this.b = obj;
        this.a = 3;
        this.d = xn2Var;
        xn2Var.getClass();
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        jzb.q(obj);
        this.a = 4;
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return nu4.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.c;
                it.getClass();
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            xn2 xn2Var = this.d;
            xn2Var.getClass();
            this.d = null;
            xn2Var.g(wef.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            s8f.c();
            return null;
        }
        if (i == 2) {
            this.a = 1;
            Iterator it = this.c;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw b();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
