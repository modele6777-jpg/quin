package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qy1 {
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

    public qy1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
    }

    public static fxd a(yye yyeVar, l46 l46Var) {
        if (yyeVar == yye.b) {
            l46Var.f0(1539262271);
            fxd fxdVarZ = vpf.Z(t39.d, l46Var);
            l46Var.r(false);
            return fxdVarZ;
        }
        l46Var.f0(1539355581);
        fxd fxdVarZ2 = vpf.Z(t39.c, l46Var);
        l46Var.r(false);
        return fxdVarZ2;
    }

    public final qy1 b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new qy1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != r1 ? j8 : this.h, j9 != r1 ? j9 : this.i, j10 != r1 ? j10 : this.j, j11 != r1 ? j11 : this.k, j12 != 16 ? j12 : this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qy1)) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        long j = qy1Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, qy1Var.b) && faf.a(this.c, qy1Var.c) && faf.a(this.d, qy1Var.d) && faf.a(this.e, qy1Var.e) && faf.a(this.f, qy1Var.f) && faf.a(this.g, qy1Var.g) && faf.a(this.h, qy1Var.h) && faf.a(this.i, qy1Var.i) && faf.a(this.j, qy1Var.j) && faf.a(this.k, qy1Var.k) && faf.a(this.l, qy1Var.l);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.l) + ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
