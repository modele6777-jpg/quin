package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x79 extends lec {
    public int e;

    public x79(int i) {
        this.a = jec.a;
        this.b = cgg.i;
        if (i >= 0) {
            i(jec.d(i));
        } else {
            qc0.j("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean e(Object obj) {
        int i = this.d;
        this.b[g(obj)] = obj;
        return this.d != i;
    }

    public final void f() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != jec.a) {
            qd0.i0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        qd0.h0(0, this.c, null, this.b);
        this.e = jec.a(this.c) - this.d;
    }

    public final int g(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                int i11 = i;
                if (pa7.t(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iH = h(i3);
                long j8 = 255;
                if (this.e != 0 || ((this.a[iH >> 3] >> ((iH & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.c;
                    if (i13 > 8) {
                        int i14 = 8;
                        if (Long.compareUnsigned(((long) this.d) * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.c;
                            Object[] objArr2 = this.b;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            j3 = 128;
                            while (i17 < i16) {
                                long j9 = j8;
                                long j10 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i17++;
                                i14 = i14;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i18 = i14;
                            int iO0 = qd0.o0(jArr3);
                            int i19 = iO0 - 1;
                            long j11 = 72057594037927935L;
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iO0] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j12 = (jArr3[i21] >> i22) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i20];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iH2 = h(i24);
                                    int i25 = i24 & i15;
                                    if (((iH2 - i25) & i15) / i18 == ((i20 - i25) & i15) / i18) {
                                        long j13 = j11;
                                        jArr3[i21] = (((long) (i23 & 127)) << i22) | ((~(j << i22)) & jArr3[i21]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i20++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i26 = iH2 >> 3;
                                        long j15 = jArr3[i26];
                                        int i27 = (iH2 & 7) << 3;
                                        if (((j15 >> i27) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i26] = ((~(j << i27)) & j15) | (((long) (i23 & 127)) << i27);
                                            jArr3[i21] = (jArr3[i21] & (~(j << i22))) | (128 << i22);
                                            objArr[iH2] = objArr[i20];
                                            objArr[i20] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i26] = (((long) (i23 & 127)) << i27) | ((~(j << i27)) & j15);
                                            Object obj3 = objArr[iH2];
                                            objArr[iH2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i20++;
                                        j11 = j14;
                                        i18 = i18;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            this.e = jec.a(this.c) - this.d;
                        }
                        iH = h(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iB = jec.b(this.c);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    int i28 = this.c;
                    i(iB);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    int i29 = this.c;
                    int i30 = 0;
                    while (i30 < i28) {
                        if (((jArr4[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i30];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i31 = iHashCode3 ^ (iHashCode3 << 16);
                            int iH3 = h(i31 >>> 7);
                            long j16 = i31 & 127;
                            int i32 = iH3 >> 3;
                            int i33 = (iH3 & 7) << 3;
                            jArr = jArr5;
                            long j17 = (jArr5[i32] & (~(255 << i33))) | (j16 << i33);
                            jArr[i32] = j17;
                            jArr[(((iH3 - 7) & i29) + (i29 & 7)) >> 3] = j17;
                            objArr4[iH3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i30++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iH = h(i3);
                }
                this.d++;
                int i34 = this.e;
                long[] jArr6 = this.a;
                int i35 = iH >> 3;
                long j18 = jArr6[i35];
                int i36 = (iH & 7) << 3;
                this.e = i34 - (((j18 >> i36) & j) == j3 ? 1 : 0);
                int i37 = this.c;
                long j19 = (j18 & (~(j << i36))) | (j2 << i36);
                jArr6[i35] = j19;
                jArr6[(((iH - 7) & i37) + (i37 & 7)) >> 3] = j19;
                return iH;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final int h(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void i(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, jec.c(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = jec.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = jec.a(this.c) - this.d;
        this.b = iMax == 0 ? cgg.i : new Object[iMax];
    }

    public final void j(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (pa7.t(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            n(iNumberOfTrailingZeros);
        }
    }

    public final void k(lec lecVar) {
        lecVar.getClass();
        Object[] objArr = lecVar.b;
        long[] jArr = lecVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        l(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void l(Object obj) {
        this.b[g(obj)] = obj;
    }

    public final boolean m(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (pa7.t(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            n(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void n(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public /* synthetic */ x79() {
        this(6);
    }
}
