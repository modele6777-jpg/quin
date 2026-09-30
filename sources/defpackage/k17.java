package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k17 implements ntc {
    public final long a;
    public final long b;
    public final int c;
    public final j17 d;

    public k17(long j, long j2, long j3) {
        this.d = new j17(j, new long[]{j2}, new long[]{0});
        this.a = j2;
        this.b = j3;
        this.c = feg.v(j3 - j2, j);
    }

    @Override // defpackage.ntc
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ntc
    public final long b() {
        return this.a;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return this.d.c();
    }

    @Override // defpackage.ntc
    public final long d(long j) {
        j17 j17Var = this.d;
        jf8 jf8Var = j17Var.b;
        if (jf8Var.b == 0) {
            return -9223372036854775807L;
        }
        return jf8Var.d(pqf.b(j17Var.a, j));
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        return this.d.f(j);
    }

    @Override // defpackage.ntc
    public final int g() {
        return this.c;
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.d.c;
    }
}
