package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 implements l95 {
    public final b6 a = new b6(null, 0, "audio/ac4", 1);
    public final d0a b = new d0a(16384);
    public boolean c;

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        rq3 rq3Var;
        int i;
        d0a d0aVar = new d0a(10);
        int i2 = 0;
        while (true) {
            rq3Var = (rq3) m95Var;
            rq3Var.d(d0aVar.a, 0, 10, false);
            d0aVar.M(0);
            if (d0aVar.C() != 4801587) {
                break;
            }
            d0aVar.N(3);
            int iY = d0aVar.y();
            i2 += iY + 10;
            rq3Var.j(iY, false);
        }
        rq3Var.f = 0;
        rq3Var.j(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            rq3Var.d(d0aVar.a, 0, 7, false);
            d0aVar.M(0);
            int iG = d0aVar.G();
            if (iG == 44096 || iG == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = d0aVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iG == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                rq3Var.j(i - 7, false);
            } else {
                rq3Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                rq3Var.j(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        d0a d0aVar = this.b;
        int i = m95Var.read(d0aVar.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        d0aVar.M(0);
        d0aVar.L(i);
        boolean z = this.c;
        b6 b6Var = this.a;
        if (!z) {
            b6Var.o = 0L;
            this.c = true;
        }
        b6Var.c(d0aVar);
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.a.h(n95Var, new xg3(0, 1));
        n95Var.j();
        n95Var.q(new ir0(-9223372036854775807L));
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
