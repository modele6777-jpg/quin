package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public rp1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final rp1 a(long j, long j2, long j3, long j4) {
        return new rp1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rp1)) {
            return false;
        }
        rp1 rp1Var = (rp1) obj;
        long j = rp1Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, rp1Var.b) && faf.a(this.c, rp1Var.c) && faf.a(this.d, rp1Var.d);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.d) + ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
