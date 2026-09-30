package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t9a implements Iterator, zm7 {
    public final /* synthetic */ int a;
    public final u9a b;

    public t9a(s9a s9aVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new u9a(s9aVar.b, s9aVar);
                break;
            case 2:
                this.b = new u9a(s9aVar.b, s9aVar);
                break;
            default:
                this.b = new u9a(s9aVar.b, s9aVar);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        u9a u9aVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return u9aVar.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        u9a u9aVar = this.b;
        switch (i) {
            case 0:
                return new b79(u9aVar.b, u9aVar.c, u9aVar.next());
            case 1:
                u9aVar.next();
                return u9aVar.c;
            default:
                return u9aVar.next().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        u9a u9aVar = this.b;
        switch (i) {
            case 0:
                u9aVar.remove();
                break;
            case 1:
                u9aVar.remove();
                break;
            default:
                u9aVar.remove();
                break;
        }
    }
}
