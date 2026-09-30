package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ly8 implements ntc {
    public final long[] a;
    public final long[] b;
    public final long c;

    public ly8(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? pqf.H(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair i(long j, long[] jArr, long[] jArr2) {
        int iD = pqf.d(jArr, j, true);
        long j2 = jArr[iD];
        long j3 = jArr2[iD];
        int i = iD + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.ntc
    public final long a() {
        return -1L;
    }

    @Override // defpackage.ntc
    public final long b() {
        return 0L;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ntc
    public final long d(long j) {
        return pqf.H(((Long) i(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        Pair pairI = i(pqf.R(pqf.i(j, 0L, this.c)), this.b, this.a);
        zsc zscVar = new zsc(pqf.H(((Long) pairI.first).longValue()), ((Long) pairI.second).longValue());
        return new wsc(zscVar, zscVar);
    }

    @Override // defpackage.ntc
    public final int g() {
        return -2147483647;
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.c;
    }
}
