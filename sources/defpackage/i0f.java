package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i0f {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public i0f(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final i0f a(long j, long j2, long j3, long j4, long j5, long j6) {
        return new i0f(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0f)) {
            return false;
        }
        i0f i0fVar = (i0f) obj;
        long j = i0fVar.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, i0fVar.b) && faf.a(this.c, i0fVar.c) && faf.a(this.d, i0fVar.d) && faf.a(this.e, i0fVar.e) && faf.a(this.f, i0fVar.f);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.f) + ib8.b(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
