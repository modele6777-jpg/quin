package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pod {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public pod(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.b : this.d;
        }
        return z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pod)) {
            return false;
        }
        pod podVar = (pod) obj;
        long j = podVar.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, podVar.b) && faf.a(this.c, podVar.c) && faf.a(this.d, podVar.d) && faf.a(this.e, podVar.e) && faf.a(this.f, podVar.f) && faf.a(this.g, podVar.g) && faf.a(this.h, podVar.h) && faf.a(this.i, podVar.i) && faf.a(this.j, podVar.j);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.j) + ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
