package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r56 implements Comparable {
    public final int a;
    public final x9g b;
    public final boolean c;

    public r56(int i, x9g x9gVar, boolean z) {
        this.a = i;
        this.b = x9gVar;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((r56) obj).a;
    }
}
