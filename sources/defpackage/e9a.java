package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e9a implements Iterator, zm7 {
    public final /* synthetic */ int a = 3;
    public final Iterator b;

    public e9a(z8a z8aVar) {
        q4f[] q4fVarArr = new q4f[8];
        for (int i = 0; i < 8; i++) {
            q4fVarArr[i] = new u4f(this);
        }
        this.b = new b9a(z8aVar, q4fVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                return ((a9a) it).c;
            case 1:
                return ((b9a) it).c;
            case 2:
                return ((l2) it).hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                return (Map.Entry) ((a9a) it).next();
            case 1:
                return (Map.Entry) ((b9a) it).next();
            case 2:
                return ((l2) it).next();
            default:
                return (nsf) it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((a9a) this.b).remove();
                return;
            case 1:
                ((b9a) this.b).remove();
                return;
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e9a(Object[] objArr) {
        objArr.getClass();
        this.b = new l2(objArr);
    }

    public e9a(y8a y8aVar) {
        q4f[] q4fVarArr = new q4f[8];
        for (int i = 0; i < 8; i++) {
            q4fVarArr[i] = new t4f(this);
        }
        this.b = new a9a(y8aVar, q4fVarArr);
    }

    public e9a(lsf lsfVar) {
        this.b = lsfVar.x.iterator();
    }
}
