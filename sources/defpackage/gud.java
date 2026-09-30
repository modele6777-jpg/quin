package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gud extends q67 {
    public int a;
    public final /* synthetic */ fud b;

    public gud(fud fudVar) {
        this.b = fudVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.d();
    }

    @Override // defpackage.q67
    public final int nextInt() {
        int i = this.a;
        this.a = i + 1;
        return this.b.b(i);
    }
}
