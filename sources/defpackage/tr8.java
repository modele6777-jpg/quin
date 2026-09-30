package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tr8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public tr8(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tr8)) {
            return false;
        }
        tr8 tr8Var = (tr8) obj;
        long j = tr8Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, tr8Var.b) && faf.a(this.c, tr8Var.c) && faf.a(this.d, tr8Var.d) && faf.a(this.e, tr8Var.e) && faf.a(this.f, tr8Var.f);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.f) + ib8.b(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
