package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j17 implements xsc {
    public final jf8 a;
    public final jf8 b;
    public long c;

    public j17(long j, long[] jArr, long[] jArr2) {
        jf8 jf8Var;
        jf8 jf8Var2;
        pa7.A(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            jf8Var = new jf8(length);
            this.a = jf8Var;
            jf8Var2 = new jf8(length);
            this.b = jf8Var2;
        } else {
            int i = length + 1;
            jf8Var = new jf8(i);
            this.a = jf8Var;
            jf8Var2 = new jf8(i);
            this.b = jf8Var2;
            jf8Var.a(0L);
            jf8Var2.a(0L);
        }
        jf8Var.b(jArr);
        jf8Var2.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return this.b.b > 0;
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        jf8 jf8Var = this.b;
        if (jf8Var.b == 0) {
            zsc zscVar = zsc.c;
            return new wsc(zscVar, zscVar);
        }
        int iB = pqf.b(jf8Var, j);
        long jD = jf8Var.d(iB);
        jf8 jf8Var2 = this.a;
        zsc zscVar2 = new zsc(jD, jf8Var2.d(iB));
        if (jD == j || iB == jf8Var.b - 1) {
            return new wsc(zscVar2, zscVar2);
        }
        int i = iB + 1;
        return new wsc(zscVar2, new zsc(jf8Var.d(i), jf8Var2.d(i)));
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.c;
    }

    public final void i(long j, long j2) {
        jf8 jf8Var = this.b;
        int i = jf8Var.b;
        jf8 jf8Var2 = this.a;
        if (i == 0 && j > 0) {
            jf8Var2.a(0L);
            jf8Var.a(0L);
        }
        jf8Var2.a(j2);
        jf8Var.a(j);
    }
}
