package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b1e implements Iterator, zm7 {
    public final lsd a;
    public final Iterator b;
    public int c;
    public Map.Entry d;
    public Map.Entry e;
    public final /* synthetic */ int f;

    public b1e(lsd lsdVar, Iterator it, int i) {
        this.f = i;
        this.a = lsdVar;
        this.b = it;
        this.c = lsdVar.e().d;
        b();
    }

    public final void b() {
        this.d = this.e;
        Iterator it = this.b;
        this.e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                b();
                if (this.d != null) {
                    return new a1e(this);
                }
                r3.l();
                return null;
            case 1:
                Map.Entry entry = this.e;
                if (entry != null) {
                    b();
                    return entry.getKey();
                }
                r3.l();
                return null;
            default:
                Map.Entry entry2 = this.e;
                if (entry2 != null) {
                    b();
                    return entry2.getValue();
                }
                r3.l();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        lsd lsdVar = this.a;
        if (lsdVar.e().d != this.c) {
            qc0.e();
            return;
        }
        Map.Entry entry = this.d;
        if (entry == null) {
            r3.l();
            return;
        }
        lsdVar.remove(entry.getKey());
        this.d = null;
        this.c = lsdVar.e().d;
    }
}
