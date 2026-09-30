package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d0g implements xsc {
    public final c0g a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public d0g(c0g c0gVar, int i, long j, long j2) {
        this.a = c0gVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) c0gVar.c);
        this.d = j3;
        this.e = i(j3);
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        c0g c0gVar = this.a;
        long j2 = (((long) c0gVar.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long jI = pqf.i(j2, 0L, j3);
        int i = c0gVar.c;
        long j4 = this.c;
        long jI2 = i(jI);
        zsc zscVar = new zsc(jI2, (((long) i) * jI) + j4);
        if (jI2 >= j || jI == j3) {
            return new wsc(zscVar, zscVar);
        }
        long j5 = jI + 1;
        return new wsc(zscVar, new zsc(i(j5), (((long) i) * j5) + j4));
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = pqf.a;
        return pqf.N(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
