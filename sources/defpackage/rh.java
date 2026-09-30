package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rh implements l95 {
    public final d0a c;
    public final zu1 d;
    public n95 e;
    public long f;
    public boolean h;
    public boolean i;
    public final sh a = new sh(0, null, "audio/mp4a-latm", true);
    public final d0a b = new d0a(2048);
    public long g = -1;

    public rh() {
        d0a d0aVar = new d0a(10);
        this.c = d0aVar;
        byte[] bArr = d0aVar.a;
        this.d = new zu1(bArr, bArr.length);
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        d0a d0aVar;
        int i = 0;
        while (true) {
            d0aVar = this.c;
            m95Var.o(d0aVar.a, 0, 10);
            d0aVar.M(0);
            if (d0aVar.C() != 4801587) {
                break;
            }
            d0aVar.N(3);
            int iY = d0aVar.y();
            i += iY + 10;
            m95Var.f(iY);
        }
        m95Var.k();
        m95Var.f(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            rq3 rq3Var = (rq3) m95Var;
            rq3Var.d(d0aVar.a, 0, 2, false);
            d0aVar.M(0);
            if ((d0aVar.G() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                rq3Var.d(d0aVar.a, 0, 4, false);
                zu1 zu1Var = this.d;
                zu1Var.m(14);
                int iG = zu1Var.g(13);
                if (iG <= 6) {
                    i4++;
                    rq3Var.f = 0;
                    rq3Var.j(i4, false);
                } else {
                    rq3Var.j(iG - 6, false);
                    i3 += iG;
                }
            } else {
                i4++;
                rq3Var.f = 0;
                rq3Var.j(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.h = false;
        this.a.d();
        this.f = j2;
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        this.e.getClass();
        m95Var.getLength();
        d0a d0aVar = this.b;
        int i = m95Var.read(d0aVar.a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.q(new ir0(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        d0aVar.M(0);
        d0aVar.L(i);
        boolean z2 = this.h;
        sh shVar = this.a;
        if (!z2) {
            shVar.u = this.f;
            this.h = true;
        }
        shVar.c(d0aVar);
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.e = n95Var;
        this.a.h(n95Var, new xg3(0, 1));
        n95Var.j();
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
