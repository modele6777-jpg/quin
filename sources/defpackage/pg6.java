package defpackage;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pg6 implements xs4 {
    public final vtc a;
    public String b;
    public k1f c;
    public og6 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final d55 g = new d55(32);
    public final d55 h = new d55(33);
    public final d55 i = new d55(34);
    public final d55 j = new d55(39);
    public final d55 k = new d55(40);
    public long m = -9223372036854775807L;
    public final d0a n = new d0a();

    public pg6(vtc vtcVar) {
        this.a = vtcVar;
    }

    public final void a(long j, int i, int i2, long j2) {
        a80 a80Var = this.a.d;
        og6 og6Var = this.d;
        boolean z = this.e;
        if (og6Var.j && og6Var.g) {
            og6Var.m = og6Var.c;
            og6Var.j = false;
        } else if (og6Var.h || og6Var.g) {
            if (z && og6Var.i) {
                og6Var.a(i + ((int) (j - og6Var.b)));
            }
            og6Var.k = og6Var.b;
            og6Var.l = og6Var.e;
            og6Var.m = og6Var.c;
            og6Var.i = true;
        }
        if (!this.e) {
            d55 d55Var = this.g;
            d55Var.d(i2);
            d55 d55Var2 = this.h;
            d55Var2.d(i2);
            d55 d55Var3 = this.i;
            d55Var3.d(i2);
            if (d55Var.e && d55Var2.e && d55Var3.e) {
                String str = this.b;
                int i3 = d55Var.c;
                byte[] bArr = new byte[d55Var2.c + i3 + d55Var3.c];
                System.arraycopy((byte[]) d55Var.f, 0, bArr, 0, i3);
                System.arraycopy((byte[]) d55Var2.f, 0, bArr, d55Var.c, d55Var2.c);
                System.arraycopy((byte[]) d55Var3.f, 0, bArr, d55Var.c + d55Var2.c, d55Var3.c);
                p99 p99VarO = n16.O((byte[]) d55Var2.f, 3, d55Var2.c, null);
                m99 m99Var = p99VarO.b;
                String strA = m99Var != null ? d72.a(m99Var.a, m99Var.b, m99Var.c, m99Var.d, m99Var.e, m99Var.f) : null;
                qr5 qr5Var = new qr5();
                qr5Var.a = str;
                qr5Var.n = qv8.l("video/mp2t");
                qr5Var.o = qv8.l("video/hevc");
                qr5Var.k = strA;
                qr5Var.v = p99VarO.e;
                qr5Var.w = p99VarO.f;
                qr5Var.y = p99VarO.g;
                qr5Var.z = p99VarO.h;
                qr5Var.G = new e82(p99VarO.k, p99VarO.l, p99VarO.m, null, p99VarO.c + 8, p99VarO.d + 8);
                qr5Var.D = p99VarO.i;
                qr5Var.q = p99VarO.j;
                qr5Var.H = p99VarO.a + 1;
                qr5Var.r = Collections.singletonList(bArr);
                rr5 rr5Var = new rr5(qr5Var);
                this.c.g(rr5Var);
                int i4 = rr5Var.r;
                pa7.J(i4 != -1);
                a80Var.D(i4);
                this.e = true;
            }
        }
        d55 d55Var4 = this.j;
        boolean zD = d55Var4.d(i2);
        d0a d0aVar = this.n;
        if (zD) {
            d0aVar.K((byte[]) d55Var4.f, n16.a0((byte[]) d55Var4.f, d55Var4.c));
            d0aVar.N(5);
            a80Var.a(j2, d0aVar);
        }
        d55 d55Var5 = this.k;
        if (d55Var5.d(i2)) {
            d0aVar.K((byte[]) d55Var5.f, n16.a0((byte[]) d55Var5.f, d55Var5.c));
            d0aVar.N(5);
            a80Var.a(j2, d0aVar);
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        og6 og6Var = this.d;
        if (og6Var.f) {
            int i3 = og6Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                og6Var.g = (bArr[i4] & 128) != 0;
                og6Var.f = false;
            } else {
                og6Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // defpackage.xs4
    public final void c(d0a d0aVar) {
        int i;
        this.c.getClass();
        String str = pqf.a;
        while (d0aVar.a() > 0) {
            int i2 = d0aVar.b;
            int i3 = d0aVar.c;
            byte[] bArr = d0aVar.a;
            this.l += (long) d0aVar.a();
            this.c.e(d0aVar.a(), d0aVar);
            while (i2 < i3) {
                int iB = n16.B(bArr, i2, i3, this.f);
                if (iB == i3) {
                    b(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i = 3;
                } else {
                    iB--;
                    i = 4;
                }
                int i5 = iB;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    b(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                a(j, i8, i7 < 0 ? -i7 : 0, this.m);
                i(j, i8, i4, this.m);
                i2 = i5 + i6;
            }
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        n16.z(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        this.a.d.o(0);
        og6 og6Var = this.d;
        if (og6Var != null) {
            og6Var.f = false;
            og6Var.g = false;
            og6Var.h = false;
            og6Var.i = false;
            og6Var.j = false;
        }
    }

    @Override // defpackage.xs4
    public final void f() {
        this.c.getClass();
        String str = pqf.a;
        this.a.d.o(0);
        a(this.l, 0, 0, this.m);
        i(this.l, 0, 48, this.m);
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        xg3Var.d();
        xg3Var.i();
        this.b = (String) xg3Var.e;
        xg3Var.i();
        k1f k1fVarN = n95Var.n(xg3Var.c, 2);
        this.c = k1fVarN;
        this.d = new og6(k1fVarN);
        this.a.b(n95Var, xg3Var);
    }

    public final void i(long j, int i, int i2, long j2) {
        og6 og6Var = this.d;
        boolean z = this.e;
        og6Var.g = false;
        og6Var.h = false;
        og6Var.e = j2;
        og6Var.d = 0;
        og6Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (og6Var.i && !og6Var.j) {
                if (z) {
                    og6Var.a(i);
                }
                og6Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                og6Var.h = !og6Var.j;
                og6Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        og6Var.c = z2;
        og6Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.g(i2);
            this.h.g(i2);
            this.i.g(i2);
        }
        this.j.g(i2);
        this.k.g(i2);
    }
}
