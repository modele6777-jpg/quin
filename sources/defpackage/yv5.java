package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yv5 {
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

    public yv5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv5)) {
            return false;
        }
        yv5 yv5Var = (yv5) obj;
        long j = yv5Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, yv5Var.b) && faf.a(this.c, yv5Var.c) && faf.a(this.d, yv5Var.d) && faf.a(this.e, yv5Var.e) && faf.a(this.f, yv5Var.f) && faf.a(this.g, yv5Var.g) && faf.a(this.h, yv5Var.h) && faf.a(this.i, yv5Var.i) && faf.a(this.j, yv5Var.j) && faf.a(this.k, yv5Var.k) && faf.a(this.l, yv5Var.l) && faf.a(this.m, yv5Var.m);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.m) + ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(ib8.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        String strH = y72.h(this.a);
        String strH2 = y72.h(this.b);
        String strH3 = y72.h(this.c);
        String strH4 = y72.h(this.d);
        String strH5 = y72.h(this.e);
        String strH6 = y72.h(this.f);
        String strH7 = y72.h(this.g);
        String strH8 = y72.h(this.h);
        String strH9 = y72.h(this.i);
        String strH10 = y72.h(this.j);
        String strH11 = y72.h(this.k);
        String strH12 = y72.h(this.l);
        String strH13 = y72.h(this.m);
        StringBuilder sbO = ib8.o("FourSeasonsPalette(accent=", strH, ", accentBright=", strH2, ", accentStrong=");
        ub3.v(sbO, strH3, ", glow=", strH4, ", accentMutedLight=");
        ub3.v(sbO, strH5, ", accentMutedDark=", strH6, ", heroBgLight=");
        ub3.v(sbO, strH7, ", heroBgDark=", strH8, ", pageBgBaseDark=");
        ub3.v(sbO, strH9, ", countdownBgLight=", strH10, ", countdownBgDark=");
        ub3.v(sbO, strH11, ", cardBgLight=", strH12, ", cardBgDark=");
        return ks0.l(sbO, strH13, ")");
    }
}
