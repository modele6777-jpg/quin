package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aaa extends x9a {
    public final z9a e;
    public Object f;
    public boolean g;
    public int v;

    /* JADX WARN: Illegal instructions before constructor call */
    public aaa(z9a z9aVar) {
        Object obj = z9aVar.b;
        z8a z8aVar = z9aVar.d;
        super(obj, z8aVar, 1);
        this.e = z9aVar;
        this.v = z8aVar.e;
    }

    @Override // defpackage.x9a, java.util.Iterator
    public final Object next() {
        if (this.e.d.e != this.v) {
            qc0.e();
            return null;
        }
        Object next = super.next();
        this.f = next;
        this.g = true;
        return next;
    }

    @Override // defpackage.x9a, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            r3.l();
            return;
        }
        Object obj = this.f;
        z9a z9aVar = this.e;
        z7f.p(z9aVar).remove(obj);
        this.f = null;
        this.g = false;
        this.v = z9aVar.d.e;
        this.d--;
    }
}
