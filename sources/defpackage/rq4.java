package defpackage;

import com.adjust.sdk.sig.r3;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rq4 implements xs4 {
    public final d0a a;
    public final String c;
    public final int d;
    public String e;
    public k1f f;
    public int h;
    public int i;
    public int j;
    public long k;
    public rr5 l;
    public int m;
    public int n;
    public int o;
    public boolean r;
    public boolean u;
    public boolean v;
    public int g = 0;
    public long s = -9223372036854775807L;
    public long t = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int p = -1;
    public int q = -1;

    public rq4(String str, int i, int i2) {
        this.a = new d0a(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    public final boolean a(d0a d0aVar, byte[] bArr, int i) {
        int iMin = Math.min(d0aVar.a(), i - this.h);
        d0aVar.k(bArr, this.h, iMin);
        int i2 = this.h + iMin;
        this.h = i2;
        return i2 == i;
    }

    public final void b(int i) {
        byte[] bArr = this.a.a;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.h = 4;
    }

    @Override // defpackage.xs4
    public final void c(d0a d0aVar) throws l0a {
        int i;
        byte b;
        int i2;
        byte b2;
        int iG;
        int i3;
        int i4;
        this.f.getClass();
        while (d0aVar.a() > 0) {
            int i5 = this.g;
            long jN = -9223372036854775807L;
            d0a d0aVar2 = this.a;
            switch (i5) {
                case 0:
                    while (d0aVar.a() > 0) {
                        int i6 = this.j << 8;
                        this.j = i6;
                        int iZ = i6 | d0aVar.z();
                        this.j = iZ;
                        int iS = y41.s(iZ);
                        this.o = iS;
                        if (iS != 0) {
                            b(this.j);
                            this.j = 0;
                            if (!this.v || this.o != 2) {
                                int i7 = this.o;
                                if (i7 == 1) {
                                    this.v = false;
                                }
                                if (i7 != 3 && i7 != 4) {
                                    if (i7 == 1) {
                                        this.g = 1;
                                    } else {
                                        this.g = 2;
                                    }
                                }
                                this.g = 4;
                            }
                            this.h = 0;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (a(d0aVar, d0aVar2.a, 18)) {
                        this.u = true;
                        byte[] bArr = d0aVar2.a;
                        if (this.l == null) {
                            String str = this.e;
                            zu1 zu1VarU = y41.u(bArr);
                            zu1VarU.o(60);
                            int i8 = y41.f[zu1VarU.g(6)];
                            int i9 = y41.g[zu1VarU.g(4)];
                            int iG2 = zu1VarU.g(5);
                            int i10 = iG2 >= 29 ? -1 : (y41.h[iG2] * 1000) / 2;
                            zu1VarU.o(10);
                            int i11 = i8 + (zu1VarU.g(2) > 0 ? 1 : 0);
                            qr5 qr5Var = new qr5();
                            qr5Var.a = str;
                            qr5Var.n = qv8.l("video/mp2t");
                            qr5Var.o = qv8.l("audio/vnd.dts");
                            qr5Var.i = i10;
                            qr5Var.I = i11;
                            qr5Var.K = i9;
                            qr5Var.s = null;
                            qr5Var.d = this.c;
                            qr5Var.f = this.d;
                            this.l = new rr5(qr5Var);
                            this.r = true;
                        }
                        this.m = y41.r(bArr);
                        byte b3 = bArr[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr[4] & 7) << 4;
                                b2 = bArr[7];
                            } else if (b3 != 31) {
                                i = (bArr[4] & 1) << 6;
                                b = bArr[5];
                            } else {
                                i = (bArr[r3] & 7) << 4;
                                b2 = bArr[6];
                            }
                            i2 = b2 & 60;
                            this.k = rxg.B(pqf.L(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                            d0aVar2.M(0);
                            this.f.e(18, d0aVar2);
                            this.g = 6;
                        } else {
                            i = (bArr[r3] & 1) << 6;
                            b = bArr[4];
                        }
                        i2 = b & 252;
                        this.k = rxg.B(pqf.L(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                        d0aVar2.M(0);
                        this.f.e(18, d0aVar2);
                        this.g = 6;
                        break;
                    }
                    break;
                case 2:
                    if (a(d0aVar, d0aVar2.a, 7)) {
                        zu1 zu1VarU2 = y41.u(d0aVar2.a);
                        zu1VarU2.o(42);
                        this.p = zu1VarU2.g(zu1VarU2.f() ? 12 : 8) + 1;
                        this.g = 3;
                    }
                    break;
                case 3:
                    if (a(d0aVar, d0aVar2.a, this.p)) {
                        sq4 sq4VarH = y41.H(d0aVar2.a);
                        i(sq4VarH);
                        this.m = sq4VarH.d;
                        long j = sq4VarH.b;
                        if (j != -9223372036854775807L) {
                            this.k = j;
                        }
                        d0aVar2.M(0);
                        this.f.e(this.p, d0aVar2);
                        this.g = 6;
                    }
                    break;
                case 4:
                    if (a(d0aVar, d0aVar2.a, 6)) {
                        zu1 zu1VarU3 = y41.u(d0aVar2.a);
                        zu1VarU3.o(32);
                        int iJ = y41.J(zu1VarU3, y41.n) + 1;
                        this.q = iJ;
                        int i12 = this.h;
                        if (i12 > iJ) {
                            int i13 = i12 - iJ;
                            this.h = i12 - i13;
                            d0aVar.M(d0aVar.b - i13);
                        }
                        this.g = 5;
                    }
                    break;
                case 5:
                    if (a(d0aVar, d0aVar2.a, this.q)) {
                        byte[] bArr2 = d0aVar2.a;
                        zu1 zu1VarU4 = y41.u(bArr2);
                        int i14 = zu1VarU4.g(32) == 1078008818 ? 1 : 0;
                        int iJ2 = y41.J(zu1VarU4, y41.j);
                        int i15 = iJ2 + 1;
                        if (i14 == 0) {
                            iG = -2147483647;
                        } else {
                            if (!zu1VarU4.f()) {
                                throw l0a.b("Only supports full channel mask-based audio presentation");
                            }
                            int i16 = iJ2 - 1;
                            int i17 = (bArr2[iJ2] & 255) | ((bArr2[i16] << 8) & 65535);
                            String str2 = pqf.a;
                            int i18 = 65535;
                            for (int i19 = 0; i19 < i16; i19++) {
                                byte b4 = bArr2[i19];
                                int i20 = (((b4 & 255) >> 4) ^ ((i18 >> 12) & 255)) & 255;
                                int i21 = (i18 << 4) & 65535;
                                int[] iArr = pqf.i;
                                int i22 = (iArr[i20] ^ i21) & 65535;
                                i18 = (((i22 << 4) & 65535) ^ iArr[((b4 & 15) ^ ((i22 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i17 != i18) {
                                throw l0a.a(null, "CRC check failed");
                            }
                            int iG3 = zu1VarU4.g(2);
                            if (iG3 == 0) {
                                i3 = 512;
                            } else if (iG3 == 1) {
                                i3 = 480;
                            } else {
                                if (iG3 != 2) {
                                    throw l0a.a(null, "Unsupported base duration index in DTS UHD header: " + iG3);
                                }
                                i3 = 384;
                            }
                            int iG4 = (zu1VarU4.g(3) + 1) * i3;
                            int iG5 = zu1VarU4.g(2);
                            if (iG5 == 0) {
                                i4 = 32000;
                            } else if (iG5 == 1) {
                                i4 = 44100;
                            } else {
                                if (iG5 != 2) {
                                    throw l0a.a(null, "Unsupported clock rate index in DTS UHD header: " + iG5);
                                }
                                i4 = 48000;
                            }
                            if (zu1VarU4.f()) {
                                zu1VarU4.o(36);
                            }
                            iG = (1 << zu1VarU4.g(2)) * i4;
                            jN = pqf.N(iG4, 1000000L, i4, RoundingMode.DOWN);
                        }
                        int i23 = iG;
                        int iJ3 = 0;
                        for (int i24 = 0; i24 < i14; i24++) {
                            iJ3 += y41.J(zu1VarU4, y41.k);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i14 != 0) {
                            atomicInteger.set(y41.J(zu1VarU4, y41.l));
                        }
                        int iJ4 = iJ3 + (atomicInteger.get() != 0 ? y41.J(zu1VarU4, y41.m) : 0) + i15;
                        sq4 sq4Var = new sq4(2, i23, iJ4, jN, "audio/vnd.dts.uhd;profile=p2");
                        if (this.o == 3) {
                            i(sq4Var);
                        }
                        this.m = iJ4;
                        if (jN == -9223372036854775807) {
                            jN = 0;
                        }
                        this.k = jN;
                        d0aVar2.M(0);
                        this.f.e(this.q, d0aVar2);
                        this.g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(d0aVar.a(), this.m - this.h);
                    this.f.e(iMin, d0aVar);
                    int i25 = this.h + iMin;
                    this.h = i25;
                    int i26 = this.m;
                    if (i25 == i26) {
                        if (this.o == 1) {
                            this.n = i26;
                            this.h = 0;
                            this.i = 0;
                            this.g = 7;
                        } else {
                            pa7.J(this.s != -9223372036854775807L);
                            int i27 = this.m;
                            int i28 = this.o;
                            int i29 = i27 + (i28 == 2 ? this.n : 0);
                            long j2 = this.s;
                            this.f.a(j2, i28 == 4 ? 0 : 1, i29, 0, null);
                            this.s += this.k;
                            long j3 = this.t;
                            if (j3 != -9223372036854775807L) {
                                if (j3 != j2) {
                                    this.s = j3;
                                }
                                this.t = -9223372036854775807L;
                            }
                            this.n = 0;
                            this.g = 0;
                        }
                    }
                    break;
                case 7:
                    while (d0aVar.a() > 0 && this.h < 4) {
                        int i30 = this.i << 8;
                        this.i = i30;
                        this.i = i30 | d0aVar.z();
                        this.h++;
                    }
                    if (this.h == 4) {
                        if (y41.s(this.i) == 2) {
                            b(this.i);
                            this.o = 2;
                            this.i = 0;
                            this.g = 2;
                        } else {
                            if (this.r) {
                                k1f k1fVar = this.f;
                                rr5 rr5Var = this.l;
                                rr5Var.getClass();
                                k1fVar.g(rr5Var);
                                this.r = false;
                            }
                            pa7.J(this.s != -9223372036854775807L);
                            long j4 = this.s;
                            this.f.a(j4, 1, this.n, 0, null);
                            this.s += this.k;
                            long j5 = this.t;
                            if (j5 != -9223372036854775807L) {
                                if (j5 != j4) {
                                    this.s = j5;
                                }
                                this.t = -9223372036854775807L;
                            }
                            this.n = 0;
                            int i31 = this.i;
                            this.j = i31;
                            this.i = 0;
                            int iS2 = y41.s(i31);
                            this.o = iS2;
                            if (iS2 == 3 || iS2 == 4) {
                                b(this.j);
                                this.j = 0;
                                this.g = 4;
                            } else if (iS2 == 1) {
                                b(this.j);
                                this.j = 0;
                                this.g = 1;
                            } else {
                                this.h = 0;
                                this.g = 0;
                            }
                        }
                    }
                    break;
                default:
                    r3.l();
                    return;
            }
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        this.g = 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.n = 0;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.b.set(0);
        this.r = false;
        this.v = this.u;
    }

    @Override // defpackage.xs4
    public final void f() {
        if (this.g == 7) {
            this.f.getClass();
            if (this.r) {
                k1f k1fVar = this.f;
                rr5 rr5Var = this.l;
                rr5Var.getClass();
                k1fVar.g(rr5Var);
                this.r = false;
            }
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.f.a(j, 1, this.n, 0, null);
                this.s += this.k;
            }
            this.n = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        if (j != -9223372036854775807L) {
            if (this.g != 0) {
                this.t = j;
            } else {
                this.s = j;
                this.t = -9223372036854775807L;
            }
        }
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        xg3Var.d();
        xg3Var.i();
        this.e = (String) xg3Var.e;
        xg3Var.i();
        this.f = n95Var.n(xg3Var.c, 1);
    }

    public final void i(sq4 sq4Var) {
        int i = sq4Var.a;
        int i2 = sq4Var.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        String str = (String) sq4Var.e;
        if (str == null) {
            rr5 rr5Var = this.l;
            str = rr5Var != null ? rr5Var.p : null;
        }
        rr5 rr5Var2 = this.l;
        if (rr5Var2 != null && !this.r && i2 == rr5Var2.J && i == rr5Var2.L && Objects.equals(str, rr5Var2.p)) {
            return;
        }
        rr5 rr5Var3 = this.l;
        qr5 qr5Var = rr5Var3 == null ? new qr5() : rr5Var3.a();
        qr5Var.a = this.e;
        qr5Var.n = qv8.l("video/mp2t");
        qr5Var.o = qv8.l(str);
        qr5Var.I = i2;
        qr5Var.K = i;
        qr5Var.d = this.c;
        qr5Var.f = this.d;
        rr5 rr5Var4 = new rr5(qr5Var);
        this.l = rr5Var4;
        this.f.g(rr5Var4);
        this.r = false;
    }
}
