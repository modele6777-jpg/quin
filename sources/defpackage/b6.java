package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b6 implements xs4 {
    public final /* synthetic */ int a;
    public final zu1 b;
    public final d0a c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public k1f h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public rr5 m;
    public int n;
    public long o;

    public b6(String str, int i, String str2, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                zu1 zu1Var = new zu1(new byte[16], 16);
                this.b = zu1Var;
                this.c = new d0a(zu1Var.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                zu1 zu1Var2 = new zu1(new byte[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS], UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                this.b = zu1Var2;
                this.c = new d0a(zu1Var2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0369  */
    /* JADX WARN: Code duplicated, block: B:186:0x0377  */
    /* JADX WARN: Code duplicated, block: B:188:0x037f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0395 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0397  */
    /* JADX WARN: Code duplicated, block: B:197:0x039c  */
    /* JADX WARN: Code duplicated, block: B:199:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xs4
    public final void c(d0a d0aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iG;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j;
        d0aVar = d0aVar;
        int i19 = this.a;
        int i20 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        zu1 zu1Var = this.b;
        long j2 = -9223372036854775807L;
        int i21 = 0;
        int i22 = 1;
        int i23 = 2;
        d0a d0aVar2 = this.c;
        int i24 = 16;
        switch (i19) {
            case 0:
                this.h.getClass();
                while (d0aVar.a() > 0) {
                    int i25 = this.i;
                    if (i25 == 0) {
                        while (true) {
                            if (d0aVar.a() <= 0) {
                                i21 = 0;
                                i22 = 1;
                                i23 = 2;
                            } else if (this.k) {
                                int iZ = d0aVar.z();
                                if (iZ == 119) {
                                    this.k = false;
                                    i22 = 1;
                                    this.i = 1;
                                    byte[] bArr = d0aVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    i23 = 2;
                                    i21 = 0;
                                } else {
                                    this.k = iZ == 11;
                                }
                            } else {
                                this.k = d0aVar.z() == 11;
                            }
                        }
                    } else if (i25 == i22) {
                        byte[] bArr2 = d0aVar2.a;
                        int iMin = Math.min(d0aVar.a(), 128 - this.j);
                        d0aVar.k(bArr2, this.j, iMin);
                        int i26 = this.j + iMin;
                        this.j = i26;
                        if (i26 == 128) {
                            zu1Var.m(i21);
                            int[] iArr = b21.d;
                            int[] iArr2 = b21.b;
                            int iE = zu1Var.e();
                            zu1Var.o(40);
                            int i27 = zu1Var.g(5) > 10 ? i22 : 0;
                            zu1Var.m(iE);
                            if (i27 != 0) {
                                zu1Var.o(i24);
                                int iG2 = zu1Var.g(i23);
                                if (iG2 == 0) {
                                    i6 = 0;
                                } else if (iG2 != i22) {
                                    i6 = iG2 != i23 ? -1 : i23;
                                } else {
                                    i6 = i22;
                                }
                                zu1Var.o(3);
                                iG = (zu1Var.g(11) + i22) * i23;
                                int iG3 = zu1Var.g(i23);
                                if (iG3 == 3) {
                                    i5 = b21.c[zu1Var.g(i23)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int iG4 = zu1Var.g(i23);
                                    int i28 = b21.a[iG4];
                                    i5 = iArr2[iG3];
                                    i7 = iG4;
                                    i8 = i28;
                                }
                                i4 = i8 * 256;
                                int i29 = (iG * i5) / (i8 * 32);
                                int iG5 = zu1Var.g(3);
                                boolean zF = zu1Var.f();
                                int i30 = iArr[iG5] + (zF ? 1 : 0);
                                zu1Var.o(10);
                                if (zu1Var.f()) {
                                    zu1Var.o(8);
                                }
                                if (iG5 == 0) {
                                    zu1Var.o(5);
                                    if (zu1Var.f()) {
                                        zu1Var.o(8);
                                    }
                                }
                                if (i6 == 1 && zu1Var.f()) {
                                    zu1Var.o(16);
                                }
                                if (zu1Var.f()) {
                                    if (iG5 > 2) {
                                        zu1Var.o(2);
                                    }
                                    if ((iG5 & 1) == 0 || iG5 <= 2) {
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        zu1Var.o(6);
                                    }
                                    if ((iG5 & 4) != 0) {
                                        zu1Var.o(i14);
                                    }
                                    if (zF && zu1Var.f()) {
                                        zu1Var.o(5);
                                    }
                                    if (i6 == 0) {
                                        if (zu1Var.f()) {
                                            i15 = 6;
                                            zu1Var.o(6);
                                        } else {
                                            i15 = 6;
                                        }
                                        if (iG5 == 0 && zu1Var.f()) {
                                            zu1Var.o(i15);
                                        }
                                        if (zu1Var.f()) {
                                            zu1Var.o(i15);
                                        }
                                        i9 = i30;
                                        int iG6 = zu1Var.g(2);
                                        if (iG6 == 1) {
                                            zu1Var.o(5);
                                        } else if (iG6 == 2) {
                                            zu1Var.o(12);
                                        } else {
                                            if (iG6 == 3) {
                                                int iG7 = zu1Var.g(5);
                                                if (zu1Var.f()) {
                                                    zu1Var.o(5);
                                                    if (zu1Var.f()) {
                                                        i17 = 4;
                                                        zu1Var.o(4);
                                                    } else {
                                                        i17 = 4;
                                                    }
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(i17);
                                                    }
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(i17);
                                                    }
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(i17);
                                                    }
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(i17);
                                                    }
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(i17);
                                                    }
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(i17);
                                                    }
                                                    if (zu1Var.f()) {
                                                        if (zu1Var.f()) {
                                                            zu1Var.o(i17);
                                                        }
                                                        if (zu1Var.f()) {
                                                            zu1Var.o(i17);
                                                        }
                                                    }
                                                }
                                                if (zu1Var.f()) {
                                                    zu1Var.o(5);
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(7);
                                                        if (zu1Var.f()) {
                                                            zu1Var.o(8);
                                                            i16 = 2;
                                                        } else {
                                                            i16 = 2;
                                                        }
                                                    } else {
                                                        i16 = 2;
                                                    }
                                                } else {
                                                    i16 = 2;
                                                }
                                                zu1Var.o((iG7 + i16) * 8);
                                                zu1Var.c();
                                            }
                                            if (iG5 < i16) {
                                                if (zu1Var.f()) {
                                                    zu1Var.o(14);
                                                }
                                                if (iG5 == 0 && zu1Var.f()) {
                                                    zu1Var.o(14);
                                                }
                                            }
                                            i10 = i7;
                                            if (zu1Var.f()) {
                                                if (i10 == 0) {
                                                    zu1Var.o(5);
                                                } else {
                                                    for (i18 = 0; i18 < i8; i18++) {
                                                        if (zu1Var.f()) {
                                                            zu1Var.o(5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i16 = 2;
                                        if (iG5 < i16) {
                                            if (zu1Var.f()) {
                                                zu1Var.o(14);
                                            }
                                            if (iG5 == 0) {
                                                zu1Var.o(14);
                                            }
                                        }
                                        i10 = i7;
                                        if (zu1Var.f()) {
                                            if (i10 == 0) {
                                                zu1Var.o(5);
                                            } else {
                                                while (i18 < i8) {
                                                    if (zu1Var.f()) {
                                                        zu1Var.o(5);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i9 = i30;
                                        i10 = i7;
                                    }
                                } else {
                                    i9 = i30;
                                    i10 = i7;
                                }
                                if (zu1Var.f()) {
                                    zu1Var.o(5);
                                    if (iG5 == 2) {
                                        zu1Var.o(4);
                                    }
                                    if (iG5 >= 6) {
                                        zu1Var.o(2);
                                    }
                                    if (zu1Var.f()) {
                                        i13 = 8;
                                        zu1Var.o(8);
                                    } else {
                                        i13 = 8;
                                    }
                                    if (iG5 == 0 && zu1Var.f()) {
                                        zu1Var.o(i13);
                                    }
                                    i11 = 3;
                                    if (iG3 < 3) {
                                        zu1Var.n();
                                    }
                                } else {
                                    i11 = 3;
                                }
                                if (i6 == 0 && i10 != i11) {
                                    zu1Var.n();
                                }
                                if (i6 == 2 && (i10 == i11 || zu1Var.f())) {
                                    i12 = 6;
                                    zu1Var.o(6);
                                } else {
                                    i12 = 6;
                                }
                                str = (zu1Var.f() && zu1Var.g(i12) == 1 && zu1Var.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i = i29;
                                i3 = i9;
                            } else {
                                zu1Var.o(32);
                                int iG8 = zu1Var.g(2);
                                String str4 = iG8 == 3 ? null : "audio/ac3";
                                int iG9 = zu1Var.g(6);
                                i = b21.e[iG9 / 2] * 1000;
                                int iY = b21.y(iG8, iG9);
                                zu1Var.o(8);
                                int iG10 = zu1Var.g(3);
                                if ((iG10 & 1) == 0 || iG10 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    zu1Var.o(2);
                                }
                                if ((iG10 & 4) != 0) {
                                    zu1Var.o(i2);
                                }
                                if (iG10 == i2) {
                                    zu1Var.o(i2);
                                }
                                int i31 = iG8 < 3 ? iArr2[iG8] : -1;
                                i3 = iArr[iG10] + (zu1Var.f() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                iG = iY;
                                i5 = i31;
                            }
                            rr5 rr5Var = this.m;
                            if (rr5Var == null || i3 != rr5Var.J || i5 != rr5Var.L || !Objects.equals(str, rr5Var.p)) {
                                qr5 qr5Var = new qr5();
                                qr5Var.a = this.g;
                                qr5Var.n = qv8.l(str3);
                                qr5Var.o = qv8.l(str);
                                qr5Var.I = i3;
                                qr5Var.K = i5;
                                qr5Var.d = str2;
                                qr5Var.f = i20;
                                qr5Var.j = i;
                                if ("audio/ac3".equals(str)) {
                                    qr5Var.i = i;
                                }
                                rr5 rr5Var2 = new rr5(qr5Var);
                                this.m = rr5Var2;
                                this.h.g(rr5Var2);
                            }
                            this.n = iG;
                            this.l = (((long) i4) * 1000000) / ((long) this.m.L);
                            d0aVar2.M(0);
                            this.h.e(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, d0aVar2);
                            this.i = 2;
                            i23 = 2;
                            i21 = 0;
                            i22 = 1;
                        } else {
                            d0aVar = d0aVar;
                        }
                    } else if (i25 == i23) {
                        int iMin2 = Math.min(d0aVar.a(), this.n - this.j);
                        this.h.e(iMin2, d0aVar);
                        int i32 = this.j + iMin2;
                        this.j = i32;
                        if (i32 == this.n) {
                            pa7.J(this.o != -9223372036854775807L ? i22 : i21);
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = i21;
                        }
                    }
                    i24 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (d0aVar.a() > 0) {
                    int i33 = this.i;
                    if (i33 == 0) {
                        j = j2;
                        while (d0aVar.a() > 0) {
                            if (this.k) {
                                int iZ2 = d0aVar.z();
                                this.k = iZ2 == 172;
                                if (iZ2 == 64 || iZ2 == 65) {
                                    byte b = iZ2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = d0aVar2.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (b == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = d0aVar.z() == 172;
                            }
                        }
                    } else if (i33 == 1) {
                        j = j2;
                        byte[] bArr4 = d0aVar2.a;
                        int iMin3 = Math.min(d0aVar.a(), 16 - this.j);
                        d0aVar.k(bArr4, this.j, iMin3);
                        int i34 = this.j + iMin3;
                        this.j = i34;
                        if (i34 == 16) {
                            zu1Var.m(0);
                            e6 e6VarT = g21.T(zu1Var);
                            int i35 = e6VarT.a;
                            rr5 rr5Var3 = this.m;
                            if (rr5Var3 == null || 2 != rr5Var3.J || i35 != rr5Var3.L || !"audio/ac4".equals(rr5Var3.p)) {
                                qr5 qr5Var2 = new qr5();
                                qr5Var2.a = this.g;
                                qr5Var2.n = qv8.l(str3);
                                qr5Var2.o = qv8.l("audio/ac4");
                                qr5Var2.I = 2;
                                qr5Var2.K = i35;
                                qr5Var2.d = str2;
                                qr5Var2.f = i20;
                                rr5 rr5Var4 = new rr5(qr5Var2);
                                this.m = rr5Var4;
                                this.h.g(rr5Var4);
                            }
                            this.n = e6VarT.b;
                            this.l = (((long) e6VarT.c) * 1000000) / ((long) this.m.L);
                            d0aVar2.M(0);
                            this.h.e(16, d0aVar2);
                            this.i = 2;
                        }
                    } else if (i33 == 2) {
                        int iMin4 = Math.min(d0aVar.a(), this.n - this.j);
                        this.h.e(iMin4, d0aVar);
                        int i36 = this.j + iMin4;
                        this.j = i36;
                        if (i36 == this.n) {
                            pa7.J(this.o != j2);
                            j = j2;
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        switch (this.a) {
            case 0:
                xg3Var.d();
                xg3Var.i();
                this.g = (String) xg3Var.e;
                xg3Var.i();
                this.h = n95Var.n(xg3Var.c, 1);
                break;
            default:
                xg3Var.d();
                xg3Var.i();
                this.g = (String) xg3Var.e;
                xg3Var.i();
                this.h = n95Var.n(xg3Var.c, 1);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b6(String str) {
        this(null, 0, str, 0);
        this.a = 0;
    }
}
