package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z1f {
    public final long a;
    public final long b;
    public final boolean c;

    public z1f(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final z1f a(z1f z1fVar) {
        return new z1f(hl9.g(this.a, z1fVar.a), Math.max(this.b, z1fVar.b), this.c || z1fVar.c);
    }
}
