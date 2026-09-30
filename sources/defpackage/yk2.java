package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yk2 implements ntc, xsc {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;

    public yk2(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j4 = j - j2;
            this.d = j4;
            this.f = (Math.max(0L, j4) * 8000000) / ((long) i);
        }
        this.i = j3;
        this.j = j == -1 ? -1L : j;
    }

    @Override // defpackage.ntc
    public final long a() {
        return this.j;
    }

    @Override // defpackage.ntc
    public final long b() {
        return this.b;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.ntc
    public final long d(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.xsc
    public final boolean e() {
        return this.h;
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        long j2 = this.i;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.j;
            if (j3 != -1) {
                long j4 = this.c;
                long j5 = this.b;
                zsc zscVar = new zsc(Math.max(0L, j2 - ((Math.max(0L, (j4 + j5) - j5) * 8000000) / ((long) this.e))), Math.max(j5, j3 - j4));
                return new wsc(zscVar, zscVar);
            }
        }
        long j6 = this.d;
        long j7 = this.b;
        if (j6 == -1 && !this.g) {
            zsc zscVar2 = new zsc(0L, j7);
            return new wsc(zscVar2, zscVar2);
        }
        int i = this.e;
        long j8 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j8) * j8;
        if (j6 != -1) {
            jMin = Math.min(jMin, j6 - j8);
        }
        long jMax = Math.max(jMin, 0L) + j7;
        long jMax2 = (Math.max(0L, jMax - j7) * 8000000) / ((long) i);
        zsc zscVar3 = new zsc(jMax2, jMax);
        if (j6 != -1 && jMax2 < j) {
            long j9 = jMax + j8;
            if (j9 < this.a) {
                return new wsc(zscVar3, new zsc((Math.max(0L, j9 - j7) * 8000000) / ((long) i), j9));
            }
        }
        return new wsc(zscVar3, zscVar3);
    }

    @Override // defpackage.ntc
    public final int g() {
        return this.e;
    }

    @Override // defpackage.xsc
    public final long h() {
        long j = this.i;
        return j != -9223372036854775807L ? j : this.f;
    }
}
