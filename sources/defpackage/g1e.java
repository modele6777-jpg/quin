package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g1e implements Iterator, zm7 {
    public final osd a;
    public final Iterator b;
    public Object c;
    public Object d;
    public int e;

    public g1e(osd osdVar, Iterator it) {
        this.a = osdVar;
        this.b = it;
        this.e = ((h1e) qrd.f(osdVar.a)).d;
        this.c = this.d;
        this.d = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (((h1e) qrd.f(this.a.a)).d != this.e) {
            qc0.e();
            return null;
        }
        this.c = this.d;
        Iterator it = this.b;
        this.d = it.hasNext() ? it.next() : null;
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        r3.l();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        osd osdVar = this.a;
        if (((h1e) qrd.f(osdVar.a)).d != this.e) {
            qc0.e();
            return;
        }
        Object obj = this.c;
        if (obj == null) {
            r3.l();
            return;
        }
        osdVar.remove(obj);
        this.c = null;
        this.e = ((h1e) qrd.f(osdVar.a)).d;
    }
}
