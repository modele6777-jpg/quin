package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class czf extends h3e {
    public kxa n;
    public int o;
    public boolean p;
    public u49 q;
    public yea r;

    @Override // defpackage.h3e
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        u49 u49Var = this.q;
        this.o = u49Var != null ? u49Var.e : 0;
    }

    @Override // defpackage.h3e
    public final long b(d0a d0aVar) {
        if ((d0aVar.a[0] & 1) == 1) {
            return -1L;
        }
        kxa kxaVar = this.n;
        kxaVar.getClass();
        byte b = d0aVar.a[0];
        u49 u49Var = (u49) kxaVar.a;
        f17[] f17VarArr = (f17[]) kxaVar.d;
        int i = f17VarArr[(b >> 1) & (255 >>> (8 - afc.g(f17VarArr.length - 1)))].b ? u49Var.f : u49Var.e;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = d0aVar.a;
        int length = bArr.length;
        int i2 = d0aVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            d0aVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            d0aVar.L(i2);
        }
        byte[] bArr2 = d0aVar.a;
        int i3 = d0aVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0380 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x0382  */
    /* JADX WARN: Type inference failed for: r1v34, types: [byte[], java.io.Serializable] */
    @Override // defpackage.h3e
    public final boolean c(d0a d0aVar, long j, vea veaVar) throws l0a {
        kxa kxaVar;
        int i;
        int iG;
        if (this.n != null) {
            ((rr5) veaVar.b).getClass();
            return false;
        }
        u49 u49Var = this.q;
        int i2 = 4;
        if (u49Var != null) {
            yea yeaVar = this.r;
            if (yeaVar == null) {
                this.r = afc.l(d0aVar, true, true);
            } else {
                int i3 = d0aVar.c;
                byte[] bArr = new byte[i3];
                System.arraycopy(d0aVar.a, 0, bArr, 0, i3);
                int i4 = u49Var.a;
                int i5 = 5;
                afc.t(5, d0aVar, false);
                int iZ = d0aVar.z() + 1;
                zu1 zu1Var = new zu1(d0aVar.a);
                int i6 = 8;
                zu1Var.o(d0aVar.b * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 16;
                    if (i7 < iZ) {
                        int i9 = i6;
                        if (zu1Var.g(24) != 5653314) {
                            throw l0a.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((zu1Var.d * 8) + zu1Var.e));
                        }
                        int iG2 = zu1Var.g(16);
                        int iG3 = zu1Var.g(24);
                        if (zu1Var.f()) {
                            zu1Var.o(5);
                            for (int iG4 = 0; iG4 < iG3; iG4 += zu1Var.g(afc.g(iG3 - iG4))) {
                            }
                        } else {
                            boolean zF = zu1Var.f();
                            for (int i10 = 0; i10 < iG3; i10++) {
                                if (!zF) {
                                    zu1Var.o(5);
                                } else if (zu1Var.f()) {
                                    zu1Var.o(5);
                                }
                            }
                        }
                        int iG5 = zu1Var.g(4);
                        if (iG5 > 2) {
                            throw l0a.a(null, "lookup type greater than 2 not decodable: " + iG5);
                        }
                        if (iG5 == 1 || iG5 == 2) {
                            zu1Var.o(32);
                            zu1Var.o(32);
                            int iG6 = zu1Var.g(4) + 1;
                            zu1Var.o(1);
                            zu1Var.o((int) ((iG5 == 1 ? iG2 != 0 ? (long) Math.floor(Math.pow(iG3, 1.0d / ((double) iG2))) : 0L : ((long) iG2) * ((long) iG3)) * ((long) iG6)));
                        }
                        i7++;
                        i6 = i9;
                    } else {
                        int i11 = i6;
                        int i12 = 6;
                        int iG7 = zu1Var.g(6) + 1;
                        for (int i13 = 0; i13 < iG7; i13++) {
                            if (zu1Var.g(16) != 0) {
                                throw l0a.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i14 = 1;
                        int iG8 = zu1Var.g(6) + 1;
                        int i15 = 0;
                        while (true) {
                            int i16 = 3;
                            if (i15 >= iG8) {
                                int i17 = 1;
                                int iG9 = zu1Var.g(i12) + 1;
                                int i18 = 0;
                                while (i18 < iG9) {
                                    if (zu1Var.g(16) > 2) {
                                        throw l0a.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    zu1Var.o(24);
                                    zu1Var.o(24);
                                    zu1Var.o(24);
                                    int iG10 = zu1Var.g(i12) + i17;
                                    int i19 = 8;
                                    zu1Var.o(8);
                                    int[] iArr = new int[iG10];
                                    for (int i20 = 0; i20 < iG10; i20++) {
                                        iArr[i20] = ((zu1Var.f() ? zu1Var.g(5) : 0) * 8) + zu1Var.g(3);
                                    }
                                    int i21 = 0;
                                    while (i21 < iG10) {
                                        int i22 = 0;
                                        while (i22 < i19) {
                                            if ((iArr[i21] & (1 << i22)) != 0) {
                                                zu1Var.o(i19);
                                            }
                                            i22++;
                                            i19 = 8;
                                        }
                                        i21++;
                                        i19 = 8;
                                    }
                                    i18++;
                                    i12 = 6;
                                    i17 = 1;
                                }
                                int iG11 = zu1Var.g(i12) + 1;
                                for (int i23 = 0; i23 < iG11; i23++) {
                                    int iG12 = zu1Var.g(16);
                                    if (iG12 != 0) {
                                        xo1.x("VorbisUtil", "mapping type other than 0 not supported: " + iG12);
                                    } else {
                                        if (zu1Var.f()) {
                                            i = 1;
                                            iG = zu1Var.g(4) + 1;
                                        } else {
                                            i = 1;
                                            iG = 1;
                                        }
                                        if (zu1Var.f()) {
                                            int iG13 = zu1Var.g(8) + i;
                                            for (int i24 = 0; i24 < iG13; i24++) {
                                                int i25 = i4 - 1;
                                                zu1Var.o(afc.g(i25));
                                                zu1Var.o(afc.g(i25));
                                            }
                                        }
                                        if (zu1Var.g(2) != 0) {
                                            throw l0a.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iG > 1) {
                                            for (int i26 = 0; i26 < i4; i26++) {
                                                zu1Var.o(4);
                                            }
                                        }
                                        for (int i27 = 0; i27 < iG; i27++) {
                                            zu1Var.o(8);
                                            zu1Var.o(8);
                                            zu1Var.o(8);
                                        }
                                    }
                                }
                                int i28 = 6;
                                int iG14 = zu1Var.g(6) + 1;
                                f17[] f17VarArr = new f17[iG14];
                                for (int i29 = 0; i29 < iG14; i29++) {
                                    boolean zF2 = zu1Var.f();
                                    zu1Var.g(16);
                                    zu1Var.g(16);
                                    zu1Var.g(8);
                                    f17VarArr[i29] = new f17(zF2, i28);
                                }
                                if (!zu1Var.f()) {
                                    throw l0a.a(null, "framing bit after modes not set as expected");
                                }
                                kxaVar = new kxa(u49Var, yeaVar, bArr, f17VarArr);
                                break;
                            }
                            int iG15 = zu1Var.g(i8);
                            if (iG15 == 0) {
                                int i30 = i11;
                                zu1Var.o(i30);
                                zu1Var.o(16);
                                zu1Var.o(16);
                                zu1Var.o(6);
                                zu1Var.o(i30);
                                int iG16 = zu1Var.g(4) + 1;
                                int i31 = 0;
                                while (i31 < iG16) {
                                    zu1Var.o(i30);
                                    i31++;
                                    i30 = 8;
                                }
                            } else {
                                if (iG15 != i14) {
                                    throw l0a.a(null, "floor type greater than 1 not decodable: " + iG15);
                                }
                                int iG17 = zu1Var.g(i5);
                                int[] iArr2 = new int[iG17];
                                int i32 = -1;
                                for (int i33 = 0; i33 < iG17; i33++) {
                                    int iG18 = zu1Var.g(i2);
                                    iArr2[i33] = iG18;
                                    if (iG18 > i32) {
                                        i32 = iG18;
                                    }
                                }
                                int i34 = i32 + 1;
                                int[] iArr3 = new int[i34];
                                int i35 = 0;
                                while (i35 < i34) {
                                    iArr3[i35] = zu1Var.g(i16) + 1;
                                    int iG19 = zu1Var.g(2);
                                    int i36 = i11;
                                    if (iG19 > 0) {
                                        zu1Var.o(i36);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i37 = 0;
                                    for (int i38 = 1; i37 < (i38 << iG19); i38 = 1) {
                                        zu1Var.o(i36);
                                        i37++;
                                        i36 = 8;
                                    }
                                    i35++;
                                    iArr3 = iArr4;
                                    i11 = 8;
                                    i16 = 3;
                                }
                                int[] iArr5 = iArr3;
                                zu1Var.o(2);
                                int iG20 = zu1Var.g(4);
                                int i39 = 0;
                                int i40 = 0;
                                for (int i41 = 0; i41 < iG17; i41++) {
                                    i39 += iArr5[iArr2[i41]];
                                    while (i40 < i39) {
                                        zu1Var.o(iG20);
                                        i40++;
                                    }
                                }
                            }
                            i15++;
                            i11 = 8;
                            i12 = 6;
                            i2 = 4;
                            i8 = 16;
                            i5 = 5;
                            i14 = 1;
                        }
                    }
                }
            }
            this.n = kxaVar;
            if (kxaVar == null) {
                return true;
            }
            u49 u49Var2 = (u49) kxaVar.a;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) u49Var2.g);
            arrayList.add((byte[]) kxaVar.c);
            su8 su8VarA = dzf.a(jy6.p((String[]) ((yea) kxaVar.b).a));
            qr5 qr5Var = new qr5();
            qr5Var.n = qv8.l("audio/ogg");
            qr5Var.o = qv8.l("audio/vorbis");
            qr5Var.i = u49Var2.d;
            qr5Var.j = u49Var2.c;
            qr5Var.I = u49Var2.a;
            qr5Var.K = u49Var2.b;
            qr5Var.r = arrayList;
            qr5Var.l = su8VarA;
            veaVar.b = new rr5(qr5Var);
            return true;
        }
        afc.t(1, d0aVar, false);
        d0aVar.r();
        int iZ2 = d0aVar.z();
        int iR = d0aVar.r();
        int iO = d0aVar.o();
        if (iO <= 0) {
            iO = -1;
        }
        int iO2 = d0aVar.o();
        int i42 = iO2 <= 0 ? -1 : iO2;
        d0aVar.o();
        int iZ3 = d0aVar.z();
        int iPow = (int) Math.pow(2.0d, iZ3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iZ3 & 240) >> 4);
        d0aVar.z();
        ?? CopyOf = Arrays.copyOf(d0aVar.a, d0aVar.c);
        u49 u49Var3 = new u49();
        u49Var3.a = iZ2;
        u49Var3.b = iR;
        u49Var3.c = iO;
        u49Var3.d = i42;
        u49Var3.e = iPow;
        u49Var3.f = iPow2;
        u49Var3.g = CopyOf;
        this.q = u49Var3;
        kxaVar = null;
        this.n = kxaVar;
        if (kxaVar == null) {
            return true;
        }
        u49 u49Var4 = (u49) kxaVar.a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) u49Var4.g);
        arrayList2.add((byte[]) kxaVar.c);
        su8 su8VarA2 = dzf.a(jy6.p((String[]) ((yea) kxaVar.b).a));
        qr5 qr5Var2 = new qr5();
        qr5Var2.n = qv8.l("audio/ogg");
        qr5Var2.o = qv8.l("audio/vorbis");
        qr5Var2.i = u49Var4.d;
        qr5Var2.j = u49Var4.c;
        qr5Var2.I = u49Var4.a;
        qr5Var2.K = u49Var4.b;
        qr5Var2.r = arrayList2;
        qr5Var2.l = su8VarA2;
        veaVar.b = new rr5(qr5Var2);
        return true;
    }

    @Override // defpackage.h3e
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
