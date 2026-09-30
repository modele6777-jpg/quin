package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class x9a implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public Object b;
    public final Map c;
    public int d;

    public /* synthetic */ x9a(Object obj, Map map, int i) {
        this.a = i;
        this.b = obj;
        this.c = map;
    }

    public v68 b() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        Object obj = this.c.get(this.b);
        if (obj != null) {
            v68 v68Var = (v68) obj;
            this.d++;
            this.b = v68Var.c;
            return v68Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.b + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Map map = this.c;
        switch (i) {
            case 0:
                return this.d < map.size();
            default:
                return this.d < map.size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.a) {
            case 0:
                return b();
            default:
                if (!hasNext()) {
                    s8f.c();
                    return null;
                }
                Object obj = this.b;
                this.d++;
                Object obj2 = this.c.get(obj);
                if (obj2 != null) {
                    this.b = ((w68) obj2).b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
