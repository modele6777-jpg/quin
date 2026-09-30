package defpackage;

import com.adjust.sdk.sig.r3;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tid extends lt0 {
    public int i;
    public boolean j;
    public int k;
    public long l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public byte[] q;

    @Override // defpackage.lt0
    public final wj0 a(wj0 wj0Var) throws zj0 {
        if (wj0Var.c == 2) {
            return wj0Var.a == -1 ? wj0.e : wj0Var;
        }
        throw new zj0(wj0Var);
    }

    @Override // defpackage.lt0, defpackage.ak0
    public final boolean b() {
        return super.b() && this.j;
    }

    @Override // defpackage.ak0
    public final void f(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.k;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.n.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > 1024) {
                        int i2 = this.i;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    r3.l();
                    return;
                }
                pa7.J(this.o < this.n.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i3 = this.i;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.o;
                int i4 = this.p;
                int length2 = length + i4;
                byte[] bArr = this.n;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.n, length2, iMin);
                int i6 = this.p + iMin;
                this.p = i6;
                pa7.J(i6 <= this.n.length);
                boolean z2 = z && iPosition3 < i5;
                o(z2);
                if (z2) {
                    this.k = 0;
                    this.m = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // defpackage.lt0
    public final void j() {
        if (b()) {
            wj0 wj0Var = this.b;
            int i = wj0Var.b * 2;
            this.i = i;
            int i2 = ((((int) ((100000 * ((long) wj0Var.a)) / 1000000)) / 2) / i) * i * 2;
            if (this.n.length != i2) {
                this.n = new byte[i2];
                this.q = new byte[i2];
            }
        }
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override // defpackage.lt0
    public final void k() {
        if (this.p > 0) {
            o(true);
            this.m = 0;
        }
    }

    @Override // defpackage.lt0
    public final void l() {
        this.j = false;
        byte[] bArr = pqf.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final int n(int i) {
        int length = ((((int) ((2000000 * ((long) this.b.a)) / 1000000)) - this.m) * this.i) - (this.n.length / 2);
        pa7.J(length >= 0);
        int iMin = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.i;
        return (iMin / i2) * i2;
    }

    public final void o(boolean z) {
        int length;
        int iN;
        int i = this.p;
        byte[] bArr = this.n;
        if (i == bArr.length || z) {
            if (this.m == 0) {
                if (z) {
                    p(i, 3);
                    length = i;
                } else {
                    pa7.J(i >= bArr.length / 2);
                    length = this.n.length / 2;
                    p(length, 0);
                }
                iN = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iN2 = n(length2) + (this.n.length / 2);
                p(iN2, 2);
                iN = iN2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iN = n(length);
                p(iN, 1);
            }
            if (!(length % this.i == 0)) {
                qc0.p(rfc.l("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            pa7.J(i >= iN);
            this.p -= length;
            int i2 = this.o + length;
            this.o = i2;
            this.o = i2 % this.n.length;
            int i3 = this.m;
            int i4 = this.i;
            this.m = (iN / i4) + i3;
            this.l += (long) ((length - iN) / i4);
        }
    }

    public final void p(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        pa7.A(this.p >= i);
        int i4 = this.o;
        if (i2 == 2) {
            int i5 = this.p;
            int i6 = i4 + i5;
            byte[] bArr = this.n;
            if (i6 <= bArr.length) {
                System.arraycopy(bArr, i6 - i, this.q, 0, i);
            } else {
                int length = i5 - (bArr.length - i4);
                byte[] bArr2 = this.q;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i7 = i - length;
                    System.arraycopy(bArr, bArr.length - i7, bArr2, 0, i7);
                    System.arraycopy(this.n, 0, this.q, i7, length);
                }
            }
        } else {
            int i8 = i4 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i8 <= length2) {
                System.arraycopy(bArr3, i4, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i4;
                System.arraycopy(bArr3, i4, bArr4, 0, length3);
                System.arraycopy(this.n, 0, this.q, length3, i - length3);
            }
        }
        pa7.w(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        pa7.J(this.o < this.n.length);
        byte[] bArr5 = this.q;
        pa7.w(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr5[i10] << 8) | (bArr5[i9] & 255);
                if (i2 == 0) {
                    i3 = ((((i9 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i9) / (i - 1)) / 1000);
                    }
                }
                int i12 = (i11 * i3) / 100;
                if (i12 >= 32767) {
                    bArr5[i9] = -1;
                    bArr5[i10] = 127;
                } else if (i12 <= -32768) {
                    bArr5[i9] = 0;
                    bArr5[i10] = -128;
                } else {
                    bArr5[i9] = (byte) (i12 & 255);
                    bArr5[i10] = (byte) (i12 >> 8);
                }
            }
        }
        m(i).put(bArr5, 0, i).flip();
    }
}
