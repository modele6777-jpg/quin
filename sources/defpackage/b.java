package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(ox1.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(f41 f41Var, a71 a71Var, long j, long j2, int i) {
        qtc qtcVar;
        long j3 = j;
        long j4 = j2;
        a71Var.getClass();
        long j5 = i;
        vpf.s(a71Var.e(), 0L, j5);
        if (i <= 0) {
            qc0.j("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            qc0.o(ks0.i(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbP = ub3.p("fromIndex > toIndex: ", " > ", j3);
            sbP.append(j4);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        long j6 = f41Var.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (qtcVar = f41Var.a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                qtcVar = qtcVar.g;
                qtcVar.getClass();
                j6 -= (long) (qtcVar.c - qtcVar.b);
            }
            byte[] bArrJ = a71Var.j();
            byte b2 = bArrJ[0];
            long jMin = Math.min(j4, (f41Var.b - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = qtcVar.a;
                int iMin = (int) Math.min(qtcVar.c, (((long) qtcVar.b) + jMin) - j6);
                for (int i2 = (int) ((((long) qtcVar.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(qtcVar, i2 + 1, bArrJ, 1, i)) {
                        return ((long) (i2 - qtcVar.b)) + j6;
                    }
                }
                j6 += (long) (qtcVar.c - qtcVar.b);
                qtcVar = qtcVar.f;
                qtcVar.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (qtcVar.c - qtcVar.b));
            if (j8 > j3) {
                break;
            }
            qtcVar = qtcVar.f;
            qtcVar.getClass();
            j7 = j8;
        }
        byte[] bArrJ2 = a71Var.j();
        byte b3 = bArrJ2[0];
        long jMin2 = Math.min(j4, (f41Var.b - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = qtcVar.a;
            int iMin2 = (int) Math.min(qtcVar.c, (((long) qtcVar.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) qtcVar.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(qtcVar, i3 + 1, bArrJ2, 1, i)) {
                    return ((long) (i3 - qtcVar.b)) + j7;
                }
            }
            j7 += (long) (qtcVar.c - qtcVar.b);
            qtcVar = qtcVar.f;
            qtcVar.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(qtc qtcVar, int i, byte[] bArr, int i2, int i3) {
        int i4 = qtcVar.c;
        byte[] bArr2 = qtcVar.a;
        while (i2 < i3) {
            if (i == i4) {
                qtcVar = qtcVar.f;
                qtcVar.getClass();
                byte[] bArr3 = qtcVar.a;
                bArr2 = bArr3;
                i = qtcVar.b;
                i4 = qtcVar.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(f41 f41Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (f41Var.G(j2) == 13) {
                String strZ0 = f41Var.Z0(j2, ox1.a);
                f41Var.c1(2L);
                return strZ0;
            }
        }
        String strZ1 = f41Var.Z0(j, ox1.a);
        f41Var.c1(1L);
        return strZ1;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int d(f41 f41Var, zr9 zr9Var, boolean z) {
        int i;
        int i2;
        int i3;
        qtc qtcVar;
        int i4;
        zr9Var.getClass();
        qtc qtcVar2 = f41Var.a;
        if (qtcVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = qtcVar2.a;
        int i5 = qtcVar2.b;
        int i6 = qtcVar2.c;
        int[] iArr = zr9Var.b;
        qtc qtcVar3 = qtcVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (qtcVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            qtcVar3 = qtcVar3.f;
                            qtcVar3.getClass();
                            int i16 = qtcVar3.b;
                            byte[] bArr2 = qtcVar3.a;
                            i2 = qtcVar3.c;
                            if (qtcVar3 == qtcVar2) {
                                i3 = i16;
                                bArr = bArr2;
                                qtcVar3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        qtcVar3.getClass();
                        qtc qtcVar4 = qtcVar3.f;
                        qtcVar4.getClass();
                        i3 = qtcVar4.b;
                        byte[] bArr3 = qtcVar4.a;
                        i4 = qtcVar4.c;
                        if (qtcVar4 != qtcVar2) {
                            qtcVar = qtcVar4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            qtcVar = null;
                        }
                    } else {
                        qtcVar = qtcVar3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        qtcVar3 = qtcVar;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    qtcVar3 = qtcVar;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
