package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lca implements x5f {
    public final xs4 a;
    public final zu1 b = new zu1(new byte[10], 10);
    public int c = 0;
    public int d;
    public rye e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public lca(xs4 xs4Var) {
        this.a = xs4Var;
    }

    @Override // defpackage.x5f
    public final void a(int i, d0a d0aVar) {
        int i2;
        int i3;
        long jB;
        this.e.getClass();
        int i4 = i & 1;
        int i5 = -1;
        int i6 = 2;
        xs4 xs4Var = this.a;
        if (i4 != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    xo1.V("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        r3.l();
                        return;
                    }
                    if (this.j != -1) {
                        xo1.V("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    xs4Var.e();
                }
            }
            if (d0aVar.c == 0) {
                xs4Var.f();
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i;
        while (d0aVar.a() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                zu1 zu1Var = this.b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (c(d0aVar, zu1Var.b, Math.min(10, this.i)) && c(d0aVar, null, this.i)) {
                            zu1Var.m(0);
                            if (this.f) {
                                zu1Var.o(4);
                                long jG = ((long) zu1Var.g(3)) << 30;
                                zu1Var.o(1);
                                long jG2 = ((long) (zu1Var.g(15) << 15)) | jG;
                                zu1Var.o(1);
                                long jG3 = jG2 | ((long) zu1Var.g(15));
                                zu1Var.o(1);
                                if (!this.h && this.g) {
                                    zu1Var.o(4);
                                    long jG4 = ((long) zu1Var.g(3)) << 30;
                                    zu1Var.o(1);
                                    long jG5 = jG4 | ((long) (zu1Var.g(15) << 15));
                                    zu1Var.o(1);
                                    long jG6 = jG5 | ((long) zu1Var.g(15));
                                    zu1Var.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                jB = this.e.b(jG3);
                            } else {
                                jB = -9223372036854775807L;
                            }
                            i8 |= this.k ? 4 : 0;
                            xs4Var.g(i8, jB);
                            this.c = 3;
                            this.d = 0;
                            i5 = -1;
                            i6 = 2;
                        }
                    } else {
                        if (i9 != 3) {
                            r3.l();
                            return;
                        }
                        int iA = d0aVar.a();
                        int i10 = this.j;
                        int i11 = i10 == i5 ? 0 : iA - i10;
                        if (i11 > 0) {
                            iA -= i11;
                            d0aVar.L(d0aVar.b + iA);
                        }
                        xs4Var.c(d0aVar);
                        int i12 = this.j;
                        if (i12 != i5) {
                            int i13 = i12 - iA;
                            this.j = i13;
                            if (i13 == 0) {
                                xs4Var.e();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                    i2 = i6;
                } else if (c(d0aVar, zu1Var.b, 9)) {
                    zu1Var.m(0);
                    int iG = zu1Var.g(24);
                    if (iG != 1) {
                        kv2.w(iG, "Unexpected start code prefix: ", "PesReader");
                        i5 = -1;
                        this.j = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        zu1Var.o(8);
                        int iG2 = zu1Var.g(16);
                        zu1Var.o(5);
                        this.k = zu1Var.f();
                        i2 = 2;
                        zu1Var.o(2);
                        this.f = zu1Var.f();
                        this.g = zu1Var.f();
                        zu1Var.o(6);
                        int iG3 = zu1Var.g(8);
                        this.i = iG3;
                        if (iG2 == 0) {
                            this.j = -1;
                            i5 = -1;
                        } else {
                            int i14 = (iG2 - 3) - iG3;
                            this.j = i14;
                            if (i14 < 0) {
                                xo1.V("PesReader", "Found negative packet payload size: " + this.j);
                                i5 = -1;
                                this.j = -1;
                            } else {
                                i5 = -1;
                            }
                        }
                        i3 = 2;
                    }
                    this.c = i3;
                    this.d = 0;
                } else {
                    i5 = -1;
                    i2 = 2;
                }
            } else {
                i2 = i6;
                d0aVar.N(d0aVar.a());
            }
            i6 = i2;
        }
    }

    @Override // defpackage.x5f
    public final void b(rye ryeVar, n95 n95Var, xg3 xg3Var) {
        this.e = ryeVar;
        this.a.h(n95Var, xg3Var);
    }

    public final boolean c(d0a d0aVar, byte[] bArr, int i) {
        int iMin = Math.min(d0aVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            d0aVar.N(iMin);
        } else {
            d0aVar.k(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // defpackage.x5f
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }
}
