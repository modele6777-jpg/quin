package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e72 extends h72 {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int v;
    public int w = Integer.MAX_VALUE;

    public e72(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    @Override // defpackage.h72
    public final int A() {
        return H();
    }

    @Override // defpackage.h72
    public final long B() {
        return I();
    }

    @Override // defpackage.h72
    public final boolean C(int i) throws ya7 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                L(8);
                return true;
            }
            if (i2 == 2) {
                L(H());
                return true;
            }
            if (i2 == 3) {
                D();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw ya7.c();
            }
            L(4);
            return true;
        }
        int i4 = this.d - this.f;
        byte[] bArr = this.c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw ya7.d();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 == this.d) {
                throw ya7.i();
            }
            this.f = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw ya7.d();
        return true;
    }

    public final int F() throws ya7 {
        int i = this.f;
        if (this.d - i < 4) {
            throw ya7.i();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long G() throws ya7 {
        int i = this.f;
        if (this.d - i < 8) {
            throw ya7.i();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int H() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f = i5;
                return i;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f = i4;
                return j;
            }
        }
        return J();
    }

    public final long J() throws ya7 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw ya7.i();
            }
            this.f = i2 + 1;
            byte b = this.c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ya7.d();
    }

    public final void K() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.w;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    public final void L(int i) throws ya7 {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw ya7.i();
        }
        throw ya7.e();
    }

    @Override // defpackage.h72
    public final void a(int i) throws ya7 {
        if (this.v != i) {
            throw new ya7("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.h72
    public final int b() {
        return this.f - this.g;
    }

    @Override // defpackage.h72
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // defpackage.h72
    public final void h(int i) {
        this.w = i;
        K();
    }

    @Override // defpackage.h72
    public final int j(int i) {
        if (i < 0) {
            throw ya7.e();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new ya7("Failed to parse the message.");
        }
        int i2 = this.w;
        if (iB > i2) {
            throw ya7.i();
        }
        this.w = iB;
        K();
        return i2;
    }

    @Override // defpackage.h72
    public final boolean k() {
        return I() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.h72
    public final w61 l() throws ya7 {
        byte[] bArrCopyOfRange;
        int iH = H();
        byte[] bArr = this.c;
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                w61 w61VarD = b71.d(bArr, i2, iH);
                this.f += iH;
                return w61VarD;
            }
        }
        if (iH == 0) {
            return b71.a;
        }
        if (iH > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (iH <= i3 - i4) {
                int i5 = iH + i4;
                this.f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iH <= 0) {
                    throw ya7.i();
                }
                if (iH == 0) {
                    throw ya7.e();
                }
                bArrCopyOfRange = r87.b;
            }
        } else {
            if (iH <= 0) {
                throw ya7.i();
            }
            if (iH == 0) {
                throw ya7.e();
            }
            bArrCopyOfRange = r87.b;
        }
        w61 w61Var = b71.a;
        return new w61(bArrCopyOfRange);
    }

    @Override // defpackage.h72
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // defpackage.h72
    public final int n() {
        return H();
    }

    @Override // defpackage.h72
    public final int o() {
        return F();
    }

    @Override // defpackage.h72
    public final long p() {
        return G();
    }

    @Override // defpackage.h72
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // defpackage.h72
    public final int r() {
        return H();
    }

    @Override // defpackage.h72
    public final long s() {
        return I();
    }

    @Override // defpackage.h72
    public final int t() {
        return F();
    }

    @Override // defpackage.h72
    public final long u() {
        return G();
    }

    @Override // defpackage.h72
    public final int v() {
        int iH = H();
        return (-(iH & 1)) ^ (iH >>> 1);
    }

    @Override // defpackage.h72
    public final long w() {
        long jI = I();
        return (-(jI & 1)) ^ (jI >>> 1);
    }

    @Override // defpackage.h72
    public final String x() throws ya7 {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String str = new String(this.c, i2, iH, r87.a);
                this.f += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw ya7.e();
        }
        throw ya7.i();
    }

    @Override // defpackage.h72
    public final String y() throws ya7 {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String strN = nqf.a.n(this.c, i2, iH);
                this.f += iH;
                return strN;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw ya7.e();
        }
        throw ya7.i();
    }

    @Override // defpackage.h72
    public final int z() throws ya7 {
        if (c()) {
            this.v = 0;
            return 0;
        }
        int iH = H();
        this.v = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw new ya7("Protocol message contained an invalid tag (zero).");
    }
}
