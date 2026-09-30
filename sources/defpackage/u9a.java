package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u9a implements Iterator, zm7 {
    public Object a;
    public final s9a b;
    public Object c = qk6.X;
    public boolean d;
    public int e;
    public int f;

    public u9a(Object obj, s9a s9aVar) {
        this.a = obj;
        this.b = s9aVar;
        this.e = s9aVar.d.e;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v68 next() {
        y8a y8aVar = this.b.d;
        if (y8aVar.e != this.e) {
            qc0.e();
            return null;
        }
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        Object obj = this.a;
        this.c = obj;
        this.d = true;
        this.f++;
        Object obj2 = y8aVar.get(obj);
        if (obj2 != null) {
            v68 v68Var = (v68) obj2;
            this.a = v68Var.c;
            return v68Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.b.d.d();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            r3.l();
            return;
        }
        Object obj = this.c;
        s9a s9aVar = this.b;
        z7f.q(s9aVar).remove(obj);
        this.c = null;
        this.d = false;
        this.e = s9aVar.d.e;
        this.f--;
    }
}
