package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class u2 implements Iterator {
    public final /* synthetic */ int a = 2;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public u2(d3 d3Var) {
        this.d = d3Var;
        Collection collection = d3Var.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        d3 d3Var = (d3) this.d;
        d3Var.c();
        if (d3Var.b == ((Collection) this.c)) {
            return;
        }
        qc0.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((v2) this.d).b(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                pa7.I("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((v2) obj).d.e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                pa7.I("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((w2) obj).b.e -= collection.size();
                collection.clear();
                this.c = null;
                break;
            default:
                it.remove();
                d3 d3Var = (d3) obj;
                d3Var.e.e--;
                d3Var.d();
                break;
        }
    }

    public u2(d3 d3Var, ListIterator listIterator) {
        this.d = d3Var;
        this.c = d3Var.b;
        this.b = listIterator;
    }

    public u2(w2 w2Var, Iterator it) {
        this.b = it;
        this.d = w2Var;
    }

    public u2(v2 v2Var) {
        this.d = v2Var;
        this.b = v2Var.c.entrySet().iterator();
    }
}
