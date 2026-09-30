package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gsf implements ntc {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public gsf(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = feg.v(j3 - j2, j);
    }

    @Override // defpackage.ntc
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ntc
    public final long b() {
        return this.d;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ntc
    public final long d(long j) {
        return this.a[pqf.d(this.b, j, true)];
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        long[] jArr = this.a;
        int iD = pqf.d(jArr, j, true);
        long j2 = jArr[iD];
        long[] jArr2 = this.b;
        zsc zscVar = new zsc(j2, jArr2[iD]);
        if (j2 >= j || iD == jArr.length - 1) {
            return new wsc(zscVar, zscVar);
        }
        int i = iD + 1;
        return new wsc(zscVar, new zsc(jArr[i], jArr2[i]));
    }

    @Override // defpackage.ntc
    public final int g() {
        return this.f;
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.c;
    }
}
