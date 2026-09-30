package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zh5 implements l95 {
    public n95 f;
    public k1f g;
    public su8 i;
    public bi5 j;
    public int k;
    public int l;
    public yh5 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final d0a b = new d0a(new byte[32768], 0);
    public final boolean c = false;
    public final boolean d = false;
    public final d82 e = new d82(2);
    public int h = 0;

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        dj6.V(m95Var, false, false);
        d0a d0aVar = new d0a(4);
        ((rq3) m95Var).d(d0aVar.a, 0, 4, false);
        return d0aVar.B() == 1716281667;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        if (j == 0) {
            this.h = 0;
        } else {
            yh5 yh5Var = this.m;
            if (yh5Var != null) {
                yh5Var.d(j2);
            }
        }
        this.o = j2 != 0 ? -1L : 0L;
        this.n = 0;
        this.b.J(0);
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        bi5 bi5Var;
        xsc ir0Var;
        long j;
        long j2;
        boolean zA;
        int i = this.h;
        boolean z = this.d;
        boolean z2 = true;
        int i2 = 0;
        if (i == 0) {
            boolean z3 = !this.c;
            m95Var.k();
            long jE = m95Var.e();
            su8 su8VarV = dj6.V(m95Var, z3, z);
            m95Var.l((int) (m95Var.e() - jE));
            this.i = su8VarV;
            this.h = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            m95Var.o(bArr, 0, bArr.length);
            m95Var.k();
            this.h = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i == 2) {
            d0a d0aVar = new d0a(4);
            m95Var.readFully(d0aVar.a, 0, 4);
            if (d0aVar.B() != 1716281667) {
                throw l0a.a(null, "Failed to read FLAC stream marker.");
            }
            this.h = 3;
            return 0;
        }
        int i5 = 7;
        int i6 = 6;
        if (i == 3) {
            int i7 = 0;
            bi5 bi5Var2 = this.j;
            boolean z4 = false;
            while (!z4) {
                m95Var.k();
                byte[] bArr2 = new byte[i3];
                zu1 zu1Var = new zu1(bArr2, i3);
                m95Var.o(bArr2, i7, i3);
                boolean zF = zu1Var.f();
                int iG = zu1Var.g(i5);
                int iG2 = zu1Var.g(24) + i3;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    m95Var.readFully(bArr3, i7, 38);
                    bi5Var2 = new bi5(bArr3, i3);
                } else {
                    if (bi5Var2 == null) {
                        cva.s();
                        return 0;
                    }
                    su8 su8Var = bi5Var2.l;
                    if (iG == i4) {
                        d0a d0aVar2 = new d0a(iG2);
                        m95Var.readFully(d0aVar2.a, i7, iG2);
                        bi5Var = new bi5(bi5Var2.a, bi5Var2.b, bi5Var2.c, bi5Var2.d, bi5Var2.e, bi5Var2.g, bi5Var2.h, bi5Var2.j, dj6.W(d0aVar2), bi5Var2.l);
                    } else if (iG == i3) {
                        d0a d0aVar3 = new d0a(iG2);
                        m95Var.readFully(d0aVar3.a, 0, iG2);
                        d0aVar3.N(i3);
                        su8 su8VarA = dzf.a(Arrays.asList((String[]) afc.l(d0aVar3, false, false).a));
                        if (su8Var != null) {
                            su8VarA = su8Var.b(su8VarA);
                        }
                        bi5Var = new bi5(bi5Var2.a, bi5Var2.b, bi5Var2.c, bi5Var2.d, bi5Var2.e, bi5Var2.g, bi5Var2.h, bi5Var2.j, bi5Var2.k, su8VarA);
                    } else if (iG != i6) {
                        m95Var.l(iG2);
                    } else if (z) {
                        m95Var.l(iG2);
                    } else {
                        d0a d0aVar4 = new d0a(iG2);
                        m95Var.readFully(d0aVar4.a, 0, iG2);
                        d0aVar4.N(4);
                        su8 su8Var2 = new su8(jy6.s(rda.d(d0aVar4)));
                        if (su8Var != null) {
                            su8Var2 = su8Var.b(su8Var2);
                        }
                        bi5Var = new bi5(bi5Var2.a, bi5Var2.b, bi5Var2.c, bi5Var2.d, bi5Var2.e, bi5Var2.g, bi5Var2.h, bi5Var2.j, bi5Var2.k, su8Var2);
                    }
                    bi5Var2 = bi5Var;
                }
                String str = pqf.a;
                this.j = bi5Var2;
                z4 = zF;
                i3 = 4;
                i4 = 3;
                i5 = 7;
                i6 = 6;
                i7 = 0;
            }
            this.j.getClass();
            this.k = Math.max(this.j.c, 6);
            rr5 rr5VarC = this.j.c(bArr, this.i);
            k1f k1fVar = this.g;
            String str2 = pqf.a;
            qr5 qr5VarA = rr5VarC.a();
            qr5VarA.n = qv8.l("audio/flac");
            k1fVar.g(new rr5(qr5VarA));
            this.g.d(this.j.b());
            this.h = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            m95Var.k();
            d0a d0aVar5 = new d0a(2);
            m95Var.o(d0aVar5.a, 0, 2);
            int iG3 = d0aVar5.G();
            if ((iG3 >> 2) != 16382) {
                m95Var.k();
                throw l0a.a(null, "First frame does not start with sync code.");
            }
            m95Var.k();
            this.l = iG3;
            n95 n95Var = this.f;
            String str3 = pqf.a;
            long position = m95Var.getPosition();
            long length = m95Var.getLength();
            this.j.getClass();
            bi5 bi5Var3 = this.j;
            w84 w84Var = bi5Var3.k;
            if (w84Var != null && ((long[]) w84Var.b).length > 0) {
                ir0Var = new ir0(bi5Var3, position, 1);
                i2 = 0;
            } else if (length == -1 || bi5Var3.j <= 0) {
                i2 = 0;
                ir0Var = new ir0(bi5Var3.b());
            } else {
                int i8 = this.l;
                int i9 = bi5Var3.c;
                r45 r45Var = new r45(i3, bi5Var3);
                xh5 xh5Var = new xh5(bi5Var3, i8);
                long jB = bi5Var3.b();
                long j4 = bi5Var3.j;
                int i10 = bi5Var3.d;
                if (i10 > 0) {
                    j = ((((long) i10) + ((long) i9)) / 2) + 1;
                } else {
                    int i11 = bi5Var3.a;
                    j = 64 + (((((i11 != bi5Var3.b || i11 <= 0) ? 4096L : i11) * ((long) bi5Var3.g)) * ((long) bi5Var3.h)) / 8);
                }
                yh5 yh5Var = new yh5(r45Var, xh5Var, jB, j4, position, length, j, Math.max(6, i9));
                this.m = yh5Var;
                ir0Var = yh5Var.a;
            }
            n95Var.q(ir0Var);
            this.h = 5;
            return i2;
        }
        if (i != 5) {
            r3.l();
            return 0;
        }
        this.g.getClass();
        this.j.getClass();
        yh5 yh5Var2 = this.m;
        if (yh5Var2 != null && yh5Var2.c != null) {
            return yh5Var2.a(m95Var, d82Var);
        }
        if (this.o == -1) {
            bi5 bi5Var4 = this.j;
            m95Var.k();
            m95Var.f(1);
            byte[] bArr4 = new byte[1];
            m95Var.o(bArr4, 0, 1);
            boolean z5 = (bArr4[0] & 1) == 1;
            m95Var.f(2);
            i5 = z5 ? 7 : 6;
            d0a d0aVar6 = new d0a(i5);
            byte[] bArr5 = d0aVar6.a;
            int i12 = 0;
            while (i12 < i5) {
                int iH = m95Var.h(bArr5, i12, i5 - i12);
                if (iH == -1) {
                    break;
                }
                i12 += iH;
            }
            d0aVar6.L(i12);
            m95Var.k();
            try {
                long jH = d0aVar6.H();
                if (!z5) {
                    jH *= (long) bi5Var4.b;
                }
                long j5 = bi5Var4.j;
                if (j5 == 0 || jH <= j5) {
                    j3 = jH;
                } else {
                    z2 = false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z2) {
                throw l0a.a(null, null);
            }
            this.o = j3;
        } else {
            d0a d0aVar7 = this.b;
            int i13 = d0aVar7.c;
            if (i13 < 32768) {
                int i14 = m95Var.read(d0aVar7.a, i13, 32768 - i13);
                z2 = i14 == -1;
                if (!z2) {
                    d0aVar7.L(i13 + i14);
                } else if (d0aVar7.a() == 0) {
                    long j6 = this.o * 1000000;
                    bi5 bi5Var5 = this.j;
                    String str4 = pqf.a;
                    this.g.a(j6 / ((long) bi5Var5.e), 1, this.n, 0, null);
                    return -1;
                }
            } else {
                z2 = false;
            }
            int i15 = d0aVar7.b;
            int i16 = this.n;
            int i17 = this.k;
            if (i16 < i17) {
                d0aVar7.N(Math.min(i17 - i16, d0aVar7.a()));
            }
            this.j.getClass();
            int i18 = d0aVar7.b;
            while (true) {
                int i19 = d0aVar7.c - 16;
                d82 d82Var2 = this.e;
                if (i18 > i19) {
                    if (z2) {
                        while (true) {
                            int i20 = d0aVar7.c;
                            if (i18 <= i20 - this.k) {
                                d0aVar7.M(i18);
                                try {
                                    zA = db6.A(d0aVar7, this.j, this.l, d82Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zA = false;
                                }
                                if (d0aVar7.b > d0aVar7.c) {
                                    zA = false;
                                }
                                if (zA) {
                                    d0aVar7.M(i18);
                                    j2 = d82Var2.b;
                                    break;
                                }
                                i18++;
                            } else {
                                d0aVar7.M(i20);
                            }
                        }
                    } else {
                        d0aVar7.M(i18);
                    }
                    j2 = -1;
                    break;
                }
                d0aVar7.M(i18);
                if (db6.A(d0aVar7, this.j, this.l, d82Var2)) {
                    d0aVar7.M(i18);
                    j2 = d82Var2.b;
                    break;
                }
                i18++;
            }
            int i21 = d0aVar7.b - i15;
            d0aVar7.M(i15);
            this.g.e(i21, d0aVar7);
            int i22 = this.n + i21;
            this.n = i22;
            if (j2 != -1) {
                long j7 = this.o * 1000000;
                bi5 bi5Var6 = this.j;
                String str5 = pqf.a;
                this.g.a(j7 / ((long) bi5Var6.e), 1, i22, 0, null);
                this.n = 0;
                this.o = j2;
            }
            int length2 = d0aVar7.a.length - d0aVar7.c;
            if (d0aVar7.a() < 16 && length2 < 16) {
                int iA = d0aVar7.a();
                byte[] bArr6 = d0aVar7.a;
                System.arraycopy(bArr6, d0aVar7.b, bArr6, 0, iA);
                d0aVar7.M(0);
                d0aVar7.L(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.f = n95Var;
        this.g = n95Var.n(0, 1);
        n95Var.j();
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
