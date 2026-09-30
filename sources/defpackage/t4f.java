package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t4f extends q4f {
    public final e9a e;

    public t4f(e9a e9aVar) {
        super(0);
        this.e = e9aVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new a79(this.e, objArr[i], objArr[i + 1]);
    }
}
