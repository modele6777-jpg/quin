package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v49 implements xs4 {
    public String e;
    public k1f f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final d0a a = new d0a(new byte[15], 2);
    public final zu1 b = new zu1();
    public final d0a c = new d0a();
    public final rh0 p = new rh0();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // defpackage.xs4
    public final void c(d0a d0aVar) throws l0a {
        int i;
        int i2;
        int iG;
        int iG2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        yob yobVarT;
        int iG3;
        long j3;
        boolean z;
        int i4;
        this.f.getClass();
        while (d0aVar.a() > 0) {
            int i5 = this.d;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (i5 != 0) {
                d0a d0aVar2 = this.c;
                rh0 rh0Var = this.p;
                if (i5 == 1) {
                    int iA = d0aVar.a();
                    d0a d0aVar3 = this.a;
                    int iMin = Math.min(iA, d0aVar3.a());
                    d0aVar.k(d0aVar3.a, d0aVar3.b, iMin);
                    d0aVar3.N(iMin);
                    if (d0aVar3.a() == 0) {
                        int i9 = d0aVar3.c;
                        byte[] bArr2 = d0aVar3.a;
                        zu1 zu1Var = this.b;
                        zu1Var.l(bArr2, i9);
                        zu1Var.d();
                        int iK = cgg.K(zu1Var, 3, 8, 8);
                        rh0Var.b = iK;
                        if (iK != -1) {
                            pa7.A(Math.max(Math.max(2, 8), 32) <= 63);
                            cn1.q(cn1.q(3L, 255L), 4294967296L);
                            if (zu1Var.b() < 2) {
                                j3 = -1;
                            } else {
                                long jI = zu1Var.i(2);
                                if (jI == 3) {
                                    if (zu1Var.b() >= 8) {
                                        long jI2 = zu1Var.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (zu1Var.b() >= 32) {
                                                jI = zu1Var.i(32) + jI;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jI;
                            }
                            rh0Var.c = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw l0a.b("Contains sub-stream with an invalid packet label " + rh0Var.c);
                                }
                                if (j3 == 0) {
                                    int i10 = rh0Var.b;
                                    if (i10 == 1) {
                                        throw l0a.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i10 == 2) {
                                        throw l0a.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i10 == 17) {
                                        throw l0a.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iK2 = cgg.K(zu1Var, 11, 24, 24);
                                rh0Var.d = iK2;
                                if (iK2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i4 = 0;
                            this.n = 0;
                            this.o = rh0Var.d + i9 + this.o;
                        } else {
                            i4 = 0;
                        }
                        if (z) {
                            d0aVar3.M(i4);
                            this.f.e(d0aVar3.c, d0aVar3);
                            d0aVar3.J(2);
                            d0aVar2.J(rh0Var.d);
                            this.m = true;
                            this.d = 2;
                        } else {
                            int i11 = d0aVar3.c;
                            if (i11 < 15) {
                                d0aVar3.L(i11 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i5 != 2) {
                        r3.l();
                        return;
                    }
                    int i12 = rh0Var.b;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = d0aVar.b;
                        int iMin2 = Math.min(d0aVar.a(), d0aVar2.a());
                        d0aVar.k(d0aVar2.a, d0aVar2.b, iMin2);
                        d0aVar2.N(iMin2);
                        d0aVar.M(i13);
                    }
                    int iMin3 = Math.min(d0aVar.a(), rh0Var.d - this.n);
                    this.f.e(iMin3, d0aVar);
                    int i14 = this.n + iMin3;
                    this.n = i14;
                    if (i14 != rh0Var.d) {
                        continue;
                    } else {
                        int i15 = rh0Var.b;
                        if (i15 == 1) {
                            byte[] bArr3 = d0aVar2.a;
                            zu1 zu1Var2 = new zu1(bArr3, bArr3.length);
                            int iG4 = zu1Var2.g(8);
                            int iG5 = zu1Var2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = 48000;
                                        break;
                                    case 4:
                                        iG2 = 44100;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = 16000;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                        iG2 = 11025;
                                        break;
                                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                        iG2 = 8000;
                                        break;
                                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                        iG2 = 7350;
                                        break;
                                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    case 14:
                                    default:
                                        throw l0a.b("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case 25:
                                        iG2 = 14400;
                                        break;
                                    case 26:
                                        iG2 = 12800;
                                        break;
                                    case 27:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = zu1Var2.g(24);
                            }
                            int iG6 = zu1Var2.g(3);
                            if (iG6 == 0) {
                                i3 = 768;
                            } else if (iG6 == 1) {
                                i3 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iG6 != 4) {
                                    throw l0a.b("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i3 = 4096;
                            }
                            int i16 = i3;
                            if (iG6 == 0 || iG6 == 1) {
                                c = 0;
                            } else if (iG6 == 2) {
                                c = 2;
                            } else if (iG6 == 3) {
                                c = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw l0a.b("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c = 1;
                            }
                            zu1Var2.o(2);
                            cgg.P(zu1Var2);
                            int iG7 = zu1Var2.g(5);
                            int i17 = 0;
                            int iK3 = 0;
                            while (true) {
                                int i18 = i8;
                                int i19 = 16;
                                if (i17 < iG7 + 1) {
                                    int iG8 = zu1Var2.g(3);
                                    iK3 = cgg.K(zu1Var2, 5, 8, 16) + 1 + iK3;
                                    if ((iG8 == 0 || iG8 == 2) && zu1Var2.f()) {
                                        cgg.P(zu1Var2);
                                    }
                                    i17++;
                                    i8 = i18;
                                } else {
                                    int iK4 = cgg.K(zu1Var2, 4, 8, 16) + 1;
                                    zu1Var2.n();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < iK4) {
                                            int iG9 = zu1Var2.g(2);
                                            if (iG9 == 0) {
                                                zu1Var2.o(i7);
                                                if (zu1Var2.f()) {
                                                    zu1Var2.o(13);
                                                }
                                                if (c > 0) {
                                                    cgg.O(zu1Var2);
                                                }
                                            } else if (iG9 == i18) {
                                                zu1Var2.o(i7);
                                                boolean zF = zu1Var2.f();
                                                if (zF) {
                                                    zu1Var2.o(13);
                                                }
                                                if (zF) {
                                                    zu1Var2.n();
                                                }
                                                if (c > 0) {
                                                    cgg.O(zu1Var2);
                                                    iG3 = zu1Var2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    zu1Var2.o(6);
                                                    int iG10 = zu1Var2.g(2);
                                                    zu1Var2.o(4);
                                                    if (zu1Var2.f()) {
                                                        zu1Var2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == i7) {
                                                        zu1Var2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        zu1Var2.n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iK3 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = zu1Var2.g(2);
                                                if (iG11 > 0 && zu1Var2.f()) {
                                                    zu1Var2.o(iFloor);
                                                }
                                                if (zu1Var2.f()) {
                                                    zu1Var2.o(iFloor);
                                                }
                                                if (c == 0 && iG11 == 0) {
                                                    zu1Var2.n();
                                                }
                                            } else if (iG9 == i7) {
                                                cgg.K(zu1Var2, 4, i6, i19);
                                                int iK5 = cgg.K(zu1Var2, 4, i6, i19);
                                                if (zu1Var2.f()) {
                                                    cgg.K(zu1Var2, i6, i19, 0);
                                                }
                                                zu1Var2.n();
                                                if (iK5 > 0) {
                                                    zu1Var2.o(iK5 * 8);
                                                }
                                            }
                                            i20++;
                                            i6 = 8;
                                            i7 = 3;
                                            i19 = 16;
                                            i18 = 1;
                                        } else {
                                            if (zu1Var2.f()) {
                                                int i21 = 8;
                                                int iK6 = cgg.K(zu1Var2, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < iK6) {
                                                    int iK7 = cgg.K(zu1Var2, 4, i21, 16);
                                                    int iK8 = cgg.K(zu1Var2, 4, i21, 16);
                                                    if (iK7 == 7) {
                                                        int iG12 = zu1Var2.g(4) + 1;
                                                        zu1Var2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i23 = 0; i23 < iG12; i23++) {
                                                            bArr4[i23] = (byte) zu1Var2.g(i21);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        zu1Var2.o(iK8 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = rh0Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            yobVarT = null;
                                                        } else {
                                                            yobVarT = jy6.t(pqf.b, bArr);
                                                        }
                                                        qr5 qr5Var = new qr5();
                                                        qr5Var.a = this.e;
                                                        qr5Var.n = qv8.l("video/mp2t");
                                                        qr5Var.o = qv8.l("audio/mhm1");
                                                        qr5Var.K = this.q;
                                                        qr5Var.k = strConcat;
                                                        qr5Var.r = yobVarT;
                                                        this.f.g(new rr5(qr5Var));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = rh0Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            yobVarT = null;
                                                        } else {
                                                            yobVarT = null;
                                                        }
                                                        qr5 qr5Var2 = new qr5();
                                                        qr5Var2.a = this.e;
                                                        qr5Var2.n = qv8.l("video/mp2t");
                                                        qr5Var2.o = qv8.l("audio/mhm1");
                                                        qr5Var2.K = this.q;
                                                        qr5Var2.k = strConcat;
                                                        qr5Var2.r = yobVarT;
                                                        this.f.g(new rr5(qr5Var2));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = rh0Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            yobVarT = null;
                                                        } else {
                                                            yobVarT = null;
                                                        }
                                                        qr5 qr5Var3 = new qr5();
                                                        qr5Var3.a = this.e;
                                                        qr5Var3.n = qv8.l("video/mp2t");
                                                        qr5Var3.o = qv8.l("audio/mhm1");
                                                        qr5Var3.K = this.q;
                                                        qr5Var3.k = strConcat;
                                                        qr5Var3.r = yobVarT;
                                                        this.f.g(new rr5(qr5Var3));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = rh0Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            yobVarT = null;
                                                        } else {
                                                            yobVarT = null;
                                                        }
                                                        qr5 qr5Var4 = new qr5();
                                                        qr5Var4.a = this.e;
                                                        qr5Var4.n = qv8.l("video/mp2t");
                                                        qr5Var4.o = qv8.l("audio/mhm1");
                                                        qr5Var4.K = this.q;
                                                        qr5Var4.k = strConcat;
                                                        qr5Var4.r = yobVarT;
                                                        this.f.g(new rr5(qr5Var4));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw l0a.b("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = d0aVar2.a;
                                zu1 zu1Var3 = new zu1(bArr5, bArr5.length);
                                if (zu1Var3.f()) {
                                    zu1Var3.o(2);
                                    iG = zu1Var3.g(13);
                                } else {
                                    iG = 0;
                                }
                                this.s = iG;
                            } else if (i15 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i24 = this.k;
                if ((i24 & 2) == 0) {
                    d0aVar.M(d0aVar.c);
                } else {
                    if ((i24 & 4) == 0) {
                        while (true) {
                            if (d0aVar.a() > 0) {
                                int i25 = this.l << 8;
                                this.l = i25;
                                int iZ = i25 | d0aVar.z();
                                this.l = iZ;
                                if ((iZ & 16777215) == 12583333) {
                                    d0aVar.M(d0aVar.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        this.d = 0;
        this.l = 0;
        this.a.J(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
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
}
