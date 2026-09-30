package defpackage;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a0g implements zzf {
    public final n95 a;
    public final k1f b;
    public final c0g c;
    public final rr5 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public a0g(n95 n95Var, k1f k1fVar, c0g c0gVar, String str, int i) throws l0a {
        this.a = n95Var;
        this.b = k1fVar;
        this.c = c0gVar;
        int i2 = c0gVar.a;
        int i3 = c0gVar.b;
        int i4 = (c0gVar.d * i2) / 8;
        int i5 = c0gVar.c;
        if (i5 != i4) {
            throw l0a.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        qr5 qr5Var = new qr5();
        qr5Var.n = qv8.l("audio/wav");
        qr5Var.o = qv8.l(str);
        qr5Var.i = i7;
        qr5Var.j = i7;
        qr5Var.p = iMax;
        qr5Var.I = i2;
        int i8 = c0gVar.f;
        qr5Var.J = i8 == 0 ? -1 : i8 << 2;
        qr5Var.K = i3;
        qr5Var.L = i;
        this.d = new rr5(qr5Var);
    }

    @Override // defpackage.zzf
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.zzf
    public final boolean b(m95 m95Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iC = this.b.c(m95Var, (int) Math.min(i2 - i, j2), true);
            if (iC == -1) {
                j2 = 0;
            } else {
                this.g += iC;
                j2 -= (long) iC;
            }
        }
        c0g c0gVar = this.c;
        int i3 = c0gVar.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = c0gVar.b;
            String str = pqf.a;
            long jN = j3 + pqf.N(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(jN, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.zzf
    public final void c(int i, long j) {
        d0g d0gVar = new d0g(this.c, 1, i, j);
        this.a.q(d0gVar);
        rr5 rr5Var = this.d;
        k1f k1fVar = this.b;
        k1fVar.g(rr5Var);
        k1fVar.d(d0gVar.e);
    }
}
