package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r1g implements Comparable {
    public final int a;
    public final n1g b;

    public r1g(int i, n1g n1gVar) {
        this.a = i;
        this.b = n1gVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((r1g) obj).a);
    }
}
