package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 implements xsc {
    public final xx0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public vx0(xx0 xx0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = xx0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        zsc zscVar = new zsc(j, wx0.a(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new wsc(zscVar, zscVar);
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.b;
    }
}
