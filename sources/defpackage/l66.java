package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l66 implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ cyc d;

    public l66(ie5 ie5Var) {
        this.a = 2;
        this.d = ie5Var;
        this.c = new ue5((zi5) ie5Var.b);
    }

    public void b() {
        Object objD;
        int i = this.b;
        ie5 ie5Var = (ie5) this.d;
        if (i == -2) {
            objD = ((x16) ie5Var.b).invoke();
        } else {
            a26 a26Var = (a26) ie5Var.c;
            Object obj = this.c;
            obj.getClass();
            objD = a26Var.d(obj);
        }
        this.c = objD;
        this.b = objD == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    b();
                }
                return this.b == 1;
            case 1:
                l6e l6eVar = (l6e) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < l6eVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                return this.b < l6eVar.c && it.hasNext();
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        cyc cycVar = this.d;
        switch (i) {
            case 0:
                if (this.b < 0) {
                    b();
                }
                if (this.b == 0) {
                    s8f.c();
                    return null;
                }
                Object obj = this.c;
                obj.getClass();
                this.b = -1;
                return obj;
            case 1:
                l6e l6eVar = (l6e) cycVar;
                Iterator it = (Iterator) this.c;
                while (this.b < l6eVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i2 = this.b;
                if (i2 < l6eVar.c) {
                    this.b = i2 + 1;
                    return it.next();
                }
                s8f.c();
                return null;
            default:
                yt2 yt2Var = (yt2) ((ie5) cycVar).c;
                int i3 = this.b;
                this.b = i3 + 1;
                if (i3 >= 0) {
                    return yt2Var.z(Integer.valueOf(i3), ((Iterator) this.c).next());
                }
                t72.Z();
                throw null;
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

    public l66(l6e l6eVar) {
        this.a = 1;
        this.d = l6eVar;
        this.c = l6eVar.a.iterator();
    }

    public l66(ie5 ie5Var, byte b) {
        this.a = 0;
        this.d = ie5Var;
        this.b = -2;
    }
}
