package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 implements l95 {
    public final b6 a = new b6("audio/ac3");
    public final d0a b = new d0a(2786);
    public boolean c;

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        rq3 rq3Var;
        int iY;
        d0a d0aVar = new d0a(10);
        int i = 0;
        while (true) {
            rq3Var = (rq3) m95Var;
            rq3Var.d(d0aVar.a, 0, 10, false);
            d0aVar.M(0);
            if (d0aVar.C() != 4801587) {
                break;
            }
            d0aVar.N(3);
            int iY2 = d0aVar.y();
            i += iY2 + 10;
            rq3Var.j(iY2, false);
        }
        rq3Var.f = 0;
        rq3Var.j(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            rq3Var.d(d0aVar.a, 0, 6, false);
            d0aVar.M(0);
            if (d0aVar.G() != 2935) {
                rq3Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                rq3Var.j(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = d0aVar.a;
                if (bArr.length < 6) {
                    iY = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iY = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iY = b21.y((b & 192) >> 6, b & 63);
                }
                if (iY == -1) {
                    break;
                }
                rq3Var.j(iY - 6, false);
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
        int i = m95Var.read(d0aVar.a, 0, 2786);
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
