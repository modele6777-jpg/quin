package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vbe {
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
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;

    public vbe(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vbe)) {
            return false;
        }
        vbe vbeVar = (vbe) obj;
        long j = vbeVar.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, vbeVar.b) && faf.a(this.c, vbeVar.c) && faf.a(this.d, vbeVar.d) && faf.a(this.e, vbeVar.e) && faf.a(this.f, vbeVar.f) && faf.a(this.g, vbeVar.g) && faf.a(this.h, vbeVar.h) && faf.a(this.i, vbeVar.i) && faf.a(this.j, vbeVar.j) && faf.a(this.k, vbeVar.k) && faf.a(this.l, vbeVar.l) && faf.a(this.m, vbeVar.m) && faf.a(this.n, vbeVar.n) && faf.a(this.o, vbeVar.o) && faf.a(this.p, vbeVar.p);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.p) + ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}
