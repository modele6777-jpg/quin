package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f41 implements v41, u41, Cloneable, ByteChannel {
    public qtc a;
    public long b;

    public final boolean E() {
        return this.b == 0;
    }

    public final long F0() throws EOFException {
        long j;
        byte b;
        long j2 = 0;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            qtc qtcVar = this.a;
            qtcVar.getClass();
            byte[] bArr = qtcVar.a;
            int i2 = qtcVar.b;
            int i3 = qtcVar.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.a = qtcVar.a();
                ttc.a(qtcVar);
            } else {
                qtcVar.b = i2;
            }
            if (z2 || this.a == null) {
                long j5 = this.b - ((long) i);
                this.b = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbQ = kv2.q(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbQ.append(vpf.R(G(j)));
                throw new NumberFormatException(sbQ.toString());
            }
            j2 = j;
        }
        f41 f41Var = new f41();
        f41Var.j1(j3);
        f41Var.i1(b);
        if (!z) {
            f41Var.h0();
        }
        throw new NumberFormatException("Number too large: ".concat(f41Var.a1()));
    }

    public final byte G(long j) {
        vpf.s(this.b, j, 1L);
        qtc qtcVar = this.a;
        qtcVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                qtcVar = qtcVar.g;
                qtcVar.getClass();
                j2 -= (long) (qtcVar.c - qtcVar.b);
            }
            return qtcVar.a[(int) ((((long) qtcVar.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = qtcVar.c;
            int i2 = qtcVar.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return qtcVar.a[(int) ((((long) i2) + j) - j3)];
            }
            qtcVar = qtcVar.f;
            qtcVar.getClass();
            j3 = j4;
        }
    }

    public final long H0() throws EOFException {
        int i;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            qtc qtcVar = this.a;
            qtcVar.getClass();
            byte[] bArr = qtcVar.a;
            int i3 = qtcVar.b;
            int i4 = qtcVar.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(vpf.R(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    f41 f41Var = new f41();
                    f41Var.k1(j);
                    f41Var.i1(b);
                    throw new NumberFormatException("Number too large: ".concat(f41Var.a1()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.a = qtcVar.a();
                ttc.a(qtcVar);
            } else {
                qtcVar.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.a != null);
        this.b -= (long) i2;
        return j;
    }

    @Override // defpackage.v41
    public final boolean I(long j, a71 a71Var) {
        a71Var.getClass();
        return g0(j, a71Var, a71Var.e());
    }

    @Override // defpackage.v41
    public final int L(zr9 zr9Var) {
        zr9Var.getClass();
        int iD = b.d(this, zr9Var, false);
        if (iD == -1) {
            return -1;
        }
        c1(zr9Var.a[iD].e());
        return iD;
    }

    public final int L0() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        qtc qtcVar = this.a;
        qtcVar.getClass();
        int i = qtcVar.b;
        int i2 = qtcVar.c;
        if (i2 - i < 4) {
            return (h0() & 255) | ((h0() & 255) << 24) | ((h0() & 255) << 16) | ((h0() & 255) << 8);
        }
        byte[] bArr = qtcVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            qtcVar.b = i5;
            return i6;
        }
        this.a = qtcVar.a();
        ttc.a(qtcVar);
        return i6;
    }

    @Override // defpackage.wkd
    public final void M0(f41 f41Var, long j) {
        qtc qtcVarB;
        f41Var.getClass();
        if (f41Var == this) {
            qc0.j("source == this");
            return;
        }
        vpf.s(f41Var.b, 0L, j);
        while (j > 0) {
            qtc qtcVar = f41Var.a;
            qtcVar.getClass();
            int i = qtcVar.c;
            qtc qtcVar2 = f41Var.a;
            qtcVar2.getClass();
            long j2 = i - qtcVar2.b;
            int i2 = 0;
            if (j < j2) {
                qtc qtcVar3 = this.a;
                qtc qtcVar4 = qtcVar3 != null ? qtcVar3.g : null;
                if (qtcVar4 != null && qtcVar4.e) {
                    if ((((long) qtcVar4.c) + j) - ((long) (qtcVar4.d ? 0 : qtcVar4.b)) <= 8192) {
                        qtc qtcVar5 = f41Var.a;
                        qtcVar5.getClass();
                        qtcVar5.d(qtcVar4, (int) j);
                        f41Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                qtc qtcVar6 = f41Var.a;
                qtcVar6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > qtcVar6.c - qtcVar6.b) {
                    qc0.j("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    qtcVarB = qtcVar6.c();
                } else {
                    qtcVarB = ttc.b();
                    byte[] bArr = qtcVar6.a;
                    byte[] bArr2 = qtcVarB.a;
                    int i4 = qtcVar6.b;
                    qd0.X(0, i4, i4 + i3, bArr, bArr2);
                }
                qtcVarB.c = qtcVarB.b + i3;
                qtcVar6.b += i3;
                qtc qtcVar7 = qtcVar6.g;
                qtcVar7.getClass();
                qtcVar7.b(qtcVarB);
                f41Var.a = qtcVarB;
            }
            qtc qtcVar8 = f41Var.a;
            qtcVar8.getClass();
            long j3 = qtcVar8.c - qtcVar8.b;
            f41Var.a = qtcVar8.a();
            qtc qtcVar9 = this.a;
            if (qtcVar9 == null) {
                this.a = qtcVar8;
                qtcVar8.g = qtcVar8;
                qtcVar8.f = qtcVar8;
            } else {
                qtc qtcVar10 = qtcVar9.g;
                qtcVar10.getClass();
                qtcVar10.b(qtcVar8);
                qtc qtcVar11 = qtcVar8.g;
                if (qtcVar11 == qtcVar8) {
                    qc0.p("cannot compact");
                    return;
                }
                qtcVar11.getClass();
                if (qtcVar11.e) {
                    int i5 = qtcVar8.c - qtcVar8.b;
                    qtc qtcVar12 = qtcVar8.g;
                    qtcVar12.getClass();
                    int i6 = 8192 - qtcVar12.c;
                    qtc qtcVar13 = qtcVar8.g;
                    qtcVar13.getClass();
                    if (!qtcVar13.d) {
                        qtc qtcVar14 = qtcVar8.g;
                        qtcVar14.getClass();
                        i2 = qtcVar14.b;
                    }
                    if (i5 <= i6 + i2) {
                        qtc qtcVar15 = qtcVar8.g;
                        qtcVar15.getClass();
                        qtcVar8.d(qtcVar15, i5);
                        qtcVar8.a();
                        ttc.a(qtcVar8);
                    }
                }
            }
            f41Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    public final long N(byte b, long j, long j2) {
        qtc qtcVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (qtcVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                qtcVar = qtcVar.g;
                qtcVar.getClass();
                j6 -= (long) (qtcVar.c - qtcVar.b);
            }
            while (j6 < j4) {
                byte[] bArr = qtcVar.a;
                long j8 = j7;
                int iMin = (int) Math.min(qtcVar.c, (((long) qtcVar.b) + j4) - j6);
                for (int i = (int) ((((long) qtcVar.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - qtcVar.b)) + j6;
                    }
                }
                j6 += (long) (qtcVar.c - qtcVar.b);
                qtcVar = qtcVar.f;
                qtcVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (qtcVar.c - qtcVar.b)) + j5;
            if (j9 > j3) {
                break;
            }
            qtcVar = qtcVar.f;
            qtcVar.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = qtcVar.a;
            int iMin2 = (int) Math.min(qtcVar.c, (((long) qtcVar.b) + j4) - j5);
            for (int i2 = (int) ((((long) qtcVar.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - qtcVar.b)) + j5;
                }
            }
            j5 += (long) (qtcVar.c - qtcVar.b);
            qtcVar = qtcVar.f;
            qtcVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    public final long R(long j, a71 a71Var) {
        a71Var.getClass();
        long j2 = 0;
        if (j < 0) {
            qc0.o(ks0.i(j, "fromIndex < 0: "));
            return 0L;
        }
        qtc qtcVar = this.a;
        if (qtcVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                qtcVar = qtcVar.g;
                qtcVar.getClass();
                j3 -= (long) (qtcVar.c - qtcVar.b);
            }
            if (a71Var.e() == 2) {
                byte bK = a71Var.k(0);
                byte bK2 = a71Var.k(1);
                while (j3 < this.b) {
                    byte[] bArr = qtcVar.a;
                    int i = qtcVar.c;
                    for (int i2 = (int) ((((long) qtcVar.b) + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bK || b == bK2) {
                            return ((long) (i2 - qtcVar.b)) + j3;
                        }
                    }
                    j3 += (long) (qtcVar.c - qtcVar.b);
                    qtcVar = qtcVar.f;
                    qtcVar.getClass();
                    j = j3;
                }
            } else {
                byte[] bArrJ = a71Var.j();
                while (j3 < this.b) {
                    byte[] bArr2 = qtcVar.a;
                    int i3 = qtcVar.c;
                    for (int i4 = (int) ((((long) qtcVar.b) + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrJ) {
                            if (b2 == b3) {
                                return ((long) (i4 - qtcVar.b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (qtcVar.c - qtcVar.b);
                    qtcVar = qtcVar.f;
                    qtcVar.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (qtcVar.c - qtcVar.b)) + j2;
            if (j4 > j) {
                break;
            }
            qtcVar = qtcVar.f;
            qtcVar.getClass();
            j2 = j4;
        }
        if (a71Var.e() == 2) {
            byte bK3 = a71Var.k(0);
            byte bK4 = a71Var.k(1);
            while (j2 < this.b) {
                byte[] bArr3 = qtcVar.a;
                int i5 = qtcVar.c;
                for (int i6 = (int) ((((long) qtcVar.b) + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bK3 || b4 == bK4) {
                        return ((long) (i6 - qtcVar.b)) + j2;
                    }
                }
                j2 += (long) (qtcVar.c - qtcVar.b);
                qtcVar = qtcVar.f;
                qtcVar.getClass();
                j = j2;
            }
        } else {
            byte[] bArrJ2 = a71Var.j();
            while (j2 < this.b) {
                byte[] bArr4 = qtcVar.a;
                int i7 = qtcVar.c;
                for (int i8 = (int) ((((long) qtcVar.b) + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrJ2) {
                        if (b5 == b6) {
                            return ((long) (i8 - qtcVar.b)) + j2;
                        }
                    }
                }
                j2 += (long) (qtcVar.c - qtcVar.b);
                qtcVar = qtcVar.f;
                qtcVar.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    @Override // defpackage.u41
    public final /* bridge */ /* synthetic */ u41 T0(long j) {
        j1(j);
        return this;
    }

    public final short U0() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        qtc qtcVar = this.a;
        qtcVar.getClass();
        int i = qtcVar.b;
        int i2 = qtcVar.c;
        if (i2 - i < 2) {
            return (short) ((h0() & 255) | ((h0() & 255) << 8));
        }
        byte[] bArr = qtcVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = qtcVar.a();
            ttc.a(qtcVar);
        } else {
            qtcVar.b = i5;
        }
        return (short) i6;
    }

    public final short V0() throws EOFException {
        short sU0 = U0();
        return (short) (((sU0 & 255) << 8) | ((65280 & sU0) >>> 8));
    }

    public final long W(a71 a71Var) {
        a71Var.getClass();
        return R(0L, a71Var);
    }

    @Override // defpackage.u41
    public final /* bridge */ /* synthetic */ u41 X0(a71 a71Var) {
        f1(a71Var);
        return this;
    }

    @Override // defpackage.u41
    public final /* bridge */ /* synthetic */ u41 Y(byte[] bArr, int i) {
        g1(bArr, i);
        return this;
    }

    @Override // defpackage.v41
    public final InputStream Y0() {
        return new e41(this, 0);
    }

    public final String Z0(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            qc0.o(ks0.i(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        qtc qtcVar = this.a;
        qtcVar.getClass();
        int i = qtcVar.b;
        if (((long) i) + j > qtcVar.c) {
            return new String(k0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(qtcVar.a, i, i2, charset);
        int i3 = qtcVar.b + i2;
        qtcVar.b = i3;
        this.b -= j;
        if (i3 == qtcVar.c) {
            this.a = qtcVar.a();
            ttc.a(qtcVar);
        }
        return str;
    }

    @Override // defpackage.v41
    public final long a0(u41 u41Var) {
        long j = this.b;
        if (j > 0) {
            u41Var.M0(this, j);
        }
        return j;
    }

    public final String a1() {
        return Z0(this.b, ox1.a);
    }

    public final void b() {
        c1(this.b);
    }

    public final int b1() {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            throw new EOFException();
        }
        byte bG = G(0L);
        if ((bG & 128) == 0) {
            i = bG & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bG & 224) == 192) {
            i = bG & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bG & 240) == 224) {
            i = bG & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bG & 248) != 240) {
                c1(1L);
                return 65533;
            }
            i = bG & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder sbN = ub3.n(i2, "size < ", ": ");
            sbN.append(this.b);
            sbN.append(" (to read code point prefixed 0x");
            sbN.append(vpf.R(bG));
            sbN.append(')');
            throw new EOFException(sbN.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bG2 = G(j2);
            if ((bG2 & 192) != 128) {
                c1(j2);
                return 65533;
            }
            i = (i << 6) | (bG2 & 63);
        }
        c1(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) {
        f41Var.getClass();
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        f41Var.M0(this, j);
        return j;
    }

    public final void c1(long j) {
        while (j > 0) {
            qtc qtcVar = this.a;
            if (qtcVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, qtcVar.c - qtcVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = qtcVar.b + iMin;
            qtcVar.b = i;
            if (i == qtcVar.c) {
                this.a = qtcVar.a();
                ttc.a(qtcVar);
            }
        }
    }

    public final Object clone() {
        return l();
    }

    public final a71 d1(int i) {
        if (i == 0) {
            return a71.c;
        }
        vpf.s(this.b, 0L, i);
        qtc qtcVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            qtcVar.getClass();
            int i5 = qtcVar.c;
            int i6 = qtcVar.b;
            if (i5 == i6) {
                qc0.i("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            qtcVar = qtcVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        qtc qtcVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            qtcVar2.getClass();
            bArr[i7] = qtcVar2.a;
            i2 += qtcVar2.c - qtcVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qtcVar2.b;
            qtcVar2.d = true;
            i7++;
            qtcVar2 = qtcVar2.f;
        }
        return new utc(bArr, iArr);
    }

    public final qtc e1(int i) {
        if (i < 1 || i > 8192) {
            qc0.j("unexpected capacity");
            return null;
        }
        qtc qtcVar = this.a;
        if (qtcVar == null) {
            qtc qtcVarB = ttc.b();
            this.a = qtcVarB;
            qtcVarB.g = qtcVarB;
            qtcVarB.f = qtcVarB;
            return qtcVarB;
        }
        qtc qtcVar2 = qtcVar.g;
        qtcVar2.getClass();
        if (qtcVar2.c + i <= 8192 && qtcVar2.e) {
            return qtcVar2;
        }
        qtc qtcVarB2 = ttc.b();
        qtcVar2.b(qtcVarB2);
        return qtcVarB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f41)) {
            return false;
        }
        long j = this.b;
        f41 f41Var = (f41) obj;
        if (j != f41Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        qtc qtcVar = this.a;
        qtcVar.getClass();
        qtc qtcVar2 = f41Var.a;
        qtcVar2.getClass();
        int i = qtcVar.b;
        int i2 = qtcVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(qtcVar.c - i, qtcVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (qtcVar.a[i] != qtcVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == qtcVar.c) {
                qtcVar = qtcVar.f;
                qtcVar.getClass();
                i = qtcVar.b;
            }
            if (i2 == qtcVar2.c) {
                qtcVar2 = qtcVar2.f;
                qtcVar2.getClass();
                i2 = qtcVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.v41
    public final long f0(long j, a71 a71Var) {
        a71Var.getClass();
        byte[] bArr = b.a;
        return b.a(this, a71Var, 0L, j, a71Var.e());
    }

    public final void f1(a71 a71Var) {
        a71Var.getClass();
        a71Var.u(this, a71Var.e());
    }

    public final boolean g0(long j, a71 a71Var, int i) {
        a71Var.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.b && i <= a71Var.e()) {
            return i == 0 || b.a(this, a71Var, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void g1(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        vpf.s(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            qtc qtcVarE1 = e1(1);
            int iMin = Math.min(i - i2, 8192 - qtcVarE1.c);
            int i3 = i2 + iMin;
            qd0.X(qtcVarE1.c, i2, i3, bArr, qtcVarE1.a);
            qtcVarE1.c += iMin;
            i2 = i3;
        }
        this.b += j;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        qtc qtcVar = this.a;
        qtcVar.getClass();
        qtc qtcVar2 = qtcVar.g;
        qtcVar2.getClass();
        int i = qtcVar2.c;
        return (i >= 8192 || !qtcVar2.e) ? j : j - ((long) (i - qtcVar2.b));
    }

    public final byte h0() {
        if (this.b == 0) {
            throw new EOFException();
        }
        qtc qtcVar = this.a;
        qtcVar.getClass();
        int i = qtcVar.b;
        int i2 = qtcVar.c;
        int i3 = i + 1;
        byte b = qtcVar.a[i];
        this.b--;
        if (i3 != i2) {
            qtcVar.b = i3;
            return b;
        }
        this.a = qtcVar.a();
        ttc.a(qtcVar);
        return b;
    }

    public final void h1(mtd mtdVar) {
        mtdVar.getClass();
        while (mtdVar.c0(this, 8192L) != -1) {
        }
    }

    public final int hashCode() {
        qtc qtcVar = this.a;
        if (qtcVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qtcVar.c;
            for (int i3 = qtcVar.b; i3 < i2; i3++) {
                i = (i * 31) + qtcVar.a[i3];
            }
            qtcVar = qtcVar.f;
            qtcVar.getClass();
        } while (qtcVar != this.a);
        return i;
    }

    @Override // defpackage.u41
    public final /* bridge */ /* synthetic */ u41 i0(String str) {
        n1(str);
        return this;
    }

    public final void i1(int i) {
        qtc qtcVarE1 = e1(1);
        byte[] bArr = qtcVarE1.a;
        int i2 = qtcVarE1.c;
        qtcVarE1.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.mtd
    public final jye j() {
        return jye.d;
    }

    public final void j1(long j) {
        boolean z;
        if (j == 0) {
            i1(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                n1("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        qtc qtcVarE1 = e1(i);
        byte[] bArr2 = qtcVarE1.a;
        int i2 = qtcVarE1.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        qtcVarE1.c += i;
        this.b += (long) i;
    }

    public final byte[] k0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            qc0.o(ks0.i(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    public final void k1(long j) {
        if (j == 0) {
            i1(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        qtc qtcVarE1 = e1(i);
        byte[] bArr = qtcVarE1.a;
        int i2 = qtcVarE1.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        qtcVarE1.c += i;
        this.b += (long) i;
    }

    public final f41 l() {
        f41 f41Var = new f41();
        if (this.b == 0) {
            return f41Var;
        }
        qtc qtcVar = this.a;
        qtcVar.getClass();
        qtc qtcVarC = qtcVar.c();
        f41Var.a = qtcVarC;
        qtcVarC.g = qtcVarC;
        qtcVarC.f = qtcVarC;
        for (qtc qtcVar2 = qtcVar.f; qtcVar2 != qtcVar; qtcVar2 = qtcVar2.f) {
            qtc qtcVar3 = qtcVarC.g;
            qtcVar3.getClass();
            qtcVar2.getClass();
            qtcVar3.b(qtcVar2.c());
        }
        f41Var.b = this.b;
        return f41Var;
    }

    public final void l1(int i) {
        qtc qtcVarE1 = e1(4);
        byte[] bArr = qtcVarE1.a;
        int i2 = qtcVarE1.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        qtcVarE1.c = i2 + 4;
        this.b += 4;
    }

    public final void m1(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            qc0.o(tec.e(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            qc0.o(ks0.k("endIndex < beginIndex: ", i2, " < ", i));
            return;
        }
        if (i2 > str.length()) {
            qc0.h(str.length(), ub3.n(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                qtc qtcVarE1 = e1(1);
                byte[] bArr = qtcVarE1.a;
                int i3 = qtcVarE1.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = qtcVarE1.c;
                int i6 = (i3 + i) - i5;
                qtcVarE1.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    qtc qtcVarE2 = e1(2);
                    byte[] bArr2 = qtcVarE2.a;
                    int i7 = qtcVarE2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    qtcVarE2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    qtc qtcVarE3 = e1(3);
                    byte[] bArr3 = qtcVarE3.a;
                    int i8 = qtcVarE3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    qtcVarE3.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        i1(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        qtc qtcVarE4 = e1(4);
                        byte[] bArr4 = qtcVarE4.a;
                        int i11 = qtcVarE4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        qtcVarE4.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.v41
    public final String n0(Charset charset) {
        charset.getClass();
        return Z0(this.b, charset);
    }

    public final void n1(String str) {
        str.getClass();
        m1(0, str.length(), str);
    }

    public final void o1(int i) {
        if (i < 128) {
            i1(i);
            return;
        }
        if (i < 2048) {
            qtc qtcVarE1 = e1(2);
            byte[] bArr = qtcVarE1.a;
            int i2 = qtcVarE1.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            qtcVarE1.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            i1(63);
            return;
        }
        if (i < 65536) {
            qtc qtcVarE2 = e1(3);
            byte[] bArr2 = qtcVarE2.a;
            int i3 = qtcVarE2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            bArr2[i3 + 2] = (byte) ((i & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            qtcVarE2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            qc0.j("Unexpected code point: 0x".concat(vpf.S(i)));
            return;
        }
        qtc qtcVarE3 = e1(4);
        byte[] bArr3 = qtcVarE3.a;
        int i4 = qtcVarE3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        bArr3[i4 + 3] = (byte) ((i & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        qtcVarE3.c = i4 + 4;
        this.b += 4;
    }

    public final a71 p0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            qc0.o(ks0.i(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new a71(k0(j));
        }
        a71 a71VarD1 = d1((int) j);
        c1(j);
        return a71VarD1;
    }

    @Override // defpackage.v41
    public final yhb peek() {
        return new yhb(new f6a(this));
    }

    public final int read(byte[] bArr, int i, int i2) {
        vpf.s(bArr.length, i, i2);
        qtc qtcVar = this.a;
        if (qtcVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, qtcVar.c - qtcVar.b);
        byte[] bArr2 = qtcVar.a;
        int i3 = qtcVar.b;
        qd0.X(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = qtcVar.b + iMin;
        qtcVar.b = i4;
        this.b -= (long) iMin;
        if (i4 == qtcVar.c) {
            this.a = qtcVar.a();
            ttc.a(qtcVar);
        }
        return iMin;
    }

    @Override // defpackage.v41
    public final boolean request(long j) {
        return this.b >= j;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return d1((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final void u(f41 f41Var, long j, long j2) {
        f41Var.getClass();
        long j3 = j;
        vpf.s(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        f41Var.b += j2;
        qtc qtcVar = this.a;
        while (true) {
            qtcVar.getClass();
            long j4 = qtcVar.c - qtcVar.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            qtcVar = qtcVar.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            qtcVar.getClass();
            qtc qtcVarC = qtcVar.c();
            int i = qtcVarC.b + ((int) j3);
            qtcVarC.b = i;
            qtcVarC.c = Math.min(i + ((int) j5), qtcVarC.c);
            qtc qtcVar2 = f41Var.a;
            if (qtcVar2 == null) {
                qtcVarC.g = qtcVarC;
                qtcVarC.f = qtcVarC;
                f41Var.a = qtcVarC;
            } else {
                qtc qtcVar3 = qtcVar2.g;
                qtcVar3.getClass();
                qtcVar3.b(qtcVarC);
            }
            j5 -= (long) (qtcVarC.c - qtcVarC.b);
            qtcVar = qtcVar.f;
            j3 = 0;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            qtc qtcVarE1 = e1(1);
            int iMin = Math.min(i, 8192 - qtcVarE1.c);
            byteBuffer.get(qtcVarE1.a, qtcVarE1.c, iMin);
            i -= iMin;
            qtcVarE1.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.u41
    public final /* bridge */ /* synthetic */ u41 writeByte(int i) {
        i1(i);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.wkd
    public final void close() {
    }

    @Override // defpackage.wkd, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.v41, defpackage.u41
    public final f41 i() {
        return this;
    }

    @Override // defpackage.u41
    public final u41 write(byte[] bArr) {
        bArr.getClass();
        g1(bArr, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        qtc qtcVar = this.a;
        if (qtcVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), qtcVar.c - qtcVar.b);
        byteBuffer.put(qtcVar.a, qtcVar.b, iMin);
        int i = qtcVar.b + iMin;
        qtcVar.b = i;
        this.b -= (long) iMin;
        if (i == qtcVar.c) {
            this.a = qtcVar.a();
            ttc.a(qtcVar);
        }
        return iMin;
    }
}
