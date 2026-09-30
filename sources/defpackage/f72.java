package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 extends h72 {
    public final InputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int v;
    public int w;
    public int x = Integer.MAX_VALUE;

    public f72(InputStream inputStream) {
        Charset charset = r87.a;
        this.c = inputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.w = 0;
    }

    @Override // defpackage.h72
    public final int A() {
        return K();
    }

    @Override // defpackage.h72
    public final long B() {
        return L();
    }

    @Override // defpackage.h72
    public final boolean C(int i) throws ya7 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                P(8);
                return true;
            }
            if (i2 == 2) {
                P(K());
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
            P(4);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw ya7.d();
        }
        while (i3 < 10) {
            if (this.g == this.e) {
                O(1);
            }
            int i6 = this.g;
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw ya7.d();
        return true;
    }

    public final byte[] F(int i) throws IOException {
        byte[] bArrG = G(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.w += i3;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListH = H(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i) throws IOException {
        if (i == 0) {
            return r87.b;
        }
        if (i < 0) {
            throw ya7.e();
        }
        int i2 = this.w;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new ya7("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.x;
        if (i4 > i5) {
            P((i5 - i2) - i3);
            throw ya7.i();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        InputStream inputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (ya7 e) {
                e.g();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.w += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw ya7.i();
                }
                this.w += i8;
                i6 += i8;
            } catch (ya7 e2) {
                e2.g();
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw ya7.i();
                }
                this.w += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() throws ya7 {
        int i = this.g;
        if (this.e - i < 4) {
            O(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long J() throws ya7 {
        int i = this.g;
        if (this.e - i < 8) {
            O(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int K() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
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
                this.g = i5;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
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
                this.g = i4;
                return j;
            }
        }
        return M();
    }

    public final long M() throws ya7 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                O(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw ya7.d();
    }

    public final void N() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.w + i;
        int i3 = this.x;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void O(int i) throws ya7 {
        if (Q(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.w) - this.g) {
            throw ya7.i();
        }
        throw new ya7("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void P(int i) throws ya7 {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        InputStream inputStream = this.c;
        if (i < 0) {
            throw ya7.e();
        }
        int i5 = this.w;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.x;
        if (i7 > i8) {
            P((i8 - i5) - i3);
            throw ya7.i();
        }
        this.w = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (ya7 e) {
                    e.g();
                    throw e;
                }
            } catch (Throwable th) {
                this.w += i4;
                N();
                throw th;
            }
        }
        this.w += i4;
        N();
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        O(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                O(1);
            }
        }
    }

    public final boolean Q(int i) throws IOException {
        InputStream inputStream = this.c;
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            qc0.p(tec.f(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.w;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.x) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.w + i2;
                this.w = i5;
                i4 = this.e - i2;
                this.e = i4;
                this.g = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.e += i6;
                    N();
                    if (this.e >= i) {
                        return true;
                    }
                    return Q(i);
                }
            } catch (ya7 e) {
                e.g();
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.h72
    public final void a(int i) throws ya7 {
        if (this.v != i) {
            throw new ya7("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.h72
    public final int b() {
        return this.w + this.g;
    }

    @Override // defpackage.h72
    public final boolean c() {
        return this.g == this.e && !Q(1);
    }

    @Override // defpackage.h72
    public final void h(int i) {
        this.x = i;
        N();
    }

    @Override // defpackage.h72
    public final int j(int i) throws ya7 {
        if (i < 0) {
            throw ya7.e();
        }
        int i2 = this.w + this.g + i;
        if (i2 < 0) {
            throw new ya7("Failed to parse the message.");
        }
        int i3 = this.x;
        if (i2 > i3) {
            throw ya7.i();
        }
        this.x = i2;
        N();
        return i3;
    }

    @Override // defpackage.h72
    public final boolean k() {
        return L() != 0;
    }

    @Override // defpackage.h72
    public final w61 l() throws IOException {
        int iK = K();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (iK <= i3 && iK > 0) {
            w61 w61VarD = b71.d(bArr, i2, iK);
            this.g += iK;
            return w61VarD;
        }
        if (iK == 0) {
            return b71.a;
        }
        if (iK < 0) {
            throw ya7.e();
        }
        byte[] bArrG = G(iK);
        if (bArrG != null) {
            return b71.d(bArrG, 0, bArrG.length);
        }
        int i4 = this.g;
        int i5 = this.e;
        int length = i5 - i4;
        this.w += i5;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListH = H(iK - length);
        byte[] bArr2 = new byte[iK];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListH) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        w61 w61Var = b71.a;
        return new w61(bArr2);
    }

    @Override // defpackage.h72
    public final double m() {
        return Double.longBitsToDouble(J());
    }

    @Override // defpackage.h72
    public final int n() {
        return K();
    }

    @Override // defpackage.h72
    public final int o() {
        return I();
    }

    @Override // defpackage.h72
    public final long p() {
        return J();
    }

    @Override // defpackage.h72
    public final float q() {
        return Float.intBitsToFloat(I());
    }

    @Override // defpackage.h72
    public final int r() {
        return K();
    }

    @Override // defpackage.h72
    public final long s() {
        return L();
    }

    @Override // defpackage.h72
    public final int t() {
        return I();
    }

    @Override // defpackage.h72
    public final long u() {
        return J();
    }

    @Override // defpackage.h72
    public final int v() {
        int iK = K();
        return (-(iK & 1)) ^ (iK >>> 1);
    }

    @Override // defpackage.h72
    public final long w() {
        long jL = L();
        return (-(jL & 1)) ^ (jL >>> 1);
    }

    @Override // defpackage.h72
    public final String x() throws ya7 {
        int iK = K();
        byte[] bArr = this.d;
        if (iK > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iK <= i - i2) {
                String str = new String(bArr, i2, iK, r87.a);
                this.g += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw ya7.e();
        }
        if (iK > this.e) {
            return new String(F(iK), r87.a);
        }
        O(iK);
        String str2 = new String(bArr, this.g, iK, r87.a);
        this.g += iK;
        return str2;
    }

    @Override // defpackage.h72
    public final String y() throws IOException {
        int iK = K();
        int i = this.g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArrF = this.d;
        if (iK <= i3 && iK > 0) {
            this.g = i + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw ya7.e();
            }
            i = 0;
            if (iK <= i2) {
                O(iK);
                this.g = iK;
            } else {
                bArrF = F(iK);
            }
        }
        return nqf.a.n(bArrF, i, iK);
    }

    @Override // defpackage.h72
    public final int z() throws ya7 {
        if (c()) {
            this.v = 0;
            return 0;
        }
        int iK = K();
        this.v = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new ya7("Protocol message contained an invalid tag (zero).");
    }
}
