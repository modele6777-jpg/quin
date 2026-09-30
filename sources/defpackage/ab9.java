package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ab9 implements Iterator, zm7 {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ r1f c;

    public ab9(r1f r1fVar) {
        this.c = r1fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < ((fud) this.c.c).d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        this.b = true;
        fud fudVar = (fud) this.c.c;
        int i = this.a + 1;
        this.a = i;
        return (ua9) fudVar.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            qc0.p("You must call next() before you can remove an element");
            return;
        }
        fud fudVar = (fud) this.c.c;
        ((ua9) fudVar.e(this.a)).c = null;
        int i = this.a;
        Object[] objArr = fudVar.c;
        Object obj = objArr[i];
        Object obj2 = abg.i;
        if (obj != obj2) {
            objArr[i] = obj2;
            fudVar.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
