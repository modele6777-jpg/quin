package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rq3 implements m95 {
    public final sb3 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        pp8.a("media3.extractor");
    }

    public rq3(sb3 sb3Var, long j, long j2) {
        this.b = sb3Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.m95
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            q(iMin);
        }
        int iP = iMin;
        while (iP < i2 && iP != -1) {
            iP = p(bArr, i, i2, iP, z);
        }
        if (iP != -1) {
            this.d += (long) iP;
        }
        return iP != -1;
    }

    @Override // defpackage.m95
    public final boolean c(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.g, i);
        q(iMin);
        int iP = iMin;
        while (iP < i && iP != -1) {
            byte[] bArr = this.a;
            iP = p(bArr, -iP, Math.min(i, bArr.length + iP), iP, z);
        }
        if (iP != -1) {
            this.d += (long) iP;
        }
        return iP != -1;
    }

    @Override // defpackage.m95
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!j(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.m95
    public final long e() {
        return this.d + ((long) this.f);
    }

    @Override // defpackage.m95
    public final void f(int i) {
        j(i, false);
    }

    @Override // defpackage.m95
    public final int g(int i) throws EOFException, InterruptedIOException {
        rq3 rq3Var;
        int iMin = Math.min(this.g, i);
        q(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            rq3Var = this;
            iMin = rq3Var.p(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            rq3Var = this;
        }
        if (iMin != -1) {
            rq3Var.d += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.m95
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.m95
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.m95
    public final int h(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        rq3 rq3Var;
        int iMin;
        n(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            rq3Var = this;
            iMin = rq3Var.p(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            rq3Var.g += iMin;
        } else {
            rq3Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(rq3Var.e, rq3Var.f, bArr, i, iMin);
        rq3Var.f += iMin;
        return iMin;
    }

    public final boolean j(int i, boolean z) {
        n(i);
        int iP = this.g - this.f;
        while (iP < i) {
            rq3 rq3Var = this;
            int i2 = i;
            boolean z2 = z;
            iP = rq3Var.p(this.e, this.f, i2, iP, z2);
            if (iP == -1) {
                return false;
            }
            rq3Var.g = rq3Var.f + iP;
            this = rq3Var;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override // defpackage.m95
    public final void k() {
        this.f = 0;
    }

    @Override // defpackage.m95
    public final void l(int i) throws EOFException, InterruptedIOException {
        c(i, false);
    }

    public final void n(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, pqf.h(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.m95
    public final void o(byte[] bArr, int i, int i2) {
        d(bArr, i, i2, false);
    }

    public final int p(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void q(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        rq3 rq3Var;
        int i3 = this.g;
        int iP = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            q(iMin);
            iP = iMin;
        }
        if (iP == 0) {
            rq3Var = this;
            iP = rq3Var.p(bArr, i, i2, 0, true);
        } else {
            rq3Var = this;
        }
        if (iP != -1) {
            rq3Var.d += (long) iP;
        }
        return iP;
    }

    @Override // defpackage.m95
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        a(bArr, i, i2, false);
    }
}
